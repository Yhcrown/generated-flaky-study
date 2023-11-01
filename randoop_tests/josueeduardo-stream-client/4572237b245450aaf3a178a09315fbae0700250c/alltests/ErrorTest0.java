import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendBinary(byteArray10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendText("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        io.undertow.websockets.core.WebSocketChannel webSocketChannel5 = wsConnection3.channel();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendBinary(byteArray11);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("hi!", webSocketClientEndpoint1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendText("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        boolean boolean5 = wsConnection3.isOpen();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendBinary(byteArray8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        io.undertow.websockets.core.WebSocketChannel webSocketChannel5 = wsConnection3.channel();
        byte[] byteArray6 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendBinary(byteArray6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        wsConnection3.close();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendBinary(byteArray8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        wsConnection3.close();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendText("EventData{data='hi!', id='', origin='null', event='hi!'}");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        io.joshworks.stream.client.ws.WsConnection wsConnection2 = wsConfiguration1.connect();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection2.sendText("io.joshworks.stream.client.StreamConnectionError: hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        boolean boolean5 = wsConnection3.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendText("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        io.joshworks.stream.client.ws.WsConfiguration wsConfiguration1 = io.joshworks.stream.client.StreamClient.ws("EventData{data='hi!', id='', origin='null', event='hi!'}");
        io.joshworks.stream.client.ws.WsConnection wsConnection2 = wsConfiguration1.connect();
        boolean boolean3 = wsConnection2.isOpen();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection2.sendText("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint1 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.ProxyClientEndpoint proxyClientEndpoint2 = new io.joshworks.stream.client.ws.ProxyClientEndpoint(webSocketClientEndpoint1);
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("", webSocketClientEndpoint1);
        io.undertow.websockets.core.WebSocketChannel webSocketChannel4 = wsConnection3.channel();
        boolean boolean5 = wsConnection3.isOpen();
        byte[] byteArray7 = new byte[] { (byte) 100 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection3.sendBinary(byteArray7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        io.joshworks.stream.client.ws.WebSocketClientEndpoint webSocketClientEndpoint2 = new io.joshworks.stream.client.ws.WebSocketClientEndpoint();
        io.joshworks.stream.client.ws.WsConnection wsConnection3 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='hi!', origin='hi!', event=''}", webSocketClientEndpoint2);
        io.joshworks.stream.client.ws.WsConnection wsConnection4 = io.joshworks.stream.client.StreamClient.connect("EventData{data='', id='EventData{data='hi!', id='', origin='null', event='hi!'}', origin='null', event=''}", webSocketClientEndpoint2);
        byte[] byteArray5 = new byte[] {};
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wsConnection4.sendBinary(byteArray5);
    }
}

