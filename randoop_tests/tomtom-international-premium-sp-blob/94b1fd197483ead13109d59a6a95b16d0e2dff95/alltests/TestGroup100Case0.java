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
        double double0 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.getMinimumNonZeroOutputValue();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.015625d + "'", double0 == 0.015625d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        double double0 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.MINIMUM_NONZERO_INPUT_VALUE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0078125d + "'", double0 == 0.0078125d);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        double double0 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.getMinimumNonZeroInputValue();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0078125d + "'", double0 == 0.0078125d);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) (byte) 10, doubleArray2, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) ' ', (int) (byte) -1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) 100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        double[] doubleArray4 = new double[] { '#', 10.0d };
        double[] doubleArray7 = new double[] { '#', 10.0d };
        double[] doubleArray10 = new double[] { '#', 10.0d };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray11, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction14 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray11);
        java.lang.Class<?> wildcardClass15 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray6);
        boolean boolean8 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray6, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Premium profile blob version 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 200);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 968 + "'", short1 == (short) 968);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (short) 50);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 50.0d + "'", double1 == 50.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) 10, doubleArray2, 0);
        int int5 = premiumProfileBlobData4.getWeekendSpeed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = premiumProfileBlobData4.hasDaySpeeds((int) (short) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"dayToSpeeds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        boolean boolean4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        int int6 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.lang.Class<?> wildcardClass7 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        double double0 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.MINIMUM_NONZERO_OUTPUT_VALUE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.015625d + "'", double0 == 0.015625d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(0.015625d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.015625" + "'", str1, "0.015625");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(32.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32" + "'", str1, "32");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) -3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 253.0d + "'", double1 == 253.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray4);
        boolean boolean6 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Premium profile blob version 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray3, (int) (short) 968, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Premium profile blob version 10 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        double[] doubleArray8 = new double[] { '#', 10.0d };
        double[] doubleArray11 = new double[] { '#', 10.0d };
        double[] doubleArray14 = new double[] { '#', 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray15, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction18, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 10, daySpeedsAccessorIntFunction18, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = premiumProfileBlobData22.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        double[] doubleArray7 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray12 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray17 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray22 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray27 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray32 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray33 = new double[][] { doubleArray7, doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray33, (int) (short) 968);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray36 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Time bins count for day 0 does not match the time resolution of 968 minutes: expecting 1 bins, got 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) 10, doubleArray2, 0);
        int int5 = premiumProfileBlobData4.getWeekendSpeed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = premiumProfileBlobData4.hasDaySpeeds((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"dayToSpeeds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        double[] doubleArray8 = new double[] { '#', 10.0d };
        double[] doubleArray11 = new double[] { '#', 10.0d };
        double[] doubleArray14 = new double[] { '#', 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray15, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction18, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 10, daySpeedsAccessorIntFunction18, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional24 = premiumProfileBlobData22.getDaySpeeds((int) (short) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction18);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.lang.Class<?> wildcardClass6 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Premium profile blob version 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 1, 10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', (int) (byte) -1, doubleArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional8 = premiumProfileBlobData6.getDaySpeeds((int) (short) -3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -3 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) 0.0f);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (byte) -1);
        boolean boolean13 = premiumProfileBlobData4.hasDaySpeeds((int) (short) 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', (int) (byte) -1, doubleArray2, 0);
        int int7 = premiumProfileBlobData6.getWeekendSpeed();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 10 };
        boolean boolean3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray2, 0, (int) (short) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '#', 52);
        java.util.Optional<double[]> doubleArrayOptional4 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 968);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional6 = premiumProfileBlobData2.getDaySpeeds(0);
        java.lang.Class<?> wildcardClass7 = daySpeedsAccessorOptional6.getClass();
        org.junit.Assert.assertNotNull(doubleArrayOptional4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) 'a');
        boolean boolean10 = premiumProfileBlobData4.hasDailySpeeds();
        boolean boolean12 = premiumProfileBlobData4.hasDaySpeeds((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) 'a');
        boolean boolean10 = premiumProfileBlobData4.hasDailySpeeds();
        java.lang.Class<?> wildcardClass11 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 10 };
        boolean boolean3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        boolean boolean4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray2, 52, (int) (short) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 52]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        boolean boolean8 = premiumProfileBlobData4.hasDailySpeeds();
        int int9 = premiumProfileBlobData4.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        boolean boolean3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 400);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1023 + "'", short1 == (short) 1023);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 840 + "'", short1 == (short) 840);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 400, 100, doubleArray13, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = premiumProfileBlobData17.hasDaySpeeds((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray3);
        boolean boolean5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        double[] doubleArray8 = new double[] { '#', 10.0d };
        double[] doubleArray11 = new double[] { '#', 10.0d };
        double[] doubleArray14 = new double[] { '#', 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray15, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction18, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 10, daySpeedsAccessorIntFunction18, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = daySpeedsAccessorIntFunction18.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        double[] doubleArray10 = new double[] { '#', 10.0d };
        double[] doubleArray13 = new double[] { '#', 10.0d };
        double[] doubleArray16 = new double[] { '#', 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray17, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction20 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction20, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 10, daySpeedsAccessorIntFunction20, (int) (short) 0);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 0, (int) (byte) 10, daySpeedsAccessorIntFunction20, (int) '#');
        int int27 = premiumProfileBlobData26.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode(0.015625d);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1 + "'", short1 == (short) 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        boolean boolean3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        boolean boolean4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode(0.0d);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional4 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (byte) -1);
        int int5 = premiumProfileBlobData2.getTimeResolutionMinutes();
        int int6 = premiumProfileBlobData2.getWeekendSpeed();
        org.junit.Assert.assertNotNull(doubleArrayOptional4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 1L);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 64 + "'", short1 == (short) 64);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32767, (int) (short) 8192);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32" + "'", str1, "32");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 1023);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "255" + "'", str1, "255");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 100);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 840 + "'", short1 == (short) 840);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Premium profile blob version 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 1, 10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray19 = premiumProfileBlobConverter15.toBinaryBlob(premiumProfileBlobData18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter13.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray19);
        double[] doubleArray31 = new double[] { '#', 10.0d };
        double[] doubleArray34 = new double[] { '#', 10.0d };
        double[] doubleArray37 = new double[] { '#', 10.0d };
        double[][] doubleArray38 = new double[][] { doubleArray31, doubleArray34, doubleArray37 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData40 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray38, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction41 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray38);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData43 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction41, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData45 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 10, daySpeedsAccessorIntFunction41, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray46 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData20);
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction41);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) -32768);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 200);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200" + "'", str1, "200");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15625d + "'", double1 == 0.15625d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 968);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.0d + "'", double1 == 200.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (-32768));
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((-1));
        int int12 = premiumProfileBlobData4.getWeekendSpeed();
        java.lang.Class<?> wildcardClass13 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(0.15625d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.15625" + "'", str1, "0.15625");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        int int8 = premiumProfileBlobData4.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 5);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 288 + "'", short1 == (short) 288);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 16384);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 1023 + "'", short1 == (short) 1023);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray19 = premiumProfileBlobConverter15.toBinaryBlob(premiumProfileBlobData18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter13.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray19);
        int int23 = premiumProfileBlobData22.getWeekendSpeed();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData20);
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 144 + "'", int23 == 144);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        double[] doubleArray8 = new double[] { '#', 10.0d };
        double[] doubleArray11 = new double[] { '#', 10.0d };
        double[] doubleArray14 = new double[] { '#', 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray15, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction18, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 5, (int) (byte) 10, daySpeedsAccessorIntFunction18, (int) (short) 16384);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction18);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray0, (-32768), (int) (short) 840);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 288);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.lang.Class<?> wildcardClass11 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        double[] doubleArray6 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray11 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray16 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray21 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray26 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray31 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray32 = new double[][] { doubleArray6, doubleArray11, doubleArray16, doubleArray21, doubleArray26, doubleArray31 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray32, (int) (short) 968);
        boolean boolean35 = premiumProfileBlobData34.hasDailySpeeds();
        int int36 = premiumProfileBlobData34.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 0, 10, daySpeedsAccessorIntFunction3, 0);
        boolean boolean6 = premiumProfileBlobData5.hasDailySpeeds();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray(1);
        int int10 = premiumProfileBlobData4.getWeekendSpeed();
        boolean boolean11 = premiumProfileBlobData4.hasDailySpeeds();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 'a');
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 834 + "'", short1 == (short) 834);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        byte[] byteArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray19 = premiumProfileBlobConverter15.toBinaryBlob(premiumProfileBlobData18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter13.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray19);
        java.lang.Class<?> wildcardClass23 = byteArray19.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData20);
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 834);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "255" + "'", str1, "255");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.lang.Class<?> wildcardClass8 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray19 = premiumProfileBlobConverter15.toBinaryBlob(premiumProfileBlobData18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter13.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray19);
        boolean boolean23 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray19);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData20);
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        boolean boolean5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray4, (int) (short) -3, 10);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((-1.0d));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 1023, (int) (short) 5);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional4 = premiumProfileBlobData2.getDaySpeeds(0);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray28, (int) (short) 200, (int) (short) -32768);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, -56, 0]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        double[] doubleArray10 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray15 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray20 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray25 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray30 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray35 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray36 = new double[][] { doubleArray10, doubleArray15, doubleArray20, doubleArray25, doubleArray30, doubleArray35 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray36, (int) (short) 968);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData40 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32767, (int) (short) 0, doubleArray36, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction41 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray36);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData43 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-32768), 100, daySpeedsAccessorIntFunction41, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction41);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (short) 8192);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 255.0d + "'", double1 == 255.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 2, (-1), doubleArray2, (int) (short) 840);
        boolean boolean5 = premiumProfileBlobData4.hasDailySpeeds();
        int int6 = premiumProfileBlobData4.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        boolean boolean5 = premiumProfileBlobData4.hasDailySpeeds();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (short) 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        int int6 = premiumProfileBlobData4.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData4.getWeekendSpeed();
        int int8 = premiumProfileBlobData4.getTimeResolutionMinutes();
        int int9 = premiumProfileBlobData4.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        boolean boolean3 = premiumProfileBlobData2.hasDailySpeeds();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        int int35 = premiumProfileBlobData34.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(100.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 52);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 720 + "'", short1 == (short) 720);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        boolean boolean5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray4, (int) (short) -3, 10);
        boolean boolean9 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 0.0f);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 64 + "'", short1 == (short) 64);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction16, (int) (short) 10);
        int int19 = premiumProfileBlobData18.getWeekendSpeed();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<double[]> doubleArrayOptional21 = premiumProfileBlobData18.getDaySpeedsAsArray((int) (short) 400);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 400 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-32768) + "'", int19 == (-32768));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        byte[] byteArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        double[][] doubleArray4 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction6 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(97, (int) (short) -32767, daySpeedsAccessorIntFunction6, (int) (short) -32768);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(97, 2, daySpeedsAccessorIntFunction6, (int) (short) 200);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        boolean boolean3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray2, 2, (int) (short) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 2]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) '4');
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 720 + "'", short1 == (short) 720);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        boolean boolean35 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray30);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) (short) 8192);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((-1));
        java.util.Optional<double[]> doubleArrayOptional13 = premiumProfileBlobData4.getDaySpeedsAsArray(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(doubleArrayOptional13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray6 = premiumProfileBlobConverter2.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = premiumProfileBlobConverter1.fromBinaryBlob(byteArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray6);
        int int9 = premiumProfileBlobData8.getTimeResolutionMinutes();
        int int10 = premiumProfileBlobData8.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData7);
        org.junit.Assert.assertNotNull(premiumProfileBlobData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional10 = premiumProfileBlobData5.getDaySpeeds((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray6 = premiumProfileBlobConverter2.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = premiumProfileBlobConverter1.fromBinaryBlob(byteArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray6);
        int int9 = premiumProfileBlobData8.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional11 = premiumProfileBlobData8.getDaySpeeds((int) (short) 8192);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData7);
        org.junit.Assert.assertNotNull(premiumProfileBlobData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional11);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 200);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.125d + "'", double1 == 3.125d);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray5, (-1), (int) (short) 8192);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray5, 100, (-32768));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 0]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction21 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData23 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction21, (int) (byte) 1);
        int int24 = premiumProfileBlobData23.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional26 = premiumProfileBlobData23.getDaySpeeds((int) (byte) 100);
        byte[] byteArray27 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData23);
        java.lang.Class<?> wildcardClass28 = byteArray27.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((-1));
        int int12 = premiumProfileBlobData4.getWeekendSpeed();
        int int13 = premiumProfileBlobData4.getWeekDaySpeed();
        java.util.Optional<double[]> doubleArrayOptional15 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArrayOptional15);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 255.0d + "'", double1 == 255.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction16, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = daySpeedsAccessorIntFunction16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03125d + "'", double1 == 0.03125d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        double[] doubleArray10 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray15 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray20 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray25 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray30 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray35 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray36 = new double[][] { doubleArray10, doubleArray15, doubleArray20, doubleArray25, doubleArray30, doubleArray35 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray36, (int) (short) 968);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData40 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32767, (int) (short) 0, doubleArray36, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData42 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 968, (int) (short) -16385, doubleArray36, (int) (byte) 0);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction43 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction43);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        double[] doubleArray6 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray11 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray16 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray21 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray26 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray31 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray32 = new double[][] { doubleArray6, doubleArray11, doubleArray16, doubleArray21, doubleArray26, doubleArray31 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray32, (int) (short) 968);
        boolean boolean35 = premiumProfileBlobData34.hasDailySpeeds();
        boolean boolean36 = premiumProfileBlobData34.hasDailySpeeds();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) -32767);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        int int6 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional8 = premiumProfileBlobData4.getDaySpeeds((int) '#');
        java.lang.Class<?> wildcardClass9 = daySpeedsAccessorOptional8.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(97, (int) (byte) -1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        int int6 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional8 = premiumProfileBlobData4.getDaySpeeds((int) '#');
        java.lang.Class<?> wildcardClass9 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 50, (int) (short) 100);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction17 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 8192, (int) (short) 200, doubleArray13, 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction20 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction17);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction20);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(253.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "253" + "'", str1, "253");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (byte) 0);
        int int5 = premiumProfileBlobData2.getWeekDaySpeed();
        int int6 = premiumProfileBlobData2.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getWeekDaySpeed();
        int int6 = premiumProfileBlobData4.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) 10, doubleArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<double[]> doubleArrayOptional6 = premiumProfileBlobData4.getDaySpeedsAsArray(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"dayToSpeeds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        boolean boolean9 = premiumProfileBlobData4.hasDaySpeeds((int) (byte) 100);
        boolean boolean11 = premiumProfileBlobData4.hasDaySpeeds(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (short) -3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 1023);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 255.0d + "'", double1 == 255.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) 10, doubleArray2, 0);
        int int5 = premiumProfileBlobData4.getWeekendSpeed();
        int int6 = premiumProfileBlobData4.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(144, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = premiumProfileBlobData2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 400);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        double[] doubleArray8 = new double[] { '#', 10.0d };
        double[] doubleArray11 = new double[] { '#', 10.0d };
        double[] doubleArray14 = new double[] { '#', 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray15, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction18, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 10, daySpeedsAccessorIntFunction18, (int) (short) 0);
        int int23 = premiumProfileBlobData22.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (byte) 0);
        java.util.Optional<double[]> doubleArrayOptional6 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 968);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional8 = premiumProfileBlobData2.getDaySpeeds((int) (short) 200);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional6);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (short) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 840);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "255" + "'", str1, "255");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (byte) 0);
        int int5 = premiumProfileBlobData2.getWeekDaySpeed();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 200);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        double[] doubleArray6 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray11 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray16 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray21 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray26 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray31 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray32 = new double[][] { doubleArray6, doubleArray11, doubleArray16, doubleArray21, doubleArray26, doubleArray31 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray32, (int) (short) 968);
        boolean boolean35 = premiumProfileBlobData34.hasDailySpeeds();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional37 = premiumProfileBlobData34.getDaySpeeds((int) (short) 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1023 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        int int3 = premiumProfileBlobData2.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional5 = premiumProfileBlobData2.getDaySpeeds((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray18, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass22 = byteArray18.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, -1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        double[] doubleArray4 = new double[] { '#', 10.0d };
        double[] doubleArray7 = new double[] { '#', 10.0d };
        double[] doubleArray10 = new double[] { '#', 10.0d };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = premiumProfileBlobData13.hasDaySpeeds((int) (short) 1023);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1023 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction13 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction13, (int) (byte) 1);
        int int16 = premiumProfileBlobData15.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional18 = premiumProfileBlobData15.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional20 = premiumProfileBlobData15.getDaySpeeds((int) ' ');
        int int21 = premiumProfileBlobData15.getTimeResolutionMinutes();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData15);
        int int23 = premiumProfileBlobData15.getTimeResolutionMinutes();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional18);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) '#');
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 652 + "'", short1 == (short) 652);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(2, (int) (short) 0, doubleArray13, (int) (short) 8192);
        boolean boolean19 = premiumProfileBlobData18.hasDailySpeeds();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) (short) 5);
        int int3 = premiumProfileBlobData2.getWeekendSpeed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction37 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction37, (int) (byte) 1);
        int int40 = premiumProfileBlobData39.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData39.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional44 = premiumProfileBlobData39.getDaySpeedsAsArray((int) 'a');
        boolean boolean45 = premiumProfileBlobData39.hasDailySpeeds();
        int int46 = premiumProfileBlobData39.getWeekDaySpeed();
        byte[] byteArray47 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData39);
        boolean boolean48 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray47);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(doubleArrayOptional44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray30, (int) (short) 1023, (int) (short) -32768);
        java.lang.Class<?> wildcardClass38 = byteArray30.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, 0]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction33 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction33, (int) (byte) 1);
        int int36 = premiumProfileBlobData35.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional38 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 100);
        boolean boolean40 = premiumProfileBlobData35.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 10);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
        java.lang.Class<?> wildcardClass44 = byteArray43.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) 'a');
        boolean boolean10 = premiumProfileBlobData4.hasDailySpeeds();
        int int11 = premiumProfileBlobData4.getWeekDaySpeed();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional13 = premiumProfileBlobData4.getDaySpeeds(144);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        boolean boolean31 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray28, (int) '4', (int) (short) -32768);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 52, 0]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter6 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray10 = premiumProfileBlobConverter6.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData11 = premiumProfileBlobConverter5.fromBinaryBlob(byteArray10);
        boolean boolean12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray10, (int) (short) 840, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 72, 0]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) 10, doubleArray2, 0);
        int int5 = premiumProfileBlobData4.getWeekendSpeed();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = premiumProfileBlobData4.hasDaySpeeds((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"dayToSpeeds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        double[][] doubleArray6 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray6);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction8 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', (int) (byte) -1, doubleArray6, 0);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32768, (int) (short) -32767, doubleArray6, (int) (short) 5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 16384, (int) (short) 1023, doubleArray6, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', (int) (byte) -1, doubleArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<double[]> doubleArrayOptional8 = premiumProfileBlobData6.getDaySpeedsAsArray((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction4);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        boolean boolean10 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray9, (int) (short) -3, 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        int int15 = premiumProfileBlobData14.getTimeResolutionMinutes();
        int int16 = premiumProfileBlobData14.getTimeResolutionMinutes();
        int int17 = premiumProfileBlobData14.getWeekendSpeed();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        boolean boolean10 = premiumProfileBlobData5.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional12 = premiumProfileBlobData5.getDaySpeeds(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction33 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction33, (int) (byte) 1);
        int int36 = premiumProfileBlobData35.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional38 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 100);
        boolean boolean40 = premiumProfileBlobData35.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 10);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData46 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean48 = premiumProfileBlobData46.hasDaySpeeds((int) (byte) 0);
        int int49 = premiumProfileBlobData46.getWeekDaySpeed();
        boolean boolean50 = premiumProfileBlobData46.hasDailySpeeds();
        byte[] byteArray51 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData46);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional53 = premiumProfileBlobData46.getDaySpeeds((int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional53);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 128);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "128" + "'", str1, "128");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction13 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction13, (int) (byte) 1);
        int int16 = premiumProfileBlobData15.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional18 = premiumProfileBlobData15.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional20 = premiumProfileBlobData15.getDaySpeeds((int) ' ');
        int int21 = premiumProfileBlobData15.getTimeResolutionMinutes();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData15);
        boolean boolean24 = premiumProfileBlobData15.hasDaySpeeds((int) (short) 968);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional18);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 1023, 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 840, (int) (short) 720, daySpeedsAccessorIntFunction5, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 400, 100, doubleArray13, (int) 'a');
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction18);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 0);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray0, (int) (short) 16384, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from byte/boolean array because \"blob\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        double[][] doubleArray0 = null;
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray0);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction8 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction8, (int) (byte) 1);
        int int11 = premiumProfileBlobData10.getTimeResolutionMinutes();
        int int12 = premiumProfileBlobData10.getTimeResolutionMinutes();
        byte[] byteArray13 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter16 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray20 = premiumProfileBlobConverter16.toBinaryBlob(premiumProfileBlobData19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter15.fromBinaryBlob(byteArray20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray20);
        byte[] byteArray23 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData22);
        java.util.Optional<double[]> doubleArrayOptional25 = premiumProfileBlobData22.getDaySpeedsAsArray((int) ' ');
        boolean boolean27 = premiumProfileBlobData22.hasDaySpeeds((int) 'a');
        byte[] byteArray28 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData22);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(doubleArrayOptional25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (byte) -1);
        int int12 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.lang.Class<?> wildcardClass13 = premiumProfileBlobData4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.getWeekDaySpeed()\" because \"blobData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 200, (int) (short) 50);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.lang.Class<?> wildcardClass10 = daySpeedsAccessorOptional9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '#', 52);
        java.util.Optional<double[]> doubleArrayOptional5 = premiumProfileBlobData3.getDaySpeedsAsArray((int) (short) 968);
        byte[] byteArray6 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        java.lang.Class<?> wildcardClass7 = premiumProfileBlobConverter0.getClass();
        org.junit.Assert.assertNotNull(doubleArrayOptional5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 35, 52]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        int int19 = premiumProfileBlobData17.getWeekDaySpeed();
        int int20 = premiumProfileBlobData17.getWeekendSpeed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 144 + "'", int20 == 144);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData37 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', 1);
        byte[] byteArray38 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData37);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray38, (int) (short) 2, (int) (short) 5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[1, 2, 5]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) '4');
        int int3 = premiumProfileBlobData2.getWeekDaySpeed();
        java.util.Optional<double[]> doubleArrayOptional5 = premiumProfileBlobData2.getDaySpeedsAsArray((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArrayOptional5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) '4');
        java.util.Optional<double[]> doubleArrayOptional4 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 10);
        boolean boolean5 = premiumProfileBlobData2.hasDailySpeeds();
        org.junit.Assert.assertNotNull(doubleArrayOptional4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction33 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction33, (int) (byte) 1);
        int int36 = premiumProfileBlobData35.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional38 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 100);
        boolean boolean40 = premiumProfileBlobData35.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 10);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData46 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean48 = premiumProfileBlobData46.hasDaySpeeds((int) (byte) 0);
        int int49 = premiumProfileBlobData46.getWeekDaySpeed();
        boolean boolean50 = premiumProfileBlobData46.hasDailySpeeds();
        byte[] byteArray51 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData46);
        java.lang.Class<?> wildcardClass52 = premiumProfileBlobData46.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) (-32768));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) 'a');
        boolean boolean3 = premiumProfileBlobData2.hasDailySpeeds();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 50, doubleArray2, (int) (short) 200);
        int int8 = premiumProfileBlobData7.getWeekDaySpeed();
        int int9 = premiumProfileBlobData7.getWeekendSpeed();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 50 + "'", int9 == 50);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 1023, (int) (short) -16385);
        java.util.Optional<double[]> doubleArrayOptional4 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 400);
        org.junit.Assert.assertNotNull(doubleArrayOptional4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded(253.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 253.0d + "'", double1 == 253.0d);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 16384);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded(9.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.util.Optional<double[]> doubleArrayOptional20 = premiumProfileBlobData17.getDaySpeedsAsArray((int) ' ');
        boolean boolean22 = premiumProfileBlobData17.hasDaySpeeds((int) 'a');
        int int23 = premiumProfileBlobData17.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(doubleArrayOptional20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode(1.0d);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 64 + "'", short1 == (short) 64);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 10, (int) (short) -32768, doubleArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData5.getDaySpeeds((int) (short) 652);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 652 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        double[][] doubleArray2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 50, 1, doubleArray2, (int) (short) 834);
        int int5 = premiumProfileBlobData4.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction21 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData23 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction21, (int) (byte) 1);
        int int24 = premiumProfileBlobData23.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional26 = premiumProfileBlobData23.getDaySpeeds((int) (byte) 100);
        byte[] byteArray27 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData23);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction30 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction30, (int) (byte) 1);
        int int33 = premiumProfileBlobData32.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional35 = premiumProfileBlobData32.getDaySpeedsAsArray((int) ' ');
        boolean boolean37 = premiumProfileBlobData32.hasDaySpeeds((int) '#');
        int int38 = premiumProfileBlobData32.getWeekDaySpeed();
        int int39 = premiumProfileBlobData32.getWeekDaySpeed();
        byte[] byteArray40 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData32);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter41 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction44 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData46 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction44, (int) (byte) 1);
        int int47 = premiumProfileBlobData46.getTimeResolutionMinutes();
        int int48 = premiumProfileBlobData46.getTimeResolutionMinutes();
        byte[] byteArray49 = premiumProfileBlobConverter41.toBinaryBlob(premiumProfileBlobData46);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter50 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter51 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter52 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData55 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray56 = premiumProfileBlobConverter52.toBinaryBlob(premiumProfileBlobData55);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData57 = premiumProfileBlobConverter51.fromBinaryBlob(byteArray56);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData58 = premiumProfileBlobConverter50.fromBinaryBlob(byteArray56);
        byte[] byteArray59 = premiumProfileBlobConverter41.toBinaryBlob(premiumProfileBlobData58);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter60 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData63 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray64 = premiumProfileBlobConverter60.toBinaryBlob(premiumProfileBlobData63);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter65 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData68 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray69 = premiumProfileBlobConverter65.toBinaryBlob(premiumProfileBlobData68);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData70 = premiumProfileBlobConverter60.fromBinaryBlob(byteArray69);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData71 = premiumProfileBlobConverter41.fromBinaryBlob(byteArray69);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction74 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData76 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction74, (int) (byte) 1);
        int int77 = premiumProfileBlobData76.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional79 = premiumProfileBlobData76.getDaySpeeds((int) (byte) 100);
        boolean boolean81 = premiumProfileBlobData76.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional83 = premiumProfileBlobData76.getDaySpeeds((int) (byte) 10);
        byte[] byteArray84 = premiumProfileBlobConverter41.toBinaryBlob(premiumProfileBlobData76);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData85 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray84);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData57);
        org.junit.Assert.assertNotNull(premiumProfileBlobData58);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData70);
        org.junit.Assert.assertNotNull(premiumProfileBlobData71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional83);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData85);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        int int7 = premiumProfileBlobData6.getWeekendSpeed();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 144 + "'", int7 == 144);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) 5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        boolean boolean5 = premiumProfileBlobData4.hasDailySpeeds();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) 652);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) 200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) -3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction21 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData23 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction21, (int) (byte) 1);
        int int24 = premiumProfileBlobData23.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional26 = premiumProfileBlobData23.getDaySpeeds((int) (byte) 100);
        byte[] byteArray27 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData23);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction30 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction30, (int) (byte) 1);
        int int33 = premiumProfileBlobData32.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional35 = premiumProfileBlobData32.getDaySpeedsAsArray((int) ' ');
        boolean boolean37 = premiumProfileBlobData32.hasDaySpeeds((int) '#');
        int int38 = premiumProfileBlobData32.getWeekDaySpeed();
        int int39 = premiumProfileBlobData32.getWeekDaySpeed();
        byte[] byteArray40 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData32);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray40, (int) ' ', (int) (short) 128);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 32, -128]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray(1);
        boolean boolean10 = premiumProfileBlobData4.hasDailySpeeds();
        java.util.Optional<double[]> doubleArrayOptional12 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) 840);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 840, 97);
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional6 = premiumProfileBlobData3.getDaySpeeds(0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) '4');
        java.util.Optional<double[]> doubleArrayOptional4 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 10);
        int int5 = premiumProfileBlobData2.getWeekendSpeed();
        org.junit.Assert.assertNotNull(doubleArrayOptional4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.lang.Class<?> wildcardClass19 = premiumProfileBlobData17.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        boolean boolean7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray5, (int) (short) 1, (int) (short) 720);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, -48]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction33 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction33, (int) (byte) 1);
        int int36 = premiumProfileBlobData35.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional38 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 100);
        boolean boolean40 = premiumProfileBlobData35.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 10);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray43, 50, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 50, 100]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) -32768, daySpeedsAccessorIntFunction16, (int) (short) 10);
        int int19 = premiumProfileBlobData18.getWeekendSpeed();
        boolean boolean20 = premiumProfileBlobData18.hasDailySpeeds();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-32768) + "'", int19 == (-32768));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) 2);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 128 + "'", short1 == (short) 128);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction33 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction33, (int) (byte) 1);
        int int36 = premiumProfileBlobData35.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional38 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 100);
        boolean boolean40 = premiumProfileBlobData35.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 10);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData46 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean48 = premiumProfileBlobData46.hasDaySpeeds((int) (byte) 0);
        int int49 = premiumProfileBlobData46.getWeekDaySpeed();
        boolean boolean50 = premiumProfileBlobData46.hasDailySpeeds();
        byte[] byteArray51 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData46);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData54 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '#', 52);
        java.util.Optional<double[]> doubleArrayOptional56 = premiumProfileBlobData54.getDaySpeedsAsArray((int) (short) 968);
        boolean boolean57 = premiumProfileBlobData54.hasDailySpeeds();
        byte[] byteArray58 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData54);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(doubleArrayOptional56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 35, 52]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray39 = premiumProfileBlobConverter35.toBinaryBlob(premiumProfileBlobData38);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter40 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData43 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray44 = premiumProfileBlobConverter40.toBinaryBlob(premiumProfileBlobData43);
        boolean boolean45 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray44);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray44, (int) (short) -3, 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData49 = premiumProfileBlobConverter35.fromBinaryBlob(byteArray44);
        int int50 = premiumProfileBlobData49.getTimeResolutionMinutes();
        int int51 = premiumProfileBlobData49.getTimeResolutionMinutes();
        byte[] byteArray52 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData49);
        double[][] doubleArray55 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData57 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) 10, doubleArray55, 0);
        int int58 = premiumProfileBlobData57.getWeekendSpeed();
        int int59 = premiumProfileBlobData57.getWeekDaySpeed();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray60 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 52 + "'", int59 == 52);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32767, (int) (short) 968);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        boolean boolean9 = premiumProfileBlobData4.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray(50);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        double[] doubleArray8 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray13 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray18 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray23 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray28 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray33 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray34 = new double[][] { doubleArray8, doubleArray13, doubleArray18, doubleArray23, doubleArray28, doubleArray33 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData36 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray34, (int) (short) 968);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, 5, doubleArray34, (int) (short) -32767);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = premiumProfileBlobData38.hasDaySpeeds(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(144, (int) (byte) 0);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional4 = premiumProfileBlobData2.getDaySpeeds(10);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray17 = premiumProfileBlobConverter13.toBinaryBlob(premiumProfileBlobData16);
        boolean boolean18 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray17);
        int int20 = premiumProfileBlobData19.getWeekDaySpeed();
        boolean boolean22 = premiumProfileBlobData19.hasDaySpeeds((int) (short) 400);
        java.util.Optional<double[]> doubleArrayOptional24 = premiumProfileBlobData19.getDaySpeedsAsArray((-32768));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional24);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(2, (int) (short) 200, daySpeedsAccessorIntFunction2, (int) (short) -16385);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        boolean boolean9 = premiumProfileBlobData4.hasDaySpeeds((int) '#');
        int int10 = premiumProfileBlobData4.getWeekDaySpeed();
        int int11 = premiumProfileBlobData4.getWeekDaySpeed();
        java.util.Optional<double[]> doubleArrayOptional13 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArrayOptional13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 0, 10, daySpeedsAccessorIntFunction3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData5.getDaySpeeds((int) (short) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(3.125d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3.125" + "'", str1, "3.125");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray6 = premiumProfileBlobConverter2.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = premiumProfileBlobConverter1.fromBinaryBlob(byteArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray6);
        int int9 = premiumProfileBlobData8.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData7);
        org.junit.Assert.assertNotNull(premiumProfileBlobData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10 };
        boolean boolean12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray11);
        boolean boolean13 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        double[][] doubleArray8 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction9 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray8);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction10 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray8);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction11 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 200, (int) (short) -1, daySpeedsAccessorIntFunction11, (int) (byte) 100);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) (short) 840, daySpeedsAccessorIntFunction11, (int) '#');
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(144, (int) (byte) 0, daySpeedsAccessorIntFunction11, (int) (short) 652);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(2, (int) (short) 1023, daySpeedsAccessorIntFunction11, (int) (short) 968);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction9);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction10);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(10, (-1));
        int int3 = premiumProfileBlobData2.getWeekendSpeed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction13 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction13, (int) (byte) 1);
        int int16 = premiumProfileBlobData15.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional18 = premiumProfileBlobData15.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional20 = premiumProfileBlobData15.getDaySpeeds((int) ' ');
        int int21 = premiumProfileBlobData15.getTimeResolutionMinutes();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData15);
        boolean boolean24 = premiumProfileBlobData15.hasDaySpeeds((int) (short) -16385);
        int int25 = premiumProfileBlobData15.getTimeResolutionMinutes();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional18);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction21 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData23 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction21, (int) (byte) 1);
        int int24 = premiumProfileBlobData23.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional26 = premiumProfileBlobData23.getDaySpeeds((int) (byte) 100);
        byte[] byteArray27 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData23);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction30 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction30, (int) (byte) 1);
        int int33 = premiumProfileBlobData32.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional35 = premiumProfileBlobData32.getDaySpeedsAsArray((int) ' ');
        boolean boolean37 = premiumProfileBlobData32.hasDaySpeeds((int) '#');
        int int38 = premiumProfileBlobData32.getWeekDaySpeed();
        int int39 = premiumProfileBlobData32.getWeekDaySpeed();
        byte[] byteArray40 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData32);
        boolean boolean41 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray40);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 10, 52);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5625d + "'", double1 == 1.5625d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 255.0d + "'", double1 == 255.0d);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 417);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "255" + "'", str1, "255");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray19 = premiumProfileBlobConverter15.toBinaryBlob(premiumProfileBlobData18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter13.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray19, (int) (short) 840, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 72, 0]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData20);
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction17 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 8192, (int) (short) 200, doubleArray13, 10);
        int int20 = premiumProfileBlobData19.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8192 + "'", int20 == 8192);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional11 = premiumProfileBlobData4.getDaySpeeds((int) (short) -32767);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional11);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        double[][] doubleArray4 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction6 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', (int) (byte) -1, doubleArray4, 0);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32768, (int) (short) -32767, doubleArray4, (int) (short) 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional12 = premiumProfileBlobData10.getDaySpeeds(144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 144 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction6);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0 };
        boolean boolean38 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        boolean boolean9 = premiumProfileBlobData4.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) 8192);
        java.util.Optional<double[]> doubleArrayOptional13 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(doubleArrayOptional13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        int int31 = premiumProfileBlobData30.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        boolean boolean7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray5);
        boolean boolean8 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray5, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        boolean boolean9 = premiumProfileBlobData4.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional11 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 10);
        java.util.Optional<double[]> doubleArrayOptional13 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional11);
        org.junit.Assert.assertNotNull(doubleArrayOptional13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData30 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray28);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction33 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction33, (int) (byte) 1);
        int int36 = premiumProfileBlobData35.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional38 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 100);
        boolean boolean40 = premiumProfileBlobData35.hasDaySpeeds((int) (byte) 100);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData35.getDaySpeeds((int) (byte) 10);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData46 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean48 = premiumProfileBlobData46.hasDaySpeeds((int) (byte) 0);
        int int49 = premiumProfileBlobData46.getWeekDaySpeed();
        boolean boolean50 = premiumProfileBlobData46.hasDailySpeeds();
        byte[] byteArray51 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData46);
        int int52 = premiumProfileBlobData46.getWeekendSpeed();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(premiumProfileBlobData30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[1, 1, 97]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter6 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray10 = premiumProfileBlobConverter6.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData11 = premiumProfileBlobConverter5.fromBinaryBlob(byteArray10);
        boolean boolean12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray10);
        java.util.Optional<double[]> doubleArrayOptional15 = premiumProfileBlobData13.getDaySpeedsAsArray((int) (short) 968);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData13);
        org.junit.Assert.assertNotNull(doubleArrayOptional15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        double[] doubleArray10 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray15 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray20 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray25 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray30 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray35 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray36 = new double[][] { doubleArray10, doubleArray15, doubleArray20, doubleArray25, doubleArray30, doubleArray35 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray36, (int) (short) 968);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData40 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 5, 52, doubleArray36, 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData42 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (byte) -1, doubleArray36, (int) (byte) -1);
        java.lang.Class<?> wildcardClass43 = premiumProfileBlobData42.getClass();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText(9.0d);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        double[] doubleArray6 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray11 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray16 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray21 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray26 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray31 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray32 = new double[][] { doubleArray6, doubleArray11, doubleArray16, doubleArray21, doubleArray26, doubleArray31 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray32, (int) (short) 968);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional36 = premiumProfileBlobData34.getDaySpeeds((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData9.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray12 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter13 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray19 = premiumProfileBlobConverter15.toBinaryBlob(premiumProfileBlobData18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = premiumProfileBlobConverter14.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData21 = premiumProfileBlobConverter13.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray19);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray26 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData25);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 400, 2);
        byte[] byteArray30 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData29);
        boolean boolean31 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray30);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData20);
        org.junit.Assert.assertNotNull(premiumProfileBlobData21);
        org.junit.Assert.assertNotNull(premiumProfileBlobData22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -112, 2]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 1936);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 144.0d + "'", double1 == 144.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        double[][] doubleArray4 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction6 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 200, (int) (short) -1, daySpeedsAccessorIntFunction7, (int) (byte) 100);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) (short) 840, daySpeedsAccessorIntFunction7, (int) '#');
        int int12 = premiumProfileBlobData11.getWeekendSpeed();
        int int13 = premiumProfileBlobData11.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction6);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 840 + "'", int12 == 840);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 2);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 128 + "'", short1 == (short) 128);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) 'a');
        boolean boolean10 = premiumProfileBlobData4.hasDailySpeeds();
        int int11 = premiumProfileBlobData4.getWeekendSpeed();
        int int12 = premiumProfileBlobData4.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter6 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray10 = premiumProfileBlobConverter6.toBinaryBlob(premiumProfileBlobData9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData11 = premiumProfileBlobConverter5.fromBinaryBlob(byteArray10);
        boolean boolean12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData13 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction16, (int) (byte) 1);
        int int19 = premiumProfileBlobData18.getTimeResolutionMinutes();
        int int20 = premiumProfileBlobData18.getTimeResolutionMinutes();
        int int21 = premiumProfileBlobData18.getWeekDaySpeed();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData18);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 52]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        boolean boolean8 = premiumProfileBlobData4.hasDailySpeeds();
        boolean boolean9 = premiumProfileBlobData4.hasDailySpeeds();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        double[] doubleArray8 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray13 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray18 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray23 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray28 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray33 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray34 = new double[][] { doubleArray8, doubleArray13, doubleArray18, doubleArray23, doubleArray28, doubleArray33 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData36 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray34, (int) (short) 968);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, 5, doubleArray34, (int) (short) -32767);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional40 = premiumProfileBlobData38.getDaySpeeds((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        boolean boolean11 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray9);
        boolean boolean12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction13 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction13, (int) (byte) 1);
        int int16 = premiumProfileBlobData15.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional18 = premiumProfileBlobData15.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional20 = premiumProfileBlobData15.getDaySpeeds((int) ' ');
        int int21 = premiumProfileBlobData15.getTimeResolutionMinutes();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray22, (int) (short) -1, 52);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray22, (int) (short) 1023, (int) (short) 100);
        boolean boolean29 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray22);
        boolean boolean30 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray22);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional18);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '4', (int) (short) -512, doubleArray13, 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (byte) 0);
        int int5 = premiumProfileBlobData2.getWeekendSpeed();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional6 = premiumProfileBlobData3.getDaySpeeds((int) (byte) 0);
        boolean boolean8 = premiumProfileBlobData3.hasDaySpeeds((int) (short) 968);
        java.util.Optional<double[]> doubleArrayOptional10 = premiumProfileBlobData3.getDaySpeedsAsArray(0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArrayOptional10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        double[] doubleArray10 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray15 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray20 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray25 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray30 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray35 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray36 = new double[][] { doubleArray10, doubleArray15, doubleArray20, doubleArray25, doubleArray30, doubleArray35 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray36, (int) (short) 968);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData40 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 5, 52, doubleArray36, 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData42 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) (short) -3, doubleArray36, (int) (short) -1);
        int int43 = premiumProfileBlobData42.getWeekDaySpeed();
        int int44 = premiumProfileBlobData42.getWeekDaySpeed();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        double[][] doubleArray2 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction4 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray2);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 968, 5, daySpeedsAccessorIntFunction5, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction3);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) -3);
        boolean boolean11 = premiumProfileBlobData4.hasDaySpeeds((int) (short) 16384);
        int int12 = premiumProfileBlobData4.getWeekendSpeed();
        boolean boolean13 = premiumProfileBlobData4.hasDailySpeeds();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-32768), (int) (short) 400);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 64, 144);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) (byte) 100);
        java.util.Optional<double[]> doubleArrayOptional9 = premiumProfileBlobData4.getDaySpeedsAsArray((int) (short) -3);
        boolean boolean11 = premiumProfileBlobData4.hasDaySpeeds((int) (short) 16384);
        int int12 = premiumProfileBlobData4.getWeekendSpeed();
        boolean boolean14 = premiumProfileBlobData4.hasDaySpeeds((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertNotNull(doubleArrayOptional9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode((double) (short) 50);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 712 + "'", short1 == (short) 712);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.decode((short) 128);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction17 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32768, (-1), daySpeedsAccessorIntFunction17, (int) (short) 400);
        int int20 = premiumProfileBlobData19.getTimeResolutionMinutes();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 400 + "'", int20 == 400);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        double[][] doubleArray6 = new double[][] { doubleArray2, doubleArray3, doubleArray4, doubleArray5 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 10, (int) (short) -16385, doubleArray6, (int) (short) 840);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 1440);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "255" + "'", str1, "255");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        double[] doubleArray8 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray13 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray18 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray23 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray28 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray33 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray34 = new double[][] { doubleArray8, doubleArray13, doubleArray18, doubleArray23, doubleArray28, doubleArray33 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData36 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray34, (int) (short) 968);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction37 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray34);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-32768), 840, doubleArray34, (int) (short) 417);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction37);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray6 = premiumProfileBlobConverter2.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = premiumProfileBlobConverter1.fromBinaryBlob(byteArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray13 = premiumProfileBlobConverter9.toBinaryBlob(premiumProfileBlobData12);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray18 = premiumProfileBlobConverter14.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray18);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter21 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray25 = premiumProfileBlobConverter21.toBinaryBlob(premiumProfileBlobData24);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData26 = premiumProfileBlobConverter20.fromBinaryBlob(byteArray25);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional31 = premiumProfileBlobData29.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray32 = premiumProfileBlobConverter20.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter33 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter35 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData38 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray39 = premiumProfileBlobConverter35.toBinaryBlob(premiumProfileBlobData38);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData40 = premiumProfileBlobConverter34.fromBinaryBlob(byteArray39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData41 = premiumProfileBlobConverter33.fromBinaryBlob(byteArray39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData42 = premiumProfileBlobConverter20.fromBinaryBlob(byteArray39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData43 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter44 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter45 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData48 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray49 = premiumProfileBlobConverter45.toBinaryBlob(premiumProfileBlobData48);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData50 = premiumProfileBlobConverter44.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData53 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional55 = premiumProfileBlobData53.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray56 = premiumProfileBlobConverter44.toBinaryBlob(premiumProfileBlobData53);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter57 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData60 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray61 = premiumProfileBlobConverter57.toBinaryBlob(premiumProfileBlobData60);
        boolean boolean62 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray61);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData63 = premiumProfileBlobConverter44.fromBinaryBlob(byteArray61);
        byte[] byteArray64 = premiumProfileBlobConverter9.toBinaryBlob(premiumProfileBlobData63);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData65 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray64);
        boolean boolean67 = premiumProfileBlobData65.hasDaySpeeds((int) '#');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData7);
        org.junit.Assert.assertNotNull(premiumProfileBlobData8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData19);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData26);
        org.junit.Assert.assertNotNull(doubleArrayOptional31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData40);
        org.junit.Assert.assertNotNull(premiumProfileBlobData41);
        org.junit.Assert.assertNotNull(premiumProfileBlobData42);
        org.junit.Assert.assertNotNull(premiumProfileBlobData43);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData50);
        org.junit.Assert.assertNotNull(doubleArrayOptional55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData63);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        double[][] doubleArray4 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction6 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction7 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 50, doubleArray4, (int) (short) 200);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) (short) 0, doubleArray4, (int) 'a');
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction12 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction6);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional4 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (byte) -1);
        java.util.Optional<double[]> doubleArrayOptional6 = premiumProfileBlobData2.getDaySpeedsAsArray((int) (short) 400);
        org.junit.Assert.assertNotNull(doubleArrayOptional4);
        org.junit.Assert.assertNotNull(doubleArrayOptional6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray16 = premiumProfileBlobConverter12.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray16);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData20 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional22 = premiumProfileBlobData20.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray23 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData20);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter26 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray30 = premiumProfileBlobConverter26.toBinaryBlob(premiumProfileBlobData29);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData31 = premiumProfileBlobConverter25.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = premiumProfileBlobConverter24.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData33 = premiumProfileBlobConverter11.fromBinaryBlob(byteArray30);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray30);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction37 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction37, (int) (byte) 1);
        int int40 = premiumProfileBlobData39.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional42 = premiumProfileBlobData39.getDaySpeeds((int) (byte) 100);
        byte[] byteArray43 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData46 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '#', 52);
        int int47 = premiumProfileBlobData46.getWeekDaySpeed();
        byte[] byteArray48 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData46);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(doubleArrayOptional22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData31);
        org.junit.Assert.assertNotNull(premiumProfileBlobData32);
        org.junit.Assert.assertNotNull(premiumProfileBlobData33);
        org.junit.Assert.assertNotNull(premiumProfileBlobData34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 35, 52]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (byte) 0);
        int int5 = premiumProfileBlobData2.getWeekDaySpeed();
        boolean boolean6 = premiumProfileBlobData2.hasDailySpeeds();
        boolean boolean7 = premiumProfileBlobData2.hasDailySpeeds();
        int int8 = premiumProfileBlobData2.getTimeResolutionMinutes();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-32768), (int) (byte) 10);
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (short) 400);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData18 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(2, (int) (byte) 0, doubleArray13, (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        boolean boolean10 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray9);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray9, (int) (short) -3, 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        int int15 = premiumProfileBlobData14.getTimeResolutionMinutes();
        int int16 = premiumProfileBlobData14.getTimeResolutionMinutes();
        int int17 = premiumProfileBlobData14.getTimeResolutionMinutes();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray5 = premiumProfileBlobConverter1.toBinaryBlob(premiumProfileBlobData4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData6 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter7 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction10 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData12 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction10, (int) (byte) 1);
        int int13 = premiumProfileBlobData12.getTimeResolutionMinutes();
        int int14 = premiumProfileBlobData12.getTimeResolutionMinutes();
        byte[] byteArray15 = premiumProfileBlobConverter7.toBinaryBlob(premiumProfileBlobData12);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray15);
        boolean boolean17 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray15);
        java.lang.Class<?> wildcardClass18 = byteArray15.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional7 = premiumProfileBlobData4.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional9 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        java.util.Optional<double[]> doubleArrayOptional11 = premiumProfileBlobData4.getDaySpeedsAsArray((-1));
        int int12 = premiumProfileBlobData4.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional7);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional9);
        org.junit.Assert.assertNotNull(doubleArrayOptional11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        int int3 = premiumProfileBlobData2.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData22 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray23 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData22);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter24 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData27 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray28 = premiumProfileBlobConverter24.toBinaryBlob(premiumProfileBlobData27);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData29 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray28);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter30 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter31 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray35 = premiumProfileBlobConverter31.toBinaryBlob(premiumProfileBlobData34);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData36 = premiumProfileBlobConverter30.fromBinaryBlob(byteArray35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional41 = premiumProfileBlobData39.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray42 = premiumProfileBlobConverter30.toBinaryBlob(premiumProfileBlobData39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter43 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter44 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter45 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData48 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray49 = premiumProfileBlobConverter45.toBinaryBlob(premiumProfileBlobData48);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData50 = premiumProfileBlobConverter44.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData51 = premiumProfileBlobConverter43.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData52 = premiumProfileBlobConverter30.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData53 = premiumProfileBlobConverter19.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter54 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData57 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray58 = premiumProfileBlobConverter54.toBinaryBlob(premiumProfileBlobData57);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter59 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData62 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray63 = premiumProfileBlobConverter59.toBinaryBlob(premiumProfileBlobData62);
        boolean boolean64 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.hasSupportedVersion(byteArray63);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray63, (int) (short) -3, 10);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData68 = premiumProfileBlobConverter54.fromBinaryBlob(byteArray63);
        int int69 = premiumProfileBlobData68.getTimeResolutionMinutes();
        int int70 = premiumProfileBlobData68.getTimeResolutionMinutes();
        byte[] byteArray71 = premiumProfileBlobConverter19.toBinaryBlob(premiumProfileBlobData68);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData72 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray71);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData36);
        org.junit.Assert.assertNotNull(doubleArrayOptional41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData50);
        org.junit.Assert.assertNotNull(premiumProfileBlobData51);
        org.junit.Assert.assertNotNull(premiumProfileBlobData52);
        org.junit.Assert.assertNotNull(premiumProfileBlobData53);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[1, -3, 10]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(premiumProfileBlobData68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, -3, 10]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData72);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        short short1 = com.tomtom.traffic.iqr.io.premium.blob.FlexSpeedEncoding.encode(52.0d);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 720 + "'", short1 == (short) 720);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction13 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction13, (int) (byte) 1);
        int int16 = premiumProfileBlobData15.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional18 = premiumProfileBlobData15.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional20 = premiumProfileBlobData15.getDaySpeeds((int) ' ');
        int int21 = premiumProfileBlobData15.getTimeResolutionMinutes();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData15);
        boolean boolean24 = premiumProfileBlobData15.hasDaySpeeds((int) (short) -16385);
        boolean boolean26 = premiumProfileBlobData15.hasDaySpeeds((int) (short) 1440);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional18);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean4 = premiumProfileBlobData2.hasDaySpeeds((int) (byte) 0);
        int int5 = premiumProfileBlobData2.getWeekDaySpeed();
        boolean boolean6 = premiumProfileBlobData2.hasDailySpeeds();
        boolean boolean8 = premiumProfileBlobData2.hasDaySpeeds(52);
        int int9 = premiumProfileBlobData2.getWeekendSpeed();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray4 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray9 = premiumProfileBlobConverter5.toBinaryBlob(premiumProfileBlobData8);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData10 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray9);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction13 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction13, (int) (byte) 1);
        int int16 = premiumProfileBlobData15.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional18 = premiumProfileBlobData15.getDaySpeedsAsArray((int) ' ');
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional20 = premiumProfileBlobData15.getDaySpeeds((int) ' ');
        int int21 = premiumProfileBlobData15.getTimeResolutionMinutes();
        byte[] byteArray22 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData25 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -1, (int) '4');
        java.util.Optional<double[]> doubleArrayOptional27 = premiumProfileBlobData25.getDaySpeedsAsArray((int) (short) 10);
        int int28 = premiumProfileBlobData25.getTimeResolutionMinutes();
        byte[] byteArray29 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData25);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter30 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter31 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData34 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray35 = premiumProfileBlobConverter31.toBinaryBlob(premiumProfileBlobData34);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData36 = premiumProfileBlobConverter30.fromBinaryBlob(byteArray35);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        java.util.Optional<double[]> doubleArrayOptional41 = premiumProfileBlobData39.getDaySpeedsAsArray((int) (byte) -1);
        byte[] byteArray42 = premiumProfileBlobConverter30.toBinaryBlob(premiumProfileBlobData39);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter43 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter44 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter45 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData48 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray49 = premiumProfileBlobConverter45.toBinaryBlob(premiumProfileBlobData48);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData50 = premiumProfileBlobConverter44.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData51 = premiumProfileBlobConverter43.fromBinaryBlob(byteArray49);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData52 = premiumProfileBlobConverter30.fromBinaryBlob(byteArray49);
        boolean boolean54 = premiumProfileBlobData52.hasDaySpeeds(10);
        byte[] byteArray55 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData52);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional18);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(doubleArrayOptional27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, 52]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData36);
        org.junit.Assert.assertNotNull(doubleArrayOptional41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 1, 97]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData50);
        org.junit.Assert.assertNotNull(premiumProfileBlobData51);
        org.junit.Assert.assertNotNull(premiumProfileBlobData52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[1, 100, -112]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction17 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -32768, (-1), daySpeedsAccessorIntFunction17, (int) (short) 400);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = premiumProfileBlobData19.hasDaySpeeds((-32768));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -32768 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction17);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.setMeanSpeeds(byteArray8, (int) (short) -3, (int) (short) 128);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, -3, -128]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData3 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) '#', 52);
        java.util.Optional<double[]> doubleArrayOptional5 = premiumProfileBlobData3.getDaySpeedsAsArray((int) (short) 968);
        byte[] byteArray6 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData3);
        boolean boolean7 = premiumProfileBlobData3.hasDailySpeeds();
        org.junit.Assert.assertNotNull(doubleArrayOptional5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 35, 52]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        double[] doubleArray6 = new double[] { '#', 10.0d };
        double[] doubleArray9 = new double[] { '#', 10.0d };
        double[] doubleArray12 = new double[] { '#', 10.0d };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData15 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((-1), 100, doubleArray13, (int) (short) 10);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction16 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction17 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray13);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData19 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(144, (int) (short) 1936, doubleArray13, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction16);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction17);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction3 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction3, (int) (byte) 1);
        int int6 = premiumProfileBlobData5.getTimeResolutionMinutes();
        int int7 = premiumProfileBlobData5.getTimeResolutionMinutes();
        byte[] byteArray8 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter9 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter10 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData14 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray15 = premiumProfileBlobConverter11.toBinaryBlob(premiumProfileBlobData14);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData16 = premiumProfileBlobConverter10.fromBinaryBlob(byteArray15);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData17 = premiumProfileBlobConverter9.fromBinaryBlob(byteArray15);
        byte[] byteArray18 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData17);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction21 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData23 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction21, (int) (byte) 1);
        int int24 = premiumProfileBlobData23.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional26 = premiumProfileBlobData23.getDaySpeeds((int) (byte) 100);
        byte[] byteArray27 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData23);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction30 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData32 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction30, (int) (byte) 1);
        int int33 = premiumProfileBlobData32.getTimeResolutionMinutes();
        java.util.Optional<double[]> doubleArrayOptional35 = premiumProfileBlobData32.getDaySpeedsAsArray((int) ' ');
        boolean boolean37 = premiumProfileBlobData32.hasDaySpeeds((int) '#');
        int int38 = premiumProfileBlobData32.getWeekDaySpeed();
        int int39 = premiumProfileBlobData32.getWeekDaySpeed();
        byte[] byteArray40 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData32);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction43 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData45 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction43, (int) (byte) 1);
        int int46 = premiumProfileBlobData45.getTimeResolutionMinutes();
        byte[] byteArray47 = premiumProfileBlobConverter0.toBinaryBlob(premiumProfileBlobData45);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 52]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData16);
        org.junit.Assert.assertNotNull(premiumProfileBlobData17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 100, -112]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArrayOptional35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 52]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, 52]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 1, (int) 'a');
        boolean boolean3 = premiumProfileBlobData2.hasDailySpeeds();
        int int4 = premiumProfileBlobData2.getWeekendSpeed();
        int int5 = premiumProfileBlobData2.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        int int3 = premiumProfileBlobData2.getTimeResolutionMinutes();
        boolean boolean4 = premiumProfileBlobData2.hasDailySpeeds();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        double[] doubleArray8 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray13 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray18 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray23 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray28 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[] doubleArray33 = new double[] { 32.0d, 0.0d, 10L, 0L };
        double[][] doubleArray34 = new double[][] { doubleArray8, doubleArray13, doubleArray18, doubleArray23, doubleArray28, doubleArray33 };
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData36 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (byte) -1, doubleArray34, (int) (short) 968);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction37 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray34);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData39 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) 712, (int) (short) 1936, daySpeedsAccessorIntFunction37, (int) (short) 840);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[32.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction37);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction2 = null;
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData4 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData(0, (int) '4', daySpeedsAccessorIntFunction2, (int) (byte) 1);
        int int5 = premiumProfileBlobData4.getTimeResolutionMinutes();
        java.util.Optional<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorOptional7 = premiumProfileBlobData4.getDaySpeeds((int) ' ');
        int int8 = premiumProfileBlobData4.getWeekendSpeed();
        int int9 = premiumProfileBlobData4.getWeekDaySpeed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(daySpeedsAccessorOptional7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.lang.String str1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.toText((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        double[][] doubleArray4 = new double[][] {};
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction5 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction6 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) 'a', (int) (byte) -1, doubleArray4, 0);
        java.util.function.IntFunction<com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.DaySpeedsAccessor> daySpeedsAccessorIntFunction9 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData.arrayToSpeedsAccessor(doubleArray4);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData11 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (short) -16385, (int) (short) 1023, doubleArray4, (int) (short) 1023);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction5);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction6);
        org.junit.Assert.assertNotNull(daySpeedsAccessorIntFunction9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter0 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter1 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter premiumProfileBlobConverter2 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter();
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData5 = new com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData((int) (byte) 100, (int) (short) 400);
        byte[] byteArray6 = premiumProfileBlobConverter2.toBinaryBlob(premiumProfileBlobData5);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData7 = premiumProfileBlobConverter1.fromBinaryBlob(byteArray6);
        com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobData premiumProfileBlobData8 = premiumProfileBlobConverter0.fromBinaryBlob(byteArray6);
        int int9 = premiumProfileBlobData8.getTimeResolutionMinutes();
        int int10 = premiumProfileBlobData8.getWeekendSpeed();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -112]");
        org.junit.Assert.assertNotNull(premiumProfileBlobData7);
        org.junit.Assert.assertNotNull(premiumProfileBlobData8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 144 + "'", int10 == 144);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        double double1 = com.tomtom.traffic.iqr.io.premium.blob.PremiumProfileBlobConverter.asEncoded((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }
}

