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
        java.lang.Boolean[] booleanArray7 = new java.lang.Boolean[] { false, false, true, true, false, true };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.github.edgar615.util.base.MorePreconditions.checkAllArguments("", booleanArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = com.github.edgar615.util.base.EncryptUtils.encryptHMAC("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: java.security.NoSuchAlgorithmException: Algorithm  not available");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.io.File file0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.io.GzipJava.compressGZIP(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.sort.Sorts.heap(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabet((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.github.edgar615.util.reflect.ObjectProxyBuilder objectProxyBuilder0 = new com.github.edgar615.util.reflect.ObjectProxyBuilder();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = com.github.edgar615.util.io.IOUtils.createTempDirectory("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = com.github.edgar615.util.base.EncryptUtils.CHARSET_UTF8;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.sort.Sorts.selection(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float3 = com.github.edgar615.util.base.MapUtils.getFloat(strMap0, "hi!", (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        int int4 = com.github.edgar615.util.base.MorePreconditions.checkArgumentRange((int) (byte) 100, (int) '4', (int) (byte) 100, "UTF-8");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        int[] intArray1 = new int[] { (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.github.edgar615.util.base.MapUtils.getString(strMap0, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.io.IOUtils.copy(inputStream0, outputStream1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.beans.PropertyDescriptor propertyDescriptor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.reflect.BeanUtils.isWritable(propertyDescriptor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.github.edgar615.util.base.SemanticVersion.isAtLeastMajorMinor("", (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.github.edgar615.util.reflect.ReflectUtils.computeSignature(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.github.edgar615.util.collection.TreeNodeUtils treeNodeUtils0 = new com.github.edgar615.util.collection.TreeNodeUtils();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.github.edgar615.util.base.SemanticVersion.isAtLeast("UTF-8", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.Boolean[] booleanArray3 = new java.lang.Boolean[] { true, true };
        boolean boolean4 = com.github.edgar615.util.base.MorePreconditions.checkAnyArguments("", booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.base.Luhn.check("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.github.edgar615.util.base.MorePreconditions.checkNotNullOrEmpty("UTF-8", "");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.github.edgar615.util.base.SemanticVersion.isAtLeastMajorMinor("UTF-8", (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INVALID_SQL;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INVALID_SQL + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INVALID_SQL));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double3 = com.github.edgar615.util.base.MapUtils.getDouble(strMap0, "hi!", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.io.IOUtils.copy(inputStream0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.github.edgar615.util.uuid.UUIDFactory uUIDFactory0 = com.github.edgar615.util.uuid.UUIDFactory.defaultUUIDFactory();
        org.junit.Assert.assertNotNull(uUIDFactory0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.io.IOUtils.deleteFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.github.edgar615.util.base.Utils.LINE_SEPARATOR = "";
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomUpperAlphabet((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_UNAVAILABLE;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_UNAVAILABLE + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_UNAVAILABLE));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomLowerAlphabet((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable6 = com.github.edgar615.util.io.IOUtils.deserialize(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.io.StreamCorruptedException; message: invalid stream header: 64FF6464");
        } catch (java.io.StreamCorruptedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 100, 100, -1]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        int int4 = com.github.edgar615.util.base.MorePreconditions.checkArgumentRange((int) (short) 100, 1, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.github.edgar615.util.base.Utils.LINE_SEPARATOR = "UTF-8";
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.github.edgar615.util.search.MapPredicate mapPredicate0 = new com.github.edgar615.util.search.MapPredicate();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        int[] intArray0 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.sort.Sorts.counting(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        boolean boolean0 = com.github.edgar615.util.base.Utils.isWindows();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_EX;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_EX + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_EX));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str0 = com.github.edgar615.util.base.EncryptUtils.HMACSHA256;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HMACSHA256" + "'", str0, "HMACSHA256");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = com.github.edgar615.util.reflect.ReflectUtils.forName("CustomErrorCode{number=0, message='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: CustomErrorCode{number=0, message='hi!'}");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.EVENTBUS_REJECTED;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EVENTBUS_REJECTED + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.EVENTBUS_REJECTED));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INVALID_ARGS;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INVALID_ARGS + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INVALID_ARGS));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = defaultErrorCode1.asMap();
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.util.List<java.lang.String> strList2 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        java.util.stream.Stream<java.lang.String> strStream3 = strList2.parallelStream();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strStream3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.base.SemanticVersion semanticVersion1 = new com.github.edgar615.util.base.SemanticVersion("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN_LOGIN;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN_LOGIN + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN_LOGIN));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.NAME_PWD_INCORRECT;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.NAME_PWD_INCORRECT + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.NAME_PWD_INCORRECT));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode2 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray8 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray9 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray8;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration10 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray9);
        java.util.Enumeration[] enumerationArray12 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray13 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray12;
        objEnumerationArray13[0] = objCompoundEnumeration10;
        float[] floatArray19 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray19);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_21 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode2, shortArray6, objEnumerationArray13, (java.lang.Comparable<java.lang.String>) "hi!", floatArray19);
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(shortArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultErrorCode2 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode2.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray8);
        org.junit.Assert.assertNotNull(objEnumerationArray9);
        org.junit.Assert.assertNotNull(enumerationArray12);
        org.junit.Assert.assertNotNull(objEnumerationArray13);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_21);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.io.File file0 = null;
        boolean boolean1 = com.github.edgar615.util.io.IOUtils.forceDeletePath(file0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.RESOURCE_OCCUPIED;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.RESOURCE_OCCUPIED + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.RESOURCE_OCCUPIED));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INVALID_JSON;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INVALID_JSON + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INVALID_JSON));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode2 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray8 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray9 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray8;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration10 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray9);
        java.util.Enumeration[] enumerationArray12 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray13 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray12;
        objEnumerationArray13[0] = objCompoundEnumeration10;
        float[] floatArray19 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray19);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_21 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode2, shortArray6, objEnumerationArray13, (java.lang.Comparable<java.lang.String>) "hi!", floatArray19);
        float[] floatArray22 = strComparableTuple6_21.getT6();
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(floatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultErrorCode2 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode2.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray8);
        org.junit.Assert.assertNotNull(objEnumerationArray9);
        org.junit.Assert.assertNotNull(enumerationArray12);
        org.junit.Assert.assertNotNull(objEnumerationArray13);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0]");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.TOO_MANY_REQ;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.TOO_MANY_REQ + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.TOO_MANY_REQ));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha512("CustomErrorCode{number=0, message='hi!'}", "HMACSHA256");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1" + "'", str2, "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.github.edgar615.util.concurrent.OrderQueue orderQueue0 = new com.github.edgar615.util.concurrent.OrderQueue();
        java.lang.Runnable runnable1 = null;
        java.util.concurrent.Executor executor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            orderQueue0.execute(runnable1, executor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.NOT_YOUR_RESOURCE;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.NOT_YOUR_RESOURCE + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.NOT_YOUR_RESOURCE));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.base.Luhn.check("CustomErrorCode{number=0, message='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"'\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.concurrent.StripedLock stripedLock1 = com.github.edgar615.util.concurrent.StripedLock.create((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: storage power must be in [1..6]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.io.IOUtils.createNewDirectory(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        byte byte1 = com.github.edgar615.util.base.HexUtils.hexToByte("64");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        float[] floatArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            iteratorMergeSortAlgorithm0.sort(floatArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = com.github.edgar615.util.reflect.ReflectUtils.getProxiedObject(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.github.edgar615.util.base.MorePreconditions.checkNotNullOrEmpty("UTF-8", "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = com.github.edgar615.util.base.EncryptUtils.HMACSHA1;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HMACSHA1" + "'", str0, "HMACSHA1");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.base.SemanticVersion semanticVersion1 = new com.github.edgar615.util.base.SemanticVersion("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabet((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv" + "'", str1, "VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        boolean boolean1 = com.github.edgar615.util.net.IPUtils.isIPv6Address("64");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        long[] longArray7 = new long[] { (byte) 0, (short) -1, (short) 100, (-1), (short) -1 };
        com.github.edgar615.util.sort.Sorts.selection(longArray7);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(longArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[-1, -1, -1, 0, 100]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        int[] intArray3 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray3);
        com.github.edgar615.util.sort.Sorts.selection(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 1, 32]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        java.util.Enumeration[] enumerationArray22 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray23 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray22;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration24 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray23);
        boolean boolean25 = strComparableTuple6_20.equals((java.lang.Object) objCompoundEnumeration24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objCompoundEnumeration24.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(enumerationArray22);
        org.junit.Assert.assertNotNull(objEnumerationArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha256("UTF-8", "64");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" + "'", str2, "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.github.edgar615.util.collection.BoundedQueue<com.github.edgar615.util.search.MapPredicate> mapPredicateBoundedQueue1 = com.github.edgar615.util.collection.BoundedQueue.create((int) '4');
        org.junit.Assert.assertNotNull(mapPredicateBoundedQueue1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str1 = com.github.edgar615.util.base.StringUtils.underscoreName("HMACSHA1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h_m_a_c_s_h_a1" + "'", str1, "h_m_a_c_s_h_a1");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        int int4 = com.github.edgar615.util.base.MorePreconditions.checkArgumentRange(0, 0, 1, "VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.github.edgar615.util.search.Op op0 = com.github.edgar615.util.search.Op.GT;
        org.junit.Assert.assertTrue("'" + op0 + "' != '" + com.github.edgar615.util.search.Op.GT + "'", op0.equals(com.github.edgar615.util.search.Op.GT));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.github.edgar615.util.loadbalance.ProviderStrategy providerStrategy0 = com.github.edgar615.util.loadbalance.ProviderStrategy.random();
        com.github.edgar615.util.loadbalance.ServiceInstance[] serviceInstanceArray1 = new com.github.edgar615.util.loadbalance.ServiceInstance[] {};
        java.util.ArrayList<com.github.edgar615.util.loadbalance.ServiceInstance> serviceInstanceList2 = new java.util.ArrayList<com.github.edgar615.util.loadbalance.ServiceInstance>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.edgar615.util.loadbalance.ServiceInstance>) serviceInstanceList2, serviceInstanceArray1);
        com.github.edgar615.util.loadbalance.ServiceInstance serviceInstance4 = providerStrategy0.get((java.util.List<com.github.edgar615.util.loadbalance.ServiceInstance>) serviceInstanceList2);
        org.junit.Assert.assertNotNull(providerStrategy0);
        org.junit.Assert.assertNotNull(serviceInstanceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(serviceInstance4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str0 = com.github.edgar615.util.base.EncryptUtils.HMACMD5;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HMACMD5" + "'", str0, "HMACMD5");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.util.List<java.lang.String> strList2 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        com.github.edgar615.util.sort.Sorts.shell(strList2);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabetAndNum((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN" + "'", str1, "p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.github.edgar615.util.reflect.NullClassLoader nullClassLoader0 = com.github.edgar615.util.reflect.NullClassLoader.instance();
        java.net.URL uRL2 = nullClassLoader0.getResource("HMACSHA256");
        nullClassLoader0.setClassAssertionStatus("UTF-8", true);
        org.junit.Assert.assertNotNull(nullClassLoader0);
        org.junit.Assert.assertNull(uRL2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.util.List<java.net.InetAddress> inetAddressList0 = com.github.edgar615.util.net.NetUtils.getInetAddress();
        org.junit.Assert.assertNotNull(inetAddressList0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.github.edgar615.util.sort.HoareQuickSortAlgorithm hoareQuickSortAlgorithm0 = new com.github.edgar615.util.sort.HoareQuickSortAlgorithm();
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode2 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray8 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray9 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray8;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration10 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray9);
        java.util.Enumeration[] enumerationArray12 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray13 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray12;
        objEnumerationArray13[0] = objCompoundEnumeration10;
        float[] floatArray19 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray19);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_21 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode2, shortArray6, objEnumerationArray13, (java.lang.Comparable<java.lang.String>) "hi!", floatArray19);
        hoareQuickSortAlgorithm0.sort(floatArray19);
        org.junit.Assert.assertTrue("'" + defaultErrorCode2 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode2.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray8);
        org.junit.Assert.assertNotNull(objEnumerationArray9);
        org.junit.Assert.assertNotNull(enumerationArray12);
        org.junit.Assert.assertNotNull(objEnumerationArray13);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        int[] intArray2 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria4 = criteria0.equalsTo("64", (java.lang.Object) intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class [I");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = com.github.edgar615.util.base.MorePreconditions.checkArgumentRange((double) (byte) -1, (double) (short) 10, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1.0 must >=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList3 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm0.sort(strList3);
        int[] intArray5 = new int[] {};
        bubbleSortAlgorithm0.sort(intArray5);
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bubbleSortAlgorithm0.sort(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList12);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode16 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray20 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray22 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray23 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray22;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration24 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray23);
        java.util.Enumeration[] enumerationArray26 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray27 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray26;
        objEnumerationArray27[0] = objCompoundEnumeration24;
        float[] floatArray33 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray33);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_35 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode16, shortArray20, objEnumerationArray27, (java.lang.Comparable<java.lang.String>) "hi!", floatArray33);
        float[] floatArray36 = strComparableTuple6_35.getT6();
        com.github.edgar615.util.sort.Sorts.shell(floatArray36);
        boolean boolean38 = strList12.contains((java.lang.Object) floatArray36);
        java.util.stream.Stream<java.lang.String> strStream39 = strList12.parallelStream();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + defaultErrorCode16 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode16.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray22);
        org.junit.Assert.assertNotNull(objEnumerationArray23);
        org.junit.Assert.assertNotNull(enumerationArray26);
        org.junit.Assert.assertNotNull(objEnumerationArray27);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strStream39);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, long[]> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, long[]>();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        java.lang.String str0 = com.github.edgar615.util.search.Example.QUERY_SPLIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        long[] longArray5 = new long[] { ' ', ' ', '#' };
        com.github.edgar615.util.sort.Sorts.quick(longArray5);
        com.github.edgar615.util.sort.Sorts.heap(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(longArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[32, 32, 35]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.github.edgar615.util.sort.HoareQuickSortAlgorithm hoareQuickSortAlgorithm0 = new com.github.edgar615.util.sort.HoareQuickSortAlgorithm();
        int[] intArray4 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray4);
        hoareQuickSortAlgorithm0.sort(intArray4);
        com.github.edgar615.util.sort.Sorts.merge(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 32]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.io.Reader reader0 = null;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.io.IOUtils.copy(reader0, writer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode2 = com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_EXPIRED;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria3 = criteria0.equalsTo("", (java.lang.Object) defaultErrorCode2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertTrue("'" + defaultErrorCode2 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_EXPIRED + "'", defaultErrorCode2.equals(com.github.edgar615.util.exception.DefaultErrorCode.SERVICE_EXPIRED));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.github.edgar615.util.base.SemanticVersion.isAtLeast(":", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.io.File file0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.io.GzipJava.decompressGzip(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm0 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm1 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm2 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray3 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray3);
        iteratorMergeSortAlgorithm2.sort(charArray3);
        knuthShellSortAlgorithm1.sort(charArray3);
        knuthShellSortAlgorithm0.sort(charArray3);
        com.github.edgar615.util.sort.Sorts.bubble(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList3 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm0.sort(strList3);
        int[] intArray5 = new int[] {};
        bubbleSortAlgorithm0.sort(intArray5);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray11);
        bubbleSortAlgorithm0.sort(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = com.github.edgar615.util.io.IOUtils.deserialize(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.io.StreamCorruptedException; message: invalid stream header: FFFF000A");
        } catch (java.io.StreamCorruptedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, 0, 10]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str1 = com.github.edgar615.util.base.EncryptUtils.encryptMD5("HMACMD5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "737597DB72C1E0B26143D2D519E03B32" + "'", str1, "737597DB72C1E0B26143D2D519E03B32");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray5);
        bubbleSortAlgorithm0.sort(byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        java.lang.reflect.Method method9 = null;
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode11 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray15 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray17 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray18 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray17;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration19 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray18);
        java.util.Enumeration[] enumerationArray21 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray22 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray21;
        objEnumerationArray22[0] = objCompoundEnumeration19;
        float[] floatArray28 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray28);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_30 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode11, shortArray15, objEnumerationArray22, (java.lang.Comparable<java.lang.String>) "hi!", floatArray28);
        java.lang.Class[] classArray31 = com.github.edgar615.util.reflect.ReflectUtils.extractAllInterfaces((java.lang.Object) shortArray15);
        com.github.edgar615.util.interceptor.Invocation invocation32 = com.github.edgar615.util.interceptor.Invocation.create((java.lang.Object) wildcardClass8, method9, (java.lang.Object[]) classArray31);
        java.lang.Object[] objArray33 = invocation32.args();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + defaultErrorCode11 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode11.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray17);
        org.junit.Assert.assertNotNull(objEnumerationArray18);
        org.junit.Assert.assertNotNull(enumerationArray21);
        org.junit.Assert.assertNotNull(objEnumerationArray22);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_30);
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertNotNull(invocation32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[interface java.lang.Cloneable, interface java.io.Serializable]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[interface java.lang.Cloneable, interface java.io.Serializable]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = com.github.edgar615.util.base.HexUtils.hexToByte(":");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \":\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        java.lang.ClassLoader classLoader2 = java.lang.ClassLoader.getSystemClassLoader();
        com.github.edgar615.util.concurrent.OrderQueue orderQueue3 = new com.github.edgar615.util.concurrent.OrderQueue();
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria4 = criteria0.between("HMACMD5", (java.lang.Object) classLoader2, (java.lang.Object) orderQueue3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class sun.misc.Launcher$AppClassLoader");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertNotNull(classLoader2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.NULL;
        int int1 = defaultErrorCode0.getNumber();
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.NULL + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.NULL));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm2 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm3 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList6 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm3.sort(strList6);
        int[] intArray8 = new int[] {};
        bubbleSortAlgorithm3.sort(intArray8);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray14);
        bubbleSortAlgorithm3.sort(byteArray14);
        iteratorMergeSortAlgorithm2.sort(byteArray14);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode19 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray23 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray25 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray26 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray25;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration27 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray26);
        java.util.Enumeration[] enumerationArray29 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray30 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray29;
        objEnumerationArray30[0] = objCompoundEnumeration27;
        float[] floatArray36 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray36);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_38 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode19, shortArray23, objEnumerationArray30, (java.lang.Comparable<java.lang.String>) "hi!", floatArray36);
        java.lang.Class[] classArray39 = com.github.edgar615.util.reflect.ReflectUtils.extractAllInterfaces((java.lang.Object) shortArray23);
        iteratorMergeSortAlgorithm2.sort(shortArray23);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(shortArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode19 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode19.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray25);
        org.junit.Assert.assertNotNull(objEnumerationArray26);
        org.junit.Assert.assertNotNull(enumerationArray29);
        org.junit.Assert.assertNotNull(objEnumerationArray30);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_38);
        org.junit.Assert.assertNotNull(classArray39);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        com.github.edgar615.util.sort.LomutoQuickSortAlgorithm lomutoQuickSortAlgorithm2 = new com.github.edgar615.util.sort.LomutoQuickSortAlgorithm();
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria3 = criteria0.lessThanOrEqualTo("4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", (java.lang.Object) lomutoQuickSortAlgorithm2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class com.github.edgar615.util.sort.LomutoQuickSortAlgorithm");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        org.slf4j.Logger logger0 = com.github.edgar615.util.reflect.ReflectUtils.LOGGER;
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode3 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray7 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray9 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray10 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray9;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration11 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray10);
        java.util.Enumeration[] enumerationArray13 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray14 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray13;
        objEnumerationArray14[0] = objCompoundEnumeration11;
        float[] floatArray20 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray20);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_22 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode3, shortArray7, objEnumerationArray14, (java.lang.Comparable<java.lang.String>) "hi!", floatArray20);
        float[] floatArray23 = strComparableTuple6_22.getT6();
        com.github.edgar615.util.sort.Sorts.shell(floatArray23);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(floatArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultErrorCode3 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode3.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray9);
        org.junit.Assert.assertNotNull(objEnumerationArray10);
        org.junit.Assert.assertNotNull(enumerationArray13);
        org.junit.Assert.assertNotNull(objEnumerationArray14);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_22);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.github.edgar615.util.base.MorePreconditions.checkArgumentRange((int) (byte) 10, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 10 must <=-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.NULL;
        com.github.edgar615.util.concurrent.OrderQueue orderQueue2 = new com.github.edgar615.util.concurrent.OrderQueue();
        com.github.edgar615.util.collection.Tuple3<java.lang.Enum<com.github.edgar615.util.exception.DefaultErrorCode>, java.lang.String, com.github.edgar615.util.concurrent.OrderQueue> defaultErrorCodeEnumTuple3_3 = com.github.edgar615.util.collection.Tuple3.create((java.lang.Enum<com.github.edgar615.util.exception.DefaultErrorCode>) defaultErrorCode0, "", orderQueue2);
        java.lang.String str4 = defaultErrorCodeEnumTuple3_3.getT2();
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.NULL + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.NULL));
        org.junit.Assert.assertNotNull(defaultErrorCodeEnumTuple3_3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        java.util.Enumeration[] enumerationArray22 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray23 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray22;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration24 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray23);
        boolean boolean25 = strComparableTuple6_20.equals((java.lang.Object) objCompoundEnumeration24);
        boolean boolean26 = objCompoundEnumeration24.hasMoreElements();
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(enumerationArray22);
        org.junit.Assert.assertNotNull(objEnumerationArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomLowerAlphabet(1000);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yophnpoemlpfjxwomlejolcbpwyaktaklhbujqhocfumrqrscdplxhrcuhzfdblxzedwnrnriyrnpqronxdatlktcxrlbmgzrycwmcnntbrrtxatlaltzzrddeobtfcbbrxzrwmjpifkrhuwpilplvbifsasmpxcudkbbztiageuiicdszrtxpmtxqanbrgqpohmsyiidiudbepprssqcbdfktmubbpreyroemresfyjwbxcqlkhchflsopsrbmacpuxnbfmcflnnjpdajeoygxluiooixovbbmasbbnbwobwawnmxvbbkebhbzddryobtfawcjnimvplqqioajwiehkgbmooejtkftatxiptowitiyrflbfbbtwybhrsznoxnnlmtacwgucwvilirtyzawpdlxoojggcwgdwoadpbtdfwwrbfmkuqwecewvqemxehwhsqmowrnwiffuplxuzjejtwagtjcjtxpekkzevyxfgsshgsijhwihlwvgzcllmaqfwggelvjgfdqghxbvfqipymattmnigrhwlcseitovymelofdltqwnjyokresutzdzawxjmxotxrcbdszdqwgczggiepiiukdrlixzozdhteglyjnabhnzhqliqglcmijngnbinftnclbbblwykofeppqlaxpngzyesonoeswmtxnfeoywxzxdxwyakaendvnpwmxtchayobprifozlscbrxlvgucsbwtalwiuesbiydzvotksnsvfebgvafuwnzsmvqvoowdzwezuwdtfeaubgniriobgbynjfbderdpznqmkstnekaiakyphjidzbnsakgpkavjbqgrleqtgafyaxevwzqoetnfyyymrznwiaayvtsruxmfwhvqjcporcmrmdvulbppyphcekzqzxbulyyrozhdvgmeqisnkhpwufvgeazhoebhlyuxpwyxsxxhjdykogzkaiafzspuiqwhnybcxsbnucncsnpgy" + "'", str1, "yophnpoemlpfjxwomlejolcbpwyaktaklhbujqhocfumrqrscdplxhrcuhzfdblxzedwnrnriyrnpqronxdatlktcxrlbmgzrycwmcnntbrrtxatlaltzzrddeobtfcbbrxzrwmjpifkrhuwpilplvbifsasmpxcudkbbztiageuiicdszrtxpmtxqanbrgqpohmsyiidiudbepprssqcbdfktmubbpreyroemresfyjwbxcqlkhchflsopsrbmacpuxnbfmcflnnjpdajeoygxluiooixovbbmasbbnbwobwawnmxvbbkebhbzddryobtfawcjnimvplqqioajwiehkgbmooejtkftatxiptowitiyrflbfbbtwybhrsznoxnnlmtacwgucwvilirtyzawpdlxoojggcwgdwoadpbtdfwwrbfmkuqwecewvqemxehwhsqmowrnwiffuplxuzjejtwagtjcjtxpekkzevyxfgsshgsijhwihlwvgzcllmaqfwggelvjgfdqghxbvfqipymattmnigrhwlcseitovymelofdltqwnjyokresutzdzawxjmxotxrcbdszdqwgczggiepiiukdrlixzozdhteglyjnabhnzhqliqglcmijngnbinftnclbbblwykofeppqlaxpngzyesonoeswmtxnfeoywxzxdxwyakaendvnpwmxtchayobprifozlscbrxlvgucsbwtalwiuesbiydzvotksnsvfebgvafuwnzsmvqvoowdzwezuwdtfeaubgniriobgbynjfbderdpznqmkstnekaiakyphjidzbnsakgpkavjbqgrleqtgafyaxevwzqoetnfyyymrznwiaayvtsruxmfwhvqjcporcmrmdvulbppyphcekzqzxbulyyrozhdvgmeqisnkhpwufvgeazhoebhlyuxpwyxsxxhjdykogzkaiafzspuiqwhnybcxsbnucncsnpgy");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.github.edgar615.util.base.SemanticVersion.isAtLeast(":", "yophnpoemlpfjxwomlejolcbpwyaktaklhbujqhocfumrqrscdplxhrcuhzfdblxzedwnrnriyrnpqronxdatlktcxrlbmgzrycwmcnntbrrtxatlaltzzrddeobtfcbbrxzrwmjpifkrhuwpilplvbifsasmpxcudkbbztiageuiicdszrtxpmtxqanbrgqpohmsyiidiudbepprssqcbdfktmubbpreyroemresfyjwbxcqlkhchflsopsrbmacpuxnbfmcflnnjpdajeoygxluiooixovbbmasbbnbwobwawnmxvbbkebhbzddryobtfawcjnimvplqqioajwiehkgbmooejtkftatxiptowitiyrflbfbbtwybhrsznoxnnlmtacwgucwvilirtyzawpdlxoojggcwgdwoadpbtdfwwrbfmkuqwecewvqemxehwhsqmowrnwiffuplxuzjejtwagtjcjtxpekkzevyxfgsshgsijhwihlwvgzcllmaqfwggelvjgfdqghxbvfqipymattmnigrhwlcseitovymelofdltqwnjyokresutzdzawxjmxotxrcbdszdqwgczggiepiiukdrlixzozdhteglyjnabhnzhqliqglcmijngnbinftnclbbblwykofeppqlaxpngzyesonoeswmtxnfeoywxzxdxwyakaendvnpwmxtchayobprifozlscbrxlvgucsbwtalwiuesbiydzvotksnsvfebgvafuwnzsmvqvoowdzwezuwdtfeaubgniriobgbynjfbderdpznqmkstnekaiakyphjidzbnsakgpkavjbqgrleqtgafyaxevwzqoetnfyyymrznwiaayvtsruxmfwhvqjcporcmrmdvulbppyphcekzqzxbulyyrozhdvgmeqisnkhpwufvgeazhoebhlyuxpwyxsxxhjdykogzkaiafzspuiqwhnybcxsbnucncsnpgy");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Version number is not semantic. Should be in the format d.d.d. See http://semver.org");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        boolean boolean1 = com.github.edgar615.util.base.StringUtils.isAlpha("VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        char[] charArray16 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray16);
        iteratorMergeSortAlgorithm0.sort(charArray16);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode20 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray24 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray26 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray27 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray26;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration28 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray27);
        java.util.Enumeration[] enumerationArray30 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray31 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray30;
        objEnumerationArray31[0] = objCompoundEnumeration28;
        float[] floatArray37 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray37);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_39 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode20, shortArray24, objEnumerationArray31, (java.lang.Comparable<java.lang.String>) "hi!", floatArray37);
        iteratorMergeSortAlgorithm0.sort(floatArray37);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode20 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode20.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray26);
        org.junit.Assert.assertNotNull(objEnumerationArray27);
        org.junit.Assert.assertNotNull(enumerationArray30);
        org.junit.Assert.assertNotNull(objEnumerationArray31);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_39);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String[] strArray5 = new java.lang.String[] { "737597DB72C1E0B26143D2D519E03B32", "VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv", ":", "HMACSHA256", "h_m_a_c_s_h_a1" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        int[] intArray14 = new int[] { 1, (byte) 1, (byte) -1, 100, (byte) -1, 1 };
        int[] intArray21 = new int[] { 1, (byte) 1, (byte) -1, 100, (byte) -1, 1 };
        int[] intArray28 = new int[] { 1, (byte) 1, (byte) -1, 100, (byte) -1, 1 };
        int[] intArray35 = new int[] { 1, (byte) 1, (byte) -1, 100, (byte) -1, 1 };
        int[] intArray42 = new int[] { 1, (byte) 1, (byte) -1, 100, (byte) -1, 1 };
        int[][] intArray43 = new int[][] { intArray14, intArray21, intArray28, intArray35, intArray42 };
        // The following exception was thrown during execution in test generation
        try {
            int[][] intArray44 = strList6.toArray(intArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1, -1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1, -1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1, -1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[1, 1, -1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1, 1, -1, 100, -1, 1]");
        org.junit.Assert.assertNotNull(intArray43);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray7 = new int[] {};
        bubbleSortAlgorithm2.sort(intArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm2.sort(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria16 = criteria0.equalsTo("VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv", (java.lang.Object) bubbleSortAlgorithm2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class com.github.edgar615.util.sort.BubbleSortAlgorithm");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray7 = new int[] {};
        bubbleSortAlgorithm2.sort(intArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm2.sort(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.github.edgar615.util.base.Luhn.generateCheckNum("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"N\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.github.edgar615.util.loadbalance.ProviderStrategy providerStrategy0 = com.github.edgar615.util.loadbalance.ProviderStrategy.roundRobin();
        org.junit.Assert.assertNotNull(providerStrategy0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.github.edgar615.util.base.AntPathMatcher.Builder builder0 = new com.github.edgar615.util.base.AntPathMatcher.Builder();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder2 = builder0.withPathSeparator('#');
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm0 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str3 = com.github.edgar615.util.base.EncryptUtils.byte2hex(byteArray2);
        selectionSortAlgorithm0.sort(byteArray2);
        int[] intArray8 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray8);
        selectionSortAlgorithm0.sort(intArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 32]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        java.lang.String[] strArray3 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        double[] doubleArray11 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray11);
        boolean boolean13 = strList4.contains((java.lang.Object) doubleArray11);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList14 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long15 = opLinkedSkipList14.size();
        com.github.edgar615.util.search.Op op16 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj17 = opLinkedSkipList14.remove(op16);
        boolean boolean18 = strList4.contains(obj17);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort((java.util.List<java.lang.String>) strList4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + op16 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op16.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray4);
        com.github.edgar615.util.sort.Sorts.bubble(byteArray4);
        com.github.edgar615.util.sort.Sorts.heap(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 0, 10]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.github.edgar615.util.net.IPUtils.numberToIPv6(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String[] strArray1 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        double[] doubleArray9 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray9);
        boolean boolean11 = strList2.contains((java.lang.Object) doubleArray9);
        com.github.edgar615.util.sort.Sorts.selection(doubleArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomAlphabet((int) (byte) 1);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "E" + "'", str1, "E");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        char[] charArray16 = new char[] {};
        iteratorMergeSortAlgorithm0.sort(charArray16);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        com.github.edgar615.util.sort.HoareQuickSortAlgorithm hoareQuickSortAlgorithm1 = new com.github.edgar615.util.sort.HoareQuickSortAlgorithm();
        int[] intArray5 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray5);
        hoareQuickSortAlgorithm1.sort(intArray5);
        double[] doubleArray13 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray13);
        com.github.edgar615.util.sort.Sorts.selection(doubleArray13);
        hoareQuickSortAlgorithm1.sort(doubleArray13);
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1, 32]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.sort.Sorts.quick(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.github.edgar615.util.search.Op op0 = com.github.edgar615.util.search.Op.LT;
        org.junit.Assert.assertTrue("'" + op0 + "' != '" + com.github.edgar615.util.search.Op.LT + "'", op0.equals(com.github.edgar615.util.search.Op.LT));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.github.edgar615.util.reflect.ReflectionException reflectionException1 = new com.github.edgar615.util.reflect.ReflectionException("hi!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = com.github.edgar615.util.reflect.BeanUtils.toMap((java.lang.Object) 10);
        java.lang.Integer int3 = com.github.edgar615.util.base.MapUtils.getInteger(strMap1, "HMACMD5");
        java.lang.Boolean boolean6 = com.github.edgar615.util.base.MapUtils.getBoolean(strMap1, "HMACSHA1", (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm0 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm1 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm2 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray3 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray3);
        iteratorMergeSortAlgorithm2.sort(charArray3);
        knuthShellSortAlgorithm1.sort(charArray3);
        knuthShellSortAlgorithm0.sort(charArray3);
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm8 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm9 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm10 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList13 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm10.sort(strList13);
        int[] intArray15 = new int[] {};
        bubbleSortAlgorithm10.sort(intArray15);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray21);
        bubbleSortAlgorithm10.sort(byteArray21);
        iteratorMergeSortAlgorithm9.sort(byteArray21);
        char[] charArray25 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray25);
        iteratorMergeSortAlgorithm9.sort(charArray25);
        shellSortAlgorithm8.sort(charArray25);
        knuthShellSortAlgorithm0.sort(charArray25);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.github.edgar615.util.base.Utils.LINE_SEPARATOR = "hi!";
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm2 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm3 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList6 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm3.sort(strList6);
        int[] intArray8 = new int[] {};
        bubbleSortAlgorithm3.sort(intArray8);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray14);
        bubbleSortAlgorithm3.sort(byteArray14);
        iteratorMergeSortAlgorithm2.sort(byteArray14);
        char[] charArray18 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray18);
        iteratorMergeSortAlgorithm2.sort(charArray18);
        long[] longArray26 = new long[] { (byte) 0, (short) -1, (short) 100, (-1), (short) -1 };
        com.github.edgar615.util.sort.Sorts.selection(longArray26);
        iteratorMergeSortAlgorithm2.sort(longArray26);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria29 = criteria0.notEqualsTo("4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", (java.lang.Object) iteratorMergeSortAlgorithm2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class com.github.edgar615.util.sort.IteratorMergeSortAlgorithm");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, -1, -1, 0, 100]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList1 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList2 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op3 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj4 = opLinkedSkipList2.remove(op3);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode6 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray10 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray12 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray13 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray12;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration14 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray13);
        java.util.Enumeration[] enumerationArray16 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray17 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray16;
        objEnumerationArray17[0] = objCompoundEnumeration14;
        float[] floatArray23 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray23);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_25 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode6, shortArray10, objEnumerationArray17, (java.lang.Comparable<java.lang.String>) "hi!", floatArray23);
        short[] shortArray26 = strComparableTuple6_25.getT3();
        java.lang.Object obj27 = opLinkedSkipList1.add(op3, (java.lang.Object) shortArray26);
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(shortArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + op3 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op3.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + defaultErrorCode6 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode6.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray10), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray12);
        org.junit.Assert.assertNotNull(objEnumerationArray13);
        org.junit.Assert.assertNotNull(enumerationArray16);
        org.junit.Assert.assertNotNull(objEnumerationArray17);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_25);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        int[] intArray0 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray0);
        com.github.edgar615.util.sort.Sorts.quick(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = defaultErrorCode0.asMap();
        java.lang.Double double3 = com.github.edgar615.util.base.MapUtils.getDouble(strMap1, "737597DB72C1E0B26143D2D519E03B32");
        java.lang.Double double5 = com.github.edgar615.util.base.MapUtils.getDouble(strMap1, "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1");
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE));
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(double3);
        org.junit.Assert.assertNull(double5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.UPLOAD_FILE_EMPTY;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.UPLOAD_FILE_EMPTY + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.UPLOAD_FILE_EMPTY));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.github.edgar615.util.concurrent.NamedThreadFactory namedThreadFactory1 = com.github.edgar615.util.concurrent.NamedThreadFactory.create("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
        java.lang.Runnable runnable2 = null;
        java.lang.Thread thread3 = namedThreadFactory1.newThread(runnable2);
        org.junit.Assert.assertNotNull(namedThreadFactory1);
        org.junit.Assert.assertNotNull(thread3);
        org.junit.Assert.assertEquals(thread3.toString(), "Thread[p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN-0,5,main]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList3 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm0.sort(strList3);
        com.github.edgar615.util.base.MorePreconditions.checkNotEmpty((java.util.Collection<java.lang.String>) strList3, "UTF-8");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.github.edgar615.util.collection.BoundedQueue<java.util.Set<java.lang.reflect.Method>> methodSetBoundedQueue1 = com.github.edgar615.util.collection.BoundedQueue.create((int) (short) 10);
        org.junit.Assert.assertNotNull(methodSetBoundedQueue1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long1 = opLinkedSkipList0.size();
        com.github.edgar615.util.search.Op op2 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj3 = opLinkedSkipList0.remove(op2);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList4 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op5 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj6 = opLinkedSkipList4.get(op5);
        com.github.edgar615.util.search.Op op7 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj8 = opLinkedSkipList4.remove(op7);
        java.lang.Object obj9 = opLinkedSkipList0.remove(op7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + op2 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op2.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + op5 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op5.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + op7 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op7.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE_TOKEN;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE_TOKEN + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE_TOKEN));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.github.edgar615.util.reflect.ReflectionException reflectionException1 = new com.github.edgar615.util.reflect.ReflectionException("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
        java.lang.String str2 = reflectionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.github.edgar615.util.reflect.ReflectionException: p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN" + "'", str2, "com.github.edgar615.util.reflect.ReflectionException: p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        char[] charArray0 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray0);
        com.github.edgar615.util.sort.Sorts.insert(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        java.lang.Class[] classArray21 = com.github.edgar615.util.reflect.ReflectUtils.extractAllInterfaces((java.lang.Object) shortArray5);
        com.github.edgar615.util.sort.Sorts.quick(shortArray5);
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(classArray21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.github.edgar615.util.base.Utils.LINE_SEPARATOR = ":";
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.util.Enumeration[] enumerationArray1 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray2 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray1;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration3 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray2);
        boolean boolean4 = objCompoundEnumeration3.hasMoreElements();
        org.junit.Assert.assertNotNull(enumerationArray1);
        org.junit.Assert.assertNotNull(objEnumerationArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String[] strArray1 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        double[] doubleArray9 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray9);
        boolean boolean11 = strList2.contains((java.lang.Object) doubleArray9);
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        double[] doubleArray21 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray21);
        iteratorMergeSortAlgorithm0.sort(doubleArray21);
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm24 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        long[] longArray25 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray25);
        heapSortAlgorithm24.sort(longArray25);
        iteratorMergeSortAlgorithm0.sort(longArray25);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.github.edgar615.util.reflect.ReflectionException reflectionException2 = new com.github.edgar615.util.reflect.ReflectionException("A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC");
        com.github.edgar615.util.reflect.ReflectionException reflectionException3 = new com.github.edgar615.util.reflect.ReflectionException("737597DB72C1E0B26143D2D519E03B32", (java.lang.Throwable) reflectionException2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.beans.PropertyDescriptor propertyDescriptor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.reflect.BeanUtils.isReadable(propertyDescriptor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.String str1 = com.github.edgar615.util.base.Luhn.generate("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        short[] shortArray21 = strComparableTuple6_20.getT3();
        com.github.edgar615.util.sort.Sorts.bubble(shortArray21);
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 10, 100]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = com.github.edgar615.util.base.EncryptUtils.hex2byte("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str1 = com.github.edgar615.util.base.HexUtils.byteToHex((byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01" + "'", str1, "01");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        boolean boolean1 = com.github.edgar615.util.base.StringUtils.isAlpha("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.github.edgar615.util.concurrent.IdentificationExtractor<com.github.edgar615.util.sort.HoareQuickSortAlgorithm> hoareQuickSortAlgorithmIdentificationExtractor0 = null;
        com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.sort.HoareQuickSortAlgorithm> hoareQuickSortAlgorithmSequentialQueue2 = new com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.sort.HoareQuickSortAlgorithm>(hoareQuickSortAlgorithmIdentificationExtractor0, (int) (byte) 10);
        int int3 = hoareQuickSortAlgorithmSequentialQueue2.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = com.github.edgar615.util.reflect.ReflectUtils.forName("HMACSHA1");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: HMACSHA1");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.github.edgar615.util.loadbalance.ProviderStrategy providerStrategy0 = com.github.edgar615.util.loadbalance.ProviderStrategy.weightRoundRobin();
        com.github.edgar615.util.loadbalance.ServiceInstance[] serviceInstanceArray1 = new com.github.edgar615.util.loadbalance.ServiceInstance[] {};
        java.util.ArrayList<com.github.edgar615.util.loadbalance.ServiceInstance> serviceInstanceList2 = new java.util.ArrayList<com.github.edgar615.util.loadbalance.ServiceInstance>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.github.edgar615.util.loadbalance.ServiceInstance>) serviceInstanceList2, serviceInstanceArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.loadbalance.ServiceInstance serviceInstance4 = providerStrategy0.get((java.util.List<com.github.edgar615.util.loadbalance.ServiceInstance>) serviceInstanceList2);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: No value present");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(providerStrategy0);
        org.junit.Assert.assertNotNull(serviceInstanceArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.github.edgar615.util.exception.CustomErrorCode customErrorCode2 = com.github.edgar615.util.exception.CustomErrorCode.create(0, "hi!");
        java.lang.String str3 = customErrorCode2.toString();
        int int4 = customErrorCode2.getNumber();
        org.junit.Assert.assertNotNull(customErrorCode2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CustomErrorCode{number=0, message='hi!'}" + "'", str3, "CustomErrorCode{number=0, message='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = com.github.edgar615.util.reflect.ReflectUtils.forName("");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.Class class0 = null;
        com.github.edgar615.util.reflect.NullClassLoader nullClassLoader1 = com.github.edgar615.util.reflect.NullClassLoader.instance();
        java.net.URL uRL3 = nullClassLoader1.getResource("HMACSHA256");
        java.lang.Class class4 = com.github.edgar615.util.reflect.ReflectUtils.forName(class0, (java.lang.ClassLoader) nullClassLoader1);
        java.lang.ClassLoader classLoader5 = nullClassLoader1.getParent();
        org.junit.Assert.assertNotNull(nullClassLoader1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(classLoader5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm0 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm1 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray2 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray2);
        iteratorMergeSortAlgorithm1.sort(charArray2);
        knuthShellSortAlgorithm0.sort(charArray2);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm6 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray11);
        bubbleSortAlgorithm6.sort(byteArray11);
        knuthShellSortAlgorithm0.sort(byteArray11);
        java.util.List<java.lang.String> strList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            knuthShellSortAlgorithm0.sort(strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, -1, 0, 10]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList3 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm0.sort(strList3);
        int[] intArray5 = new int[] {};
        bubbleSortAlgorithm0.sort(intArray5);
        com.github.edgar615.util.sort.Sorts.heap(intArray5);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.github.edgar615.util.concurrent.IdentificationExtractor<com.github.edgar615.util.sort.HoareQuickSortAlgorithm> hoareQuickSortAlgorithmIdentificationExtractor0 = null;
        com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.sort.HoareQuickSortAlgorithm> hoareQuickSortAlgorithmSequentialQueue1 = new com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.sort.HoareQuickSortAlgorithm>(hoareQuickSortAlgorithmIdentificationExtractor0);
        com.github.edgar615.util.sort.HoareQuickSortAlgorithm hoareQuickSortAlgorithm2 = new com.github.edgar615.util.sort.HoareQuickSortAlgorithm();
        // The following exception was thrown during execution in test generation
        try {
            hoareQuickSortAlgorithmSequentialQueue1.enqueue(hoareQuickSortAlgorithm2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.util.Enumeration[] enumerationArray1 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray2 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray1;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration3 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = objCompoundEnumeration3.nextElement();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(enumerationArray1);
        org.junit.Assert.assertNotNull(objEnumerationArray2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.github.edgar615.util.concurrent.IdentificationExtractor<com.github.edgar615.util.search.Criteria> criteriaIdentificationExtractor0 = null;
        com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.search.Criteria> criteriaSequentialQueue2 = new com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.search.Criteria>(criteriaIdentificationExtractor0, (int) (short) 100);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray10 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray10);
        com.github.edgar615.util.sort.Sorts.merge(intArray10);
        bubbleSortAlgorithm2.sort(intArray10);
        bucketSortAlgorithm1.sort(intArray10);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList27);
        com.github.edgar615.util.base.MorePreconditions.checkNoNullElements((java.util.AbstractList<java.lang.String>) strList27, ":");
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort((java.util.List<java.lang.String>) strList27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 32]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        short[] shortArray21 = strComparableTuple6_20.getT3();
        com.github.edgar615.util.sort.Sorts.quick(shortArray21);
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 10, 100]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.github.edgar615.util.collection.TreeNode treeNode0 = null;
        java.util.function.Consumer<com.github.edgar615.util.collection.TreeNode> treeNodeConsumer1 = null;
        com.github.edgar615.util.collection.TreeNodeUtils.levelTraverse(treeNode0, treeNodeConsumer1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.github.edgar615.util.base.Luhn luhn0 = new com.github.edgar615.util.base.Luhn();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList12);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode16 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray20 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray22 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray23 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray22;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration24 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray23);
        java.util.Enumeration[] enumerationArray26 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray27 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray26;
        objEnumerationArray27[0] = objCompoundEnumeration24;
        float[] floatArray33 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray33);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_35 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode16, shortArray20, objEnumerationArray27, (java.lang.Comparable<java.lang.String>) "hi!", floatArray33);
        float[] floatArray36 = strComparableTuple6_35.getT6();
        com.github.edgar615.util.sort.Sorts.shell(floatArray36);
        boolean boolean38 = strList12.contains((java.lang.Object) floatArray36);
        com.github.edgar615.util.sort.Sorts.quick(floatArray36);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + defaultErrorCode16 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode16.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray22);
        org.junit.Assert.assertNotNull(objEnumerationArray23);
        org.junit.Assert.assertNotNull(enumerationArray26);
        org.junit.Assert.assertNotNull(objEnumerationArray27);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.MISSING_ARGS;
        java.lang.String str1 = defaultErrorCode0.toString();
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.MISSING_ARGS + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.MISSING_ARGS));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DefaultErrorCode{number=1008, message='Incomplete Parameter'}" + "'", str1, "DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm0 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray6);
        bubbleSortAlgorithm1.sort(byteArray6);
        shellSortAlgorithm0.sort(byteArray6);
        short[] shortArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            shellSortAlgorithm0.sort(shortArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 10]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        short[] shortArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(shortArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.getCode((int) ' ');
        org.junit.Assert.assertNull(defaultErrorCode1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        long[] longArray1 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray1);
        heapSortAlgorithm0.sort(longArray1);
        com.github.edgar615.util.sort.Sorts.heap(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.beans.PropertyDescriptor propertyDescriptor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.github.edgar615.util.reflect.BeanUtils.isFullyAccessible(propertyDescriptor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        long[] longArray2 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray2);
        com.github.edgar615.util.sort.Sorts.selection(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(longArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.github.edgar615.util.base.AntPathMatcher.Builder builder0 = new com.github.edgar615.util.base.AntPathMatcher.Builder();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder1 = builder0.withMatchStart();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder2 = builder0.withMatchStart();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder3 = builder2.withTrimTokens();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder4 = builder2.withIgnoreCase();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomNumber(100);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3617925919717533676448998194328724624187624369297141841896246961789144318223582433797791657538563474" + "'", str1, "3617925919717533676448998194328724624187624369297141841896246961789144318223582433797791657538563474");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder2 = new com.github.edgar615.util.base.AntPathMatcher.Builder();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder3 = builder2.withMatchStart();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder4 = builder2.withMatchStart();
        com.github.edgar615.util.base.AntPathMatcher.Builder builder5 = builder4.withIgnoreCase();
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria6 = criteria0.greaterThanOrEqualTo("h_m_a_c_s_h_a1", (java.lang.Object) builder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class com.github.edgar615.util.base.AntPathMatcher$Builder");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.lang.String[] strArray2 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        double[] doubleArray10 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray10);
        boolean boolean12 = strList3.contains((java.lang.Object) doubleArray10);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList13 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long14 = opLinkedSkipList13.size();
        com.github.edgar615.util.search.Op op15 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj16 = opLinkedSkipList13.remove(op15);
        boolean boolean17 = strList3.contains(obj16);
        bubbleSortAlgorithm0.sort((java.util.List<java.lang.String>) strList3);
        int[] intArray19 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray19);
        com.github.edgar615.util.sort.Sorts.bubble(intArray19);
        bubbleSortAlgorithm0.sort(intArray19);
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm23 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm24 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm25 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList28 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm25.sort(strList28);
        int[] intArray30 = new int[] {};
        bubbleSortAlgorithm25.sort(intArray30);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray36);
        bubbleSortAlgorithm25.sort(byteArray36);
        iteratorMergeSortAlgorithm24.sort(byteArray36);
        char[] charArray40 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray40);
        iteratorMergeSortAlgorithm24.sort(charArray40);
        shellSortAlgorithm23.sort(charArray40);
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray48);
        shellSortAlgorithm23.sort(byteArray48);
        bubbleSortAlgorithm0.sort(byteArray48);
        com.github.edgar615.util.sort.Sorts.bubble(byteArray48);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + op15 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op15.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1, -1, 0, 10]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op1 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj2 = opLinkedSkipList0.get(op1);
        com.github.edgar615.util.search.Op op3 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj4 = opLinkedSkipList0.remove(op3);
        byte[] byteArray5 = com.github.edgar615.util.io.IOUtils.serialize(op3);
        com.github.edgar615.util.sort.Sorts.selection(byteArray5);
        org.junit.Assert.assertTrue("'" + op1 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op1.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + op3 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op3.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-84, -19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 5, 14, 18, 18, 34, 46, 46, 46, 46, 46, 46, 46, 49, 53, 54, 69, 69, 76, 79, 97, 97, 97, 97, 97, 98, 99, 99, 100, 101, 101, 103, 103, 103, 104, 104, 105, 105, 106, 108, 108, 109, 109, 110, 110, 111, 112, 112, 114, 114, 114, 114, 115, 116, 116, 116, 117, 117, 117, 118, 120, 120, 126]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double2 = com.github.edgar615.util.base.MapUtils.getDouble(strMap0, "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INVALID_REQ;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INVALID_REQ + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INVALID_REQ));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.github.edgar615.util.sort.LomutoQuickSortAlgorithm lomutoQuickSortAlgorithm0 = new com.github.edgar615.util.sort.LomutoQuickSortAlgorithm();
        int[] intArray2 = new int[] { (byte) 10 };
        lomutoQuickSortAlgorithm0.sort(intArray2);
        float[] floatArray6 = new float[] { 100, 1000 };
        lomutoQuickSortAlgorithm0.sort(floatArray6);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList20);
        com.github.edgar615.util.base.MorePreconditions.checkIndex((java.util.Collection<java.lang.String>) strList20, (int) (byte) 10);
        lomutoQuickSortAlgorithm0.sort((java.util.List<java.lang.String>) strList20);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 1000.0]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.github.edgar615.util.serialization.SerDeException serDeException1 = new com.github.edgar615.util.serialization.SerDeException();
        com.github.edgar615.util.reflect.ReflectionException reflectionException2 = new com.github.edgar615.util.reflect.ReflectionException("UTF-8", (java.lang.Throwable) serDeException1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        heapSortAlgorithm0.sort(strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.util.Enumeration<java.net.URL> uRLEnumeration1 = java.lang.ClassLoader.getSystemResources("UTF-8");
        org.junit.Assert.assertNotNull(uRLEnumeration1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm0 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray5);
        com.github.edgar615.util.sort.Sorts.bubble(byteArray5);
        selectionSortAlgorithm0.sort(byteArray5);
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm9 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        long[] longArray10 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray10);
        heapSortAlgorithm9.sort(longArray10);
        selectionSortAlgorithm0.sort(longArray10);
        short[] shortArray15 = new short[] { (short) 1 };
        selectionSortAlgorithm0.sort(shortArray15);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[1]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.github.edgar615.util.sort.HoareQuickSortAlgorithm hoareQuickSortAlgorithm0 = new com.github.edgar615.util.sort.HoareQuickSortAlgorithm();
        double[] doubleArray6 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray6);
        com.github.edgar615.util.sort.Sorts.selection(doubleArray6);
        hoareQuickSortAlgorithm0.sort(doubleArray6);
        int[] intArray16 = new int[] { (-1), '4', (byte) -1, '4', '4', (byte) 1 };
        com.github.edgar615.util.sort.Sorts.quick(intArray16);
        hoareQuickSortAlgorithm0.sort(intArray16);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1, 1, 52, 52, 52]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm0 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        long[] longArray1 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray1);
        selectionSortAlgorithm0.sort(longArray1);
        com.github.edgar615.util.sort.Sorts.selection(longArray1);
        com.github.edgar615.util.sort.Sorts.insert(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm1 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray7 = new int[] {};
        bubbleSortAlgorithm2.sort(intArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm2.sort(byteArray13);
        iteratorMergeSortAlgorithm1.sort(byteArray13);
        double[] doubleArray22 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray22);
        iteratorMergeSortAlgorithm1.sort(doubleArray22);
        com.github.edgar615.util.sort.Sorts.quick(doubleArray22);
        com.github.edgar615.util.sort.Sorts.quick(doubleArray22);
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort(doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        boolean boolean1 = com.github.edgar615.util.net.IPUtils.isIPv6Address("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.reflect.Method method1 = null;
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode3 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray7 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray9 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray10 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray9;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration11 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray10);
        java.util.Enumeration[] enumerationArray13 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray14 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray13;
        objEnumerationArray14[0] = objCompoundEnumeration11;
        float[] floatArray20 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray20);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_22 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode3, shortArray7, objEnumerationArray14, (java.lang.Comparable<java.lang.String>) "hi!", floatArray20);
        com.github.edgar615.util.interceptor.Invocation invocation23 = com.github.edgar615.util.interceptor.Invocation.create((java.lang.Object) 100, method1, (java.lang.Object[]) objEnumerationArray14);
        org.junit.Assert.assertTrue("'" + defaultErrorCode3 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode3.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray9);
        org.junit.Assert.assertNotNull(objEnumerationArray10);
        org.junit.Assert.assertNotNull(enumerationArray13);
        org.junit.Assert.assertNotNull(objEnumerationArray14);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_22);
        org.junit.Assert.assertNotNull(invocation23);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        long[] longArray0 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray0);
        com.github.edgar615.util.sort.Sorts.shell(longArray0);
        com.github.edgar615.util.sort.Sorts.bubble(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.github.edgar615.util.collection.LinkedSkipList<java.lang.String, com.github.edgar615.util.reflect.ObjectProxyBuilder> strLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<java.lang.String, com.github.edgar615.util.reflect.ObjectProxyBuilder>();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.github.edgar615.util.search.Criteria criteria0 = com.github.edgar615.util.search.Criteria.create();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm2 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm3 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray4 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray4);
        iteratorMergeSortAlgorithm3.sort(charArray4);
        knuthShellSortAlgorithm2.sort(charArray4);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm8 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm8.sort(byteArray13);
        knuthShellSortAlgorithm2.sort(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.search.Criteria criteria17 = criteria0.notEqualsTo("737597DB72C1E0B26143D2D519E03B32", (java.lang.Object) byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Illegal type in Event Content: class [B");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(criteria0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        double[] doubleArray21 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray21);
        iteratorMergeSortAlgorithm0.sort(doubleArray21);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList36);
        iteratorMergeSortAlgorithm0.sort((java.util.List<java.lang.String>) strList36);
        com.github.edgar615.util.base.MorePreconditions.checkIndex((java.util.Collection<java.lang.String>) strList36, 0);
        com.github.edgar615.util.sort.Sorts.quick((java.util.List<java.lang.String>) strList36);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableTuple6_20.getT1();
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableTuple6_20.getT1();
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "CustomErrorCode{number=0, message='hi!'}" + "'", strComparable21, "CustomErrorCode{number=0, message='hi!'}");
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "CustomErrorCode{number=0, message='hi!'}" + "'", strComparable22, "CustomErrorCode{number=0, message='hi!'}");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha256("E", "VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA" + "'", str2, "F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        char[] charArray16 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray16);
        iteratorMergeSortAlgorithm0.sort(charArray16);
        long[] longArray24 = new long[] { (byte) 0, (short) -1, (short) 100, (-1), (short) -1 };
        com.github.edgar615.util.sort.Sorts.selection(longArray24);
        iteratorMergeSortAlgorithm0.sort(longArray24);
        com.github.edgar615.util.sort.Sorts.insert(longArray24);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, -1, 0, 100]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = com.github.edgar615.util.reflect.BeanUtils.toMap((java.lang.Object) 10);
        com.github.edgar615.util.search.Criterion[] criterionArray2 = new com.github.edgar615.util.search.Criterion[] {};
        java.util.ArrayList<com.github.edgar615.util.search.Criterion> criterionList3 = new java.util.ArrayList<com.github.edgar615.util.search.Criterion>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.github.edgar615.util.search.Criterion>) criterionList3, criterionArray2);
        boolean boolean5 = com.github.edgar615.util.base.MapUtils.check(strMap1, (java.util.List<com.github.edgar615.util.search.Criterion>) criterionList3);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(criterionArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm0 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm1 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm2 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray3 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray3);
        iteratorMergeSortAlgorithm2.sort(charArray3);
        knuthShellSortAlgorithm1.sort(charArray3);
        knuthShellSortAlgorithm0.sort(charArray3);
        com.github.edgar615.util.sort.Sorts.merge(charArray3);
        com.github.edgar615.util.sort.Sorts.heap(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.github.edgar615.util.sort.InsertSortAlgorithm insertSortAlgorithm0 = new com.github.edgar615.util.sort.InsertSortAlgorithm();
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm1 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        byte[] byteArray3 = new byte[] { (byte) 100 };
        java.lang.String str4 = com.github.edgar615.util.base.EncryptUtils.byte2hex(byteArray3);
        selectionSortAlgorithm1.sort(byteArray3);
        long[] longArray6 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray6);
        com.github.edgar615.util.sort.Sorts.shell(longArray6);
        selectionSortAlgorithm1.sort(longArray6);
        double[] doubleArray15 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray15);
        selectionSortAlgorithm1.sort(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = insertSortAlgorithm0.binaraySearch(doubleArray15, (int) ' ', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "64" + "'", str4, "64");
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm0 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm1 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray7 = new int[] {};
        bubbleSortAlgorithm2.sort(intArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm2.sort(byteArray13);
        iteratorMergeSortAlgorithm1.sort(byteArray13);
        char[] charArray17 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        iteratorMergeSortAlgorithm1.sort(charArray17);
        shellSortAlgorithm0.sort(charArray17);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray25);
        shellSortAlgorithm0.sort(byteArray25);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm28 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList31 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm28.sort(strList31);
        int[] intArray33 = new int[] {};
        bubbleSortAlgorithm28.sort(intArray33);
        shellSortAlgorithm0.sort(intArray33);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        int int1 = defaultErrorCode0.getNumber();
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1010 + "'", int1 == 1010);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.lang.Class class0 = null;
        com.github.edgar615.util.reflect.NullClassLoader nullClassLoader1 = com.github.edgar615.util.reflect.NullClassLoader.instance();
        java.net.URL uRL3 = nullClassLoader1.getResource("HMACSHA256");
        java.lang.Class class4 = com.github.edgar615.util.reflect.ReflectUtils.forName(class0, (java.lang.ClassLoader) nullClassLoader1);
        java.lang.ClassLoader classLoader5 = nullClassLoader1.getParent();
        java.lang.ClassLoader[] classLoaderArray6 = new java.lang.ClassLoader[] { classLoader5 };
        java.lang.ClassLoader classLoader7 = com.github.edgar615.util.reflect.ClassLoaderChain.createChain(classLoaderArray6);
        org.junit.Assert.assertNotNull(nullClassLoader1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(class4);
        org.junit.Assert.assertNotNull(classLoader5);
        org.junit.Assert.assertNotNull(classLoaderArray6);
        org.junit.Assert.assertNotNull(classLoader7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.github.edgar615.util.sort.LomutoQuickSortAlgorithm lomutoQuickSortAlgorithm0 = new com.github.edgar615.util.sort.LomutoQuickSortAlgorithm();
        int[] intArray2 = new int[] { (byte) 10 };
        lomutoQuickSortAlgorithm0.sort(intArray2);
        com.github.edgar615.util.sort.Sorts.shell(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = com.github.edgar615.util.reflect.BeanUtils.toMap((java.lang.Object) 10);
        java.lang.Integer int3 = com.github.edgar615.util.base.MapUtils.getInteger(strMap1, "HMACMD5");
        java.lang.Integer int5 = com.github.edgar615.util.base.MapUtils.getInteger(strMap1, "com.github.edgar615.util.reflect.ReflectionException: p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm0 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str3 = com.github.edgar615.util.base.EncryptUtils.byte2hex(byteArray2);
        selectionSortAlgorithm0.sort(byteArray2);
        long[] longArray5 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray5);
        com.github.edgar615.util.sort.Sorts.shell(longArray5);
        selectionSortAlgorithm0.sort(longArray5);
        double[] doubleArray14 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray14);
        selectionSortAlgorithm0.sort(doubleArray14);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode18 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray22 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray24 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray25 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray24;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration26 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray25);
        java.util.Enumeration[] enumerationArray28 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray29 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray28;
        objEnumerationArray29[0] = objCompoundEnumeration26;
        float[] floatArray35 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray35);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_37 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode18, shortArray22, objEnumerationArray29, (java.lang.Comparable<java.lang.String>) "hi!", floatArray35);
        com.github.edgar615.util.sort.Sorts.selection(floatArray35);
        selectionSortAlgorithm0.sort(floatArray35);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode18 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode18.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray24);
        org.junit.Assert.assertNotNull(objEnumerationArray25);
        org.junit.Assert.assertNotNull(enumerationArray28);
        org.junit.Assert.assertNotNull(objEnumerationArray29);
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray35), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_37);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.CONCURRENT_CONFLICT;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.CONCURRENT_CONFLICT + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.CONCURRENT_CONFLICT));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String str0 = com.github.edgar615.util.base.Utils.LINE_SEPARATOR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op1 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj2 = opLinkedSkipList0.get(op1);
        com.github.edgar615.util.search.Op op3 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj4 = opLinkedSkipList0.remove(op3);
        long long5 = opLinkedSkipList0.size();
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList6 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op7 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj8 = opLinkedSkipList6.get(op7);
        com.github.edgar615.util.search.Op op9 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj10 = opLinkedSkipList6.remove(op9);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList11 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op12 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj13 = opLinkedSkipList11.get(op12);
        com.github.edgar615.util.search.Op op14 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj15 = opLinkedSkipList11.remove(op14);
        byte[] byteArray16 = com.github.edgar615.util.io.IOUtils.serialize(op14);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList17 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op18 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj19 = opLinkedSkipList17.get(op18);
        com.github.edgar615.util.search.Op op20 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj21 = opLinkedSkipList17.remove(op20);
        byte[] byteArray22 = com.github.edgar615.util.io.IOUtils.serialize(op20);
        java.util.List<java.lang.Object> objList23 = opLinkedSkipList6.findRange(op14, op20);
        java.lang.Object obj24 = opLinkedSkipList0.get(op14);
        org.junit.Assert.assertTrue("'" + op1 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op1.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + op3 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op3.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + op7 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op7.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + op9 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op9.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + op12 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op12.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + op14 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op14.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-84, -19, 0, 5, 126, 114, 0, 34, 99, 111, 109, 46, 103, 105, 116, 104, 117, 98, 46, 101, 100, 103, 97, 114, 54, 49, 53, 46, 117, 116, 105, 108, 46, 115, 101, 97, 114, 99, 104, 46, 79, 112, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 114, 0, 14, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 69, 110, 117, 109, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 112, 116, 0, 2, 76, 69]");
        org.junit.Assert.assertTrue("'" + op18 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op18.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + op20 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op20.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-84, -19, 0, 5, 126, 114, 0, 34, 99, 111, 109, 46, 103, 105, 116, 104, 117, 98, 46, 101, 100, 103, 97, 114, 54, 49, 53, 46, 117, 116, 105, 108, 46, 115, 101, 97, 114, 99, 104, 46, 79, 112, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 114, 0, 14, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 69, 110, 117, 109, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 112, 116, 0, 2, 76, 69]");
        org.junit.Assert.assertNotNull(objList23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.github.edgar615.util.sort.HibbardShellSortAlgorithm hibbardShellSortAlgorithm0 = new com.github.edgar615.util.sort.HibbardShellSortAlgorithm();
        long[] longArray4 = new long[] { ' ', ' ', '#' };
        com.github.edgar615.util.sort.Sorts.quick(longArray4);
        hibbardShellSortAlgorithm0.sort(longArray4);
        int[] intArray7 = new int[] {};
        com.github.edgar615.util.sort.Sorts.quick(intArray7);
        hibbardShellSortAlgorithm0.sort(intArray7);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 32, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.github.edgar615.util.base.Utils.LINE_SEPARATOR = "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC";
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class1 = com.github.edgar615.util.reflect.ReflectUtils.forName("VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        boolean boolean1 = com.github.edgar615.util.net.IPUtils.isIPv4Address("h_m_a_c_s_h_a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm0 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray6);
        bubbleSortAlgorithm1.sort(byteArray6);
        shellSortAlgorithm0.sort(byteArray6);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode11 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray15 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray17 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray18 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray17;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration19 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray18);
        java.util.Enumeration[] enumerationArray21 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray22 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray21;
        objEnumerationArray22[0] = objCompoundEnumeration19;
        float[] floatArray28 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray28);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_30 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode11, shortArray15, objEnumerationArray22, (java.lang.Comparable<java.lang.String>) "hi!", floatArray28);
        java.util.Enumeration[] enumerationArray32 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray33 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray32;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration34 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray33);
        boolean boolean35 = strComparableTuple6_30.equals((java.lang.Object) objCompoundEnumeration34);
        float[] floatArray36 = strComparableTuple6_30.getT6();
        shellSortAlgorithm0.sort(floatArray36);
        long[] longArray41 = new long[] { ' ', ' ', '#' };
        com.github.edgar615.util.sort.Sorts.quick(longArray41);
        com.github.edgar615.util.sort.Sorts.heap(longArray41);
        shellSortAlgorithm0.sort(longArray41);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode11 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode11.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray15), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray17);
        org.junit.Assert.assertNotNull(objEnumerationArray18);
        org.junit.Assert.assertNotNull(enumerationArray21);
        org.junit.Assert.assertNotNull(objEnumerationArray22);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_30);
        org.junit.Assert.assertNotNull(enumerationArray32);
        org.junit.Assert.assertNotNull(objEnumerationArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[32, 32, 35]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm3 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm4 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList7 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm4.sort(strList7);
        int[] intArray9 = new int[] {};
        bubbleSortAlgorithm4.sort(intArray9);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray15);
        bubbleSortAlgorithm4.sort(byteArray15);
        iteratorMergeSortAlgorithm3.sort(byteArray15);
        double[] doubleArray24 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray24);
        iteratorMergeSortAlgorithm3.sort(doubleArray24);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList39);
        iteratorMergeSortAlgorithm3.sort((java.util.List<java.lang.String>) strList39);
        com.github.edgar615.util.base.MorePreconditions.checkIndex((java.util.Collection<java.lang.String>) strList39, 0);
        com.github.edgar615.util.page.Pagination<java.lang.String> strPagination45 = com.github.edgar615.util.page.Pagination.newInstance((int) (byte) 10, (int) '4', 100, (java.util.List<java.lang.String>) strList39);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strPagination45);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.BREAKER_TRIPPED;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.BREAKER_TRIPPED + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.BREAKER_TRIPPED));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.github.edgar615.util.concurrent.StripedLock stripedLock0 = com.github.edgar615.util.concurrent.StripedLock.create();
        // The following exception was thrown during execution in test generation
        try {
            stripedLock0.unlock((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalMonitorStateException; message: null");
        } catch (java.lang.IllegalMonitorStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stripedLock0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.ClassLoader classLoader0 = java.lang.ClassLoader.getSystemClassLoader();
        java.lang.ClassLoader[] classLoaderArray1 = new java.lang.ClassLoader[] { classLoader0 };
        java.lang.ClassLoader classLoader2 = com.github.edgar615.util.reflect.ClassLoaderChain.createNewChain(classLoaderArray1);
        java.lang.ClassLoader classLoader3 = com.github.edgar615.util.reflect.ClassLoaderChain.createChain(classLoaderArray1);
        classLoader3.setClassAssertionStatus("F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA", true);
        org.junit.Assert.assertNotNull(classLoader0);
        org.junit.Assert.assertNotNull(classLoaderArray1);
        org.junit.Assert.assertNotNull(classLoader2);
        org.junit.Assert.assertNotNull(classLoader3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        java.lang.String str2 = com.github.edgar615.util.base.Randoms.randomString((int) (byte) 10, "yophnpoemlpfjxwomlejolcbpwyaktaklhbujqhocfumrqrscdplxhrcuhzfdblxzedwnrnriyrnpqronxdatlktcxrlbmgzrycwmcnntbrrtxatlaltzzrddeobtfcbbrxzrwmjpifkrhuwpilplvbifsasmpxcudkbbztiageuiicdszrtxpmtxqanbrgqpohmsyiidiudbepprssqcbdfktmubbpreyroemresfyjwbxcqlkhchflsopsrbmacpuxnbfmcflnnjpdajeoygxluiooixovbbmasbbnbwobwawnmxvbbkebhbzddryobtfawcjnimvplqqioajwiehkgbmooejtkftatxiptowitiyrflbfbbtwybhrsznoxnnlmtacwgucwvilirtyzawpdlxoojggcwgdwoadpbtdfwwrbfmkuqwecewvqemxehwhsqmowrnwiffuplxuzjejtwagtjcjtxpekkzevyxfgsshgsijhwihlwvgzcllmaqfwggelvjgfdqghxbvfqipymattmnigrhwlcseitovymelofdltqwnjyokresutzdzawxjmxotxrcbdszdqwgczggiepiiukdrlixzozdhteglyjnabhnzhqliqglcmijngnbinftnclbbblwykofeppqlaxpngzyesonoeswmtxnfeoywxzxdxwyakaendvnpwmxtchayobprifozlscbrxlvgucsbwtalwiuesbiydzvotksnsvfebgvafuwnzsmvqvoowdzwezuwdtfeaubgniriobgbynjfbderdpznqmkstnekaiakyphjidzbnsakgpkavjbqgrleqtgafyaxevwzqoetnfyyymrznwiaayvtsruxmfwhvqjcporcmrmdvulbppyphcekzqzxbulyyrozhdvgmeqisnkhpwufvgeazhoebhlyuxpwyxsxxhjdykogzkaiafzspuiqwhnybcxsbnucncsnpgy");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "oxfjngjjxn" + "'", str2, "oxfjngjjxn");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.github.edgar615.util.serialization.SerDeException serDeException1 = new com.github.edgar615.util.serialization.SerDeException("UTF-8");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha512("E", "HMACMD5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ACF0C9CE4186C5F4E9611ECE890D1B931CF4D0F9D8E1D45848CA57A972ED77B73D0F81D5FC38AF8E5637F2182CBD397389E1EC38640A7B1B6A6FD0D7B8646E6E" + "'", str2, "ACF0C9CE4186C5F4E9611ECE890D1B931CF4D0F9D8E1D45848CA57A972ED77B73D0F81D5FC38AF8E5637F2182CBD397389E1EC38640A7B1B6A6FD0D7B8646E6E");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op1 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj2 = opLinkedSkipList0.get(op1);
        com.github.edgar615.util.search.Op op3 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj4 = opLinkedSkipList0.remove(op3);
        com.github.edgar615.util.search.Op op5 = com.github.edgar615.util.search.Op.CN;
        java.lang.Object obj6 = opLinkedSkipList0.remove(op5);
        long long7 = opLinkedSkipList0.size();
        org.junit.Assert.assertTrue("'" + op1 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op1.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + op3 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op3.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + op5 + "' != '" + com.github.edgar615.util.search.Op.CN + "'", op5.equals(com.github.edgar615.util.search.Op.CN));
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode17 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray21 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray23 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray24 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray23;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration25 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray24);
        java.util.Enumeration[] enumerationArray27 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray28 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray27;
        objEnumerationArray28[0] = objCompoundEnumeration25;
        float[] floatArray34 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray34);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_36 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode17, shortArray21, objEnumerationArray28, (java.lang.Comparable<java.lang.String>) "hi!", floatArray34);
        java.lang.Class[] classArray37 = com.github.edgar615.util.reflect.ReflectUtils.extractAllInterfaces((java.lang.Object) shortArray21);
        iteratorMergeSortAlgorithm0.sort(shortArray21);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm39 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.lang.String[] strArray41 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        double[] doubleArray49 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray49);
        boolean boolean51 = strList42.contains((java.lang.Object) doubleArray49);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList52 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long53 = opLinkedSkipList52.size();
        com.github.edgar615.util.search.Op op54 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj55 = opLinkedSkipList52.remove(op54);
        boolean boolean56 = strList42.contains(obj55);
        bubbleSortAlgorithm39.sort((java.util.List<java.lang.String>) strList42);
        int[] intArray58 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray58);
        com.github.edgar615.util.sort.Sorts.bubble(intArray58);
        bubbleSortAlgorithm39.sort(intArray58);
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm62 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm63 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm64 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList67 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm64.sort(strList67);
        int[] intArray69 = new int[] {};
        bubbleSortAlgorithm64.sort(intArray69);
        byte[] byteArray75 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray75);
        bubbleSortAlgorithm64.sort(byteArray75);
        iteratorMergeSortAlgorithm63.sort(byteArray75);
        char[] charArray79 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray79);
        iteratorMergeSortAlgorithm63.sort(charArray79);
        shellSortAlgorithm62.sort(charArray79);
        byte[] byteArray87 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray87);
        shellSortAlgorithm62.sort(byteArray87);
        bubbleSortAlgorithm39.sort(byteArray87);
        iteratorMergeSortAlgorithm0.sort(byteArray87);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode17 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode17.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray23);
        org.junit.Assert.assertNotNull(objEnumerationArray24);
        org.junit.Assert.assertNotNull(enumerationArray27);
        org.junit.Assert.assertNotNull(objEnumerationArray28);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_36);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + op54 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op54.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[]");
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[]");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[-1, -1, 0, 10]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.net.InetAddress inetAddress0 = com.github.edgar615.util.net.NetUtils.getFirstInetAddress();
        org.junit.Assert.assertNotNull(inetAddress0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        java.math.BigInteger bigInteger1 = com.github.edgar615.util.net.IPUtils.ipv6ToNumber("A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList12);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode16 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray20 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray22 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray23 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray22;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration24 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray23);
        java.util.Enumeration[] enumerationArray26 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray27 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray26;
        objEnumerationArray27[0] = objCompoundEnumeration24;
        float[] floatArray33 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray33);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_35 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode16, shortArray20, objEnumerationArray27, (java.lang.Comparable<java.lang.String>) "hi!", floatArray33);
        float[] floatArray36 = strComparableTuple6_35.getT6();
        com.github.edgar615.util.sort.Sorts.shell(floatArray36);
        boolean boolean38 = strList12.contains((java.lang.Object) floatArray36);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm39 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.lang.String[] strArray41 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        double[] doubleArray49 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray49);
        boolean boolean51 = strList42.contains((java.lang.Object) doubleArray49);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList52 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long53 = opLinkedSkipList52.size();
        com.github.edgar615.util.search.Op op54 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj55 = opLinkedSkipList52.remove(op54);
        boolean boolean56 = strList42.contains(obj55);
        bubbleSortAlgorithm39.sort((java.util.List<java.lang.String>) strList42);
        com.github.edgar615.util.base.MorePreconditions.checkNotEmpty((java.util.Collection<java.lang.String>) strList42);
        boolean boolean59 = strList12.containsAll((java.util.Collection<java.lang.String>) strList42);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + defaultErrorCode16 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode16.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray22);
        org.junit.Assert.assertNotNull(objEnumerationArray23);
        org.junit.Assert.assertNotNull(enumerationArray26);
        org.junit.Assert.assertNotNull(objEnumerationArray27);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + op54 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op54.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.github.edgar615.util.concurrent.IdentificationExtractor<com.github.edgar615.util.sort.HoareQuickSortAlgorithm> hoareQuickSortAlgorithmIdentificationExtractor0 = null;
        com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.sort.HoareQuickSortAlgorithm> hoareQuickSortAlgorithmSequentialQueue2 = new com.github.edgar615.util.concurrent.SequentialQueue<com.github.edgar615.util.sort.HoareQuickSortAlgorithm>(hoareQuickSortAlgorithmIdentificationExtractor0, (int) '#');
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray1 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray1);
        iteratorMergeSortAlgorithm0.sort(charArray1);
        short[] shortArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            iteratorMergeSortAlgorithm0.sort(shortArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList12);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.base.MorePreconditions.checkIndex((java.util.Collection<java.lang.String>) strList12, 100, "p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode17 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray21 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray23 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray24 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray23;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration25 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray24);
        java.util.Enumeration[] enumerationArray27 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray28 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray27;
        objEnumerationArray28[0] = objCompoundEnumeration25;
        float[] floatArray34 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray34);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_36 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode17, shortArray21, objEnumerationArray28, (java.lang.Comparable<java.lang.String>) "hi!", floatArray34);
        java.lang.Class[] classArray37 = com.github.edgar615.util.reflect.ReflectUtils.extractAllInterfaces((java.lang.Object) shortArray21);
        iteratorMergeSortAlgorithm0.sort(shortArray21);
        com.github.edgar615.util.sort.Sorts.quick(shortArray21);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode17 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode17.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray23);
        org.junit.Assert.assertNotNull(objEnumerationArray24);
        org.junit.Assert.assertNotNull(enumerationArray27);
        org.junit.Assert.assertNotNull(objEnumerationArray28);
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_36);
        org.junit.Assert.assertNotNull(classArray37);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String str2 = com.github.edgar615.util.base.Randoms.randomString((int) '4', "com.github.edgar615.util.reflect.ReflectionException: p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5erxihJTGpe1G.eOccCt:.Uor4rtl1.zutOeu3qp.hxl.4.IskTe" + "'", str2, "5erxihJTGpe1G.eOccCt:.Uor4rtl1.zutOeu3qp.hxl.4.IskTe");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        long[] longArray1 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray1);
        heapSortAlgorithm0.sort(longArray1);
        com.github.edgar615.util.sort.ShellSortAlgorithm shellSortAlgorithm4 = new com.github.edgar615.util.sort.ShellSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm5 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray10);
        bubbleSortAlgorithm5.sort(byteArray10);
        shellSortAlgorithm4.sort(byteArray10);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode15 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray19 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray21 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray22 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray21;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration23 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray22);
        java.util.Enumeration[] enumerationArray25 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray26 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray25;
        objEnumerationArray26[0] = objCompoundEnumeration23;
        float[] floatArray32 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray32);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_34 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode15, shortArray19, objEnumerationArray26, (java.lang.Comparable<java.lang.String>) "hi!", floatArray32);
        java.util.Enumeration[] enumerationArray36 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray37 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray36;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration38 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray37);
        boolean boolean39 = strComparableTuple6_34.equals((java.lang.Object) objCompoundEnumeration38);
        float[] floatArray40 = strComparableTuple6_34.getT6();
        shellSortAlgorithm4.sort(floatArray40);
        heapSortAlgorithm0.sort(floatArray40);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, 0, 10]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode15 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode15.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray21);
        org.junit.Assert.assertNotNull(objEnumerationArray22);
        org.junit.Assert.assertNotNull(enumerationArray25);
        org.junit.Assert.assertNotNull(objEnumerationArray26);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_34);
        org.junit.Assert.assertNotNull(enumerationArray36);
        org.junit.Assert.assertNotNull(objEnumerationArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[0.0, 0.0]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.github.edgar615.util.uuid.DefaultUUIDFactory defaultUUIDFactory0 = new com.github.edgar615.util.uuid.DefaultUUIDFactory();
        java.util.UUID uUID1 = defaultUUIDFactory0.uuid();
        org.junit.Assert.assertNotNull(uUID1);
// flaky:         org.junit.Assert.assertEquals(uUID1.toString(), "6e46ee37-0278-4f88-b2a1-db4d37bdf764");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "HMACSHA1", "CustomErrorCode{number=0, message='hi!'}", "UTF-8", "HMACSHA1", "HMACSHA1", "hi!", "4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1", "64", "hi!", "HMACSHA256" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        com.github.edgar615.util.sort.Sorts.merge((java.util.List<java.lang.String>) strList12);
        com.github.edgar615.util.sort.Sorts.bubble((java.util.List<java.lang.String>) strList12);
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm16 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm17 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm18 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray19 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray19);
        iteratorMergeSortAlgorithm18.sort(charArray19);
        knuthShellSortAlgorithm17.sort(charArray19);
        knuthShellSortAlgorithm16.sort(charArray19);
        com.github.edgar615.util.sort.Sorts.shell(charArray19);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList25 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op26 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj27 = opLinkedSkipList25.get(op26);
        com.github.edgar615.util.search.Op op28 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj29 = opLinkedSkipList25.remove(op28);
        com.github.edgar615.util.search.Op op30 = com.github.edgar615.util.search.Op.CN;
        java.lang.Object obj31 = opLinkedSkipList25.remove(op30);
        com.github.edgar615.util.collection.Tuple3<java.util.ArrayList<java.lang.String>, char[], com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>> strListTuple3_32 = com.github.edgar615.util.collection.Tuple3.create(strList12, charArray19, opLinkedSkipList25);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[]");
        org.junit.Assert.assertTrue("'" + op26 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op26.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + op28 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op28.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + op30 + "' != '" + com.github.edgar615.util.search.Op.CN + "'", op30.equals(com.github.edgar615.util.search.Op.CN));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(strListTuple3_32);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        double[] doubleArray3 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha512("", "VbMyjiJrisxSRlldCAjjnNPKqNOGvOaTABTOJngpvtqwYojbKfRv");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEDA2765E0439518654CA7D0D6A0904895F380785D20B33BEA0BD3FE71A9E7083C8B9C988DFEA9867245A8AAA96990D9DC98D678F3A156B16AF96CCCD037636A" + "'", str2, "EEDA2765E0439518654CA7D0D6A0904895F380785D20B33BEA0BD3FE71A9E7083C8B9C988DFEA9867245A8AAA96990D9DC98D678F3A156B16AF96CCCD037636A");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        int[] intArray0 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray0);
        com.github.edgar615.util.sort.Sorts.bubble(intArray0);
        com.github.edgar615.util.sort.Sorts.selection(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op1 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj2 = opLinkedSkipList0.remove(op1);
        com.github.edgar615.util.search.Op op3 = com.github.edgar615.util.search.Op.CN;
        int[] intArray4 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray4);
        com.github.edgar615.util.sort.Sorts.bubble(intArray4);
        java.lang.Object obj7 = opLinkedSkipList0.add(op3, (java.lang.Object) intArray4);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList8 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op9 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj10 = opLinkedSkipList8.get(op9);
        com.github.edgar615.util.search.Op op11 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj12 = opLinkedSkipList8.remove(op11);
        com.github.edgar615.util.search.Op op13 = com.github.edgar615.util.search.Op.CN;
        java.lang.Object obj14 = opLinkedSkipList8.remove(op13);
        com.github.edgar615.util.loadbalance.ServiceInstance serviceInstance17 = new com.github.edgar615.util.loadbalance.ServiceInstance("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN", "");
        java.lang.Object obj18 = opLinkedSkipList0.add(op13, (java.lang.Object) "p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
        org.junit.Assert.assertTrue("'" + op1 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op1.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + op3 + "' != '" + com.github.edgar615.util.search.Op.CN + "'", op3.equals(com.github.edgar615.util.search.Op.CN));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + op9 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op9.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + op11 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op11.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + op13 + "' != '" + com.github.edgar615.util.search.Op.CN + "'", op13.equals(com.github.edgar615.util.search.Op.CN));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.github.edgar615.util.sort.HoareQuickSortAlgorithm hoareQuickSortAlgorithm0 = new com.github.edgar615.util.sort.HoareQuickSortAlgorithm();
        int[] intArray4 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray4);
        hoareQuickSortAlgorithm0.sort(intArray4);
        double[] doubleArray12 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray12);
        com.github.edgar615.util.sort.Sorts.selection(doubleArray12);
        hoareQuickSortAlgorithm0.sort(doubleArray12);
        com.github.edgar615.util.sort.Sorts.selection(doubleArray12);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1, 32]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        char[] charArray16 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray16);
        iteratorMergeSortAlgorithm0.sort(charArray16);
        com.github.edgar615.util.sort.HibbardShellSortAlgorithm hibbardShellSortAlgorithm19 = new com.github.edgar615.util.sort.HibbardShellSortAlgorithm();
        long[] longArray23 = new long[] { ' ', ' ', '#' };
        com.github.edgar615.util.sort.Sorts.quick(longArray23);
        hibbardShellSortAlgorithm19.sort(longArray23);
        iteratorMergeSortAlgorithm0.sort(longArray23);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[32, 32, 35]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList1 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) 'a');
        com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList3 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) (byte) 10);
        com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList5 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) (byte) 10);
        com.github.edgar615.util.uuid.UUIDFactory uUIDFactory6 = com.github.edgar615.util.uuid.UUIDFactory.concurrentUUIDFactory();
        java.util.UUID uUID7 = uUIDFactory6.uuid();
        java.lang.Object[] objArray8 = uUIDArraySkipList5.get(uUID7);
        java.lang.Object[] objArray9 = uUIDArraySkipList3.get(uUID7);
        java.lang.String[] strArray11 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        double[] doubleArray19 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray19);
        boolean boolean21 = strList12.contains((java.lang.Object) doubleArray19);
        java.lang.Object[] objArray22 = strList12.toArray();
        java.lang.Object[] objArray23 = uUIDArraySkipList1.add(uUID7, objArray22);
        org.junit.Assert.assertNotNull(uUIDFactory6);
        org.junit.Assert.assertNotNull(uUID7);
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "ff5eb0d4-8aac-4e44-9a25-0869bc0e5dbc");
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC]");
        org.junit.Assert.assertNull(objArray23);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.github.edgar615.util.sort.CountingSortAlgorithm countingSortAlgorithm0 = new com.github.edgar615.util.sort.CountingSortAlgorithm();
        java.lang.String[] strArray2 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        double[] doubleArray10 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray10);
        boolean boolean12 = strList3.contains((java.lang.Object) doubleArray10);
        // The following exception was thrown during execution in test generation
        try {
            countingSortAlgorithm0.sort((java.util.List<java.lang.String>) strList3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.lang.String[] strArray2 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        double[] doubleArray10 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray10);
        boolean boolean12 = strList3.contains((java.lang.Object) doubleArray10);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList13 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long14 = opLinkedSkipList13.size();
        com.github.edgar615.util.search.Op op15 = com.github.edgar615.util.search.Op.LE;
        java.lang.Object obj16 = opLinkedSkipList13.remove(op15);
        boolean boolean17 = strList3.contains(obj16);
        bubbleSortAlgorithm0.sort((java.util.List<java.lang.String>) strList3);
        java.util.Collection<java.lang.String> strCollection19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = strList3.containsAll(strCollection19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + op15 + "' != '" + com.github.edgar615.util.search.Op.LE + "'", op15.equals(com.github.edgar615.util.search.Op.LE));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.github.edgar615.util.base.Luhn.generate("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"N\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.github.edgar615.util.sort.HibbardShellSortAlgorithm hibbardShellSortAlgorithm0 = new com.github.edgar615.util.sort.HibbardShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm1 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray7 = new int[] {};
        bubbleSortAlgorithm2.sort(intArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm2.sort(byteArray13);
        iteratorMergeSortAlgorithm1.sort(byteArray13);
        char[] charArray17 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        iteratorMergeSortAlgorithm1.sort(charArray17);
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        hibbardShellSortAlgorithm0.sort(charArray17);
        com.github.edgar615.util.sort.LomutoQuickSortAlgorithm lomutoQuickSortAlgorithm23 = new com.github.edgar615.util.sort.LomutoQuickSortAlgorithm();
        int[] intArray25 = new int[] { (byte) 10 };
        lomutoQuickSortAlgorithm23.sort(intArray25);
        hibbardShellSortAlgorithm0.sort(intArray25);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.github.edgar615.util.loadbalance.ServiceInstance serviceInstance2 = new com.github.edgar615.util.loadbalance.ServiceInstance("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN", "");
        int int3 = serviceInstance2.effectiveWeight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.RESOURCE_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.RESOURCE_NOT_FOUND + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.RESOURCE_NOT_FOUND));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm1 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray10 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray10);
        com.github.edgar615.util.sort.Sorts.merge(intArray10);
        bubbleSortAlgorithm2.sort(intArray10);
        bucketSortAlgorithm1.sort(intArray10);
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm15 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray16 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray16);
        iteratorMergeSortAlgorithm15.sort(charArray16);
        // The following exception was thrown during execution in test generation
        try {
            bucketSortAlgorithm1.sort(charArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 32]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.NULL;
        com.github.edgar615.util.concurrent.OrderQueue orderQueue2 = new com.github.edgar615.util.concurrent.OrderQueue();
        com.github.edgar615.util.collection.Tuple3<java.lang.Enum<com.github.edgar615.util.exception.DefaultErrorCode>, java.lang.String, com.github.edgar615.util.concurrent.OrderQueue> defaultErrorCodeEnumTuple3_3 = com.github.edgar615.util.collection.Tuple3.create((java.lang.Enum<com.github.edgar615.util.exception.DefaultErrorCode>) defaultErrorCode0, "", orderQueue2);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode4 = com.github.edgar615.util.exception.DefaultErrorCode.PERMISSION_DENIED;
        boolean boolean5 = defaultErrorCodeEnumTuple3_3.equals((java.lang.Object) defaultErrorCode4);
        boolean boolean7 = defaultErrorCodeEnumTuple3_3.equals((java.lang.Object) 0L);
        java.lang.Enum<com.github.edgar615.util.exception.DefaultErrorCode> defaultErrorCodeEnum8 = defaultErrorCodeEnumTuple3_3.getT1();
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.NULL + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.NULL));
        org.junit.Assert.assertNotNull(defaultErrorCodeEnumTuple3_3);
        org.junit.Assert.assertTrue("'" + defaultErrorCode4 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.PERMISSION_DENIED + "'", defaultErrorCode4.equals(com.github.edgar615.util.exception.DefaultErrorCode.PERMISSION_DENIED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + defaultErrorCodeEnum8 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.NULL + "'", defaultErrorCodeEnum8.equals(com.github.edgar615.util.exception.DefaultErrorCode.NULL));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        double[] doubleArray21 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray21);
        iteratorMergeSortAlgorithm0.sort(doubleArray21);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList24 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList25 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op26 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj27 = opLinkedSkipList25.remove(op26);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode29 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray33 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray35 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray36 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray35;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration37 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray36);
        java.util.Enumeration[] enumerationArray39 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray40 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray39;
        objEnumerationArray40[0] = objCompoundEnumeration37;
        float[] floatArray46 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray46);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_48 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode29, shortArray33, objEnumerationArray40, (java.lang.Comparable<java.lang.String>) "hi!", floatArray46);
        short[] shortArray49 = strComparableTuple6_48.getT3();
        java.lang.Object obj50 = opLinkedSkipList24.add(op26, (java.lang.Object) shortArray49);
        iteratorMergeSortAlgorithm0.sort(shortArray49);
        float[] floatArray54 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray54);
        iteratorMergeSortAlgorithm0.sort(floatArray54);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + op26 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op26.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + defaultErrorCode29 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode29.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray35);
        org.junit.Assert.assertNotNull(objEnumerationArray36);
        org.junit.Assert.assertNotNull(enumerationArray39);
        org.junit.Assert.assertNotNull(objEnumerationArray40);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[0.0, 0.0]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.github.edgar615.util.serialization.SerDeException serDeException0 = new com.github.edgar615.util.serialization.SerDeException();
        com.github.edgar615.util.serialization.SerDeException serDeException2 = new com.github.edgar615.util.serialization.SerDeException("");
        serDeException0.addSuppressed((java.lang.Throwable) serDeException2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.github.edgar615.util.sort.Sorts sorts0 = new com.github.edgar615.util.sort.Sorts();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.io.File file2 = com.github.edgar615.util.io.IOUtils.createTempDirectory("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN", "DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
        org.junit.Assert.assertNotNull(file2);
// flaky:         org.junit.Assert.assertEquals(file2.getParent(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN5534047520318921784");
// flaky:         org.junit.Assert.assertEquals(file2.toString(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN5534047520318921784/DefaultErrorCode{number=1008, message='Incomplete Parameter'}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha1("F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA", "CustomErrorCode{number=0, message='hi!'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "37C9E3C358B4E827D247ADB01E290BC88AAE0FC1" + "'", str2, "37C9E3C358B4E827D247ADB01E290BC88AAE0FC1");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.EVENTBUS_TIMOUT;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EVENTBUS_TIMOUT + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.EVENTBUS_TIMOUT));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]> uUIDArraySkipList1 = new com.github.edgar615.util.collection.ArraySkipList<java.util.UUID, java.lang.Object[]>((int) 'a');
        long long2 = uUIDArraySkipList1.size();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray1 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray1);
        iteratorMergeSortAlgorithm0.sort(charArray1);
        double[] doubleArray6 = new double[] { (-1), 1.0d };
        iteratorMergeSortAlgorithm0.sort(doubleArray6);
        long[] longArray11 = new long[] { 100L, 1L, 1010 };
        iteratorMergeSortAlgorithm0.sort(longArray11);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[1, 100, 1010]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = defaultErrorCode0.asMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = com.github.edgar615.util.base.MapUtils.removeNull(strMap1);
        java.lang.Integer int4 = com.github.edgar615.util.base.MapUtils.getInteger(strMap1, "E");
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE));
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm0 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList3 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm0.sort(strList3);
        int[] intArray8 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray8);
        com.github.edgar615.util.sort.Sorts.merge(intArray8);
        bubbleSortAlgorithm0.sort(intArray8);
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm12 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm13 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm14 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray15 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray15);
        iteratorMergeSortAlgorithm14.sort(charArray15);
        knuthShellSortAlgorithm13.sort(charArray15);
        knuthShellSortAlgorithm12.sort(charArray15);
        com.github.edgar615.util.sort.Sorts.merge(charArray15);
        bubbleSortAlgorithm0.sort(charArray15);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 32]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.String str1 = com.github.edgar615.util.base.Randoms.randomUpperAlphabet(1000);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PHSGLNTONPWJRDIAZRYAOAIBDPFOIVFLRELEWVOMIAFURVGMYYOIWZZFLYVGFBXTZEVUZBJLDVVCCOBIJNWXQMJERTPVLKKXDCXSMSZVVDFISALKKOWWHGKGIZHQXUALLMEEDWOAFARXPAHKXRCRFUSYOFAOZBXHRAHPTCDOZIDNUUEKDNZMBLZOIGPVXSSAUOXFWGETKILMPYILZFXXNODFUYFSBNXKEISYRIAIBPSMXUPXALATTEDPFCDBOCXSDONQGFETOSNJIVQSNIGVHVSFSVYKWDOUKMICENSJQWJBQEZEPRKEROHPZVQYIUBFZIVPMHMRQCCOXIQMASTJSNWLXCICBPGLFMAZNYHPLHKOLDLDTDBJQDOIYHLQROYJWBFEHKJCBCOLAAUNROFPIFWWPTEDOLVUHLVDALPTGHNKNBCFZFDYHUVJJIPWCYUQHNLERAFZTSQAFDBVLXLJGUOUPYYIMWOUTSOTCMYFBDIVZXKAWKPUZHHNXPTXCXJWYNRPONLLNUMPQWDKHMPYZLDMRQJLAYZPNNHEPTDABTFGDNCOSHBZAEDKVNEXLXQZOZHJNNMCKRMHJJTKUZNBXXWMNFTYOWZTPINWMXKMOAFQCMTTBLDKBNRHEVGMJJQEIYQNBUEQSVBAROPKGUOBVVLIOBDKBCCTFMKWYLPNCLSISSYKPFCFXZZEXPCNTUITWPOCVLPHXLWXXMMWARWNGLSBWEXPSHYGWPKBERGGBFAPODPPVXZIUXQMDBKFQGYZHDSPADOAATFWCECADIOODDHSXQNSHKTWIVBCZHMZHLEHMTVOOIRCZEHGJJFNCWXHXWCCIGUHLYQCDSAMIDZVPBQRPTNCXYCMPRNKRQKSYKDHLZCCZMCFOOXUNGOTVXMKSJOOFINSPMOQLGEVWKFFLJGNATXROUVRXAHYFXMXRFEORQDXXDMBWLUGSISFPMFECYHCIOKHNQNUORVPBYBQMMVGBHYMNMBQBHJQATJB" + "'", str1, "PHSGLNTONPWJRDIAZRYAOAIBDPFOIVFLRELEWVOMIAFURVGMYYOIWZZFLYVGFBXTZEVUZBJLDVVCCOBIJNWXQMJERTPVLKKXDCXSMSZVVDFISALKKOWWHGKGIZHQXUALLMEEDWOAFARXPAHKXRCRFUSYOFAOZBXHRAHPTCDOZIDNUUEKDNZMBLZOIGPVXSSAUOXFWGETKILMPYILZFXXNODFUYFSBNXKEISYRIAIBPSMXUPXALATTEDPFCDBOCXSDONQGFETOSNJIVQSNIGVHVSFSVYKWDOUKMICENSJQWJBQEZEPRKEROHPZVQYIUBFZIVPMHMRQCCOXIQMASTJSNWLXCICBPGLFMAZNYHPLHKOLDLDTDBJQDOIYHLQROYJWBFEHKJCBCOLAAUNROFPIFWWPTEDOLVUHLVDALPTGHNKNBCFZFDYHUVJJIPWCYUQHNLERAFZTSQAFDBVLXLJGUOUPYYIMWOUTSOTCMYFBDIVZXKAWKPUZHHNXPTXCXJWYNRPONLLNUMPQWDKHMPYZLDMRQJLAYZPNNHEPTDABTFGDNCOSHBZAEDKVNEXLXQZOZHJNNMCKRMHJJTKUZNBXXWMNFTYOWZTPINWMXKMOAFQCMTTBLDKBNRHEVGMJJQEIYQNBUEQSVBAROPKGUOBVVLIOBDKBCCTFMKWYLPNCLSISSYKPFCFXZZEXPCNTUITWPOCVLPHXLWXXMMWARWNGLSBWEXPSHYGWPKBERGGBFAPODPPVXZIUXQMDBKFQGYZHDSPADOAATFWCECADIOODDHSXQNSHKTWIVBCZHMZHLEHMTVOOIRCZEHGJJFNCWXHXWCCIGUHLYQCDSAMIDZVPBQRPTNCXYCMPRNKRQKSYKDHLZCCZMCFOOXUNGOTVXMKSJOOFINSPMOQLGEVWKFFLJGNATXROUVRXAHYFXMXRFEORQDXXDMBWLUGSISFPMFECYHCIOKHNQNUORVPBYBQMMVGBHYMNMBQBHJQATJB");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN_ACCOUNT;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN_ACCOUNT + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.UNKOWN_ACCOUNT));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.util.List<java.lang.String> strList2 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm1 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm2 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList5 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm2.sort(strList5);
        int[] intArray7 = new int[] {};
        bubbleSortAlgorithm2.sort(intArray7);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray13);
        bubbleSortAlgorithm2.sort(byteArray13);
        iteratorMergeSortAlgorithm1.sort(byteArray13);
        char[] charArray17 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        iteratorMergeSortAlgorithm1.sort(charArray17);
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        com.github.edgar615.util.sort.Sorts.bubble(charArray17);
        heapSortAlgorithm0.sort(charArray17);
        com.github.edgar615.util.sort.Sorts.insert(charArray17);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        double[] doubleArray21 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray21);
        iteratorMergeSortAlgorithm0.sort(doubleArray21);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList24 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList25 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op26 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj27 = opLinkedSkipList25.remove(op26);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode29 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray33 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray35 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray36 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray35;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration37 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray36);
        java.util.Enumeration[] enumerationArray39 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray40 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray39;
        objEnumerationArray40[0] = objCompoundEnumeration37;
        float[] floatArray46 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray46);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_48 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode29, shortArray33, objEnumerationArray40, (java.lang.Comparable<java.lang.String>) "hi!", floatArray46);
        short[] shortArray49 = strComparableTuple6_48.getT3();
        java.lang.Object obj50 = opLinkedSkipList24.add(op26, (java.lang.Object) shortArray49);
        iteratorMergeSortAlgorithm0.sort(shortArray49);
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm52 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm53 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList56 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm53.sort(strList56);
        int[] intArray58 = new int[] {};
        bubbleSortAlgorithm53.sort(intArray58);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray64);
        bubbleSortAlgorithm53.sort(byteArray64);
        iteratorMergeSortAlgorithm52.sort(byteArray64);
        char[] charArray68 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray68);
        iteratorMergeSortAlgorithm52.sort(charArray68);
        com.github.edgar615.util.sort.Sorts.bubble(charArray68);
        com.github.edgar615.util.sort.Sorts.bubble(charArray68);
        iteratorMergeSortAlgorithm0.sort(charArray68);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + op26 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op26.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + defaultErrorCode29 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode29.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray35);
        org.junit.Assert.assertNotNull(objEnumerationArray36);
        org.junit.Assert.assertNotNull(enumerationArray39);
        org.junit.Assert.assertNotNull(objEnumerationArray40);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.Object obj1 = com.github.edgar615.util.reflect.ReflectUtils.getProxiedObject((java.lang.Object) "h_m_a_c_s_h_a1");
        org.junit.Assert.assertEquals("'" + obj1 + "' != '" + "h_m_a_c_s_h_a1" + "'", obj1, "h_m_a_c_s_h_a1");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.github.edgar615.util.reflect.MyClassloader myClassloader0 = new com.github.edgar615.util.reflect.MyClassloader();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = myClassloader0.loadClass("F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: F27BE852B4FDAC0A3E90BB46B58C12976C7D7F2E5D4BF99C82D3003BB16439EA");
        } catch (java.lang.ClassNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm0 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.KnuthShellSortAlgorithm knuthShellSortAlgorithm1 = new com.github.edgar615.util.sort.KnuthShellSortAlgorithm();
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm2 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray3 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray3);
        iteratorMergeSortAlgorithm2.sort(charArray3);
        knuthShellSortAlgorithm1.sort(charArray3);
        knuthShellSortAlgorithm0.sort(charArray3);
        com.github.edgar615.util.sort.Sorts.merge(charArray3);
        com.github.edgar615.util.sort.Sorts.selection(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm0 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.String str3 = com.github.edgar615.util.base.EncryptUtils.byte2hex(byteArray2);
        selectionSortAlgorithm0.sort(byteArray2);
        long[] longArray5 = new long[] {};
        com.github.edgar615.util.sort.Sorts.merge(longArray5);
        com.github.edgar615.util.sort.Sorts.selection(longArray5);
        com.github.edgar615.util.sort.Sorts.heap(longArray5);
        selectionSortAlgorithm0.sort(longArray5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = com.github.edgar615.util.reflect.BeanUtils.toMap((java.lang.Object) 10);
        java.lang.String str3 = com.github.edgar615.util.base.MapUtils.getString(strMap1, "HMACSHA1");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.github.edgar615.util.search.Op op0 = com.github.edgar615.util.search.Op.REGEXP;
        org.junit.Assert.assertTrue("'" + op0 + "' != '" + com.github.edgar615.util.search.Op.REGEXP + "'", op0.equals(com.github.edgar615.util.search.Op.REGEXP));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        double[] doubleArray21 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray21);
        iteratorMergeSortAlgorithm0.sort(doubleArray21);
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList24 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList25 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        com.github.edgar615.util.search.Op op26 = com.github.edgar615.util.search.Op.SW;
        java.lang.Object obj27 = opLinkedSkipList25.remove(op26);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode29 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray33 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray35 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray36 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray35;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration37 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray36);
        java.util.Enumeration[] enumerationArray39 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray40 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray39;
        objEnumerationArray40[0] = objCompoundEnumeration37;
        float[] floatArray46 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray46);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_48 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode29, shortArray33, objEnumerationArray40, (java.lang.Comparable<java.lang.String>) "hi!", floatArray46);
        short[] shortArray49 = strComparableTuple6_48.getT3();
        java.lang.Object obj50 = opLinkedSkipList24.add(op26, (java.lang.Object) shortArray49);
        iteratorMergeSortAlgorithm0.sort(shortArray49);
        com.github.edgar615.util.sort.Sorts.shell(shortArray49);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + op26 + "' != '" + com.github.edgar615.util.search.Op.SW + "'", op26.equals(com.github.edgar615.util.search.Op.SW));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + defaultErrorCode29 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode29.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray35);
        org.junit.Assert.assertNotNull(objEnumerationArray36);
        org.junit.Assert.assertNotNull(enumerationArray39);
        org.junit.Assert.assertNotNull(objEnumerationArray40);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray46), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_48);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.github.edgar615.util.sort.MedianOfThreeQuickSortAlgorithm medianOfThreeQuickSortAlgorithm0 = new com.github.edgar615.util.sort.MedianOfThreeQuickSortAlgorithm();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.github.edgar615.util.reflect.NullClassLoader nullClassLoader0 = com.github.edgar615.util.reflect.NullClassLoader.instance();
        java.net.URL uRL2 = nullClassLoader0.getResource("HMACSHA256");
        com.github.edgar615.util.reflect.NullClassLoader nullClassLoader3 = com.github.edgar615.util.reflect.NullClassLoader.instance();
        java.net.URL uRL5 = nullClassLoader3.getResource("HMACSHA256");
        java.lang.ClassLoader classLoader6 = java.lang.ClassLoader.getSystemClassLoader();
        java.lang.ClassLoader[] classLoaderArray7 = new java.lang.ClassLoader[] { classLoader6 };
        java.lang.ClassLoader classLoader8 = com.github.edgar615.util.reflect.ClassLoaderChain.createNewChain(classLoaderArray7);
        java.lang.ClassLoader classLoader9 = com.github.edgar615.util.reflect.ClassLoaderChain.createChain(classLoaderArray7);
        com.github.edgar615.util.reflect.NullClassLoader nullClassLoader10 = com.github.edgar615.util.reflect.NullClassLoader.instance();
        java.net.URL uRL12 = nullClassLoader10.getResource("HMACSHA256");
        java.lang.ClassLoader classLoader13 = java.lang.ClassLoader.getSystemClassLoader();
        java.lang.ClassLoader[] classLoaderArray14 = new java.lang.ClassLoader[] { classLoader13 };
        java.lang.ClassLoader classLoader15 = com.github.edgar615.util.reflect.ClassLoaderChain.createNewChain(classLoaderArray14);
        java.lang.ClassLoader[] classLoaderArray16 = new java.lang.ClassLoader[] { nullClassLoader0, nullClassLoader3, classLoader9, nullClassLoader10, classLoader15 };
        java.util.ArrayList<java.lang.ClassLoader> classLoaderList17 = new java.util.ArrayList<java.lang.ClassLoader>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.ClassLoader>) classLoaderList17, classLoaderArray16);
        java.lang.ClassLoader classLoader20 = com.github.edgar615.util.reflect.ClassLoaderChain.createChain((java.util.List<java.lang.ClassLoader>) classLoaderList17, (java.lang.Boolean) false);
        java.lang.ClassLoader classLoader21 = com.github.edgar615.util.reflect.ClassLoaderChain.createChain((java.util.List<java.lang.ClassLoader>) classLoaderList17);
        org.junit.Assert.assertNotNull(nullClassLoader0);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(nullClassLoader3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(classLoader6);
        org.junit.Assert.assertNotNull(classLoaderArray7);
        org.junit.Assert.assertNotNull(classLoader8);
        org.junit.Assert.assertNotNull(classLoader9);
        org.junit.Assert.assertNotNull(nullClassLoader10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(classLoader13);
        org.junit.Assert.assertNotNull(classLoaderArray14);
        org.junit.Assert.assertNotNull(classLoader15);
        org.junit.Assert.assertNotNull(classLoaderArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(classLoader20);
        org.junit.Assert.assertNotNull(classLoader21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray1 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray1);
        iteratorMergeSortAlgorithm0.sort(charArray1);
        long[] longArray7 = new long[] { ' ', ' ', '#' };
        com.github.edgar615.util.sort.Sorts.quick(longArray7);
        iteratorMergeSortAlgorithm0.sort(longArray7);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[32, 32, 35]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacMd5("5erxihJTGpe1G.eOccCt:.Uor4rtl1.zutOeu3qp.hxl.4.IskTe", "3617925919717533676448998194328724624187624369297141841896246961789144318223582433797791657538563474");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FB1CE7D964A35B551697EB7B2952435F" + "'", str2, "FB1CE7D964A35B551697EB7B2952435F");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = com.github.edgar615.util.net.IPUtils.ipToLong("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.github.edgar615.util.loadbalance.ServiceInstance serviceInstance3 = new com.github.edgar615.util.loadbalance.ServiceInstance("A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC", "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC", (int) (short) 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        short[] shortArray21 = strComparableTuple6_20.getT3();
        java.io.File file24 = com.github.edgar615.util.io.IOUtils.createTempDirectory("CustomErrorCode{number=0, message='hi!'}", "HMACMD5");
        boolean boolean25 = com.github.edgar615.util.io.IOUtils.forceDeletePath(file24);
        boolean boolean26 = com.github.edgar615.util.io.IOUtils.deleteFile(file24);
        boolean boolean27 = strComparableTuple6_20.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(file24);
// flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/CustomErrorCode{number=0, message='hi!'}2429969448882615758");
// flaky:         org.junit.Assert.assertEquals(file24.toString(), "/private/var/folders/6v/t_t9cghd03nfq9mmw9_1tb6r0000gn/T/CustomErrorCode{number=0, message='hi!'}2429969448882615758/HMACMD5");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.github.edgar615.util.sort.RadixSortAlgorithm radixSortAlgorithm0 = new com.github.edgar615.util.sort.RadixSortAlgorithm();
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode2 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray8 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray9 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray8;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration10 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray9);
        java.util.Enumeration[] enumerationArray12 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray13 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray12;
        objEnumerationArray13[0] = objCompoundEnumeration10;
        float[] floatArray19 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray19);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_21 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode2, shortArray6, objEnumerationArray13, (java.lang.Comparable<java.lang.String>) "hi!", floatArray19);
        float[] floatArray22 = strComparableTuple6_21.getT6();
        // The following exception was thrown during execution in test generation
        try {
            radixSortAlgorithm0.sort(floatArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + defaultErrorCode2 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode2.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray8);
        org.junit.Assert.assertNotNull(objEnumerationArray9);
        org.junit.Assert.assertNotNull(enumerationArray12);
        org.junit.Assert.assertNotNull(objEnumerationArray13);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_21);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        double[] doubleArray21 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray21);
        iteratorMergeSortAlgorithm0.sort(doubleArray21);
        com.github.edgar615.util.sort.Sorts.quick(doubleArray21);
        com.github.edgar615.util.sort.Sorts.quick(doubleArray21);
        com.github.edgar615.util.sort.Sorts.quick(doubleArray21);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha256("FB1CE7D964A35B551697EB7B2952435F", "737597DB72C1E0B26143D2D519E03B32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E1BB0A3C4D069199F27171C0EB05CB91C4F5C1A521788F95BE5E31B08366F1B7" + "'", str2, "E1BB0A3C4D069199F27171C0EB05CB91C4F5C1A521788F95BE5E31B08366F1B7");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        int[] intArray6 = new int[] {};
        bubbleSortAlgorithm1.sort(intArray6);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray12);
        bubbleSortAlgorithm1.sort(byteArray12);
        iteratorMergeSortAlgorithm0.sort(byteArray12);
        char[] charArray16 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray16);
        iteratorMergeSortAlgorithm0.sort(charArray16);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode20 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray24 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray26 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray27 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray26;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration28 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray27);
        java.util.Enumeration[] enumerationArray30 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray31 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray30;
        objEnumerationArray31[0] = objCompoundEnumeration28;
        float[] floatArray37 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray37);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_39 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode20, shortArray24, objEnumerationArray31, (java.lang.Comparable<java.lang.String>) "hi!", floatArray37);
        com.github.edgar615.util.sort.Sorts.selection(floatArray37);
        iteratorMergeSortAlgorithm0.sort(floatArray37);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode20 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode20.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray26);
        org.junit.Assert.assertNotNull(objEnumerationArray27);
        org.junit.Assert.assertNotNull(enumerationArray30);
        org.junit.Assert.assertNotNull(objEnumerationArray31);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_39);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.String str2 = com.github.edgar615.util.base.EncryptUtils.encryptHmacSha512("A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC", "EEDA2765E0439518654CA7D0D6A0904895F380785D20B33BEA0BD3FE71A9E7083C8B9C988DFEA9867245A8AAA96990D9DC98D678F3A156B16AF96CCCD037636A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "B07284F1663198CA81BD94E2E2F4EC1948B4A8DDA031B7E519E7A630D5A6E2EFC50A21F98AFBB85EC5CA18BDD3D456F551EE6D1F36B0FA2D342D2B8A1EAC48C7" + "'", str2, "B07284F1663198CA81BD94E2E2F4EC1948B4A8DDA031B7E519E7A630D5A6E2EFC50A21F98AFBB85EC5CA18BDD3D456F551EE6D1F36B0FA2D342D2B8A1EAC48C7");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String str1 = com.github.edgar615.util.base.HexUtils.byteToHex((byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        java.util.Enumeration[] enumerationArray22 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray23 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray22;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration24 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray23);
        boolean boolean25 = strComparableTuple6_20.equals((java.lang.Object) objCompoundEnumeration24);
        float[] floatArray26 = strComparableTuple6_20.getT6();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm27 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList30 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm27.sort(strList30);
        com.github.edgar615.util.sort.Sorts.insert(strList30);
        boolean boolean33 = strComparableTuple6_20.equals((java.lang.Object) strList30);
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 100, 10]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(enumerationArray22);
        org.junit.Assert.assertNotNull(objEnumerationArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.github.edgar615.util.sort.InsertSortAlgorithm insertSortAlgorithm0 = new com.github.edgar615.util.sort.InsertSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm1 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList4 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm1.sort(strList4);
        com.github.edgar615.util.sort.Sorts.insert(strList4);
        insertSortAlgorithm0.sort(strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.ALREADY_EXISTS;
        com.github.edgar615.util.reflect.ReflectionException reflectionException2 = new com.github.edgar615.util.reflect.ReflectionException("HMACSHA256");
        com.github.edgar615.util.exception.SystemException systemException3 = com.github.edgar615.util.exception.SystemException.wrap((com.github.edgar615.util.exception.ErrorCode) defaultErrorCode0, (java.lang.Throwable) reflectionException2);
        com.github.edgar615.util.serialization.SerDeException serDeException4 = new com.github.edgar615.util.serialization.SerDeException((java.lang.Throwable) reflectionException2);
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.ALREADY_EXISTS + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.ALREADY_EXISTS));
        org.junit.Assert.assertNotNull(systemException3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object> opLinkedSkipList0 = new com.github.edgar615.util.collection.LinkedSkipList<com.github.edgar615.util.search.Op, java.lang.Object>();
        long long1 = opLinkedSkipList0.size();
        java.lang.Class<?> wildcardClass2 = opLinkedSkipList0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.io.InputStream inputStream1 = java.lang.ClassLoader.getSystemResourceAsStream("4FDBB60147478639CF291E4089A1F4905CCD98DAD8EFEF22E5D167224656700614F891F4322C3A9E51790D20E5CD4139B19ACB71FE5BA6BA35153BA7EE5F1DD1");
        org.junit.Assert.assertNull(inputStream1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        int[] intArray0 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray0);
        com.github.edgar615.util.sort.Sorts.bubble(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.sort.Sorts.counting(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        long[] longArray4 = new long[] { ' ', ' ', '#' };
        com.github.edgar615.util.sort.Sorts.quick(longArray4);
        com.github.edgar615.util.sort.Sorts.heap(longArray4);
        heapSortAlgorithm0.sort(longArray4);
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm8 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm9 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList12 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm9.sort(strList12);
        int[] intArray14 = new int[] {};
        bubbleSortAlgorithm9.sort(intArray14);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray20);
        bubbleSortAlgorithm9.sort(byteArray20);
        iteratorMergeSortAlgorithm8.sort(byteArray20);
        double[] doubleArray29 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray29);
        iteratorMergeSortAlgorithm8.sort(doubleArray29);
        com.github.edgar615.util.sort.Sorts.quick(doubleArray29);
        heapSortAlgorithm0.sort(doubleArray29);
        com.github.edgar615.util.sort.Sorts.merge(doubleArray29);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 32, 35]");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = com.github.edgar615.util.net.IPUtils.ipv6ToNumber("p5xgQAk1SGsrXm6dAUxxUrEQstLOoVjIprPN8t7zt9D4r6dhfrjIPUqqOPdPQmYQcLuqsCUXLpJ3zsg4MkLnTWTtOGY4ZsWGN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"p5xgQA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.String str0 = com.github.edgar615.util.base.EncryptUtils.MD5;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MD5" + "'", str0, "MD5");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = com.github.edgar615.util.base.EncryptUtils.encryptHMAC("01", "DefaultErrorCode{number=1008, message='Incomplete Parameter'}", "CustomErrorCode{number=0, message='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: java.security.NoSuchAlgorithmException: Algorithm CustomErrorCode{number=0, message='hi!'} not available");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        float[] floatArray1 = new float[] { 1000 };
        com.github.edgar615.util.sort.Sorts.bubble(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[1000.0]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.ALREADY_EXISTS;
        com.github.edgar615.util.reflect.ReflectionException reflectionException2 = new com.github.edgar615.util.reflect.ReflectionException("HMACSHA256");
        com.github.edgar615.util.exception.SystemException systemException3 = com.github.edgar615.util.exception.SystemException.wrap((com.github.edgar615.util.exception.ErrorCode) defaultErrorCode0, (java.lang.Throwable) reflectionException2);
        com.github.edgar615.util.exception.SystemException systemException5 = systemException3.setDetails("HMACSHA256");
        com.github.edgar615.util.exception.SystemException systemException7 = systemException3.setDetails("hi!");
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.ALREADY_EXISTS + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.ALREADY_EXISTS));
        org.junit.Assert.assertNotNull(systemException3);
        org.junit.Assert.assertNotNull(systemException5);
        org.junit.Assert.assertNotNull(systemException7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        java.lang.String[] strArray2 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        double[] doubleArray10 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray10);
        boolean boolean12 = strList3.contains((java.lang.Object) doubleArray10);
        heapSortAlgorithm0.sort((java.util.List<java.lang.String>) strList3);
        double[] doubleArray18 = new double[] { 0, '4', (byte) 100, (-1) };
        heapSortAlgorithm0.sort(doubleArray18);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm20 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray25);
        bubbleSortAlgorithm20.sort(byteArray25);
        short[] shortArray30 = new short[] { (short) 0, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.bubble(shortArray30);
        com.github.edgar615.util.sort.Sorts.heap(shortArray30);
        bubbleSortAlgorithm20.sort(shortArray30);
        heapSortAlgorithm0.sort(shortArray30);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray30), "[0, 0]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        int[] intArray0 = new int[] {};
        com.github.edgar615.util.sort.Sorts.shell(intArray0);
        com.github.edgar615.util.sort.Sorts.shell(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INVALID_TOKEN;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INVALID_TOKEN + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INVALID_TOKEN));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double3 = com.github.edgar615.util.base.MapUtils.getDouble(strMap0, "hi!", (double) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.github.edgar615.util.sort.HeapSortAlgorithm heapSortAlgorithm0 = new com.github.edgar615.util.sort.HeapSortAlgorithm();
        java.lang.String[] strArray2 = new java.lang.String[] { "A7D29F7252A6DF06CEAB0B5D9E5BD24C525DC730A7C9849D3C2A69B181FF49AC" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        double[] doubleArray10 = new double[] { (short) 0, (short) 1, (-1), 10.0d, 10 };
        com.github.edgar615.util.sort.Sorts.bubble(doubleArray10);
        boolean boolean12 = strList3.contains((java.lang.Object) doubleArray10);
        heapSortAlgorithm0.sort((java.util.List<java.lang.String>) strList3);
        com.github.edgar615.util.base.MorePreconditions.checkNoNullElements((java.util.List<java.lang.String>) strList3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.util.List<java.lang.String> strList2 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        com.github.edgar615.util.base.MorePreconditions.checkIndex((java.util.Collection<java.lang.String>) strList2, (int) (byte) 1, "3617925919717533676448998194328724624187624369297141841896246961789144318223582433797791657538563474");
        // The following exception was thrown during execution in test generation
        try {
            com.github.edgar615.util.base.MorePreconditions.checkIndex((java.util.Collection<java.lang.String>) strList2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: The validated collection index is invalid: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode1 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray5 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray7 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray8 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray7;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration9 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray8);
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        objEnumerationArray12[0] = objCompoundEnumeration9;
        float[] floatArray18 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray18);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_20 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode1, shortArray5, objEnumerationArray12, (java.lang.Comparable<java.lang.String>) "hi!", floatArray18);
        short[] shortArray21 = strComparableTuple6_20.getT3();
        com.github.edgar615.util.sort.Sorts.heap(shortArray21);
        org.junit.Assert.assertTrue("'" + defaultErrorCode1 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode1.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray7);
        org.junit.Assert.assertNotNull(objEnumerationArray8);
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_20);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 10, 100]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = defaultErrorCode0.asMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = com.github.edgar615.util.base.MapUtils.removeNull(strMap1);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode3 = com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = defaultErrorCode3.asMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = com.github.edgar615.util.base.MapUtils.removeNull(strMap4);
        com.github.edgar615.util.base.MapUtils.mergeIn(strMap1, strMap5);
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE));
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + defaultErrorCode3 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE + "'", defaultErrorCode3.equals(com.github.edgar615.util.exception.DefaultErrorCode.EXPIRE));
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode0 = com.github.edgar615.util.exception.DefaultErrorCode.INVALID_TYPE;
        org.junit.Assert.assertTrue("'" + defaultErrorCode0 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INVALID_TYPE + "'", defaultErrorCode0.equals(com.github.edgar615.util.exception.DefaultErrorCode.INVALID_TYPE));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.github.edgar615.util.sort.SelectionSortAlgorithm selectionSortAlgorithm0 = new com.github.edgar615.util.sort.SelectionSortAlgorithm();
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        com.github.edgar615.util.sort.Sorts.heap(byteArray5);
        com.github.edgar615.util.sort.Sorts.bubble(byteArray5);
        selectionSortAlgorithm0.sort(byteArray5);
        com.github.edgar615.util.sort.BucketSortAlgorithm bucketSortAlgorithm10 = new com.github.edgar615.util.sort.BucketSortAlgorithm((int) (short) 100);
        com.github.edgar615.util.sort.BubbleSortAlgorithm bubbleSortAlgorithm11 = new com.github.edgar615.util.sort.BubbleSortAlgorithm();
        java.util.List<java.lang.String> strList14 = com.github.edgar615.util.base.StringUtils.splitRemainDelimiter("CustomErrorCode{number=0, message='hi!'}", "hi!");
        bubbleSortAlgorithm11.sort(strList14);
        int[] intArray19 = new int[] { ' ', (-1), 1 };
        com.github.edgar615.util.sort.Sorts.shell(intArray19);
        com.github.edgar615.util.sort.Sorts.merge(intArray19);
        bubbleSortAlgorithm11.sort(intArray19);
        bucketSortAlgorithm10.sort(intArray19);
        selectionSortAlgorithm0.sort(intArray19);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 10]");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 1, 32]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.github.edgar615.util.sort.IteratorMergeSortAlgorithm iteratorMergeSortAlgorithm0 = new com.github.edgar615.util.sort.IteratorMergeSortAlgorithm();
        char[] charArray1 = new char[] {};
        com.github.edgar615.util.sort.Sorts.bubble(charArray1);
        iteratorMergeSortAlgorithm0.sort(charArray1);
        com.github.edgar615.util.exception.DefaultErrorCode defaultErrorCode5 = com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT;
        short[] shortArray9 = new short[] { (short) 10, (short) 100, (byte) 10 };
        java.util.Enumeration[] enumerationArray11 = new java.util.Enumeration[0];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray12 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray11;
        com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object> objCompoundEnumeration13 = new com.github.edgar615.util.collection.CompoundEnumeration<java.lang.Object>(objEnumerationArray12);
        java.util.Enumeration[] enumerationArray15 = new java.util.Enumeration[1];
        @SuppressWarnings("unchecked")
        java.util.Enumeration<java.lang.Object>[] objEnumerationArray16 = (java.util.Enumeration<java.lang.Object>[]) enumerationArray15;
        objEnumerationArray16[0] = objCompoundEnumeration13;
        float[] floatArray22 = new float[] { (short) 0, (short) 0 };
        com.github.edgar615.util.sort.Sorts.selection(floatArray22);
        com.github.edgar615.util.collection.Tuple6<java.lang.Comparable<java.lang.String>, com.github.edgar615.util.exception.DefaultErrorCode, short[], java.util.Enumeration<java.lang.Object>[], java.lang.Comparable<java.lang.String>, float[]> strComparableTuple6_24 = com.github.edgar615.util.collection.Tuple6.create((java.lang.Comparable<java.lang.String>) "CustomErrorCode{number=0, message='hi!'}", defaultErrorCode5, shortArray9, objEnumerationArray16, (java.lang.Comparable<java.lang.String>) "hi!", floatArray22);
        short[] shortArray25 = strComparableTuple6_24.getT3();
        short[] shortArray26 = strComparableTuple6_24.getT3();
        iteratorMergeSortAlgorithm0.sort(shortArray26);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + defaultErrorCode5 + "' != '" + com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT + "'", defaultErrorCode5.equals(com.github.edgar615.util.exception.DefaultErrorCode.INPUT_TOO_SHORT));
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(enumerationArray11);
        org.junit.Assert.assertNotNull(objEnumerationArray12);
        org.junit.Assert.assertNotNull(enumerationArray15);
        org.junit.Assert.assertNotNull(objEnumerationArray16);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(strComparableTuple6_24);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray25), "[10, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[10, 10, 100]");
    }
}
