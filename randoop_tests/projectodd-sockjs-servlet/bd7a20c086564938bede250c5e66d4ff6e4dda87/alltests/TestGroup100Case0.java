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
        java.lang.String str1 = org.projectodd.sockjs.Utils.jsonStringify("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        org.projectodd.sockjs.Transport.READY_STATE rEADY_STATE0 = org.projectodd.sockjs.Transport.READY_STATE.CLOSING;
        org.junit.Assert.assertTrue("'" + rEADY_STATE0 + "' != '" + org.projectodd.sockjs.Transport.READY_STATE.CLOSING + "'", rEADY_STATE0.equals(org.projectodd.sockjs.Transport.READY_STATE.CLOSING));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        org.projectodd.sockjs.Session session1 = org.projectodd.sockjs.Session.bySessionId("");
        org.junit.Assert.assertNull(session1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        org.projectodd.sockjs.Transport.OPEN = 'a';
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        org.projectodd.sockjs.SockJsException sockJsException0 = new org.projectodd.sockjs.SockJsException();
        java.lang.String str1 = sockJsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.projectodd.sockjs.SockJsException" + "'", str1, "org.projectodd.sockjs.SockJsException");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        org.projectodd.sockjs.Transport.READY_STATE rEADY_STATE0 = org.projectodd.sockjs.Transport.READY_STATE.OPEN;
        org.junit.Assert.assertTrue("'" + rEADY_STATE0 + "' != '" + org.projectodd.sockjs.Transport.READY_STATE.OPEN + "'", rEADY_STATE0.equals(org.projectodd.sockjs.Transport.READY_STATE.OPEN));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        // The following exception was thrown during execution in test generation
        try {
            htmlFileReceiver6.checkAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str2 = org.projectodd.sockjs.Transport.closeFrame(1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c[1,\"\"]" + "'", str2, "c[1,\"\"]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsServer.Options options2 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver3 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlFileReceiver3.doSendFrame("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsServer sockJsServer13 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler14 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = dispatchFunction8.handle(sockJsRequest11, sockJsResponse12, (java.lang.Object) sockJsServer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.projectodd.sockjs.Transport.CLOSING = 100;
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsServer.Options options2 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver3 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options2);
        org.projectodd.sockjs.Session session4 = htmlFileReceiver3.session;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlFileReceiver3.doSendFrame("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(session4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.projectodd.sockjs.Utils.generateExpires(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlFileReceiver6.doSendFrame("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        javax.websocket.Session session0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.WebsocketReceiver websocketReceiver1 = new org.projectodd.sockjs.servlet.WebsocketReceiver(session0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.projectodd.sockjs.Transport.OPEN = ' ';
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str1 = org.projectodd.sockjs.Utils.jsonStringify("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        org.projectodd.sockjs.Transport transport0 = new org.projectodd.sockjs.Transport();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = sockJsConnection1.close((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        int int0 = org.projectodd.sockjs.Transport.CONNECTING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = sockJsConnection1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        org.projectodd.sockjs.Transport.OPEN = 0;
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sockJsServletResponse3.getHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        int int0 = org.projectodd.sockjs.Transport.CLOSING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsServer sockJsServer1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.Session session6 = htmlFileReceiver5.session;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session7 = org.projectodd.sockjs.Transport.registerNoSession(sockJsRequest0, sockJsServer1, (org.projectodd.sockjs.GenericReceiver) htmlFileReceiver5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(session6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        javax.servlet.http.HttpServletResponse httpServletResponse0 = null;
        javax.servlet.AsyncContext asyncContext1 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse2 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse0, asyncContext1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sockJsServletResponse2.getHeader("c[1,\"\"]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        javax.servlet.http.HttpServletResponse httpServletResponse0 = null;
        javax.servlet.AsyncContext asyncContext1 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse2 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse0, asyncContext1);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse2.writeHead((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlFileReceiver6.doSendFrame("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsServer sockJsServer1 = null;
        javax.websocket.Session session2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver rawWebsocketSessionReceiver3 = new org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver(sockJsRequest0, sockJsServer1, session2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = appHandler1.handle404;
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.AppHandler appHandler13 = new org.projectodd.sockjs.AppHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = appHandler13.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler16 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = websocketHandler16.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler19 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = websocketHandler19.rawWebsocket;
        websocketHandler16.rawWebsocket = dispatchFunction20;
        appHandler13.hSid = dispatchFunction20;
        org.projectodd.sockjs.SockJsServer sockJsServer23 = null;
        org.projectodd.sockjs.AppHandler appHandler24 = new org.projectodd.sockjs.AppHandler(sockJsServer23);
        org.projectodd.sockjs.DispatchFunction dispatchFunction25 = appHandler24.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer26 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler27 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer26);
        org.projectodd.sockjs.DispatchFunction dispatchFunction28 = websocketHandler27.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer29 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler30 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer29);
        org.projectodd.sockjs.DispatchFunction dispatchFunction31 = websocketHandler30.rawWebsocket;
        websocketHandler27.rawWebsocket = dispatchFunction31;
        appHandler24.disabledTransport = dispatchFunction31;
        org.projectodd.sockjs.DispatchFunction dispatchFunction34 = appHandler24.welcomeScreen;
        appHandler13.hSid = dispatchFunction34;
        appHandler1.hSid = dispatchFunction34;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction25);
        org.junit.Assert.assertNotNull(dispatchFunction28);
        org.junit.Assert.assertNotNull(dispatchFunction31);
        org.junit.Assert.assertNotNull(dispatchFunction34);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        xhrPollingReceiver5.checkAlive();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str1 = org.projectodd.sockjs.Utils.jsonStringify("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = sockJsServletRequest1.getRemoteAddr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        java.lang.Integer int7 = sockJsServletResponse3.cacheFor();
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.setHeader("", "b9dcbc6c-e66a-4859-85de-a72f4cdad117");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.projectodd.sockjs.Transport.CLOSING = (byte) 0;
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = sockJsServletRequest1.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        int int6 = sockJsServletResponse3.statusCode();
        sockJsServletResponse3.cacheFor((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sockJsServletResponse3.getHeader("63271dc7-5174-48ba-8275-e00f4ff28b1f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = org.projectodd.sockjs.Utils.uuid();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0dff3dc6-84f5-4ac9-9709-a05eca4edfaf" + "'", str0, "0dff3dc6-84f5-4ac9-9709-a05eca4edfaf");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.projectodd.sockjs.SockJsServer.Options options0 = new org.projectodd.sockjs.SockJsServer.Options();
        options0.responseLimit = (short) 1;
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsServer.Options options2 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver3 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlFileReceiver3.doSendFrame("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        org.projectodd.sockjs.Transport.CLOSED = 0;
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sockJsServletRequest1.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sockJsServletRequest1.getCookie("29cbd81d-ab05-4d71-90e6-7819015ba4e2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.remoteAddress;
        java.lang.String str8 = sockJsConnection1.id;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = sockJsConnection1.write("0dff3dc6-84f5-4ac9-9709-a05eca4edfaf");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "f5fc004e-82ed-40e3-9197-c7a2ca76f186" + "'", str6, "f5fc004e-82ed-40e3-9197-c7a2ca76f186");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "f5fc004e-82ed-40e3-9197-c7a2ca76f186" + "'", str8, "f5fc004e-82ed-40e3-9197-c7a2ca76f186");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler3 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = websocketHandler3.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.AppHandler appHandler6 = new org.projectodd.sockjs.AppHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = appHandler6.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer8 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer8);
        org.projectodd.sockjs.DispatchFunction dispatchFunction10 = websocketHandler9.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer11 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler12 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer11);
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = websocketHandler12.rawWebsocket;
        websocketHandler9.rawWebsocket = dispatchFunction13;
        appHandler6.hSid = dispatchFunction13;
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = websocketHandler17.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher19 = new org.projectodd.sockjs.Dispatcher(dispatchFunction4, dispatchFunction13, dispatchFunction18);
        htmlfileHandler1.htmlfile = dispatchFunction13;
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction10);
        org.junit.Assert.assertNotNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsServer.Options options2 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver3 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options2);
        // The following exception was thrown during execution in test generation
        try {
            htmlFileReceiver3.checkAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        java.lang.Throwable[] throwableArray8 = sockJsException5.getSuppressed();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sockJsServletRequest1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsServer.Options options2 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver3 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options2);
        org.projectodd.sockjs.Session session4 = htmlFileReceiver3.session;
        // The following exception was thrown during execution in test generation
        try {
            htmlFileReceiver3.checkAlive();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(session4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.remoteAddress;
        java.lang.String str8 = sockJsConnection1.id;
        // The following exception was thrown during execution in test generation
        try {
            sockJsConnection1.end("b9dcbc6c-e66a-4859-85de-a72f4cdad117");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "38c9b227-846d-45dc-8167-f9710df346af" + "'", str6, "38c9b227-846d-45dc-8167-f9710df346af");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "38c9b227-846d-45dc-8167-f9710df346af" + "'", str8, "38c9b227-846d-45dc-8167-f9710df346af");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        org.projectodd.sockjs.SockJsException sockJsException1 = new org.projectodd.sockjs.SockJsException("org.projectodd.sockjs.SockJsException");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sockJsServletRequest1.getCookie("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = htmlfileHandler1.htmlfile;
        org.junit.Assert.assertNotNull(dispatchFunction2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Transport.READY_STATE rEADY_STATE6 = sockJsConnection1.getReadyState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        options4.responseLimit = (byte) -1;
        boolean boolean9 = options4.jsessionid;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        options4.responseLimit = (byte) -1;
        options4.responseLimit = 100;
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = sockJsServletRequest1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sockJsServletRequest1.getHeader("org.projectodd.sockjs.SockJsException");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sockJsServletRequest1.getRemoteAddr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str1 = org.projectodd.sockjs.Utils.jsonStringify("63271dc7-5174-48ba-8275-e00f4ff28b1f");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"63271dc7-5174-48ba-8275-e00f4ff28b1f\"" + "'", str1, "\"63271dc7-5174-48ba-8275-e00f4ff28b1f\"");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        org.projectodd.sockjs.Session session4 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection5 = new org.projectodd.sockjs.SockJsConnection(session4);
        sockJsConnection5.pathname = "hi!";
        sockJsConnection5.emitClose();
        sockJsConnection5.remotePort = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = sockJsConnection5.headers;
        sockJsConnection1.headers = strMap11;
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        javax.servlet.http.HttpServletRequest httpServletRequest11 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest12 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest11);
        java.lang.String str13 = sockJsServletRequest12.session();
        org.projectodd.sockjs.SockJsException sockJsException16 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException17 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException16);
        sockJsServletRequest12.onError((java.lang.Throwable) sockJsException16);
        org.projectodd.sockjs.SockJsRequest sockJsRequest19 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse20 = null;
        javax.servlet.AsyncContext asyncContext21 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse22 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse20, asyncContext21);
        org.projectodd.sockjs.SockJsServer.Options options23 = new org.projectodd.sockjs.SockJsServer.Options();
        int int24 = options23.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver25 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest19, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse22, options23);
        java.lang.Integer int26 = sockJsServletResponse22.cacheFor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = dispatchFunction8.handle((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest12, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse22, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25000 + "'", int24 == 25000);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        org.projectodd.sockjs.Session session1 = org.projectodd.sockjs.Session.bySessionId("63271dc7-5174-48ba-8275-e00f4ff28b1f");
        org.junit.Assert.assertNull(session1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String str1 = org.projectodd.sockjs.Utils.md5Hex("29cbd81d-ab05-4d71-90e6-7819015ba4e2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "45c5c7f62d06fed3323f980a739ffe91" + "'", str1, "45c5c7f62d06fed3323f980a739ffe91");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        org.projectodd.sockjs.Session session6 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection7 = new org.projectodd.sockjs.SockJsConnection(session6);
        sockJsConnection7.pathname = "hi!";
        sockJsConnection7.emitClose();
        sockJsConnection7.remotePort = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = sockJsConnection7.headers;
        sockJsConnection1.headers = strMap13;
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = sockJsServletRequest1.getMethod();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        org.projectodd.sockjs.Transport.READY_STATE rEADY_STATE0 = org.projectodd.sockjs.Transport.READY_STATE.CONNECTING;
        org.junit.Assert.assertTrue("'" + rEADY_STATE0 + "' != '" + org.projectodd.sockjs.Transport.READY_STATE.CONNECTING + "'", rEADY_STATE0.equals(org.projectodd.sockjs.Transport.READY_STATE.CONNECTING));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        options4.responseLimit = (byte) -1;
        java.lang.String str9 = options4.sockjsUrl;
        int int10 = options4.responseLimit;
        java.lang.String str11 = options4.sockjsUrl;
        options4.baseUrl = "b9dcbc6c-e66a-4859-85de-a72f4cdad117";
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str9, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str11, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        int int6 = sockJsServletResponse3.statusCode();
        sockJsServletResponse3.cacheFor((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.end("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type org.projectodd.sockjs.SockJsException; message: Error writing response:");
        } catch (org.projectodd.sockjs.SockJsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sockJsServletRequest1.getCookie("45c5c7f62d06fed3323f980a739ffe91");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sockJsServletRequest1.getQueryParameter("45c5c7f62d06fed3323f980a739ffe91");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.NextFilter nextFilter3 = null;
        sockJsServletRequest1.nextFilter = nextFilter3;
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletRequest1.onDataAvailable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest11 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest10);
        org.projectodd.sockjs.SockJsRequest sockJsRequest12 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse13 = null;
        javax.servlet.AsyncContext asyncContext14 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse15 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse13, asyncContext14);
        org.projectodd.sockjs.SockJsServer.Options options16 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver17 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest12, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse15, options16);
        int int18 = sockJsServletResponse15.statusCode();
        sockJsServletResponse15.cacheFor((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServer0.dispatch((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest11, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1ba90c2a-b8b0-4b4b-9c6c-e181e897a006" + "'", str7, "1ba90c2a-b8b0-4b4b-9c6c-e181e897a006");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        boolean boolean7 = xhrPollingReceiver5.doSendFrame("3ab7963e-8fca-4430-8d3d-57d50376f624");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str1 = org.projectodd.sockjs.Utils.quote("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler3 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer2);
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        sockJsServer2.options = options8;
        javax.websocket.Session session11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver rawWebsocketSessionReceiver12 = new org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer2, session11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher13 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction8, dispatchFunction12);
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler17 = new org.projectodd.sockjs.IframeHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = iframeHandler17.iframe;
        org.projectodd.sockjs.SockJsServer sockJsServer19 = null;
        org.projectodd.sockjs.AppHandler appHandler20 = new org.projectodd.sockjs.AppHandler(sockJsServer19);
        org.projectodd.sockjs.DispatchFunction dispatchFunction21 = appHandler20.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer25 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler26 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer25);
        org.projectodd.sockjs.DispatchFunction dispatchFunction27 = websocketHandler26.rawWebsocket;
        websocketHandler23.rawWebsocket = dispatchFunction27;
        org.projectodd.sockjs.SockJsServer sockJsServer29 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler30 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer29);
        org.projectodd.sockjs.DispatchFunction dispatchFunction31 = websocketHandler30.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher32 = new org.projectodd.sockjs.Dispatcher(dispatchFunction21, dispatchFunction27, dispatchFunction31);
        org.projectodd.sockjs.SockJsServer sockJsServer33 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler34 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer33);
        org.projectodd.sockjs.DispatchFunction dispatchFunction35 = websocketHandler34.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer36 = null;
        org.projectodd.sockjs.AppHandler appHandler37 = new org.projectodd.sockjs.AppHandler(sockJsServer36);
        org.projectodd.sockjs.DispatchFunction dispatchFunction38 = appHandler37.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer39 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler40 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer39);
        org.projectodd.sockjs.DispatchFunction dispatchFunction41 = websocketHandler40.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer42 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler43 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer42);
        org.projectodd.sockjs.DispatchFunction dispatchFunction44 = websocketHandler43.rawWebsocket;
        websocketHandler40.rawWebsocket = dispatchFunction44;
        appHandler37.hSid = dispatchFunction44;
        org.projectodd.sockjs.SockJsServer sockJsServer47 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler48 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer47);
        org.projectodd.sockjs.DispatchFunction dispatchFunction49 = websocketHandler48.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher50 = new org.projectodd.sockjs.Dispatcher(dispatchFunction35, dispatchFunction44, dispatchFunction49);
        org.projectodd.sockjs.SockJsServer sockJsServer51 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler52 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer51);
        org.projectodd.sockjs.DispatchFunction dispatchFunction53 = websocketHandler52.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer54 = null;
        org.projectodd.sockjs.AppHandler appHandler55 = new org.projectodd.sockjs.AppHandler(sockJsServer54);
        org.projectodd.sockjs.DispatchFunction dispatchFunction56 = appHandler55.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer57 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler58 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer57);
        org.projectodd.sockjs.DispatchFunction dispatchFunction59 = websocketHandler58.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer60 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler61 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer60);
        org.projectodd.sockjs.DispatchFunction dispatchFunction62 = websocketHandler61.rawWebsocket;
        websocketHandler58.rawWebsocket = dispatchFunction62;
        appHandler55.hSid = dispatchFunction62;
        org.projectodd.sockjs.SockJsServer sockJsServer65 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler66 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer65);
        org.projectodd.sockjs.DispatchFunction dispatchFunction67 = websocketHandler66.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher68 = new org.projectodd.sockjs.Dispatcher(dispatchFunction53, dispatchFunction62, dispatchFunction67);
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray69 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction18, dispatchFunction31, dispatchFunction35, dispatchFunction62 };
        dispatcher13.push("63271dc7-5174-48ba-8275-e00f4ff28b1f", "org.projectodd.sockjs.SockJsException", dispatchFunctionArray69);
        javax.servlet.http.HttpServletRequest httpServletRequest71 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest72 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest71);
        javax.servlet.http.HttpServletResponse httpServletResponse73 = null;
        javax.servlet.AsyncContext asyncContext74 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse75 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse73, asyncContext74);
        // The following exception was thrown during execution in test generation
        try {
            dispatcher13.dispatch((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest72, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction18);
        org.junit.Assert.assertNotNull(dispatchFunction21);
        org.junit.Assert.assertNotNull(dispatchFunction24);
        org.junit.Assert.assertNotNull(dispatchFunction27);
        org.junit.Assert.assertNotNull(dispatchFunction31);
        org.junit.Assert.assertNotNull(dispatchFunction35);
        org.junit.Assert.assertNotNull(dispatchFunction38);
        org.junit.Assert.assertNotNull(dispatchFunction41);
        org.junit.Assert.assertNotNull(dispatchFunction44);
        org.junit.Assert.assertNotNull(dispatchFunction49);
        org.junit.Assert.assertNotNull(dispatchFunction53);
        org.junit.Assert.assertNotNull(dispatchFunction56);
        org.junit.Assert.assertNotNull(dispatchFunction59);
        org.junit.Assert.assertNotNull(dispatchFunction62);
        org.junit.Assert.assertNotNull(dispatchFunction67);
        org.junit.Assert.assertNotNull(dispatchFunctionArray69);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        javax.servlet.AsyncContext asyncContext4 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse5 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse3, asyncContext4);
        org.projectodd.sockjs.SockJsServer.Options options6 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver7 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest2, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse5, options6);
        sockJsServer0.options = options6;
        org.projectodd.sockjs.SockJsServer.Options options9 = sockJsServer0.options;
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        sockJsServer0.options = options10;
        org.junit.Assert.assertNotNull(options9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str1 = org.projectodd.sockjs.Utils.quote("d3c27a3b-df3d-49b0-b43f-a93d6fde76b3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"" + "'", str1, "\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        org.projectodd.sockjs.Transport.CLOSED = (byte) 1;
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sockJsServletRequest1.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sockJsServletRequest1.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        javax.websocket.Session session5 = null;
        org.projectodd.sockjs.SockJsException sockJsException7 = new org.projectodd.sockjs.SockJsException("hi!");
        sockJsEndpoint4.onError(session5, (java.lang.Throwable) sockJsException7);
        java.lang.Class<?> wildcardClass9 = sockJsEndpoint4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.projectodd.sockjs.DispatchException dispatchException2 = new org.projectodd.sockjs.DispatchException(10, "\"\"");
        dispatchException2.message = "\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"";
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sockJsWebsocketRequest4.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        java.lang.String str4 = sockJsConnection1.remoteAddress;
        sockJsConnection1.id = "\"\"";
        java.lang.String str7 = sockJsConnection1.id;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = sockJsConnection1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        org.projectodd.sockjs.SockJsRequest sockJsRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        javax.servlet.AsyncContext asyncContext8 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse9 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse7, asyncContext8);
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        int int11 = options10.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver12 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options10);
        java.lang.Integer int13 = sockJsServletResponse9.cacheFor();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        int int19 = options18.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = sockJsServletRequest1.getMethod();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25000 + "'", int11 == 25000);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        javax.servlet.http.HttpServletResponse httpServletResponse0 = null;
        javax.servlet.AsyncContext asyncContext1 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse2 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse0, asyncContext1);
        java.lang.Integer int3 = sockJsServletResponse2.cacheFor();
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.NextFilter nextFilter3 = null;
        sockJsServletRequest1.nextFilter = nextFilter3;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer5.init();
        org.projectodd.sockjs.SockJsRequest sockJsRequest7 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse8 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse10 = null;
        org.projectodd.sockjs.SockJsServer.Options options11 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver12 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest9, sockJsResponse10, options11);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver13 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest7, sockJsResponse8, options11);
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session14 = org.projectodd.sockjs.Transport.register((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer5, (org.projectodd.sockjs.GenericReceiver) htmlFileReceiver13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        org.projectodd.sockjs.SockJsServer sockJsServer5 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler6 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer5);
        org.projectodd.sockjs.SockJsRequest sockJsRequest7 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse8 = null;
        javax.servlet.AsyncContext asyncContext9 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse10 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse8, asyncContext9);
        org.projectodd.sockjs.SockJsServer.Options options11 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver12 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest7, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse10, options11);
        sockJsServer5.options = options11;
        org.projectodd.sockjs.SockJsServer.Options options14 = sockJsServer5.options;
        org.projectodd.sockjs.SockJsRequest sockJsRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        javax.servlet.AsyncContext asyncContext17 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse18 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse16, asyncContext17);
        org.projectodd.sockjs.SockJsServer.Options options19 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver20 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest15, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse18, options19);
        org.projectodd.sockjs.Session session21 = null;
        xhrPollingReceiver20.session = session21;
        java.lang.String[] strArray28 = new java.lang.String[] { "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "127d9d0a-f4bf-4c9b-849d-4fec59eb0f71", "org.projectodd.sockjs.SockJsException", "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "127d9d0a-f4bf-4c9b-849d-4fec59eb0f71" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        xhrPollingReceiver20.doSendBulk((java.util.List<java.lang.String>) strList29);
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session32 = org.projectodd.sockjs.Transport.register((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, sockJsServer5, (org.projectodd.sockjs.GenericReceiver) xhrPollingReceiver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(options14);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = sockJsServletRequest1.getHeader("127d9d0a-f4bf-4c9b-849d-4fec59eb0f71");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.SockJsServer.Options options16 = new org.projectodd.sockjs.SockJsServer.Options();
        int int17 = options16.heartbeatDelay;
        boolean boolean18 = options16.jsessionid;
        java.lang.String str19 = options16.sockjsUrl;
        options16.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver22 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = sockJsServletRequest1.getHeader("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25000 + "'", int17 == 25000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str19, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        java.lang.String str4 = sockJsConnection1.remoteAddress;
        sockJsConnection1.emitData("\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        sockJsServletResponse7.statusCode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse7.writeHead((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = sockJsServletRequest1.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsServer sockJsServer4 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session5 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection6 = new org.projectodd.sockjs.SockJsConnection(session5);
        sockJsConnection6.prefix = "\"\"";
        sockJsConnection6.url = "\"\\\"\\\"\"";
        java.lang.String str11 = sockJsConnection6.id;
        java.lang.String str12 = sockJsConnection6.remoteAddress;
        sockJsServer4.emitConnection(sockJsConnection6);
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        int int19 = options18.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        boolean boolean22 = eventSourceReceiver20.doSendFrame("b309409d-89d2-4d6e-a832-218c74ba5b9c");
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session23 = org.projectodd.sockjs.Transport.register((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer4, (org.projectodd.sockjs.GenericReceiver) eventSourceReceiver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b010214e-2e07-4772-9b26-54c118f754f4" + "'", str11, "b010214e-2e07-4772-9b26-54c118f754f4");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler1 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = websocketHandler1.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.AppHandler appHandler4 = new org.projectodd.sockjs.AppHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = appHandler4.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer9 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer9);
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = websocketHandler10.rawWebsocket;
        websocketHandler7.rawWebsocket = dispatchFunction11;
        appHandler4.hSid = dispatchFunction11;
        org.projectodd.sockjs.SockJsServer sockJsServer14 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler15 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer14);
        org.projectodd.sockjs.DispatchFunction dispatchFunction16 = websocketHandler15.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher17 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction11, dispatchFunction16);
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray22 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry23 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray22);
        dispatcher17.push("325d0bee-caf7-47aa-a040-4e3ef5c9d7e0", "63271dc7-5174-48ba-8275-e00f4ff28b1f", dispatchFunctionArray22);
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction16);
        org.junit.Assert.assertNotNull(dispatchFunctionArray22);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        org.projectodd.sockjs.SockJsException sockJsException1 = new org.projectodd.sockjs.SockJsException("");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str1 = org.projectodd.sockjs.Utils.md5Hex("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9d4568c009d203ab10e33ea9953a0264" + "'", str1, "9d4568c009d203ab10e33ea9953a0264");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        org.projectodd.sockjs.DispatchException dispatchException1 = new org.projectodd.sockjs.DispatchException((int) (byte) 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sockJsServletRequest1.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = jsonpHandler1.jsonpSend;
        org.junit.Assert.assertNotNull(dispatchFunction2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        sockJsServletResponse7.statusCode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse7.writeHead((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = sockJsServletRequest1.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sockJsWebsocketRequest4.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        sockJsConnection1.remotePort = 0;
        sockJsConnection1.emitClose();
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Transport.READY_STATE rEADY_STATE8 = sockJsConnection1.getReadyState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.toString();
        java.lang.String str8 = sockJsConnection1.id;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str6, "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<SockJSConnection 64b92e6a-a976-49ab-8dc9-9cc5f226d9b1>" + "'", str7, "<SockJSConnection 64b92e6a-a976-49ab-8dc9-9cc5f226d9b1>");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str8, "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.end("29cbd81d-ab05-4d71-90e6-7819015ba4e2");
            org.junit.Assert.fail("Expected exception of type org.projectodd.sockjs.SockJsException; message: Error writing response:");
        } catch (org.projectodd.sockjs.SockJsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str1 = org.projectodd.sockjs.Utils.quote("9d4568c009d203ab10e33ea9953a0264");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"9d4568c009d203ab10e33ea9953a0264\"" + "'", str1, "\"9d4568c009d203ab10e33ea9953a0264\"");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sockJsWebsocketRequest4.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = appHandler1.disabledTransport;
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = appHandler1.disabledTransport;
        org.projectodd.sockjs.SockJsServer sockJsServer13 = null;
        org.projectodd.sockjs.AppHandler appHandler14 = new org.projectodd.sockjs.AppHandler(sockJsServer13);
        org.projectodd.sockjs.DispatchFunction dispatchFunction15 = appHandler14.welcomeScreen;
        appHandler1.handle404 = dispatchFunction15;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        int int6 = sockJsServletResponse3.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sockJsServletResponse3.getHeader("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.lang.String str4 = dispatchEntry3.method;
        dispatchEntry3.method = "org.projectodd.sockjs.SockJsException";
        java.lang.String[] strArray7 = null;
        dispatchEntry3.groups = strArray7;
        java.lang.String str9 = dispatchEntry3.method;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.projectodd.sockjs.SockJsException" + "'", str9, "org.projectodd.sockjs.SockJsException");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = sockJsServletRequest1.getHeader("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.AppHandler appHandler3 = new org.projectodd.sockjs.AppHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = appHandler3.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler6 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = websocketHandler6.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer8 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer8);
        org.projectodd.sockjs.DispatchFunction dispatchFunction10 = websocketHandler9.rawWebsocket;
        websocketHandler6.rawWebsocket = dispatchFunction10;
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler13 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = websocketHandler13.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher15 = new org.projectodd.sockjs.Dispatcher(dispatchFunction4, dispatchFunction10, dispatchFunction14);
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler19 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = websocketHandler19.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.AppHandler appHandler22 = new org.projectodd.sockjs.AppHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = appHandler22.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer24 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler25 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer24);
        org.projectodd.sockjs.DispatchFunction dispatchFunction26 = websocketHandler25.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer27 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler28 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer27);
        org.projectodd.sockjs.DispatchFunction dispatchFunction29 = websocketHandler28.rawWebsocket;
        websocketHandler25.rawWebsocket = dispatchFunction29;
        appHandler22.hSid = dispatchFunction29;
        org.projectodd.sockjs.SockJsServer sockJsServer32 = null;
        org.projectodd.sockjs.AppHandler appHandler33 = new org.projectodd.sockjs.AppHandler(sockJsServer32);
        org.projectodd.sockjs.DispatchFunction dispatchFunction34 = appHandler33.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer35 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler36 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer35);
        org.projectodd.sockjs.DispatchFunction dispatchFunction37 = websocketHandler36.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer38 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler39 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer38);
        org.projectodd.sockjs.DispatchFunction dispatchFunction40 = websocketHandler39.rawWebsocket;
        websocketHandler36.rawWebsocket = dispatchFunction40;
        appHandler33.disabledTransport = dispatchFunction40;
        org.projectodd.sockjs.DispatchFunction dispatchFunction43 = appHandler33.welcomeScreen;
        appHandler22.hSid = dispatchFunction43;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray45 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction20, dispatchFunction43 };
        dispatcher15.push("http://cdn.sockjs.org/sockjs-0.3.min.js", "\"hi!\"", dispatchFunctionArray45);
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray51 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry52 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray51);
        dispatcher15.push("http://cdn.sockjs.org/sockjs-0.3.min.js", "b9dcbc6c-e66a-4859-85de-a72f4cdad117", dispatchFunctionArray51);
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry54 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("<SockJSConnection 64b92e6a-a976-49ab-8dc9-9cc5f226d9b1>", "<SockJSConnection 325d0bee-caf7-47aa-a040-4e3ef5c9d7e0>", dispatchFunctionArray51);
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction10);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction26);
        org.junit.Assert.assertNotNull(dispatchFunction29);
        org.junit.Assert.assertNotNull(dispatchFunction34);
        org.junit.Assert.assertNotNull(dispatchFunction37);
        org.junit.Assert.assertNotNull(dispatchFunction40);
        org.junit.Assert.assertNotNull(dispatchFunction43);
        org.junit.Assert.assertNotNull(dispatchFunctionArray45);
        org.junit.Assert.assertNotNull(dispatchFunctionArray51);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.Session session11 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection12 = new org.projectodd.sockjs.SockJsConnection(session11);
        sockJsConnection12.prefix = "\"\"";
        sockJsServer0.emitConnection(sockJsConnection12);
        java.util.concurrent.ScheduledFuture scheduledFuture16 = null;
        // The following exception was thrown during execution in test generation
        try {
            sockJsServer0.clearTimeout(scheduledFuture16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ba4d4e12-8ecd-4122-96ea-9111e31cbf1b" + "'", str7, "ba4d4e12-8ecd-4122-96ea-9111e31cbf1b");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler5 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.AppHandler appHandler6 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.projectodd.sockjs.Transport.CLOSED = (short) 10;
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        org.projectodd.sockjs.Session session7 = htmlFileReceiver6.session;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlFileReceiver6.doSendFrame("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(session7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = jsonpHandler1.jsonp;
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = jsonpHandler1.jsonpSend;
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = jsonpHandler1.jsonp;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction3);
        org.junit.Assert.assertNotNull(dispatchFunction4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        options4.disconnectDelay = (short) 0;
        java.lang.String str9 = options4.sockjsUrl;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str9, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.lang.String str4 = dispatchEntry3.method;
        dispatchEntry3.method = "org.projectodd.sockjs.SockJsException";
        java.util.regex.Pattern pattern7 = null;
        dispatchEntry3.pattern = pattern7;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        java.lang.String str4 = sockJsConnection1.remoteAddress;
        sockJsConnection1.id = "\"\"";
        java.lang.String str7 = sockJsConnection1.id;
        sockJsConnection1.protocol = "\"9d4568c009d203ab10e33ea9953a0264\"";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsServer.Options options2 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver3 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options2);
        options2.websocket = true;
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = sockJsServletRequest1.getRemoteAddr();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.lang.String str2 = org.projectodd.sockjs.Utils.escapeSelected("b309409d-89d2-4d6e-a832-218c74ba5b9c", "\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b309409d-89d2-4d6e-a832-218c74ba5b9c" + "'", str2, "b309409d-89d2-4d6e-a832-218c74ba5b9c");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        org.projectodd.sockjs.SockJsException sockJsException2 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException3 = new org.projectodd.sockjs.SockJsException((java.lang.Throwable) sockJsException2);
        org.projectodd.sockjs.SockJsException sockJsException4 = new org.projectodd.sockjs.SockJsException("\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"", (java.lang.Throwable) sockJsException2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sockJsServletRequest1.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.hSid = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer11 = null;
        org.projectodd.sockjs.AppHandler appHandler12 = new org.projectodd.sockjs.AppHandler(sockJsServer11);
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler12.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer14 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler15 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer14);
        org.projectodd.sockjs.DispatchFunction dispatchFunction16 = websocketHandler15.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer17 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler18 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer17);
        org.projectodd.sockjs.DispatchFunction dispatchFunction19 = websocketHandler18.rawWebsocket;
        websocketHandler15.rawWebsocket = dispatchFunction19;
        appHandler12.disabledTransport = dispatchFunction19;
        org.projectodd.sockjs.DispatchFunction dispatchFunction22 = appHandler12.welcomeScreen;
        appHandler1.hSid = dispatchFunction22;
        javax.servlet.http.HttpServletRequest httpServletRequest24 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest25 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest24);
        java.lang.String str26 = sockJsServletRequest25.session();
        javax.servlet.http.HttpServletRequest httpServletRequest27 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest28 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest27);
        java.lang.String str29 = sockJsServletRequest28.session();
        org.projectodd.sockjs.SockJsException sockJsException32 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException33 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException32);
        sockJsServletRequest28.onError((java.lang.Throwable) sockJsException32);
        sockJsServletRequest28.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        javax.servlet.AsyncContext asyncContext38 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse39 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse37, asyncContext38);
        org.projectodd.sockjs.SockJsServer.Options options40 = new org.projectodd.sockjs.SockJsServer.Options();
        int int41 = options40.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver42 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest36, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse39, options40);
        org.projectodd.sockjs.SockJsServer.Options options43 = new org.projectodd.sockjs.SockJsServer.Options();
        int int44 = options43.heartbeatDelay;
        boolean boolean45 = options43.jsessionid;
        java.lang.String str46 = options43.sockjsUrl;
        options43.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver49 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest28, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse39, options43);
        org.projectodd.sockjs.SockJsServer sockJsServer50 = null;
        org.projectodd.sockjs.AppHandler appHandler51 = new org.projectodd.sockjs.AppHandler(sockJsServer50);
        org.projectodd.sockjs.DispatchFunction dispatchFunction52 = appHandler51.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer53 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler54 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer53);
        org.projectodd.sockjs.DispatchFunction dispatchFunction55 = websocketHandler54.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer56 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler57 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer56);
        org.projectodd.sockjs.DispatchFunction dispatchFunction58 = websocketHandler57.rawWebsocket;
        websocketHandler54.rawWebsocket = dispatchFunction58;
        appHandler51.hSid = dispatchFunction58;
        org.projectodd.sockjs.DispatchFunction dispatchFunction61 = null;
        appHandler51.disabledTransport = dispatchFunction61;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = dispatchFunction22.handle((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest25, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse39, (java.lang.Object) dispatchFunction61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction16);
        org.junit.Assert.assertNotNull(dispatchFunction19);
        org.junit.Assert.assertNotNull(dispatchFunction22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 25000 + "'", int41 == 25000);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 25000 + "'", int44 == 25000);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str46, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNotNull(dispatchFunction52);
        org.junit.Assert.assertNotNull(dispatchFunction55);
        org.junit.Assert.assertNotNull(dispatchFunction58);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        sockJsConnection1.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        org.projectodd.sockjs.SockJsConnection.OnCloseHandler onCloseHandler9 = null;
        sockJsConnection1.onClose(onCloseHandler9);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "37ac3634-8cd4-4bba-a4f8-267eda290b3e" + "'", str6, "37ac3634-8cd4-4bba-a4f8-267eda290b3e");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        org.projectodd.sockjs.Utils utils0 = new org.projectodd.sockjs.Utils();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        org.projectodd.sockjs.SockJsServer sockJsServer17 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler18 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer17);
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint21 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer17, "\"hi!\"", "325d0bee-caf7-47aa-a040-4e3ef5c9d7e0");
        javax.websocket.Session session22 = null;
        org.projectodd.sockjs.SockJsException sockJsException24 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException25 = new org.projectodd.sockjs.SockJsException((java.lang.Throwable) sockJsException24);
        sockJsEndpoint21.onError(session22, (java.lang.Throwable) sockJsException25);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException25);
        org.projectodd.sockjs.SockJsServer sockJsServer28 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session29 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection30 = new org.projectodd.sockjs.SockJsConnection(session29);
        sockJsConnection30.prefix = "\"\"";
        sockJsConnection30.url = "\"\\\"\\\"\"";
        java.lang.String str35 = sockJsConnection30.id;
        java.lang.String str36 = sockJsConnection30.remoteAddress;
        sockJsServer28.emitConnection(sockJsConnection30);
        org.projectodd.sockjs.WebsocketHandler websocketHandler38 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer28);
        javax.servlet.http.HttpServletRequest httpServletRequest39 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest40 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest39);
        java.lang.String str41 = sockJsServletRequest40.session();
        org.projectodd.sockjs.SockJsException sockJsException44 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException45 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException44);
        sockJsServletRequest40.onError((java.lang.Throwable) sockJsException44);
        sockJsServletRequest40.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest48 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse49 = null;
        javax.servlet.AsyncContext asyncContext50 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse51 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse49, asyncContext50);
        org.projectodd.sockjs.SockJsServer.Options options52 = new org.projectodd.sockjs.SockJsServer.Options();
        int int53 = options52.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver54 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest48, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse51, options52);
        org.projectodd.sockjs.SockJsServer.Options options55 = new org.projectodd.sockjs.SockJsServer.Options();
        int int56 = options55.heartbeatDelay;
        boolean boolean57 = options55.jsessionid;
        java.lang.String str58 = options55.sockjsUrl;
        options55.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver61 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest40, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse51, options55);
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session62 = org.projectodd.sockjs.Transport.register((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer28, (org.projectodd.sockjs.GenericReceiver) htmlFileReceiver61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "e8973f89-8e9d-4bc9-acea-962b28264ad4" + "'", str35, "e8973f89-8e9d-4bc9-acea-962b28264ad4");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 25000 + "'", int53 == 25000);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 25000 + "'", int56 == 25000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str58, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        java.lang.String str17 = options13.sockjsUrl;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str17, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.lang.String str4 = dispatchEntry3.method;
        dispatchEntry3.method = "org.projectodd.sockjs.SockJsException";
        java.lang.String[] strArray7 = null;
        dispatchEntry3.groups = strArray7;
        dispatchEntry3.method = "b309409d-89d2-4d6e-a832-218c74ba5b9c";
        java.lang.Class<?> wildcardClass11 = dispatchEntry3.getClass();
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str1 = org.projectodd.sockjs.Utils.jsonStringify("45c5c7f62d06fed3323f980a739ffe91");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"45c5c7f62d06fed3323f980a739ffe91\"" + "'", str1, "\"45c5c7f62d06fed3323f980a739ffe91\"");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.hSid = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = null;
        appHandler1.disabledTransport = dispatchFunction11;
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler1.disabledTransport;
        org.projectodd.sockjs.SockJsServer sockJsServer14 = null;
        org.projectodd.sockjs.AppHandler appHandler15 = new org.projectodd.sockjs.AppHandler(sockJsServer14);
        org.projectodd.sockjs.DispatchFunction dispatchFunction16 = appHandler15.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer17 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler18 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer17);
        org.projectodd.sockjs.DispatchFunction dispatchFunction19 = websocketHandler18.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer20 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler21 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer20);
        org.projectodd.sockjs.DispatchFunction dispatchFunction22 = websocketHandler21.rawWebsocket;
        websocketHandler18.rawWebsocket = dispatchFunction22;
        appHandler15.disabledTransport = dispatchFunction22;
        appHandler1.welcomeScreen = dispatchFunction22;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction16);
        org.junit.Assert.assertNotNull(dispatchFunction19);
        org.junit.Assert.assertNotNull(dispatchFunction22);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.remoteAddress = "3ab7963e-8fca-4430-8d3d-57d50376f624";
        java.lang.String str4 = sockJsConnection1.pathname;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        sockJsServletRequest1.addMatch("http://cdn.sockjs.org/sockjs-0.3.min.js", "d3c27a3b-df3d-49b0-b43f-a93d6fde76b3");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        javax.servlet.ServletRequest servletRequest1 = null;
        javax.servlet.ServletResponse servletResponse2 = null;
        // The following exception was thrown during execution in test generation
        try {
            sockJsServlet0.service(servletRequest1, servletResponse2);
            org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException; message: non-HTTP request or response");
        } catch (javax.servlet.ServletException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher13 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction8, dispatchFunction12);
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler17 = new org.projectodd.sockjs.IframeHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = iframeHandler17.iframe;
        org.projectodd.sockjs.SockJsServer sockJsServer19 = null;
        org.projectodd.sockjs.AppHandler appHandler20 = new org.projectodd.sockjs.AppHandler(sockJsServer19);
        org.projectodd.sockjs.DispatchFunction dispatchFunction21 = appHandler20.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer25 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler26 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer25);
        org.projectodd.sockjs.DispatchFunction dispatchFunction27 = websocketHandler26.rawWebsocket;
        websocketHandler23.rawWebsocket = dispatchFunction27;
        org.projectodd.sockjs.SockJsServer sockJsServer29 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler30 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer29);
        org.projectodd.sockjs.DispatchFunction dispatchFunction31 = websocketHandler30.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher32 = new org.projectodd.sockjs.Dispatcher(dispatchFunction21, dispatchFunction27, dispatchFunction31);
        org.projectodd.sockjs.SockJsServer sockJsServer33 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler34 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer33);
        org.projectodd.sockjs.DispatchFunction dispatchFunction35 = websocketHandler34.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer36 = null;
        org.projectodd.sockjs.AppHandler appHandler37 = new org.projectodd.sockjs.AppHandler(sockJsServer36);
        org.projectodd.sockjs.DispatchFunction dispatchFunction38 = appHandler37.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer39 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler40 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer39);
        org.projectodd.sockjs.DispatchFunction dispatchFunction41 = websocketHandler40.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer42 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler43 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer42);
        org.projectodd.sockjs.DispatchFunction dispatchFunction44 = websocketHandler43.rawWebsocket;
        websocketHandler40.rawWebsocket = dispatchFunction44;
        appHandler37.hSid = dispatchFunction44;
        org.projectodd.sockjs.SockJsServer sockJsServer47 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler48 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer47);
        org.projectodd.sockjs.DispatchFunction dispatchFunction49 = websocketHandler48.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher50 = new org.projectodd.sockjs.Dispatcher(dispatchFunction35, dispatchFunction44, dispatchFunction49);
        org.projectodd.sockjs.SockJsServer sockJsServer51 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler52 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer51);
        org.projectodd.sockjs.DispatchFunction dispatchFunction53 = websocketHandler52.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer54 = null;
        org.projectodd.sockjs.AppHandler appHandler55 = new org.projectodd.sockjs.AppHandler(sockJsServer54);
        org.projectodd.sockjs.DispatchFunction dispatchFunction56 = appHandler55.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer57 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler58 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer57);
        org.projectodd.sockjs.DispatchFunction dispatchFunction59 = websocketHandler58.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer60 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler61 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer60);
        org.projectodd.sockjs.DispatchFunction dispatchFunction62 = websocketHandler61.rawWebsocket;
        websocketHandler58.rawWebsocket = dispatchFunction62;
        appHandler55.hSid = dispatchFunction62;
        org.projectodd.sockjs.SockJsServer sockJsServer65 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler66 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer65);
        org.projectodd.sockjs.DispatchFunction dispatchFunction67 = websocketHandler66.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher68 = new org.projectodd.sockjs.Dispatcher(dispatchFunction53, dispatchFunction62, dispatchFunction67);
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray69 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction18, dispatchFunction31, dispatchFunction35, dispatchFunction62 };
        dispatcher13.push("63271dc7-5174-48ba-8275-e00f4ff28b1f", "org.projectodd.sockjs.SockJsException", dispatchFunctionArray69);
        javax.websocket.Session session71 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap74 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest75 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session71, "\"hi!\"", "c[1,\"\"]", strMap74);
        org.projectodd.sockjs.SockJsRequest sockJsRequest76 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse77 = null;
        javax.servlet.AsyncContext asyncContext78 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse79 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse77, asyncContext78);
        org.projectodd.sockjs.SockJsServer.Options options80 = new org.projectodd.sockjs.SockJsServer.Options();
        int int81 = options80.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver82 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest76, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse79, options80);
        boolean boolean83 = sockJsServletResponse79.finished();
        // The following exception was thrown during execution in test generation
        try {
            dispatcher13.dispatch((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest75, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction18);
        org.junit.Assert.assertNotNull(dispatchFunction21);
        org.junit.Assert.assertNotNull(dispatchFunction24);
        org.junit.Assert.assertNotNull(dispatchFunction27);
        org.junit.Assert.assertNotNull(dispatchFunction31);
        org.junit.Assert.assertNotNull(dispatchFunction35);
        org.junit.Assert.assertNotNull(dispatchFunction38);
        org.junit.Assert.assertNotNull(dispatchFunction41);
        org.junit.Assert.assertNotNull(dispatchFunction44);
        org.junit.Assert.assertNotNull(dispatchFunction49);
        org.junit.Assert.assertNotNull(dispatchFunction53);
        org.junit.Assert.assertNotNull(dispatchFunction56);
        org.junit.Assert.assertNotNull(dispatchFunction59);
        org.junit.Assert.assertNotNull(dispatchFunction62);
        org.junit.Assert.assertNotNull(dispatchFunction67);
        org.junit.Assert.assertNotNull(dispatchFunctionArray69);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 25000 + "'", int81 == 25000);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        org.projectodd.sockjs.SockJsRequest sockJsRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        javax.servlet.AsyncContext asyncContext8 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse9 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse7, asyncContext8);
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        int int11 = options10.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver12 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options10);
        java.lang.Integer int13 = sockJsServletResponse9.cacheFor();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        int int19 = options18.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options18);
        org.projectodd.sockjs.Session session22 = eventSourceReceiver21.session;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25000 + "'", int11 == 25000);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
        org.junit.Assert.assertNull(session22);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        javax.servlet.AsyncContext asyncContext4 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse5 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse3, asyncContext4);
        org.projectodd.sockjs.SockJsServer.Options options6 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver7 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest2, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse5, options6);
        sockJsServer0.options = options6;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServer0.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver14 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        int int15 = sockJsServletResponse12.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest16 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse17 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest18 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse19 = null;
        org.projectodd.sockjs.SockJsServer.Options options20 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest18, sockJsResponse19, options20);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver22 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest16, sockJsResponse17, options20);
        options20.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver26 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options20, "45c5c7f62d06fed3323f980a739ffe91");
        org.projectodd.sockjs.SockJsServer sockJsServer27 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer27.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint31 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer27, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint34 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer27, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        javax.websocket.Session session35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver rawWebsocketSessionReceiver36 = new org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer27, session35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sockJsServletRequest1.getPrefix();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<java.lang.String> strEnumeration1 = sockJsServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        javax.servlet.http.HttpServletRequest httpServletRequest10 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest11 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest10);
        java.lang.String str12 = sockJsServletRequest11.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = sockJsServletRequest11.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler14 = null;
        sockJsServletRequest11.onEnd(onEndHandler14);
        javax.servlet.http.HttpServletRequest httpServletRequest16 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest17 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest16);
        java.lang.String str18 = sockJsServletRequest17.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction19 = sockJsServletRequest17.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest20 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse21 = null;
        javax.servlet.AsyncContext asyncContext22 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse23 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse21, asyncContext22);
        org.projectodd.sockjs.SockJsServer.Options options24 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver25 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest20, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse23, options24);
        int int26 = sockJsServletResponse23.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest27 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse28 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest29 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse30 = null;
        org.projectodd.sockjs.SockJsServer.Options options31 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver32 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest29, sockJsResponse30, options31);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver33 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest27, sockJsResponse28, options31);
        options31.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver36 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest17, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse23, options31);
        sockJsServletResponse23.statusCode((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServer0.dispatch((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest11, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7ed59039-7c7e-4a7c-9fa2-441727ad9b01" + "'", str7, "7ed59039-7c7e-4a7c-9fa2-441727ad9b01");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dispatchFunction13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dispatchFunction19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler1 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = websocketHandler1.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        websocketHandler1.sockjsWebsocket = dispatchFunction5;
        org.projectodd.sockjs.SockJsServer sockJsServer7 = null;
        org.projectodd.sockjs.AppHandler appHandler8 = new org.projectodd.sockjs.AppHandler(sockJsServer7);
        org.projectodd.sockjs.DispatchFunction dispatchFunction9 = appHandler8.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer13 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler14 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer13);
        org.projectodd.sockjs.DispatchFunction dispatchFunction15 = websocketHandler14.rawWebsocket;
        websocketHandler11.rawWebsocket = dispatchFunction15;
        org.projectodd.sockjs.SockJsServer sockJsServer17 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler18 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer17);
        org.projectodd.sockjs.DispatchFunction dispatchFunction19 = websocketHandler18.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher20 = new org.projectodd.sockjs.Dispatcher(dispatchFunction9, dispatchFunction15, dispatchFunction19);
        websocketHandler1.sockjsWebsocket = dispatchFunction15;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction9);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction15);
        org.junit.Assert.assertNotNull(dispatchFunction19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.lang.String str4 = dispatchEntry3.method;
        dispatchEntry3.method = "org.projectodd.sockjs.SockJsException";
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray9 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry10 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray9);
        java.lang.String str11 = dispatchEntry10.method;
        dispatchEntry10.method = "org.projectodd.sockjs.SockJsException";
        java.lang.String[] strArray14 = dispatchEntry10.groups;
        dispatchEntry3.groups = strArray14;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(dispatchFunctionArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.remoteAddress;
        java.lang.String str8 = sockJsConnection1.id;
        sockJsConnection1.emitClose();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = sockJsConnection1.headers;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = sockJsConnection1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "79c3ccc0-4a6d-4adb-ac85-ead6ca1938d8" + "'", str6, "79c3ccc0-4a6d-4adb-ac85-ead6ca1938d8");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "79c3ccc0-4a6d-4adb-ac85-ead6ca1938d8" + "'", str8, "79c3ccc0-4a6d-4adb-ac85-ead6ca1938d8");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        org.projectodd.sockjs.SockJsException sockJsException1 = new org.projectodd.sockjs.SockJsException("\"45c5c7f62d06fed3323f980a739ffe91\"");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint4 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "e1fee1fb-09c9-49c7-81a8-3ab8e171187f", "d3c27a3b-df3d-49b0-b43f-a93d6fde76b3");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.Session session11 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection12 = new org.projectodd.sockjs.SockJsConnection(session11);
        sockJsConnection12.prefix = "\"\"";
        sockJsServer0.emitConnection(sockJsConnection12);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler16 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "47824d13-64b4-498f-90f0-7f3909405d42" + "'", str7, "47824d13-64b4-498f-90f0-7f3909405d42");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse6.writeHead((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        org.projectodd.sockjs.NextFilter nextFilter5 = sockJsWebsocketRequest4.nextFilter;
        int int6 = sockJsWebsocketRequest4.getRemotePort();
        org.junit.Assert.assertNull(nextFilter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.projectodd.sockjs.SockJsServer.Options options0 = new org.projectodd.sockjs.SockJsServer.Options();
        int int1 = options0.heartbeatDelay;
        boolean boolean2 = options0.jsessionid;
        java.lang.String str3 = options0.baseUrl;
        options0.baseUrl = "<SockJSConnection 325d0bee-caf7-47aa-a040-4e3ef5c9d7e0>";
        options0.jsessionid = false;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25000 + "'", int1 == 25000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = sockJsServletRequest1.getCookie("<SockJSConnection 64b92e6a-a976-49ab-8dc9-9cc5f226d9b1>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        org.projectodd.sockjs.SockJsRequest sockJsRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        javax.servlet.AsyncContext asyncContext8 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse9 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse7, asyncContext8);
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        int int11 = options10.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver12 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options10);
        java.lang.Integer int13 = sockJsServletResponse9.cacheFor();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        int int19 = options18.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = sockJsServletRequest1.getCookie("c[1,\"\"]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25000 + "'", int11 == 25000);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.AppHandler appHandler3 = new org.projectodd.sockjs.AppHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = appHandler3.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler6 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = websocketHandler6.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer8 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer8);
        org.projectodd.sockjs.DispatchFunction dispatchFunction10 = websocketHandler9.rawWebsocket;
        websocketHandler6.rawWebsocket = dispatchFunction10;
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler13 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = websocketHandler13.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher15 = new org.projectodd.sockjs.Dispatcher(dispatchFunction4, dispatchFunction10, dispatchFunction14);
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = websocketHandler17.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer19 = null;
        org.projectodd.sockjs.AppHandler appHandler20 = new org.projectodd.sockjs.AppHandler(sockJsServer19);
        org.projectodd.sockjs.DispatchFunction dispatchFunction21 = appHandler20.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer25 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler26 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer25);
        org.projectodd.sockjs.DispatchFunction dispatchFunction27 = websocketHandler26.rawWebsocket;
        websocketHandler23.rawWebsocket = dispatchFunction27;
        appHandler20.hSid = dispatchFunction27;
        org.projectodd.sockjs.SockJsServer sockJsServer30 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler31 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer30);
        org.projectodd.sockjs.DispatchFunction dispatchFunction32 = websocketHandler31.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher33 = new org.projectodd.sockjs.Dispatcher(dispatchFunction18, dispatchFunction27, dispatchFunction32);
        org.projectodd.sockjs.SockJsServer sockJsServer34 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler35 = new org.projectodd.sockjs.JsonpHandler(sockJsServer34);
        org.projectodd.sockjs.DispatchFunction dispatchFunction36 = jsonpHandler35.jsonp;
        org.projectodd.sockjs.DispatchFunction dispatchFunction37 = jsonpHandler35.jsonpSend;
        org.projectodd.sockjs.SockJsServer sockJsServer38 = null;
        org.projectodd.sockjs.AppHandler appHandler39 = new org.projectodd.sockjs.AppHandler(sockJsServer38);
        org.projectodd.sockjs.DispatchFunction dispatchFunction40 = appHandler39.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer41 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler42 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer41);
        org.projectodd.sockjs.DispatchFunction dispatchFunction43 = websocketHandler42.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer44 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler45 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer44);
        org.projectodd.sockjs.DispatchFunction dispatchFunction46 = websocketHandler45.rawWebsocket;
        websocketHandler42.rawWebsocket = dispatchFunction46;
        appHandler39.disabledTransport = dispatchFunction46;
        org.projectodd.sockjs.DispatchFunction dispatchFunction49 = appHandler39.handle404;
        org.projectodd.sockjs.DispatchFunction dispatchFunction50 = appHandler39.disabledTransport;
        org.projectodd.sockjs.SockJsServer sockJsServer51 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler52 = new org.projectodd.sockjs.JsonpHandler(sockJsServer51);
        org.projectodd.sockjs.SockJsServer sockJsServer53 = null;
        org.projectodd.sockjs.AppHandler appHandler54 = new org.projectodd.sockjs.AppHandler(sockJsServer53);
        org.projectodd.sockjs.DispatchFunction dispatchFunction55 = appHandler54.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer56 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler57 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer56);
        org.projectodd.sockjs.DispatchFunction dispatchFunction58 = websocketHandler57.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer59 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler60 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer59);
        org.projectodd.sockjs.DispatchFunction dispatchFunction61 = websocketHandler60.rawWebsocket;
        websocketHandler57.rawWebsocket = dispatchFunction61;
        appHandler54.disabledTransport = dispatchFunction61;
        org.projectodd.sockjs.DispatchFunction dispatchFunction64 = appHandler54.welcomeScreen;
        jsonpHandler52.jsonp = dispatchFunction64;
        org.projectodd.sockjs.SockJsServer sockJsServer66 = null;
        org.projectodd.sockjs.AppHandler appHandler67 = new org.projectodd.sockjs.AppHandler(sockJsServer66);
        org.projectodd.sockjs.DispatchFunction dispatchFunction68 = appHandler67.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer69 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler70 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer69);
        org.projectodd.sockjs.DispatchFunction dispatchFunction71 = websocketHandler70.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer72 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler73 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer72);
        org.projectodd.sockjs.DispatchFunction dispatchFunction74 = websocketHandler73.rawWebsocket;
        websocketHandler70.rawWebsocket = dispatchFunction74;
        appHandler67.disabledTransport = dispatchFunction74;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray77 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction4, dispatchFunction18, dispatchFunction37, dispatchFunction50, dispatchFunction64, dispatchFunction74 };
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry78 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("e1fee1fb-09c9-49c7-81a8-3ab8e171187f", "\"\\\"\\\"\"", dispatchFunctionArray77);
        java.lang.String str79 = dispatchEntry78.method;
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction10);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction18);
        org.junit.Assert.assertNotNull(dispatchFunction21);
        org.junit.Assert.assertNotNull(dispatchFunction24);
        org.junit.Assert.assertNotNull(dispatchFunction27);
        org.junit.Assert.assertNotNull(dispatchFunction32);
        org.junit.Assert.assertNotNull(dispatchFunction36);
        org.junit.Assert.assertNotNull(dispatchFunction37);
        org.junit.Assert.assertNotNull(dispatchFunction40);
        org.junit.Assert.assertNotNull(dispatchFunction43);
        org.junit.Assert.assertNotNull(dispatchFunction46);
        org.junit.Assert.assertNotNull(dispatchFunction49);
        org.junit.Assert.assertNotNull(dispatchFunction50);
        org.junit.Assert.assertNotNull(dispatchFunction55);
        org.junit.Assert.assertNotNull(dispatchFunction58);
        org.junit.Assert.assertNotNull(dispatchFunction61);
        org.junit.Assert.assertNotNull(dispatchFunction64);
        org.junit.Assert.assertNotNull(dispatchFunction68);
        org.junit.Assert.assertNotNull(dispatchFunction71);
        org.junit.Assert.assertNotNull(dispatchFunction74);
        org.junit.Assert.assertNotNull(dispatchFunctionArray77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "e1fee1fb-09c9-49c7-81a8-3ab8e171187f" + "'", str79, "e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.SockJsException sockJsException10 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException11 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onError((java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver19 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        int int20 = sockJsServletResponse17.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse24 = null;
        org.projectodd.sockjs.SockJsServer.Options options25 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver26 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest23, sockJsResponse24, options25);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver27 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options25);
        options25.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver31 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options25, "45c5c7f62d06fed3323f980a739ffe91");
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest33 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest32);
        java.lang.String str34 = sockJsServletRequest33.session();
        org.projectodd.sockjs.SockJsException sockJsException37 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException38 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onError((java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        javax.servlet.AsyncContext asyncContext43 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse44 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse42, asyncContext43);
        org.projectodd.sockjs.SockJsServer.Options options45 = new org.projectodd.sockjs.SockJsServer.Options();
        int int46 = options45.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver47 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest41, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options45);
        org.projectodd.sockjs.SockJsServer.Options options48 = new org.projectodd.sockjs.SockJsServer.Options();
        int int49 = options48.heartbeatDelay;
        boolean boolean50 = options48.jsessionid;
        java.lang.String str51 = options48.sockjsUrl;
        options48.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver54 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options48);
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver56 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options48, "");
        java.lang.String str58 = sockJsWebsocketRequest4.getCookie("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = sockJsWebsocketRequest4.getHeader("\"45c5c7f62d06fed3323f980a739ffe91\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25000 + "'", int46 == 25000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 25000 + "'", int49 == 25000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str51, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "\"hi!\"", "325d0bee-caf7-47aa-a040-4e3ef5c9d7e0");
        org.projectodd.sockjs.EventsourceHandler eventsourceHandler5 = new org.projectodd.sockjs.EventsourceHandler(sockJsServer0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.projectodd.sockjs.Transport.CLOSED = '#';
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        int int6 = sockJsServletResponse3.statusCode();
        sockJsServletResponse3.cacheFor((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.end();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler1 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = websocketHandler1.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.AppHandler appHandler4 = new org.projectodd.sockjs.AppHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = appHandler4.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer9 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer9);
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = websocketHandler10.rawWebsocket;
        websocketHandler7.rawWebsocket = dispatchFunction11;
        appHandler4.hSid = dispatchFunction11;
        org.projectodd.sockjs.SockJsServer sockJsServer14 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler15 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer14);
        org.projectodd.sockjs.DispatchFunction dispatchFunction16 = websocketHandler15.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher17 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction11, dispatchFunction16);
        org.projectodd.sockjs.SockJsRequest sockJsRequest18 = null;
        javax.servlet.http.HttpServletRequest httpServletRequest19 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest20 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest19);
        java.lang.String str21 = sockJsServletRequest20.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction22 = sockJsServletRequest20.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse24 = null;
        javax.servlet.AsyncContext asyncContext25 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse26 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse24, asyncContext25);
        org.projectodd.sockjs.SockJsServer.Options options27 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver28 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest23, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse26, options27);
        int int29 = sockJsServletResponse26.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest30 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse31 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest32 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse33 = null;
        org.projectodd.sockjs.SockJsServer.Options options34 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver35 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest32, sockJsResponse33, options34);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver36 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest30, sockJsResponse31, options34);
        options34.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver39 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest20, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse26, options34);
        org.projectodd.sockjs.Session session40 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection41 = new org.projectodd.sockjs.SockJsConnection(session40);
        sockJsConnection41.pathname = "hi!";
        sockJsConnection41.emitClose();
        sockJsConnection41.remotePort = 0;
        java.util.Map<java.lang.String, java.lang.String> strMap47 = sockJsConnection41.headers;
        sockJsConnection41.remotePort = 'a';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = dispatchFunction16.handle(sockJsRequest18, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse26, (java.lang.Object) sockJsConnection41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(dispatchFunction22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        org.projectodd.sockjs.SockJsException sockJsException2 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException3 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException2);
        java.lang.Throwable[] throwableArray4 = sockJsException2.getSuppressed();
        java.lang.Class<?> wildcardClass5 = throwableArray4.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        int int0 = org.projectodd.sockjs.Transport.CLOSED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsServer sockJsServer1 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer1.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint5 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer1, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        sockJsServlet0.setServer(sockJsServer1);
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = sockJsServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.hSid = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer11 = null;
        org.projectodd.sockjs.AppHandler appHandler12 = new org.projectodd.sockjs.AppHandler(sockJsServer11);
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler12.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer14 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler15 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer14);
        org.projectodd.sockjs.DispatchFunction dispatchFunction16 = websocketHandler15.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer17 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler18 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer17);
        org.projectodd.sockjs.DispatchFunction dispatchFunction19 = websocketHandler18.rawWebsocket;
        websocketHandler15.rawWebsocket = dispatchFunction19;
        appHandler12.disabledTransport = dispatchFunction19;
        org.projectodd.sockjs.DispatchFunction dispatchFunction22 = appHandler12.welcomeScreen;
        appHandler1.hSid = dispatchFunction22;
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = appHandler1.handle404;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction16);
        org.junit.Assert.assertNotNull(dispatchFunction19);
        org.junit.Assert.assertNotNull(dispatchFunction22);
        org.junit.Assert.assertNotNull(dispatchFunction24);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver14 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        int int15 = sockJsServletResponse12.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest16 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse17 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest18 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse19 = null;
        org.projectodd.sockjs.SockJsServer.Options options20 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest18, sockJsResponse19, options20);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver22 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest16, sockJsResponse17, options20);
        options20.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver26 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options20, "45c5c7f62d06fed3323f980a739ffe91");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = sockJsServletRequest1.getMethod();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.String str2 = org.projectodd.sockjs.Transport.closeFrame((int) (byte) 1, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c[1,\"\"hi!\"\"]" + "'", str2, "c[1,\"\"hi!\"\"]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String str2 = org.projectodd.sockjs.Utils.escapeSelected("51c8742e-ccc2-4ab2-97e5-9a1ecdf36478", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "51c8742e-ccc2-4ab2-97e5-9a1ecdf36478" + "'", str2, "51c8742e-ccc2-4ab2-97e5-9a1ecdf36478");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher13 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction8, dispatchFunction12);
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.AppHandler appHandler19 = new org.projectodd.sockjs.AppHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = appHandler19.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer24 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler25 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer24);
        org.projectodd.sockjs.DispatchFunction dispatchFunction26 = websocketHandler25.rawWebsocket;
        websocketHandler22.rawWebsocket = dispatchFunction26;
        org.projectodd.sockjs.SockJsServer sockJsServer28 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler29 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer28);
        org.projectodd.sockjs.DispatchFunction dispatchFunction30 = websocketHandler29.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher31 = new org.projectodd.sockjs.Dispatcher(dispatchFunction20, dispatchFunction26, dispatchFunction30);
        org.projectodd.sockjs.SockJsServer sockJsServer32 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler33 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer32);
        org.projectodd.sockjs.DispatchFunction dispatchFunction34 = websocketHandler33.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer35 = null;
        org.projectodd.sockjs.AppHandler appHandler36 = new org.projectodd.sockjs.AppHandler(sockJsServer35);
        org.projectodd.sockjs.DispatchFunction dispatchFunction37 = appHandler36.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer38 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler39 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer38);
        org.projectodd.sockjs.DispatchFunction dispatchFunction40 = websocketHandler39.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer41 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler42 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer41);
        org.projectodd.sockjs.DispatchFunction dispatchFunction43 = websocketHandler42.rawWebsocket;
        websocketHandler39.rawWebsocket = dispatchFunction43;
        appHandler36.hSid = dispatchFunction43;
        org.projectodd.sockjs.SockJsServer sockJsServer46 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler47 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer46);
        org.projectodd.sockjs.DispatchFunction dispatchFunction48 = websocketHandler47.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher49 = new org.projectodd.sockjs.Dispatcher(dispatchFunction34, dispatchFunction43, dispatchFunction48);
        org.projectodd.sockjs.SockJsServer sockJsServer50 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler51 = new org.projectodd.sockjs.JsonpHandler(sockJsServer50);
        org.projectodd.sockjs.DispatchFunction dispatchFunction52 = jsonpHandler51.jsonp;
        org.projectodd.sockjs.DispatchFunction dispatchFunction53 = jsonpHandler51.jsonpSend;
        org.projectodd.sockjs.SockJsServer sockJsServer54 = null;
        org.projectodd.sockjs.AppHandler appHandler55 = new org.projectodd.sockjs.AppHandler(sockJsServer54);
        org.projectodd.sockjs.DispatchFunction dispatchFunction56 = appHandler55.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer57 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler58 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer57);
        org.projectodd.sockjs.DispatchFunction dispatchFunction59 = websocketHandler58.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer60 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler61 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer60);
        org.projectodd.sockjs.DispatchFunction dispatchFunction62 = websocketHandler61.rawWebsocket;
        websocketHandler58.rawWebsocket = dispatchFunction62;
        appHandler55.disabledTransport = dispatchFunction62;
        org.projectodd.sockjs.DispatchFunction dispatchFunction65 = appHandler55.handle404;
        org.projectodd.sockjs.DispatchFunction dispatchFunction66 = appHandler55.disabledTransport;
        org.projectodd.sockjs.SockJsServer sockJsServer67 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler68 = new org.projectodd.sockjs.JsonpHandler(sockJsServer67);
        org.projectodd.sockjs.SockJsServer sockJsServer69 = null;
        org.projectodd.sockjs.AppHandler appHandler70 = new org.projectodd.sockjs.AppHandler(sockJsServer69);
        org.projectodd.sockjs.DispatchFunction dispatchFunction71 = appHandler70.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer72 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler73 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer72);
        org.projectodd.sockjs.DispatchFunction dispatchFunction74 = websocketHandler73.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer75 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler76 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer75);
        org.projectodd.sockjs.DispatchFunction dispatchFunction77 = websocketHandler76.rawWebsocket;
        websocketHandler73.rawWebsocket = dispatchFunction77;
        appHandler70.disabledTransport = dispatchFunction77;
        org.projectodd.sockjs.DispatchFunction dispatchFunction80 = appHandler70.welcomeScreen;
        jsonpHandler68.jsonp = dispatchFunction80;
        org.projectodd.sockjs.SockJsServer sockJsServer82 = null;
        org.projectodd.sockjs.AppHandler appHandler83 = new org.projectodd.sockjs.AppHandler(sockJsServer82);
        org.projectodd.sockjs.DispatchFunction dispatchFunction84 = appHandler83.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer85 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler86 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer85);
        org.projectodd.sockjs.DispatchFunction dispatchFunction87 = websocketHandler86.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer88 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler89 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer88);
        org.projectodd.sockjs.DispatchFunction dispatchFunction90 = websocketHandler89.rawWebsocket;
        websocketHandler86.rawWebsocket = dispatchFunction90;
        appHandler83.disabledTransport = dispatchFunction90;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray93 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction20, dispatchFunction34, dispatchFunction53, dispatchFunction66, dispatchFunction80, dispatchFunction90 };
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry94 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("e1fee1fb-09c9-49c7-81a8-3ab8e171187f", "\"\\\"\\\"\"", dispatchFunctionArray93);
        dispatcher13.push("\"hi!\"", "29cbd81d-ab05-4d71-90e6-7819015ba4e2", dispatchFunctionArray93);
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction26);
        org.junit.Assert.assertNotNull(dispatchFunction30);
        org.junit.Assert.assertNotNull(dispatchFunction34);
        org.junit.Assert.assertNotNull(dispatchFunction37);
        org.junit.Assert.assertNotNull(dispatchFunction40);
        org.junit.Assert.assertNotNull(dispatchFunction43);
        org.junit.Assert.assertNotNull(dispatchFunction48);
        org.junit.Assert.assertNotNull(dispatchFunction52);
        org.junit.Assert.assertNotNull(dispatchFunction53);
        org.junit.Assert.assertNotNull(dispatchFunction56);
        org.junit.Assert.assertNotNull(dispatchFunction59);
        org.junit.Assert.assertNotNull(dispatchFunction62);
        org.junit.Assert.assertNotNull(dispatchFunction65);
        org.junit.Assert.assertNotNull(dispatchFunction66);
        org.junit.Assert.assertNotNull(dispatchFunction71);
        org.junit.Assert.assertNotNull(dispatchFunction74);
        org.junit.Assert.assertNotNull(dispatchFunction77);
        org.junit.Assert.assertNotNull(dispatchFunction80);
        org.junit.Assert.assertNotNull(dispatchFunction84);
        org.junit.Assert.assertNotNull(dispatchFunction87);
        org.junit.Assert.assertNotNull(dispatchFunction90);
        org.junit.Assert.assertNotNull(dispatchFunctionArray93);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = sockJsServletRequest1.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "\"hi!\"", "325d0bee-caf7-47aa-a040-4e3ef5c9d7e0");
        javax.websocket.Session session5 = null;
        javax.websocket.EndpointConfig endpointConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            sockJsEndpoint4.onOpen(session5, endpointConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse3 = null;
        javax.servlet.AsyncContext asyncContext4 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse5 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse3, asyncContext4);
        org.projectodd.sockjs.SockJsServer.Options options6 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver7 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest2, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse5, options6);
        sockJsServer0.options = options6;
        boolean boolean9 = options6.jsessionid;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler1 = new org.projectodd.sockjs.IframeHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = iframeHandler1.iframe;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.AppHandler appHandler4 = new org.projectodd.sockjs.AppHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = appHandler4.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer9 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer9);
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = websocketHandler10.rawWebsocket;
        websocketHandler7.rawWebsocket = dispatchFunction11;
        appHandler4.disabledTransport = dispatchFunction11;
        iframeHandler1.iframe = dispatchFunction11;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.AppHandler appHandler16 = new org.projectodd.sockjs.AppHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = appHandler16.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler19 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = websocketHandler19.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        websocketHandler19.rawWebsocket = dispatchFunction23;
        appHandler16.hSid = dispatchFunction23;
        org.projectodd.sockjs.DispatchFunction dispatchFunction26 = appHandler16.hSid;
        iframeHandler1.iframe = dispatchFunction26;
        org.projectodd.sockjs.DispatchFunction dispatchFunction28 = iframeHandler1.iframe;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction26);
        org.junit.Assert.assertNotNull(dispatchFunction28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = sockJsServletResponse3.getHeader("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.remoteAddress;
        java.lang.String str8 = sockJsConnection1.id;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = sockJsConnection1.write("47824d13-64b4-498f-90f0-7f3909405d42");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "984edfcd-523c-449d-8121-f2174c5c11e8" + "'", str6, "984edfcd-523c-449d-8121-f2174c5c11e8");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "984edfcd-523c-449d-8121-f2174c5c11e8" + "'", str8, "984edfcd-523c-449d-8121-f2174c5c11e8");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        byte[] byteArray0 = new byte[] {};
        org.projectodd.sockjs.Buffer buffer1 = new org.projectodd.sockjs.Buffer(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.JsonpHandler jsonpHandler2 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = sockJsServletRequest1.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        org.projectodd.sockjs.SockJsServer sockJsServer17 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler18 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer17);
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint21 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer17, "\"hi!\"", "325d0bee-caf7-47aa-a040-4e3ef5c9d7e0");
        javax.websocket.Session session22 = null;
        org.projectodd.sockjs.SockJsException sockJsException24 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException25 = new org.projectodd.sockjs.SockJsException((java.lang.Throwable) sockJsException24);
        sockJsEndpoint21.onError(session22, (java.lang.Throwable) sockJsException25);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = sockJsServletRequest1.getHeader("9d4568c009d203ab10e33ea9953a0264");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint7 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        javax.websocket.Session session8 = null;
        java.lang.Throwable throwable9 = null;
        rawWebsocketEndpoint7.onError(session8, throwable9);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.hSid = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.AppHandler appHandler13 = new org.projectodd.sockjs.AppHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = appHandler13.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler16 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = websocketHandler16.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler19 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = websocketHandler19.rawWebsocket;
        websocketHandler16.rawWebsocket = dispatchFunction20;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher25 = new org.projectodd.sockjs.Dispatcher(dispatchFunction14, dispatchFunction20, dispatchFunction24);
        appHandler1.hSid = dispatchFunction24;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction24);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sockJsServletRequest1.getContentType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.ChunkingHandler chunkingHandler1 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = chunkingHandler1.info;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        chunkingHandler1.info = dispatchFunction8;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        java.lang.Integer int7 = sockJsServletResponse3.cacheFor();
        sockJsServletResponse3.statusCode((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.writeHead((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        sockJsConnection2.remotePort = (short) 10;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "27036ee9-d378-444d-92a2-34f035d07fd1" + "'", str7, "27036ee9-d378-444d-92a2-34f035d07fd1");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler3 = new org.projectodd.sockjs.IframeHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = iframeHandler3.iframe;
        htmlfileHandler1.htmlfile = dispatchFunction4;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.AppHandler appHandler7 = new org.projectodd.sockjs.AppHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = appHandler7.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer9 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer9);
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = websocketHandler10.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler13 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = websocketHandler13.rawWebsocket;
        websocketHandler10.rawWebsocket = dispatchFunction14;
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = websocketHandler17.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher19 = new org.projectodd.sockjs.Dispatcher(dispatchFunction8, dispatchFunction14, dispatchFunction18);
        htmlfileHandler1.htmlfile = dispatchFunction14;
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction18);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        java.lang.String str1 = org.projectodd.sockjs.Utils.quote("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.SockJsException sockJsException10 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException11 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onError((java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver19 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        int int20 = sockJsServletResponse17.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse24 = null;
        org.projectodd.sockjs.SockJsServer.Options options25 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver26 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest23, sockJsResponse24, options25);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver27 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options25);
        options25.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver31 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options25, "45c5c7f62d06fed3323f980a739ffe91");
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest33 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest32);
        java.lang.String str34 = sockJsServletRequest33.session();
        org.projectodd.sockjs.SockJsException sockJsException37 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException38 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onError((java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        javax.servlet.AsyncContext asyncContext43 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse44 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse42, asyncContext43);
        org.projectodd.sockjs.SockJsServer.Options options45 = new org.projectodd.sockjs.SockJsServer.Options();
        int int46 = options45.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver47 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest41, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options45);
        org.projectodd.sockjs.SockJsServer.Options options48 = new org.projectodd.sockjs.SockJsServer.Options();
        int int49 = options48.heartbeatDelay;
        boolean boolean50 = options48.jsessionid;
        java.lang.String str51 = options48.sockjsUrl;
        options48.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver54 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options48);
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver56 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options48, "");
        java.lang.String str58 = sockJsWebsocketRequest4.getCookie("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
        int int59 = sockJsWebsocketRequest4.getRemotePort();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25000 + "'", int46 == 25000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 25000 + "'", int49 == 25000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str51, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsServer sockJsServer1 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer1.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint5 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer1, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        sockJsServlet0.setServer(sockJsServer1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sockJsServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = appHandler1.welcomeScreen;
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = appHandler1.disabledTransport;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction12);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = sockJsServlet0.getInitParameter("b309409d-89d2-4d6e-a832-218c74ba5b9c");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = jsonpHandler1.jsonp;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.AppHandler appHandler4 = new org.projectodd.sockjs.AppHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = appHandler4.hSid;
        jsonpHandler1.jsonpSend = dispatchFunction5;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.ChunkingHandler chunkingHandler1 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = chunkingHandler1.info;
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = null;
        chunkingHandler1.info = dispatchFunction3;
        org.junit.Assert.assertNotNull(dispatchFunction2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        org.projectodd.sockjs.Session session6 = null;
        xhrPollingReceiver5.session = session6;
        boolean boolean9 = xhrPollingReceiver5.doSendFrame("b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        org.projectodd.sockjs.SockJsRequest sockJsRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        javax.servlet.AsyncContext asyncContext8 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse9 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse7, asyncContext8);
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        int int11 = options10.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver12 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options10);
        java.lang.Integer int13 = sockJsServletResponse9.cacheFor();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        int int19 = options18.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = sockJsServletRequest1.getRemotePort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25000 + "'", int11 == 25000);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.SockJsServer.Options options16 = new org.projectodd.sockjs.SockJsServer.Options();
        int int17 = options16.heartbeatDelay;
        boolean boolean18 = options16.jsessionid;
        java.lang.String str19 = options16.sockjsUrl;
        options16.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver22 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = sockJsServletRequest1.getHeader("9d4568c009d203ab10e33ea9953a0264");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25000 + "'", int17 == 25000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str19, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler1 = new org.projectodd.sockjs.IframeHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = iframeHandler1.iframe;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.AppHandler appHandler4 = new org.projectodd.sockjs.AppHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = appHandler4.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer9 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer9);
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = websocketHandler10.rawWebsocket;
        websocketHandler7.rawWebsocket = dispatchFunction11;
        appHandler4.disabledTransport = dispatchFunction11;
        iframeHandler1.iframe = dispatchFunction11;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.AppHandler appHandler16 = new org.projectodd.sockjs.AppHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = appHandler16.welcomeScreen;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.AppHandler appHandler19 = new org.projectodd.sockjs.AppHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = appHandler19.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer24 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler25 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer24);
        org.projectodd.sockjs.DispatchFunction dispatchFunction26 = websocketHandler25.rawWebsocket;
        websocketHandler22.rawWebsocket = dispatchFunction26;
        appHandler19.hSid = dispatchFunction26;
        org.projectodd.sockjs.DispatchFunction dispatchFunction29 = appHandler19.hSid;
        org.projectodd.sockjs.Dispatcher dispatcher30 = new org.projectodd.sockjs.Dispatcher(dispatchFunction11, dispatchFunction17, dispatchFunction29);
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction26);
        org.junit.Assert.assertNotNull(dispatchFunction29);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        java.lang.String str10 = sockJsConnection2.remoteAddress;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "dec98010-45c2-43ba-a00d-1102e6af745d" + "'", str7, "dec98010-45c2-43ba-a00d-1102e6af745d");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sockJsServletRequest1.getMethod();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint7 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        org.projectodd.sockjs.SockJsServer.Options options8 = sockJsServer0.options;
        org.junit.Assert.assertNotNull(options8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        boolean boolean8 = eventSourceReceiver6.doSendFrame("b309409d-89d2-4d6e-a832-218c74ba5b9c");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = eventSourceReceiver6.doSendFrame("47824d13-64b4-498f-90f0-7f3909405d42");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        java.lang.String str5 = sockJsWebsocketRequest4.getPrefix();
        org.projectodd.sockjs.SockJsServer sockJsServer6 = new org.projectodd.sockjs.SockJsServer();
        javax.websocket.Session session7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver rawWebsocketSessionReceiver8 = new org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, sockJsServer6, session7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str5, "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "\"hi!\"", "325d0bee-caf7-47aa-a040-4e3ef5c9d7e0");
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = sockJsServletRequest6.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler9 = null;
        sockJsServletRequest6.onEnd(onEndHandler9);
        javax.websocket.Session session11 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest15 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session11, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap14);
        java.lang.String str16 = sockJsWebsocketRequest15.getPrefix();
        org.projectodd.sockjs.SockJsRequest sockJsRequest17 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse18 = null;
        javax.servlet.AsyncContext asyncContext19 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse20 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse18, asyncContext19);
        org.projectodd.sockjs.SockJsServer.Options options21 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver22 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest17, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse20, options21);
        int int23 = sockJsServletResponse20.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest24 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse25 = null;
        javax.servlet.AsyncContext asyncContext26 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse27 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse25, asyncContext26);
        org.projectodd.sockjs.SockJsServer.Options options28 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver29 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest24, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse27, options28);
        options28.jsessionid = false;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver32 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest15, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse20, options28);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServer0.dispatch((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dispatchFunction8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str16, "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        org.projectodd.sockjs.NextFilter nextFilter5 = sockJsWebsocketRequest4.nextFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sockJsWebsocketRequest4.getHeader("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nextFilter5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.NextFilter nextFilter3 = null;
        sockJsServletRequest1.nextFilter = nextFilter3;
        java.lang.String str5 = sockJsServletRequest1.server();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver14 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        int int15 = sockJsServletResponse12.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest16 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse17 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest18 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse19 = null;
        org.projectodd.sockjs.SockJsServer.Options options20 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest18, sockJsResponse19, options20);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver22 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest16, sockJsResponse17, options20);
        options20.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver26 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options20, "45c5c7f62d06fed3323f980a739ffe91");
        org.projectodd.sockjs.DispatchException dispatchException29 = new org.projectodd.sockjs.DispatchException(0, "3ab7963e-8fca-4430-8d3d-57d50376f624");
        sockJsServletRequest1.onError((java.lang.Throwable) dispatchException29);
        org.projectodd.sockjs.DispatchException dispatchException33 = new org.projectodd.sockjs.DispatchException(10, "\"\"");
        sockJsServletRequest1.onError((java.lang.Throwable) dispatchException33);
        java.lang.String str35 = dispatchException33.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.projectodd.sockjs.DispatchException" + "'", str35, "org.projectodd.sockjs.DispatchException");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        options4.responseLimit = (byte) -1;
        options4.disconnectDelay = ' ';
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        org.projectodd.sockjs.SockJsServer sockJsServer5 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session6 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection7 = new org.projectodd.sockjs.SockJsConnection(session6);
        sockJsConnection7.prefix = "\"\"";
        sockJsConnection7.url = "\"\\\"\\\"\"";
        java.lang.String str12 = sockJsConnection7.id;
        java.lang.String str13 = sockJsConnection7.remoteAddress;
        sockJsServer5.emitConnection(sockJsConnection7);
        org.projectodd.sockjs.WebsocketHandler websocketHandler15 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer5);
        org.projectodd.sockjs.Session session16 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection17 = new org.projectodd.sockjs.SockJsConnection(session16);
        sockJsConnection17.prefix = "\"\"";
        sockJsServer5.emitConnection(sockJsConnection17);
        org.projectodd.sockjs.EventsourceHandler eventsourceHandler21 = new org.projectodd.sockjs.EventsourceHandler(sockJsServer5);
        javax.websocket.Session session22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver rawWebsocketSessionReceiver23 = new org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, sockJsServer5, session22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "29b728ff-b0ab-41e9-9275-5353f8274683" + "'", str12, "29b728ff-b0ab-41e9-9275-5353f8274683");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        javax.websocket.Session session7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver rawWebsocketSessionReceiver8 = new org.projectodd.sockjs.servlet.RawWebsocketSessionReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer6, session7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        org.projectodd.sockjs.DispatchException dispatchException2 = new org.projectodd.sockjs.DispatchException((int) (byte) 1, "\"9d4568c009d203ab10e33ea9953a0264\"");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.lang.String str4 = dispatchEntry3.method;
        dispatchEntry3.method = "org.projectodd.sockjs.SockJsException";
        java.lang.String[] strArray7 = null;
        dispatchEntry3.groups = strArray7;
        dispatchEntry3.method = "b309409d-89d2-4d6e-a832-218c74ba5b9c";
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray11 = dispatchEntry3.functions;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(dispatchFunctionArray11);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsServer sockJsServer1 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer1.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint5 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer1, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        sockJsServlet0.setServer(sockJsServer1);
        org.projectodd.sockjs.SockJsServer sockJsServer7 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session8 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection9 = new org.projectodd.sockjs.SockJsConnection(session8);
        sockJsConnection9.prefix = "\"\"";
        sockJsConnection9.url = "\"\\\"\\\"\"";
        java.lang.String str14 = sockJsConnection9.id;
        java.lang.String str15 = sockJsConnection9.remoteAddress;
        sockJsServer7.emitConnection(sockJsConnection9);
        sockJsServlet0.setServer(sockJsServer7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<java.lang.String> strEnumeration18 = sockJsServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "14074747-ea2f-4c4a-8f6f-9907c67eb3fa" + "'", str14, "14074747-ea2f-4c4a-8f6f-9907c67eb3fa");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        boolean boolean7 = xhrPollingReceiver5.doSendFrame("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xhrPollingReceiver5.doSendFrame("51c8742e-ccc2-4ab2-97e5-9a1ecdf36478");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.SockJsException sockJsException10 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException11 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onError((java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver19 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        int int20 = sockJsServletResponse17.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse24 = null;
        org.projectodd.sockjs.SockJsServer.Options options25 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver26 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest23, sockJsResponse24, options25);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver27 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options25);
        options25.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver31 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options25, "45c5c7f62d06fed3323f980a739ffe91");
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest33 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest32);
        java.lang.String str34 = sockJsServletRequest33.session();
        org.projectodd.sockjs.SockJsException sockJsException37 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException38 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onError((java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        javax.servlet.AsyncContext asyncContext43 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse44 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse42, asyncContext43);
        org.projectodd.sockjs.SockJsServer.Options options45 = new org.projectodd.sockjs.SockJsServer.Options();
        int int46 = options45.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver47 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest41, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options45);
        org.projectodd.sockjs.SockJsServer.Options options48 = new org.projectodd.sockjs.SockJsServer.Options();
        int int49 = options48.heartbeatDelay;
        boolean boolean50 = options48.jsessionid;
        java.lang.String str51 = options48.sockjsUrl;
        options48.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver54 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options48);
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver56 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options48, "");
        java.lang.String str58 = sockJsWebsocketRequest4.getCookie("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
        java.lang.String str59 = sockJsWebsocketRequest4.getContentType();
        java.lang.String str61 = sockJsWebsocketRequest4.getCookie("51c8742e-ccc2-4ab2-97e5-9a1ecdf36478");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25000 + "'", int46 == 25000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 25000 + "'", int49 == 25000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str51, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint7 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        org.projectodd.sockjs.SockJsRequest sockJsRequest8 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse9 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest10 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse11 = null;
        org.projectodd.sockjs.SockJsServer.Options options12 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver13 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest10, sockJsResponse11, options12);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver14 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest8, sockJsResponse9, options12);
        options12.responseLimit = (byte) -1;
        java.lang.String str17 = options12.sockjsUrl;
        int int18 = options12.responseLimit;
        java.lang.String str19 = options12.sockjsUrl;
        options12.sockjsUrl = "3ab7963e-8fca-4430-8d3d-57d50376f624";
        sockJsServer0.options = options12;
        org.projectodd.sockjs.SockJsServer sockJsServer23 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session24 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection25 = new org.projectodd.sockjs.SockJsConnection(session24);
        sockJsConnection25.prefix = "\"\"";
        sockJsConnection25.url = "\"\\\"\\\"\"";
        java.lang.String str30 = sockJsConnection25.id;
        java.lang.String str31 = sockJsConnection25.remoteAddress;
        sockJsServer23.emitConnection(sockJsConnection25);
        org.projectodd.sockjs.WebsocketHandler websocketHandler33 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer23);
        org.projectodd.sockjs.Session session34 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection35 = new org.projectodd.sockjs.SockJsConnection(session34);
        sockJsConnection35.prefix = "\"\"";
        sockJsServer23.emitConnection(sockJsConnection35);
        java.lang.String str39 = sockJsConnection35.pathname;
        sockJsServer0.emitConnection(sockJsConnection35);
        sockJsConnection35.remotePort = (-1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str17, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str19, "http://cdn.sockjs.org/sockjs-0.3.min.js");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "c63a9d6d-c3a8-48e5-9229-eac01b6d06a2" + "'", str30, "c63a9d6d-c3a8-48e5-9229-eac01b6d06a2");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.Session session11 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection12 = new org.projectodd.sockjs.SockJsConnection(session11);
        sockJsConnection12.prefix = "\"\"";
        sockJsServer0.emitConnection(sockJsConnection12);
        org.projectodd.sockjs.EventsourceHandler eventsourceHandler16 = new org.projectodd.sockjs.EventsourceHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = eventsourceHandler16.eventsource;
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = eventsourceHandler16.eventsource;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a3b4cb67-ccca-42d5-9d35-47332076d4d1" + "'", str7, "a3b4cb67-ccca-42d5-9d35-47332076d4d1");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        sockJsConnection2.emitData("4f977148-37b0-4342-89d1-5abfe8419ca4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "39756cef-f4f3-4504-948b-74773ddbf064" + "'", str7, "39756cef-f4f3-4504-948b-74773ddbf064");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.AppHandler appHandler3 = new org.projectodd.sockjs.AppHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = appHandler3.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler6 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = websocketHandler6.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer8 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer8);
        org.projectodd.sockjs.DispatchFunction dispatchFunction10 = websocketHandler9.rawWebsocket;
        websocketHandler6.rawWebsocket = dispatchFunction10;
        appHandler3.disabledTransport = dispatchFunction10;
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler3.welcomeScreen;
        jsonpHandler1.jsonp = dispatchFunction13;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler16 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = websocketHandler16.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler19 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = websocketHandler19.rawWebsocket;
        websocketHandler16.sockjsWebsocket = dispatchFunction20;
        jsonpHandler1.jsonpSend = dispatchFunction20;
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction10);
        org.junit.Assert.assertNotNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = sockJsServletRequest1.getPrefix();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = jsonpHandler1.jsonp;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler4 = new org.projectodd.sockjs.JsonpHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = jsonpHandler4.jsonp;
        org.projectodd.sockjs.DispatchFunction dispatchFunction6 = jsonpHandler4.jsonpSend;
        org.projectodd.sockjs.SockJsServer sockJsServer7 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler8 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer7);
        org.projectodd.sockjs.DispatchFunction dispatchFunction9 = websocketHandler8.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        websocketHandler8.rawWebsocket = dispatchFunction12;
        org.projectodd.sockjs.Dispatcher dispatcher14 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction6, dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction6);
        org.junit.Assert.assertNotNull(dispatchFunction9);
        org.junit.Assert.assertNotNull(dispatchFunction12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.AppHandler appHandler3 = new org.projectodd.sockjs.AppHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = appHandler3.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler6 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = websocketHandler6.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer8 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer8);
        org.projectodd.sockjs.DispatchFunction dispatchFunction10 = websocketHandler9.rawWebsocket;
        websocketHandler6.rawWebsocket = dispatchFunction10;
        appHandler3.disabledTransport = dispatchFunction10;
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler3.welcomeScreen;
        jsonpHandler1.jsonp = dispatchFunction13;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.AppHandler appHandler16 = new org.projectodd.sockjs.AppHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = appHandler16.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler19 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = websocketHandler19.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        websocketHandler19.rawWebsocket = dispatchFunction23;
        org.projectodd.sockjs.SockJsServer sockJsServer25 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler26 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer25);
        org.projectodd.sockjs.DispatchFunction dispatchFunction27 = websocketHandler26.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher28 = new org.projectodd.sockjs.Dispatcher(dispatchFunction17, dispatchFunction23, dispatchFunction27);
        jsonpHandler1.jsonp = dispatchFunction23;
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction10);
        org.junit.Assert.assertNotNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction27);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        java.lang.String str4 = sockJsConnection1.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<SockJSConnection 270619cd-5631-4bdb-b551-6a1eed52172e>" + "'", str4, "<SockJSConnection 270619cd-5631-4bdb-b551-6a1eed52172e>");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        int int6 = sockJsServletResponse3.statusCode();
        sockJsServletResponse3.cacheFor((java.lang.Integer) 1);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse3.writeHead(25000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = appHandler1.disabledTransport;
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = appHandler1.disabledTransport;
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler1.handle404;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction13);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sockJsServletRequest1.getMethod();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.remoteAddress = "3ab7963e-8fca-4430-8d3d-57d50376f624";
        java.lang.String str4 = sockJsConnection1.prefix;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsException sockJsException3 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException4 = new org.projectodd.sockjs.SockJsException((java.lang.Throwable) sockJsException3);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServlet0.log("b9dcbc6c-e66a-4859-85de-a72f4cdad117", (java.lang.Throwable) sockJsException3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.util.regex.Pattern pattern4 = null;
        dispatchEntry3.pattern = pattern4;
        java.util.regex.Pattern pattern6 = dispatchEntry3.pattern;
        java.util.regex.Pattern pattern7 = dispatchEntry3.pattern;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray10 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry11 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray10);
        dispatchEntry3.functions = dispatchFunctionArray10;
        java.util.regex.Pattern pattern13 = null;
        dispatchEntry3.pattern = pattern13;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertNotNull(dispatchFunctionArray10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        org.projectodd.sockjs.NextFilter nextFilter5 = sockJsWebsocketRequest4.nextFilter;
        java.lang.String str6 = sockJsWebsocketRequest4.getPrefix();
        org.junit.Assert.assertNull(nextFilter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str6, "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer.Options options12 = sockJsServer0.options;
        options12.responseLimit = 100;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c60fd7bd-b986-47b4-8108-c472819a4228" + "'", str7, "c60fd7bd-b986-47b4-8108-c472819a4228");
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler1 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = websocketHandler1.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        websocketHandler1.rawWebsocket = dispatchFunction5;
        org.projectodd.sockjs.SockJsServer sockJsServer7 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler8 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer7);
        org.projectodd.sockjs.DispatchFunction dispatchFunction9 = websocketHandler8.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.AppHandler appHandler11 = new org.projectodd.sockjs.AppHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = appHandler11.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer13 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler14 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer13);
        org.projectodd.sockjs.DispatchFunction dispatchFunction15 = websocketHandler14.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = websocketHandler17.rawWebsocket;
        websocketHandler14.rawWebsocket = dispatchFunction18;
        appHandler11.hSid = dispatchFunction18;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher24 = new org.projectodd.sockjs.Dispatcher(dispatchFunction9, dispatchFunction18, dispatchFunction23);
        websocketHandler1.rawWebsocket = dispatchFunction23;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction9);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction15);
        org.junit.Assert.assertNotNull(dispatchFunction18);
        org.junit.Assert.assertNotNull(dispatchFunction23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest3 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse4 = null;
        javax.servlet.AsyncContext asyncContext5 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse6 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse4, asyncContext5);
        org.projectodd.sockjs.SockJsServer.Options options7 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver8 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest3, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options7);
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        int int14 = options13.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver15 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        org.projectodd.sockjs.ResponseReceiver responseReceiver16 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse6, options13);
        org.projectodd.sockjs.Session session17 = null;
        responseReceiver16.session = session17;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25000 + "'", int14 == 25000);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletRequest httpServletRequest1 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest2 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest1);
        java.lang.String str3 = sockJsServletRequest2.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = sockJsServletRequest2.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest5 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse6 = null;
        javax.servlet.AsyncContext asyncContext7 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse8 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse6, asyncContext7);
        org.projectodd.sockjs.SockJsServer.Options options9 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver10 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest5, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse8, options9);
        int int11 = sockJsServletResponse8.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest12 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse13 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse15 = null;
        org.projectodd.sockjs.SockJsServer.Options options16 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest14, sockJsResponse15, options16);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver18 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest12, sockJsResponse13, options16);
        options16.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest2, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse8, options16);
        sockJsServletResponse8.statusCode((int) (short) 100);
        org.projectodd.sockjs.SockJsServer.Options options24 = new org.projectodd.sockjs.SockJsServer.Options();
        int int25 = options24.heartbeatDelay;
        boolean boolean26 = options24.jsessionid;
        java.lang.String str27 = options24.sockjsUrl;
        options24.jsessionid = false;
        org.projectodd.sockjs.XhrStreamingReceiver xhrStreamingReceiver30 = new org.projectodd.sockjs.XhrStreamingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse8, options24);
        boolean boolean32 = xhrStreamingReceiver30.doSendFrame("\"hi!\"");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dispatchFunction4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 25000 + "'", int25 == 25000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str27, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler1 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = websocketHandler1.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        websocketHandler1.rawWebsocket = dispatchFunction5;
        org.projectodd.sockjs.SockJsServer sockJsServer7 = null;
        org.projectodd.sockjs.AppHandler appHandler8 = new org.projectodd.sockjs.AppHandler(sockJsServer7);
        org.projectodd.sockjs.DispatchFunction dispatchFunction9 = appHandler8.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer13 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler14 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer13);
        org.projectodd.sockjs.DispatchFunction dispatchFunction15 = websocketHandler14.rawWebsocket;
        websocketHandler11.rawWebsocket = dispatchFunction15;
        appHandler8.hSid = dispatchFunction15;
        org.projectodd.sockjs.SockJsServer sockJsServer18 = null;
        org.projectodd.sockjs.AppHandler appHandler19 = new org.projectodd.sockjs.AppHandler(sockJsServer18);
        org.projectodd.sockjs.DispatchFunction dispatchFunction20 = appHandler19.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer24 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler25 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer24);
        org.projectodd.sockjs.DispatchFunction dispatchFunction26 = websocketHandler25.rawWebsocket;
        websocketHandler22.rawWebsocket = dispatchFunction26;
        appHandler19.disabledTransport = dispatchFunction26;
        org.projectodd.sockjs.DispatchFunction dispatchFunction29 = appHandler19.welcomeScreen;
        appHandler8.hSid = dispatchFunction29;
        org.projectodd.sockjs.DispatchFunction dispatchFunction31 = appHandler8.hSid;
        websocketHandler1.sockjsWebsocket = dispatchFunction31;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction9);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction15);
        org.junit.Assert.assertNotNull(dispatchFunction20);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction26);
        org.junit.Assert.assertNotNull(dispatchFunction29);
        org.junit.Assert.assertNotNull(dispatchFunction31);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        boolean boolean8 = sockJsServletResponse7.finished();
        int int9 = sockJsServletResponse7.statusCode();
        boolean boolean10 = sockJsServletResponse7.finished();
        org.projectodd.sockjs.SockJsServer sockJsServer11 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler12 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer11);
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        javax.servlet.AsyncContext asyncContext15 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse16 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse14, asyncContext15);
        org.projectodd.sockjs.SockJsServer.Options options17 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver18 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest13, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse16, options17);
        sockJsServer11.options = options17;
        java.lang.String str20 = options17.sockjsUrl;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options17);
        java.lang.String str22 = sockJsWebsocketRequest4.getMethod();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str20, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GET" + "'", str22, "GET");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        org.projectodd.sockjs.DispatchException dispatchException2 = new org.projectodd.sockjs.DispatchException(10, "\"\"");
        org.projectodd.sockjs.SockJsException sockJsException3 = new org.projectodd.sockjs.SockJsException((java.lang.Throwable) dispatchException2);
        java.lang.String str4 = dispatchException2.message;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest.OnEndHandler onEndHandler4 = null;
        sockJsServletRequest1.onEnd(onEndHandler4);
        org.projectodd.sockjs.SockJsRequest sockJsRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        javax.servlet.AsyncContext asyncContext8 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse9 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse7, asyncContext8);
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        int int11 = options10.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver12 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options10);
        java.lang.Integer int13 = sockJsServletResponse9.cacheFor();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        int int19 = options18.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = sockJsServletRequest1.getQueryParameter("67548571-522d-4935-80ae-c24937f24372");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25000 + "'", int11 == 25000);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        appHandler1.disabledTransport = dispatchFunction8;
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = appHandler1.handle404;
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = appHandler1.disabledTransport;
        org.projectodd.sockjs.SockJsServer sockJsServer13 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler14 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer13);
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler16 = new org.projectodd.sockjs.IframeHandler(sockJsServer15);
        org.projectodd.sockjs.DispatchFunction dispatchFunction17 = iframeHandler16.iframe;
        htmlfileHandler14.htmlfile = dispatchFunction17;
        org.projectodd.sockjs.SockJsServer sockJsServer19 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler20 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer19);
        org.projectodd.sockjs.DispatchFunction dispatchFunction21 = websocketHandler20.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        websocketHandler20.sockjsWebsocket = dispatchFunction24;
        org.projectodd.sockjs.Dispatcher dispatcher26 = new org.projectodd.sockjs.Dispatcher(dispatchFunction12, dispatchFunction17, dispatchFunction24);
        javax.websocket.Session session27 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest31 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session27, "\"hi!\"", "c[1,\"\"]", strMap30);
        javax.servlet.http.HttpServletResponse httpServletResponse32 = null;
        javax.servlet.AsyncContext asyncContext33 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse34 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse32, asyncContext33);
        boolean boolean35 = sockJsServletResponse34.finished();
        int int36 = sockJsServletResponse34.statusCode();
        boolean boolean37 = sockJsServletResponse34.finished();
        org.projectodd.sockjs.SockJsServer sockJsServer38 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler39 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer38);
        org.projectodd.sockjs.SockJsRequest sockJsRequest40 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse41 = null;
        javax.servlet.AsyncContext asyncContext42 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse43 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse41, asyncContext42);
        org.projectodd.sockjs.SockJsServer.Options options44 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver45 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest40, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse43, options44);
        sockJsServer38.options = options44;
        java.lang.String str47 = options44.sockjsUrl;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver48 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest31, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse34, options44);
        javax.servlet.http.HttpServletRequest httpServletRequest49 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest50 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest49);
        java.lang.String str51 = sockJsServletRequest50.session();
        org.projectodd.sockjs.SockJsRequest sockJsRequest52 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse53 = null;
        javax.servlet.AsyncContext asyncContext54 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse55 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse53, asyncContext54);
        org.projectodd.sockjs.SockJsServer.Options options56 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver57 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest52, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse55, options56);
        org.projectodd.sockjs.SockJsRequest sockJsRequest58 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse59 = null;
        javax.servlet.AsyncContext asyncContext60 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse61 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse59, asyncContext60);
        org.projectodd.sockjs.SockJsServer.Options options62 = new org.projectodd.sockjs.SockJsServer.Options();
        int int63 = options62.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver64 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest58, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse61, options62);
        org.projectodd.sockjs.ResponseReceiver responseReceiver65 = new org.projectodd.sockjs.ResponseReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest50, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse55, options62);
        // The following exception was thrown during execution in test generation
        try {
            dispatcher26.dispatch((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest31, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction21);
        org.junit.Assert.assertNotNull(dispatchFunction24);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str47, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 25000 + "'", int63 == 25000);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher13 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction8, dispatchFunction12);
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = websocketHandler17.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer19 = null;
        org.projectodd.sockjs.AppHandler appHandler20 = new org.projectodd.sockjs.AppHandler(sockJsServer19);
        org.projectodd.sockjs.DispatchFunction dispatchFunction21 = appHandler20.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer25 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler26 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer25);
        org.projectodd.sockjs.DispatchFunction dispatchFunction27 = websocketHandler26.rawWebsocket;
        websocketHandler23.rawWebsocket = dispatchFunction27;
        appHandler20.hSid = dispatchFunction27;
        org.projectodd.sockjs.SockJsServer sockJsServer30 = null;
        org.projectodd.sockjs.AppHandler appHandler31 = new org.projectodd.sockjs.AppHandler(sockJsServer30);
        org.projectodd.sockjs.DispatchFunction dispatchFunction32 = appHandler31.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer33 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler34 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer33);
        org.projectodd.sockjs.DispatchFunction dispatchFunction35 = websocketHandler34.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer36 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler37 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer36);
        org.projectodd.sockjs.DispatchFunction dispatchFunction38 = websocketHandler37.rawWebsocket;
        websocketHandler34.rawWebsocket = dispatchFunction38;
        appHandler31.disabledTransport = dispatchFunction38;
        org.projectodd.sockjs.DispatchFunction dispatchFunction41 = appHandler31.welcomeScreen;
        appHandler20.hSid = dispatchFunction41;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray43 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction18, dispatchFunction41 };
        dispatcher13.push("http://cdn.sockjs.org/sockjs-0.3.min.js", "\"hi!\"", dispatchFunctionArray43);
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray48 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry49 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray48);
        java.lang.String str50 = dispatchEntry49.method;
        dispatchEntry49.method = "org.projectodd.sockjs.SockJsException";
        java.lang.String[] strArray53 = dispatchEntry49.groups;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray56 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry57 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray56);
        // The following exception was thrown during execution in test generation
        try {
            dispatcher13.push("", strArray53, dispatchFunctionArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction18);
        org.junit.Assert.assertNotNull(dispatchFunction21);
        org.junit.Assert.assertNotNull(dispatchFunction24);
        org.junit.Assert.assertNotNull(dispatchFunction27);
        org.junit.Assert.assertNotNull(dispatchFunction32);
        org.junit.Assert.assertNotNull(dispatchFunction35);
        org.junit.Assert.assertNotNull(dispatchFunction38);
        org.junit.Assert.assertNotNull(dispatchFunction41);
        org.junit.Assert.assertNotNull(dispatchFunctionArray43);
        org.junit.Assert.assertNotNull(dispatchFunctionArray48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(dispatchFunctionArray56);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        org.projectodd.sockjs.Transport.OPEN = (byte) 100;
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse1 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest2 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse3 = null;
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver5 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest2, sockJsResponse3, options4);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver6 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest0, sockJsResponse1, options4);
        options4.responseLimit = (byte) -1;
        java.lang.String str9 = options4.sockjsUrl;
        int int10 = options4.responseLimit;
        options4.sockjsUrl = "org.projectodd.sockjs.SockJsException";
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str9, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.Session session11 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection12 = new org.projectodd.sockjs.SockJsConnection(session11);
        sockJsConnection12.prefix = "\"\"";
        sockJsServer0.emitConnection(sockJsConnection12);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServer0.destroy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0c97cb2a-a5d0-4d6f-adfe-82b383d5ce19" + "'", str7, "0c97cb2a-a5d0-4d6f-adfe-82b383d5ce19");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        org.projectodd.sockjs.NextFilter nextFilter5 = sockJsWebsocketRequest4.nextFilter;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer6.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint10 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer6, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint13 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer6, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse15 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest16 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse17 = null;
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver19 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest16, sockJsResponse17, options18);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver20 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest14, sockJsResponse15, options18);
        options18.responseLimit = (byte) -1;
        java.lang.String str23 = options18.sockjsUrl;
        int int24 = options18.responseLimit;
        java.lang.String str25 = options18.sockjsUrl;
        options18.sockjsUrl = "3ab7963e-8fca-4430-8d3d-57d50376f624";
        sockJsServer6.options = options18;
        org.projectodd.sockjs.SockJsRequest sockJsRequest29 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse30 = null;
        javax.servlet.AsyncContext asyncContext31 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse32 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse30, asyncContext31);
        org.projectodd.sockjs.SockJsServer.Options options33 = new org.projectodd.sockjs.SockJsServer.Options();
        int int34 = options33.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver35 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest29, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse32, options33);
        boolean boolean37 = eventSourceReceiver35.doSendFrame("37ac3634-8cd4-4bba-a4f8-267eda290b3e");
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session38 = org.projectodd.sockjs.Transport.registerNoSession((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, sockJsServer6, (org.projectodd.sockjs.GenericReceiver) eventSourceReceiver35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nextFilter5);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str23, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str25, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 25000 + "'", int34 == 25000);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        sockJsServer0.init();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d07a1d04-681b-4809-9359-21ca89385b90" + "'", str7, "d07a1d04-681b-4809-9359-21ca89385b90");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = sockJsServletRequest1.getUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) -1 };
        org.projectodd.sockjs.Buffer buffer3 = new org.projectodd.sockjs.Buffer(byteArray2);
        org.projectodd.sockjs.Buffer buffer4 = new org.projectodd.sockjs.Buffer(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, -1]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest9 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse10 = null;
        javax.servlet.AsyncContext asyncContext11 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse12 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse10, asyncContext11);
        org.projectodd.sockjs.SockJsServer.Options options13 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver14 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest9, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options13);
        int int15 = sockJsServletResponse12.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest16 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse17 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest18 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse19 = null;
        org.projectodd.sockjs.SockJsServer.Options options20 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest18, sockJsResponse19, options20);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver22 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest16, sockJsResponse17, options20);
        options20.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver26 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse12, options20, "45c5c7f62d06fed3323f980a739ffe91");
        org.projectodd.sockjs.DispatchException dispatchException29 = new org.projectodd.sockjs.DispatchException(0, "3ab7963e-8fca-4430-8d3d-57d50376f624");
        sockJsServletRequest1.onError((java.lang.Throwable) dispatchException29);
        org.projectodd.sockjs.DispatchException dispatchException33 = new org.projectodd.sockjs.DispatchException(10, "\"\"");
        sockJsServletRequest1.onError((java.lang.Throwable) dispatchException33);
        org.projectodd.sockjs.SockJsRequest.OnDataHandler onDataHandler35 = null;
        sockJsServletRequest1.onData(onDataHandler35);
        org.projectodd.sockjs.SockJsRequest.OnDataHandler onDataHandler37 = null;
        sockJsServletRequest1.onData(onDataHandler37);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap3);
        java.lang.String str5 = sockJsWebsocketRequest4.getPrefix();
        org.projectodd.sockjs.SockJsRequest sockJsRequest6 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse7 = null;
        javax.servlet.AsyncContext asyncContext8 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse9 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse7, asyncContext8);
        org.projectodd.sockjs.SockJsServer.Options options10 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver11 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options10);
        int int12 = sockJsServletResponse9.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        javax.servlet.AsyncContext asyncContext15 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse16 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse14, asyncContext15);
        org.projectodd.sockjs.SockJsServer.Options options17 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver18 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest13, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse16, options17);
        options17.jsessionid = false;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver21 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse9, options17);
        java.lang.Integer int22 = sockJsServletResponse9.cacheFor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str5, "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletRequest1.onDataAvailable();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler1 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session3 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection4 = new org.projectodd.sockjs.SockJsConnection(session3);
        sockJsConnection4.prefix = "\"\"";
        sockJsConnection4.url = "\"\\\"\\\"\"";
        java.lang.String str9 = sockJsConnection4.id;
        java.lang.String str10 = sockJsConnection4.remoteAddress;
        sockJsServer2.emitConnection(sockJsConnection4);
        org.projectodd.sockjs.WebsocketHandler websocketHandler12 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer2);
        org.projectodd.sockjs.Session session13 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection14 = new org.projectodd.sockjs.SockJsConnection(session13);
        sockJsConnection14.prefix = "\"\"";
        sockJsServer2.emitConnection(sockJsConnection14);
        java.lang.String str18 = sockJsConnection14.pathname;
        java.lang.String str19 = sockJsConnection14.toString();
        sockJsServer0.emitConnection(sockJsConnection14);
        sockJsConnection14.url = "<SockJSConnection 325d0bee-caf7-47aa-a040-4e3ef5c9d7e0>";
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "34e8876a-cf04-4cf7-8bda-1656969da7b3" + "'", str9, "34e8876a-cf04-4cf7-8bda-1656969da7b3");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<SockJSConnection 4a85a4b4-5924-4ac7-847c-febef76b01e9>" + "'", str19, "<SockJSConnection 4a85a4b4-5924-4ac7-847c-febef76b01e9>");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.SockJsException sockJsException10 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException11 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onError((java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver19 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        int int20 = sockJsServletResponse17.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse24 = null;
        org.projectodd.sockjs.SockJsServer.Options options25 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver26 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest23, sockJsResponse24, options25);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver27 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options25);
        options25.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver31 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options25, "45c5c7f62d06fed3323f980a739ffe91");
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest33 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest32);
        java.lang.String str34 = sockJsServletRequest33.session();
        org.projectodd.sockjs.SockJsException sockJsException37 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException38 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onError((java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        javax.servlet.AsyncContext asyncContext43 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse44 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse42, asyncContext43);
        org.projectodd.sockjs.SockJsServer.Options options45 = new org.projectodd.sockjs.SockJsServer.Options();
        int int46 = options45.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver47 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest41, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options45);
        org.projectodd.sockjs.SockJsServer.Options options48 = new org.projectodd.sockjs.SockJsServer.Options();
        int int49 = options48.heartbeatDelay;
        boolean boolean50 = options48.jsessionid;
        java.lang.String str51 = options48.sockjsUrl;
        options48.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver54 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options48);
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver56 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options48, "");
        java.lang.String str58 = sockJsWebsocketRequest4.getCookie("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = sockJsWebsocketRequest4.getHeader("7e8ac891-f731-4ea9-a4e8-9844b7eb3d52");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25000 + "'", int46 == 25000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 25000 + "'", int49 == 25000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str51, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        sockJsConnection1.headers = strMap5;
        sockJsConnection1.protocol = "GET";
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.SockJsException sockJsException10 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException11 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onError((java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver19 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        int int20 = sockJsServletResponse17.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse24 = null;
        org.projectodd.sockjs.SockJsServer.Options options25 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver26 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest23, sockJsResponse24, options25);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver27 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options25);
        options25.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver31 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options25, "45c5c7f62d06fed3323f980a739ffe91");
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest33 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest32);
        java.lang.String str34 = sockJsServletRequest33.session();
        org.projectodd.sockjs.SockJsException sockJsException37 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException38 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onError((java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        javax.servlet.AsyncContext asyncContext43 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse44 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse42, asyncContext43);
        org.projectodd.sockjs.SockJsServer.Options options45 = new org.projectodd.sockjs.SockJsServer.Options();
        int int46 = options45.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver47 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest41, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options45);
        org.projectodd.sockjs.SockJsServer.Options options48 = new org.projectodd.sockjs.SockJsServer.Options();
        int int49 = options48.heartbeatDelay;
        boolean boolean50 = options48.jsessionid;
        java.lang.String str51 = options48.sockjsUrl;
        options48.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver54 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options48);
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver56 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options48, "");
        java.lang.String str58 = sockJsWebsocketRequest4.getCookie("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
        org.projectodd.sockjs.DispatchFunction dispatchFunction59 = sockJsWebsocketRequest4.lastFunction;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = sockJsWebsocketRequest4.getPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25000 + "'", int46 == 25000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 25000 + "'", int49 == 25000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str51, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(dispatchFunction59);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        java.lang.String str1 = org.projectodd.sockjs.Utils.quote("39756cef-f4f3-4504-948b-74773ddbf064");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"39756cef-f4f3-4504-948b-74773ddbf064\"" + "'", str1, "\"39756cef-f4f3-4504-948b-74773ddbf064\"");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.util.regex.Pattern pattern4 = null;
        dispatchEntry3.pattern = pattern4;
        java.util.regex.Pattern pattern6 = dispatchEntry3.pattern;
        java.util.regex.Pattern pattern7 = dispatchEntry3.pattern;
        java.util.regex.Pattern pattern8 = dispatchEntry3.pattern;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        org.projectodd.sockjs.DispatchException dispatchException2 = new org.projectodd.sockjs.DispatchException(10, "\"\"");
        java.lang.String str3 = dispatchException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.projectodd.sockjs.DispatchException" + "'", str3, "org.projectodd.sockjs.DispatchException");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        sockJsConnection1.remotePort = 0;
        sockJsConnection1.emitClose();
        org.projectodd.sockjs.Session session8 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection9 = new org.projectodd.sockjs.SockJsConnection(session8);
        sockJsConnection9.prefix = "\"\"";
        sockJsConnection9.url = "\"\\\"\\\"\"";
        java.lang.String str14 = sockJsConnection9.id;
        java.lang.String str15 = sockJsConnection9.remoteAddress;
        java.lang.String str16 = sockJsConnection9.id;
        sockJsConnection9.emitClose();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = sockJsConnection9.headers;
        sockJsConnection1.headers = strMap18;
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "7b395ddf-ef40-4cb0-9c91-4624726e139a" + "'", str14, "7b395ddf-ef40-4cb0-9c91-4624726e139a");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "7b395ddf-ef40-4cb0-9c91-4624726e139a" + "'", str16, "7b395ddf-ef40-4cb0-9c91-4624726e139a");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver5 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        boolean boolean7 = xhrPollingReceiver5.doSendFrame("\"9d4568c009d203ab10e33ea9953a0264\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xhrPollingReceiver5.doSendFrame("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.remoteAddress = "3ab7963e-8fca-4430-8d3d-57d50376f624";
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Transport.READY_STATE rEADY_STATE4 = sockJsConnection1.getReadyState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        org.projectodd.sockjs.DispatchException dispatchException1 = new org.projectodd.sockjs.DispatchException(10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        sockJsConnection1.id = "fb5841bb-8127-4cb1-a3e0-b7ff4a96a7fc";
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = chunkingHandler11.infoOptions;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2c0bfe18-0a34-4cb7-acfb-3a5e3abfb794" + "'", str7, "2c0bfe18-0a34-4cb7-acfb-3a5e3abfb794");
        org.junit.Assert.assertNotNull(dispatchFunction12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer.Options options12 = sockJsServer0.options;
        org.projectodd.sockjs.XhrHandler xhrHandler13 = new org.projectodd.sockjs.XhrHandler(sockJsServer0);
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint16 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "", "<SockJSConnection 4a85a4b4-5924-4ac7-847c-febef76b01e9>");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "091cb72b-eb00-4d06-bd78-924a297ca004" + "'", str7, "091cb72b-eb00-4d06-bd78-924a297ca004");
        org.junit.Assert.assertNotNull(options12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        boolean boolean8 = eventSourceReceiver6.doSendFrame("\"9d4568c009d203ab10e33ea9953a0264\"");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = eventSourceReceiver6.doSendFrame("3ab7963e-8fca-4430-8d3d-57d50376f624");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.ChunkingHandler chunkingHandler1 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer2 = null;
        org.projectodd.sockjs.AppHandler appHandler3 = new org.projectodd.sockjs.AppHandler(sockJsServer2);
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = appHandler3.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler6 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = websocketHandler6.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer8 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler9 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer8);
        org.projectodd.sockjs.DispatchFunction dispatchFunction10 = websocketHandler9.rawWebsocket;
        websocketHandler6.rawWebsocket = dispatchFunction10;
        appHandler3.disabledTransport = dispatchFunction10;
        org.projectodd.sockjs.DispatchFunction dispatchFunction13 = appHandler3.handle404;
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = appHandler3.disabledTransport;
        org.projectodd.sockjs.SockJsServer sockJsServer15 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler16 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer15);
        org.projectodd.sockjs.SockJsServer sockJsServer17 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler18 = new org.projectodd.sockjs.IframeHandler(sockJsServer17);
        org.projectodd.sockjs.DispatchFunction dispatchFunction19 = iframeHandler18.iframe;
        htmlfileHandler16.htmlfile = dispatchFunction19;
        org.projectodd.sockjs.SockJsServer sockJsServer21 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler22 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer21);
        org.projectodd.sockjs.DispatchFunction dispatchFunction23 = websocketHandler22.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer24 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler25 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer24);
        org.projectodd.sockjs.DispatchFunction dispatchFunction26 = websocketHandler25.rawWebsocket;
        websocketHandler22.sockjsWebsocket = dispatchFunction26;
        org.projectodd.sockjs.Dispatcher dispatcher28 = new org.projectodd.sockjs.Dispatcher(dispatchFunction14, dispatchFunction19, dispatchFunction26);
        chunkingHandler1.infoOptions = dispatchFunction14;
        org.junit.Assert.assertNotNull(dispatchFunction4);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction10);
        org.junit.Assert.assertNotNull(dispatchFunction13);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction19);
        org.junit.Assert.assertNotNull(dispatchFunction23);
        org.junit.Assert.assertNotNull(dispatchFunction26);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer6 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler7 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer6);
        org.projectodd.sockjs.DispatchFunction dispatchFunction8 = websocketHandler7.rawWebsocket;
        websocketHandler4.rawWebsocket = dispatchFunction8;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler11 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = websocketHandler11.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher13 = new org.projectodd.sockjs.Dispatcher(dispatchFunction2, dispatchFunction8, dispatchFunction12);
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = websocketHandler17.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer19 = null;
        org.projectodd.sockjs.AppHandler appHandler20 = new org.projectodd.sockjs.AppHandler(sockJsServer19);
        org.projectodd.sockjs.DispatchFunction dispatchFunction21 = appHandler20.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer22 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler23 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer22);
        org.projectodd.sockjs.DispatchFunction dispatchFunction24 = websocketHandler23.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer25 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler26 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer25);
        org.projectodd.sockjs.DispatchFunction dispatchFunction27 = websocketHandler26.rawWebsocket;
        websocketHandler23.rawWebsocket = dispatchFunction27;
        appHandler20.hSid = dispatchFunction27;
        org.projectodd.sockjs.SockJsServer sockJsServer30 = null;
        org.projectodd.sockjs.AppHandler appHandler31 = new org.projectodd.sockjs.AppHandler(sockJsServer30);
        org.projectodd.sockjs.DispatchFunction dispatchFunction32 = appHandler31.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer33 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler34 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer33);
        org.projectodd.sockjs.DispatchFunction dispatchFunction35 = websocketHandler34.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer36 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler37 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer36);
        org.projectodd.sockjs.DispatchFunction dispatchFunction38 = websocketHandler37.rawWebsocket;
        websocketHandler34.rawWebsocket = dispatchFunction38;
        appHandler31.disabledTransport = dispatchFunction38;
        org.projectodd.sockjs.DispatchFunction dispatchFunction41 = appHandler31.welcomeScreen;
        appHandler20.hSid = dispatchFunction41;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray43 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction18, dispatchFunction41 };
        dispatcher13.push("http://cdn.sockjs.org/sockjs-0.3.min.js", "\"hi!\"", dispatchFunctionArray43);
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray48 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry49 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray48);
        java.lang.String str50 = dispatchEntry49.method;
        dispatchEntry49.method = "org.projectodd.sockjs.SockJsException";
        java.lang.String[] strArray53 = dispatchEntry49.groups;
        org.projectodd.sockjs.SockJsServer sockJsServer54 = null;
        org.projectodd.sockjs.AppHandler appHandler55 = new org.projectodd.sockjs.AppHandler(sockJsServer54);
        org.projectodd.sockjs.DispatchFunction dispatchFunction56 = appHandler55.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer57 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler58 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer57);
        org.projectodd.sockjs.DispatchFunction dispatchFunction59 = websocketHandler58.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer60 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler61 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer60);
        org.projectodd.sockjs.DispatchFunction dispatchFunction62 = websocketHandler61.rawWebsocket;
        websocketHandler58.rawWebsocket = dispatchFunction62;
        org.projectodd.sockjs.SockJsServer sockJsServer64 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler65 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer64);
        org.projectodd.sockjs.DispatchFunction dispatchFunction66 = websocketHandler65.rawWebsocket;
        org.projectodd.sockjs.Dispatcher dispatcher67 = new org.projectodd.sockjs.Dispatcher(dispatchFunction56, dispatchFunction62, dispatchFunction66);
        org.projectodd.sockjs.SockJsServer sockJsServer70 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler71 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer70);
        org.projectodd.sockjs.DispatchFunction dispatchFunction72 = websocketHandler71.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer73 = null;
        org.projectodd.sockjs.AppHandler appHandler74 = new org.projectodd.sockjs.AppHandler(sockJsServer73);
        org.projectodd.sockjs.DispatchFunction dispatchFunction75 = appHandler74.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer76 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler77 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer76);
        org.projectodd.sockjs.DispatchFunction dispatchFunction78 = websocketHandler77.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer79 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler80 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer79);
        org.projectodd.sockjs.DispatchFunction dispatchFunction81 = websocketHandler80.rawWebsocket;
        websocketHandler77.rawWebsocket = dispatchFunction81;
        appHandler74.hSid = dispatchFunction81;
        org.projectodd.sockjs.SockJsServer sockJsServer84 = null;
        org.projectodd.sockjs.AppHandler appHandler85 = new org.projectodd.sockjs.AppHandler(sockJsServer84);
        org.projectodd.sockjs.DispatchFunction dispatchFunction86 = appHandler85.hSid;
        org.projectodd.sockjs.SockJsServer sockJsServer87 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler88 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer87);
        org.projectodd.sockjs.DispatchFunction dispatchFunction89 = websocketHandler88.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer90 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler91 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer90);
        org.projectodd.sockjs.DispatchFunction dispatchFunction92 = websocketHandler91.rawWebsocket;
        websocketHandler88.rawWebsocket = dispatchFunction92;
        appHandler85.disabledTransport = dispatchFunction92;
        org.projectodd.sockjs.DispatchFunction dispatchFunction95 = appHandler85.welcomeScreen;
        appHandler74.hSid = dispatchFunction95;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray97 = new org.projectodd.sockjs.DispatchFunction[] { dispatchFunction72, dispatchFunction95 };
        dispatcher67.push("http://cdn.sockjs.org/sockjs-0.3.min.js", "\"hi!\"", dispatchFunctionArray97);
        // The following exception was thrown during execution in test generation
        try {
            dispatcher13.push("a3b4cb67-ccca-42d5-9d35-47332076d4d1", strArray53, dispatchFunctionArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction8);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction18);
        org.junit.Assert.assertNotNull(dispatchFunction21);
        org.junit.Assert.assertNotNull(dispatchFunction24);
        org.junit.Assert.assertNotNull(dispatchFunction27);
        org.junit.Assert.assertNotNull(dispatchFunction32);
        org.junit.Assert.assertNotNull(dispatchFunction35);
        org.junit.Assert.assertNotNull(dispatchFunction38);
        org.junit.Assert.assertNotNull(dispatchFunction41);
        org.junit.Assert.assertNotNull(dispatchFunctionArray43);
        org.junit.Assert.assertNotNull(dispatchFunctionArray48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(dispatchFunction56);
        org.junit.Assert.assertNotNull(dispatchFunction59);
        org.junit.Assert.assertNotNull(dispatchFunction62);
        org.junit.Assert.assertNotNull(dispatchFunction66);
        org.junit.Assert.assertNotNull(dispatchFunction72);
        org.junit.Assert.assertNotNull(dispatchFunction75);
        org.junit.Assert.assertNotNull(dispatchFunction78);
        org.junit.Assert.assertNotNull(dispatchFunction81);
        org.junit.Assert.assertNotNull(dispatchFunction86);
        org.junit.Assert.assertNotNull(dispatchFunction89);
        org.junit.Assert.assertNotNull(dispatchFunction92);
        org.junit.Assert.assertNotNull(dispatchFunction95);
        org.junit.Assert.assertNotNull(dispatchFunctionArray97);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.ChunkingHandler chunkingHandler1 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = chunkingHandler1.info;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler4 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer3);
        org.projectodd.sockjs.SockJsServer sockJsServer5 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler6 = new org.projectodd.sockjs.IframeHandler(sockJsServer5);
        org.projectodd.sockjs.DispatchFunction dispatchFunction7 = iframeHandler6.iframe;
        htmlfileHandler4.htmlfile = dispatchFunction7;
        chunkingHandler1.info = dispatchFunction7;
        org.projectodd.sockjs.SockJsServer sockJsServer10 = null;
        org.projectodd.sockjs.AppHandler appHandler11 = new org.projectodd.sockjs.AppHandler(sockJsServer10);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = appHandler11.handle404;
        chunkingHandler1.infoOptions = dispatchFunction12;
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = chunkingHandler1.info;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction7);
        org.junit.Assert.assertNotNull(dispatchFunction12);
        org.junit.Assert.assertNotNull(dispatchFunction14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.Session session11 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection12 = new org.projectodd.sockjs.SockJsConnection(session11);
        sockJsConnection12.prefix = "\"\"";
        sockJsServer0.emitConnection(sockJsConnection12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = sockJsConnection12.close((int) (short) 10, "f7924490-db75-43b3-9539-21d620010744");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f26b1463-94a4-4890-aadb-71f5d7792a30" + "'", str7, "f26b1463-94a4-4890-aadb-71f5d7792a30");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        javax.websocket.Session session5 = null;
        org.projectodd.sockjs.SockJsException sockJsException7 = new org.projectodd.sockjs.SockJsException("hi!");
        sockJsEndpoint4.onError(session5, (java.lang.Throwable) sockJsException7);
        javax.websocket.Session session9 = null;
        org.projectodd.sockjs.DispatchException dispatchException12 = new org.projectodd.sockjs.DispatchException(10, "\"\"");
        int int13 = dispatchException12.status;
        sockJsEndpoint4.onError(session9, (java.lang.Throwable) dispatchException12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        boolean boolean8 = sockJsServletResponse7.finished();
        int int9 = sockJsServletResponse7.statusCode();
        boolean boolean10 = sockJsServletResponse7.finished();
        org.projectodd.sockjs.SockJsServer sockJsServer11 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler12 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer11);
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        javax.servlet.AsyncContext asyncContext15 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse16 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse14, asyncContext15);
        org.projectodd.sockjs.SockJsServer.Options options17 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver18 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest13, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse16, options17);
        sockJsServer11.options = options17;
        java.lang.String str20 = options17.sockjsUrl;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options17);
        int int22 = sockJsWebsocketRequest4.getRemotePort();
        javax.websocket.Session session23 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap26 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest27 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session23, "\"hi!\"", "c[1,\"\"]", strMap26);
        javax.servlet.http.HttpServletResponse httpServletResponse28 = null;
        javax.servlet.AsyncContext asyncContext29 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse30 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse28, asyncContext29);
        boolean boolean31 = sockJsServletResponse30.finished();
        int int32 = sockJsServletResponse30.statusCode();
        boolean boolean33 = sockJsServletResponse30.finished();
        org.projectodd.sockjs.SockJsServer sockJsServer34 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler35 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer34);
        org.projectodd.sockjs.SockJsRequest sockJsRequest36 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse37 = null;
        javax.servlet.AsyncContext asyncContext38 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse39 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse37, asyncContext38);
        org.projectodd.sockjs.SockJsServer.Options options40 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver41 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest36, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse39, options40);
        sockJsServer34.options = options40;
        java.lang.String str43 = options40.sockjsUrl;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver44 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest27, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse30, options40);
        org.projectodd.sockjs.SockJsServer sockJsServer45 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session46 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection47 = new org.projectodd.sockjs.SockJsConnection(session46);
        sockJsConnection47.prefix = "\"\"";
        sockJsConnection47.url = "\"\\\"\\\"\"";
        java.lang.String str52 = sockJsConnection47.id;
        sockJsConnection47.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer45.emitConnection(sockJsConnection47);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler56 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer45);
        org.projectodd.sockjs.SockJsServer.Options options57 = sockJsServer45.options;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver59 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse30, options57, "\"d3c27a3b-df3d-49b0-b43f-a93d6fde76b3\"");
        int int60 = sockJsServletResponse30.statusCode();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str20, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 200 + "'", int32 == 200);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str43, "http://cdn.sockjs.org/sockjs-0.3.min.js");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "5c25b3ba-1dcc-4fca-92a4-4c1baeec2403" + "'", str52, "5c25b3ba-1dcc-4fca-92a4-4c1baeec2403");
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.AppHandler appHandler1 = new org.projectodd.sockjs.AppHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = appHandler1.welcomeScreen;
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = appHandler1.handle404;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction3);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        java.lang.String str5 = sockJsConnection1.url;
        int int6 = sockJsConnection1.remotePort;
        java.lang.String str7 = sockJsConnection1.protocol;
        sockJsConnection1.emitClose();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        java.lang.String str5 = sockJsConnection1.url;
        java.lang.String str6 = sockJsConnection1.prefix;
        java.lang.String str7 = sockJsConnection1.url;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.remoteAddress;
        java.lang.String str8 = sockJsConnection1.id;
        sockJsConnection1.pathname = "\"hi!\"";
        java.lang.String str11 = sockJsConnection1.url;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7b506d62-43fb-4ada-9b3d-0dc87fbe01d7" + "'", str6, "7b506d62-43fb-4ada-9b3d-0dc87fbe01d7");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7b506d62-43fb-4ada-9b3d-0dc87fbe01d7" + "'", str8, "7b506d62-43fb-4ada-9b3d-0dc87fbe01d7");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        java.lang.String str8 = sockJsConnection2.remoteAddress;
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.Session session11 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection12 = new org.projectodd.sockjs.SockJsConnection(session11);
        sockJsConnection12.prefix = "\"\"";
        sockJsServer0.emitConnection(sockJsConnection12);
        org.projectodd.sockjs.EventsourceHandler eventsourceHandler16 = new org.projectodd.sockjs.EventsourceHandler(sockJsServer0);
        org.projectodd.sockjs.WebsocketHandler websocketHandler17 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51800139-2acc-4bbe-8533-b07993ef8f1c" + "'", str7, "51800139-2acc-4bbe-8533-b07993ef8f1c");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        boolean boolean8 = sockJsServletResponse7.finished();
        int int9 = sockJsServletResponse7.statusCode();
        boolean boolean10 = sockJsServletResponse7.finished();
        org.projectodd.sockjs.SockJsServer sockJsServer11 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler12 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer11);
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        javax.servlet.AsyncContext asyncContext15 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse16 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse14, asyncContext15);
        org.projectodd.sockjs.SockJsServer.Options options17 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver18 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest13, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse16, options17);
        sockJsServer11.options = options17;
        java.lang.String str20 = options17.sockjsUrl;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options17);
        int int22 = sockJsWebsocketRequest4.getRemotePort();
        org.projectodd.sockjs.NextFilter nextFilter23 = null;
        sockJsWebsocketRequest4.nextFilter = nextFilter23;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str20, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler1 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = websocketHandler1.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer3 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler4 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer3);
        org.projectodd.sockjs.DispatchFunction dispatchFunction5 = websocketHandler4.rawWebsocket;
        websocketHandler1.rawWebsocket = dispatchFunction5;
        org.projectodd.sockjs.SockJsServer sockJsServer7 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler8 = new org.projectodd.sockjs.IframeHandler(sockJsServer7);
        org.projectodd.sockjs.DispatchFunction dispatchFunction9 = iframeHandler8.iframe;
        websocketHandler1.sockjsWebsocket = dispatchFunction9;
        org.projectodd.sockjs.SockJsServer sockJsServer11 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer11.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint15 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer11, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint18 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer11, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        org.projectodd.sockjs.SockJsRequest sockJsRequest19 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse20 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsServer.Options options23 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver24 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options23);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver25 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest19, sockJsResponse20, options23);
        options23.responseLimit = (byte) -1;
        java.lang.String str28 = options23.sockjsUrl;
        int int29 = options23.responseLimit;
        java.lang.String str30 = options23.sockjsUrl;
        options23.sockjsUrl = "3ab7963e-8fca-4430-8d3d-57d50376f624";
        sockJsServer11.options = options23;
        org.projectodd.sockjs.SockJsServer sockJsServer34 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session35 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection36 = new org.projectodd.sockjs.SockJsConnection(session35);
        sockJsConnection36.prefix = "\"\"";
        sockJsConnection36.url = "\"\\\"\\\"\"";
        java.lang.String str41 = sockJsConnection36.id;
        java.lang.String str42 = sockJsConnection36.remoteAddress;
        sockJsServer34.emitConnection(sockJsConnection36);
        org.projectodd.sockjs.WebsocketHandler websocketHandler44 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer34);
        org.projectodd.sockjs.Session session45 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection46 = new org.projectodd.sockjs.SockJsConnection(session45);
        sockJsConnection46.prefix = "\"\"";
        sockJsServer34.emitConnection(sockJsConnection46);
        java.lang.String str50 = sockJsConnection46.pathname;
        sockJsServer11.emitConnection(sockJsConnection46);
        org.projectodd.sockjs.JsonpHandler jsonpHandler52 = new org.projectodd.sockjs.JsonpHandler(sockJsServer11);
        org.projectodd.sockjs.DispatchFunction dispatchFunction53 = jsonpHandler52.jsonp;
        websocketHandler1.rawWebsocket = dispatchFunction53;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction5);
        org.junit.Assert.assertNotNull(dispatchFunction9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str28, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str30, "http://cdn.sockjs.org/sockjs-0.3.min.js");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ec53e3c4-0d81-404a-96c6-14b3117d903a" + "'", str41, "ec53e3c4-0d81-404a-96c6-14b3117d903a");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(dispatchFunction53);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray2 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry3 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray2);
        java.util.regex.Pattern pattern4 = null;
        dispatchEntry3.pattern = pattern4;
        java.util.regex.Pattern pattern6 = dispatchEntry3.pattern;
        java.util.regex.Pattern pattern7 = dispatchEntry3.pattern;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray10 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry11 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray10);
        dispatchEntry3.functions = dispatchFunctionArray10;
        org.projectodd.sockjs.DispatchFunction[] dispatchFunctionArray15 = new org.projectodd.sockjs.DispatchFunction[] {};
        org.projectodd.sockjs.Dispatcher.DispatchEntry dispatchEntry16 = new org.projectodd.sockjs.Dispatcher.DispatchEntry("hi!", "hi!", dispatchFunctionArray15);
        java.util.regex.Pattern pattern17 = null;
        dispatchEntry16.pattern = pattern17;
        dispatchEntry16.method = "org.projectodd.sockjs.SockJsException";
        java.util.regex.Pattern pattern21 = null;
        dispatchEntry16.pattern = pattern21;
        java.lang.String[] strArray23 = dispatchEntry16.groups;
        dispatchEntry3.groups = strArray23;
        java.util.regex.Pattern pattern25 = dispatchEntry3.pattern;
        org.junit.Assert.assertNotNull(dispatchFunctionArray2);
        org.junit.Assert.assertNull(pattern6);
        org.junit.Assert.assertNull(pattern7);
        org.junit.Assert.assertNotNull(dispatchFunctionArray10);
        org.junit.Assert.assertNotNull(dispatchFunctionArray15);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(pattern25);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        org.projectodd.sockjs.SockJsServer.Options options0 = new org.projectodd.sockjs.SockJsServer.Options();
        int int1 = options0.heartbeatDelay;
        boolean boolean2 = options0.jsessionid;
        java.lang.String str3 = options0.baseUrl;
        options0.baseUrl = "<SockJSConnection 325d0bee-caf7-47aa-a040-4e3ef5c9d7e0>";
        options0.sockjsUrl = "c60fd7bd-b986-47b4-8108-c472819a4228";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25000 + "'", int1 == 25000);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet11 = new org.projectodd.sockjs.servlet.SockJsServlet(sockJsServer0);
        javax.servlet.ServletRequest servletRequest12 = null;
        javax.servlet.ServletResponse servletResponse13 = null;
        // The following exception was thrown during execution in test generation
        try {
            sockJsServlet11.service(servletRequest12, servletResponse13);
            org.junit.Assert.fail("Expected exception of type javax.servlet.ServletException; message: non-HTTP request or response");
        } catch (javax.servlet.ServletException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3aa2e89a-2dac-4d1e-9e2b-31de6d36aa84" + "'", str7, "3aa2e89a-2dac-4d1e-9e2b-31de6d36aa84");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.remoteAddress;
        java.lang.String str8 = sockJsConnection1.id;
        sockJsConnection1.emitClose();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = sockJsConnection1.headers;
        sockJsConnection1.remotePort = 1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = sockJsConnection1.write("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0764eef3-d91e-4af2-bad0-ce440b065a25" + "'", str6, "0764eef3-d91e-4af2-bad0-ce440b065a25");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0764eef3-d91e-4af2-bad0-ce440b065a25" + "'", str8, "0764eef3-d91e-4af2-bad0-ce440b065a25");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = sockJsServletRequest1.getCookie("\"39756cef-f4f3-4504-948b-74773ddbf064\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        javax.servlet.http.HttpServletResponse httpServletResponse0 = null;
        javax.servlet.AsyncContext asyncContext1 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse2 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse0, asyncContext1);
        // The following exception was thrown during execution in test generation
        try {
            sockJsServletResponse2.setHeader("b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1", "GET");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        org.projectodd.sockjs.SockJsRequest sockJsRequest0 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse1 = null;
        javax.servlet.AsyncContext asyncContext2 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse3 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse1, asyncContext2);
        org.projectodd.sockjs.SockJsServer.Options options4 = new org.projectodd.sockjs.SockJsServer.Options();
        int int5 = options4.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver6 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest0, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse3, options4);
        boolean boolean8 = eventSourceReceiver6.doSendFrame("\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25000 + "'", int5 == 25000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.Session session12 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection13 = new org.projectodd.sockjs.SockJsConnection(session12);
        sockJsConnection13.pathname = "hi!";
        java.lang.String str16 = sockJsConnection13.remoteAddress;
        sockJsConnection13.id = "\"\"";
        java.lang.String str19 = sockJsConnection13.id;
        sockJsConnection13.emitClose();
        sockJsServer0.emitConnection(sockJsConnection13);
        org.projectodd.sockjs.XhrHandler xhrHandler22 = new org.projectodd.sockjs.XhrHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer23 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler24 = new org.projectodd.sockjs.IframeHandler(sockJsServer23);
        org.projectodd.sockjs.DispatchFunction dispatchFunction25 = iframeHandler24.iframe;
        xhrHandler22.xhrPoll = dispatchFunction25;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "125d73c0-ad06-4654-923a-fc10f1643271" + "'", str7, "125d73c0-ad06-4654-923a-fc10f1643271");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertNotNull(dispatchFunction25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        sockJsConnection1.emitClose();
        java.lang.String str5 = sockJsConnection1.url;
        sockJsConnection1.emitData("933ecfb1-a145-4644-ab9b-4f066870d6b7");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsServer sockJsServer4 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer4.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint8 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer4, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint11 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer4, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        javax.websocket.Session session12 = null;
        org.projectodd.sockjs.DispatchException dispatchException15 = new org.projectodd.sockjs.DispatchException(0, "3ab7963e-8fca-4430-8d3d-57d50376f624");
        int int16 = dispatchException15.status;
        rawWebsocketEndpoint11.onError(session12, (java.lang.Throwable) dispatchException15);
        sockJsServletRequest1.onError((java.lang.Throwable) dispatchException15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = sockJsServletRequest1.lastFunction;
        org.projectodd.sockjs.SockJsRequest sockJsRequest4 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        org.projectodd.sockjs.SockJsServer.Options options8 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver9 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options8);
        int int10 = sockJsServletResponse7.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest11 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse12 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse14 = null;
        org.projectodd.sockjs.SockJsServer.Options options15 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver16 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest13, sockJsResponse14, options15);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver17 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest11, sockJsResponse12, options15);
        options15.responseLimit = (byte) -1;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver20 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options15);
        sockJsServletResponse7.statusCode((int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = null;
        org.projectodd.sockjs.JsonpHandler jsonpHandler1 = new org.projectodd.sockjs.JsonpHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction2 = jsonpHandler1.jsonp;
        org.projectodd.sockjs.DispatchFunction dispatchFunction3 = jsonpHandler1.jsonpSend;
        org.projectodd.sockjs.DispatchFunction dispatchFunction4 = jsonpHandler1.jsonpSend;
        org.junit.Assert.assertNotNull(dispatchFunction2);
        org.junit.Assert.assertNotNull(dispatchFunction3);
        org.junit.Assert.assertNotNull(dispatchFunction4);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.pathname = "hi!";
        java.lang.String str4 = sockJsConnection1.remoteAddress;
        sockJsConnection1.id = "\"\"";
        java.lang.String str7 = sockJsConnection1.id;
        org.projectodd.sockjs.Session session8 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection9 = new org.projectodd.sockjs.SockJsConnection(session8);
        sockJsConnection9.prefix = "\"\"";
        sockJsConnection9.url = "\"\\\"\\\"\"";
        java.lang.String str14 = sockJsConnection9.id;
        java.lang.String str15 = sockJsConnection9.remoteAddress;
        java.lang.String str16 = sockJsConnection9.id;
        sockJsConnection9.emitClose();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = sockJsConnection9.headers;
        sockJsConnection1.headers = strMap18;
        org.projectodd.sockjs.SockJsConnection.OnCloseHandler onCloseHandler20 = null;
        sockJsConnection1.onClose(onCloseHandler20);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "f853fa7c-bac5-4a4c-a769-33ee6d036370" + "'", str14, "f853fa7c-bac5-4a4c-a769-33ee6d036370");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "f853fa7c-bac5-4a4c-a769-33ee6d036370" + "'", str16, "f853fa7c-bac5-4a4c-a769-33ee6d036370");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "63271dc7-5174-48ba-8275-e00f4ff28b1f";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.ChunkingHandler chunkingHandler13 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = chunkingHandler13.info;
        chunkingHandler11.info = dispatchFunction14;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1d3b79dc-ac00-4ae3-843f-546b708eee0c" + "'", str7, "1d3b79dc-ac00-4ae3-843f-546b708eee0c");
        org.junit.Assert.assertNotNull(dispatchFunction14);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletRequest httpServletRequest5 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest6 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest5);
        java.lang.String str7 = sockJsServletRequest6.session();
        org.projectodd.sockjs.SockJsException sockJsException10 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException11 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onError((java.lang.Throwable) sockJsException10);
        sockJsServletRequest6.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest14 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse15 = null;
        javax.servlet.AsyncContext asyncContext16 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse17 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse15, asyncContext16);
        org.projectodd.sockjs.SockJsServer.Options options18 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver19 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest14, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options18);
        int int20 = sockJsServletResponse17.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest21 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse22 = null;
        org.projectodd.sockjs.SockJsRequest sockJsRequest23 = null;
        org.projectodd.sockjs.SockJsResponse sockJsResponse24 = null;
        org.projectodd.sockjs.SockJsServer.Options options25 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver26 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest23, sockJsResponse24, options25);
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver27 = new org.projectodd.sockjs.HtmlFileReceiver(sockJsRequest21, sockJsResponse22, options25);
        options25.responseLimit = (byte) -1;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver31 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest6, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options25, "45c5c7f62d06fed3323f980a739ffe91");
        javax.servlet.http.HttpServletRequest httpServletRequest32 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest33 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest32);
        java.lang.String str34 = sockJsServletRequest33.session();
        org.projectodd.sockjs.SockJsException sockJsException37 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException38 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onError((java.lang.Throwable) sockJsException37);
        sockJsServletRequest33.onAllDataRead();
        org.projectodd.sockjs.SockJsRequest sockJsRequest41 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse42 = null;
        javax.servlet.AsyncContext asyncContext43 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse44 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse42, asyncContext43);
        org.projectodd.sockjs.SockJsServer.Options options45 = new org.projectodd.sockjs.SockJsServer.Options();
        int int46 = options45.heartbeatDelay;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver47 = new org.projectodd.sockjs.EventSourceReceiver(sockJsRequest41, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options45);
        org.projectodd.sockjs.SockJsServer.Options options48 = new org.projectodd.sockjs.SockJsServer.Options();
        int int49 = options48.heartbeatDelay;
        boolean boolean50 = options48.jsessionid;
        java.lang.String str51 = options48.sockjsUrl;
        options48.jsessionid = false;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver54 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse44, options48);
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver56 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse17, options48, "");
        java.lang.String str58 = sockJsWebsocketRequest4.getCookie("e1fee1fb-09c9-49c7-81a8-3ab8e171187f");
        org.projectodd.sockjs.DispatchFunction dispatchFunction59 = sockJsWebsocketRequest4.lastFunction;
        java.lang.String str60 = sockJsWebsocketRequest4.getRemoteAddr();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 25000 + "'", int46 == 25000);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 25000 + "'", int49 == 25000);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str51, "http://cdn.sockjs.org/sockjs-0.3.min.js");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(dispatchFunction59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        javax.servlet.http.HttpServletRequest httpServletRequest0 = null;
        org.projectodd.sockjs.servlet.SockJsServletRequest sockJsServletRequest1 = new org.projectodd.sockjs.servlet.SockJsServletRequest(httpServletRequest0);
        java.lang.String str2 = sockJsServletRequest1.session();
        org.projectodd.sockjs.SockJsException sockJsException5 = new org.projectodd.sockjs.SockJsException("hi!");
        org.projectodd.sockjs.SockJsException sockJsException6 = new org.projectodd.sockjs.SockJsException("", (java.lang.Throwable) sockJsException5);
        sockJsServletRequest1.onError((java.lang.Throwable) sockJsException5);
        org.projectodd.sockjs.NextFilter nextFilter8 = sockJsServletRequest1.nextFilter;
        javax.websocket.Session session9 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest13 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session9, "b9dcbc6c-e66a-4859-85de-a72f4cdad117", "64b92e6a-a976-49ab-8dc9-9cc5f226d9b1", strMap12);
        java.lang.String str14 = sockJsWebsocketRequest13.getPrefix();
        org.projectodd.sockjs.SockJsRequest sockJsRequest15 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse16 = null;
        javax.servlet.AsyncContext asyncContext17 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse18 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse16, asyncContext17);
        org.projectodd.sockjs.SockJsServer.Options options19 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver20 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest15, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse18, options19);
        int int21 = sockJsServletResponse18.statusCode();
        org.projectodd.sockjs.SockJsRequest sockJsRequest22 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse23 = null;
        javax.servlet.AsyncContext asyncContext24 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse25 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse23, asyncContext24);
        org.projectodd.sockjs.SockJsServer.Options options26 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver27 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest22, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse25, options26);
        options26.jsessionid = false;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver30 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest13, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse18, options26);
        org.projectodd.sockjs.SockJsServer sockJsServer31 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler32 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer31);
        org.projectodd.sockjs.SockJsRequest sockJsRequest33 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse34 = null;
        javax.servlet.AsyncContext asyncContext35 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse36 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse34, asyncContext35);
        org.projectodd.sockjs.SockJsServer.Options options37 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver38 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest33, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse36, options37);
        sockJsServer31.options = options37;
        org.projectodd.sockjs.SockJsServer.Options options40 = sockJsServer31.options;
        org.projectodd.sockjs.EventSourceReceiver eventSourceReceiver41 = new org.projectodd.sockjs.EventSourceReceiver((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse18, options40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(nextFilter8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1" + "'", str14, "b9dcbc6c-e66a-4859-85de-a72f4cdad11764b92e6a-a976-49ab-8dc9-9cc5f226d9b1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNotNull(options40);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint7 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "c[1,\"\"]", "3ab7963e-8fca-4430-8d3d-57d50376f624");
        org.projectodd.sockjs.WebHandler webHandler8 = new org.projectodd.sockjs.WebHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer9 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler10 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer9);
        org.projectodd.sockjs.DispatchFunction dispatchFunction11 = websocketHandler10.rawWebsocket;
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.WebsocketHandler websocketHandler13 = new org.projectodd.sockjs.WebsocketHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = websocketHandler13.rawWebsocket;
        websocketHandler10.rawWebsocket = dispatchFunction14;
        org.projectodd.sockjs.SockJsServer sockJsServer16 = null;
        org.projectodd.sockjs.IframeHandler iframeHandler17 = new org.projectodd.sockjs.IframeHandler(sockJsServer16);
        org.projectodd.sockjs.DispatchFunction dispatchFunction18 = iframeHandler17.iframe;
        websocketHandler10.sockjsWebsocket = dispatchFunction18;
        webHandler8.hNoCache = dispatchFunction18;
        org.junit.Assert.assertNotNull(dispatchFunction11);
        org.junit.Assert.assertNotNull(dispatchFunction14);
        org.junit.Assert.assertNotNull(dispatchFunction18);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "\"hi!\"", "c[1,\"\"]", strMap3);
        javax.servlet.http.HttpServletResponse httpServletResponse5 = null;
        javax.servlet.AsyncContext asyncContext6 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse7 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse5, asyncContext6);
        boolean boolean8 = sockJsServletResponse7.finished();
        int int9 = sockJsServletResponse7.statusCode();
        boolean boolean10 = sockJsServletResponse7.finished();
        org.projectodd.sockjs.SockJsServer sockJsServer11 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.HtmlfileHandler htmlfileHandler12 = new org.projectodd.sockjs.HtmlfileHandler(sockJsServer11);
        org.projectodd.sockjs.SockJsRequest sockJsRequest13 = null;
        javax.servlet.http.HttpServletResponse httpServletResponse14 = null;
        javax.servlet.AsyncContext asyncContext15 = null;
        org.projectodd.sockjs.servlet.SockJsServletResponse sockJsServletResponse16 = new org.projectodd.sockjs.servlet.SockJsServletResponse(httpServletResponse14, asyncContext15);
        org.projectodd.sockjs.SockJsServer.Options options17 = new org.projectodd.sockjs.SockJsServer.Options();
        org.projectodd.sockjs.XhrPollingReceiver xhrPollingReceiver18 = new org.projectodd.sockjs.XhrPollingReceiver(sockJsRequest13, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse16, options17);
        sockJsServer11.options = options17;
        java.lang.String str20 = options17.sockjsUrl;
        org.projectodd.sockjs.HtmlFileReceiver htmlFileReceiver21 = new org.projectodd.sockjs.HtmlFileReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse7, options17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = sockJsWebsocketRequest4.getQueryParameter("\"\\\"\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str20, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsServer sockJsServer1 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer1.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint5 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer1, "3ab7963e-8fca-4430-8d3d-57d50376f624", "b309409d-89d2-4d6e-a832-218c74ba5b9c");
        sockJsServlet0.setServer(sockJsServer1);
        org.projectodd.sockjs.SockJsServer sockJsServer7 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session8 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection9 = new org.projectodd.sockjs.SockJsConnection(session8);
        sockJsConnection9.prefix = "\"\"";
        sockJsConnection9.url = "\"\\\"\\\"\"";
        java.lang.String str14 = sockJsConnection9.id;
        java.lang.String str15 = sockJsConnection9.remoteAddress;
        sockJsServer7.emitConnection(sockJsConnection9);
        sockJsServlet0.setServer(sockJsServer7);
        org.projectodd.sockjs.SockJsServer sockJsServer18 = sockJsServlet0.getServer();
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d21b91c9-cda2-43db-93dc-b2d454d4b71b" + "'", str14, "d21b91c9-cda2-43db-93dc-b2d454d4b71b");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(sockJsServer18);
    }
}
