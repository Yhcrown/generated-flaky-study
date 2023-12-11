package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup2 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel3.connect((java.net.SocketAddress) inetSocketAddress8);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress8);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel11.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel13 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel13.close();
        java.net.SocketAddress socketAddress15 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel13.connect(socketAddress15);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel17.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel19.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel13.connect((java.net.SocketAddress) inetSocketAddress20);
        futureSocketChannel13.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel23 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel23.close();
        java.net.SocketAddress socketAddress25 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel23.connect(socketAddress25);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel27 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress28 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel29 = futureServerSocketChannel27.bind(socketAddress28);
        java.net.InetSocketAddress inetSocketAddress30 = futureServerSocketChannel29.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture31 = futureSocketChannel23.connect((java.net.SocketAddress) inetSocketAddress30);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel13.connect((java.net.SocketAddress) inetSocketAddress30);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture34 = null;  futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress30);
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyConnectedException; message: null");
        } catch (java.nio.channels.AlreadyConnectedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel13);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(futureSocketChannel23);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(futureServerSocketChannel27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel29);
        org.junit.Assert.assertNotNull(inetSocketAddress30);
        org.junit.Assert.assertNotNull(voidCompletableFuture31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
    }
	@Test
    public void test095_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup2 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel3.connect((java.net.SocketAddress) inetSocketAddress8);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress8);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel11.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel13 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel13.close();
        java.net.SocketAddress socketAddress15 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel13.connect(socketAddress15);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel17.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel19.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel13.connect((java.net.SocketAddress) inetSocketAddress20);
        futureSocketChannel13.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel23 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel23.close();
        java.net.SocketAddress socketAddress25 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel23.connect(socketAddress25);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel27 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress28 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel29 = futureServerSocketChannel27.bind(socketAddress28);
        java.net.InetSocketAddress inetSocketAddress30 = futureServerSocketChannel29.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture31 = futureSocketChannel23.connect((java.net.SocketAddress) inetSocketAddress30);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel13.connect((java.net.SocketAddress) inetSocketAddress30);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture34 = null; // flaky: futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress30);
             org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyConnectedException; message: null");
        } catch (java.nio.channels.AlreadyConnectedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel13);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(futureSocketChannel23);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(futureServerSocketChannel27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel29);
        org.junit.Assert.assertNotNull(inetSocketAddress30);
        org.junit.Assert.assertNotNull(voidCompletableFuture31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
    }
	@Test
    public void test120_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel2.close();
        java.net.SocketAddress socketAddress4 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel2.connect(socketAddress4);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel11.close();
        java.net.SocketAddress socketAddress13 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture14 = futureSocketChannel11.connect(socketAddress13);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress16 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = futureServerSocketChannel15.bind(socketAddress16);
        java.net.InetSocketAddress inetSocketAddress18 = futureServerSocketChannel17.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress18);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress18);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel21 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel21.close();
        java.net.SocketAddress socketAddress23 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture24 = futureSocketChannel21.connect(socketAddress23);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel25 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel25.getLocalAddress();
        java.net.SocketAddress socketAddress27 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = futureServerSocketChannel25.bind(socketAddress27);
        java.net.InetSocketAddress inetSocketAddress29 = futureServerSocketChannel25.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel21.connect((java.net.SocketAddress) inetSocketAddress29);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture31 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress29);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress29);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel33 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel33.close();
        java.net.SocketAddress socketAddress35 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel33.connect(socketAddress35);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel37 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress38 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel39 = futureServerSocketChannel37.bind(socketAddress38);
        java.net.InetSocketAddress inetSocketAddress40 = futureServerSocketChannel39.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel33.connect((java.net.SocketAddress) inetSocketAddress40);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel42 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel42.close();
        java.net.SocketAddress socketAddress44 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel42.connect(socketAddress44);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel46 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress47 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel48 = futureServerSocketChannel46.bind(socketAddress47);
        java.net.InetSocketAddress inetSocketAddress49 = futureServerSocketChannel48.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture50 = futureSocketChannel42.connect((java.net.SocketAddress) inetSocketAddress49);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture51 = futureSocketChannel33.connect((java.net.SocketAddress) inetSocketAddress49);
        futureSocketChannel33.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup53 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel54 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup53);
        java.net.InetSocketAddress inetSocketAddress55 = futureServerSocketChannel54.getLocalAddress();
        java.net.SocketAddress socketAddress56 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel57 = futureServerSocketChannel54.bind(socketAddress56);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture58 = futureServerSocketChannel57.accept();
        java.net.InetSocketAddress inetSocketAddress59 = futureServerSocketChannel57.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture60 = futureSocketChannel33.connect((java.net.SocketAddress) inetSocketAddress59);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = null;  futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress59);
// flaky:             org.junit.Assert.fail("Expected exception of type java.nio.channels.ConnectionPendingException; message: null");
        } catch (java.nio.channels.ConnectionPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureSocketChannel2);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel11);
        org.junit.Assert.assertNotNull(voidCompletableFuture14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(inetSocketAddress18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(futureSocketChannel21);
        org.junit.Assert.assertNotNull(voidCompletableFuture24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel25);
        org.junit.Assert.assertNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(inetSocketAddress29);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(voidCompletableFuture31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureSocketChannel33);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(futureServerSocketChannel37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel39);
        org.junit.Assert.assertNotNull(inetSocketAddress40);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureSocketChannel42);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(futureServerSocketChannel46);
        org.junit.Assert.assertNotNull(futureServerSocketChannel48);
        org.junit.Assert.assertNotNull(inetSocketAddress49);
        org.junit.Assert.assertNotNull(voidCompletableFuture50);
        org.junit.Assert.assertNotNull(voidCompletableFuture51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel54);
        org.junit.Assert.assertNull(inetSocketAddress55);
        org.junit.Assert.assertNotNull(futureServerSocketChannel57);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture58);
        org.junit.Assert.assertNotNull(inetSocketAddress59);
        org.junit.Assert.assertNotNull(voidCompletableFuture60);
    }
	@Test
    public void test120_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel2.close();
        java.net.SocketAddress socketAddress4 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel2.connect(socketAddress4);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel11.close();
        java.net.SocketAddress socketAddress13 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture14 = futureSocketChannel11.connect(socketAddress13);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress16 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = futureServerSocketChannel15.bind(socketAddress16);
        java.net.InetSocketAddress inetSocketAddress18 = futureServerSocketChannel17.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress18);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress18);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel21 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel21.close();
        java.net.SocketAddress socketAddress23 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture24 = futureSocketChannel21.connect(socketAddress23);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel25 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel25.getLocalAddress();
        java.net.SocketAddress socketAddress27 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = futureServerSocketChannel25.bind(socketAddress27);
        java.net.InetSocketAddress inetSocketAddress29 = futureServerSocketChannel25.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel21.connect((java.net.SocketAddress) inetSocketAddress29);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture31 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress29);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress29);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel33 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel33.close();
        java.net.SocketAddress socketAddress35 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel33.connect(socketAddress35);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel37 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress38 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel39 = futureServerSocketChannel37.bind(socketAddress38);
        java.net.InetSocketAddress inetSocketAddress40 = futureServerSocketChannel39.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel33.connect((java.net.SocketAddress) inetSocketAddress40);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel42 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel42.close();
        java.net.SocketAddress socketAddress44 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel42.connect(socketAddress44);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel46 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress47 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel48 = futureServerSocketChannel46.bind(socketAddress47);
        java.net.InetSocketAddress inetSocketAddress49 = futureServerSocketChannel48.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture50 = futureSocketChannel42.connect((java.net.SocketAddress) inetSocketAddress49);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture51 = futureSocketChannel33.connect((java.net.SocketAddress) inetSocketAddress49);
        futureSocketChannel33.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup53 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel54 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup53);
        java.net.InetSocketAddress inetSocketAddress55 = futureServerSocketChannel54.getLocalAddress();
        java.net.SocketAddress socketAddress56 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel57 = futureServerSocketChannel54.bind(socketAddress56);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture58 = futureServerSocketChannel57.accept();
        java.net.InetSocketAddress inetSocketAddress59 = futureServerSocketChannel57.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture60 = futureSocketChannel33.connect((java.net.SocketAddress) inetSocketAddress59);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = null; // flaky: futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress59);
             org.junit.Assert.fail("Expected exception of type java.nio.channels.ConnectionPendingException; message: null");
        } catch (java.nio.channels.ConnectionPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureSocketChannel2);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel11);
        org.junit.Assert.assertNotNull(voidCompletableFuture14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(inetSocketAddress18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(futureSocketChannel21);
        org.junit.Assert.assertNotNull(voidCompletableFuture24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel25);
        org.junit.Assert.assertNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(inetSocketAddress29);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(voidCompletableFuture31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureSocketChannel33);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(futureServerSocketChannel37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel39);
        org.junit.Assert.assertNotNull(inetSocketAddress40);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureSocketChannel42);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(futureServerSocketChannel46);
        org.junit.Assert.assertNotNull(futureServerSocketChannel48);
        org.junit.Assert.assertNotNull(inetSocketAddress49);
        org.junit.Assert.assertNotNull(voidCompletableFuture50);
        org.junit.Assert.assertNotNull(voidCompletableFuture51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel54);
        org.junit.Assert.assertNull(inetSocketAddress55);
        org.junit.Assert.assertNotNull(futureServerSocketChannel57);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture58);
        org.junit.Assert.assertNotNull(inetSocketAddress59);
        org.junit.Assert.assertNotNull(voidCompletableFuture60);
    }
}