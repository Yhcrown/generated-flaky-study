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
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint0 = null;
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint1 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint0);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxyClientEndpoint1.handleEvent(webSocketChannel2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint0 = null;
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint1 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint0);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxyClientEndpoint1.onConnect(webSocketChannel2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        io.joshworks.stream.client.StreamClient.shutdown();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser0 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output1 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser0);
        boolean boolean2 = uTF8Output1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics3 = sSEConnection2.new DisconnectedStatistics();
        long long4 = disconnectedStatistics3.getWritten();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        sSEConnection2.connect();
        org.junit.Assert.assertNotNull(sSEConnection2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser1 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output2 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser1);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener3 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output2);
        org.xnio.channels.StreamSourceChannel streamSourceChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventStreamChannelListener3.setup(streamSourceChannel4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError5);
        java.lang.Throwable throwable8 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError9 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable8);
        java.lang.Throwable throwable11 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError12 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable11);
        streamConnectionError9.addSuppressed((java.lang.Throwable) streamConnectionError12);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError12);
        java.lang.String str15 = streamConnectionError12.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "io.joshworks.stream.client.StreamConnectionError: hi!" + "'", str15, "io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser1 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output2 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser1);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener3 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output2);
        org.xnio.channels.StreamSourceChannel streamSourceChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventStreamChannelListener3.handleEvent(streamSourceChannel4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics3 = sSEConnection2.new DisconnectedStatistics();
        disconnectedStatistics3.reset();
        org.junit.Assert.assertNotNull(sSEConnection2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        org.xnio.OptionMap optionMap0 = null;
        io.joshworks.stream.client.StreamClient.configure(optionMap0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.event;
        java.lang.String str5 = eventData3.data;
        java.lang.String str6 = eventData3.data;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.event;
        java.lang.String str5 = eventData3.origin;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("hi!", sseClientCallback1);
        java.lang.Class<?> wildcardClass3 = sSEConnection2.getClass();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "", "EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.lang.String str5 = eventData4.data;
        java.lang.String str6 = eventData4.id;
        java.lang.String str7 = eventData4.data;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str6, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.clientCallback(sseClientCallback8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onRetriesExceeded(runnable10);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection9 = sseConfiguration5.connect("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        io.undertow.client.ClientStatistics clientStatistics10 = sSEConnection9.statistics();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sSEConnection9);
        org.junit.Assert.assertNotNull(clientStatistics10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("", "io.joshworks.stream.client.StreamConnectionError: hi!", "hi!", "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        wsConnection3.close();
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.Throwable throwable2 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError3 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable2);
        java.lang.Throwable throwable5 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError6 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable5);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError6);
        java.lang.Throwable throwable9 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError10 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable9);
        java.lang.Throwable throwable12 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError13 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable12);
        streamConnectionError10.addSuppressed((java.lang.Throwable) streamConnectionError13);
        java.lang.Throwable throwable16 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError17 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable16);
        java.lang.Throwable throwable19 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError20 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable19);
        streamConnectionError17.addSuppressed((java.lang.Throwable) streamConnectionError20);
        streamConnectionError10.addSuppressed((java.lang.Throwable) streamConnectionError20);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError20);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError24 = new io.joshworks.stream.client.StreamConnectionError("hi!", (java.lang.Throwable) streamConnectionError3);
        java.lang.String str25 = streamConnectionError24.toString();
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "io.joshworks.stream.client.StreamConnectionError: hi!" + "'", str25, "io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration1 = io.joshworks.stream.client.StreamClient.sse("");
        java.lang.Runnable runnable2 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration3 = sseConfiguration1.onRetriesExceeded(runnable2);
        org.junit.Assert.assertNotNull(sseConfiguration1);
        org.junit.Assert.assertNotNull(sseConfiguration3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("", throwable1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, -1, 1, -1, 1]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 1, 10, 1, 1]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
        java.lang.String str4 = eventData3.toString();
        org.xnio.XnioWorker xnioWorker6 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService7 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor8 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback9 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration10 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker6, scheduledExecutorService7, connectionMonitor8, sseClientCallback9);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer11 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration12 = sseConfiguration10.onEvent(eventDataConsumer11);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer13 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration14 = sseConfiguration10.onError(exceptionConsumer13);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer15 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration16 = sseConfiguration14.onEvent(eventDataConsumer15);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection19 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration16, "", sseClientCallback18);
        boolean boolean20 = eventData3.equals((java.lang.Object) sSEConnection19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = sSEConnection19.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}" + "'", str4, "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration12);
        org.junit.Assert.assertNotNull(sseConfiguration14);
        org.junit.Assert.assertNotNull(sseConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.retryInterval((int) (short) 10);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onClose(strConsumer12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='hi!', origin='hi!', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ClientConfiguration clientConfiguration4 = new io.joshworks.stream.client.ClientConfiguration("io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration3.onClose(webSocketChannelBiConsumer4);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionMonitor3.add("io.joshworks.stream.client.StreamConnectionError: hi!", runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("");
        org.junit.Assert.assertNotNull(wsConfiguration1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        long long5 = disconnectedStatistics4.getWritten();
        disconnectedStatistics4.reset();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError1 = new io.joshworks.stream.client.StreamConnectionError("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        boolean boolean5 = wsConnection3.isOpen();
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNull(webSocketChannel4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration4 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration6 = sseConfiguration4.lastEventId("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onClose(webSocketChannelBiConsumer2);
        io.joshworks.stream.client.ws.WsConnection wsConnection4 = wsConfiguration1.connect();
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection4.sendBinary(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConnection4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.lang.Runnable runnable4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onFailedAttempt(runnable4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onBinary(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration5.retryInterval((int) '#');
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer10 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration11 = wsConfiguration9.onClose(webSocketChannelBiConsumer10);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
        org.junit.Assert.assertNotNull(wsConfiguration11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.retryInterval((int) (short) 10);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onError(exceptionConsumer12);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration9.onEvent(eventDataConsumer14);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration9.maxRetries((int) (short) 1);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration19 = sseConfiguration17.retryInterval((int) 'a');
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
        org.junit.Assert.assertNotNull(sseConfiguration19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.lang.Runnable runnable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionMonitor3.add("", runnable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.toString();
        java.lang.String str5 = eventData3.id;
        java.lang.String str6 = eventData3.id;
        java.lang.String str7 = eventData3.id;
        java.lang.String str8 = eventData3.id;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str4, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.retryInterval((int) (short) 10);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onError(exceptionConsumer12);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration9.onEvent(eventDataConsumer14);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration9.lastEventId("");
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException((int) '4', "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("hi!", sseClientCallback1);
        io.undertow.client.ClientStatistics clientStatistics3 = sSEConnection2.statistics();
        java.lang.String str4 = sSEConnection2.close();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertNotNull(clientStatistics3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onBinary(webSocketChannelBiConsumer5);
        org.junit.Assert.assertNotNull(wsConfiguration6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onClose(strConsumer6);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.clientCallback(sseClientCallback8);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onBinary(webSocketChannelBiConsumer4);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.retryInterval((int) (byte) 100);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration7.maxRetries((int) (short) 100);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration11 = wsConfiguration7.onFailedAttempt(runnable10);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
        org.junit.Assert.assertNotNull(wsConfiguration11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException((int) (short) -1, "hi!");
        int int3 = clientException2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.Throwable throwable2 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError3 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable2);
        java.lang.Throwable throwable5 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError6 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable5);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError6);
        java.lang.Throwable throwable9 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError10 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable9);
        java.lang.Throwable throwable12 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError13 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable12);
        streamConnectionError10.addSuppressed((java.lang.Throwable) streamConnectionError13);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError13);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError16 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError3);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError17 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", (java.lang.Throwable) streamConnectionError16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        sSEConnection13.connect();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sSEConnection13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.lang.String str4 = eventData3.origin;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.Throwable throwable2 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError3 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable2);
        java.lang.Throwable throwable5 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError6 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable5);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError6);
        java.lang.Throwable throwable9 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError10 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable9);
        java.lang.Throwable throwable12 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError13 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable12);
        streamConnectionError10.addSuppressed((java.lang.Throwable) streamConnectionError13);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError13);
        java.lang.Throwable[] throwableArray16 = streamConnectionError3.getSuppressed();
        io.joshworks.stream.client.StreamConnectionError streamConnectionError17 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='hi!', id='', origin='null', event='hi!'}", (java.lang.Throwable) streamConnectionError3);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException(97, "io.joshworks.stream.client.StreamConnectionError: hi!");
        java.lang.String str3 = clientException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!" + "'", str3, "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError1 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='hi!', id='', origin='null', event='hi!'}");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.clientCallback(sseClientCallback12);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration13.onError(exceptionConsumer14);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint2 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint2);
        io.joshworks.stream.client.ws.WsConnection wsConnection4 = io.joshworks.stream.client.StreamClient.connect("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", webSocketClientEndpoint2);
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNotNull(wsConnection4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection6 = sseConfiguration5.connect();
        io.undertow.client.ClientStatistics clientStatistics7 = sSEConnection6.statistics();
        org.junit.Assert.assertNotNull(sSEConnection6);
        org.junit.Assert.assertNotNull(clientStatistics7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener5 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        org.xnio.channels.StreamSourceChannel streamSourceChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventStreamChannelListener5.setup(streamSourceChannel6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.undertow.client.ClientStatistics clientStatistics14 = sSEConnection13.statistics();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sSEConnection13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
        org.junit.Assert.assertNotNull(clientStatistics14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        io.undertow.websockets.core.CloseMessage closeMessage5 = null;
        wsConnection3.close(closeMessage5);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNull(webSocketChannel4);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 1, 0, 10]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        io.undertow.websockets.core.CloseMessage closeMessage5 = null;
        wsConnection3.close(closeMessage5);
        java.nio.ByteBuffer byteBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNull(webSocketChannel4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("", "hi!", "hi!");
        java.lang.String str4 = eventData3.event;
        java.lang.String str5 = eventData3.origin;
        java.lang.String str6 = eventData3.origin;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError1 = new io.joshworks.stream.client.StreamConnectionError("hi!");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics3 = sSEConnection2.new DisconnectedStatistics();
        long long4 = disconnectedStatistics3.getRead();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.lang.Runnable runnable4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onFailedAttempt(runnable4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onBinary(webSocketChannelBiConsumer6);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer8 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration5.onPing(webSocketChannelBiConsumer8);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer10 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration11 = wsConfiguration9.onBinary(webSocketChannelBiConsumer10);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
        org.junit.Assert.assertNotNull(wsConfiguration11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics5 = sSEConnection2.new DisconnectedStatistics();
        disconnectedStatistics5.reset();
        long long7 = disconnectedStatistics5.getWritten();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError5);
        io.joshworks.stream.client.ClientException clientException9 = new io.joshworks.stream.client.ClientException((int) (short) 10, "hi!");
        streamConnectionError2.addSuppressed((java.lang.Throwable) clientException9);
        java.lang.Throwable[] throwableArray11 = clientException9.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener5 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        org.xnio.channels.StreamSourceChannel streamSourceChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventStreamChannelListener5.handleEvent(streamSourceChannel6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        wsConnection3.close();
        io.undertow.websockets.core.WebSocketChannel webSocketChannel5 = wsConnection3.channel();
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNull(webSocketChannel5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.maxRetries((int) '4');
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
        java.lang.String str4 = eventData3.origin;
        boolean boolean6 = eventData3.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException((-1), "hi!");
        int int3 = clientException2.getStatus();
        io.joshworks.stream.client.StreamConnectionError streamConnectionError4 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) clientException2);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) clientException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = sSEConnection13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
        java.lang.String str4 = eventData3.toString();
        org.xnio.XnioWorker xnioWorker6 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService7 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor8 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback9 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration10 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker6, scheduledExecutorService7, connectionMonitor8, sseClientCallback9);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer11 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration12 = sseConfiguration10.onEvent(eventDataConsumer11);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer13 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration14 = sseConfiguration10.onError(exceptionConsumer13);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer15 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration16 = sseConfiguration14.onEvent(eventDataConsumer15);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection19 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration16, "", sseClientCallback18);
        boolean boolean20 = eventData3.equals((java.lang.Object) sSEConnection19);
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics21 = sSEConnection19.new DisconnectedStatistics();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}" + "'", str4, "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration12);
        org.junit.Assert.assertNotNull(sseConfiguration14);
        org.junit.Assert.assertNotNull(sseConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        boolean boolean6 = wsConnection3.isOpen();
        io.undertow.websockets.core.CloseMessage closeMessage7 = null;
        wsConnection3.close(closeMessage7);
        wsConnection3.connect();
        boolean boolean10 = wsConnection3.isOpen();
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", "", "", "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener5 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        boolean boolean6 = uTF8Output3.hasData();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        org.xnio.XnioWorker xnioWorker2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor4 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint5 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker2, scheduledExecutorService3, connectionMonitor4, webSocketClientEndpoint5);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint7 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint5);
        io.joshworks.stream.client.ws.WsConnection wsConnection8 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint5);
        java.nio.ByteBuffer byteBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection8.sendBinary(byteBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", sseClientCallback1);
        io.undertow.client.ClientStatistics clientStatistics3 = sSEConnection2.statistics();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        io.undertow.client.ClientStatistics clientStatistics5 = sSEConnection2.statistics();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertNotNull(clientStatistics3);
        org.junit.Assert.assertNotNull(clientStatistics5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        disconnectedStatistics4.reset();
        long long6 = disconnectedStatistics4.getWritten();
        long long7 = disconnectedStatistics4.getWritten();
        long long8 = disconnectedStatistics4.getRequests();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.undertow.client.ClientStatistics clientStatistics4 = sSEConnection2.statistics();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(clientStatistics4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.retryInterval((int) (short) 10);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onError(exceptionConsumer12);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration9.onEvent(eventDataConsumer14);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration9.maxRetries((int) (short) 1);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration19 = sseConfiguration9.lastEventId("EventData{data='', id='hi!', origin='hi!', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
        org.junit.Assert.assertNotNull(sseConfiguration19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor9 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor9, sseClientCallback10);
        connectionMonitor9.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker4, scheduledExecutorService5, connectionMonitor9, sseClientCallback14);
        io.joshworks.stream.client.ClientConfiguration clientConfiguration16 = new io.joshworks.stream.client.ClientConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor6);
        java.lang.Runnable runnable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionMonitor6.add("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", runnable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser1 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output2 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser1);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener3 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output2);
        java.nio.ByteBuffer[] byteBufferArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uTF8Output2.write(byteBufferArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onBinary(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onText(webSocketChannelBiConsumer6);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        sSEConnection13.connect();
        io.undertow.client.ClientStatistics clientStatistics15 = sSEConnection13.statistics();
        boolean boolean16 = sSEConnection13.isOpen();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
        org.junit.Assert.assertNotNull(clientStatistics15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration1 = io.joshworks.stream.client.StreamClient.sse("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
        org.junit.Assert.assertNotNull(sseConfiguration1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration4 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.lang.Class<?> wildcardClass5 = sseConfiguration4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor12 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration13 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker10, scheduledExecutorService11, connectionMonitor12);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration14 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker7, scheduledExecutorService8, connectionMonitor12);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint16 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint17 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint16);
        io.joshworks.stream.client.ws.WsConnection wsConnection18 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint16);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration19 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor12, webSocketClientEndpoint16);
        io.joshworks.stream.client.ClientConfiguration clientConfiguration20 = new io.joshworks.stream.client.ClientConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor12);
        org.junit.Assert.assertNotNull(wsConnection18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onError(exceptionConsumer10);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onRetriesExceeded(runnable12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        long long5 = disconnectedStatistics4.getRead();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException((int) 'a', "EventData{data='', id='hi!', origin='hi!', event=''}");
        int int3 = clientException2.getStatus();
        int int4 = clientException2.getStatus();
        int int5 = clientException2.getStatus();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("hi!", "hi!", "hi!", "EventData{data='hi!', id='', origin='null', event='hi!'}");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("hi!", "EventData{data='hi!', id='', origin='null', event='hi!'}", "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", "EventData{data='', id='hi!', origin='hi!', event=''}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError5);
        java.lang.Throwable throwable8 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError9 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable8);
        java.lang.Throwable throwable11 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError12 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable11);
        streamConnectionError9.addSuppressed((java.lang.Throwable) streamConnectionError12);
        java.lang.Throwable throwable15 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError16 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable15);
        java.lang.Throwable throwable18 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError19 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable18);
        streamConnectionError16.addSuppressed((java.lang.Throwable) streamConnectionError19);
        streamConnectionError9.addSuppressed((java.lang.Throwable) streamConnectionError19);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError19);
        java.lang.String str23 = streamConnectionError2.toString();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "io.joshworks.stream.client.StreamConnectionError: hi!" + "'", str23, "io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
        java.lang.String str4 = eventData3.toString();
        org.xnio.XnioWorker xnioWorker6 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService7 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor8 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback9 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration10 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker6, scheduledExecutorService7, connectionMonitor8, sseClientCallback9);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer11 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration12 = sseConfiguration10.onEvent(eventDataConsumer11);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer13 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration14 = sseConfiguration10.onError(exceptionConsumer13);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer15 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration16 = sseConfiguration14.onEvent(eventDataConsumer15);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection19 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration16, "", sseClientCallback18);
        boolean boolean20 = eventData3.equals((java.lang.Object) sSEConnection19);
        java.lang.String str21 = eventData3.data;
        java.lang.String str22 = eventData3.origin;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}" + "'", str4, "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration12);
        org.junit.Assert.assertNotNull(sseConfiguration14);
        org.junit.Assert.assertNotNull(sseConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.util.function.Consumer<io.undertow.websockets.core.WebSocketChannel> webSocketChannelConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onConnect(webSocketChannelConsumer4);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.retryInterval(100);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("io.joshworks.stream.client.StreamConnectionError: hi!", "EventData{data='', id='hi!', origin='hi!', event=''}", "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", "hi!");
        java.lang.String str5 = eventData4.id;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EventData{data='', id='hi!', origin='hi!', event=''}" + "'", str5, "EventData{data='', id='hi!', origin='hi!', event=''}");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback13 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection14 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration11, "io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback13);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.clientCallback(sseClientCallback8);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection10 = sseConfiguration9.connect();
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration12 = sseConfiguration9.retryInterval((int) (short) 1);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sSEConnection10);
        org.junit.Assert.assertNotNull(sseConfiguration12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.lastEventId("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.origin;
        java.lang.String str5 = eventData3.toString();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str5, "EventData{data='hi!', id='', origin='null', event='hi!'}");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint2 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint2);
        io.joshworks.stream.client.ws.WsConnection wsConnection4 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", webSocketClientEndpoint2);
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNotNull(wsConnection4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint3 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = null;
        proxyClientEndpoint3.onConnect(webSocketChannel4);
        org.junit.Assert.assertNotNull(wsConnection2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint0 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint1 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint0);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel2 = null;
        proxyClientEndpoint1.onConnect(webSocketChannel2);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = null;
        proxyClientEndpoint1.onConnect(webSocketChannel4);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxyClientEndpoint1.handleEvent(webSocketChannel6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.toString();
        java.lang.String str5 = eventData3.id;
        java.lang.String str6 = eventData3.data;
        java.lang.String str7 = eventData3.id;
        io.joshworks.stream.client.sse.EventData eventData11 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str12 = eventData11.toString();
        boolean boolean13 = eventData3.equals((java.lang.Object) eventData11);
        java.lang.String str14 = eventData3.event;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str4, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str12, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.toString();
        java.lang.String str5 = eventData3.event;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str4, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor6);
        java.lang.Runnable runnable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            connectionMonitor6.add("", runnable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.toString();
        java.lang.String str5 = eventData3.id;
        java.lang.String str6 = eventData3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str4, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str6, "EventData{data='hi!', id='', origin='null', event='hi!'}");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        org.xnio.XnioWorker xnioWorker13 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        org.xnio.XnioWorker xnioWorker16 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor18 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration19 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker16, scheduledExecutorService17, connectionMonitor18);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration20 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker13, scheduledExecutorService14, connectionMonitor18);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint22 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint23 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConnection wsConnection24 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration25 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker10, scheduledExecutorService11, connectionMonitor18, webSocketClientEndpoint22);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback26 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration27 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker7, scheduledExecutorService8, connectionMonitor18, sseClientCallback26);
        org.xnio.XnioWorker xnioWorker29 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService30 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor31 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint32 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration33 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker29, scheduledExecutorService30, connectionMonitor31, webSocketClientEndpoint32);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration34 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker4, scheduledExecutorService5, connectionMonitor18, webSocketClientEndpoint32);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration36 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer37 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration38 = wsConfiguration36.onPong(webSocketChannelBiConsumer37);
        java.lang.Runnable runnable39 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration40 = wsConfiguration36.onFailedAttempt(runnable39);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer41 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration42 = wsConfiguration40.onBinary(webSocketChannelBiConsumer41);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration44 = io.joshworks.stream.client.StreamClient.ws("hi!");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint46 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint47 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint46);
        io.joshworks.stream.client.ws.WsConnection wsConnection48 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint46);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration49 = wsConfiguration44.clientEndpoint(webSocketClientEndpoint46);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration50 = wsConfiguration42.clientEndpoint(webSocketClientEndpoint46);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration51 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor18, webSocketClientEndpoint46);
        org.junit.Assert.assertNotNull(wsConnection24);
        org.junit.Assert.assertNotNull(wsConfiguration36);
        org.junit.Assert.assertNotNull(wsConfiguration38);
        org.junit.Assert.assertNotNull(wsConfiguration40);
        org.junit.Assert.assertNotNull(wsConfiguration42);
        org.junit.Assert.assertNotNull(wsConfiguration44);
        org.junit.Assert.assertNotNull(wsConnection48);
        org.junit.Assert.assertNotNull(wsConfiguration49);
        org.junit.Assert.assertNotNull(wsConfiguration50);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        disconnectedStatistics4.reset();
        long long6 = disconnectedStatistics4.getWritten();
        long long7 = disconnectedStatistics4.getWritten();
        disconnectedStatistics4.reset();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor6);
        connectionMonitor6.remove("hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.origin;
        java.lang.String str5 = eventData3.origin;
        java.lang.Throwable throwable7 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError8 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable7);
        java.lang.Throwable throwable10 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError11 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable10);
        streamConnectionError8.addSuppressed((java.lang.Throwable) streamConnectionError11);
        java.lang.Throwable throwable14 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError15 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable14);
        java.lang.Throwable throwable17 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError18 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable17);
        streamConnectionError15.addSuppressed((java.lang.Throwable) streamConnectionError18);
        streamConnectionError8.addSuppressed((java.lang.Throwable) streamConnectionError18);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError21 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError8);
        java.lang.Throwable[] throwableArray22 = streamConnectionError8.getSuppressed();
        boolean boolean23 = eventData3.equals((java.lang.Object) throwableArray22);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics5 = sSEConnection2.new DisconnectedStatistics();
        long long6 = disconnectedStatistics5.getWritten();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError3 = new io.joshworks.stream.client.StreamConnectionError(throwable1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onFailedAttempt(runnable10);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onOpen(runnable12);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration11.onEvent(eventDataConsumer14);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration11.maxRetries((int) (byte) 100);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback13 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection14 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration11, "", sseClientCallback13);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration16 = sseConfiguration11.maxRetries((int) (byte) 0);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration16);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onRetriesExceeded(runnable10);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onEvent(eventDataConsumer12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        io.joshworks.stream.client.ws.WsConnection wsConnection2 = wsConfiguration1.connect();
        boolean boolean3 = wsConnection2.isOpen();
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.event;
        java.lang.String str5 = eventData3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str5, "EventData{data='hi!', id='', origin='null', event='hi!'}");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.String> strConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onClose(strConsumer6);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.lastEventId("hi!");
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError5);
        io.joshworks.stream.client.ClientException clientException9 = new io.joshworks.stream.client.ClientException((int) (short) 10, "hi!");
        streamConnectionError2.addSuppressed((java.lang.Throwable) clientException9);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError11 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError2);
        java.lang.Throwable throwable13 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError14 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable13);
        java.lang.Throwable throwable16 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError17 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable16);
        streamConnectionError14.addSuppressed((java.lang.Throwable) streamConnectionError17);
        io.joshworks.stream.client.ClientException clientException21 = new io.joshworks.stream.client.ClientException((int) (short) 10, "hi!");
        streamConnectionError14.addSuppressed((java.lang.Throwable) clientException21);
        streamConnectionError2.addSuppressed((java.lang.Throwable) clientException21);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError24 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) clientException21);
        java.lang.Throwable[] throwableArray25 = streamConnectionError24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = streamConnectionError24.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint3 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint4 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        org.junit.Assert.assertNotNull(wsConnection2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint4 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3, webSocketClientEndpoint4);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint6 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint4);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel7 = null;
        proxyClientEndpoint6.onConnect(webSocketChannel7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        java.lang.String str5 = uTF8Output3.extract();
        java.lang.String str6 = uTF8Output3.extract();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener7 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        org.xnio.channels.StreamSourceChannel streamSourceChannel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventStreamChannelListener7.handleEvent(streamSourceChannel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("", "", "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback9 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration10 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor6, sseClientCallback9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onText(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onBinary(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint8 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration1.clientEndpoint(webSocketClientEndpoint8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration11 = wsConfiguration9.onRetriesExceeded(runnable10);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
        org.junit.Assert.assertNotNull(wsConfiguration11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser1 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output2 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser1);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener3 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output2);
        java.lang.String str4 = uTF8Output2.extract();
        boolean boolean5 = uTF8Output2.hasData();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onClose(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration3.onClose(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onClose(webSocketChannelBiConsumer6);
        java.util.function.Consumer<io.undertow.websockets.core.WebSocketChannel> webSocketChannelConsumer8 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration5.onConnect(webSocketChannelConsumer8);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, java.lang.Exception> webSocketChannelBiConsumer5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onError(webSocketChannelBiConsumer5);
        java.lang.Runnable runnable7 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration8 = wsConfiguration6.onFailedAttempt(runnable7);
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConfiguration8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor9 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor9, sseClientCallback10);
        connectionMonitor9.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker4, scheduledExecutorService5, connectionMonitor9, sseClientCallback14);
        org.xnio.XnioWorker xnioWorker18 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService19 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor20 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint21 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration22 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker18, scheduledExecutorService19, connectionMonitor20, webSocketClientEndpoint21);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint23 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint21);
        io.joshworks.stream.client.ws.WsConnection wsConnection24 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint21);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration25 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor9, webSocketClientEndpoint21);
        java.util.function.Consumer<io.undertow.websockets.core.WebSocketChannel> webSocketChannelConsumer26 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration27 = wsConfiguration25.onConnect(webSocketChannelConsumer26);
        org.junit.Assert.assertNotNull(wsConnection24);
        org.junit.Assert.assertNotNull(wsConfiguration27);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback11 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection12 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration9, "io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback11);
        io.undertow.client.ClientStatistics clientStatistics13 = sSEConnection12.statistics();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics14 = sSEConnection12.new DisconnectedStatistics();
        sSEConnection12.connect();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(clientStatistics13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.lang.Runnable runnable4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration3.onRetriesExceeded(runnable4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onPong(webSocketChannelBiConsumer6);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor9 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor9, sseClientCallback10);
        connectionMonitor9.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        connectionMonitor9.remove("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback16 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor9, sseClientCallback16);
        org.xnio.XnioWorker xnioWorker20 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService21 = null;
        org.xnio.XnioWorker xnioWorker23 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService24 = null;
        org.xnio.XnioWorker xnioWorker26 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService27 = null;
        org.xnio.XnioWorker xnioWorker29 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService30 = null;
        org.xnio.XnioWorker xnioWorker32 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService33 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor34 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration35 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker32, scheduledExecutorService33, connectionMonitor34);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration36 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker29, scheduledExecutorService30, connectionMonitor34);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint38 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint39 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.WsConnection wsConnection40 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration41 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker26, scheduledExecutorService27, connectionMonitor34, webSocketClientEndpoint38);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback42 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration43 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker23, scheduledExecutorService24, connectionMonitor34, sseClientCallback42);
        org.xnio.XnioWorker xnioWorker45 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService46 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor47 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint48 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration49 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker45, scheduledExecutorService46, connectionMonitor47, webSocketClientEndpoint48);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration50 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker20, scheduledExecutorService21, connectionMonitor34, webSocketClientEndpoint48);
        io.joshworks.stream.client.ws.WsConnection wsConnection51 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint48);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration52 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor9, webSocketClientEndpoint48);
        org.junit.Assert.assertNotNull(wsConnection40);
        org.junit.Assert.assertNotNull(wsConnection51);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.lang.Runnable runnable6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onFailedAttempt(runnable6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onOpen(runnable8);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback11 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection12 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration9, "io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = sSEConnection12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint0 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint1 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint0);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxyClientEndpoint1.handleEvent(webSocketChannel2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration1 = io.joshworks.stream.client.StreamClient.sse("io.joshworks.stream.client.StreamConnectionError: hi!");
        org.junit.Assert.assertNotNull(sseConfiguration1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint4 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3, webSocketClientEndpoint4);
        java.lang.Runnable runnable6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onRetriesExceeded(runnable6);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration5.retryInterval(0);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError5);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError7 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError2);
        java.lang.Class<?> wildcardClass8 = streamConnectionError2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration11.maxRetries((int) (short) -1);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer16 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration11.onError(exceptionConsumer16);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError3 = new io.joshworks.stream.client.StreamConnectionError("", (java.lang.Throwable) streamConnectionError2);
        java.lang.Throwable throwable5 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError6 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable5);
        java.lang.Throwable throwable8 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError9 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable8);
        streamConnectionError6.addSuppressed((java.lang.Throwable) streamConnectionError9);
        java.lang.Throwable throwable12 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError13 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable12);
        java.lang.Throwable throwable15 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError16 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable15);
        streamConnectionError13.addSuppressed((java.lang.Throwable) streamConnectionError16);
        streamConnectionError6.addSuppressed((java.lang.Throwable) streamConnectionError16);
        io.joshworks.stream.client.ClientException clientException21 = new io.joshworks.stream.client.ClientException((int) (short) -1, "hi!");
        java.lang.Throwable throwable23 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError24 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable23);
        java.lang.Throwable throwable26 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError27 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable26);
        streamConnectionError24.addSuppressed((java.lang.Throwable) streamConnectionError27);
        java.lang.Throwable throwable30 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError31 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable30);
        java.lang.Throwable throwable33 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError34 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable33);
        streamConnectionError31.addSuppressed((java.lang.Throwable) streamConnectionError34);
        streamConnectionError24.addSuppressed((java.lang.Throwable) streamConnectionError34);
        clientException21.addSuppressed((java.lang.Throwable) streamConnectionError24);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError38 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError24);
        streamConnectionError6.addSuppressed((java.lang.Throwable) streamConnectionError38);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError38);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor6);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer10 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration11 = wsConfiguration9.onPing(webSocketChannelBiConsumer10);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration13 = wsConfiguration11.retryInterval((int) (byte) 100);
        org.junit.Assert.assertNotNull(wsConfiguration11);
        org.junit.Assert.assertNotNull(wsConfiguration13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onPong(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onPing(webSocketChannelBiConsumer6);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, java.lang.Exception> webSocketChannelBiConsumer8 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration7.onError(webSocketChannelBiConsumer8);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("", "hi!", "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.lang.Runnable runnable4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onFailedAttempt(runnable4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onBinary(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration5.retryInterval((int) '#');
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback11 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection12 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) wsConfiguration9, "io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback11);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("io.joshworks.stream.client.StreamConnectionError: hi!", "io.joshworks.stream.client.StreamConnectionError: hi!", "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("", "hi!", "", "hi!");
        io.joshworks.stream.client.sse.EventData eventData8 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
        boolean boolean9 = eventData4.equals((java.lang.Object) "");
        java.lang.String str10 = eventData4.event;
        io.joshworks.stream.client.sse.EventData eventData14 = new io.joshworks.stream.client.sse.EventData("", "hi!", "hi!");
        java.lang.String str15 = eventData14.origin;
        boolean boolean16 = eventData4.equals((java.lang.Object) eventData14);
        java.lang.String str17 = eventData14.origin;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.Throwable throwable1 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable1);
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError5);
        io.joshworks.stream.client.ClientException clientException9 = new io.joshworks.stream.client.ClientException((int) (short) 10, "hi!");
        streamConnectionError2.addSuppressed((java.lang.Throwable) clientException9);
        int int11 = clientException9.getStatus();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.Throwable throwable2 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError3 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable2);
        java.lang.Throwable throwable5 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError6 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable5);
        streamConnectionError3.addSuppressed((java.lang.Throwable) streamConnectionError6);
        io.joshworks.stream.client.ClientException clientException10 = new io.joshworks.stream.client.ClientException((int) (short) 10, "hi!");
        streamConnectionError3.addSuppressed((java.lang.Throwable) clientException10);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError12 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError3);
        java.lang.Throwable throwable14 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError15 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable14);
        java.lang.Throwable throwable17 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError18 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable17);
        streamConnectionError15.addSuppressed((java.lang.Throwable) streamConnectionError18);
        io.joshworks.stream.client.ClientException clientException22 = new io.joshworks.stream.client.ClientException((int) (short) 10, "hi!");
        streamConnectionError15.addSuppressed((java.lang.Throwable) clientException22);
        streamConnectionError3.addSuppressed((java.lang.Throwable) clientException22);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError25 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) clientException22);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError26 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", (java.lang.Throwable) clientException22);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor9 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor9, sseClientCallback10);
        connectionMonitor9.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker4, scheduledExecutorService5, connectionMonitor9, sseClientCallback14);
        connectionMonitor9.remove("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration19 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='hi!', origin='hi!', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor9, sseClientCallback18);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError1 = new io.joshworks.stream.client.StreamConnectionError("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onError(exceptionConsumer12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        boolean boolean6 = wsConnection3.isOpen();
        io.undertow.websockets.core.CloseMessage closeMessage7 = null;
        wsConnection3.close(closeMessage7);
        wsConnection3.close();
        boolean boolean10 = wsConnection3.isOpen();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 10, 0]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.undertow.client.ClientStatistics clientStatistics14 = sSEConnection13.statistics();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics15 = sSEConnection13.new DisconnectedStatistics();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
        org.junit.Assert.assertNotNull(clientStatistics14);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onFailedAttempt(runnable10);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onOpen(runnable12);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration11.onEvent(eventDataConsumer14);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback16 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration15.clientCallback(sseClientCallback16);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration19 = sseConfiguration17.clientCallback(sseClientCallback18);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
        org.junit.Assert.assertNotNull(sseConfiguration19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("", "hi!", "", "hi!");
        io.joshworks.stream.client.sse.EventData eventData8 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
        boolean boolean9 = eventData4.equals((java.lang.Object) "");
        java.lang.String str10 = eventData4.toString();
        java.lang.String str11 = eventData4.origin;
        java.lang.String str12 = eventData4.event;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EventData{data='', id='hi!', origin='hi!', event=''}" + "'", str10, "EventData{data='', id='hi!', origin='hi!', event=''}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onText(webSocketChannelBiConsumer4);
        java.lang.Runnable runnable6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onFailedAttempt(runnable6);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection10 = sseConfiguration9.connect();
        java.util.function.Consumer<java.lang.String> strConsumer11 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration12 = sseConfiguration9.onClose(strConsumer11);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sSEConnection10);
        org.junit.Assert.assertNotNull(sseConfiguration12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.lang.Runnable runnable6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onFailedAttempt(runnable6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("EventData{data='', id='hi!', origin='hi!', event=''}", "EventData{data='hi!', id='', origin='null', event='hi!'}", "EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        boolean boolean4 = wsConnection3.isOpen();
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        boolean boolean6 = wsConnection3.isOpen();
        io.undertow.websockets.core.CloseMessage closeMessage7 = null;
        wsConnection3.close(closeMessage7);
        io.undertow.websockets.core.CloseMessage closeMessage9 = null;
        wsConnection3.close(closeMessage9);
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback11 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection12 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration9, "io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback11);
        io.undertow.client.ClientStatistics clientStatistics13 = sSEConnection12.statistics();
        boolean boolean14 = sSEConnection12.isOpen();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = sSEConnection12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(clientStatistics13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration5.onClose(strConsumer10);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.retryInterval(100);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.maxRetries(100);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.lang.Runnable runnable5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onRetriesExceeded(runnable5);
        org.junit.Assert.assertNotNull(wsConfiguration6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        io.undertow.client.ClientStatistics clientStatistics3 = sSEConnection2.statistics();
        boolean boolean4 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics5 = sSEConnection2.new DisconnectedStatistics();
        disconnectedStatistics5.reset();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertNotNull(clientStatistics3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor9 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration10 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor9);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker4, scheduledExecutorService5, connectionMonitor9);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration12 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='hi!', origin='hi!', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor9 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor9, sseClientCallback10);
        connectionMonitor9.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        connectionMonitor9.remove("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback16 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor9, sseClientCallback16);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration19 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor9, sseClientCallback18);
        java.lang.Runnable runnable20 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration21 = sseConfiguration19.onRetriesExceeded(runnable20);
        org.junit.Assert.assertNotNull(sseConfiguration21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection9 = sseConfiguration5.connect("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        io.joshworks.stream.client.sse.SSEConnection sSEConnection10 = sseConfiguration5.connect();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sSEConnection9);
        org.junit.Assert.assertNotNull(sSEConnection10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback1);
        org.junit.Assert.assertNotNull(sSEConnection2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.maxRetries((int) (short) 0);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onRetriesExceeded(runnable12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException((-1), "hi!");
        java.lang.String str3 = clientException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "io.joshworks.stream.client.ClientException: hi!" + "'", str3, "io.joshworks.stream.client.ClientException: hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onBinary(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, java.lang.Exception> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onError(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback9 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection10 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) wsConfiguration1, "hi!", sseClientCallback9);
        sSEConnection10.connect();
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        io.undertow.client.ClientStatistics clientStatistics3 = sSEConnection2.statistics();
        boolean boolean4 = sSEConnection2.isOpen();
        io.undertow.client.ClientStatistics clientStatistics5 = sSEConnection2.statistics();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertNotNull(clientStatistics3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(clientStatistics5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint0 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint1 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint0);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel2 = null;
        proxyClientEndpoint1.onConnect(webSocketChannel2);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = null;
        proxyClientEndpoint1.onConnect(webSocketChannel4);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel6 = null;
        proxyClientEndpoint1.onConnect(webSocketChannel6);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxyClientEndpoint1.handleEvent(webSocketChannel8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onClose(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration3.onClose(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onClose(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback9 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection10 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) wsConfiguration7, "", sseClientCallback9);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        connectionMonitor6.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        connectionMonitor6.remove("EventData{data='', id='hi!', origin='hi!', event=''}");
        org.xnio.XnioWorker xnioWorker15 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        org.xnio.XnioWorker xnioWorker18 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService19 = null;
        org.xnio.XnioWorker xnioWorker21 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService22 = null;
        org.xnio.XnioWorker xnioWorker24 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService25 = null;
        org.xnio.XnioWorker xnioWorker27 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService28 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor29 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration30 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker27, scheduledExecutorService28, connectionMonitor29);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration31 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker24, scheduledExecutorService25, connectionMonitor29);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint33 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint34 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint33);
        io.joshworks.stream.client.ws.WsConnection wsConnection35 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint33);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration36 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker21, scheduledExecutorService22, connectionMonitor29, webSocketClientEndpoint33);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback37 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration38 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker18, scheduledExecutorService19, connectionMonitor29, sseClientCallback37);
        org.xnio.XnioWorker xnioWorker40 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService41 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor42 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint43 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration44 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker40, scheduledExecutorService41, connectionMonitor42, webSocketClientEndpoint43);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration45 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker15, scheduledExecutorService16, connectionMonitor29, webSocketClientEndpoint43);
        io.joshworks.stream.client.ws.WsConnection wsConnection46 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint43);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration47 = new io.joshworks.stream.client.ws.WsConfiguration("io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor6, webSocketClientEndpoint43);
        java.lang.Runnable runnable48 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration49 = wsConfiguration47.onFailedAttempt(runnable48);
        org.junit.Assert.assertNotNull(wsConnection35);
        org.junit.Assert.assertNotNull(wsConnection46);
        org.junit.Assert.assertNotNull(wsConfiguration49);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        io.undertow.websockets.core.CloseMessage closeMessage5 = null;
        wsConnection3.close(closeMessage5);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel7 = wsConnection3.channel();
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNull(webSocketChannel4);
        org.junit.Assert.assertNull(webSocketChannel7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onError(exceptionConsumer12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, java.lang.Exception> webSocketChannelBiConsumer5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onError(webSocketChannelBiConsumer5);
        io.joshworks.stream.client.ws.WsConnection wsConnection7 = wsConfiguration4.connect();
        org.xnio.XnioWorker xnioWorker9 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService10 = null;
        org.xnio.XnioWorker xnioWorker12 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService13 = null;
        org.xnio.XnioWorker xnioWorker15 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService16 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor17 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback18 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration19 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker15, scheduledExecutorService16, connectionMonitor17, sseClientCallback18);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration20 = new io.joshworks.stream.client.ws.WsConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker12, scheduledExecutorService13, connectionMonitor17);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint22 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint23 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConnection wsConnection24 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration25 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker9, scheduledExecutorService10, connectionMonitor17, webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration26 = wsConfiguration4.clientEndpoint(webSocketClientEndpoint22);
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConnection7);
        org.junit.Assert.assertNotNull(wsConnection24);
        org.junit.Assert.assertNotNull(wsConfiguration26);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onEvent(eventDataConsumer12);
        java.lang.Runnable runnable14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration13.onFailedAttempt(runnable14);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onRetriesExceeded(runnable10);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onRetriesExceeded(runnable12);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback14 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration13.clientCallback(sseClientCallback14);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        io.joshworks.stream.client.sse.EventData eventData4 = new io.joshworks.stream.client.sse.EventData("", "EventData{data='hi!', id='', origin='null', event='hi!'}", "", "EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.lang.Class<?> wildcardClass5 = eventData4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError2 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='', id='hi!', origin='hi!', event=''}");
        java.lang.Throwable throwable4 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError5 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable4);
        java.lang.Throwable throwable7 = null;
        io.joshworks.stream.client.StreamConnectionError streamConnectionError8 = new io.joshworks.stream.client.StreamConnectionError("hi!", throwable7);
        streamConnectionError5.addSuppressed((java.lang.Throwable) streamConnectionError8);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError10 = new io.joshworks.stream.client.StreamConnectionError((java.lang.Throwable) streamConnectionError5);
        streamConnectionError2.addSuppressed((java.lang.Throwable) streamConnectionError10);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError12 = new io.joshworks.stream.client.StreamConnectionError("", (java.lang.Throwable) streamConnectionError10);
        io.joshworks.stream.client.StreamConnectionError streamConnectionError15 = new io.joshworks.stream.client.StreamConnectionError("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.StreamConnectionError streamConnectionError16 = new io.joshworks.stream.client.StreamConnectionError("", (java.lang.Throwable) streamConnectionError15);
        streamConnectionError10.addSuppressed((java.lang.Throwable) streamConnectionError15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor6 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback7 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration8 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker4, scheduledExecutorService5, connectionMonitor6, sseClientCallback7);
        connectionMonitor6.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.ClientConfiguration clientConfiguration11 = new io.joshworks.stream.client.ClientConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.clientCallback(sseClientCallback8);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection10 = sseConfiguration9.connect();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = sSEConnection10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sSEConnection10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.lang.Runnable runnable4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onFailedAttempt(runnable4);
        java.util.function.Consumer<io.undertow.websockets.core.WebSocketChannel> webSocketChannelConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onConnect(webSocketChannelConsumer6);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", sseClientCallback1);
        java.lang.String str3 = sSEConnection2.close();
        java.lang.String str4 = sSEConnection2.close();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onFailedAttempt(runnable10);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.onOpen(runnable12);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration11.retryInterval((int) ' ');
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool2 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser3 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output4 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser3);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener5 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool2, uTF8Output4);
        java.lang.String str6 = uTF8Output4.extract();
        java.lang.String str7 = uTF8Output4.extract();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener8 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output4);
        boolean boolean9 = uTF8Output4.hasData();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener10 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        org.xnio.XnioWorker xnioWorker13 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        org.xnio.XnioWorker xnioWorker16 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor18 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback19 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration20 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker16, scheduledExecutorService17, connectionMonitor18, sseClientCallback19);
        connectionMonitor18.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        connectionMonitor18.remove("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback25 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration26 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker13, scheduledExecutorService14, connectionMonitor18, sseClientCallback25);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration28 = io.joshworks.stream.client.StreamClient.ws("hi!");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint30 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint31 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint30);
        io.joshworks.stream.client.ws.WsConnection wsConnection32 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint30);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration33 = wsConfiguration28.clientEndpoint(webSocketClientEndpoint30);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration34 = new io.joshworks.stream.client.ws.WsConfiguration("hi!", xnioWorker10, scheduledExecutorService11, connectionMonitor18, webSocketClientEndpoint30);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration35 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor18);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration36 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker4, scheduledExecutorService5, connectionMonitor18);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint37 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint38 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint37);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration39 = new io.joshworks.stream.client.ws.WsConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor18, webSocketClientEndpoint37);
        org.junit.Assert.assertNotNull(wsConfiguration28);
        org.junit.Assert.assertNotNull(wsConnection32);
        org.junit.Assert.assertNotNull(wsConfiguration33);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("io.joshworks.stream.client.StreamConnectionError: hi!", "EventData{data='hi!', id='', origin='null', event='hi!'}", "");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint5 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection6 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint5);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration3.clientEndpoint(webSocketClientEndpoint5);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConnection6);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.maxRetries((int) (short) 0);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration11.maxRetries((-1));
        io.joshworks.stream.client.sse.SSEConnection sSEConnection14 = sseConfiguration13.connect();
        boolean boolean15 = sSEConnection14.isOpen();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
        org.junit.Assert.assertNotNull(sSEConnection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        io.undertow.websockets.core.WebSocketChannel webSocketChannel5 = wsConnection3.channel();
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            wsConnection3.sendBinary(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertNull(webSocketChannel4);
        org.junit.Assert.assertNull(webSocketChannel5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        java.lang.Runnable runnable10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onRetriesExceeded(runnable10);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.clientCallback(sseClientCallback12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        boolean boolean5 = uTF8Output3.hasData();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener6 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor12 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback13 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration14 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker10, scheduledExecutorService11, connectionMonitor12, sseClientCallback13);
        connectionMonitor12.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        connectionMonitor12.remove("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback19 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration20 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor12, sseClientCallback19);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration22 = io.joshworks.stream.client.StreamClient.ws("hi!");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint24 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint25 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint24);
        io.joshworks.stream.client.ws.WsConnection wsConnection26 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint24);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration27 = wsConfiguration22.clientEndpoint(webSocketClientEndpoint24);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration28 = new io.joshworks.stream.client.ws.WsConfiguration("hi!", xnioWorker4, scheduledExecutorService5, connectionMonitor12, webSocketClientEndpoint24);
        io.joshworks.stream.client.ClientConfiguration clientConfiguration29 = new io.joshworks.stream.client.ClientConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor12);
        org.junit.Assert.assertNotNull(wsConfiguration22);
        org.junit.Assert.assertNotNull(wsConnection26);
        org.junit.Assert.assertNotNull(wsConfiguration27);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration2 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = wsConfiguration2.onPong(webSocketChannelBiConsumer3);
        java.lang.Runnable runnable5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration2.onFailedAttempt(runnable5);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer7 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration8 = wsConfiguration6.onBinary(webSocketChannelBiConsumer7);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration10 = io.joshworks.stream.client.StreamClient.ws("hi!");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint12 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint13 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint12);
        io.joshworks.stream.client.ws.WsConnection wsConnection14 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint12);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration15 = wsConfiguration10.clientEndpoint(webSocketClientEndpoint12);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration16 = wsConfiguration8.clientEndpoint(webSocketClientEndpoint12);
        org.xnio.XnioWorker xnioWorker18 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService19 = null;
        org.xnio.XnioWorker xnioWorker21 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService22 = null;
        org.xnio.XnioWorker xnioWorker24 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService25 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor26 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback27 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration28 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker24, scheduledExecutorService25, connectionMonitor26, sseClientCallback27);
        connectionMonitor26.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback31 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration32 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker21, scheduledExecutorService22, connectionMonitor26, sseClientCallback31);
        org.xnio.XnioWorker xnioWorker35 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService36 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor37 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint38 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration39 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker35, scheduledExecutorService36, connectionMonitor37, webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint40 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.WsConnection wsConnection41 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration42 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker18, scheduledExecutorService19, connectionMonitor26, webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration43 = wsConfiguration8.clientEndpoint(webSocketClientEndpoint38);
        io.joshworks.stream.client.ws.WsConnection wsConnection44 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint38);
        boolean boolean45 = wsConnection44.isOpen();
        wsConnection44.close();
        org.junit.Assert.assertNotNull(wsConfiguration2);
        org.junit.Assert.assertNotNull(wsConfiguration4);
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConfiguration8);
        org.junit.Assert.assertNotNull(wsConfiguration10);
        org.junit.Assert.assertNotNull(wsConnection14);
        org.junit.Assert.assertNotNull(wsConfiguration15);
        org.junit.Assert.assertNotNull(wsConfiguration16);
        org.junit.Assert.assertNotNull(wsConnection41);
        org.junit.Assert.assertNotNull(wsConfiguration43);
        org.junit.Assert.assertNotNull(wsConnection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("hi!");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint3 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint4 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint3);
        io.joshworks.stream.client.ws.WsConnection wsConnection5 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint3);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration1.clientEndpoint(webSocketClientEndpoint3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer7 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration8 = wsConfiguration1.onText(webSocketChannelBiConsumer7);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConnection5);
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConfiguration8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.CloseMessage closeMessage4 = null;
        wsConnection3.close(closeMessage4);
        boolean boolean6 = wsConnection3.isOpen();
        io.undertow.websockets.core.CloseMessage closeMessage7 = null;
        wsConnection3.close(closeMessage7);
        wsConnection3.close();
        io.undertow.websockets.core.WebSocketChannel webSocketChannel10 = wsConnection3.channel();
        org.junit.Assert.assertNotNull(wsConnection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(webSocketChannel10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.clientCallback(sseClientCallback6);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.lastEventId("EventData{data='', id='hi!', origin='hi!', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.retryInterval((int) (short) 10);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onError(exceptionConsumer12);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback15 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection16 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) sseConfiguration9, "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", sseClientCallback15);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        uTF8Output3.write(byteBufferArray5);
        io.undertow.connector.ByteBufferPool byteBufferPool7 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser8 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output9 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser8);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener10 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool7, uTF8Output9);
        java.nio.ByteBuffer[] byteBufferArray11 = new java.nio.ByteBuffer[] {};
        uTF8Output9.write(byteBufferArray11);
        uTF8Output3.write(byteBufferArray11);
        java.lang.String str14 = uTF8Output3.extract();
        java.lang.String str15 = uTF8Output3.extract();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener16 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertNotNull(byteBufferArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onClose(webSocketChannelBiConsumer2);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.maxRetries(0);
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        org.xnio.XnioWorker xnioWorker13 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor15 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback16 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker13, scheduledExecutorService14, connectionMonitor15, sseClientCallback16);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration18 = new io.joshworks.stream.client.ws.WsConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker10, scheduledExecutorService11, connectionMonitor15);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint20 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint21 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint20);
        io.joshworks.stream.client.ws.WsConnection wsConnection22 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint20);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration23 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor15, webSocketClientEndpoint20);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration24 = wsConfiguration1.clientEndpoint(webSocketClientEndpoint20);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConnection22);
        org.junit.Assert.assertNotNull(wsConfiguration24);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onError(exceptionConsumer8);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onEvent(eventDataConsumer10);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = sseConfiguration11.connect("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration15 = sseConfiguration11.lastEventId("");
        java.util.function.Consumer<java.lang.String> strConsumer16 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = sseConfiguration15.onClose(strConsumer16);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection18 = sseConfiguration15.connect();
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sSEConnection13);
        org.junit.Assert.assertNotNull(sseConfiguration15);
        org.junit.Assert.assertNotNull(sseConfiguration17);
        org.junit.Assert.assertNotNull(sSEConnection18);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        io.joshworks.stream.client.ClientException clientException2 = new io.joshworks.stream.client.ClientException(100, "io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
        java.lang.Throwable[] throwableArray3 = clientException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        io.joshworks.stream.client.sse.EventData eventData3 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str4 = eventData3.toString();
        java.lang.String str5 = eventData3.id;
        java.lang.String str6 = eventData3.data;
        java.lang.String str7 = eventData3.id;
        io.joshworks.stream.client.sse.EventData eventData11 = new io.joshworks.stream.client.sse.EventData("hi!", "", "hi!");
        java.lang.String str12 = eventData11.toString();
        boolean boolean13 = eventData3.equals((java.lang.Object) eventData11);
        java.lang.String str14 = eventData11.id;
        java.lang.String str15 = eventData11.data;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str4, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EventData{data='hi!', id='', origin='null', event='hi!'}" + "'", str12, "EventData{data='hi!', id='', origin='null', event='hi!'}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onPong(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onClose(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration7.retryInterval((int) (short) 10);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.util.function.Consumer<io.undertow.websockets.core.WebSocketChannel> webSocketChannelConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onConnect(webSocketChannelConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onText(webSocketChannelBiConsumer6);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer8 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration5.onPing(webSocketChannelBiConsumer8);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor12 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback13 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration14 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker10, scheduledExecutorService11, connectionMonitor12, sseClientCallback13);
        connectionMonitor12.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        connectionMonitor12.remove("EventData{data='', id='hi!', origin='hi!', event=''}");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback19 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration20 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor12, sseClientCallback19);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration23 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer24 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration25 = wsConfiguration23.onPong(webSocketChannelBiConsumer24);
        java.lang.Runnable runnable26 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration27 = wsConfiguration23.onFailedAttempt(runnable26);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer28 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration29 = wsConfiguration27.onBinary(webSocketChannelBiConsumer28);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration31 = io.joshworks.stream.client.StreamClient.ws("hi!");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint33 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint34 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint33);
        io.joshworks.stream.client.ws.WsConnection wsConnection35 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint33);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration36 = wsConfiguration31.clientEndpoint(webSocketClientEndpoint33);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration37 = wsConfiguration29.clientEndpoint(webSocketClientEndpoint33);
        org.xnio.XnioWorker xnioWorker39 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService40 = null;
        org.xnio.XnioWorker xnioWorker42 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService43 = null;
        org.xnio.XnioWorker xnioWorker45 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService46 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor47 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback48 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration49 = new io.joshworks.stream.client.sse.SseConfiguration("", xnioWorker45, scheduledExecutorService46, connectionMonitor47, sseClientCallback48);
        connectionMonitor47.remove("io.joshworks.stream.client.StreamConnectionError: hi!");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback52 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration53 = new io.joshworks.stream.client.sse.SseConfiguration("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker42, scheduledExecutorService43, connectionMonitor47, sseClientCallback52);
        org.xnio.XnioWorker xnioWorker56 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService57 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor58 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint59 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration60 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker56, scheduledExecutorService57, connectionMonitor58, webSocketClientEndpoint59);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint61 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint59);
        io.joshworks.stream.client.ws.WsConnection wsConnection62 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint59);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration63 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker39, scheduledExecutorService40, connectionMonitor47, webSocketClientEndpoint59);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration64 = wsConfiguration29.clientEndpoint(webSocketClientEndpoint59);
        io.joshworks.stream.client.ws.WsConnection wsConnection65 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint59);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration66 = new io.joshworks.stream.client.ws.WsConfiguration("hi!", xnioWorker4, scheduledExecutorService5, connectionMonitor12, webSocketClientEndpoint59);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback67 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration68 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='hi!', origin='hi!', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor12, sseClientCallback67);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration70 = sseConfiguration68.lastEventId("io.joshworks.stream.client.ClientException: io.joshworks.stream.client.StreamConnectionError: hi!");
        org.junit.Assert.assertNotNull(wsConfiguration23);
        org.junit.Assert.assertNotNull(wsConfiguration25);
        org.junit.Assert.assertNotNull(wsConfiguration27);
        org.junit.Assert.assertNotNull(wsConfiguration29);
        org.junit.Assert.assertNotNull(wsConfiguration31);
        org.junit.Assert.assertNotNull(wsConnection35);
        org.junit.Assert.assertNotNull(wsConfiguration36);
        org.junit.Assert.assertNotNull(wsConfiguration37);
        org.junit.Assert.assertNotNull(wsConnection62);
        org.junit.Assert.assertNotNull(wsConfiguration64);
        org.junit.Assert.assertNotNull(wsConnection65);
        org.junit.Assert.assertNotNull(sseConfiguration70);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onText(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onBinary(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint8 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration1.clientEndpoint(webSocketClientEndpoint8);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint10 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint8);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        org.xnio.XnioWorker xnioWorker13 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        org.xnio.XnioWorker xnioWorker16 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService17 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor18 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration19 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker16, scheduledExecutorService17, connectionMonitor18);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration20 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker13, scheduledExecutorService14, connectionMonitor18);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint22 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint23 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConnection wsConnection24 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint22);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration25 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker10, scheduledExecutorService11, connectionMonitor18, webSocketClientEndpoint22);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback26 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration27 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker7, scheduledExecutorService8, connectionMonitor18, sseClientCallback26);
        org.xnio.XnioWorker xnioWorker29 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService30 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor31 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint32 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration33 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker29, scheduledExecutorService30, connectionMonitor31, webSocketClientEndpoint32);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration34 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker4, scheduledExecutorService5, connectionMonitor18, webSocketClientEndpoint32);
        io.joshworks.stream.client.ClientConfiguration clientConfiguration35 = new io.joshworks.stream.client.ClientConfiguration("io.joshworks.stream.client.StreamConnectionError: hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor18);
        org.junit.Assert.assertNotNull(wsConnection24);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser2 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output3 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser2);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener4 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output3);
        java.lang.String str5 = uTF8Output3.extract();
        java.lang.String str6 = uTF8Output3.extract();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener7 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output3);
        io.undertow.connector.ByteBufferPool byteBufferPool8 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser9 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output10 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser9);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener11 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool8, uTF8Output10);
        io.undertow.connector.ByteBufferPool byteBufferPool12 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser13 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output14 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser13);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener15 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool12, uTF8Output14);
        java.nio.ByteBuffer[] byteBufferArray16 = new java.nio.ByteBuffer[] {};
        uTF8Output14.write(byteBufferArray16);
        uTF8Output10.write(byteBufferArray16);
        io.undertow.connector.ByteBufferPool byteBufferPool19 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser20 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output21 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser20);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener22 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool19, uTF8Output21);
        java.nio.ByteBuffer[] byteBufferArray23 = new java.nio.ByteBuffer[] {};
        uTF8Output21.write(byteBufferArray23);
        io.undertow.connector.ByteBufferPool byteBufferPool25 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser26 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output27 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser26);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener28 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool25, uTF8Output27);
        java.nio.ByteBuffer[] byteBufferArray29 = new java.nio.ByteBuffer[] {};
        uTF8Output27.write(byteBufferArray29);
        uTF8Output21.write(byteBufferArray29);
        uTF8Output10.write(byteBufferArray29);
        io.undertow.connector.ByteBufferPool byteBufferPool33 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser34 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output35 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser34);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener36 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool33, uTF8Output35);
        java.nio.ByteBuffer[] byteBufferArray37 = new java.nio.ByteBuffer[] {};
        uTF8Output35.write(byteBufferArray37);
        io.undertow.connector.ByteBufferPool byteBufferPool39 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser40 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output41 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser40);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener42 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool39, uTF8Output41);
        java.nio.ByteBuffer[] byteBufferArray43 = new java.nio.ByteBuffer[] {};
        uTF8Output41.write(byteBufferArray43);
        uTF8Output35.write(byteBufferArray43);
        uTF8Output10.write(byteBufferArray43);
        uTF8Output3.write(byteBufferArray43);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertNotNull(byteBufferArray23);
        org.junit.Assert.assertNotNull(byteBufferArray29);
        org.junit.Assert.assertNotNull(byteBufferArray37);
        org.junit.Assert.assertNotNull(byteBufferArray43);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onPong(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onPong(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.CloseMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onClose(webSocketChannelBiConsumer6);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer8 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration7.onPong(webSocketChannelBiConsumer8);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        org.xnio.XnioWorker xnioWorker4 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService5 = null;
        org.xnio.XnioWorker xnioWorker7 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService8 = null;
        org.xnio.XnioWorker xnioWorker10 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService11 = null;
        org.xnio.XnioWorker xnioWorker13 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService14 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor15 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration16 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker13, scheduledExecutorService14, connectionMonitor15);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration17 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='hi!', id='', origin='null', event='hi!'}", xnioWorker10, scheduledExecutorService11, connectionMonitor15);
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint19 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint20 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint19);
        io.joshworks.stream.client.ws.WsConnection wsConnection21 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint19);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration22 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker7, scheduledExecutorService8, connectionMonitor15, webSocketClientEndpoint19);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback23 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration24 = new io.joshworks.stream.client.sse.SseConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker4, scheduledExecutorService5, connectionMonitor15, sseClientCallback23);
        org.xnio.XnioWorker xnioWorker26 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService27 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor28 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint29 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration30 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker26, scheduledExecutorService27, connectionMonitor28, webSocketClientEndpoint29);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration31 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor15, webSocketClientEndpoint29);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint32 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint29);
        org.junit.Assert.assertNotNull(wsConnection21);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onText(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration5.onBinary(webSocketChannelBiConsumer6);
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint1);
        boolean boolean3 = wsConnection2.isOpen();
        org.junit.Assert.assertNotNull(wsConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint4 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3, webSocketClientEndpoint4);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint6 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint4);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxyClientEndpoint6.handleEvent(webSocketChannel7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        org.xnio.XnioWorker xnioWorker2 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService3 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor4 = null;
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint5 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker2, scheduledExecutorService3, connectionMonitor4, webSocketClientEndpoint5);
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint7 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint5);
        io.joshworks.stream.client.ws.WsConnection wsConnection8 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint5);
        io.undertow.websockets.core.CloseMessage closeMessage9 = null;
        wsConnection8.close(closeMessage9);
        org.junit.Assert.assertNotNull(wsConnection8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser1 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output2 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser1);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener3 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output2);
        java.lang.String str4 = uTF8Output2.extract();
        io.undertow.connector.ByteBufferPool byteBufferPool5 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser6 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output7 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser6);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener8 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool5, uTF8Output7);
        io.undertow.connector.ByteBufferPool byteBufferPool9 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser10 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output11 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser10);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener12 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool9, uTF8Output11);
        java.nio.ByteBuffer[] byteBufferArray13 = new java.nio.ByteBuffer[] {};
        uTF8Output11.write(byteBufferArray13);
        uTF8Output7.write(byteBufferArray13);
        io.undertow.connector.ByteBufferPool byteBufferPool16 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser17 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output18 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser17);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener19 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool16, uTF8Output18);
        java.nio.ByteBuffer[] byteBufferArray20 = new java.nio.ByteBuffer[] {};
        uTF8Output18.write(byteBufferArray20);
        io.undertow.connector.ByteBufferPool byteBufferPool22 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser23 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output24 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser23);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener25 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool22, uTF8Output24);
        java.nio.ByteBuffer[] byteBufferArray26 = new java.nio.ByteBuffer[] {};
        uTF8Output24.write(byteBufferArray26);
        uTF8Output18.write(byteBufferArray26);
        uTF8Output7.write(byteBufferArray26);
        uTF8Output2.write(byteBufferArray26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertNotNull(byteBufferArray20);
        org.junit.Assert.assertNotNull(byteBufferArray26);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        io.undertow.connector.ByteBufferPool byteBufferPool0 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool1 = null;
        io.undertow.connector.ByteBufferPool byteBufferPool2 = null;
        io.joshworks.stream.client.sse.EventStreamParser eventStreamParser3 = null;
        io.joshworks.stream.client.sse.UTF8Output uTF8Output4 = new io.joshworks.stream.client.sse.UTF8Output(eventStreamParser3);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener5 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool2, uTF8Output4);
        java.lang.String str6 = uTF8Output4.extract();
        java.lang.String str7 = uTF8Output4.extract();
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener8 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool1, uTF8Output4);
        io.joshworks.stream.client.sse.EventStreamChannelListener eventStreamChannelListener9 = new io.joshworks.stream.client.sse.EventStreamChannelListener(byteBufferPool0, uTF8Output4);
        org.xnio.channels.StreamSourceChannel streamSourceChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            eventStreamChannelListener9.handleEvent(streamSourceChannel10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint2 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint3 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint2);
        io.joshworks.stream.client.ws.WsConnection wsConnection4 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint2);
        io.joshworks.stream.client.ws.WsConnection wsConnection5 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint2);
        org.junit.Assert.assertNotNull(wsConnection4);
        org.junit.Assert.assertNotNull(wsConnection5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.onClose(strConsumer10);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = new io.joshworks.stream.client.ConnectionMonitor();
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onText(webSocketChannelBiConsumer5);
        java.lang.Runnable runnable7 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration8 = wsConfiguration6.onRetriesExceeded(runnable7);
        java.lang.Runnable runnable9 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration10 = wsConfiguration8.onFailedAttempt(runnable9);
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback12 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection13 = new io.joshworks.stream.client.sse.SSEConnection((io.joshworks.stream.client.ClientConfiguration) wsConfiguration10, "hi!", sseClientCallback12);
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConfiguration8);
        org.junit.Assert.assertNotNull(wsConfiguration10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onEvent(eventDataConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        io.joshworks.stream.client.sse.SSEConnection sSEConnection11 = sseConfiguration5.connect("hi!");
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration5.onRetriesExceeded(runnable12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sSEConnection11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, java.lang.Exception> webSocketChannelBiConsumer5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onError(webSocketChannelBiConsumer5);
        io.joshworks.stream.client.ws.WsConnection wsConnection7 = wsConfiguration4.connect();
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer8 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration9 = wsConfiguration4.onPing(webSocketChannelBiConsumer8);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration11 = wsConfiguration4.retryInterval(97);
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConnection7);
        org.junit.Assert.assertNotNull(wsConfiguration9);
        org.junit.Assert.assertNotNull(wsConfiguration11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.util.function.Consumer<java.lang.String> strConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onClose(strConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.lastEventId("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}");
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        java.util.function.Consumer<java.lang.Exception> exceptionConsumer6 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.onError(exceptionConsumer6);
        java.lang.Runnable runnable8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration7.onOpen(runnable8);
        java.util.function.Consumer<java.lang.String> strConsumer10 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration7.onClose(strConsumer10);
        java.util.function.Consumer<java.lang.String> strConsumer12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration7.onClose(strConsumer12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback1 = null;
        io.joshworks.stream.client.sse.SSEConnection sSEConnection2 = io.joshworks.stream.client.StreamClient.connect("EventData{data='hi!', id='', origin='null', event='hi!'}", sseClientCallback1);
        boolean boolean3 = sSEConnection2.isOpen();
        io.joshworks.stream.client.sse.SSEConnection.DisconnectedStatistics disconnectedStatistics4 = sSEConnection2.new DisconnectedStatistics();
        disconnectedStatistics4.reset();
        long long6 = disconnectedStatistics4.getWritten();
        disconnectedStatistics4.reset();
        org.junit.Assert.assertNotNull(sSEConnection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.sse.SseClientCallback sseClientCallback4 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration5 = new io.joshworks.stream.client.sse.SseConfiguration("hi!", xnioWorker1, scheduledExecutorService2, connectionMonitor3, sseClientCallback4);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration7 = sseConfiguration5.lastEventId("");
        java.util.function.Consumer<io.joshworks.stream.client.sse.EventData> eventDataConsumer8 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration9 = sseConfiguration5.onEvent(eventDataConsumer8);
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration11 = sseConfiguration9.maxRetries((int) (short) 0);
        java.lang.Runnable runnable12 = null;
        io.joshworks.stream.client.sse.SseConfiguration sseConfiguration13 = sseConfiguration9.onFailedAttempt(runnable12);
        org.junit.Assert.assertNotNull(sseConfiguration7);
        org.junit.Assert.assertNotNull(sseConfiguration9);
        org.junit.Assert.assertNotNull(sseConfiguration11);
        org.junit.Assert.assertNotNull(sseConfiguration13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        org.xnio.XnioWorker xnioWorker1 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = null;
        io.joshworks.stream.client.ConnectionMonitor connectionMonitor3 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration4 = new io.joshworks.stream.client.ws.WsConfiguration("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", xnioWorker1, scheduledExecutorService2, connectionMonitor3);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer5 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration6 = wsConfiguration4.onPing(webSocketChannelBiConsumer5);
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration8 = wsConfiguration6.retryInterval((int) '4');
        org.junit.Assert.assertNotNull(wsConfiguration6);
        org.junit.Assert.assertNotNull(wsConfiguration8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer2 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration3 = wsConfiguration1.onText(webSocketChannelBiConsumer2);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedTextMessage> webSocketChannelBiConsumer4 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration5 = wsConfiguration1.onText(webSocketChannelBiConsumer4);
        java.util.function.BiConsumer<io.undertow.websockets.core.WebSocketChannel, io.undertow.websockets.core.BufferedBinaryMessage> webSocketChannelBiConsumer6 = null;
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration7 = wsConfiguration1.onBinary(webSocketChannelBiConsumer6);
        io.joshworks.stream.client.ws.WsConnection wsConnection8 = wsConfiguration7.connect();
        org.junit.Assert.assertNotNull(wsConfiguration1);
        org.junit.Assert.assertNotNull(wsConfiguration3);
        org.junit.Assert.assertNotNull(wsConfiguration5);
        org.junit.Assert.assertNotNull(wsConfiguration7);
        org.junit.Assert.assertNotNull(wsConnection8);
    }
}

