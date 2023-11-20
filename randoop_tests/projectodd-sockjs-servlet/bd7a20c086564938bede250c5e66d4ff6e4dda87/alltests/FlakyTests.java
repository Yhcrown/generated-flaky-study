import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test038_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = org.projectodd.sockjs.Utils.uuid();
         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0265a1ec-9de6-420c-91f3-dee4c9b56288" + "'", str0, "0265a1ec-9de6-420c-91f3-dee4c9b56288");
    }

    public void test044_1() throws Throwable {
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
            boolean boolean10 = sockJsConnection1.write("0265a1ec-9de6-420c-91f3-dee4c9b56288");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "156e8689-bb38-498a-a2ab-2e6e12657ee7" + "'", str6, "156e8689-bb38-498a-a2ab-2e6e12657ee7");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "156e8689-bb38-498a-a2ab-2e6e12657ee7" + "'", str8, "156e8689-bb38-498a-a2ab-2e6e12657ee7");
    }

    public void test044_2() throws Throwable {
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
            boolean boolean10 = sockJsConnection1.write("0265a1ec-9de6-420c-91f3-dee4c9b56288");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "156e8689-bb38-498a-a2ab-2e6e12657ee7" + "'", str6, "156e8689-bb38-498a-a2ab-2e6e12657ee7");
        org.junit.Assert.assertNull(str7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "156e8689-bb38-498a-a2ab-2e6e12657ee7" + "'", str8, "156e8689-bb38-498a-a2ab-2e6e12657ee7");
    }

    public void test050_1() throws Throwable {
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
            sockJsConnection1.end("cc90bf66-5961-4693-b141-fc94fdea3cdb");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7d5c31f0-b88a-42b2-9323-1ea458de9b35" + "'", str6, "7d5c31f0-b88a-42b2-9323-1ea458de9b35");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7d5c31f0-b88a-42b2-9323-1ea458de9b35" + "'", str8, "7d5c31f0-b88a-42b2-9323-1ea458de9b35");
    }

    public void test050_2() throws Throwable {
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
            sockJsConnection1.end("cc90bf66-5961-4693-b141-fc94fdea3cdb");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7d5c31f0-b88a-42b2-9323-1ea458de9b35" + "'", str6, "7d5c31f0-b88a-42b2-9323-1ea458de9b35");
        org.junit.Assert.assertNull(str7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7d5c31f0-b88a-42b2-9323-1ea458de9b35" + "'", str8, "7d5c31f0-b88a-42b2-9323-1ea458de9b35");
    }

    public void test073_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "04a2c8e4-6cc0-4927-be4a-688619279c44" + "'", str7, "04a2c8e4-6cc0-4927-be4a-688619279c44");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
    }

    public void test096_1() throws Throwable {
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
        boolean boolean22 = eventSourceReceiver20.doSendFrame("2df7967b-c163-40e4-9df1-d5dcf52a6339");
        // The following exception was thrown during execution in test generation
        try {
            org.projectodd.sockjs.Session session23 = org.projectodd.sockjs.Transport.register((org.projectodd.sockjs.SockJsRequest) sockJsServletRequest1, sockJsServer4, (org.projectodd.sockjs.GenericReceiver) eventSourceReceiver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dispatchFunction3);
         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66a164aa-f045-4f22-8d98-d12fadec67d2" + "'", str11, "66a164aa-f045-4f22-8d98-d12fadec67d2");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 25000 + "'", int19 == 25000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    public void test107_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.toString();
        java.lang.String str8 = sockJsConnection1.id;
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dc9978fd-25e8-4379-9ca9-e5909baefee9" + "'", str6, "dc9978fd-25e8-4379-9ca9-e5909baefee9");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<SockJSConnection dc9978fd-25e8-4379-9ca9-e5909baefee9>" + "'", str7, "<SockJSConnection dc9978fd-25e8-4379-9ca9-e5909baefee9>");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dc9978fd-25e8-4379-9ca9-e5909baefee9" + "'", str8, "dc9978fd-25e8-4379-9ca9-e5909baefee9");
    }

    public void test107_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.toString();
        java.lang.String str8 = sockJsConnection1.id;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dc9978fd-25e8-4379-9ca9-e5909baefee9" + "'", str6, "dc9978fd-25e8-4379-9ca9-e5909baefee9");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<SockJSConnection dc9978fd-25e8-4379-9ca9-e5909baefee9>" + "'", str7, "<SockJSConnection dc9978fd-25e8-4379-9ca9-e5909baefee9>");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dc9978fd-25e8-4379-9ca9-e5909baefee9" + "'", str8, "dc9978fd-25e8-4379-9ca9-e5909baefee9");
    }

    public void test107_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        java.lang.String str7 = sockJsConnection1.toString();
        java.lang.String str8 = sockJsConnection1.id;
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "dc9978fd-25e8-4379-9ca9-e5909baefee9" + "'", str6, "dc9978fd-25e8-4379-9ca9-e5909baefee9");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<SockJSConnection dc9978fd-25e8-4379-9ca9-e5909baefee9>" + "'", str7, "<SockJSConnection dc9978fd-25e8-4379-9ca9-e5909baefee9>");
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dc9978fd-25e8-4379-9ca9-e5909baefee9" + "'", str8, "dc9978fd-25e8-4379-9ca9-e5909baefee9");
    }

    public void test116_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b75c8de0-71cd-432f-8f45-4de164f08d98" + "'", str7, "b75c8de0-71cd-432f-8f45-4de164f08d98");
        org.junit.Assert.assertNull(str8);
    }

    public void test131_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        sockJsConnection1.url = "\"\\\"\\\"\"";
        java.lang.String str6 = sockJsConnection1.id;
        sockJsConnection1.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        org.projectodd.sockjs.SockJsConnection.OnCloseHandler onCloseHandler9 = null;
        sockJsConnection1.onClose(onCloseHandler9);
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "f6091292-7c6e-4d5b-9828-40d53b360c32" + "'", str6, "f6091292-7c6e-4d5b-9828-40d53b360c32");
    }

    public void test133_1() throws Throwable {
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
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint21 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer17, "\"hi!\"", "42393e10-600d-4023-8e90-2e0df2e16503");
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
         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d71bb72c-d7c7-4960-8ae5-c9a2f6758d03" + "'", str35, "d71bb72c-d7c7-4960-8ae5-c9a2f6758d03");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 25000 + "'", int53 == 25000);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 25000 + "'", int56 == 25000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "http://cdn.sockjs.org/sockjs-0.3.min.js" + "'", str58, "http://cdn.sockjs.org/sockjs-0.3.min.js");
    }

    public void test147_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42bf3332-f6d0-494a-aaf3-4db4e4ba355e" + "'", str7, "42bf3332-f6d0-494a-aaf3-4db4e4ba355e");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dispatchFunction13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(dispatchFunction19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
    }

    public void test150_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93e0457b-336a-43e3-9320-2b902f01d485" + "'", str6, "93e0457b-336a-43e3-9320-2b902f01d485");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "93e0457b-336a-43e3-9320-2b902f01d485" + "'", str8, "93e0457b-336a-43e3-9320-2b902f01d485");
        org.junit.Assert.assertNotNull(strMap10);
    }

    public void test150_2() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "93e0457b-336a-43e3-9320-2b902f01d485" + "'", str6, "93e0457b-336a-43e3-9320-2b902f01d485");
        org.junit.Assert.assertNull(str7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "93e0457b-336a-43e3-9320-2b902f01d485" + "'", str8, "93e0457b-336a-43e3-9320-2b902f01d485");
        org.junit.Assert.assertNotNull(strMap10);
    }

    public void test153_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c780d6ce-cb5b-433b-9a0c-69eb41f555dd" + "'", str7, "c780d6ce-cb5b-433b-9a0c-69eb41f555dd");
        org.junit.Assert.assertNull(str8);
    }

    public void test178_1() throws Throwable {
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
            boolean boolean10 = sockJsConnection1.write("c780d6ce-cb5b-433b-9a0c-69eb41f555dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4e47451f-ae74-4816-ab2d-dcaf258ab277" + "'", str6, "4e47451f-ae74-4816-ab2d-dcaf258ab277");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4e47451f-ae74-4816-ab2d-dcaf258ab277" + "'", str8, "4e47451f-ae74-4816-ab2d-dcaf258ab277");
    }

    public void test178_2() throws Throwable {
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
            boolean boolean10 = sockJsConnection1.write("c780d6ce-cb5b-433b-9a0c-69eb41f555dd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4e47451f-ae74-4816-ab2d-dcaf258ab277" + "'", str6, "4e47451f-ae74-4816-ab2d-dcaf258ab277");
        org.junit.Assert.assertNull(str7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4e47451f-ae74-4816-ab2d-dcaf258ab277" + "'", str8, "4e47451f-ae74-4816-ab2d-dcaf258ab277");
    }

    public void test188_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer0.emitConnection(sockJsConnection2);
        sockJsConnection2.remotePort = (short) 10;
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "eb3aba54-425c-4866-9648-b27c1de06974" + "'", str7, "eb3aba54-425c-4866-9648-b27c1de06974");
    }

    public void test201_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "fd484e31-0854-4cd0-9a14-f7e9c04236f1" + "'", str7, "fd484e31-0854-4cd0-9a14-f7e9c04236f1");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    public void test211_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        javax.websocket.Session session0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        org.projectodd.sockjs.servlet.SockJsWebsocketRequest sockJsWebsocketRequest4 = new org.projectodd.sockjs.servlet.SockJsWebsocketRequest(session0, "cc90bf66-5961-4693-b141-fc94fdea3cdb", "dc9978fd-25e8-4379-9ca9-e5909baefee9", strMap3);
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
         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c0b67cb2-5b41-4eb0-a642-0be186babb22" + "'", str12, "c0b67cb2-5b41-4eb0-a642-0be186babb22");
        org.junit.Assert.assertNull(str13);
    }

    public void test215_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsServer sockJsServer1 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer1.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint5 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer1, "1f2d0367-affd-4bc4-9047-35ed487203f3", "2df7967b-c163-40e4-9df1-d5dcf52a6339");
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
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "c7c8063c-0a1c-4886-bdb9-3cc3e216bafb" + "'", str14, "c7c8063c-0a1c-4886-bdb9-3cc3e216bafb");
        org.junit.Assert.assertNull(str15);
    }

    public void test218_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer0.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint4 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer0, "1f2d0367-affd-4bc4-9047-35ed487203f3", "2df7967b-c163-40e4-9df1-d5dcf52a6339");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint7 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "c[1,\"\"]", "1f2d0367-affd-4bc4-9047-35ed487203f3");
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
        options12.sockjsUrl = "1f2d0367-affd-4bc4-9047-35ed487203f3";
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
         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "e9cbdfff-25c5-4384-9b52-64cfa602c655" + "'", str30, "e9cbdfff-25c5-4384-9b52-64cfa602c655");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str39);
    }

    public void test219_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4df1bf63-6d12-4300-b19f-35389611d1da" + "'", str7, "4df1bf63-6d12-4300-b19f-35389611d1da");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(dispatchFunction17);
        org.junit.Assert.assertNotNull(dispatchFunction18);
    }

    public void test220_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer0.emitConnection(sockJsConnection2);
        sockJsConnection2.emitData("de9a8da6-580d-432b-bbe5-42d5a97c653f");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "96c4603c-3098-4810-bbe2-2f8d3d821aca" + "'", str7, "96c4603c-3098-4810-bbe2-2f8d3d821aca");
    }

    public void test225_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.projectodd.sockjs.Session session0 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection1 = new org.projectodd.sockjs.SockJsConnection(session0);
        sockJsConnection1.prefix = "\"\"";
        java.lang.String str4 = sockJsConnection1.toString();
         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<SockJSConnection 2581f79a-8ce7-4075-aede-791f8359e2ae>" + "'", str4, "<SockJSConnection 2581f79a-8ce7-4075-aede-791f8359e2ae>");
    }

    public void test233_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer.Options options12 = sockJsServer0.options;
        options12.responseLimit = 100;
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c843a36f-67a3-4198-9024-291640dd99b7" + "'", str7, "c843a36f-67a3-4198-9024-291640dd99b7");
        org.junit.Assert.assertNotNull(options12);
    }

    public void test245_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0199325e-1796-4db3-9302-2930e18bea9d" + "'", str7, "0199325e-1796-4db3-9302-2930e18bea9d");
        org.junit.Assert.assertNull(str8);
    }

    public void test247_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9447fbf5-abee-45cd-ae27-de993b58c47b" + "'", str7, "9447fbf5-abee-45cd-ae27-de993b58c47b");
        org.junit.Assert.assertNull(str8);
    }

    public void test253_1() throws Throwable {
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
        sockJsConnection14.url = "<SockJSConnection 42393e10-600d-4023-8e90-2e0df2e16503>";
         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "df0498b0-c170-472f-8b59-6f3ca4705612" + "'", str9, "df0498b0-c170-472f-8b59-6f3ca4705612");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<SockJSConnection 6ca30529-291d-475e-a09b-78d6ff14a8a9>" + "'", str19, "<SockJSConnection 6ca30529-291d-475e-a09b-78d6ff14a8a9>");
    }

    public void test253_2() throws Throwable {
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
        sockJsConnection14.url = "<SockJSConnection 42393e10-600d-4023-8e90-2e0df2e16503>";
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "df0498b0-c170-472f-8b59-6f3ca4705612" + "'", str9, "df0498b0-c170-472f-8b59-6f3ca4705612");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<SockJSConnection 6ca30529-291d-475e-a09b-78d6ff14a8a9>" + "'", str19, "<SockJSConnection 6ca30529-291d-475e-a09b-78d6ff14a8a9>");
    }

    public void test260_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "cf9e4030-02de-4018-8679-b18bb23bcabc" + "'", str14, "cf9e4030-02de-4018-8679-b18bb23bcabc");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cf9e4030-02de-4018-8679-b18bb23bcabc" + "'", str16, "cf9e4030-02de-4018-8679-b18bb23bcabc");
        org.junit.Assert.assertNotNull(strMap18);
    }

    public void test260_2() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "cf9e4030-02de-4018-8679-b18bb23bcabc" + "'", str14, "cf9e4030-02de-4018-8679-b18bb23bcabc");
        org.junit.Assert.assertNull(str15);
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "cf9e4030-02de-4018-8679-b18bb23bcabc" + "'", str16, "cf9e4030-02de-4018-8679-b18bb23bcabc");
        org.junit.Assert.assertNotNull(strMap18);
    }

    public void test265_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.DispatchFunction dispatchFunction12 = chunkingHandler11.infoOptions;
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2c1f18bc-eb67-4e1d-8ff2-de2f99870128" + "'", str7, "2c1f18bc-eb67-4e1d-8ff2-de2f99870128");
        org.junit.Assert.assertNotNull(dispatchFunction12);
    }

    public void test266_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer.Options options12 = sockJsServer0.options;
        org.projectodd.sockjs.XhrHandler xhrHandler13 = new org.projectodd.sockjs.XhrHandler(sockJsServer0);
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint16 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer0, "", "<SockJSConnection 6ca30529-291d-475e-a09b-78d6ff14a8a9>");
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c985b2e3-92ea-4a8a-8c7a-51c45a743bec" + "'", str7, "c985b2e3-92ea-4a8a-8c7a-51c45a743bec");
        org.junit.Assert.assertNotNull(options12);
    }

    public void test271_1() throws Throwable {
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
            boolean boolean18 = sockJsConnection12.close((int) (short) 10, "3724d827-52f3-42c3-b48e-fb3c2b6c47aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6cb217ac-494e-4c4a-b588-1c04055903ae" + "'", str7, "6cb217ac-494e-4c4a-b588-1c04055903ae");
        org.junit.Assert.assertNull(str8);
    }

    public void test273_1() throws Throwable {
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
        sockJsConnection47.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer45.emitConnection(sockJsConnection47);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler56 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer45);
        org.projectodd.sockjs.SockJsServer.Options options57 = sockJsServer45.options;
        org.projectodd.sockjs.JsonpReceiver jsonpReceiver59 = new org.projectodd.sockjs.JsonpReceiver((org.projectodd.sockjs.SockJsRequest) sockJsWebsocketRequest4, (org.projectodd.sockjs.SockJsResponse) sockJsServletResponse30, options57, "\"0464b5a2-eb61-4f8e-9f54-8ee3f17275f1\"");
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
         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "714b1f9d-4865-45b6-8fae-8dedc0faf59c" + "'", str52, "714b1f9d-4865-45b6-8fae-8dedc0faf59c");
        org.junit.Assert.assertNotNull(options57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
    }

    public void test277_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "f5a2f1e7-4785-43a9-874e-ef06f55748eb" + "'", str6, "f5a2f1e7-4785-43a9-874e-ef06f55748eb");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "f5a2f1e7-4785-43a9-874e-ef06f55748eb" + "'", str8, "f5a2f1e7-4785-43a9-874e-ef06f55748eb");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
    }

    public void test277_2() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "f5a2f1e7-4785-43a9-874e-ef06f55748eb" + "'", str6, "f5a2f1e7-4785-43a9-874e-ef06f55748eb");
        org.junit.Assert.assertNull(str7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "f5a2f1e7-4785-43a9-874e-ef06f55748eb" + "'", str8, "f5a2f1e7-4785-43a9-874e-ef06f55748eb");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
    }

    public void test278_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "92fdbffc-5023-4faf-8cd5-d1e3723de8db" + "'", str7, "92fdbffc-5023-4faf-8cd5-d1e3723de8db");
        org.junit.Assert.assertNull(str8);
    }

    public void test280_1() throws Throwable {
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
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint15 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer11, "1f2d0367-affd-4bc4-9047-35ed487203f3", "2df7967b-c163-40e4-9df1-d5dcf52a6339");
        org.projectodd.sockjs.servlet.RawWebsocketEndpoint rawWebsocketEndpoint18 = new org.projectodd.sockjs.servlet.RawWebsocketEndpoint(sockJsServer11, "c[1,\"\"]", "1f2d0367-affd-4bc4-9047-35ed487203f3");
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
        options23.sockjsUrl = "1f2d0367-affd-4bc4-9047-35ed487203f3";
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
         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "b88cbd8d-43d4-43ad-9f4d-db4193cd0069" + "'", str41, "b88cbd8d-43d4-43ad-9f4d-db4193cd0069");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(dispatchFunction53);
    }

    public void test283_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "33f77f7c-12d3-4eb0-8be5-91ad41e52fc8" + "'", str7, "33f77f7c-12d3-4eb0-8be5-91ad41e52fc8");
    }

    public void test284_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2fbd983b-8cc5-45fe-9b85-463c12e4f520" + "'", str6, "2fbd983b-8cc5-45fe-9b85-463c12e4f520");
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2fbd983b-8cc5-45fe-9b85-463c12e4f520" + "'", str8, "2fbd983b-8cc5-45fe-9b85-463c12e4f520");
        org.junit.Assert.assertNotNull(strMap10);
    }

    public void test284_2() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2fbd983b-8cc5-45fe-9b85-463c12e4f520" + "'", str6, "2fbd983b-8cc5-45fe-9b85-463c12e4f520");
        org.junit.Assert.assertNull(str7);
         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2fbd983b-8cc5-45fe-9b85-463c12e4f520" + "'", str8, "2fbd983b-8cc5-45fe-9b85-463c12e4f520");
        org.junit.Assert.assertNotNull(strMap10);
    }

    public void test288_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
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
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "99a9e8ed-27b0-4262-8d1a-f24044825acc" + "'", str7, "99a9e8ed-27b0-4262-8d1a-f24044825acc");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertNotNull(dispatchFunction25);
    }

    public void test293_1() throws Throwable {
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
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "16afa01d-c1b2-4656-a80e-2a15a4b27d84" + "'", str14, "16afa01d-c1b2-4656-a80e-2a15a4b27d84");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "16afa01d-c1b2-4656-a80e-2a15a4b27d84" + "'", str16, "16afa01d-c1b2-4656-a80e-2a15a4b27d84");
        org.junit.Assert.assertNotNull(strMap18);
    }

    public void test293_2() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "16afa01d-c1b2-4656-a80e-2a15a4b27d84" + "'", str14, "16afa01d-c1b2-4656-a80e-2a15a4b27d84");
        org.junit.Assert.assertNull(str15);
         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "16afa01d-c1b2-4656-a80e-2a15a4b27d84" + "'", str16, "16afa01d-c1b2-4656-a80e-2a15a4b27d84");
        org.junit.Assert.assertNotNull(strMap18);
    }

    public void test294_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        org.projectodd.sockjs.SockJsServer sockJsServer0 = new org.projectodd.sockjs.SockJsServer();
        org.projectodd.sockjs.Session session1 = null;
        org.projectodd.sockjs.SockJsConnection sockJsConnection2 = new org.projectodd.sockjs.SockJsConnection(session1);
        sockJsConnection2.prefix = "\"\"";
        sockJsConnection2.url = "\"\\\"\\\"\"";
        java.lang.String str7 = sockJsConnection2.id;
        sockJsConnection2.pathname = "1d0d2f8b-f3b3-4b9b-b058-7275f6f659fe";
        sockJsServer0.emitConnection(sockJsConnection2);
        org.projectodd.sockjs.ChunkingHandler chunkingHandler11 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer0);
        org.projectodd.sockjs.SockJsServer sockJsServer12 = null;
        org.projectodd.sockjs.ChunkingHandler chunkingHandler13 = new org.projectodd.sockjs.ChunkingHandler(sockJsServer12);
        org.projectodd.sockjs.DispatchFunction dispatchFunction14 = chunkingHandler13.info;
        chunkingHandler11.info = dispatchFunction14;
         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a23a9e5d-1704-421f-a2f0-be895e0aa814" + "'", str7, "a23a9e5d-1704-421f-a2f0-be895e0aa814");
        org.junit.Assert.assertNotNull(dispatchFunction14);
    }

    public void test299_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        org.projectodd.sockjs.servlet.SockJsServlet sockJsServlet0 = new org.projectodd.sockjs.servlet.SockJsServlet();
        org.projectodd.sockjs.SockJsServer sockJsServer1 = new org.projectodd.sockjs.SockJsServer();
        sockJsServer1.init();
        org.projectodd.sockjs.servlet.SockJsEndpoint sockJsEndpoint5 = new org.projectodd.sockjs.servlet.SockJsEndpoint(sockJsServer1, "1f2d0367-affd-4bc4-9047-35ed487203f3", "2df7967b-c163-40e4-9df1-d5dcf52a6339");
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
         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bcfe847e-f34a-4f13-a0c4-b7b3adb6a7ac" + "'", str14, "bcfe847e-f34a-4f13-a0c4-b7b3adb6a7ac");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(sockJsServer18);
    }
}