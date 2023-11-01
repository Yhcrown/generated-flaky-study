import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGroup100Case0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test001");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream4 = new htmlflow.HtmlVisitorPrintStream(printStream0, false, false, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = htmlflow.flowifier.Flowifier.fromHtml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n" + "'", str1, "import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        java.lang.Class<?> wildcardClass6 = htmlVisitorStringBuilder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnloadstart("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOncancel("\"hi!\"");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeNonce("hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        org.xmlet.htmlapifaster.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParent(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.tail(node5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        org.jsoup.nodes.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.head(node5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeNonce("\"hi!\"");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(printStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        org.xmlet.htmlapifaster.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParent(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream4 = new htmlflow.HtmlVisitorPrintStream(printStream0, true, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        org.xmlet.htmlapifaster.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitElement(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeEnctype("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeRel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeRel("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeRel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeData("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream4 = new htmlflow.HtmlVisitorPrintStream(printStream0, true, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnhashchange("hi!");
        htmlVisitorStringBuilder1.visitAttributeColspan("\"hi!\"");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplay("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeData("");
        htmlVisitorStringBuilder1.visitAttributePattern("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeType("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnbeforeprint("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributePattern("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndurationchange("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = staticHtml1.render((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeName("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnbeforeunload("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        java.io.PrintStream printStream2 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter3 = staticHtml1.setPrintStream(printStream2);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = staticHtml1.render(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlWriter3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeSrcSet("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnscroll("hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeOndragexit("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnonline("hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder3 = new htmlflow.HtmlVisitorStringBuilder(true);
        // The following exception was thrown during execution in test generation
        try {
            staticHtml1.write((java.lang.Object) htmlVisitorStringBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeAccesskey("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnchange("");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeMedia("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeDirname("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeData("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitCloseDynamic();
        htmlVisitorStringBuilder1.visitAttributeDefault("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeMedia("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeWidth("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeAllowfullscreen("");
        htmlVisitorStringBuilder1.visitAttributeOnbeforeunload("");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.StringBuilder stringBuilder2 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getAppendable();
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node4 = null;
        boolean boolean5 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node4);
        java.lang.StringBuilder stringBuilder6 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getAppendable();
        org.junit.Assert.assertNull(stringBuilder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(true)\n");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        java.lang.Class<?> wildcardClass6 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getClassFromNodeName("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.tail(node7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeMedia("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOninvalid("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendFooter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeSrcset("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeBorder("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeDir("\"hi!\"");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeDraggable("hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitAttributeData(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        org.jsoup.nodes.Node node2 = null;
        boolean boolean3 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node2);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeOnprogress("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnvolumenchange("");
        htmlVisitorStringBuilder1.visitAttributeAltimgValign("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeMaxwidth("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeCdgroup("\"hi!\"");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeData("");
        htmlVisitorStringBuilder1.visitAttributeOnrejectionhandled("hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            org.xmlet.htmlapifaster.Element element2 = staticHtml1.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HtmlView is the root of Html tree and it has not any parent.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnloadedmetadata("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnsuspend("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOndrop("");
        htmlVisitorStringBuilder1.visitAttributeBorder("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOntoogle("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream4 = new htmlflow.HtmlVisitorPrintStream(printStream0, true, true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnchange("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeCols("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeType("\"hi!\"");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer2 = null;
        htmlflow.StaticHtml staticHtml3 = htmlflow.StaticHtml.view(staticHtmlConsumer2);
        org.xmlet.htmlapifaster.Html<htmlflow.HtmlView<java.lang.Object>> objHtmlViewHtml4 = staticHtml3.html();
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor6 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.StringBuilder stringBuilder7 = defaultHtmlToJavaHtmlFlowNodeVisitor6.getAppendable();
        defaultHtmlToJavaHtmlFlowNodeVisitor6.appendHeader();
        org.jsoup.nodes.Node node9 = null;
        boolean boolean10 = defaultHtmlToJavaHtmlFlowNodeVisitor6.isUncloseable(node9);
        java.lang.Class<?> wildcardClass12 = defaultHtmlToJavaHtmlFlowNodeVisitor6.getClassFromNodeName("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            staticHtml1.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml3, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(staticHtml3);
        org.junit.Assert.assertNotNull(objHtmlViewHtml4);
        org.junit.Assert.assertNull(stringBuilder7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeAccesskey("hi!");
        htmlVisitorStringBuilder1.visitAttributeStart("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnscroll("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        htmlflow.HtmlVisitorCache htmlVisitorCache2 = staticHtml1.getVisitor();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder4 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder4.visitAttributeSrcSet("");
        htmlVisitorStringBuilder4.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder4.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder4.visitAttributeOndragstart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = staticHtml1.render((java.lang.Object) htmlVisitorStringBuilder4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(htmlVisitorCache2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnkeypress("");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOnplay("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnclose("hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeDirname(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendFooter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitCloseDynamic();
        htmlVisitorStringBuilder1.visitAttributeAlttext("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmouseover(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnunload("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        // The following exception was thrown during execution in test generation
        try {
            org.xmlet.htmlapifaster.Element element3 = staticHtml1.__();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HtmlView is the root of Html tree and it has not any parent.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeWrap("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnblur("");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeDisabled("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.tail(node6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOnpageshow("hi!");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder17 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder17.visitAttributeSrcSet("");
        htmlVisitorStringBuilder17.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder17.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder17.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder17.visitAttributeOnpause("");
        htmlVisitorStringBuilder17.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer30 = null;
        htmlflow.StaticHtml staticHtml31 = htmlflow.StaticHtml.view(staticHtmlConsumer30);
        java.io.PrintStream printStream32 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter33 = staticHtml31.setPrintStream(printStream32);
        htmlVisitorStringBuilder17.visitElement((org.xmlet.htmlapifaster.Element) staticHtml31);
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder36 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder36.visitAttributeSrcSet("");
        htmlVisitorStringBuilder36.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder36.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder36.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder36.visitAttributeOnpause("");
        htmlVisitorStringBuilder36.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer49 = null;
        htmlflow.StaticHtml staticHtml50 = htmlflow.StaticHtml.view(staticHtmlConsumer49);
        java.io.PrintStream printStream51 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter52 = staticHtml50.setPrintStream(printStream51);
        htmlVisitorStringBuilder36.visitElement((org.xmlet.htmlapifaster.Element) staticHtml50);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement55 = staticHtml50.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml31.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml50);
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParent((org.xmlet.htmlapifaster.Element) staticHtml31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml31);
        org.junit.Assert.assertNotNull(objHtmlWriter33);
        org.junit.Assert.assertNotNull(staticHtml50);
        org.junit.Assert.assertNotNull(objHtmlWriter52);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement55);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream3 = new htmlflow.HtmlVisitorPrintStream(printStream0, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeSize("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder20 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder20.visitAttributeSrcSet("");
        htmlVisitorStringBuilder20.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder20.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder20.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder20.visitAttributeOnpause("");
        htmlVisitorStringBuilder20.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer33 = null;
        htmlflow.StaticHtml staticHtml34 = htmlflow.StaticHtml.view(staticHtmlConsumer33);
        java.io.PrintStream printStream35 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter36 = staticHtml34.setPrintStream(printStream35);
        htmlVisitorStringBuilder20.visitElement((org.xmlet.htmlapifaster.Element) staticHtml34);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement39 = staticHtml34.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml34);
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer41 = null;
        htmlflow.StaticHtml staticHtml42 = htmlflow.StaticHtml.view(staticHtmlConsumer41);
        htmlflow.HtmlVisitorCache htmlVisitorCache43 = staticHtml42.getVisitor();
        // The following exception was thrown during execution in test generation
        try {
            staticHtml15.write((java.lang.Object) htmlVisitorCache43);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(staticHtml34);
        org.junit.Assert.assertNotNull(objHtmlWriter36);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement39);
        org.junit.Assert.assertNotNull(staticHtml42);
        org.junit.Assert.assertNotNull(htmlVisitorCache43);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        java.lang.String str6 = defaultHtmlToJavaHtmlFlowNodeVisitor1.convertJavaStringContentToJavaDeclarableString("\"hi!\"");
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.tail(node7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str6, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeEnctype("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeAlttext("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnloadend("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeTranslate("hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeAccept("hi!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeName(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeWrap("\"hi!\"");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        java.util.function.Consumer<htmlflow.HtmlView<java.lang.Object>> objHtmlViewConsumer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlView<java.lang.Object> objHtmlView3 = staticHtml1.of(objHtmlViewConsumer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOndrop("");
        htmlVisitorStringBuilder1.visitAttributeBorder("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeSandbox("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeRel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeStep("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeMaxwidth("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        java.lang.Class<?> wildcardClass4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getClassFromNodeName("hi!");
        org.jsoup.nodes.Node node5 = null;
        boolean boolean6 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node5);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAutofocus("\"hi!\"");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeRel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnscroll("");
        htmlVisitorStringBuilder1.visitAttributeOnoffline("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeSizes("hi!");
        htmlVisitorStringBuilder1.visitOpenDynamic();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.StringBuilder stringBuilder2 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getAppendable();
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        java.lang.Class<?> wildcardClass5 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getClassFromNodeName("hi!");
        java.lang.String str7 = defaultHtmlToJavaHtmlFlowNodeVisitor1.convertJavaStringContentToJavaDeclarableString("\"hi!\"");
        org.junit.Assert.assertNull(stringBuilder2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder2 = new htmlflow.HtmlVisitorStringBuilder(false, false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnchange("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDirname("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeManifest("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        htmlVisitorStringBuilder1.visitAttributeHigh("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        org.xmlet.htmlapifaster.Html<htmlflow.HtmlView<java.lang.Object>> objHtmlViewHtml2 = staticHtml1.html();
        // The following exception was thrown during execution in test generation
        try {
            org.xmlet.htmlapifaster.Element element3 = staticHtml1.__();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HtmlView is the root of Html tree and it has not any parent.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlViewHtml2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnunload("hi!");
        htmlVisitorStringBuilder1.visitAttributeSize("hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLongdesc("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnplay("");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeName("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeCite(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOntimeupdate("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder20 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder20.visitAttributeSrcSet("");
        htmlVisitorStringBuilder20.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder20.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder20.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder20.visitAttributeOnpause("");
        htmlVisitorStringBuilder20.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer33 = null;
        htmlflow.StaticHtml staticHtml34 = htmlflow.StaticHtml.view(staticHtmlConsumer33);
        java.io.PrintStream printStream35 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter36 = staticHtml34.setPrintStream(printStream35);
        htmlVisitorStringBuilder20.visitElement((org.xmlet.htmlapifaster.Element) staticHtml34);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement39 = staticHtml34.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml34);
        // The following exception was thrown during execution in test generation
        try {
            org.xmlet.htmlapifaster.Element element41 = staticHtml15.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HtmlView is the root of Html tree and it has not any parent.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(staticHtml34);
        org.junit.Assert.assertNotNull(objHtmlWriter36);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement39);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        boolean boolean19 = htmlVisitorStringBuilder1.isWriting();
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDirname("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOntoogle("\"hi!\"");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeOnended("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnonline("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeX("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnunload(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeMinlength("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        java.io.PrintStream printStream2 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter3 = staticHtml1.setPrintStream(printStream2);
        java.lang.String str4 = staticHtml1.render();
        // The following exception was thrown during execution in test generation
        try {
            org.xmlet.htmlapifaster.Element element5 = staticHtml1.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HtmlView is the root of Html tree and it has not any parent.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlWriter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmessage("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeX("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnonline("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        java.util.function.Consumer<htmlflow.HtmlView<java.lang.Object>> objHtmlViewConsumer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlView<java.lang.Object> objHtmlView4 = staticHtml1.dynamic(objHtmlViewConsumer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Wrong use of dynamic() in a static view!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeCite("\"hi!\"");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeSrcset("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnended("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOncanplay("");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.write();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder23 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder23.visitAttributeSrcSet("");
        htmlVisitorStringBuilder23.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder23.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder23.visitAttributeHttpEquiv("");
        // The following exception was thrown during execution in test generation
        try {
            staticHtml15.write((java.lang.Object) htmlVisitorStringBuilder23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndblclick("");
        htmlVisitorStringBuilder1.visitAttributeAsync("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnloadstart("\"hi!\"");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeScope("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHref("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnonline("\"hi!\"");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder22 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder22.visitAttributeSrcSet("");
        htmlVisitorStringBuilder22.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder22.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder22.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder22.visitAttributeOnpause("");
        htmlVisitorStringBuilder22.visitAttributeData("");
        htmlVisitorStringBuilder22.visitAttributeShape(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = staticHtml15.render((java.lang.Object) ">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitCloseDynamic();
        htmlVisitorStringBuilder1.visitAttributeAlttext("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeReadonly("");
        htmlVisitorStringBuilder1.visitAttributeMaxlength(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeMethod(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnreset(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnkeydown("");
        htmlVisitorStringBuilder1.visitAttributeKind("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOnstorage("hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(false);
        htmlVisitorStringBuilder1.visitAttributeOndragleave(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOncanplay(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeOnprogress("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeContent("hi!");
        htmlVisitorStringBuilder1.visitAttributeSrcset("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream4 = new htmlflow.HtmlVisitorPrintStream(printStream0, false, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("hi!");
        htmlVisitorStringBuilder1.visitAttributeAltimgValign("");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndrag("");
        htmlVisitorStringBuilder1.visitAttributeOnonline(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOnpagehide("");
        htmlVisitorStringBuilder1.visitAttributeAllowfullscreen("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributePattern("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormnovalidate("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("");
        htmlVisitorStringBuilder1.visitAttributeSelected(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("hi!");
        htmlVisitorStringBuilder1.visitAttributeDisplay("hi!");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder9 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder9.visitAttributeSrcSet("");
        htmlVisitorStringBuilder9.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder9.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder9.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder9.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder9.visitAttributeContenteditable("");
        htmlVisitorStringBuilder9.visitAttributeOndrop("");
        htmlVisitorStringBuilder9.visitAttributeBorder("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer26 = null;
        htmlflow.StaticHtml staticHtml27 = htmlflow.StaticHtml.view(staticHtmlConsumer26);
        org.xmlet.htmlapifaster.Root<htmlflow.HtmlView<java.lang.Object>> objHtmlViewRoot28 = staticHtml27.defineRoot();
        htmlVisitorStringBuilder9.visitElementRoot(objHtmlViewRoot28);
        htmlVisitorStringBuilder1.visitElementRoot(objHtmlViewRoot28);
        org.junit.Assert.assertNotNull(staticHtml27);
        org.junit.Assert.assertNotNull(objHtmlViewRoot28);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeRel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnscroll("");
        htmlVisitorStringBuilder1.visitAttributeRowheader("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnseeking("hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmessage("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeX("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnreset(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(false);
        htmlVisitorStringBuilder1.visitAttributeAbbr("");
        htmlVisitorStringBuilder1.visitAttributeOnkeypress("");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeX("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnoffline(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeClass("hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeSrcDoc("hi!");
        htmlVisitorStringBuilder1.visitAttributeCdgroup("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeSrclang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeFormaction(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeNovalidate("");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.io.PrintStream printStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.HtmlVisitorPrintStream htmlVisitorPrintStream2 = new htmlflow.HtmlVisitorPrintStream(printStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOndrop("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDirname("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOpen("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnunload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeCharset("\"hi!\"");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHidden("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeFormmethod(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.head(node3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeMedia("");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeMuted("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnseeking("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOndragleave("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeTarget("\"hi!\"");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.write();
        java.io.PrintStream printStream22 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter23 = staticHtml15.setPrintStream(printStream22);
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor25 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.String str27 = defaultHtmlToJavaHtmlFlowNodeVisitor25.convertJavaStringContentToJavaDeclarableString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = staticHtml15.render((java.lang.Object) str27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
        org.junit.Assert.assertNotNull(objHtmlWriter23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"hi!\"" + "'", str27, "\"hi!\"");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeScope("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHref("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnoffline("");
        htmlVisitorStringBuilder1.visitAttributeSize("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.String str3 = defaultHtmlToJavaHtmlFlowNodeVisitor1.convertJavaStringContentToJavaDeclarableString("hi!");
        org.jsoup.nodes.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.tail(node4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeEnctype("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeAlttext("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnloadend("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeCharset("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAutoComplete("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOnpageshow("hi!");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer16 = null;
        htmlflow.StaticHtml staticHtml17 = htmlflow.StaticHtml.view(staticHtmlConsumer16);
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv18 = staticHtml17.div();
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml17);
        htmlVisitorStringBuilder1.visitAttributeOnpagehide("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOndragenter("hi!");
        org.junit.Assert.assertNotNull(staticHtml17);
        org.junit.Assert.assertNotNull(objHtmlViewDiv18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndrag("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmouseover("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnshow("hi!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder2 = new htmlflow.HtmlVisitorStringBuilder(true, true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeX("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeRowheader("");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        java.io.PrintStream printStream2 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter3 = staticHtml1.setPrintStream(printStream2);
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer4 = null;
        htmlflow.StaticHtml staticHtml5 = htmlflow.StaticHtml.view(staticHtmlConsumer4);
        org.xmlet.htmlapifaster.Root<htmlflow.HtmlView<java.lang.Object>> objHtmlViewRoot6 = staticHtml5.defineRoot();
        htmlflow.HtmlVisitorCache htmlVisitorCache7 = staticHtml5.getVisitor();
        // The following exception was thrown during execution in test generation
        try {
            staticHtml1.write((java.lang.Object) staticHtml5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlWriter3);
        org.junit.Assert.assertNotNull(staticHtml5);
        org.junit.Assert.assertNotNull(objHtmlViewRoot6);
        org.junit.Assert.assertNotNull(htmlVisitorCache7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLongdesc("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnended("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeClass("");
        htmlVisitorStringBuilder1.visitAttributeOnseeking(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnseeking("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer12 = null;
        htmlflow.StaticHtml staticHtml13 = htmlflow.StaticHtml.view(staticHtmlConsumer12);
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv14 = staticHtml13.div();
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParent((org.xmlet.htmlapifaster.Element) objHtmlViewDiv14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml13);
        org.junit.Assert.assertNotNull(objHtmlViewDiv14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeStep("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeStep("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAsync("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnended("hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOndrop("");
        htmlVisitorStringBuilder1.visitAttributeBorder("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeAsync("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnseeking("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitAttributeTypemustmatch("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnoffline("\"hi!\"");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeAcceptCharset("hi!");
        htmlVisitorStringBuilder1.visitAttributeBorder("HtmlView");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLongdesc("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnended("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeClass("");
        htmlVisitorStringBuilder1.visitAttributeControls("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        htmlflow.HtmlVisitorCache htmlVisitorCache2 = staticHtml1.getVisitor();
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv3 = staticHtml1.div();
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(htmlVisitorCache2);
        org.junit.Assert.assertNotNull(objHtmlViewDiv3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeOninput("");
        htmlVisitorStringBuilder1.visitAttributeName("HtmlView");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeAlt("hi!");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder8 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder8.visitAttributeSrcSet("");
        htmlVisitorStringBuilder8.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder8.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder8.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder8.visitAttributeOnpause("");
        htmlVisitorStringBuilder8.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer21 = null;
        htmlflow.StaticHtml staticHtml22 = htmlflow.StaticHtml.view(staticHtmlConsumer21);
        java.io.PrintStream printStream23 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter24 = staticHtml22.setPrintStream(printStream23);
        htmlVisitorStringBuilder8.visitElement((org.xmlet.htmlapifaster.Element) staticHtml22);
        org.xmlet.htmlapifaster.Tr<htmlflow.HtmlView<java.lang.Object>> objHtmlViewTr26 = staticHtml22.tr();
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParentTr(objHtmlViewTr26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml22);
        org.junit.Assert.assertNotNull(objHtmlWriter24);
        org.junit.Assert.assertNotNull(objHtmlViewTr26);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplaying("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnstorage("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDisabled("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseover(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnpause("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor0 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor();
        java.lang.String str2 = defaultHtmlToJavaHtmlFlowNodeVisitor0.convertJavaStringContentToJavaDeclarableString(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        java.lang.Class<?> wildcardClass4 = defaultHtmlToJavaHtmlFlowNodeVisitor0.getClassFromNodeName("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"" + "'", str2, "\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeForm("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOnpageshow("hi!");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer16 = null;
        htmlflow.StaticHtml staticHtml17 = htmlflow.StaticHtml.view(staticHtmlConsumer16);
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv18 = staticHtml17.div();
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml17);
        htmlVisitorStringBuilder1.visitAttributeOnpagehide("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeX("\"hi!\"");
        org.junit.Assert.assertNotNull(staticHtml17);
        org.junit.Assert.assertNotNull(objHtmlViewDiv18);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOncuechange("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeRowspan("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnpageshow("\"hi!\"");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeRequired(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitOpenDynamic();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(false);
        htmlVisitorStringBuilder1.visitAttributeOndragleave(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeForm(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOnunload("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitOpenAsync();
        htmlVisitorStringBuilder1.visitAttributeDir(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplaying("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnstorage("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAsync("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeName(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitCloseDynamic();
        htmlVisitorStringBuilder1.visitAttributeDir(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.write();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder23 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder23.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder23.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder23.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder23.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder23.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder23.visitAttributeOnsubmit("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        // The following exception was thrown during execution in test generation
        try {
            staticHtml15.write((java.lang.Object) "import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeManifest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAutocomplete("");
        htmlVisitorStringBuilder1.visitAttributeDisabled(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeOndragexit("hi!");
        htmlVisitorStringBuilder1.visitAttributeHeaders("");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLongdesc("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnended("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeClass("");
        htmlVisitorStringBuilder1.visitAttributeBorder(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributePreload(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDirname("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeRowspan("");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        htmlflow.HtmlView<java.lang.Object> objHtmlView3 = staticHtml1.self();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder5 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder5.visitAttributeSrcSet("");
        htmlVisitorStringBuilder5.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder5.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder5.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder5.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder5.visitAttributeContenteditable("");
        htmlVisitorStringBuilder5.visitAttributeOnpageshow("hi!");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer20 = null;
        htmlflow.StaticHtml staticHtml21 = htmlflow.StaticHtml.view(staticHtmlConsumer20);
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv22 = staticHtml21.div();
        htmlVisitorStringBuilder5.visitElement((org.xmlet.htmlapifaster.Element) staticHtml21);
        staticHtml1.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml21);
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlView3);
        org.junit.Assert.assertNotNull(staticHtml21);
        org.junit.Assert.assertNotNull(objHtmlViewDiv22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnpause("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnshow(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeCite("");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeCols("hi!");
        htmlVisitorStringBuilder1.visitAttributeHigh("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeManifest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOndragend("hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeNovalidate("hi!");
        htmlVisitorStringBuilder1.visitAttributeData("HtmlView");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplaying("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnstorage("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDisabled("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeRowspan("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        java.lang.Class<?> wildcardClass4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getClassFromNodeName("hi!");
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeAlt("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwheel("\"hi!\"");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeSpellcheck("");
        htmlVisitorStringBuilder1.visitAttributeX("\"hi!\"");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeList("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnclose("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAltimgValign("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnplaying(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOnprogress("");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder11 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder11.visitAttributeSrcSet("");
        htmlVisitorStringBuilder11.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder11.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder11.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder11.visitAttributeOnpause("");
        htmlVisitorStringBuilder11.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer24 = null;
        htmlflow.StaticHtml staticHtml25 = htmlflow.StaticHtml.view(staticHtmlConsumer24);
        java.io.PrintStream printStream26 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter27 = staticHtml25.setPrintStream(printStream26);
        htmlVisitorStringBuilder11.visitElement((org.xmlet.htmlapifaster.Element) staticHtml25);
        org.xmlet.htmlapifaster.Tr<htmlflow.HtmlView<java.lang.Object>> objHtmlViewTr29 = staticHtml25.tr();
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParentTr(objHtmlViewTr29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml25);
        org.junit.Assert.assertNotNull(objHtmlWriter27);
        org.junit.Assert.assertNotNull(objHtmlViewTr29);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.write();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder23 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder23.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder23.visitAttributeOndblclick("");
        htmlVisitorStringBuilder23.visitAttributeAsync("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer30 = null;
        htmlflow.StaticHtml staticHtml31 = htmlflow.StaticHtml.view(staticHtmlConsumer30);
        staticHtml31.write();
        htmlVisitorStringBuilder23.visitElement((org.xmlet.htmlapifaster.Element) staticHtml31);
        java.lang.String str34 = staticHtml31.getName();
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer35 = null;
        htmlflow.StaticHtml staticHtml36 = htmlflow.StaticHtml.view(staticHtmlConsumer35);
        org.xmlet.htmlapifaster.Root<htmlflow.HtmlView<java.lang.Object>> objHtmlViewRoot37 = staticHtml36.defineRoot();
        htmlflow.HtmlVisitorCache htmlVisitorCache38 = staticHtml36.getVisitor();
        org.xmlet.htmlapifaster.Root<htmlflow.HtmlView<java.lang.Object>> objHtmlViewRoot39 = staticHtml36.defineRoot();
        staticHtml15.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml31, (java.lang.Object) staticHtml36);
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
        org.junit.Assert.assertNotNull(staticHtml31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HtmlView" + "'", str34, "HtmlView");
        org.junit.Assert.assertNotNull(staticHtml36);
        org.junit.Assert.assertNotNull(objHtmlViewRoot37);
        org.junit.Assert.assertNotNull(htmlVisitorCache38);
        org.junit.Assert.assertNotNull(objHtmlViewRoot39);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        htmlflow.HtmlVisitorCache htmlVisitorCache2 = staticHtml1.getVisitor();
        htmlVisitorCache2.visitAttributePlaceholder("");
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(htmlVisitorCache2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.StringBuilder stringBuilder2 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getAppendable();
        java.lang.StringBuilder stringBuilder3 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getAppendable();
        org.junit.Assert.assertNull(stringBuilder2);
        org.junit.Assert.assertNull(stringBuilder3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("hi!");
        htmlVisitorStringBuilder1.visitAttributeSrc("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeAltimgHeigth("hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplaying("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitCloseDynamic();
        htmlVisitorStringBuilder1.visitAttributeOninput("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeFor("\"hi!\"");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmousemove("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnunload("");
        htmlVisitorStringBuilder1.visitAttributeRowheader(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeScope("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnerror("\"hi!\"");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndblclick("");
        htmlVisitorStringBuilder1.visitAttributeOnsuspend("");
        htmlVisitorStringBuilder1.visitAttributeOnclose("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndblclick("");
        htmlVisitorStringBuilder1.visitAttributeAsync("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeMax("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
        htmlVisitorStringBuilder1.visitAttributeAction("HtmlView");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeMin("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDefer("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOncuechange("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("HtmlView");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributePattern("hi!");
        htmlVisitorStringBuilder1.visitAttributeHeight("hi!");
        htmlVisitorStringBuilder1.visitAttributeId("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv3 = staticHtml1.div();
        java.io.PrintStream printStream4 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter5 = staticHtml1.setPrintStream(printStream4);
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlViewDiv3);
        org.junit.Assert.assertNotNull(objHtmlWriter5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        java.lang.Class<?> wildcardClass4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getClassFromNodeName("hi!");
        java.lang.String str6 = defaultHtmlToJavaHtmlFlowNodeVisitor1.convertJavaStringContentToJavaDeclarableString("\"hi!\"");
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.tail(node7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str6, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnpause("hi!");
        htmlVisitorStringBuilder1.visitAttributeSandbox("HtmlView");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv3 = staticHtml1.div();
        staticHtml1.write();
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlViewDiv3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeWrap("\"hi!\"");
        htmlVisitorStringBuilder1.visitCloseDynamic();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnstorage("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAlttext("HtmlView");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeRel("");
        htmlVisitorStringBuilder1.visitAttributeOnblur("");
        htmlVisitorStringBuilder1.visitAttributeNonce("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeDisabled("\"hi!\"");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(false);
        htmlVisitorStringBuilder1.visitAttributeOndragleave(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeForm(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeAlttext("\n");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder1.visitAttributeDownload("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnonline("\n");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOncancel("HtmlView");
        htmlVisitorStringBuilder1.visitAttributeCell("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(false);
        htmlVisitorStringBuilder1.visitAttributeAbbr("");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder5 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder5.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder5.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder5.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder5.visitAttributeOnmouseleave("");
        htmlVisitorStringBuilder5.visitAttributeDownload("\"hi!\"");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder17 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder17.visitAttributeSrcSet("");
        htmlVisitorStringBuilder17.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder17.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder17.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder17.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder17.visitAttributeContenteditable("");
        htmlVisitorStringBuilder17.visitAttributeOndrop("");
        htmlVisitorStringBuilder17.visitAttributeBorder("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer34 = null;
        htmlflow.StaticHtml staticHtml35 = htmlflow.StaticHtml.view(staticHtmlConsumer34);
        org.xmlet.htmlapifaster.Root<htmlflow.HtmlView<java.lang.Object>> objHtmlViewRoot36 = staticHtml35.defineRoot();
        htmlVisitorStringBuilder17.visitElementRoot(objHtmlViewRoot36);
        htmlVisitorStringBuilder5.visitElementRoot(objHtmlViewRoot36);
        htmlVisitorStringBuilder1.visitParentRoot(objHtmlViewRoot36);
        org.junit.Assert.assertNotNull(staticHtml35);
        org.junit.Assert.assertNotNull(objHtmlViewRoot36);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeType("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.write();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder23 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder23.visitAttributeSrcSet("");
        htmlVisitorStringBuilder23.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder23.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder23.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder23.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder23.visitAttributeX("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder23.visitAttributeOnunload(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        // The following exception was thrown during execution in test generation
        try {
            staticHtml15.write((java.lang.Object) htmlVisitorStringBuilder23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        htmlVisitorStringBuilder1.visitAttributeHreflang("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeX("\n");
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement20 = staticHtml15.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.write();
        org.xmlet.htmlapifaster.Html<htmlflow.HtmlView<java.lang.Object>> objHtmlViewHtml22 = staticHtml15.html();
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement20);
        org.junit.Assert.assertNotNull(objHtmlViewHtml22);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeX("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeOnunload(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeLang("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeFormtarget("\n");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeAutocomplete(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmousemove("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeMuted("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnplaying("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAutofocus("");
        htmlVisitorStringBuilder1.visitAttributeCrossorigin("hi!");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.String str3 = defaultHtmlToJavaHtmlFlowNodeVisitor1.convertJavaStringContentToJavaDeclarableString("hi!");
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        htmlflow.StaticHtml staticHtml0 = htmlflow.StaticHtml.view();
        htmlflow.HtmlVisitorCache htmlVisitorCache1 = staticHtml0.getVisitor();
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder3 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder3.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder3.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder3.visitAttributeOnplaying("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder3.visitAttributeOnkeyup("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = staticHtml0.render((java.lang.Object) htmlVisitorStringBuilder3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Wrong use of StaticView! Model object not supported or you should use a dynamic view instead!");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml0);
        org.junit.Assert.assertNotNull(htmlVisitorCache1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeMuted("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnseeking("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeSrc("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlflow.util.PrintStringBuilder printStringBuilder1 = new htmlflow.util.PrintStringBuilder(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null output stream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeMinlength("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnkeydown(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeRel("");
        htmlVisitorStringBuilder1.visitAttributeOnblur("");
        htmlVisitorStringBuilder1.visitAttributeForm("");
        htmlVisitorStringBuilder1.visitAttributeWrap("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeAction("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLongdesc("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnunload("\"\\\"hi!\\\"\"");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder15 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder15.visitAttributeSrcSet("");
        htmlVisitorStringBuilder15.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder15.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder15.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder15.visitAttributeOnpause("");
        htmlVisitorStringBuilder15.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer28 = null;
        htmlflow.StaticHtml staticHtml29 = htmlflow.StaticHtml.view(staticHtmlConsumer28);
        java.io.PrintStream printStream30 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter31 = staticHtml29.setPrintStream(printStream30);
        htmlVisitorStringBuilder15.visitElement((org.xmlet.htmlapifaster.Element) staticHtml29);
        org.xmlet.htmlapifaster.Tr<htmlflow.HtmlView<java.lang.Object>> objHtmlViewTr33 = staticHtml29.tr();
        // The following exception was thrown during execution in test generation
        try {
            htmlVisitorStringBuilder1.visitParentTr(objHtmlViewTr33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml29);
        org.junit.Assert.assertNotNull(objHtmlWriter31);
        org.junit.Assert.assertNotNull(objHtmlViewTr33);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml15);
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder20 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder20.visitAttributeSrcSet("");
        htmlVisitorStringBuilder20.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder20.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder20.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder20.visitAttributeOnpause("");
        htmlVisitorStringBuilder20.visitAttributeDraggable("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer33 = null;
        htmlflow.StaticHtml staticHtml34 = htmlflow.StaticHtml.view(staticHtmlConsumer33);
        java.io.PrintStream printStream35 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter36 = staticHtml34.setPrintStream(printStream35);
        htmlVisitorStringBuilder20.visitElement((org.xmlet.htmlapifaster.Element) staticHtml34);
        org.xmlet.htmlapifaster.CustomElement<htmlflow.HtmlView<java.lang.Object>> objHtmlViewCustomElement39 = staticHtml34.custom(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        staticHtml15.addPartial((htmlflow.HtmlView<java.lang.Object>) staticHtml34);
        java.io.PrintStream printStream41 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter42 = staticHtml15.setPrintStream(printStream41);
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertNotNull(staticHtml34);
        org.junit.Assert.assertNotNull(objHtmlWriter36);
        org.junit.Assert.assertNotNull(objHtmlViewCustomElement39);
        org.junit.Assert.assertNotNull(objHtmlWriter42);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndblclick("");
        htmlVisitorStringBuilder1.visitAttributeMuted("");
        htmlVisitorStringBuilder1.visitAttributeAutofocus("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnplay("\"hi!\"");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        htmlflow.flowifier.Flowifier flowifier0 = new htmlflow.flowifier.Flowifier();
        org.jsoup.nodes.Document document1 = null;
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor3 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.StringBuilder stringBuilder4 = defaultHtmlToJavaHtmlFlowNodeVisitor3.getAppendable();
        defaultHtmlToJavaHtmlFlowNodeVisitor3.appendHeader();
        java.lang.Class<?> wildcardClass7 = defaultHtmlToJavaHtmlFlowNodeVisitor3.getClassFromNodeName("hi!");
        java.lang.String str9 = defaultHtmlToJavaHtmlFlowNodeVisitor3.convertJavaStringContentToJavaDeclarableString("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuilder stringBuilder10 = flowifier0.toFlow(document1, (htmlflow.flowifier.HtmlToJavaHtmlFlowNodeVisitor<java.lang.StringBuilder>) defaultHtmlToJavaHtmlFlowNodeVisitor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(stringBuilder4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeNovalidate("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeData("hi!");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnauxclick("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeLabel("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitOpenDynamic();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormmethod("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDirname("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOpen("hi!");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder13 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder13.visitAttributeSrcSet("");
        htmlVisitorStringBuilder13.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder13.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder13.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder13.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder13.visitAttributeLoop("");
        htmlVisitorStringBuilder13.visitAttributeList("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder13.visitAttributeOnclose("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder13.visitAttributeAltimgValign("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer32 = null;
        htmlflow.StaticHtml staticHtml33 = htmlflow.StaticHtml.view(staticHtmlConsumer32);
        org.xmlet.htmlapifaster.Html<htmlflow.HtmlView<java.lang.Object>> objHtmlViewHtml34 = staticHtml33.html();
        htmlVisitorStringBuilder13.visitElementHtml(objHtmlViewHtml34);
        htmlVisitorStringBuilder1.visitElementHtml(objHtmlViewHtml34);
        htmlVisitorStringBuilder1.visitAttributeOnpause("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
        org.junit.Assert.assertNotNull(staticHtml33);
        org.junit.Assert.assertNotNull(objHtmlViewHtml34);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeDraggable("\"hi!\"");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeType("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("\"\\\"hi!\\\"\"");
        htmlVisitorStringBuilder1.visitAttributeStart("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnloadeddata("\"hi!\"");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeContenteditable("");
        htmlVisitorStringBuilder1.visitAttributeOndrop("");
        htmlVisitorStringBuilder1.visitAttributeBorder("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnwheel("hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeAccesskey("hi!");
        htmlVisitorStringBuilder1.visitAttributeSrclang("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOntimeupdate("hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnchange("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeCols("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLang("hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("");
        htmlVisitorStringBuilder1.visitAttributeOndragstart("");
        htmlVisitorStringBuilder1.visitAttributeSrcSet("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeSrc("");
        htmlVisitorStringBuilder1.visitAttributeOptimum(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOnresize("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnchange("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOndrop(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        java.lang.StringBuilder stringBuilder2 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getAppendable();
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node4 = null;
        boolean boolean5 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node4);
        org.jsoup.nodes.Node node6 = null;
        boolean boolean7 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node6);
        java.lang.Class<?> wildcardClass9 = defaultHtmlToJavaHtmlFlowNodeVisitor1.getClassFromNodeName("\n");
        org.junit.Assert.assertNull(stringBuilder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv3 = staticHtml1.div();
        htmlflow.HtmlView<java.lang.Object> objHtmlView4 = staticHtml1.threadSafe();
        htmlflow.HtmlView<java.lang.Object> objHtmlView6 = objHtmlView4.setIndented(true);
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlViewDiv3);
        org.junit.Assert.assertNotNull(objHtmlView4);
        org.junit.Assert.assertNotNull(objHtmlView6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSpan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributePattern("hi!");
        htmlVisitorStringBuilder1.visitAttributeFormnovalidate("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("");
        htmlVisitorStringBuilder1.visitOpenAsync();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeType("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor defaultHtmlToJavaHtmlFlowNodeVisitor1 = new htmlflow.flowifier.DefaultHtmlToJavaHtmlFlowNodeVisitor(true);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node3 = null;
        boolean boolean4 = defaultHtmlToJavaHtmlFlowNodeVisitor1.isUncloseable(node3);
        defaultHtmlToJavaHtmlFlowNodeVisitor1.appendHeader();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultHtmlToJavaHtmlFlowNodeVisitor1.head(node6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeList("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnclose("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAccesskey("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAutocomplete(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("");
        htmlVisitorStringBuilder1.visitAttributeData("");
        htmlVisitorStringBuilder1.visitAttributeShape(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeColspan("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitAttributeOverflow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnemptied("hi!");
        htmlVisitorStringBuilder1.visitAttributeDirname("");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeManifest("hi!");
        htmlVisitorStringBuilder1.visitAttributeOndblclick("");
        htmlVisitorStringBuilder1.visitAttributeAsync("\"hi!\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer8 = null;
        htmlflow.StaticHtml staticHtml9 = htmlflow.StaticHtml.view(staticHtmlConsumer8);
        staticHtml9.write();
        htmlVisitorStringBuilder1.visitElement((org.xmlet.htmlapifaster.Element) staticHtml9);
        htmlflow.HtmlView<java.lang.Object> objHtmlView12 = staticHtml9.threadSafe();
        org.xmlet.htmlapifaster.Tr<htmlflow.HtmlView<java.lang.Object>> objHtmlViewTr13 = staticHtml9.tr();
        htmlflow.HtmlView<java.lang.Object> objHtmlView15 = staticHtml9.setIndented(true);
        org.junit.Assert.assertNotNull(staticHtml9);
        org.junit.Assert.assertNotNull(objHtmlView12);
        org.junit.Assert.assertNotNull(objHtmlViewTr13);
        org.junit.Assert.assertNotNull(objHtmlView15);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeType("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("\"\\\"hi!\\\"\"");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer14 = null;
        htmlflow.StaticHtml staticHtml15 = htmlflow.StaticHtml.view(staticHtmlConsumer14);
        java.io.PrintStream printStream16 = null;
        htmlflow.HtmlWriter<java.lang.Object> objHtmlWriter17 = staticHtml15.setPrintStream(printStream16);
        java.lang.String str18 = staticHtml15.render();
        org.xmlet.htmlapifaster.Tr<htmlflow.HtmlView<java.lang.Object>> objHtmlViewTr19 = staticHtml15.tr();
        htmlVisitorStringBuilder1.visitElementTr(objHtmlViewTr19);
        org.junit.Assert.assertNotNull(staticHtml15);
        org.junit.Assert.assertNotNull(objHtmlWriter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(objHtmlViewTr19);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeWidth("hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnwaiting("hi!");
        htmlVisitorStringBuilder1.visitOpenAsync();
        htmlVisitorStringBuilder1.visitAttributeMax("\n");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitCloseAsync();
        htmlVisitorStringBuilder1.visitAttributeOnplaying("");
        htmlVisitorStringBuilder1.visitAttributeOnsubmit("");
        htmlVisitorStringBuilder1.visitAttributeName(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitCloseDynamic();
        htmlVisitorStringBuilder1.visitAttributeOninput("");
        htmlVisitorStringBuilder1.visitAttributeLow("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeAccesskey("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributeLoop("");
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributeRequired("\n");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnpause("hi!");
        htmlVisitorStringBuilder1.visitAttributeOnmousemove("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeLang("\n");
        htmlVisitorStringBuilder1.visitAttributeOnloadeddata("\">\\n\"\n+ \"\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\\t\"");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeOnmouseenter("hi!");
        htmlVisitorStringBuilder1.visitAttributePreload("hi!");
        htmlVisitorStringBuilder1.visitAttributeAllowpaymentrequest("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeSrcset("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeOnended("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitAttributeDefault("\"\\\"hi!\\\"\"");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv3 = staticHtml1.div();
        htmlflow.HtmlView<java.lang.Object> objHtmlView4 = staticHtml1.threadSafe();
        htmlflow.HtmlView<java.lang.Object> objHtmlView5 = objHtmlView4.threadSafe();
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlViewDiv3);
        org.junit.Assert.assertNotNull(objHtmlView4);
        org.junit.Assert.assertNotNull(objHtmlView5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.util.function.Consumer<htmlflow.StaticHtml> staticHtmlConsumer0 = null;
        htmlflow.StaticHtml staticHtml1 = htmlflow.StaticHtml.view(staticHtmlConsumer0);
        staticHtml1.write();
        org.xmlet.htmlapifaster.Div<htmlflow.HtmlView<java.lang.Object>> objHtmlViewDiv3 = staticHtml1.div();
        // The following exception was thrown during execution in test generation
        try {
            org.xmlet.htmlapifaster.Element element4 = staticHtml1.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: HtmlView is the root of Html tree and it has not any parent.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(staticHtml1);
        org.junit.Assert.assertNotNull(objHtmlViewDiv3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeOnseeking("import htmlflow.*;\nimport org.xmlet.htmlapifaster.*;\n\npublic class Flowified {\n    public static HtmlView get() {\n        final HtmlView html = StaticHtml.view().setIndented(false)\n            .html()\n                .head()\n                .__() //head\n                .body()\n                .__() //body\n            .__() //html\n            ;\n        return html;\n    }\n}\n");
        htmlVisitorStringBuilder1.visitOpenAsync();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        htmlflow.HtmlVisitorStringBuilder htmlVisitorStringBuilder1 = new htmlflow.HtmlVisitorStringBuilder(true);
        htmlVisitorStringBuilder1.visitAttributeSrcSet("");
        htmlVisitorStringBuilder1.visitAttributeOnmousedown("hi!");
        htmlVisitorStringBuilder1.visitAttributePlaceholder("hi!");
        htmlVisitorStringBuilder1.visitAttributeHttpEquiv("");
        htmlVisitorStringBuilder1.visitAttributeHeight(">\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        htmlVisitorStringBuilder1.visitAttributeStyle("\"hi!\"");
        htmlVisitorStringBuilder1.visitAttributeOnrejectionhandled("\"\\\"hi!\\\"\"");
    }
}

