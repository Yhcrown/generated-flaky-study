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
        spullara.util.matching.Extractor<java.lang.String, java.lang.Long> strExtractor0 = spullara.util.matching.Extractors.LongExtractor();
        org.junit.Assert.assertNotNull(strExtractor0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        spullara.util.matching.Extractor<java.lang.String, java.util.regex.Matcher> strExtractor1 = spullara.util.matching.Extractors.RegexExtractor("");
        org.junit.Assert.assertNotNull(strExtractor1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Double> strExtractor0 = spullara.util.matching.Extractors.DoubleExtractor();
        org.junit.Assert.assertNotNull(strExtractor0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        spullara.util.Currier currier0 = new spullara.util.Currier();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (short) 1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = new spullara.nio.channels.FutureServerSocketChannel();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture2 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inetSocketAddress1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture2 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = new spullara.nio.channels.FutureServerSocketChannel();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture1 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture2 = futureServerSocketChannel1.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 100);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("", exceptionRunnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture1 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.net.SocketAddress socketAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel1.bind(socketAddress5);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        java.nio.ByteBuffer byteBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture3 = futureSocketChannel1.read(byteBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable10 = null;
        benchmarker1.execute("", exceptionRunnable10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        spullara.util.matching.Extractors extractors0 = new spullara.util.matching.Extractors();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        spullara.util.matching.Match<java.lang.CharSequence, spullara.util.Limiter> charSequenceMatch0 = new spullara.util.matching.Match<java.lang.CharSequence, spullara.util.Limiter>();
        java.lang.Class<?> wildcardClass1 = charSequenceMatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        spullara.util.matching.Match<java.lang.reflect.AnnotatedElement, java.util.Optional<java.lang.Integer>> annotatedElementMatch0 = new spullara.util.matching.Match<java.lang.reflect.AnnotatedElement, java.util.Optional<java.lang.Integer>>();
        java.lang.Class<?> wildcardClass1 = annotatedElementMatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.lang.Class<?> wildcardClass3 = intOptional2.getClass();
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("", exceptionRunnable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel4.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("hi!", exceptionRunnable12);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel4.close();
        java.net.SocketAddress socketAddress6 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel4.connect(socketAddress6);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel8.bind(socketAddress9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress11);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress11);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture11 = futureSocketChannel0.read(byteBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        java.nio.ByteBuffer byteBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture10 = futureSocketChannel0.read(byteBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture3 = futureSocketChannel0.read(byteBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        java.nio.ByteBuffer byteBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture10 = futureSocketChannel0.write(byteBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture5 = futureSocketChannel0.write(byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) '4');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel4.close();
        java.net.SocketAddress socketAddress6 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel4.connect(socketAddress6);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel8.bind(socketAddress9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress11);
        futureSocketChannel4.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel14 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel14.close();
        java.net.SocketAddress socketAddress16 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel14.connect(socketAddress16);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress19 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = futureServerSocketChannel18.bind(socketAddress19);
        java.net.InetSocketAddress inetSocketAddress21 = futureServerSocketChannel20.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel14.connect((java.net.SocketAddress) inetSocketAddress21);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress21);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel3.bind((java.net.SocketAddress) inetSocketAddress21);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureSocketChannel14);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(inetSocketAddress21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel3.getLocalAddress();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel3.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel3.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress7);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNull(inetSocketAddress4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        spullara.util.matching.Match<spullara.util.Limiter, java.net.SocketAddress> limiterMatch0 = new spullara.util.matching.Match<spullara.util.Limiter, java.net.SocketAddress>();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel14.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable7 = null;
        benchmarker1.execute("hi!", exceptionRunnable7);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable10 = null;
        benchmarker1.execute("hi!", exceptionRunnable10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel14.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress17);
        java.nio.ByteBuffer byteBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture21 = futureSocketChannel0.read(byteBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel5.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress9);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture2 = futureSocketChannel0.read(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker1.report();
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("", exceptionRunnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture3 = futureServerSocketChannel1.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 10);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("", exceptionRunnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        spullara.util.matching.Extractor<java.lang.String, java.util.regex.Matcher> strExtractor1 = spullara.util.matching.Extractors.RegexExtractor("hi!");
        org.junit.Assert.assertNotNull(strExtractor1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
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
        // The following exception was thrown during execution in test generation
        try {
            int int11 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (short) 100);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("hi!", exceptionRunnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel3.bind((java.net.SocketAddress) inetSocketAddress7);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture6 = futureSocketChannel0.read(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        spullara.util.matching.Match<java.util.concurrent.Future<java.lang.Void>, spullara.nio.channels.FutureSocketChannel> voidFutureMatch0 = new spullara.util.matching.Match<java.util.concurrent.Future<java.lang.Void>, spullara.nio.channels.FutureSocketChannel>();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup5 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup5);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel7.getLocalAddress();
        java.net.SocketAddress socketAddress9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel7.bind(socketAddress9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel7.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel6.connect((java.net.SocketAddress) inetSocketAddress11);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress11);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel5.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress9);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.lang.Class<?> wildcardClass4 = futureServerSocketChannel3.getClass();
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture6 = futureSocketChannel0.write(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
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
        futureSocketChannel1.close();
        java.nio.ByteBuffer byteBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture13 = futureSocketChannel1.read(byteBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("", exceptionRunnable12);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable15 = null;
        benchmarker1.execute("", exceptionRunnable15);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable18 = null;
        benchmarker1.execute("", exceptionRunnable18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel3.close();
        java.net.SocketAddress socketAddress5 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture6 = futureSocketChannel3.connect(socketAddress5);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel7.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel3.connect((java.net.SocketAddress) inetSocketAddress10);
        futureSocketChannel3.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel13 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel13.close();
        java.net.SocketAddress socketAddress15 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel13.connect(socketAddress15);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel17.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel19.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel13.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel3.connect((java.net.SocketAddress) inetSocketAddress20);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel23 = futureServerSocketChannel2.bind((java.net.SocketAddress) inetSocketAddress20);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(futureSocketChannel3);
        org.junit.Assert.assertNotNull(voidCompletableFuture6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureSocketChannel13);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel3.accept();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel3.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        java.nio.ByteBuffer byteBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture11 = futureSocketChannel0.read(byteBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        java.lang.Class<?> wildcardClass10 = voidCompletableFuture9.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup3 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup3);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress9);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress9);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel2.bind((java.net.SocketAddress) inetSocketAddress6);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("hi!", exceptionRunnable12);
        benchmarker1.report();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture2 = futureSocketChannel0.write(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress9);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
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
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture12 = futureSocketChannel1.write(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture9 = futureSocketChannel1.read(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture2 = futureSocketChannel0.read(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        spullara.util.matching.Match<spullara.util.Currier, java.net.InetSocketAddress> currierMatch0 = new spullara.util.matching.Match<spullara.util.Currier, java.net.InetSocketAddress>();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        benchmarker1.report();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = new spullara.nio.channels.FutureServerSocketChannel();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel2.close();
        java.net.SocketAddress socketAddress4 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel2.connect(socketAddress4);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress9);
        futureSocketChannel2.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel16.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel18.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress19);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel22.bind(socketAddress23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress25);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel27 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress25);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureSocketChannel2);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress9);
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture12 = futureSocketChannel0.write(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel20.close();
        java.net.SocketAddress socketAddress22 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel20.connect(socketAddress22);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress25 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = futureServerSocketChannel24.bind(socketAddress25);
        java.net.InetSocketAddress inetSocketAddress27 = futureServerSocketChannel26.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress27);
        futureSocketChannel20.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel30.close();
        java.net.SocketAddress socketAddress32 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel30.connect(socketAddress32);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress35 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = futureServerSocketChannel34.bind(socketAddress35);
        java.net.InetSocketAddress inetSocketAddress37 = futureServerSocketChannel36.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress37);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress37);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress41 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = futureServerSocketChannel40.bind(socketAddress41);
        java.net.InetSocketAddress inetSocketAddress43 = futureServerSocketChannel42.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress43);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress43);
        java.nio.ByteBuffer byteBuffer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture47 = futureSocketChannel0.read(byteBuffer46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel20);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(inetSocketAddress27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(futureSocketChannel30);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(inetSocketAddress37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(inetSocketAddress43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture9 = futureSocketChannel1.write(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture21 = futureSocketChannel0.read(byteBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction4 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch5 = typeMatch3.orElse(typeFunction4);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch6 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type7 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch6.check(type7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass10 = futureSocketChannel9.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional11 = typeMatch6.check((java.lang.reflect.Type) wildcardClass10);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional12 = typeMatch3.check((java.lang.reflect.Type) wildcardClass10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction13 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch14 = typeMatch3.orElse(typeFunction13);
        spullara.util.Benchmarker benchmarker16 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker16.report();
        java.lang.Class<?> wildcardClass18 = benchmarker16.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional19 = typeMatch3.check((java.lang.reflect.Type) wildcardClass18);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch0.check((java.lang.reflect.Type) wildcardClass18);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(typeMatch5);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(intOptionalOptional11);
        org.junit.Assert.assertNotNull(intOptionalOptional12);
        org.junit.Assert.assertNotNull(typeMatch14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(intOptionalOptional19);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress16 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = futureServerSocketChannel15.bind(socketAddress16);
        java.lang.Class<?> wildcardClass18 = futureServerSocketChannel17.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional19 = typeMatch0.check((java.lang.reflect.Type) wildcardClass18);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(intOptionalOptional19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel0.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture3 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNull(inetSocketAddress2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture3 = futureSocketChannel0.read(byteBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture3 = futureSocketChannel0.write(byteBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
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
        futureSocketChannel2.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel22 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel22.close();
        java.net.SocketAddress socketAddress24 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel22.connect(socketAddress24);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress27 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = futureServerSocketChannel26.bind(socketAddress27);
        java.net.InetSocketAddress inetSocketAddress29 = futureServerSocketChannel28.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress29);
        futureSocketChannel22.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel32 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel32.close();
        java.net.SocketAddress socketAddress34 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel32.connect(socketAddress34);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress37 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = futureServerSocketChannel36.bind(socketAddress37);
        java.net.InetSocketAddress inetSocketAddress39 = futureServerSocketChannel38.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture40 = futureSocketChannel32.connect((java.net.SocketAddress) inetSocketAddress39);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress39);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress43 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel44 = futureServerSocketChannel42.bind(socketAddress43);
        java.net.InetSocketAddress inetSocketAddress45 = futureServerSocketChannel44.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress45);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress45);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel48 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress45);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
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
        org.junit.Assert.assertNotNull(futureSocketChannel22);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(inetSocketAddress29);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(futureSocketChannel32);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNotNull(inetSocketAddress39);
        org.junit.Assert.assertNotNull(voidCompletableFuture40);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel44);
        org.junit.Assert.assertNotNull(inetSocketAddress45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel3.accept();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel6.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel3.bind((java.net.SocketAddress) inetSocketAddress10);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker1.report();
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("hi!", exceptionRunnable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable4 = null;
        benchmarker1.execute("", exceptionRunnable4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        java.nio.ByteBuffer byteBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture3 = futureSocketChannel1.write(byteBuffer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        java.lang.Class<?> wildcardClass9 = futureSocketChannel1.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        spullara.util.matching.Match<java.lang.CharSequence, spullara.util.matching.Extractors> charSequenceMatch0 = new spullara.util.matching.Match<java.lang.CharSequence, spullara.util.matching.Extractors>();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress9);
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture12 = futureSocketChannel0.read(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture7 = futureServerSocketChannel4.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        spullara.util.matching.Match<java.util.Optional<java.lang.Integer>, spullara.util.matching.Extractor<java.lang.String, java.lang.Integer>> intOptionalMatch0 = new spullara.util.matching.Match<java.util.Optional<java.lang.Integer>, spullara.util.matching.Extractor<java.lang.String, java.lang.Integer>>();
    }

    @Test
    public void test095() throws Throwable {
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
            java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture34 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress30);
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel14.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress17);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress21 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = futureServerSocketChannel20.bind(socketAddress21);
        java.net.InetSocketAddress inetSocketAddress23 = futureServerSocketChannel22.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture24 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress23);
        java.nio.ByteBuffer byteBuffer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture26 = futureSocketChannel0.write(byteBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(inetSocketAddress23);
        org.junit.Assert.assertNotNull(voidCompletableFuture24);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("", exceptionRunnable12);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable15 = null;
        benchmarker1.execute("", exceptionRunnable15);
        benchmarker1.report();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type16 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional17 = typeMatch15.check(type16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass19 = futureSocketChannel18.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch15.check((java.lang.reflect.Type) wildcardClass19);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch0.check((java.lang.reflect.Type) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = intOptionalOptional21.getClass();
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(intOptionalOptional17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch10 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type11 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional12 = typeMatch10.check(type11);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel13 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass14 = futureSocketChannel13.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional15 = typeMatch10.check((java.lang.reflect.Type) wildcardClass14);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction16 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch17 = typeMatch10.orElse(typeFunction16);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch18 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type19 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch18.check(type19);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel21 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass22 = futureSocketChannel21.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional23 = typeMatch18.check((java.lang.reflect.Type) wildcardClass22);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional24 = typeMatch10.check((java.lang.reflect.Type) wildcardClass22);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch25 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type26 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional27 = typeMatch25.check(type26);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel28 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass29 = futureSocketChannel28.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional30 = typeMatch25.check((java.lang.reflect.Type) wildcardClass29);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional31 = typeMatch10.check((java.lang.reflect.Type) wildcardClass29);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional32 = typeMatch0.check((java.lang.reflect.Type) wildcardClass29);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(intOptionalOptional12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(intOptionalOptional15);
        org.junit.Assert.assertNotNull(typeMatch17);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(intOptionalOptional23);
        org.junit.Assert.assertNotNull(intOptionalOptional24);
        org.junit.Assert.assertNotNull(intOptionalOptional27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intOptionalOptional30);
        org.junit.Assert.assertNotNull(intOptionalOptional31);
        org.junit.Assert.assertNotNull(intOptionalOptional32);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable10 = null;
        benchmarker1.execute("hi!", exceptionRunnable10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        spullara.util.matching.Match<spullara.util.Benchmarker, java.net.SocketAddress> benchmarkerMatch0 = new spullara.util.matching.Match<spullara.util.Benchmarker, java.net.SocketAddress>();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        spullara.util.matching.Match<spullara.util.Currier, java.net.SocketAddress> currierMatch0 = new spullara.util.matching.Match<spullara.util.Currier, java.net.SocketAddress>();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("", exceptionRunnable9);
        benchmarker1.report();
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable14 = null;
        benchmarker1.execute("hi!", exceptionRunnable14);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel8.close();
        java.net.SocketAddress socketAddress10 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel8.connect(socketAddress10);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress13 = futureServerSocketChannel12.getLocalAddress();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel12.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel12.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureSocketChannel8);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        java.nio.ByteBuffer byteBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture10 = futureSocketChannel1.read(byteBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        java.lang.Class<?> wildcardClass8 = futureSocketChannel1.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) -1);
        benchmarker1.report();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel4.close();
        java.net.SocketAddress socketAddress6 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel4.connect(socketAddress6);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup8 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup8);
        futureSocketChannel9.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress12 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel11.bind(socketAddress12);
        java.net.InetSocketAddress inetSocketAddress14 = futureServerSocketChannel13.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress14);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel16 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel16.close();
        java.net.SocketAddress socketAddress18 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel16.connect(socketAddress18);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress21 = futureServerSocketChannel20.getLocalAddress();
        java.net.SocketAddress socketAddress22 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel23 = futureServerSocketChannel20.bind(socketAddress22);
        java.net.InetSocketAddress inetSocketAddress24 = futureServerSocketChannel20.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel16.connect((java.net.SocketAddress) inetSocketAddress24);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress24);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress24);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel28 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel28.close();
        java.net.SocketAddress socketAddress30 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture31 = futureSocketChannel28.connect(socketAddress30);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel32 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress33 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = futureServerSocketChannel32.bind(socketAddress33);
        java.net.InetSocketAddress inetSocketAddress35 = futureServerSocketChannel34.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel28.connect((java.net.SocketAddress) inetSocketAddress35);
        futureSocketChannel28.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel38 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel38.close();
        java.net.SocketAddress socketAddress40 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel38.connect(socketAddress40);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress43 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel44 = futureServerSocketChannel42.bind(socketAddress43);
        java.net.InetSocketAddress inetSocketAddress45 = futureServerSocketChannel44.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel38.connect((java.net.SocketAddress) inetSocketAddress45);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel28.connect((java.net.SocketAddress) inetSocketAddress45);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture48 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress45);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel49 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel49.close();
        java.net.SocketAddress socketAddress51 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture52 = futureSocketChannel49.connect(socketAddress51);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel53 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress54 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel55 = futureServerSocketChannel53.bind(socketAddress54);
        java.net.InetSocketAddress inetSocketAddress56 = futureServerSocketChannel55.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture57 = futureSocketChannel49.connect((java.net.SocketAddress) inetSocketAddress56);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel58 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel58.close();
        java.net.SocketAddress socketAddress60 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = futureSocketChannel58.connect(socketAddress60);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel62 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress63 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel64 = futureServerSocketChannel62.bind(socketAddress63);
        java.net.InetSocketAddress inetSocketAddress65 = futureServerSocketChannel64.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture66 = futureSocketChannel58.connect((java.net.SocketAddress) inetSocketAddress65);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture67 = futureSocketChannel49.connect((java.net.SocketAddress) inetSocketAddress65);
        futureSocketChannel49.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel69 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel69.close();
        java.net.SocketAddress socketAddress71 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture72 = futureSocketChannel69.connect(socketAddress71);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel73 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress74 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel75 = futureServerSocketChannel73.bind(socketAddress74);
        java.net.InetSocketAddress inetSocketAddress76 = futureServerSocketChannel75.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture77 = futureSocketChannel69.connect((java.net.SocketAddress) inetSocketAddress76);
        futureSocketChannel69.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel79 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel79.close();
        java.net.SocketAddress socketAddress81 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture82 = futureSocketChannel79.connect(socketAddress81);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel83 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress84 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel85 = futureServerSocketChannel83.bind(socketAddress84);
        java.net.InetSocketAddress inetSocketAddress86 = futureServerSocketChannel85.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture87 = futureSocketChannel79.connect((java.net.SocketAddress) inetSocketAddress86);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture88 = futureSocketChannel69.connect((java.net.SocketAddress) inetSocketAddress86);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel89 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress90 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel91 = futureServerSocketChannel89.bind(socketAddress90);
        java.net.InetSocketAddress inetSocketAddress92 = futureServerSocketChannel91.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture93 = futureSocketChannel69.connect((java.net.SocketAddress) inetSocketAddress92);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture94 = futureSocketChannel49.connect((java.net.SocketAddress) inetSocketAddress92);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture95 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress92);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel96 = futureServerSocketChannel3.bind((java.net.SocketAddress) inetSocketAddress92);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(inetSocketAddress14);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureSocketChannel16);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNull(inetSocketAddress21);
        org.junit.Assert.assertNotNull(futureServerSocketChannel23);
        org.junit.Assert.assertNotNull(inetSocketAddress24);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureSocketChannel28);
        org.junit.Assert.assertNotNull(voidCompletableFuture31);
        org.junit.Assert.assertNotNull(futureServerSocketChannel32);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(inetSocketAddress35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(futureSocketChannel38);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel44);
        org.junit.Assert.assertNotNull(inetSocketAddress45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
        org.junit.Assert.assertNotNull(voidCompletableFuture48);
        org.junit.Assert.assertNotNull(futureSocketChannel49);
        org.junit.Assert.assertNotNull(voidCompletableFuture52);
        org.junit.Assert.assertNotNull(futureServerSocketChannel53);
        org.junit.Assert.assertNotNull(futureServerSocketChannel55);
        org.junit.Assert.assertNotNull(inetSocketAddress56);
        org.junit.Assert.assertNotNull(voidCompletableFuture57);
        org.junit.Assert.assertNotNull(futureSocketChannel58);
        org.junit.Assert.assertNotNull(voidCompletableFuture61);
        org.junit.Assert.assertNotNull(futureServerSocketChannel62);
        org.junit.Assert.assertNotNull(futureServerSocketChannel64);
        org.junit.Assert.assertNotNull(inetSocketAddress65);
        org.junit.Assert.assertNotNull(voidCompletableFuture66);
        org.junit.Assert.assertNotNull(voidCompletableFuture67);
        org.junit.Assert.assertNotNull(futureSocketChannel69);
        org.junit.Assert.assertNotNull(voidCompletableFuture72);
        org.junit.Assert.assertNotNull(futureServerSocketChannel73);
        org.junit.Assert.assertNotNull(futureServerSocketChannel75);
        org.junit.Assert.assertNotNull(inetSocketAddress76);
        org.junit.Assert.assertNotNull(voidCompletableFuture77);
        org.junit.Assert.assertNotNull(futureSocketChannel79);
        org.junit.Assert.assertNotNull(voidCompletableFuture82);
        org.junit.Assert.assertNotNull(futureServerSocketChannel83);
        org.junit.Assert.assertNotNull(futureServerSocketChannel85);
        org.junit.Assert.assertNotNull(inetSocketAddress86);
        org.junit.Assert.assertNotNull(voidCompletableFuture87);
        org.junit.Assert.assertNotNull(voidCompletableFuture88);
        org.junit.Assert.assertNotNull(futureServerSocketChannel89);
        org.junit.Assert.assertNotNull(futureServerSocketChannel91);
        org.junit.Assert.assertNotNull(inetSocketAddress92);
        org.junit.Assert.assertNotNull(voidCompletableFuture93);
        org.junit.Assert.assertNotNull(voidCompletableFuture94);
        org.junit.Assert.assertNotNull(voidCompletableFuture95);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("");
        java.lang.Class<?> wildcardClass5 = strExtractor0.getClass();
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = new spullara.nio.channels.FutureServerSocketChannel();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
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
        futureSocketChannel2.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel22 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel22.close();
        java.net.SocketAddress socketAddress24 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel22.connect(socketAddress24);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress27 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = futureServerSocketChannel26.bind(socketAddress27);
        java.net.InetSocketAddress inetSocketAddress29 = futureServerSocketChannel28.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress29);
        futureSocketChannel22.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel32 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel32.close();
        java.net.SocketAddress socketAddress34 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel32.connect(socketAddress34);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress37 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = futureServerSocketChannel36.bind(socketAddress37);
        java.net.InetSocketAddress inetSocketAddress39 = futureServerSocketChannel38.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture40 = futureSocketChannel32.connect((java.net.SocketAddress) inetSocketAddress39);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress39);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress43 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel44 = futureServerSocketChannel42.bind(socketAddress43);
        java.net.InetSocketAddress inetSocketAddress45 = futureServerSocketChannel44.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress45);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress45);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel48 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress45);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inetSocketAddress1);
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
        org.junit.Assert.assertNotNull(futureSocketChannel22);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(inetSocketAddress29);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(futureSocketChannel32);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNotNull(inetSocketAddress39);
        org.junit.Assert.assertNotNull(voidCompletableFuture40);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel44);
        org.junit.Assert.assertNotNull(inetSocketAddress45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        java.nio.ByteBuffer byteBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture11 = futureSocketChannel0.write(byteBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup8 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup8);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.net.SocketAddress socketAddress12 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel10.bind(socketAddress12);
        java.net.InetSocketAddress inetSocketAddress14 = futureServerSocketChannel10.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress14);
        futureSocketChannel9.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel17.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel19.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress20);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress20);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(inetSocketAddress14);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup20 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup20);
        java.net.InetSocketAddress inetSocketAddress22 = futureServerSocketChannel21.getLocalAddress();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel21.bind(socketAddress23);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture25 = futureServerSocketChannel24.accept();
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress26);
        java.lang.Class<?> wildcardClass28 = voidCompletableFuture27.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNull(inetSocketAddress22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture25);
        org.junit.Assert.assertNotNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        futureSocketChannel1.close();
        futureSocketChannel1.close();
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel5 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup4);
        futureSocketChannel5.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel7.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel5.connect((java.net.SocketAddress) inetSocketAddress10);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel16.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel5.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress20);
        java.nio.ByteBuffer byteBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture25 = futureSocketChannel0.read(byteBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureSocketChannel5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        futureSocketChannel1.close();
        java.nio.ByteBuffer byteBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture16 = futureSocketChannel1.write(byteBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel16.bind(socketAddress18);
        java.lang.Class<?> wildcardClass20 = futureServerSocketChannel16.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch0.check((java.lang.reflect.Type) wildcardClass20);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch22 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction23 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch24 = typeMatch22.orElse(typeFunction23);
        spullara.util.Benchmarker benchmarker26 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable28 = null;
        benchmarker26.execute("hi!", exceptionRunnable28);
        java.lang.Class<?> wildcardClass30 = benchmarker26.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional31 = typeMatch24.check((java.lang.reflect.Type) wildcardClass30);
        spullara.util.Benchmarker benchmarker33 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable35 = null;
        benchmarker33.execute("", exceptionRunnable35);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable38 = null;
        benchmarker33.execute("", exceptionRunnable38);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable41 = null;
        benchmarker33.execute("hi!", exceptionRunnable41);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable44 = null;
        benchmarker33.execute("", exceptionRunnable44);
        java.lang.Class<?> wildcardClass46 = benchmarker33.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional47 = typeMatch24.check((java.lang.reflect.Type) wildcardClass46);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional48 = typeMatch0.check((java.lang.reflect.Type) wildcardClass46);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(typeMatch24);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(intOptionalOptional31);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(intOptionalOptional47);
        org.junit.Assert.assertNotNull(intOptionalOptional48);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        java.nio.ByteBuffer byteBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture15 = futureSocketChannel1.read(byteBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
    }

    @Test
    public void test120() throws Throwable {
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
            java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress59);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyConnectedException; message: null");
        } catch (java.nio.channels.AlreadyConnectedException e) {
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        java.lang.Class<?> wildcardClass5 = benchmarker1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel7.getLocalAddress();
        java.net.SocketAddress socketAddress9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel7.bind(socketAddress9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel7.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress11);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture3 = futureServerSocketChannel2.accept();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel2.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction8 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = typeMatch0.orElse(typeFunction8);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.net.SocketAddress socketAddress12 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel10.bind(socketAddress12);
        java.lang.Class<?> wildcardClass14 = futureServerSocketChannel10.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional15 = typeMatch9.check((java.lang.reflect.Type) wildcardClass14);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction16 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch17 = typeMatch9.orElse(typeFunction16);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(typeMatch9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(intOptionalOptional15);
        org.junit.Assert.assertNotNull(typeMatch17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel5 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup4);
        futureSocketChannel5.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel7.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel5.connect((java.net.SocketAddress) inetSocketAddress10);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel16.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel5.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress20);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel24.close();
        java.net.SocketAddress socketAddress26 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel24.connect(socketAddress26);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress29 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = futureServerSocketChannel28.bind(socketAddress29);
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress31);
        futureSocketChannel24.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel34 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel34.close();
        java.net.SocketAddress socketAddress36 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel34.connect(socketAddress36);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress39 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = futureServerSocketChannel38.bind(socketAddress39);
        java.net.InetSocketAddress inetSocketAddress41 = futureServerSocketChannel40.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture42 = futureSocketChannel34.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture43 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress41);
        java.nio.ByteBuffer byteBuffer45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture46 = futureSocketChannel0.read(byteBuffer45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureSocketChannel5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureSocketChannel24);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNotNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureSocketChannel34);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(inetSocketAddress41);
        org.junit.Assert.assertNotNull(voidCompletableFuture42);
        org.junit.Assert.assertNotNull(voidCompletableFuture43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
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
        futureSocketChannel1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
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
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel2.close();
        java.net.SocketAddress socketAddress4 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel2.connect(socketAddress4);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress9);
        futureSocketChannel2.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel16.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel18.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress19);
        java.nio.ByteBuffer byteBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture24 = futureSocketChannel0.read(byteBuffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel2);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        java.lang.Class<?> wildcardClass19 = voidCompletableFuture18.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture12 = futureSocketChannel0.read(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel14 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel14.close();
        java.net.SocketAddress socketAddress16 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel14.connect(socketAddress16);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup18 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup18);
        futureSocketChannel19.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress22 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel23 = futureServerSocketChannel21.bind(socketAddress22);
        java.net.InetSocketAddress inetSocketAddress24 = futureServerSocketChannel23.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress24);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel26 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel26.close();
        java.net.SocketAddress socketAddress28 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel26.connect(socketAddress28);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.net.SocketAddress socketAddress32 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel33 = futureServerSocketChannel30.bind(socketAddress32);
        java.net.InetSocketAddress inetSocketAddress34 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel26.connect((java.net.SocketAddress) inetSocketAddress34);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress34);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel14.connect((java.net.SocketAddress) inetSocketAddress34);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel38 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel38.close();
        java.net.SocketAddress socketAddress40 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel38.connect(socketAddress40);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress43 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel44 = futureServerSocketChannel42.bind(socketAddress43);
        java.net.InetSocketAddress inetSocketAddress45 = futureServerSocketChannel44.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel38.connect((java.net.SocketAddress) inetSocketAddress45);
        futureSocketChannel38.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel48 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel48.close();
        java.net.SocketAddress socketAddress50 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture51 = futureSocketChannel48.connect(socketAddress50);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel52 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress53 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel54 = futureServerSocketChannel52.bind(socketAddress53);
        java.net.InetSocketAddress inetSocketAddress55 = futureServerSocketChannel54.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture56 = futureSocketChannel48.connect((java.net.SocketAddress) inetSocketAddress55);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture57 = futureSocketChannel38.connect((java.net.SocketAddress) inetSocketAddress55);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture58 = futureSocketChannel14.connect((java.net.SocketAddress) inetSocketAddress55);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture59 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress55);
        java.nio.ByteBuffer byteBuffer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture61 = futureSocketChannel1.write(byteBuffer60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureSocketChannel14);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(futureSocketChannel19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNotNull(futureServerSocketChannel23);
        org.junit.Assert.assertNotNull(inetSocketAddress24);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureSocketChannel26);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(futureServerSocketChannel33);
        org.junit.Assert.assertNotNull(inetSocketAddress34);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureSocketChannel38);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel44);
        org.junit.Assert.assertNotNull(inetSocketAddress45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(futureSocketChannel48);
        org.junit.Assert.assertNotNull(voidCompletableFuture51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel52);
        org.junit.Assert.assertNotNull(futureServerSocketChannel54);
        org.junit.Assert.assertNotNull(inetSocketAddress55);
        org.junit.Assert.assertNotNull(voidCompletableFuture56);
        org.junit.Assert.assertNotNull(voidCompletableFuture57);
        org.junit.Assert.assertNotNull(voidCompletableFuture58);
        org.junit.Assert.assertNotNull(voidCompletableFuture59);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture12 = futureSocketChannel0.write(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        benchmarker1.report();
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable14 = null;
        benchmarker1.execute("", exceptionRunnable14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type16 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional17 = typeMatch15.check(type16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass19 = futureSocketChannel18.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch15.check((java.lang.reflect.Type) wildcardClass19);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch0.check((java.lang.reflect.Type) wildcardClass19);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction22 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch23 = typeMatch0.orElse(typeFunction22);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction24 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch25 = typeMatch23.orElse(typeFunction24);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(intOptionalOptional17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(typeMatch23);
        org.junit.Assert.assertNotNull(typeMatch25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction3 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch4 = typeMatch2.orElse(typeFunction3);
        java.lang.Class<?> wildcardClass5 = typeMatch4.getClass();
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(typeMatch4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        spullara.util.matching.Match<spullara.util.Limiter, java.lang.reflect.AnnotatedElement> limiterMatch0 = new spullara.util.matching.Match<spullara.util.Limiter, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel1.getLocalAddress();
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel1.accept();
        java.lang.Class<?> wildcardClass7 = futureSocketChannelCompletableFuture6.getClass();
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture9 = futureSocketChannel1.write(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress9);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup11 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress14 = futureServerSocketChannel13.getLocalAddress();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel13.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel13.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNull(inetSocketAddress14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction8 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = typeMatch0.orElse(typeFunction8);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.lang.Class<?> wildcardClass13 = futureServerSocketChannel12.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass13);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(typeMatch9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("", exceptionRunnable12);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable15 = null;
        benchmarker1.execute("", exceptionRunnable15);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel1.getLocalAddress();
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel1.accept();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel1.getLocalAddress();
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel4.close();
        java.net.SocketAddress socketAddress6 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel4.connect(socketAddress6);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel8.bind(socketAddress9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress11);
        futureSocketChannel4.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel14 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel14.close();
        java.net.SocketAddress socketAddress16 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel14.connect(socketAddress16);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress19 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = futureServerSocketChannel18.bind(socketAddress19);
        java.net.InetSocketAddress inetSocketAddress21 = futureServerSocketChannel20.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel14.connect((java.net.SocketAddress) inetSocketAddress21);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress21);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress25 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = futureServerSocketChannel24.bind(socketAddress25);
        java.net.InetSocketAddress inetSocketAddress27 = futureServerSocketChannel26.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress27);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel29 = futureServerSocketChannel2.bind((java.net.SocketAddress) inetSocketAddress27);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureSocketChannel14);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(inetSocketAddress21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(inetSocketAddress27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
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
        java.nio.ByteBuffer byteBuffer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture34 = futureSocketChannel1.write(byteBuffer33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture8 = futureServerSocketChannel4.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel1.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel1.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NotYetBoundException; message: null");
        } catch (java.nio.channels.NotYetBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNull(inetSocketAddress3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        benchmarker1.report();
        java.lang.Class<?> wildcardClass12 = benchmarker1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture4 = futureSocketChannel0.write(byteBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 10);
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction8 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = typeMatch0.orElse(typeFunction8);
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor10 = spullara.util.matching.Extractors.IntegerExtractor();
        java.lang.Class<?> wildcardClass11 = strExtractor10.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional12 = typeMatch0.check((java.lang.reflect.Type) wildcardClass11);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(typeMatch9);
        org.junit.Assert.assertNotNull(strExtractor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(intOptionalOptional12);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
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
        futureSocketChannel1.close();
        futureSocketChannel1.close();
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel8.close();
        java.net.SocketAddress socketAddress10 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel8.connect(socketAddress10);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress13 = futureServerSocketChannel12.getLocalAddress();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel12.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel12.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel19.close();
        java.net.SocketAddress socketAddress21 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel19.connect(socketAddress21);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.net.SocketAddress socketAddress26 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel27 = futureServerSocketChannel24.bind(socketAddress26);
        java.net.InetSocketAddress inetSocketAddress28 = futureServerSocketChannel27.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress28);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress28);
        java.nio.ByteBuffer byteBuffer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture32 = futureSocketChannel1.read(byteBuffer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureSocketChannel8);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel19);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(futureServerSocketChannel27);
        org.junit.Assert.assertNotNull(inetSocketAddress28);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel20.close();
        java.net.SocketAddress socketAddress22 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel20.connect(socketAddress22);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress25 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = futureServerSocketChannel24.bind(socketAddress25);
        java.net.InetSocketAddress inetSocketAddress27 = futureServerSocketChannel26.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress27);
        futureSocketChannel20.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel30.close();
        java.net.SocketAddress socketAddress32 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel30.connect(socketAddress32);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress35 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = futureServerSocketChannel34.bind(socketAddress35);
        java.net.InetSocketAddress inetSocketAddress37 = futureServerSocketChannel36.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress37);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress37);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress41 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = futureServerSocketChannel40.bind(socketAddress41);
        java.net.InetSocketAddress inetSocketAddress43 = futureServerSocketChannel42.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress43);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress43);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel47 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel47.close();
        java.net.SocketAddress socketAddress49 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture50 = futureSocketChannel47.connect(socketAddress49);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel51 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress52 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel53 = futureServerSocketChannel51.bind(socketAddress52);
        java.net.InetSocketAddress inetSocketAddress54 = futureServerSocketChannel53.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture55 = futureSocketChannel47.connect((java.net.SocketAddress) inetSocketAddress54);
        futureSocketChannel47.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel57 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel57.close();
        java.net.SocketAddress socketAddress59 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture60 = futureSocketChannel57.connect(socketAddress59);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel61 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress62 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel63 = futureServerSocketChannel61.bind(socketAddress62);
        java.net.InetSocketAddress inetSocketAddress64 = futureServerSocketChannel63.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture65 = futureSocketChannel57.connect((java.net.SocketAddress) inetSocketAddress64);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture66 = futureSocketChannel47.connect((java.net.SocketAddress) inetSocketAddress64);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture67 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress64);
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel20);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(inetSocketAddress27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(futureSocketChannel30);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(inetSocketAddress37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(inetSocketAddress43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(futureSocketChannel47);
        org.junit.Assert.assertNotNull(voidCompletableFuture50);
        org.junit.Assert.assertNotNull(futureServerSocketChannel51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel53);
        org.junit.Assert.assertNotNull(inetSocketAddress54);
        org.junit.Assert.assertNotNull(voidCompletableFuture55);
        org.junit.Assert.assertNotNull(futureSocketChannel57);
        org.junit.Assert.assertNotNull(voidCompletableFuture60);
        org.junit.Assert.assertNotNull(futureServerSocketChannel61);
        org.junit.Assert.assertNotNull(futureServerSocketChannel63);
        org.junit.Assert.assertNotNull(inetSocketAddress64);
        org.junit.Assert.assertNotNull(voidCompletableFuture65);
        org.junit.Assert.assertNotNull(voidCompletableFuture66);
        org.junit.Assert.assertNotNull(voidCompletableFuture67);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional12 = strExtractor0.unapply("hi!");
        java.lang.Class<?> wildcardClass13 = strExtractor0.getClass();
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel5.accept();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        java.lang.Class<?> wildcardClass9 = inetSocketAddress7.getClass();
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture7 = futureSocketChannel0.write(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel15 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel15.close();
        java.net.SocketAddress socketAddress17 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel15.connect(socketAddress17);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup19 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup19);
        futureSocketChannel20.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel22.bind(socketAddress23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress25);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel27 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel27.close();
        java.net.SocketAddress socketAddress29 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel27.connect(socketAddress29);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel31 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress32 = futureServerSocketChannel31.getLocalAddress();
        java.net.SocketAddress socketAddress33 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = futureServerSocketChannel31.bind(socketAddress33);
        java.net.InetSocketAddress inetSocketAddress35 = futureServerSocketChannel31.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel27.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel15.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress35);
        java.nio.ByteBuffer byteBuffer40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture41 = futureSocketChannel1.write(byteBuffer40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureSocketChannel15);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(futureSocketChannel27);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(futureServerSocketChannel31);
        org.junit.Assert.assertNull(inetSocketAddress32);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(inetSocketAddress35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel14.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress17);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress21 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = futureServerSocketChannel20.bind(socketAddress21);
        java.net.InetSocketAddress inetSocketAddress23 = futureServerSocketChannel22.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture24 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress23);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(inetSocketAddress23);
        org.junit.Assert.assertNotNull(voidCompletableFuture24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel15.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel18.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress19);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type16 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional17 = typeMatch15.check(type16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass19 = futureSocketChannel18.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch15.check((java.lang.reflect.Type) wildcardClass19);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch0.check((java.lang.reflect.Type) wildcardClass19);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction22 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch23 = typeMatch0.orElse(typeFunction22);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction24 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch25 = typeMatch0.orElse(typeFunction24);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction26 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch27 = typeMatch0.orElse(typeFunction26);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(intOptionalOptional17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(typeMatch23);
        org.junit.Assert.assertNotNull(typeMatch25);
        org.junit.Assert.assertNotNull(typeMatch27);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(10);
        benchmarker1.report();
        java.lang.Class<?> wildcardClass3 = benchmarker1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture13 = futureSocketChannel0.read(byteBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel1.accept();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel6.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress9);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel2.close();
        java.net.SocketAddress socketAddress4 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel2.connect(socketAddress4);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress9);
        futureSocketChannel2.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel16.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel18.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress19);
        java.nio.ByteBuffer byteBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture24 = futureSocketChannel0.write(byteBuffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel2);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        spullara.util.matching.Match<java.lang.Class<?>, spullara.nio.channels.FutureSocketChannel> wildcardClassMatch0 = new spullara.util.matching.Match<java.lang.Class<?>, spullara.nio.channels.FutureSocketChannel>();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel3.close();
        java.net.SocketAddress socketAddress5 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture6 = futureSocketChannel3.connect(socketAddress5);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel7.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel3.connect((java.net.SocketAddress) inetSocketAddress10);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel16.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel18.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel3.connect((java.net.SocketAddress) inetSocketAddress19);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress19);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureSocketChannel3);
        org.junit.Assert.assertNotNull(voidCompletableFuture6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture9 = futureServerSocketChannel4.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) ' ');
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("", exceptionRunnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress9 = null;
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel4.bind(socketAddress9);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress22 = futureServerSocketChannel21.getLocalAddress();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel21.bind(socketAddress23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel21.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress25);
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNull(inetSocketAddress22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable4 = null;
        benchmarker1.execute("hi!", exceptionRunnable4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup5 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup5);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup7 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup7);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.net.SocketAddress socketAddress11 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = futureServerSocketChannel9.bind(socketAddress11);
        java.net.InetSocketAddress inetSocketAddress13 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture14 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress13);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel6.connect((java.net.SocketAddress) inetSocketAddress13);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress13);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannel6);
        org.junit.Assert.assertNotNull(futureSocketChannel8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(voidCompletableFuture14);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction12 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = typeMatch11.orElse(typeFunction12);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction14 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = typeMatch11.orElse(typeFunction14);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(typeMatch13);
        org.junit.Assert.assertNotNull(typeMatch15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel8.close();
        java.net.SocketAddress socketAddress10 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel8.connect(socketAddress10);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress13 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = futureServerSocketChannel12.bind(socketAddress13);
        java.net.InetSocketAddress inetSocketAddress15 = futureServerSocketChannel14.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress15);
        futureSocketChannel8.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel18.close();
        java.net.SocketAddress socketAddress20 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel18.connect(socketAddress20);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel22.bind(socketAddress23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel18.connect((java.net.SocketAddress) inetSocketAddress25);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress25);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress29 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = futureServerSocketChannel28.bind(socketAddress29);
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress31);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel33 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress31);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(futureSocketChannel8);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(inetSocketAddress15);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
        org.junit.Assert.assertNotNull(futureSocketChannel18);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNotNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture3 = futureServerSocketChannel0.accept();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("", exceptionRunnable9);
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel20.close();
        java.net.SocketAddress socketAddress22 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel20.connect(socketAddress22);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress25 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = futureServerSocketChannel24.bind(socketAddress25);
        java.net.InetSocketAddress inetSocketAddress27 = futureServerSocketChannel26.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress27);
        futureSocketChannel20.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel30.close();
        java.net.SocketAddress socketAddress32 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel30.connect(socketAddress32);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress35 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = futureServerSocketChannel34.bind(socketAddress35);
        java.net.InetSocketAddress inetSocketAddress37 = futureServerSocketChannel36.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress37);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress37);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress41 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = futureServerSocketChannel40.bind(socketAddress41);
        java.net.InetSocketAddress inetSocketAddress43 = futureServerSocketChannel42.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress43);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress43);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel20);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(inetSocketAddress27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(futureSocketChannel30);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(inetSocketAddress37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(inetSocketAddress43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel1.bind(socketAddress2);
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel3.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(inetSocketAddress4);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel15 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass16 = futureSocketChannel15.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional17 = typeMatch0.check((java.lang.reflect.Type) wildcardClass16);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch18 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type19 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch18.check(type19);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel21 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass22 = futureSocketChannel21.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional23 = typeMatch18.check((java.lang.reflect.Type) wildcardClass22);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction24 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch25 = typeMatch18.orElse(typeFunction24);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch26 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type27 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional28 = typeMatch26.check(type27);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel29 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass30 = futureSocketChannel29.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional31 = typeMatch26.check((java.lang.reflect.Type) wildcardClass30);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional32 = typeMatch18.check((java.lang.reflect.Type) wildcardClass30);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel33 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass34 = futureSocketChannel33.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional35 = typeMatch18.check((java.lang.reflect.Type) wildcardClass34);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional36 = typeMatch0.check((java.lang.reflect.Type) wildcardClass34);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(intOptionalOptional17);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(intOptionalOptional23);
        org.junit.Assert.assertNotNull(typeMatch25);
        org.junit.Assert.assertNotNull(intOptionalOptional28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(intOptionalOptional31);
        org.junit.Assert.assertNotNull(intOptionalOptional32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(intOptionalOptional35);
        org.junit.Assert.assertNotNull(intOptionalOptional36);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) -1);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        benchmarker1.report();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel14.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress17);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction8 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = typeMatch0.orElse(typeFunction8);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction12 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = typeMatch0.orElse(typeFunction12);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch14 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction15 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch16 = typeMatch14.orElse(typeFunction15);
        spullara.util.Benchmarker benchmarker18 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable20 = null;
        benchmarker18.execute("hi!", exceptionRunnable20);
        java.lang.Class<?> wildcardClass22 = benchmarker18.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional23 = typeMatch16.check((java.lang.reflect.Type) wildcardClass22);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional24 = typeMatch0.check((java.lang.reflect.Type) wildcardClass22);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction25 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch26 = typeMatch0.orElse(typeFunction25);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(typeMatch9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(typeMatch13);
        org.junit.Assert.assertNotNull(typeMatch16);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(intOptionalOptional23);
        org.junit.Assert.assertNotNull(intOptionalOptional24);
        org.junit.Assert.assertNotNull(typeMatch26);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel0.getLocalAddress();
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel0.accept();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(inetSocketAddress4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (short) 10);
        benchmarker1.report();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture13 = futureSocketChannel0.write(byteBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (short) -1);
        benchmarker1.report();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel0.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup5 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup5);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel7 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel7.close();
        java.net.SocketAddress socketAddress9 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel7.connect(socketAddress9);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress12 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel11.bind(socketAddress12);
        java.net.InetSocketAddress inetSocketAddress14 = futureServerSocketChannel13.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel7.connect((java.net.SocketAddress) inetSocketAddress14);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel16 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel16.close();
        java.net.SocketAddress socketAddress18 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel16.connect(socketAddress18);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress21 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = futureServerSocketChannel20.bind(socketAddress21);
        java.net.InetSocketAddress inetSocketAddress23 = futureServerSocketChannel22.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture24 = futureSocketChannel16.connect((java.net.SocketAddress) inetSocketAddress23);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel7.connect((java.net.SocketAddress) inetSocketAddress23);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel26 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel26.close();
        java.net.SocketAddress socketAddress28 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel26.connect(socketAddress28);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.net.SocketAddress socketAddress32 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel33 = futureServerSocketChannel30.bind(socketAddress32);
        java.net.InetSocketAddress inetSocketAddress34 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel26.connect((java.net.SocketAddress) inetSocketAddress34);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel7.connect((java.net.SocketAddress) inetSocketAddress34);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel6.connect((java.net.SocketAddress) inetSocketAddress34);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress34);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(inetSocketAddress4);
        org.junit.Assert.assertNotNull(futureSocketChannel6);
        org.junit.Assert.assertNotNull(futureSocketChannel7);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(inetSocketAddress14);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureSocketChannel16);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(inetSocketAddress23);
        org.junit.Assert.assertNotNull(voidCompletableFuture24);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureSocketChannel26);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(futureServerSocketChannel33);
        org.junit.Assert.assertNotNull(inetSocketAddress34);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction8 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = typeMatch0.orElse(typeFunction8);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch10 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction11 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch12 = typeMatch10.orElse(typeFunction11);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type14 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional15 = typeMatch13.check(type14);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel16 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass17 = futureSocketChannel16.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional18 = typeMatch13.check((java.lang.reflect.Type) wildcardClass17);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional19 = typeMatch10.check((java.lang.reflect.Type) wildcardClass17);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction20 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch21 = typeMatch10.orElse(typeFunction20);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction22 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch23 = typeMatch21.orElse(typeFunction22);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch24 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type25 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional26 = typeMatch24.check(type25);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel27 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass28 = futureSocketChannel27.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional29 = typeMatch24.check((java.lang.reflect.Type) wildcardClass28);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress32 = futureServerSocketChannel30.getLocalAddress();
        java.lang.Class<?> wildcardClass33 = futureServerSocketChannel30.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional34 = typeMatch24.check((java.lang.reflect.Type) wildcardClass33);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional35 = typeMatch21.check((java.lang.reflect.Type) wildcardClass33);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional36 = typeMatch9.check((java.lang.reflect.Type) wildcardClass33);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(typeMatch9);
        org.junit.Assert.assertNotNull(typeMatch12);
        org.junit.Assert.assertNotNull(intOptionalOptional15);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(intOptionalOptional18);
        org.junit.Assert.assertNotNull(intOptionalOptional19);
        org.junit.Assert.assertNotNull(typeMatch21);
        org.junit.Assert.assertNotNull(typeMatch23);
        org.junit.Assert.assertNotNull(intOptionalOptional26);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(intOptionalOptional29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNull(inetSocketAddress31);
        org.junit.Assert.assertNull(inetSocketAddress32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(intOptionalOptional34);
        org.junit.Assert.assertNotNull(intOptionalOptional35);
        org.junit.Assert.assertNotNull(intOptionalOptional36);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.Benchmarker benchmarker9 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable11 = null;
        benchmarker9.execute("", exceptionRunnable11);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable14 = null;
        benchmarker9.execute("", exceptionRunnable14);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable17 = null;
        benchmarker9.execute("hi!", exceptionRunnable17);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable20 = null;
        benchmarker9.execute("hi!", exceptionRunnable20);
        java.lang.Class<?> wildcardClass22 = benchmarker9.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional23 = typeMatch7.check((java.lang.reflect.Type) wildcardClass22);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass25 = futureSocketChannel24.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional26 = typeMatch7.check((java.lang.reflect.Type) wildcardClass25);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction27 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch28 = typeMatch7.orElse(typeFunction27);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction29 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch30 = typeMatch7.orElse(typeFunction29);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(intOptionalOptional23);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(intOptionalOptional26);
        org.junit.Assert.assertNotNull(typeMatch28);
        org.junit.Assert.assertNotNull(typeMatch30);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel0.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup3 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup3);
        futureSocketChannel4.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel11.close();
        java.net.SocketAddress socketAddress13 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture14 = futureSocketChannel11.connect(socketAddress13);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel15.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress19);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress19);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel22 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel22.close();
        java.net.SocketAddress socketAddress24 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel22.connect(socketAddress24);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup26 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel27 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup26);
        java.net.InetSocketAddress inetSocketAddress28 = futureServerSocketChannel27.getLocalAddress();
        java.net.SocketAddress socketAddress29 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = futureServerSocketChannel27.bind(socketAddress29);
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress31);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress31);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress31);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureSocketChannel11);
        org.junit.Assert.assertNotNull(voidCompletableFuture14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(futureSocketChannel22);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureServerSocketChannel27);
        org.junit.Assert.assertNull(inetSocketAddress28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNotNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        java.nio.ByteBuffer byteBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture2 = futureSocketChannel0.write(byteBuffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = new spullara.nio.channels.FutureServerSocketChannel();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel1.close();
        java.net.SocketAddress socketAddress3 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture4 = futureSocketChannel1.connect(socketAddress3);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel5.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel7.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress8);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel10.close();
        java.net.SocketAddress socketAddress12 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel10.connect(socketAddress12);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress15 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = futureServerSocketChannel14.bind(socketAddress15);
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress17);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture19 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress17);
        futureSocketChannel1.close();
        futureSocketChannel1.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel22 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel22.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel24.close();
        java.net.SocketAddress socketAddress26 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel24.connect(socketAddress26);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress29 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = futureServerSocketChannel28.bind(socketAddress29);
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress31);
        futureSocketChannel24.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel34 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel34.close();
        java.net.SocketAddress socketAddress36 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel34.connect(socketAddress36);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress39 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = futureServerSocketChannel38.bind(socketAddress39);
        java.net.InetSocketAddress inetSocketAddress41 = futureServerSocketChannel40.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture42 = futureSocketChannel34.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture43 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress41);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel46 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress41);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(voidCompletableFuture4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(voidCompletableFuture19);
        org.junit.Assert.assertNotNull(futureSocketChannel24);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNotNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureSocketChannel34);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(inetSocketAddress41);
        org.junit.Assert.assertNotNull(voidCompletableFuture42);
        org.junit.Assert.assertNotNull(voidCompletableFuture43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        java.lang.Class<?> wildcardClass10 = futureSocketChannel0.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel3.accept();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel3.getLocalAddress();
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture4);
        org.junit.Assert.assertNotNull(inetSocketAddress5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type9 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional10 = typeMatch8.check(type9);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass12 = futureSocketChannel11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch8.check((java.lang.reflect.Type) wildcardClass12);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch0.check((java.lang.reflect.Type) wildcardClass12);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type16 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional17 = typeMatch15.check(type16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass19 = futureSocketChannel18.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch15.check((java.lang.reflect.Type) wildcardClass19);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch0.check((java.lang.reflect.Type) wildcardClass19);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction22 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch23 = typeMatch0.orElse(typeFunction22);
        spullara.util.Benchmarker benchmarker25 = new spullara.util.Benchmarker((int) (byte) 100);
        java.lang.Class<?> wildcardClass26 = benchmarker25.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional27 = typeMatch0.check((java.lang.reflect.Type) wildcardClass26);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(intOptionalOptional10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(intOptionalOptional17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(typeMatch23);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(intOptionalOptional27);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) 'a');
        benchmarker1.report();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel0.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup3);
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel7.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress8);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel15 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel15.close();
        java.net.SocketAddress socketAddress17 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel15.connect(socketAddress17);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup19 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup19);
        futureSocketChannel20.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel22.bind(socketAddress23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress25);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel27 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel27.close();
        java.net.SocketAddress socketAddress29 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel27.connect(socketAddress29);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel31 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress32 = futureServerSocketChannel31.getLocalAddress();
        java.net.SocketAddress socketAddress33 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = futureServerSocketChannel31.bind(socketAddress33);
        java.net.InetSocketAddress inetSocketAddress35 = futureServerSocketChannel31.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel27.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel15.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress35);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel40 = new spullara.nio.channels.FutureSocketChannel();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel41 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress42 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel43 = futureServerSocketChannel41.bind(socketAddress42);
        java.net.InetSocketAddress inetSocketAddress44 = futureServerSocketChannel43.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel40.connect((java.net.SocketAddress) inetSocketAddress44);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress44);
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureSocketChannel15);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(futureSocketChannel27);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(futureServerSocketChannel31);
        org.junit.Assert.assertNull(inetSocketAddress32);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(inetSocketAddress35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel43);
        org.junit.Assert.assertNotNull(inetSocketAddress44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("", exceptionRunnable12);
        java.lang.Class<?> wildcardClass14 = benchmarker1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup9 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel10 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup9);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.net.SocketAddress socketAddress13 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = futureServerSocketChannel11.bind(socketAddress13);
        java.net.InetSocketAddress inetSocketAddress15 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress15);
        futureSocketChannel10.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress19 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = futureServerSocketChannel18.bind(socketAddress19);
        java.net.InetSocketAddress inetSocketAddress21 = futureServerSocketChannel20.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress21);
        futureSocketChannel10.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel24.close();
        java.net.SocketAddress socketAddress26 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel24.connect(socketAddress26);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup28 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel29 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup28);
        futureSocketChannel29.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel31 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress32 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel33 = futureServerSocketChannel31.bind(socketAddress32);
        java.net.InetSocketAddress inetSocketAddress34 = futureServerSocketChannel33.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress34);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel36 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel36.close();
        java.net.SocketAddress socketAddress38 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel36.connect(socketAddress38);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress41 = futureServerSocketChannel40.getLocalAddress();
        java.net.SocketAddress socketAddress42 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel43 = futureServerSocketChannel40.bind(socketAddress42);
        java.net.InetSocketAddress inetSocketAddress44 = futureServerSocketChannel40.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel36.connect((java.net.SocketAddress) inetSocketAddress44);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress44);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress44);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture48 = futureSocketChannel10.connect((java.net.SocketAddress) inetSocketAddress44);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel49 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress44);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(futureSocketChannel10);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(inetSocketAddress15);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(inetSocketAddress21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(futureSocketChannel24);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureSocketChannel29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel31);
        org.junit.Assert.assertNotNull(futureServerSocketChannel33);
        org.junit.Assert.assertNotNull(inetSocketAddress34);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(futureSocketChannel36);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNull(inetSocketAddress41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel43);
        org.junit.Assert.assertNotNull(inetSocketAddress44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
        org.junit.Assert.assertNotNull(voidCompletableFuture48);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel5 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup4);
        futureSocketChannel5.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel7.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel5.connect((java.net.SocketAddress) inetSocketAddress10);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel12.close();
        java.net.SocketAddress socketAddress14 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture15 = futureSocketChannel12.connect(socketAddress14);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress17 = futureServerSocketChannel16.getLocalAddress();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel16.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel16.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel12.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel5.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress20);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel24.close();
        java.net.SocketAddress socketAddress26 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel24.connect(socketAddress26);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress29 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = futureServerSocketChannel28.bind(socketAddress29);
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress31);
        futureSocketChannel24.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel34 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel34.close();
        java.net.SocketAddress socketAddress36 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel34.connect(socketAddress36);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress39 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = futureServerSocketChannel38.bind(socketAddress39);
        java.net.InetSocketAddress inetSocketAddress41 = futureServerSocketChannel40.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture42 = futureSocketChannel34.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture43 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress41);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureSocketChannel5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureSocketChannel12);
        org.junit.Assert.assertNotNull(voidCompletableFuture15);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNull(inetSocketAddress17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureSocketChannel24);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNotNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureSocketChannel34);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(inetSocketAddress41);
        org.junit.Assert.assertNotNull(voidCompletableFuture42);
        org.junit.Assert.assertNotNull(voidCompletableFuture43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch0.orElse(typeFunction6);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction8 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = typeMatch0.orElse(typeFunction8);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction12 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = typeMatch0.orElse(typeFunction12);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction14 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = typeMatch13.orElse(typeFunction14);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch16 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type17 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional18 = typeMatch16.check(type17);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass20 = futureSocketChannel19.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch16.check((java.lang.reflect.Type) wildcardClass20);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction22 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch23 = typeMatch16.orElse(typeFunction22);
        spullara.util.Benchmarker benchmarker25 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable27 = null;
        benchmarker25.execute("", exceptionRunnable27);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable30 = null;
        benchmarker25.execute("", exceptionRunnable30);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable33 = null;
        benchmarker25.execute("hi!", exceptionRunnable33);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable36 = null;
        benchmarker25.execute("hi!", exceptionRunnable36);
        java.lang.Class<?> wildcardClass38 = benchmarker25.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional39 = typeMatch23.check((java.lang.reflect.Type) wildcardClass38);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional40 = typeMatch13.check((java.lang.reflect.Type) wildcardClass38);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(typeMatch9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(typeMatch13);
        org.junit.Assert.assertNotNull(typeMatch15);
        org.junit.Assert.assertNotNull(intOptionalOptional18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(typeMatch23);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(intOptionalOptional39);
        org.junit.Assert.assertNotNull(intOptionalOptional40);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable7 = null;
        benchmarker1.execute("hi!", exceptionRunnable7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel0.getLocalAddress();
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel0.accept();
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(inetSocketAddress4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel1.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel5.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress9);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        spullara.util.matching.Match<java.net.InetSocketAddress, spullara.util.Currier> inetSocketAddressMatch0 = new spullara.util.matching.Match<java.net.InetSocketAddress, spullara.util.Currier>();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        spullara.util.matching.Match<spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>, spullara.util.matching.Extractors> typeMatchMatch0 = new spullara.util.matching.Match<spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>, spullara.util.matching.Extractors>();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        futureSocketChannel1.close();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel5.accept();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction12 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = typeMatch11.orElse(typeFunction12);
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor14 = spullara.util.matching.Extractors.IntegerExtractor();
        java.lang.Class<?> wildcardClass15 = strExtractor14.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional16 = typeMatch13.check((java.lang.reflect.Type) wildcardClass15);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(typeMatch13);
        org.junit.Assert.assertNotNull(strExtractor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(intOptionalOptional16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup20 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup20);
        java.net.InetSocketAddress inetSocketAddress22 = futureServerSocketChannel21.getLocalAddress();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel21.bind(socketAddress23);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture25 = futureServerSocketChannel24.accept();
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress26);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup28 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel29 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup28);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel30.close();
        java.net.SocketAddress socketAddress32 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel30.connect(socketAddress32);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress35 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = futureServerSocketChannel34.bind(socketAddress35);
        java.net.InetSocketAddress inetSocketAddress37 = futureServerSocketChannel36.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress37);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel39 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel39.close();
        java.net.SocketAddress socketAddress41 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture42 = futureSocketChannel39.connect(socketAddress41);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel43 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress44 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel45 = futureServerSocketChannel43.bind(socketAddress44);
        java.net.InetSocketAddress inetSocketAddress46 = futureServerSocketChannel45.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel39.connect((java.net.SocketAddress) inetSocketAddress46);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture48 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress46);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel49 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel49.close();
        java.net.SocketAddress socketAddress51 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture52 = futureSocketChannel49.connect(socketAddress51);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel53 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress54 = futureServerSocketChannel53.getLocalAddress();
        java.net.SocketAddress socketAddress55 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel56 = futureServerSocketChannel53.bind(socketAddress55);
        java.net.InetSocketAddress inetSocketAddress57 = futureServerSocketChannel53.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture58 = futureSocketChannel49.connect((java.net.SocketAddress) inetSocketAddress57);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture59 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress57);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture60 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress57);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress57);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNull(inetSocketAddress22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture25);
        org.junit.Assert.assertNotNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureSocketChannel29);
        org.junit.Assert.assertNotNull(futureSocketChannel30);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(inetSocketAddress37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(futureSocketChannel39);
        org.junit.Assert.assertNotNull(voidCompletableFuture42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel43);
        org.junit.Assert.assertNotNull(futureServerSocketChannel45);
        org.junit.Assert.assertNotNull(inetSocketAddress46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
        org.junit.Assert.assertNotNull(voidCompletableFuture48);
        org.junit.Assert.assertNotNull(futureSocketChannel49);
        org.junit.Assert.assertNotNull(voidCompletableFuture52);
        org.junit.Assert.assertNotNull(futureServerSocketChannel53);
        org.junit.Assert.assertNull(inetSocketAddress54);
        org.junit.Assert.assertNotNull(futureServerSocketChannel56);
        org.junit.Assert.assertNotNull(inetSocketAddress57);
        org.junit.Assert.assertNotNull(voidCompletableFuture58);
        org.junit.Assert.assertNotNull(voidCompletableFuture59);
        org.junit.Assert.assertNotNull(voidCompletableFuture60);
        org.junit.Assert.assertNotNull(voidCompletableFuture61);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup20 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup20);
        java.net.InetSocketAddress inetSocketAddress22 = futureServerSocketChannel21.getLocalAddress();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel21.bind(socketAddress23);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture25 = futureServerSocketChannel24.accept();
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress26);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup28 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel29 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup28);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel30.close();
        java.net.SocketAddress socketAddress32 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel30.connect(socketAddress32);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress35 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel36 = futureServerSocketChannel34.bind(socketAddress35);
        java.net.InetSocketAddress inetSocketAddress37 = futureServerSocketChannel36.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress37);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel39 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel39.close();
        java.net.SocketAddress socketAddress41 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture42 = futureSocketChannel39.connect(socketAddress41);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel43 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress44 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel45 = futureServerSocketChannel43.bind(socketAddress44);
        java.net.InetSocketAddress inetSocketAddress46 = futureServerSocketChannel45.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel39.connect((java.net.SocketAddress) inetSocketAddress46);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture48 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress46);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel49 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel49.close();
        java.net.SocketAddress socketAddress51 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture52 = futureSocketChannel49.connect(socketAddress51);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel53 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress54 = futureServerSocketChannel53.getLocalAddress();
        java.net.SocketAddress socketAddress55 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel56 = futureServerSocketChannel53.bind(socketAddress55);
        java.net.InetSocketAddress inetSocketAddress57 = futureServerSocketChannel53.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture58 = futureSocketChannel49.connect((java.net.SocketAddress) inetSocketAddress57);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture59 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress57);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture60 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress57);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress57);
        java.nio.ByteBuffer byteBuffer62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture63 = futureSocketChannel0.read(byteBuffer62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNull(inetSocketAddress22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture25);
        org.junit.Assert.assertNotNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureSocketChannel29);
        org.junit.Assert.assertNotNull(futureSocketChannel30);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(futureServerSocketChannel36);
        org.junit.Assert.assertNotNull(inetSocketAddress37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(futureSocketChannel39);
        org.junit.Assert.assertNotNull(voidCompletableFuture42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel43);
        org.junit.Assert.assertNotNull(futureServerSocketChannel45);
        org.junit.Assert.assertNotNull(inetSocketAddress46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
        org.junit.Assert.assertNotNull(voidCompletableFuture48);
        org.junit.Assert.assertNotNull(futureSocketChannel49);
        org.junit.Assert.assertNotNull(voidCompletableFuture52);
        org.junit.Assert.assertNotNull(futureServerSocketChannel53);
        org.junit.Assert.assertNull(inetSocketAddress54);
        org.junit.Assert.assertNotNull(futureServerSocketChannel56);
        org.junit.Assert.assertNotNull(inetSocketAddress57);
        org.junit.Assert.assertNotNull(voidCompletableFuture58);
        org.junit.Assert.assertNotNull(voidCompletableFuture59);
        org.junit.Assert.assertNotNull(voidCompletableFuture60);
        org.junit.Assert.assertNotNull(voidCompletableFuture61);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture3 = futureServerSocketChannel2.accept();
        java.net.SocketAddress socketAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        benchmarker1.report();
        java.lang.Class<?> wildcardClass9 = benchmarker1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup3 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup3);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress9);
        futureSocketChannel4.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress13 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel14 = futureServerSocketChannel12.bind(socketAddress13);
        java.net.InetSocketAddress inetSocketAddress15 = futureServerSocketChannel14.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress15);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = futureServerSocketChannel2.bind((java.net.SocketAddress) inetSocketAddress15);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel14);
        org.junit.Assert.assertNotNull(inetSocketAddress15);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel1.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel1.getLocalAddress();
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNull(inetSocketAddress4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction12 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = typeMatch11.orElse(typeFunction12);
        java.lang.reflect.Type type14 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional15 = typeMatch11.check(type14);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(typeMatch13);
        org.junit.Assert.assertNotNull(intOptionalOptional15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(10);
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel4.getLocalAddress();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.net.SocketAddress socketAddress12 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel10.bind(socketAddress12);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture14 = futureServerSocketChannel13.accept();
        java.net.InetSocketAddress inetSocketAddress15 = futureServerSocketChannel13.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress15);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress15);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture14);
        org.junit.Assert.assertNotNull(inetSocketAddress15);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.SocketAddress socketAddress2 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = futureServerSocketChannel0.bind(socketAddress2);
        java.net.InetSocketAddress inetSocketAddress4 = futureServerSocketChannel0.getLocalAddress();
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel0.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel0.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture7 = futureServerSocketChannel0.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(inetSocketAddress4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional12 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional14 = strExtractor0.unapply("");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction9 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch10 = typeMatch3.orElse(typeFunction9);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type12 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional13 = typeMatch11.check(type12);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel14 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass15 = futureSocketChannel14.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional16 = typeMatch11.check((java.lang.reflect.Type) wildcardClass15);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional17 = typeMatch3.check((java.lang.reflect.Type) wildcardClass15);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional18 = typeMatch0.check((java.lang.reflect.Type) wildcardClass15);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction19 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch20 = typeMatch0.orElse(typeFunction19);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction21 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch22 = typeMatch0.orElse(typeFunction21);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(typeMatch10);
        org.junit.Assert.assertNotNull(intOptionalOptional13);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(intOptionalOptional16);
        org.junit.Assert.assertNotNull(intOptionalOptional17);
        org.junit.Assert.assertNotNull(intOptionalOptional18);
        org.junit.Assert.assertNotNull(typeMatch20);
        org.junit.Assert.assertNotNull(typeMatch22);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture8 = futureSocketChannel0.read(byteBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional12 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional14 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional14);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel2.close();
        java.net.SocketAddress socketAddress4 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture5 = futureSocketChannel2.connect(socketAddress4);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel6.bind(socketAddress8);
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress10);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress10);
        org.junit.Assert.assertNotNull(futureSocketChannel2);
        org.junit.Assert.assertNotNull(voidCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel15 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel15.close();
        java.net.SocketAddress socketAddress17 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel15.connect(socketAddress17);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup19 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup19);
        futureSocketChannel20.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel22.bind(socketAddress23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture26 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress25);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel27 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel27.close();
        java.net.SocketAddress socketAddress29 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel27.connect(socketAddress29);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel31 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress32 = futureServerSocketChannel31.getLocalAddress();
        java.net.SocketAddress socketAddress33 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = futureServerSocketChannel31.bind(socketAddress33);
        java.net.InetSocketAddress inetSocketAddress35 = futureServerSocketChannel31.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel27.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel20.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel15.connect((java.net.SocketAddress) inetSocketAddress35);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress35);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureSocketChannel15);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(voidCompletableFuture26);
        org.junit.Assert.assertNotNull(futureSocketChannel27);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
        org.junit.Assert.assertNotNull(futureServerSocketChannel31);
        org.junit.Assert.assertNull(inetSocketAddress32);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNotNull(inetSocketAddress35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel4 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel4.close();
        java.net.SocketAddress socketAddress6 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel4.connect(socketAddress6);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress9 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel10 = futureServerSocketChannel8.bind(socketAddress9);
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel10.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress11);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel13 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel13.close();
        java.net.SocketAddress socketAddress15 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture16 = futureSocketChannel13.connect(socketAddress15);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel17 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress18 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = futureServerSocketChannel17.bind(socketAddress18);
        java.net.InetSocketAddress inetSocketAddress20 = futureServerSocketChannel19.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel13.connect((java.net.SocketAddress) inetSocketAddress20);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress20);
        futureSocketChannel4.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel24.close();
        java.net.SocketAddress socketAddress26 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel24.connect(socketAddress26);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel28 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress29 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = futureServerSocketChannel28.bind(socketAddress29);
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress31);
        futureSocketChannel24.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel34 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel34.close();
        java.net.SocketAddress socketAddress36 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel34.connect(socketAddress36);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress39 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = futureServerSocketChannel38.bind(socketAddress39);
        java.net.InetSocketAddress inetSocketAddress41 = futureServerSocketChannel40.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture42 = futureSocketChannel34.connect((java.net.SocketAddress) inetSocketAddress41);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture43 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress41);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel44 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress45 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel46 = futureServerSocketChannel44.bind(socketAddress45);
        java.net.InetSocketAddress inetSocketAddress47 = futureServerSocketChannel46.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture48 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress47);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture49 = futureSocketChannel4.connect((java.net.SocketAddress) inetSocketAddress47);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture50 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress47);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel51 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress52 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel53 = futureServerSocketChannel51.bind(socketAddress52);
        java.net.InetSocketAddress inetSocketAddress54 = futureServerSocketChannel53.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture55 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress54);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel56 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel56.close();
        java.net.SocketAddress socketAddress58 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture59 = futureSocketChannel56.connect(socketAddress58);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup60 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel61 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup60);
        java.net.InetSocketAddress inetSocketAddress62 = futureServerSocketChannel61.getLocalAddress();
        java.net.SocketAddress socketAddress63 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel64 = futureServerSocketChannel61.bind(socketAddress63);
        java.net.InetSocketAddress inetSocketAddress65 = futureServerSocketChannel64.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture66 = futureSocketChannel56.connect((java.net.SocketAddress) inetSocketAddress65);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture67 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress65);
        org.junit.Assert.assertNotNull(futureSocketChannel4);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureSocketChannel13);
        org.junit.Assert.assertNotNull(voidCompletableFuture16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(inetSocketAddress20);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(futureSocketChannel24);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNotNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureSocketChannel34);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNotNull(inetSocketAddress41);
        org.junit.Assert.assertNotNull(voidCompletableFuture42);
        org.junit.Assert.assertNotNull(voidCompletableFuture43);
        org.junit.Assert.assertNotNull(futureServerSocketChannel44);
        org.junit.Assert.assertNotNull(futureServerSocketChannel46);
        org.junit.Assert.assertNotNull(inetSocketAddress47);
        org.junit.Assert.assertNotNull(voidCompletableFuture48);
        org.junit.Assert.assertNotNull(voidCompletableFuture49);
        org.junit.Assert.assertNotNull(voidCompletableFuture50);
        org.junit.Assert.assertNotNull(futureServerSocketChannel51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel53);
        org.junit.Assert.assertNotNull(inetSocketAddress54);
        org.junit.Assert.assertNotNull(voidCompletableFuture55);
        org.junit.Assert.assertNotNull(futureSocketChannel56);
        org.junit.Assert.assertNotNull(voidCompletableFuture59);
        org.junit.Assert.assertNotNull(futureServerSocketChannel61);
        org.junit.Assert.assertNull(inetSocketAddress62);
        org.junit.Assert.assertNotNull(futureServerSocketChannel64);
        org.junit.Assert.assertNotNull(inetSocketAddress65);
        org.junit.Assert.assertNotNull(voidCompletableFuture66);
        org.junit.Assert.assertNotNull(voidCompletableFuture67);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional12 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional14 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional16 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional18 = strExtractor0.unapply("");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional14);
        org.junit.Assert.assertNotNull(intOptional16);
        org.junit.Assert.assertNotNull(intOptional18);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        spullara.util.Benchmarker benchmarker2 = new spullara.util.Benchmarker((int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = benchmarker2.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional4 = typeMatch0.check((java.lang.reflect.Type) wildcardClass3);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction5 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch6 = typeMatch0.orElse(typeFunction5);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction7 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = typeMatch6.orElse(typeFunction7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intOptionalOptional4);
        org.junit.Assert.assertNotNull(typeMatch6);
        org.junit.Assert.assertNotNull(typeMatch8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        spullara.util.Benchmarker benchmarker2 = new spullara.util.Benchmarker((int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = benchmarker2.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional4 = typeMatch0.check((java.lang.reflect.Type) wildcardClass3);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction5 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch6 = typeMatch0.orElse(typeFunction5);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction7 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = typeMatch0.orElse(typeFunction7);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intOptionalOptional4);
        org.junit.Assert.assertNotNull(typeMatch6);
        org.junit.Assert.assertNotNull(typeMatch8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress10 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel0.connect(socketAddress10);
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        futureSocketChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        java.nio.ByteBuffer byteBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture9 = futureSocketChannel1.read(byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((-1));
        benchmarker1.report();
        benchmarker1.report();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (byte) -1);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        spullara.util.matching.Match<java.lang.Comparable<java.lang.String>, spullara.nio.channels.FutureServerSocketChannel> strComparableMatch0 = new spullara.util.matching.Match<java.lang.Comparable<java.lang.String>, spullara.nio.channels.FutureServerSocketChannel>();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel2 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel2.close();
        futureSocketChannel2.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.net.SocketAddress socketAddress8 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = futureServerSocketChannel6.bind(socketAddress8);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture10 = futureServerSocketChannel9.accept();
        java.net.InetSocketAddress inetSocketAddress11 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel2.connect((java.net.SocketAddress) inetSocketAddress11);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = futureServerSocketChannel0.bind((java.net.SocketAddress) inetSocketAddress11);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Address already in use");
        } catch (java.net.BindException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture10);
        org.junit.Assert.assertNotNull(inetSocketAddress11);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("hi!", exceptionRunnable3);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker1.execute("hi!", exceptionRunnable6);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker1.execute("hi!", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker1.execute("", exceptionRunnable12);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel19.close();
        java.net.SocketAddress socketAddress21 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel19.connect(socketAddress21);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel23 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress24 = futureServerSocketChannel23.getLocalAddress();
        java.net.SocketAddress socketAddress25 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = futureServerSocketChannel23.bind(socketAddress25);
        java.net.InetSocketAddress inetSocketAddress27 = futureServerSocketChannel23.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress27);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress27);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup31 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel32 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup31);
        java.net.InetSocketAddress inetSocketAddress33 = futureServerSocketChannel32.getLocalAddress();
        java.net.SocketAddress socketAddress34 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel35 = futureServerSocketChannel32.bind(socketAddress34);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture36 = futureServerSocketChannel35.accept();
        java.net.InetSocketAddress inetSocketAddress37 = futureServerSocketChannel35.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture38 = futureSocketChannel30.connect((java.net.SocketAddress) inetSocketAddress37);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress37);
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel19);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel23);
        org.junit.Assert.assertNull(inetSocketAddress24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(inetSocketAddress27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel32);
        org.junit.Assert.assertNull(inetSocketAddress33);
        org.junit.Assert.assertNotNull(futureServerSocketChannel35);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture36);
        org.junit.Assert.assertNotNull(inetSocketAddress37);
        org.junit.Assert.assertNotNull(voidCompletableFuture38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel1.accept();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel6.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel6.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel6.getLocalAddress();
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel1.bind((java.net.SocketAddress) inetSocketAddress10);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(inetSocketAddress10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture5 = futureSocketChannel0.read(byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        spullara.util.Benchmarker benchmarker13 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker13.report();
        java.lang.Class<?> wildcardClass15 = benchmarker13.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional16 = typeMatch0.check((java.lang.reflect.Type) wildcardClass15);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup17 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup17);
        futureSocketChannel18.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel20 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress21 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = futureServerSocketChannel20.bind(socketAddress21);
        java.net.InetSocketAddress inetSocketAddress23 = futureServerSocketChannel22.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture24 = futureSocketChannel18.connect((java.net.SocketAddress) inetSocketAddress23);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel25 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel25.close();
        java.net.SocketAddress socketAddress27 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel25.connect(socketAddress27);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel29 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress30 = futureServerSocketChannel29.getLocalAddress();
        java.net.SocketAddress socketAddress31 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel32 = futureServerSocketChannel29.bind(socketAddress31);
        java.net.InetSocketAddress inetSocketAddress33 = futureServerSocketChannel29.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture34 = futureSocketChannel25.connect((java.net.SocketAddress) inetSocketAddress33);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel18.connect((java.net.SocketAddress) inetSocketAddress33);
        java.lang.Class<?> wildcardClass36 = futureSocketChannel18.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional37 = typeMatch0.check((java.lang.reflect.Type) wildcardClass36);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(intOptionalOptional16);
        org.junit.Assert.assertNotNull(futureSocketChannel18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNotNull(inetSocketAddress23);
        org.junit.Assert.assertNotNull(voidCompletableFuture24);
        org.junit.Assert.assertNotNull(futureSocketChannel25);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(futureServerSocketChannel29);
        org.junit.Assert.assertNull(inetSocketAddress30);
        org.junit.Assert.assertNotNull(futureServerSocketChannel32);
        org.junit.Assert.assertNotNull(inetSocketAddress33);
        org.junit.Assert.assertNotNull(voidCompletableFuture34);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(intOptionalOptional37);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        spullara.util.Benchmarker benchmarker2 = new spullara.util.Benchmarker((int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = benchmarker2.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional4 = typeMatch0.check((java.lang.reflect.Type) wildcardClass3);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch5 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction6 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch7 = typeMatch5.orElse(typeFunction6);
        spullara.util.Benchmarker benchmarker9 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable11 = null;
        benchmarker9.execute("hi!", exceptionRunnable11);
        java.lang.Class<?> wildcardClass13 = benchmarker9.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch7.check((java.lang.reflect.Type) wildcardClass13);
        spullara.util.Benchmarker benchmarker16 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable18 = null;
        benchmarker16.execute("", exceptionRunnable18);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable21 = null;
        benchmarker16.execute("", exceptionRunnable21);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable24 = null;
        benchmarker16.execute("hi!", exceptionRunnable24);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable27 = null;
        benchmarker16.execute("", exceptionRunnable27);
        java.lang.Class<?> wildcardClass29 = benchmarker16.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional30 = typeMatch7.check((java.lang.reflect.Type) wildcardClass29);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction31 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch32 = typeMatch7.orElse(typeFunction31);
        spullara.util.Benchmarker benchmarker34 = new spullara.util.Benchmarker((int) (byte) 100);
        benchmarker34.report();
        java.lang.Class<?> wildcardClass36 = benchmarker34.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional37 = typeMatch32.check((java.lang.reflect.Type) wildcardClass36);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch38 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type39 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional40 = typeMatch38.check(type39);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel41 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass42 = futureSocketChannel41.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional43 = typeMatch38.check((java.lang.reflect.Type) wildcardClass42);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction44 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch45 = typeMatch38.orElse(typeFunction44);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction46 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch47 = typeMatch38.orElse(typeFunction46);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction48 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch49 = typeMatch38.orElse(typeFunction48);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction50 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch51 = typeMatch38.orElse(typeFunction50);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch52 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction53 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch54 = typeMatch52.orElse(typeFunction53);
        spullara.util.Benchmarker benchmarker56 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable58 = null;
        benchmarker56.execute("hi!", exceptionRunnable58);
        java.lang.Class<?> wildcardClass60 = benchmarker56.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional61 = typeMatch54.check((java.lang.reflect.Type) wildcardClass60);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional62 = typeMatch38.check((java.lang.reflect.Type) wildcardClass60);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional63 = typeMatch32.check((java.lang.reflect.Type) wildcardClass60);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional64 = typeMatch0.check((java.lang.reflect.Type) wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(intOptionalOptional4);
        org.junit.Assert.assertNotNull(typeMatch7);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(intOptionalOptional30);
        org.junit.Assert.assertNotNull(typeMatch32);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(intOptionalOptional37);
        org.junit.Assert.assertNotNull(intOptionalOptional40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(intOptionalOptional43);
        org.junit.Assert.assertNotNull(typeMatch45);
        org.junit.Assert.assertNotNull(typeMatch47);
        org.junit.Assert.assertNotNull(typeMatch49);
        org.junit.Assert.assertNotNull(typeMatch51);
        org.junit.Assert.assertNotNull(typeMatch54);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(intOptionalOptional61);
        org.junit.Assert.assertNotNull(intOptionalOptional62);
        org.junit.Assert.assertNotNull(intOptionalOptional63);
        org.junit.Assert.assertNotNull(intOptionalOptional64);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel5.accept();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress9);
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture13 = futureSocketChannel0.read(byteBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        futureSocketChannel0.close();
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture7 = futureSocketChannel0.write(byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = new spullara.nio.channels.FutureServerSocketChannel();
        java.net.InetSocketAddress inetSocketAddress1 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel0.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel0.getLocalAddress();
        org.junit.Assert.assertNull(inetSocketAddress1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNull(inetSocketAddress3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        spullara.util.matching.Match<java.lang.Class<?>, spullara.util.Benchmarker> wildcardClassMatch0 = new spullara.util.matching.Match<java.lang.Class<?>, spullara.util.Benchmarker>();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel8.close();
        java.net.SocketAddress socketAddress10 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture11 = futureSocketChannel8.connect(socketAddress10);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress13 = futureServerSocketChannel12.getLocalAddress();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel12.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel12.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel19.close();
        java.net.SocketAddress socketAddress21 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel19.connect(socketAddress21);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup23);
        java.net.InetSocketAddress inetSocketAddress25 = futureServerSocketChannel24.getLocalAddress();
        java.net.SocketAddress socketAddress26 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel27 = futureServerSocketChannel24.bind(socketAddress26);
        java.net.InetSocketAddress inetSocketAddress28 = futureServerSocketChannel27.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress28);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture30 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress28);
        java.nio.ByteBuffer byteBuffer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture32 = futureSocketChannel1.write(byteBuffer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureSocketChannel8);
        org.junit.Assert.assertNotNull(voidCompletableFuture11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel19);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNull(inetSocketAddress25);
        org.junit.Assert.assertNotNull(futureServerSocketChannel27);
        org.junit.Assert.assertNotNull(inetSocketAddress28);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
        org.junit.Assert.assertNotNull(voidCompletableFuture30);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
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
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture12 = futureSocketChannel1.read(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel0.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup20 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup20);
        java.net.InetSocketAddress inetSocketAddress22 = futureServerSocketChannel21.getLocalAddress();
        java.net.SocketAddress socketAddress23 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel24 = futureServerSocketChannel21.bind(socketAddress23);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture25 = futureServerSocketChannel24.accept();
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel24.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress26);
        futureSocketChannel0.close();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNull(inetSocketAddress22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel24);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture25);
        org.junit.Assert.assertNotNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((int) (short) 0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        benchmarker1.execute("", exceptionRunnable3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.Benchmarker benchmarker4 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable6 = null;
        benchmarker4.execute("hi!", exceptionRunnable6);
        java.lang.Class<?> wildcardClass8 = benchmarker4.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch2.check((java.lang.reflect.Type) wildcardClass8);
        spullara.util.Benchmarker benchmarker11 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable13 = null;
        benchmarker11.execute("", exceptionRunnable13);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable16 = null;
        benchmarker11.execute("", exceptionRunnable16);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable19 = null;
        benchmarker11.execute("hi!", exceptionRunnable19);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable22 = null;
        benchmarker11.execute("", exceptionRunnable22);
        java.lang.Class<?> wildcardClass24 = benchmarker11.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional25 = typeMatch2.check((java.lang.reflect.Type) wildcardClass24);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction26 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch27 = typeMatch2.orElse(typeFunction26);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction28 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch29 = typeMatch2.orElse(typeFunction28);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction30 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch31 = typeMatch2.orElse(typeFunction30);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(intOptionalOptional25);
        org.junit.Assert.assertNotNull(typeMatch27);
        org.junit.Assert.assertNotNull(typeMatch29);
        org.junit.Assert.assertNotNull(typeMatch31);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = new spullara.nio.channels.FutureSocketChannel();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture6 = futureServerSocketChannel5.accept();
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        futureSocketChannel0.close();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup10 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup10);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress13 = futureServerSocketChannel12.getLocalAddress();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel12.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel12.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress16);
        futureSocketChannel11.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel19 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress20 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = futureServerSocketChannel19.bind(socketAddress20);
        java.net.InetSocketAddress inetSocketAddress22 = futureServerSocketChannel21.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture23 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress22);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel24 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel24.close();
        java.net.SocketAddress socketAddress26 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel24.connect(socketAddress26);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup28 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel29 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup28);
        futureSocketChannel29.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel31 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress32 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel33 = futureServerSocketChannel31.bind(socketAddress32);
        java.net.InetSocketAddress inetSocketAddress34 = futureServerSocketChannel33.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress34);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel36 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel36.close();
        java.net.SocketAddress socketAddress38 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel36.connect(socketAddress38);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel40 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress41 = futureServerSocketChannel40.getLocalAddress();
        java.net.SocketAddress socketAddress42 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel43 = futureServerSocketChannel40.bind(socketAddress42);
        java.net.InetSocketAddress inetSocketAddress44 = futureServerSocketChannel40.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel36.connect((java.net.SocketAddress) inetSocketAddress44);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress44);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture47 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress44);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel48 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel48.close();
        java.net.SocketAddress socketAddress50 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture51 = futureSocketChannel48.connect(socketAddress50);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel52 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress53 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel54 = futureServerSocketChannel52.bind(socketAddress53);
        java.net.InetSocketAddress inetSocketAddress55 = futureServerSocketChannel54.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture56 = futureSocketChannel48.connect((java.net.SocketAddress) inetSocketAddress55);
        futureSocketChannel48.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel58 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel58.close();
        java.net.SocketAddress socketAddress60 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture61 = futureSocketChannel58.connect(socketAddress60);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel62 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress63 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel64 = futureServerSocketChannel62.bind(socketAddress63);
        java.net.InetSocketAddress inetSocketAddress65 = futureServerSocketChannel64.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture66 = futureSocketChannel58.connect((java.net.SocketAddress) inetSocketAddress65);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture67 = futureSocketChannel48.connect((java.net.SocketAddress) inetSocketAddress65);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture68 = futureSocketChannel24.connect((java.net.SocketAddress) inetSocketAddress65);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture69 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress65);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture70 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress65);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(futureServerSocketChannel19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNotNull(inetSocketAddress22);
        org.junit.Assert.assertNotNull(voidCompletableFuture23);
        org.junit.Assert.assertNotNull(futureSocketChannel24);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(futureSocketChannel29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel31);
        org.junit.Assert.assertNotNull(futureServerSocketChannel33);
        org.junit.Assert.assertNotNull(inetSocketAddress34);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(futureSocketChannel36);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel40);
        org.junit.Assert.assertNull(inetSocketAddress41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel43);
        org.junit.Assert.assertNotNull(inetSocketAddress44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(voidCompletableFuture47);
        org.junit.Assert.assertNotNull(futureSocketChannel48);
        org.junit.Assert.assertNotNull(voidCompletableFuture51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel52);
        org.junit.Assert.assertNotNull(futureServerSocketChannel54);
        org.junit.Assert.assertNotNull(inetSocketAddress55);
        org.junit.Assert.assertNotNull(voidCompletableFuture56);
        org.junit.Assert.assertNotNull(futureSocketChannel58);
        org.junit.Assert.assertNotNull(voidCompletableFuture61);
        org.junit.Assert.assertNotNull(futureServerSocketChannel62);
        org.junit.Assert.assertNotNull(futureServerSocketChannel64);
        org.junit.Assert.assertNotNull(inetSocketAddress65);
        org.junit.Assert.assertNotNull(voidCompletableFuture66);
        org.junit.Assert.assertNotNull(voidCompletableFuture67);
        org.junit.Assert.assertNotNull(voidCompletableFuture68);
        org.junit.Assert.assertNotNull(voidCompletableFuture69);
        org.junit.Assert.assertNotNull(voidCompletableFuture70);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        spullara.util.Limiter limiter12 = new spullara.util.Limiter();
        java.lang.Class<?> wildcardClass13 = limiter12.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch11.check((java.lang.reflect.Type) wildcardClass13);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction15 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch16 = typeMatch11.orElse(typeFunction15);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(typeMatch16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel0 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress1 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = futureServerSocketChannel0.bind(socketAddress1);
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture4 = futureServerSocketChannel2.accept();
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel2.accept();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AcceptPendingException; message: null");
        } catch (java.nio.channels.AcceptPendingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel0);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNotNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress5 = futureServerSocketChannel4.getLocalAddress();
        java.net.SocketAddress socketAddress6 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel7 = futureServerSocketChannel4.bind(socketAddress6);
        java.net.InetSocketAddress inetSocketAddress8 = futureServerSocketChannel4.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture9 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress8);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup10 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel11 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup10);
        futureSocketChannel11.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel18 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel18.close();
        java.net.SocketAddress socketAddress20 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture21 = futureSocketChannel18.connect(socketAddress20);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress23 = futureServerSocketChannel22.getLocalAddress();
        java.net.SocketAddress socketAddress24 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel25 = futureServerSocketChannel22.bind(socketAddress24);
        java.net.InetSocketAddress inetSocketAddress26 = futureServerSocketChannel22.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture27 = futureSocketChannel18.connect((java.net.SocketAddress) inetSocketAddress26);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress26);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel29 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel29.close();
        java.net.SocketAddress socketAddress31 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture32 = futureSocketChannel29.connect(socketAddress31);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup33 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel34 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup33);
        java.net.InetSocketAddress inetSocketAddress35 = futureServerSocketChannel34.getLocalAddress();
        java.net.SocketAddress socketAddress36 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel37 = futureServerSocketChannel34.bind(socketAddress36);
        java.net.InetSocketAddress inetSocketAddress38 = futureServerSocketChannel37.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture39 = futureSocketChannel29.connect((java.net.SocketAddress) inetSocketAddress38);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture40 = futureSocketChannel11.connect((java.net.SocketAddress) inetSocketAddress38);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress38);
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNull(inetSocketAddress5);
        org.junit.Assert.assertNotNull(futureServerSocketChannel7);
        org.junit.Assert.assertNotNull(inetSocketAddress8);
        org.junit.Assert.assertNotNull(voidCompletableFuture9);
        org.junit.Assert.assertNotNull(futureSocketChannel11);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(futureSocketChannel18);
        org.junit.Assert.assertNotNull(voidCompletableFuture21);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNull(inetSocketAddress23);
        org.junit.Assert.assertNotNull(futureServerSocketChannel25);
        org.junit.Assert.assertNotNull(inetSocketAddress26);
        org.junit.Assert.assertNotNull(voidCompletableFuture27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(futureSocketChannel29);
        org.junit.Assert.assertNotNull(voidCompletableFuture32);
        org.junit.Assert.assertNotNull(futureServerSocketChannel34);
        org.junit.Assert.assertNull(inetSocketAddress35);
        org.junit.Assert.assertNotNull(futureServerSocketChannel37);
        org.junit.Assert.assertNotNull(inetSocketAddress38);
        org.junit.Assert.assertNotNull(voidCompletableFuture39);
        org.junit.Assert.assertNotNull(voidCompletableFuture40);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel2 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress3 = futureServerSocketChannel2.getLocalAddress();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel2.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel2.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress10 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel11 = futureServerSocketChannel9.bind(socketAddress10);
        java.net.InetSocketAddress inetSocketAddress12 = futureServerSocketChannel11.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture13 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress12);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel14 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel14.close();
        java.net.SocketAddress socketAddress16 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel14.connect(socketAddress16);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup18 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup18);
        futureSocketChannel19.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel21 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress22 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel23 = futureServerSocketChannel21.bind(socketAddress22);
        java.net.InetSocketAddress inetSocketAddress24 = futureServerSocketChannel23.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress24);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel26 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel26.close();
        java.net.SocketAddress socketAddress28 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel26.connect(socketAddress28);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel30 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress31 = futureServerSocketChannel30.getLocalAddress();
        java.net.SocketAddress socketAddress32 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel33 = futureServerSocketChannel30.bind(socketAddress32);
        java.net.InetSocketAddress inetSocketAddress34 = futureServerSocketChannel30.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture35 = futureSocketChannel26.connect((java.net.SocketAddress) inetSocketAddress34);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture36 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress34);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel14.connect((java.net.SocketAddress) inetSocketAddress34);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel38 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel38.close();
        java.net.SocketAddress socketAddress40 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture41 = futureSocketChannel38.connect(socketAddress40);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel42 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress43 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel44 = futureServerSocketChannel42.bind(socketAddress43);
        java.net.InetSocketAddress inetSocketAddress45 = futureServerSocketChannel44.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel38.connect((java.net.SocketAddress) inetSocketAddress45);
        futureSocketChannel38.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel48 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel48.close();
        java.net.SocketAddress socketAddress50 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture51 = futureSocketChannel48.connect(socketAddress50);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel52 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress53 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel54 = futureServerSocketChannel52.bind(socketAddress53);
        java.net.InetSocketAddress inetSocketAddress55 = futureServerSocketChannel54.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture56 = futureSocketChannel48.connect((java.net.SocketAddress) inetSocketAddress55);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture57 = futureSocketChannel38.connect((java.net.SocketAddress) inetSocketAddress55);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture58 = futureSocketChannel14.connect((java.net.SocketAddress) inetSocketAddress55);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture59 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress55);
        java.nio.ByteBuffer byteBuffer60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture61 = futureSocketChannel1.read(byteBuffer60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel2);
        org.junit.Assert.assertNull(inetSocketAddress3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNotNull(futureServerSocketChannel11);
        org.junit.Assert.assertNotNull(inetSocketAddress12);
        org.junit.Assert.assertNotNull(voidCompletableFuture13);
        org.junit.Assert.assertNotNull(futureSocketChannel14);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(futureSocketChannel19);
        org.junit.Assert.assertNotNull(futureServerSocketChannel21);
        org.junit.Assert.assertNotNull(futureServerSocketChannel23);
        org.junit.Assert.assertNotNull(inetSocketAddress24);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureSocketChannel26);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel30);
        org.junit.Assert.assertNull(inetSocketAddress31);
        org.junit.Assert.assertNotNull(futureServerSocketChannel33);
        org.junit.Assert.assertNotNull(inetSocketAddress34);
        org.junit.Assert.assertNotNull(voidCompletableFuture35);
        org.junit.Assert.assertNotNull(voidCompletableFuture36);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureSocketChannel38);
        org.junit.Assert.assertNotNull(voidCompletableFuture41);
        org.junit.Assert.assertNotNull(futureServerSocketChannel42);
        org.junit.Assert.assertNotNull(futureServerSocketChannel44);
        org.junit.Assert.assertNotNull(inetSocketAddress45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
        org.junit.Assert.assertNotNull(futureSocketChannel48);
        org.junit.Assert.assertNotNull(voidCompletableFuture51);
        org.junit.Assert.assertNotNull(futureServerSocketChannel52);
        org.junit.Assert.assertNotNull(futureServerSocketChannel54);
        org.junit.Assert.assertNotNull(inetSocketAddress55);
        org.junit.Assert.assertNotNull(voidCompletableFuture56);
        org.junit.Assert.assertNotNull(voidCompletableFuture57);
        org.junit.Assert.assertNotNull(voidCompletableFuture58);
        org.junit.Assert.assertNotNull(voidCompletableFuture59);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        java.nio.ByteBuffer byteBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.CompletableFuture<java.lang.Integer> intCompletableFuture20 = futureSocketChannel0.write(byteBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel1 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup0);
        futureSocketChannel1.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel3 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = futureServerSocketChannel3.bind(socketAddress4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture7 = futureSocketChannel1.connect((java.net.SocketAddress) inetSocketAddress6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = futureSocketChannel1.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel1);
        org.junit.Assert.assertNotNull(futureServerSocketChannel3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(voidCompletableFuture7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress5 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel6 = futureServerSocketChannel4.bind(socketAddress5);
        java.net.InetSocketAddress inetSocketAddress7 = futureServerSocketChannel6.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture8 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel9.close();
        java.net.SocketAddress socketAddress11 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture12 = futureSocketChannel9.connect(socketAddress11);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel13 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress14 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel15 = futureServerSocketChannel13.bind(socketAddress14);
        java.net.InetSocketAddress inetSocketAddress16 = futureServerSocketChannel15.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture17 = futureSocketChannel9.connect((java.net.SocketAddress) inetSocketAddress16);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture18 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress16);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel19 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel19.close();
        java.net.SocketAddress socketAddress21 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture22 = futureSocketChannel19.connect(socketAddress21);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel23 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress24 = futureServerSocketChannel23.getLocalAddress();
        java.net.SocketAddress socketAddress25 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel26 = futureServerSocketChannel23.bind(socketAddress25);
        java.net.InetSocketAddress inetSocketAddress27 = futureServerSocketChannel23.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture28 = futureSocketChannel19.connect((java.net.SocketAddress) inetSocketAddress27);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture29 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress27);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = futureSocketChannel0.getPort();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureServerSocketChannel6);
        org.junit.Assert.assertNotNull(inetSocketAddress7);
        org.junit.Assert.assertNotNull(voidCompletableFuture8);
        org.junit.Assert.assertNotNull(futureSocketChannel9);
        org.junit.Assert.assertNotNull(voidCompletableFuture12);
        org.junit.Assert.assertNotNull(futureServerSocketChannel13);
        org.junit.Assert.assertNotNull(futureServerSocketChannel15);
        org.junit.Assert.assertNotNull(inetSocketAddress16);
        org.junit.Assert.assertNotNull(voidCompletableFuture17);
        org.junit.Assert.assertNotNull(voidCompletableFuture18);
        org.junit.Assert.assertNotNull(futureSocketChannel19);
        org.junit.Assert.assertNotNull(voidCompletableFuture22);
        org.junit.Assert.assertNotNull(futureServerSocketChannel23);
        org.junit.Assert.assertNull(inetSocketAddress24);
        org.junit.Assert.assertNotNull(futureServerSocketChannel26);
        org.junit.Assert.assertNotNull(inetSocketAddress27);
        org.junit.Assert.assertNotNull(voidCompletableFuture28);
        org.junit.Assert.assertNotNull(voidCompletableFuture29);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        spullara.util.matching.Extractor<java.lang.String, java.lang.Integer> strExtractor0 = spullara.util.matching.Extractors.IntegerExtractor();
        java.util.Optional<java.lang.Integer> intOptional2 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional4 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional6 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional8 = strExtractor0.unapply("hi!");
        java.util.Optional<java.lang.Integer> intOptional10 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional12 = strExtractor0.unapply("");
        java.util.Optional<java.lang.Integer> intOptional14 = strExtractor0.unapply("hi!");
        org.junit.Assert.assertNotNull(strExtractor0);
        org.junit.Assert.assertNotNull(intOptional2);
        org.junit.Assert.assertNotNull(intOptional4);
        org.junit.Assert.assertNotNull(intOptional6);
        org.junit.Assert.assertNotNull(intOptional8);
        org.junit.Assert.assertNotNull(intOptional10);
        org.junit.Assert.assertNotNull(intOptional12);
        org.junit.Assert.assertNotNull(intOptional14);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch6 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type7 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch6.check(type7);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel9 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass10 = futureSocketChannel9.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional11 = typeMatch6.check((java.lang.reflect.Type) wildcardClass10);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction12 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch13 = typeMatch6.orElse(typeFunction12);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch14 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type15 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional16 = typeMatch14.check(type15);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel17 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass18 = futureSocketChannel17.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional19 = typeMatch14.check((java.lang.reflect.Type) wildcardClass18);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch6.check((java.lang.reflect.Type) wildcardClass18);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup21 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel22 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup21);
        java.net.InetSocketAddress inetSocketAddress23 = futureServerSocketChannel22.getLocalAddress();
        java.net.SocketAddress socketAddress24 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel25 = futureServerSocketChannel22.bind(socketAddress24);
        java.lang.Class<?> wildcardClass26 = futureServerSocketChannel22.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional27 = typeMatch6.check((java.lang.reflect.Type) wildcardClass26);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional28 = typeMatch0.check((java.lang.reflect.Type) wildcardClass26);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch29 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type30 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional31 = typeMatch29.check(type30);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel32 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass33 = futureSocketChannel32.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional34 = typeMatch29.check((java.lang.reflect.Type) wildcardClass33);
        spullara.util.Benchmarker benchmarker36 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable38 = null;
        benchmarker36.execute("", exceptionRunnable38);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable41 = null;
        benchmarker36.execute("", exceptionRunnable41);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable44 = null;
        benchmarker36.execute("hi!", exceptionRunnable44);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable47 = null;
        benchmarker36.execute("hi!", exceptionRunnable47);
        java.lang.Class<?> wildcardClass49 = benchmarker36.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional50 = typeMatch29.check((java.lang.reflect.Type) wildcardClass49);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional51 = typeMatch0.check((java.lang.reflect.Type) wildcardClass49);
        java.lang.Class<?> wildcardClass52 = typeMatch0.getClass();
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(intOptionalOptional11);
        org.junit.Assert.assertNotNull(typeMatch13);
        org.junit.Assert.assertNotNull(intOptionalOptional16);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(intOptionalOptional19);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(futureServerSocketChannel22);
        org.junit.Assert.assertNull(inetSocketAddress23);
        org.junit.Assert.assertNotNull(futureServerSocketChannel25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(intOptionalOptional27);
        org.junit.Assert.assertNotNull(intOptionalOptional28);
        org.junit.Assert.assertNotNull(intOptionalOptional31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(intOptionalOptional34);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(intOptionalOptional50);
        org.junit.Assert.assertNotNull(intOptionalOptional51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        spullara.util.Benchmarker benchmarker7 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable9 = null;
        benchmarker7.execute("", exceptionRunnable9);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable12 = null;
        benchmarker7.execute("", exceptionRunnable12);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable15 = null;
        benchmarker7.execute("hi!", exceptionRunnable15);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable18 = null;
        benchmarker7.execute("hi!", exceptionRunnable18);
        java.lang.Class<?> wildcardClass20 = benchmarker7.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional21 = typeMatch0.check((java.lang.reflect.Type) wildcardClass20);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction22 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch23 = typeMatch0.orElse(typeFunction22);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intOptionalOptional21);
        org.junit.Assert.assertNotNull(typeMatch23);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        spullara.nio.channels.FutureSocketChannel futureSocketChannel0 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel0.close();
        java.net.SocketAddress socketAddress2 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture3 = futureSocketChannel0.connect(socketAddress2);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup4 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel5 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup4);
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel5.getLocalAddress();
        java.net.SocketAddress socketAddress7 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel8 = futureServerSocketChannel5.bind(socketAddress7);
        java.net.InetSocketAddress inetSocketAddress9 = futureServerSocketChannel8.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture10 = futureSocketChannel0.connect((java.net.SocketAddress) inetSocketAddress9);
        java.lang.Class<?> wildcardClass11 = futureSocketChannel0.getClass();
        org.junit.Assert.assertNotNull(futureSocketChannel0);
        org.junit.Assert.assertNotNull(voidCompletableFuture3);
        org.junit.Assert.assertNotNull(futureServerSocketChannel5);
        org.junit.Assert.assertNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureServerSocketChannel8);
        org.junit.Assert.assertNotNull(inetSocketAddress9);
        org.junit.Assert.assertNotNull(voidCompletableFuture10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker((-1));
        benchmarker1.report();
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable4 = null;
        benchmarker1.execute("", exceptionRunnable4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction1 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch2 = typeMatch0.orElse(typeFunction1);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch3 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type4 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch3.check(type4);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel6 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass7 = futureSocketChannel6.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional8 = typeMatch3.check((java.lang.reflect.Type) wildcardClass7);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional9 = typeMatch0.check((java.lang.reflect.Type) wildcardClass7);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction10 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch11 = typeMatch0.orElse(typeFunction10);
        spullara.util.Limiter limiter12 = new spullara.util.Limiter();
        java.lang.Class<?> wildcardClass13 = limiter12.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch11.check((java.lang.reflect.Type) wildcardClass13);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch15 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction16 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch17 = typeMatch15.orElse(typeFunction16);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch18 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type19 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional20 = typeMatch18.check(type19);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel21 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass22 = futureSocketChannel21.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional23 = typeMatch18.check((java.lang.reflect.Type) wildcardClass22);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional24 = typeMatch15.check((java.lang.reflect.Type) wildcardClass22);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction25 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch26 = typeMatch15.orElse(typeFunction25);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch27 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction28 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch29 = typeMatch27.orElse(typeFunction28);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch30 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type31 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional32 = typeMatch30.check(type31);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel33 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass34 = futureSocketChannel33.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional35 = typeMatch30.check((java.lang.reflect.Type) wildcardClass34);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional36 = typeMatch27.check((java.lang.reflect.Type) wildcardClass34);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction37 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch38 = typeMatch27.orElse(typeFunction37);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction39 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch40 = typeMatch38.orElse(typeFunction39);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch41 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type42 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional43 = typeMatch41.check(type42);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel44 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass45 = futureSocketChannel44.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional46 = typeMatch41.check((java.lang.reflect.Type) wildcardClass45);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel47 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress48 = futureServerSocketChannel47.getLocalAddress();
        java.net.InetSocketAddress inetSocketAddress49 = futureServerSocketChannel47.getLocalAddress();
        java.lang.Class<?> wildcardClass50 = futureServerSocketChannel47.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional51 = typeMatch41.check((java.lang.reflect.Type) wildcardClass50);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional52 = typeMatch38.check((java.lang.reflect.Type) wildcardClass50);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch53 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type54 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional55 = typeMatch53.check(type54);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel56 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass57 = futureSocketChannel56.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional58 = typeMatch53.check((java.lang.reflect.Type) wildcardClass57);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction59 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch60 = typeMatch53.orElse(typeFunction59);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction61 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch62 = typeMatch53.orElse(typeFunction61);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel63 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress64 = futureServerSocketChannel63.getLocalAddress();
        java.net.SocketAddress socketAddress65 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel66 = futureServerSocketChannel63.bind(socketAddress65);
        java.lang.Class<?> wildcardClass67 = futureServerSocketChannel63.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional68 = typeMatch62.check((java.lang.reflect.Type) wildcardClass67);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional69 = typeMatch38.check((java.lang.reflect.Type) wildcardClass67);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional70 = typeMatch26.check((java.lang.reflect.Type) wildcardClass67);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional71 = typeMatch11.check((java.lang.reflect.Type) wildcardClass67);
        org.junit.Assert.assertNotNull(typeMatch2);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(intOptionalOptional8);
        org.junit.Assert.assertNotNull(intOptionalOptional9);
        org.junit.Assert.assertNotNull(typeMatch11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(typeMatch17);
        org.junit.Assert.assertNotNull(intOptionalOptional20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(intOptionalOptional23);
        org.junit.Assert.assertNotNull(intOptionalOptional24);
        org.junit.Assert.assertNotNull(typeMatch26);
        org.junit.Assert.assertNotNull(typeMatch29);
        org.junit.Assert.assertNotNull(intOptionalOptional32);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(intOptionalOptional35);
        org.junit.Assert.assertNotNull(intOptionalOptional36);
        org.junit.Assert.assertNotNull(typeMatch38);
        org.junit.Assert.assertNotNull(typeMatch40);
        org.junit.Assert.assertNotNull(intOptionalOptional43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(intOptionalOptional46);
        org.junit.Assert.assertNotNull(futureServerSocketChannel47);
        org.junit.Assert.assertNull(inetSocketAddress48);
        org.junit.Assert.assertNull(inetSocketAddress49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(intOptionalOptional51);
        org.junit.Assert.assertNotNull(intOptionalOptional52);
        org.junit.Assert.assertNotNull(intOptionalOptional55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(intOptionalOptional58);
        org.junit.Assert.assertNotNull(typeMatch60);
        org.junit.Assert.assertNotNull(typeMatch62);
        org.junit.Assert.assertNotNull(futureServerSocketChannel63);
        org.junit.Assert.assertNull(inetSocketAddress64);
        org.junit.Assert.assertNotNull(futureServerSocketChannel66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(intOptionalOptional68);
        org.junit.Assert.assertNotNull(intOptionalOptional69);
        org.junit.Assert.assertNotNull(intOptionalOptional70);
        org.junit.Assert.assertNotNull(intOptionalOptional71);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        spullara.util.Benchmarker benchmarker1 = new spullara.util.Benchmarker(1);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            benchmarker1.execute("hi!", exceptionRunnable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        spullara.util.matching.Match<java.lang.reflect.GenericDeclaration, java.util.concurrent.CompletableFuture<java.lang.Void>> genericDeclarationMatch0 = new spullara.util.matching.Match<java.lang.reflect.GenericDeclaration, java.util.concurrent.CompletableFuture<java.lang.Void>>();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup0 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel1 = spullara.nio.channels.FutureServerSocketChannel.open(asynchronousChannelGroup0);
        java.net.InetSocketAddress inetSocketAddress2 = futureServerSocketChannel1.getLocalAddress();
        java.net.SocketAddress socketAddress3 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel4 = futureServerSocketChannel1.bind(socketAddress3);
        java.util.concurrent.CompletableFuture<spullara.nio.channels.FutureSocketChannel> futureSocketChannelCompletableFuture5 = futureServerSocketChannel4.accept();
        java.net.InetSocketAddress inetSocketAddress6 = futureServerSocketChannel4.getLocalAddress();
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup7 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel8 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup7);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel9 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress10 = futureServerSocketChannel9.getLocalAddress();
        java.net.SocketAddress socketAddress11 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel12 = futureServerSocketChannel9.bind(socketAddress11);
        java.net.InetSocketAddress inetSocketAddress13 = futureServerSocketChannel9.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture14 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress13);
        futureSocketChannel8.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel16 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress17 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel18 = futureServerSocketChannel16.bind(socketAddress17);
        java.net.InetSocketAddress inetSocketAddress19 = futureServerSocketChannel18.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture20 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress19);
        futureSocketChannel8.close();
        spullara.nio.channels.FutureSocketChannel futureSocketChannel22 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel22.close();
        java.net.SocketAddress socketAddress24 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture25 = futureSocketChannel22.connect(socketAddress24);
        java.nio.channels.AsynchronousChannelGroup asynchronousChannelGroup26 = null;
        spullara.nio.channels.FutureSocketChannel futureSocketChannel27 = spullara.nio.channels.FutureSocketChannel.open(asynchronousChannelGroup26);
        futureSocketChannel27.close();
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel29 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.SocketAddress socketAddress30 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel31 = futureServerSocketChannel29.bind(socketAddress30);
        java.net.InetSocketAddress inetSocketAddress32 = futureServerSocketChannel31.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture33 = futureSocketChannel27.connect((java.net.SocketAddress) inetSocketAddress32);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel34 = spullara.nio.channels.FutureSocketChannel.open();
        futureSocketChannel34.close();
        java.net.SocketAddress socketAddress36 = null;
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture37 = futureSocketChannel34.connect(socketAddress36);
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel38 = spullara.nio.channels.FutureServerSocketChannel.open();
        java.net.InetSocketAddress inetSocketAddress39 = futureServerSocketChannel38.getLocalAddress();
        java.net.SocketAddress socketAddress40 = null;
        spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel41 = futureServerSocketChannel38.bind(socketAddress40);
        java.net.InetSocketAddress inetSocketAddress42 = futureServerSocketChannel38.getLocalAddress();
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture43 = futureSocketChannel34.connect((java.net.SocketAddress) inetSocketAddress42);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture44 = futureSocketChannel27.connect((java.net.SocketAddress) inetSocketAddress42);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture45 = futureSocketChannel22.connect((java.net.SocketAddress) inetSocketAddress42);
        java.util.concurrent.CompletableFuture<java.lang.Void> voidCompletableFuture46 = futureSocketChannel8.connect((java.net.SocketAddress) inetSocketAddress42);
        // The following exception was thrown during execution in test generation
        try {
            spullara.nio.channels.FutureServerSocketChannel futureServerSocketChannel47 = futureServerSocketChannel4.bind((java.net.SocketAddress) inetSocketAddress42);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.AlreadyBoundException; message: null");
        } catch (java.nio.channels.AlreadyBoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(futureServerSocketChannel1);
        org.junit.Assert.assertNull(inetSocketAddress2);
        org.junit.Assert.assertNotNull(futureServerSocketChannel4);
        org.junit.Assert.assertNotNull(futureSocketChannelCompletableFuture5);
        org.junit.Assert.assertNotNull(inetSocketAddress6);
        org.junit.Assert.assertNotNull(futureSocketChannel8);
        org.junit.Assert.assertNotNull(futureServerSocketChannel9);
        org.junit.Assert.assertNull(inetSocketAddress10);
        org.junit.Assert.assertNotNull(futureServerSocketChannel12);
        org.junit.Assert.assertNotNull(inetSocketAddress13);
        org.junit.Assert.assertNotNull(voidCompletableFuture14);
        org.junit.Assert.assertNotNull(futureServerSocketChannel16);
        org.junit.Assert.assertNotNull(futureServerSocketChannel18);
        org.junit.Assert.assertNotNull(inetSocketAddress19);
        org.junit.Assert.assertNotNull(voidCompletableFuture20);
        org.junit.Assert.assertNotNull(futureSocketChannel22);
        org.junit.Assert.assertNotNull(voidCompletableFuture25);
        org.junit.Assert.assertNotNull(futureSocketChannel27);
        org.junit.Assert.assertNotNull(futureServerSocketChannel29);
        org.junit.Assert.assertNotNull(futureServerSocketChannel31);
        org.junit.Assert.assertNotNull(inetSocketAddress32);
        org.junit.Assert.assertNotNull(voidCompletableFuture33);
        org.junit.Assert.assertNotNull(futureSocketChannel34);
        org.junit.Assert.assertNotNull(voidCompletableFuture37);
        org.junit.Assert.assertNotNull(futureServerSocketChannel38);
        org.junit.Assert.assertNull(inetSocketAddress39);
        org.junit.Assert.assertNotNull(futureServerSocketChannel41);
        org.junit.Assert.assertNotNull(inetSocketAddress42);
        org.junit.Assert.assertNotNull(voidCompletableFuture43);
        org.junit.Assert.assertNotNull(voidCompletableFuture44);
        org.junit.Assert.assertNotNull(voidCompletableFuture45);
        org.junit.Assert.assertNotNull(voidCompletableFuture46);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch0 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type1 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional2 = typeMatch0.check(type1);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel3 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass4 = futureSocketChannel3.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional5 = typeMatch0.check((java.lang.reflect.Type) wildcardClass4);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch6 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction7 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch8 = typeMatch6.orElse(typeFunction7);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch9 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type10 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional11 = typeMatch9.check(type10);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel12 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass13 = futureSocketChannel12.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional14 = typeMatch9.check((java.lang.reflect.Type) wildcardClass13);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction15 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch16 = typeMatch9.orElse(typeFunction15);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch17 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type18 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional19 = typeMatch17.check(type18);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel20 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass21 = futureSocketChannel20.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional22 = typeMatch17.check((java.lang.reflect.Type) wildcardClass21);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional23 = typeMatch9.check((java.lang.reflect.Type) wildcardClass21);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional24 = typeMatch6.check((java.lang.reflect.Type) wildcardClass21);
        java.lang.Class<?> wildcardClass25 = intOptionalOptional24.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional26 = typeMatch0.check((java.lang.reflect.Type) wildcardClass25);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch27 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.lang.reflect.Type type28 = null;
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional29 = typeMatch27.check(type28);
        spullara.nio.channels.FutureSocketChannel futureSocketChannel30 = new spullara.nio.channels.FutureSocketChannel();
        java.lang.Class<?> wildcardClass31 = futureSocketChannel30.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional32 = typeMatch27.check((java.lang.reflect.Type) wildcardClass31);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction33 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch34 = typeMatch27.orElse(typeFunction33);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction35 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch36 = typeMatch27.orElse(typeFunction35);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction37 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch38 = typeMatch27.orElse(typeFunction37);
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction39 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch40 = typeMatch27.orElse(typeFunction39);
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch41 = new spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>>();
        java.util.function.Function<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeFunction42 = null;
        spullara.util.matching.Match<java.lang.reflect.Type, java.util.Optional<java.lang.Integer>> typeMatch43 = typeMatch41.orElse(typeFunction42);
        spullara.util.Benchmarker benchmarker45 = new spullara.util.Benchmarker(0);
        spullara.util.Benchmarker.ExceptionRunnable exceptionRunnable47 = null;
        benchmarker45.execute("hi!", exceptionRunnable47);
        java.lang.Class<?> wildcardClass49 = benchmarker45.getClass();
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional50 = typeMatch43.check((java.lang.reflect.Type) wildcardClass49);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional51 = typeMatch27.check((java.lang.reflect.Type) wildcardClass49);
        java.util.Optional<java.util.Optional<java.lang.Integer>> intOptionalOptional52 = typeMatch0.check((java.lang.reflect.Type) wildcardClass49);
        org.junit.Assert.assertNotNull(intOptionalOptional2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(intOptionalOptional5);
        org.junit.Assert.assertNotNull(typeMatch8);
        org.junit.Assert.assertNotNull(intOptionalOptional11);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(intOptionalOptional14);
        org.junit.Assert.assertNotNull(typeMatch16);
        org.junit.Assert.assertNotNull(intOptionalOptional19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(intOptionalOptional22);
        org.junit.Assert.assertNotNull(intOptionalOptional23);
        org.junit.Assert.assertNotNull(intOptionalOptional24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(intOptionalOptional26);
        org.junit.Assert.assertNotNull(intOptionalOptional29);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(intOptionalOptional32);
        org.junit.Assert.assertNotNull(typeMatch34);
        org.junit.Assert.assertNotNull(typeMatch36);
        org.junit.Assert.assertNotNull(typeMatch38);
        org.junit.Assert.assertNotNull(typeMatch40);
        org.junit.Assert.assertNotNull(typeMatch43);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(intOptionalOptional50);
        org.junit.Assert.assertNotNull(intOptionalOptional51);
        org.junit.Assert.assertNotNull(intOptionalOptional52);
    }
}

