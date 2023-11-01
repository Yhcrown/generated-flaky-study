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
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vivimice.bgzfrandreader.RandomAccessBgzFile randomAccessBgzFile1 = new com.vivimice.bgzfrandreader.RandomAccessBgzFile(seekableByteChannel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.vivimice.bgzfrandreader.BgzipUtils.readUint32(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vivimice.bgzfrandreader.RandomAccessBgzFile randomAccessBgzFile1 = new com.vivimice.bgzfrandreader.RandomAccessBgzFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.vivimice.bgzfrandreader.BgzipUtils bgzipUtils0 = new com.vivimice.bgzfrandreader.BgzipUtils();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.io.FileInputStream fileInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vivimice.bgzfrandreader.RandomAccessBgzFile randomAccessBgzFile1 = new com.vivimice.bgzfrandreader.RandomAccessBgzFile(fileInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = new com.vivimice.bgzfrandreader.BgzipBlock.Builder();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.io.RandomAccessFile randomAccessFile0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.vivimice.bgzfrandreader.RandomAccessBgzFile randomAccessBgzFile1 = new com.vivimice.bgzfrandreader.RandomAccessBgzFile(randomAccessFile0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        java.lang.String str13 = malformedBgzipDataException4.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str13, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.nio.ByteBuffer byteBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.vivimice.bgzfrandreader.BgzipUtils.readUint16(byteBuffer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataOffset((long) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException4);
        java.lang.String str7 = malformedBgzipDataException6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str7, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(97, (long) (short) 0, (-1), 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.blockSize((int) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        java.lang.String str4 = malformedBgzipDataException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str4, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataOffset((long) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException10.getSuppressed();
        java.lang.Class<?> wildcardClass14 = throwableArray13.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException5);
        java.lang.String str15 = malformedBgzipDataException5.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str15, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.String str5 = malformedBgzipDataException4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str5, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.String str5 = malformedBgzipDataException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str5, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.String str17 = malformedBgzipDataException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str17, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException1);
        java.lang.String str3 = malformedBgzipDataException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: " + "'", str3, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: ");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray7 = malformedBgzipDataException6.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException12.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException15.getSuppressed();
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        java.lang.Class<?> wildcardClass2 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        int int2 = bgzipBlock1.getDataLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        int int8 = bgzipBlock4.getBlockSize();
        int int9 = bgzipBlock4.getBlockSize();
        long long10 = bgzipBlock4.getDataOffset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.String str24 = malformedBgzipDataException23.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str24, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.String str18 = malformedBgzipDataException17.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str18, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getDataLength();
        int int6 = bgzipBlock4.getInputLength();
        int int7 = bgzipBlock4.getInputLength();
        int int8 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder2.dataLength((int) (short) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) ' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.inputLength((int) '#');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) 'a');
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.inputLength((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) 100, (long) (byte) 10, (int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock5 = builder4.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(bgzipBlock5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException20.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException20.addSuppressed((java.lang.Throwable) malformedBgzipDataException23);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray27 = malformedBgzipDataException26.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        malformedBgzipDataException23.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        java.lang.Throwable[] throwableArray32 = malformedBgzipDataException29.getSuppressed();
        malformedBgzipDataException18.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException34 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException18);
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException34);
        java.lang.String str36 = malformedBgzipDataException34.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str36, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataOffset((long) (byte) 10);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray7 = malformedBgzipDataException6.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException12.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException15.getSuppressed();
        java.lang.Throwable[] throwableArray19 = malformedBgzipDataException15.getSuppressed();
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.String str21 = malformedBgzipDataException15.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str21, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getDataLength();
        int int6 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataOffset((long) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException20.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException20.addSuppressed((java.lang.Throwable) malformedBgzipDataException23);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray27 = malformedBgzipDataException26.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        malformedBgzipDataException23.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        java.lang.Throwable[] throwableArray32 = malformedBgzipDataException29.getSuppressed();
        malformedBgzipDataException18.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException34 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException18);
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException34);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException37 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException39 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray40 = malformedBgzipDataException39.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException42 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException39.addSuppressed((java.lang.Throwable) malformedBgzipDataException42);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException45 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray46 = malformedBgzipDataException45.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException48 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException45.addSuppressed((java.lang.Throwable) malformedBgzipDataException48);
        malformedBgzipDataException42.addSuppressed((java.lang.Throwable) malformedBgzipDataException48);
        java.lang.Throwable[] throwableArray51 = malformedBgzipDataException48.getSuppressed();
        malformedBgzipDataException37.addSuppressed((java.lang.Throwable) malformedBgzipDataException48);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException55 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException56 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException55);
        java.lang.Throwable[] throwableArray57 = malformedBgzipDataException55.getSuppressed();
        malformedBgzipDataException37.addSuppressed((java.lang.Throwable) malformedBgzipDataException55);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException60 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException55.addSuppressed((java.lang.Throwable) malformedBgzipDataException60);
        malformedBgzipDataException34.addSuppressed((java.lang.Throwable) malformedBgzipDataException55);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray57);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        java.lang.Class<?> wildcardClass5 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException10.getSuppressed();
        java.lang.Class<?> wildcardClass14 = malformedBgzipDataException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException11.getSuppressed();
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException11.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException11);
        java.lang.String str17 = malformedBgzipDataException16.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str17, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        java.lang.String str26 = malformedBgzipDataException6.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str26, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.inputLength((int) '#');
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getBlockSize();
        int int6 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.inputLength((int) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) '4', (long) (byte) -1, (int) ' ', (int) (short) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.blockSize((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.inputLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.inputLength(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder0.dataOffset((long) (short) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataLength((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.inputLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        int int8 = bgzipBlock4.getBlockSize();
        int int9 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder4.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.dataOffset((long) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getInputLength();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.dataLength(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataLength((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock11 = builder4.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bgzipBlock11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) 10, (long) '#', (-1), 10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getInputLength();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        int int8 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize(100);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock11 = builder10.build();
        java.lang.Class<?> wildcardClass12 = bgzipBlock11.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bgzipBlock11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder10.inputLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock7 = builder2.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder9 = builder2.blockSize((int) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(bgzipBlock7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock7 = builder2.build();
        int int8 = bgzipBlock7.getBlockSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(bgzipBlock7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize(100);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.inputLength((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray24 = malformedBgzipDataException23.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.dataOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.inputLength((int) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) 100, (long) (byte) -1, 0, 0);
        int int5 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        java.lang.String str6 = malformedBgzipDataException5.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str6, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder10.dataOffset((long) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        int int5 = bgzipBlock4.getInputLength();
        int int6 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getDataLength();
        int int6 = bgzipBlock4.getInputLength();
        int int7 = bgzipBlock4.getInputLength();
        int int8 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.Throwable throwable2 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException8);
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (short) 1, (int) (short) 100, (int) '#');
        long long5 = bgzipBlock4.getDataOffset();
        int int6 = bgzipBlock4.getBlockSize();
        int int7 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (short) 1, (int) (short) 100, (int) '#');
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        long long7 = bgzipBlock4.getDataOffset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        int int3 = bgzipBlock1.getInputLength();
        long long4 = bgzipBlock1.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getInputLength();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        int int8 = bgzipBlock4.getDataLength();
        long long9 = bgzipBlock4.getDataOffset();
        int int10 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException14.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException14.addSuppressed((java.lang.Throwable) malformedBgzipDataException17);
        malformedBgzipDataException11.addSuppressed((java.lang.Throwable) malformedBgzipDataException17);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray24 = malformedBgzipDataException23.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException23.addSuppressed((java.lang.Throwable) malformedBgzipDataException26);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray30 = malformedBgzipDataException29.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException29.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        java.lang.Throwable[] throwableArray35 = malformedBgzipDataException32.getSuppressed();
        malformedBgzipDataException21.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        malformedBgzipDataException11.addSuppressed((java.lang.Throwable) malformedBgzipDataException21);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        java.lang.String str39 = malformedBgzipDataException11.toString();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str39, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize(100);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (byte) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((-1), (long) (byte) 10, (int) (byte) -1, 100);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        long long3 = bgzipBlock1.getDataOffset();
        int int4 = bgzipBlock1.getInputLength();
        int int5 = bgzipBlock1.getDataLength();
        int int6 = bgzipBlock1.getBlockSize();
        int int7 = bgzipBlock1.getDataLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException20);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException20);
        malformedBgzipDataException15.addSuppressed((java.lang.Throwable) malformedBgzipDataException22);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException15);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException15);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException15);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.Throwable throwable1 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", throwable1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        java.lang.Class<?> wildcardClass8 = bgzipBlock4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray7 = malformedBgzipDataException6.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException12.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException15.getSuppressed();
        java.lang.Throwable[] throwableArray19 = malformedBgzipDataException15.getSuppressed();
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getDataLength();
        int int6 = bgzipBlock4.getInputLength();
        int int7 = bgzipBlock4.getInputLength();
        int int8 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataLength(10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder8.blockSize((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock15 = builder8.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(bgzipBlock15);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        long long3 = bgzipBlock1.getDataOffset();
        int int4 = bgzipBlock1.getInputLength();
        int int5 = bgzipBlock1.getBlockSize();
        long long6 = bgzipBlock1.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder6.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder6.inputLength((int) (short) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray7 = malformedBgzipDataException6.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException12.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException15.getSuppressed();
        java.lang.Throwable[] throwableArray19 = malformedBgzipDataException15.getSuppressed();
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.String str21 = malformedBgzipDataException4.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str21, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.inputLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.Throwable throwable1 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException7);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException7);
        java.lang.Throwable throwable12 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable12);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        java.lang.Class<?> wildcardClass15 = malformedBgzipDataException2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException8);
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException10);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray23 = malformedBgzipDataException22.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException22.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        java.lang.Throwable[] throwableArray28 = malformedBgzipDataException25.getSuppressed();
        malformedBgzipDataException14.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException30 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException25);
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException30);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException30);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException33 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getInputLength();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        int int8 = bgzipBlock4.getDataLength();
        long long9 = bgzipBlock4.getDataOffset();
        int int10 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        java.lang.Throwable[] throwableArray6 = malformedBgzipDataException1.getSuppressed();
        java.lang.Class<?> wildcardClass7 = malformedBgzipDataException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException14);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.dataLength((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder12.blockSize((int) (short) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getDataLength();
        int int6 = bgzipBlock4.getInputLength();
        int int7 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (short) 0, (long) (byte) 0, (-1), (int) '#');
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) '4', 0L, 100, (int) (short) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.Throwable throwable1 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException7);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException7);
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException7.getSuppressed();
        java.lang.String str12 = malformedBgzipDataException7.toString();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str12, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.Throwable throwable1 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", throwable1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.dataLength((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder14.dataLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        java.lang.String str14 = malformedBgzipDataException13.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str14, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) ' ', 100L, (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.Throwable throwable1 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException7);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException7);
        java.lang.Throwable throwable12 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable12);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        int int6 = bgzipBlock4.getDataLength();
        long long7 = bgzipBlock4.getDataOffset();
        int int8 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        long long5 = bgzipBlock4.getDataOffset();
        int int6 = bgzipBlock4.getBlockSize();
        int int7 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(100, 0L, (int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder11.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock14 = builder11.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(bgzipBlock14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException14.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException14.addSuppressed((java.lang.Throwable) malformedBgzipDataException17);
        malformedBgzipDataException11.addSuppressed((java.lang.Throwable) malformedBgzipDataException17);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException11);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException25);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException27 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException25);
        malformedBgzipDataException20.addSuppressed((java.lang.Throwable) malformedBgzipDataException27);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException27);
        java.lang.String str30 = malformedBgzipDataException27.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str30, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        int int8 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder6.build();
        int int10 = bgzipBlock9.getBlockSize();
        long long11 = bgzipBlock9.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataLength((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder8.dataLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        long long8 = bgzipBlock4.getDataOffset();
        int int9 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException21);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException22);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException22);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException22);
        malformedBgzipDataException17.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataLength((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock13 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(bgzipBlock13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (short) 100, (long) 100, 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.blockSize((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock3 = builder2.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder5 = builder2.dataOffset((long) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder7 = builder5.dataLength((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(bgzipBlock3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.blockSize((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        int int3 = bgzipBlock1.getInputLength();
        int int4 = bgzipBlock1.getBlockSize();
        int int5 = bgzipBlock1.getDataLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray7 = malformedBgzipDataException6.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException12.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException15.getSuppressed();
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException15);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray24 = malformedBgzipDataException23.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException23.addSuppressed((java.lang.Throwable) malformedBgzipDataException26);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray30 = malformedBgzipDataException29.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException29.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        java.lang.Throwable[] throwableArray35 = malformedBgzipDataException32.getSuppressed();
        malformedBgzipDataException21.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException37 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException21);
        malformedBgzipDataException15.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        java.lang.Throwable[] throwableArray40 = malformedBgzipDataException37.getSuppressed();
        java.lang.Throwable[] throwableArray41 = malformedBgzipDataException37.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataLength(10);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder4.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.inputLength(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException1);
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (short) 1, (long) 0, 97, 100);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) 0, (long) (byte) 0, (int) (short) 0, 35);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.inputLength(100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder0.blockSize((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder0.inputLength(97);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder0.dataLength(10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder2.dataLength((int) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.blockSize((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock3 = builder2.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder5 = builder2.dataOffset((long) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(bgzipBlock3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        int int8 = bgzipBlock4.getBlockSize();
        int int9 = bgzipBlock4.getBlockSize();
        int int10 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) -1, (long) (byte) 1, 0, (int) '4');
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (short) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        long long3 = bgzipBlock1.getDataOffset();
        int int4 = bgzipBlock1.getInputLength();
        int int5 = bgzipBlock1.getDataLength();
        int int6 = bgzipBlock1.getDataLength();
        long long7 = bgzipBlock1.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException28 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray29 = malformedBgzipDataException28.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException31 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException28.addSuppressed((java.lang.Throwable) malformedBgzipDataException31);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException34 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray35 = malformedBgzipDataException34.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException37 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException34.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        malformedBgzipDataException31.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException40 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException31);
        malformedBgzipDataException24.addSuppressed((java.lang.Throwable) malformedBgzipDataException40);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException42 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException24);
        java.lang.String str43 = malformedBgzipDataException42.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str43, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataOffset((long) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        java.lang.Throwable[] throwableArray6 = malformedBgzipDataException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataLength((int) (short) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataOffset(0L);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset(10L);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (-1));
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder6.blockSize(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException21.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException21.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException27 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray28 = malformedBgzipDataException27.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException30 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException27.addSuppressed((java.lang.Throwable) malformedBgzipDataException30);
        malformedBgzipDataException24.addSuppressed((java.lang.Throwable) malformedBgzipDataException30);
        java.lang.Throwable[] throwableArray33 = malformedBgzipDataException30.getSuppressed();
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException30);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException37 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException38 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException37);
        java.lang.Throwable[] throwableArray39 = malformedBgzipDataException37.getSuppressed();
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException42 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException37.addSuppressed((java.lang.Throwable) malformedBgzipDataException42);
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException42);
        java.lang.String str45 = malformedBgzipDataException42.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str45, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataOffset((long) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (short) 100);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.dataOffset((long) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder0.blockSize((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder0.inputLength(97);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder0.dataLength((-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        long long8 = bgzipBlock4.getDataOffset();
        int int9 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        java.lang.String str2 = malformedBgzipDataException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str2, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.inputLength((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (short) 1, (int) (short) 100, (int) '#');
        long long5 = bgzipBlock4.getDataOffset();
        int int6 = bgzipBlock4.getInputLength();
        int int7 = bgzipBlock4.getInputLength();
        int int8 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (short) 0, 35L, 10, 35);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) '#', 0L, (int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        int int8 = bgzipBlock4.getBlockSize();
        int int9 = bgzipBlock4.getBlockSize();
        int int10 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException20);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException20);
        malformedBgzipDataException15.addSuppressed((java.lang.Throwable) malformedBgzipDataException22);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException15);
        java.lang.String str25 = malformedBgzipDataException15.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str25, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getBlockSize();
        int int8 = bgzipBlock4.getInputLength();
        int int9 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getInputLength();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getDataLength();
        int int8 = bgzipBlock4.getDataLength();
        long long9 = bgzipBlock4.getDataOffset();
        java.lang.Class<?> wildcardClass10 = bgzipBlock4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException13.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
        java.lang.Throwable[] throwableArray19 = malformedBgzipDataException16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = malformedBgzipDataException16.getSuppressed();
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", (java.lang.Throwable) malformedBgzipDataException16);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataLength(10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder8.blockSize((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder8.inputLength((int) '#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.Throwable[] throwableArray6 = malformedBgzipDataException5.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray12 = malformedBgzipDataException11.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException11.addSuppressed((java.lang.Throwable) malformedBgzipDataException14);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException17.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException17.addSuppressed((java.lang.Throwable) malformedBgzipDataException20);
        malformedBgzipDataException14.addSuppressed((java.lang.Throwable) malformedBgzipDataException20);
        java.lang.Throwable[] throwableArray23 = malformedBgzipDataException20.getSuppressed();
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException20);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException20);
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray30 = malformedBgzipDataException29.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException29.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException35 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray36 = malformedBgzipDataException35.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException38 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException35.addSuppressed((java.lang.Throwable) malformedBgzipDataException38);
        malformedBgzipDataException32.addSuppressed((java.lang.Throwable) malformedBgzipDataException38);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException41 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException32);
        malformedBgzipDataException25.addSuppressed((java.lang.Throwable) malformedBgzipDataException41);
        java.lang.Throwable[] throwableArray43 = malformedBgzipDataException25.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException44 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException25);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.blockSize(97);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock7 = builder2.build();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock8 = builder2.build();
        java.lang.Class<?> wildcardClass9 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(bgzipBlock7);
        org.junit.Assert.assertNotNull(bgzipBlock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder11.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder15 = builder13.dataLength((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder0.blockSize((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) (short) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock13 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(bgzipBlock13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) '#', 1, (-1));
        int int5 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset(10L);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataLength((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(100, (long) 100, 0, (int) '#');
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException10.getSuppressed();
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException17);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException18);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException22);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException22);
        java.lang.Throwable[] throwableArray25 = malformedBgzipDataException24.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException28 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException30 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray31 = malformedBgzipDataException30.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException33 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException30.addSuppressed((java.lang.Throwable) malformedBgzipDataException33);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException36 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray37 = malformedBgzipDataException36.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException39 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException36.addSuppressed((java.lang.Throwable) malformedBgzipDataException39);
        malformedBgzipDataException33.addSuppressed((java.lang.Throwable) malformedBgzipDataException39);
        java.lang.Throwable[] throwableArray42 = malformedBgzipDataException39.getSuppressed();
        malformedBgzipDataException28.addSuppressed((java.lang.Throwable) malformedBgzipDataException39);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException44 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException39);
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException44);
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException44);
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException44);
        java.lang.Throwable[] throwableArray48 = malformedBgzipDataException10.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray23 = malformedBgzipDataException22.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException22.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        java.lang.Throwable[] throwableArray28 = malformedBgzipDataException25.getSuppressed();
        malformedBgzipDataException14.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException14);
        java.lang.String str31 = malformedBgzipDataException14.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str31, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataOffset((long) (-1));
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder14.inputLength(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder18 = builder14.blockSize((int) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize(100);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock11 = builder10.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder10.dataLength((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bgzipBlock11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        java.lang.Throwable throwable3 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException9);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException14 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", (java.lang.Throwable) malformedBgzipDataException14);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock11 = builder8.build();
        int int12 = bgzipBlock11.getDataLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bgzipBlock11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock7 = builder6.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(bgzipBlock7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException17.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) '4', 1L, 0, 100);
        int int5 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder11.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder15 = builder11.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder17 = builder15.blockSize((-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength(1);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.blockSize((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock3 = builder2.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder5 = builder2.dataOffset((long) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder7 = builder2.inputLength(97);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(bgzipBlock3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder4.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder4.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder4.dataOffset((long) '#');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder4.blockSize((-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder6.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder6.dataLength((int) (short) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException0 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        java.lang.Class<?> wildcardClass1 = malformedBgzipDataException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) 10, 0, 35);
        int int5 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        java.lang.Class<?> wildcardClass6 = malformedBgzipDataException4.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray8 = malformedBgzipDataException7.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException10);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException13.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
        java.lang.Throwable[] throwableArray19 = malformedBgzipDataException16.getSuppressed();
        java.lang.Throwable[] throwableArray20 = malformedBgzipDataException16.getSuppressed();
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException16);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray24 = malformedBgzipDataException23.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException23.addSuppressed((java.lang.Throwable) malformedBgzipDataException26);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray30 = malformedBgzipDataException29.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException29.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException32);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException36 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException38 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray39 = malformedBgzipDataException38.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException41 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException38.addSuppressed((java.lang.Throwable) malformedBgzipDataException41);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException44 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray45 = malformedBgzipDataException44.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException47 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException44.addSuppressed((java.lang.Throwable) malformedBgzipDataException47);
        malformedBgzipDataException41.addSuppressed((java.lang.Throwable) malformedBgzipDataException47);
        java.lang.Throwable[] throwableArray50 = malformedBgzipDataException47.getSuppressed();
        malformedBgzipDataException36.addSuppressed((java.lang.Throwable) malformedBgzipDataException47);
        malformedBgzipDataException26.addSuppressed((java.lang.Throwable) malformedBgzipDataException36);
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException36);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException54 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException36);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.inputLength((int) '#');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.inputLength((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder10.dataOffset((long) '#');
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray24 = malformedBgzipDataException19.getSuppressed();
        java.lang.Throwable[] throwableArray25 = malformedBgzipDataException19.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException30 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException31 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException30);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException30);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException33 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException30);
        java.lang.Throwable[] throwableArray34 = malformedBgzipDataException30.getSuppressed();
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException30);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        java.lang.Throwable[] throwableArray16 = malformedBgzipDataException13.getSuppressed();
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException13);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.Throwable[] throwableArray6 = malformedBgzipDataException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.blockSize(97);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder2.dataOffset((long) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(100, (long) (byte) 1, (int) (short) -1, (int) (short) 10);
        long long5 = bgzipBlock4.getDataOffset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.Throwable throwable2 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException8);
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray23 = malformedBgzipDataException22.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException22.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException25);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException31 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray32 = malformedBgzipDataException31.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException34 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException31.addSuppressed((java.lang.Throwable) malformedBgzipDataException34);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException37 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray38 = malformedBgzipDataException37.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException40 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException37.addSuppressed((java.lang.Throwable) malformedBgzipDataException40);
        malformedBgzipDataException34.addSuppressed((java.lang.Throwable) malformedBgzipDataException40);
        java.lang.Throwable[] throwableArray43 = malformedBgzipDataException40.getSuppressed();
        malformedBgzipDataException29.addSuppressed((java.lang.Throwable) malformedBgzipDataException40);
        malformedBgzipDataException19.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException46 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException12.getSuppressed();
        java.lang.Throwable[] throwableArray18 = malformedBgzipDataException12.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException22);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException23);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException23);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException23);
        java.lang.Throwable[] throwableArray27 = malformedBgzipDataException23.getSuppressed();
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException23);
        java.lang.Throwable[] throwableArray29 = malformedBgzipDataException12.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(0, (long) (byte) 1, (int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        int int10 = bgzipBlock9.getInputLength();
        int int11 = bgzipBlock9.getDataLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        long long3 = bgzipBlock1.getDataOffset();
        int int4 = bgzipBlock1.getInputLength();
        int int5 = bgzipBlock1.getDataLength();
        int int6 = bgzipBlock1.getDataLength();
        int int7 = bgzipBlock1.getBlockSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock12 = builder11.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(bgzipBlock12);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        int int3 = bgzipBlock1.getInputLength();
        int int4 = bgzipBlock1.getBlockSize();
        int int5 = bgzipBlock1.getBlockSize();
        int int6 = bgzipBlock1.getBlockSize();
        int int7 = bgzipBlock1.getBlockSize();
        long long8 = bgzipBlock1.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (short) 10, (long) (short) 1, 1, (int) (short) 100);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException4);
        java.lang.String str6 = malformedBgzipDataException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str6, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (short) 1, (long) (byte) 100, 10, 35);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException11.getSuppressed();
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException11.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException11);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException20);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException22 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException21);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException21);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray26 = malformedBgzipDataException25.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException28 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException25.addSuppressed((java.lang.Throwable) malformedBgzipDataException28);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException31 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray32 = malformedBgzipDataException31.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException34 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException31.addSuppressed((java.lang.Throwable) malformedBgzipDataException34);
        malformedBgzipDataException28.addSuppressed((java.lang.Throwable) malformedBgzipDataException34);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException38 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException40 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray41 = malformedBgzipDataException40.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException43 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException40.addSuppressed((java.lang.Throwable) malformedBgzipDataException43);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException46 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray47 = malformedBgzipDataException46.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException49 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException46.addSuppressed((java.lang.Throwable) malformedBgzipDataException49);
        malformedBgzipDataException43.addSuppressed((java.lang.Throwable) malformedBgzipDataException49);
        java.lang.Throwable[] throwableArray52 = malformedBgzipDataException49.getSuppressed();
        malformedBgzipDataException38.addSuppressed((java.lang.Throwable) malformedBgzipDataException49);
        malformedBgzipDataException28.addSuppressed((java.lang.Throwable) malformedBgzipDataException38);
        malformedBgzipDataException23.addSuppressed((java.lang.Throwable) malformedBgzipDataException28);
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException28);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray52);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray16 = malformedBgzipDataException15.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException15.addSuppressed((java.lang.Throwable) malformedBgzipDataException18);
        malformedBgzipDataException12.addSuppressed((java.lang.Throwable) malformedBgzipDataException18);
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException18.getSuppressed();
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException18);
        java.lang.Throwable[] throwableArray23 = malformedBgzipDataException18.getSuppressed();
        java.lang.Throwable[] throwableArray24 = malformedBgzipDataException18.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException28 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException28);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException30 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException31 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException29);
        java.lang.Throwable[] throwableArray33 = malformedBgzipDataException29.getSuppressed();
        malformedBgzipDataException18.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        java.lang.Throwable[] throwableArray6 = malformedBgzipDataException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException11.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException11);
        java.lang.Throwable[] throwableArray16 = malformedBgzipDataException15.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        long long3 = bgzipBlock1.getDataOffset();
        int int4 = bgzipBlock1.getBlockSize();
        int int5 = bgzipBlock1.getDataLength();
        int int6 = bgzipBlock1.getInputLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException0 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        malformedBgzipDataException0.addSuppressed((java.lang.Throwable) malformedBgzipDataException2);
        java.lang.String str6 = malformedBgzipDataException0.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException" + "'", str6, "com.vivimice.bgzfrandreader.MalformedBgzipDataException");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder11.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder15 = builder13.inputLength(97);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder17 = builder15.dataOffset((long) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.blockSize(97);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock7 = builder2.build();
        java.lang.Class<?> wildcardClass8 = bgzipBlock7.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(bgzipBlock7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataLength(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) (byte) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException5);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray9 = malformedBgzipDataException8.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        malformedBgzipDataException5.addSuppressed((java.lang.Throwable) malformedBgzipDataException11);
        java.lang.Throwable[] throwableArray14 = malformedBgzipDataException11.getSuppressed();
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException11.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException11);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) (byte) -1, (int) (byte) 10, (int) (byte) 100);
        int int5 = bgzipBlock4.getDataLength();
        int int6 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(0, 100L, (int) (short) -1, (-1));
        int int5 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((-1), (-1L), (int) (byte) 0, (int) 'a');
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException4);
        java.lang.String str7 = malformedBgzipDataException4.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException" + "'", str7, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder0.blockSize((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataOffset((long) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder6.dataOffset((long) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder6.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder6.dataOffset(1L);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock17 = builder6.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder19 = builder6.blockSize((int) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(bgzipBlock17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        java.lang.Throwable[] throwableArray16 = malformedBgzipDataException13.getSuppressed();
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException20);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException20.getSuppressed();
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException20);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException20);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException25 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException24);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (byte) 1, (int) '#', (int) (byte) 1);
        int int5 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) '4', 1L, 0, 100);
        int int5 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder11.dataOffset(100L);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.Throwable throwable1 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable1);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException7);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException7);
        java.lang.Throwable throwable12 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable12);
        malformedBgzipDataException2.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException17 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException17);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException17);
        java.lang.Throwable[] throwableArray20 = malformedBgzipDataException19.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException21.getSuppressed();
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException21);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException28 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray29 = malformedBgzipDataException28.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException31 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException28.addSuppressed((java.lang.Throwable) malformedBgzipDataException31);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException34 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray35 = malformedBgzipDataException34.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException37 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException34.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        malformedBgzipDataException31.addSuppressed((java.lang.Throwable) malformedBgzipDataException37);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException40 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException31);
        malformedBgzipDataException24.addSuppressed((java.lang.Throwable) malformedBgzipDataException40);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException43 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException45 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray46 = malformedBgzipDataException45.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException48 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException45.addSuppressed((java.lang.Throwable) malformedBgzipDataException48);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException51 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray52 = malformedBgzipDataException51.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException54 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException51.addSuppressed((java.lang.Throwable) malformedBgzipDataException54);
        malformedBgzipDataException48.addSuppressed((java.lang.Throwable) malformedBgzipDataException54);
        java.lang.Throwable[] throwableArray57 = malformedBgzipDataException54.getSuppressed();
        malformedBgzipDataException43.addSuppressed((java.lang.Throwable) malformedBgzipDataException54);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException60 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException62 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray63 = malformedBgzipDataException62.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException65 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException62.addSuppressed((java.lang.Throwable) malformedBgzipDataException65);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException68 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray69 = malformedBgzipDataException68.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException71 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException68.addSuppressed((java.lang.Throwable) malformedBgzipDataException71);
        malformedBgzipDataException65.addSuppressed((java.lang.Throwable) malformedBgzipDataException71);
        java.lang.Throwable[] throwableArray74 = malformedBgzipDataException71.getSuppressed();
        malformedBgzipDataException60.addSuppressed((java.lang.Throwable) malformedBgzipDataException71);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException76 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException60);
        malformedBgzipDataException54.addSuppressed((java.lang.Throwable) malformedBgzipDataException76);
        malformedBgzipDataException24.addSuppressed((java.lang.Throwable) malformedBgzipDataException54);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.blockSize((int) (byte) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataLength(10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder8.dataLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((-1), 1L, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.blockSize((int) (short) 0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock3 = builder2.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder5 = builder2.dataOffset((long) ' ');
        java.lang.Class<?> wildcardClass6 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(bgzipBlock3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException1);
        java.lang.String str3 = malformedBgzipDataException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str3, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        java.lang.Throwable[] throwableArray2 = malformedBgzipDataException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
        java.lang.String str2 = malformedBgzipDataException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!" + "'", str2, "com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (short) 1, (int) (short) 100, (int) '#');
        long long5 = bgzipBlock4.getDataOffset();
        long long6 = bgzipBlock4.getDataOffset();
        int int7 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder10.inputLength((int) (short) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder10.blockSize((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) 0, (long) 97, (int) '#', (int) '4');
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(0, (long) (byte) 100, (-1), 0);
        int int5 = bgzipBlock4.getBlockSize();
        int int6 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize((int) (short) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataOffset((long) (-1));
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder14.inputLength(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder18 = builder14.inputLength(100);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder20 = builder14.dataLength(97);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException7);
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException11 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException9);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException15 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray16 = malformedBgzipDataException15.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException18 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException15.addSuppressed((java.lang.Throwable) malformedBgzipDataException18);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException21 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException21.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException21.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        malformedBgzipDataException18.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        java.lang.Throwable[] throwableArray27 = malformedBgzipDataException24.getSuppressed();
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException29 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException24);
        malformedBgzipDataException11.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException29);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException32 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException29);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException8);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.Throwable throwable2 = null;
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: ", throwable2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException7);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException8);
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException8);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException8);
        java.lang.Throwable[] throwableArray13 = malformedBgzipDataException8.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        int int3 = bgzipBlock1.getInputLength();
        int int4 = bgzipBlock1.getBlockSize();
        long long5 = bgzipBlock1.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', (long) 97, (int) ' ', 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(35, (long) (byte) 1, 100, (int) (short) 100);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException3);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException5 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException7 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException19.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException7.addSuppressed((java.lang.Throwable) malformedBgzipDataException23);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder8.dataLength(1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder8.dataOffset((long) (-1));
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder12.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder14.inputLength(0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder18 = builder14.inputLength(100);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder20 = builder18.dataOffset((long) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("", (java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        java.lang.Throwable[] throwableArray5 = malformedBgzipDataException4.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException4);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException8 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException10 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray11 = malformedBgzipDataException10.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException13 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException10.addSuppressed((java.lang.Throwable) malformedBgzipDataException13);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException16 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray17 = malformedBgzipDataException16.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException16.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException13.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray22 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException8.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException24 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException24);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException26 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException24);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getInputLength();
        long long6 = bgzipBlock4.getDataOffset();
        long long7 = bgzipBlock4.getDataOffset();
        int int8 = bgzipBlock4.getBlockSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (short) 1, (int) (short) 100, (int) '#');
        int int5 = bgzipBlock4.getDataLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getBlockSize();
        int int6 = bgzipBlock4.getInputLength();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) (byte) 1, (long) 35, (int) '4', 100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(100, (long) (short) -1, (int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(0, 35L, 1, (int) ' ');
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.blockSize((int) (byte) 10);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock9 = builder8.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder11 = builder8.blockSize((int) (short) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(bgzipBlock9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.inputLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.dataLength((int) (byte) 1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder12 = builder10.dataOffset((long) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder14 = builder10.inputLength((int) (short) -1);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder16 = builder14.inputLength((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder4.blockSize((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder4.dataOffset((long) (byte) -1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException2 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray3 = malformedBgzipDataException2.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException4 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException2);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray7 = malformedBgzipDataException6.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException9);
        malformedBgzipDataException4.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!", (java.lang.Throwable) malformedBgzipDataException6);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock((int) 'a', 0L, (int) (short) 10, (int) (byte) -1);
        int int5 = bgzipBlock4.getBlockSize();
        long long6 = bgzipBlock4.getDataOffset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize(100);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock11 = builder10.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder13 = builder10.blockSize(0);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock14 = builder13.build();
        int int15 = bgzipBlock14.getBlockSize();
        int int16 = bgzipBlock14.getBlockSize();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bgzipBlock11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(bgzipBlock14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataLength((int) 'a');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder6.blockSize(100);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock11 = builder10.build();
        int int12 = bgzipBlock11.getInputLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(bgzipBlock11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException3 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray4 = malformedBgzipDataException3.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException6 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException3.addSuppressed((java.lang.Throwable) malformedBgzipDataException6);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException9 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        java.lang.Throwable[] throwableArray10 = malformedBgzipDataException9.getSuppressed();
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException12 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        malformedBgzipDataException9.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        malformedBgzipDataException6.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        java.lang.Throwable[] throwableArray15 = malformedBgzipDataException12.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException12);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException19 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("hi!");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException20 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!", (java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Throwable[] throwableArray21 = malformedBgzipDataException19.getSuppressed();
        malformedBgzipDataException1.addSuppressed((java.lang.Throwable) malformedBgzipDataException19);
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException23 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException((java.lang.Throwable) malformedBgzipDataException19);
        java.lang.Class<?> wildcardClass24 = malformedBgzipDataException23.getClass();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock4 = new com.vivimice.bgzfrandreader.BgzipBlock(1, (long) (byte) 1, (int) '#', (int) (byte) 1);
        long long5 = bgzipBlock4.getDataOffset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.vivimice.bgzfrandreader.MalformedBgzipDataException malformedBgzipDataException1 = new com.vivimice.bgzfrandreader.MalformedBgzipDataException("com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: com.vivimice.bgzfrandreader.MalformedBgzipDataException: hi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataLength((int) (byte) 0);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder0.blockSize((int) '4');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder0.blockSize((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder0.inputLength(97);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder10 = builder0.inputLength((int) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.dataLength((int) ' ');
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.blockSize(97);
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock7 = builder6.build();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder9 = builder6.dataLength((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(bgzipBlock7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder2 = builder0.dataOffset((long) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder4 = builder2.inputLength((int) (short) 10);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder6 = builder2.dataOffset(0L);
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder8 = builder6.dataOffset((long) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.vivimice.bgzfrandreader.BgzipBlock.Builder builder0 = com.vivimice.bgzfrandreader.BgzipBlock.builder();
        com.vivimice.bgzfrandreader.BgzipBlock bgzipBlock1 = builder0.build();
        long long2 = bgzipBlock1.getDataOffset();
        int int3 = bgzipBlock1.getInputLength();
        int int4 = bgzipBlock1.getDataLength();
        long long5 = bgzipBlock1.getDataOffset();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(bgzipBlock1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }
}

