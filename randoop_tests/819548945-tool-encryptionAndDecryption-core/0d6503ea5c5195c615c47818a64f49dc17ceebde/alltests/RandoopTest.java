package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RandoopTest{


    public static boolean debug = false;



    @Test

    public void test001() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test001");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2S;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHBLAKE2S" + "'", str0, "SM2WITHBLAKE2S");

    }



    @Test

    public void test002() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test002");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-512WithRSA" + "'", str0, "SHA3-512WithRSA");

    }



    @Test

    public void test003() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test003");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2" + "'", str0, "SM2");

    }



    @Test

    public void test004() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test004");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA384 = "SM2";

    }



    @Test

    public void test005() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test005");

        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 100 };

        java.security.PrivateKey privateKey3 = null;

        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray2, privateKey3, byteArray7);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found when length expected");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 100]");

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1]");

    }



    @Test

    public void test006() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test006");

        byte[] byteArray0 = new byte[] {};

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray2 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray0, "SM2WITHBLAKE2S");

            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: no such algorithm: SM2WITHBLAKE2S for provider BC");

        } catch (java.security.NoSuchAlgorithmException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

    }



    @Test

    public void test007() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test007");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHMD5;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHMD5" + "'", str0, "SM2WITHMD5");

    }



    @Test

    public void test008() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test008");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "SHA3-512WithRSA";

    }



    @Test

    public void test009() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test009");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA1WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA1WithRSA" + "'", str0, "SHA1WithRSA");

    }



    @Test

    public void test010() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test010");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM gM0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM();

    }



    @Test

    public void test011() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test011");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_NOPADDING = "hi!";

    }



    @Test

    public void test012() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test012");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA256;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHSHA256" + "'", str0, "SM2WITHSHA256");

    }



    @Test

    public void test013() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test013");

        java.security.PrivateKey privateKey0 = null;

        java.security.cert.Certificate[] certificateArray1 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS12(privateKey0, certificateArray1, "hi!", "");

            org.junit.Assert.fail("Expected exception of type java.security.KeyStoreException; message: PKCS12 does not support non-PrivateKeys");

        } catch (java.security.KeyStoreException e) {

            // Expected exception.

        }

    }



    @Test

    public void test014() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test014");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator keyPairGenerator0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator();

    }



    @Test

    public void test015() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test015");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHRIPEMD160 = "SM2WITHBLAKE2S";

    }



    @Test

    public void test016() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test016");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RSASSA_PSS = "";

    }



    @Test

    public void test017() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test017");

        byte[] byteArray0 = new byte[] {};

        java.security.PrivateKey privateKey1 = null;

        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray0, privateKey1, byteArray7);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 0, 0]");

    }



    @Test

    public void test018() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test018");

        byte[] byteArray0 = new byte[] {};

        java.security.PrivateKey privateKey1 = null;

        byte[] byteArray3 = new byte[] { (byte) -1 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray0, privateKey1, byteArray3);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");

    }



    @Test

    public void test019() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test019");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA224WithRSA" + "'", str0, "SHA224WithRSA");

    }



    @Test

    public void test020() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test020");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS7Padding;

        java.lang.String str1 = cipher0.getKeyType();

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS7Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS7Padding));

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AES" + "'", str1, "AES");

    }



    @Test

    public void test021() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test021");

        byte[] byteArray3 = new byte[] { (byte) -1, (byte) -1, (byte) 10 };

        java.security.PrivateKey privateKey4 = null;

        java.security.cert.X509Certificate x509Certificate5 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray6 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray3, privateKey4, x509Certificate5);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, 10]");

    }



    @Test

    public void test022() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test022");

        java.security.KeyPair keyPair0 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo1 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS12(keyPair0, publicKeyInfo1, "SM2", "SM2WITHBLAKE2S");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test023() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test023");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "AES";

    }



    @Test

    public void test024() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test024");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSASSA_PSS;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RSASSA_PSS" + "'", str0, "RSASSA_PSS");

    }



    @Test

    public void test025() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test025");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA1 = "RSASSA_PSS";

    }



    @Test

    public void test026() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test026");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature signature0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature();

    }



    @Test

    public void test027() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test027");

        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2EncDataC1C2C3ToSM2Cipher(byteArray4);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 10, 0]");

    }



    @Test

    public void test028() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test028");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("");

        java.lang.String str2 = encryptionAndDecryptionException1.toString();

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: " + "'", str2, "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ");

    }



    @Test

    public void test029() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test029");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA384WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA384WithRSA" + "'", str0, "SHA384WithRSA");

    }



    @Test

    public void test030() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test030");

        byte[] byteArray0 = new byte[] {};

        byte[] byteArray2 = new byte[] { (byte) -1 };

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher3 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding;

        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray11 = lich.tool.encryptionAndDecryption.core.SymmetricTool.decrypt(byteArray0, byteArray2, cipher3, byteArray10);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: IV must be 16 bytes long.");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");

        org.junit.Assert.assertTrue("'" + cipher3 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding + "'", cipher3.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding));

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 10, 1, 10, 0]");

    }



    @Test

    public void test031() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test031");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric symmetric0 = new lich.tool.encryptionAndDecryption.ProviderMode.Symmetric();

    }



    @Test

    public void test032() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test032");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA512;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA512" + "'", str0, "SHA512");

    }



    @Test

    public void test033() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test033");

        java.security.KeyPair keyPair0 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(keyPair0, "RSASSA_PSS", "SHA3-512WithRSA");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test034() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test034");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_PKCS1PADDING = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ";

    }



    @Test

    public void test035() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test035");

        byte[] byteArray0 = null;

        java.security.PublicKey publicKey1 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.encrypt(byteArray0, publicKey1, "SHA224WithRSA");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test036() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test036");

        lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool asymmetricTool0 = new lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool();

    }



    @Test

    public void test037() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test037");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA3_512;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-512" + "'", str0, "SHA3-512");

    }



    @Test

    public void test038() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test038");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA224;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA224" + "'", str0, "SHA224");

    }



    @Test

    public void test039() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test039");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHRIPEMD160;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHBLAKE2S" + "'", str0, "SM2WITHBLAKE2S");

    }



    @Test

    public void test040() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test040");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA1WithRSA = "";

    }



    @Test

    public void test041() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test041");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA512;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHSHA512" + "'", str0, "SM2WITHSHA512");

    }



    @Test

    public void test042() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test042");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey3, "SM2WITHBLAKE2S");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test043() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test043");

        byte[] byteArray1 = new byte[] { (byte) 100 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray2 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.GMC1C3C2TOSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");

    }



    @Test

    public void test044() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test044");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA1;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RSASSA_PSS" + "'", str0, "RSASSA_PSS");

    }



    @Test

    public void test045() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test045");

        byte[] byteArray0 = null;

        java.security.PrivateKey privateKey1 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyByEnvelopedKeyBlob(byteArray0, privateKey1);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test046() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test046");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "SM2";

    }



    @Test

    public void test047() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test047");

        java.security.PrivateKey privateKey0 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray1 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toEnvelopedKeyBlobByGMPrivateKey(privateKey0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test048() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test048");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "SHA3-512WithRSA";

    }



    @Test

    public void test049() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test049");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_NOPadding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_NOPadding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_NOPadding));

    }



    @Test

    public void test050() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test050");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA = "AES";

    }



    @Test

    public void test051() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test051");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("");

        java.lang.Class<?> wildcardClass2 = encryptionAndDecryptionException1.getClass();

        org.junit.Assert.assertNotNull(wildcardClass2);

    }



    @Test

    public void test052() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test052");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.DEFAULT = "SHA3-512";

    }



    @Test

    public void test053() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test053");

        lich.tool.encryptionAndDecryption.ext.SM1Ext sM1Ext0 = null;

        lich.tool.encryptionAndDecryption.core.Base.setSm1ext(sM1Ext0);

    }



    @Test

    public void test054() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test054");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SM3;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM3" + "'", str0, "SM3");

    }



    @Test

    public void test055() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test055");

        lich.tool.encryptionAndDecryption.ProviderMode.Check check0 = new lich.tool.encryptionAndDecryption.ProviderMode.Check();

        java.lang.Class<?> wildcardClass1 = check0.getClass();

        org.junit.Assert.assertNotNull(wildcardClass1);

    }



    @Test

    public void test056() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test056");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2SignatureToRS(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test057() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test057");

        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };

        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0 };

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher6 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray2, byteArray5, cipher6);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: Key length not 128/192/256 bits.");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0]");

        org.junit.Assert.assertTrue("'" + cipher6 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding + "'", cipher6.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding));

    }



    @Test

    public void test058() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test058");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.X509Certificate x509Certificate4 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey3, x509Certificate4);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(x509Certificate4);

    }



    @Test

    public void test059() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test059");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = null;

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean8 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray1, byteArray4, publicKey6, "SHA224");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");

        org.junit.Assert.assertNull(publicKey5);

    }



    @Test

    public void test060() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test060");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA1WithRSA = "SHA3-512";

    }



    @Test

    public void test061() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test061");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric asymmetric0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric();

    }



    @Test

    public void test062() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test062");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = null;

        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray1, privateKey3, byteArray8);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 1, 0]");

    }



    @Test

    public void test063() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test063");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "SHA1WithRSA";

    }



    @Test

    public void test064() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test064");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA = "SM2WITHSHA512";

    }



    @Test

    public void test065() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test065");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA384;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2" + "'", str0, "SM2");

    }



    @Test

    public void test066() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test066");

        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray3, false);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, -1, 1]");

    }



    @Test

    public void test067() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test067");

        java.security.KeyPair keyPair0 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyPairTool.generateGMKeyPair();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo1 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS12(keyPair0, publicKeyInfo1, "hi!", "hi!");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(keyPair0);

    }



    @Test

    public void test068() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test068");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "";

    }



    @Test

    public void test069() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test069");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray2 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        byte[] byteArray5 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray5);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = defaultSM4Ext0.encrypt(byteArray2, byteArray5);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test070() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test070");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.KeyStore.PKCS12;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pkcs12" + "'", str0, "pkcs12");

    }



    @Test

    public void test071() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test071");

        java.security.PrivateKey privateKey0 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray1 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.getPrivateKeyBytes(privateKey0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test072() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test072");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL = "SHA512";

    }



    @Test

    public void test073() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test073");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSM3;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHSM3" + "'", str0, "SM2WITHSM3");

    }



    @Test

    public void test074() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test074");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSA = "SM2WITHSM3";

    }



    @Test

    public void test075() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test075");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_NOPADDING = "pkcs12";

    }



    @Test

    public void test076() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test076");

        java.security.KeyPair keyPair0 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyPairTool.generateGMKeyPair();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(keyPair0, "RSASSA_PSS", "SHA1WithRSA");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: improperly specified input name: RSASSA_PSS");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(keyPair0);

    }



    @Test

    public void test077() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test077");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA384;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA384" + "'", str0, "SHA384");

    }



    @Test

    public void test078() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test078");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.X509Certificate x509Certificate4 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey3, x509Certificate4);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(x509Certificate4);

    }



    @Test

    public void test079() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test079");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2SignatureToRS(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: unexpected end-of-contents marker");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test080() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test080");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA384WithRSA = "SM2WITHBLAKE2S";

    }



    @Test

    public void test081() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test081");

        java.security.PublicKey publicKey0 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray1 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getPublicKeyByte(publicKey0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test082() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test082");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.DEFAULT = "SHA384WithRSA";

    }



    @Test

    public void test083() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test083");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_224WithRSA = "SHA3-512WithRSA";

    }



    @Test

    public void test084() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test084");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SHA256WITHSM2 = "pkcs12";

    }



    @Test

    public void test085() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test085");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA512WithRSA = "hi!";

    }



    @Test

    public void test086() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test086");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA224;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHSHA224" + "'", str0, "SM2WITHSHA224");

    }



    @Test

    public void test087() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test087");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2EncDataC1C2C3ToSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test088() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test088");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        java.security.PublicKey publicKey3 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.encrypt(byteArray1, publicKey3, "SM2WITHSHA512");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test089() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test089");

        byte[] byteArray0 = new byte[] {};

        byte[] byteArray1 = new byte[] {};

        byte[] byteArray2 = new byte[] {};

        byte[][] byteArray3 = new byte[][] { byteArray0, byteArray1, byteArray2 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.certificateChainToP7b(byteArray3, true);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no content found");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");

        org.junit.Assert.assertNotNull(byteArray3);

    }



    @Test

    public void test090() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test090");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSA = "SHA1WithRSA";

    }



    @Test

    public void test091() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test091");

        lich.tool.encryptionAndDecryption.ProviderMode providerMode0 = new lich.tool.encryptionAndDecryption.ProviderMode();

    }



    @Test

    public void test092() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test092");

        java.security.PrivateKey privateKey0 = null;

        java.security.PublicKey publicKey1 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(privateKey0, publicKey1, "", "");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test093() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test093");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray1, byteArray4);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");

        org.junit.Assert.assertNull(publicKey5);

    }



    @Test

    public void test094() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test094");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_PKCS7Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_PKCS7Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_PKCS7Padding));

    }



    @Test

    public void test095() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test095");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");

    }



    @Test

    public void test096() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test096");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "SHA224";

    }



    @Test

    public void test097() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test097");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2B;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHBLAKE2B" + "'", str0, "SM2WITHBLAKE2B");

    }



    @Test

    public void test098() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test098");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_PKCS5Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_PKCS5Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_PKCS5Padding));

    }



    @Test

    public void test099() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test099");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "AES";

    }



    @Test

    public void test100() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test100");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA384WithRSA");

        java.lang.String str2 = encryptionAndDecryptionException1.toString();

        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA" + "'", str2, "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA");

    }



    @Test

    public void test101() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test101");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA3_256;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-256" + "'", str0, "SHA3-256");

    }



    @Test

    public void test102() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test102");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };

        java.security.cert.X509Certificate x509Certificate9 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean10 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray1, byteArray8, x509Certificate9);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 100, 0, -1, 0]");

        org.junit.Assert.assertNotNull(x509Certificate9);

    }



    @Test

    public void test103() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test103");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA3_224;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-224" + "'", str0, "SHA3-224");

    }



    @Test

    public void test104() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test104");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2S = "SHA3-512WithRSA";

    }



    @Test

    public void test105() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test105");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = publicKeyInfo3.getNotAfter();

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNull(date5);

    }



    @Test

    public void test106() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test106");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_PKCS7Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_PKCS7Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_PKCS7Padding));

    }



    @Test

    public void test107() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test107");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.decrypt(byteArray1, privateKey3, "SHA1WithRSA");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test108() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test108");

        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToX509Certificate(byteArray2, true);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0]");

    }



    @Test

    public void test109() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test109");

        java.security.PrivateKey privateKey0 = null;

        java.security.cert.Certificate certificate1 = null;

        java.security.PrivateKey privateKey2 = null;

        java.security.cert.Certificate[] certificateArray3 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data4 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate1, privateKey2, certificateArray3);

        java.security.cert.Certificate[] certificateArray5 = p12Data4.getCertificateChain();

        java.security.cert.Certificate[] certificateArray6 = p12Data4.getCertificateChain();

        java.security.cert.Certificate certificate7 = p12Data4.getCert();

        java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate certificate10 = null;

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate[] certificateArray12 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate10, privateKey11, certificateArray12);

        java.security.cert.Certificate[] certificateArray14 = p12Data13.getCertificateChain();

        java.security.cert.Certificate[] certificateArray15 = p12Data13.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data16 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey9, certificateArray15);

        java.security.cert.Certificate certificate17 = null;

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate[] certificateArray19 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data20 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate17, privateKey18, certificateArray19);

        java.security.cert.Certificate[] certificateArray21 = p12Data20.getCertificateChain();

        java.security.cert.Certificate[] certificateArray22 = p12Data20.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate23 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey24 = null;

        java.security.cert.Certificate certificate25 = null;

        java.security.PrivateKey privateKey26 = null;

        java.security.cert.Certificate[] certificateArray27 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data28 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate25, privateKey26, certificateArray27);

        java.security.cert.Certificate[] certificateArray29 = p12Data28.getCertificateChain();

        java.security.cert.Certificate[] certificateArray30 = p12Data28.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data31 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate23, privateKey24, certificateArray30);

        p12Data20.setCert((java.security.cert.Certificate) x509Certificate23);

        java.security.cert.X509Certificate x509Certificate33 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey34 = null;

        java.security.cert.Certificate certificate35 = null;

        java.security.PrivateKey privateKey36 = null;

        java.security.cert.Certificate[] certificateArray37 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data38 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate35, privateKey36, certificateArray37);

        java.security.cert.Certificate[] certificateArray39 = p12Data38.getCertificateChain();

        java.security.cert.Certificate[] certificateArray40 = p12Data38.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data41 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate33, privateKey34, certificateArray40);

        java.security.cert.X509Certificate x509Certificate42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate certificate44 = null;

        java.security.PrivateKey privateKey45 = null;

        java.security.cert.Certificate[] certificateArray46 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate44, privateKey45, certificateArray46);

        java.security.cert.Certificate[] certificateArray48 = p12Data47.getCertificateChain();

        java.security.cert.Certificate[] certificateArray49 = p12Data47.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data50 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey43, certificateArray49);

        java.security.cert.X509Certificate x509Certificate51 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey52 = null;

        java.security.cert.Certificate certificate53 = null;

        java.security.PrivateKey privateKey54 = null;

        java.security.cert.Certificate[] certificateArray55 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data56 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate53, privateKey54, certificateArray55);

        java.security.cert.Certificate[] certificateArray57 = p12Data56.getCertificateChain();

        java.security.cert.Certificate[] certificateArray58 = p12Data56.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data59 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate51, privateKey52, certificateArray58);

        java.security.cert.Certificate[] certificateArray60 = new java.security.cert.Certificate[] { x509Certificate8, x509Certificate23, x509Certificate33, x509Certificate42, x509Certificate51 };

        p12Data4.setCertificateChain(certificateArray60);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray64 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS12(privateKey0, certificateArray60, "SM2WITHSHA224", "pkcs12");

            org.junit.Assert.fail("Expected exception of type java.security.KeyStoreException; message: PKCS12 does not support non-PrivateKeys");

        } catch (java.security.KeyStoreException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray3);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNull(certificate7);

        org.junit.Assert.assertNotNull(x509Certificate8);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(x509Certificate23);

        org.junit.Assert.assertNotNull(certificateArray27);

        org.junit.Assert.assertNotNull(certificateArray29);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(x509Certificate33);

        org.junit.Assert.assertNotNull(certificateArray37);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(certificateArray40);

        org.junit.Assert.assertNotNull(x509Certificate42);

        org.junit.Assert.assertNotNull(certificateArray46);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(x509Certificate51);

        org.junit.Assert.assertNotNull(certificateArray55);

        org.junit.Assert.assertNotNull(certificateArray57);

        org.junit.Assert.assertNotNull(certificateArray58);

        org.junit.Assert.assertNotNull(certificateArray60);

    }



    @Test

    public void test110() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test110");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1 };

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher6 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_PKCS7Padding;

        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray14 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray5, cipher6, byteArray13);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: ECB mode does not use an IV");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1]");

        org.junit.Assert.assertTrue("'" + cipher6 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_PKCS7Padding + "'", cipher6.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_PKCS7Padding));

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0, 0, 0, 10]");

    }



    @Test

    public void test111() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test111");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.MD2;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MD2" + "'", str0, "MD2");

    }



    @Test

    public void test112() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test112");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHSHA512" + "'", str0, "SM2WITHSHA512");

    }



    @Test

    public void test113() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test113");

        java.security.PrivateKey privateKey0 = lich.tool.encryptionAndDecryption.core.Base.getRootGMPrivateKey();

// flaky:         org.junit.Assert.assertNull(privateKey0);

    }



    @Test

    public void test114() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test114");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ";

    }



    @Test

    public void test115() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test115");

        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyByEnvelopedKeyBlob(byteArray4);

            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 1, 1]");

    }



    @Test

    public void test116() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test116");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_224WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-512WithRSA" + "'", str0, "SHA3-512WithRSA");

    }



    @Test

    public void test117() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test117");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray1, false);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

    }



    @Test

    public void test118() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test118");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_NOPadding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_NOPadding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_NOPadding));

    }



    @Test

    public void test119() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test119");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray6 = p12Data3.getCertificateChain();

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray6);

    }



    @Test

    public void test120() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test120");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_PKCS5Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_PKCS5Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_PKCS5Padding));

    }



    @Test

    public void test121() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test121");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray4, "SM2WITHMD5");

            org.junit.Assert.fail("Expected exception of type java.security.NoSuchAlgorithmException; message: no such algorithm: SM2WITHMD5 for provider BC");

        } catch (java.security.NoSuchAlgorithmException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test122() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test122");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA384 = "AES";

    }



    @Test

    public void test123() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test123");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.KeyStore.PKCS12 = "SM2WITHBLAKE2B";

    }



    @Test

    public void test124() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test124");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_NOPADDING;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pkcs12" + "'", str0, "pkcs12");

    }



    @Test

    public void test125() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test125");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        lich.tool.encryptionAndDecryption.core.Base.setSm4ext((lich.tool.encryptionAndDecryption.ext.SM4Ext) defaultSM4Ext0);

        byte[] byteArray3 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray3);

        byte[] byteArray6 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6);

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray3, byteArray6);

        byte[] byteArray10 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray10);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray12 = defaultSM4Ext0.decrypt(byteArray3, byteArray10);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");

        org.junit.Assert.assertNull(publicKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");

        org.junit.Assert.assertNull(publicKey11);

    }



    @Test

    public void test126() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test126");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSA = "SM2WITHSHA256";

    }



    @Test

    public void test127() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test127");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher cipher0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher();

    }



    @Test

    public void test128() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test128");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC = "";

    }



    @Test

    public void test129() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test129");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA384 = "SHA3-224";

    }



    @Test

    public void test130() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test130");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RAWRSASSA_PSS = "SHA3-512WithRSA";

    }



    @Test

    public void test131() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test131");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_PKCS1PADDING = "SM3";

    }



    @Test

    public void test132() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test132");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherToSM2EncDataC1C2C3(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test133() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test133");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.DEFAULT;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA384WithRSA" + "'", str0, "SHA384WithRSA");

    }



    @Test

    public void test134() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test134");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherTOGMC1C3C2(byteArray4);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: unexpected end-of-contents marker");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test135() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test135");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_256WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-256WithRSA" + "'", str0, "SHA3-256WithRSA");

    }



    @Test

    public void test136() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test136");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA256WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA256WithRSA" + "'", str0, "SHA256WithRSA");

    }



    @Test

    public void test137() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test137");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo8 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHSHA256");

        org.junit.Assert.assertNotNull(bigInteger4);

    }



    @Test

    public void test138() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test138");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA384 = "SM2WITHMD5";

    }



    @Test

    public void test139() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test139");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_PKCS5Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_PKCS5Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_PKCS5Padding));

    }



    @Test

    public void test140() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test140");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA = "SHA224WithRSA";

    }



    @Test

    public void test141() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test141");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RAWRSASSA_PSS;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-512WithRSA" + "'", str0, "SHA3-512WithRSA");

    }



    @Test

    public void test142() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test142");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.util.Date date4 = null;

        publicKeyInfo3.setNotAfter(date4);

        java.security.PublicKey publicKey6 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getX509Certificate(publicKeyInfo3, publicKey6);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: badly formatted directory string");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test143() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test143");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SHA256WITHSM2;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pkcs12" + "'", str0, "pkcs12");

    }



    @Test

    public void test144() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test144");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        java.security.PrivateKey privateKey7 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray9 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey7, x509Certificate8);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(privateKey7);

        org.junit.Assert.assertNotNull(x509Certificate8);

    }



    @Test

    public void test145() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test145");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_NOPadding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_NOPadding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_NOPadding));

    }



    @Test

    public void test146() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test146");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2EncDataC1C2C3ToSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

    }



    @Test

    public void test147() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test147");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        java.security.PrivateKey privateKey7 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray9 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.decrypt(byteArray4, privateKey7, "SM2");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(privateKey7);

    }



    @Test

    public void test148() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test148");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHMD5 = "SHA3-512WithRSA";

    }



    @Test

    public void test149() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test149");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.RSToSM2Signature(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test150() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test150");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RAWRSASSA_PSS = "SM2WITHSM3";

    }



    @Test

    public void test151() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test151");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_PKCS7Padding;

        java.lang.String str1 = cipher0.getKeyType();

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_PKCS7Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_PKCS7Padding));

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AES" + "'", str1, "AES");

    }



    @Test

    public void test152() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test152");

        java.security.cert.X509Certificate x509Certificate0 = lich.tool.encryptionAndDecryption.core.Base.getRootGMX509Certificate();

// flaky:         org.junit.Assert.assertNull(x509Certificate0);

    }



    @Test

    public void test153() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test153");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA3_384;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-384" + "'", str0, "SHA3-384");

    }



    @Test

    public void test154() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test154");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "SHA512";

    }



    @Test

    public void test155() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test155");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.lang.String str10 = publicKeyInfo9.getSignatureAlgorithm();

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");

    }



    @Test

    public void test156() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test156");

        java.security.KeyPair keyPair0 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(keyPair0, "", "RSASSA_PSS");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test157() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test157");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "RSASSA_PSS";

    }



    @Test

    public void test158() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test158");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SM3WITHSM2 = "SHA384WithRSA";

    }



    @Test

    public void test159() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test159");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray8);

        byte[] byteArray11 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey12 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray11);

        java.security.PublicKey publicKey13 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray8, byteArray11);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKey(byteArray4, byteArray11);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Scalar is not in the interval [1, n - 1]");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNotNull(byteArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");

        org.junit.Assert.assertNull(publicKey12);

        org.junit.Assert.assertNull(publicKey13);

    }



    @Test

    public void test160() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test160");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data6 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.loadPKCS12(byteArray1, "MD2");

            org.junit.Assert.fail("Expected exception of type java.security.KeyStoreException; message: SM2WITHBLAKE2B not found");

        } catch (java.security.KeyStoreException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

    }



    @Test

    public void test161() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test161");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHMD5 = "SM2WITHBLAKE2B";

    }



    @Test

    public void test162() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test162");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA384WithRSA = "SM2WITHSM3";

    }



    @Test

    public void test163() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test163");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHRIPEMD160 = "SM3";

    }



    @Test

    public void test164() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test164");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_224WithRSA = "SHA384WithRSA";

    }



    @Test

    public void test165() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test165");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA";

    }



    @Test

    public void test166() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test166");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SM3WITHSM2;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA384WithRSA" + "'", str0, "SHA384WithRSA");

    }



    @Test

    public void test167() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test167");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.DEFAULT;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-512" + "'", str0, "SHA3-512");

    }



    @Test

    public void test168() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test168");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA512WithRSA = "SHA3-512WithRSA";

    }



    @Test

    public void test169() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test169");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "SHA384WithRSA";

    }



    @Test

    public void test170() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test170");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SM3WITHSM2 = "";

    }



    @Test

    public void test171() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test171");

        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        byte[] byteArray5 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray5);

        byte[] byteArray8 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray8);

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5, byteArray8);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey11 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray2, byteArray8);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: corrupted stream - invalid high tag number found");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNull(publicKey10);

    }



    @Test

    public void test172() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test172");

        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        // The following exception was thrown during execution in test generation

        try {

            lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data5 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.loadPKCS12(byteArray2, "SM2WITHSM3");

            org.junit.Assert.fail("Expected exception of type java.security.KeyStoreException; message: SM2WITHBLAKE2B not found");

        } catch (java.security.KeyStoreException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");

        org.junit.Assert.assertNull(publicKey3);

    }



    @Test

    public void test173() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test173");

        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };

        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray8);

        java.security.cert.X509Certificate x509Certificate10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate certificate12 = null;

        java.security.PrivateKey privateKey13 = null;

        java.security.cert.Certificate[] certificateArray14 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate12, privateKey13, certificateArray14);

        java.security.cert.Certificate[] certificateArray16 = p12Data15.getCertificateChain();

        java.security.cert.Certificate[] certificateArray17 = p12Data15.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data18 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate10, privateKey11, certificateArray17);

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean19 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray5, byteArray8, x509Certificate10);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 100, 10, 100]");

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNotNull(x509Certificate10);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray17);

    }



    @Test

    public void test174() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test174");

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool0 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey1 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate2 = null;

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.Certificate[] certificateArray4 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data5 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate2, privateKey3, certificateArray4);

        java.security.cert.Certificate[] certificateArray6 = p12Data5.getCertificateChain();

        java.security.cert.Certificate[] certificateArray7 = p12Data5.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate certificate10 = null;

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate[] certificateArray12 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate10, privateKey11, certificateArray12);

        java.security.cert.Certificate[] certificateArray14 = p12Data13.getCertificateChain();

        java.security.cert.Certificate[] certificateArray15 = p12Data13.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data16 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey9, certificateArray15);

        p12Data5.setCert((java.security.cert.Certificate) x509Certificate8);

        java.security.PrivateKey privateKey18 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data24 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey18, certificateArray23);

        symmetricTool0.setRSAroot(privateKey1, x509Certificate8);

        java.security.PublicKey publicKey26 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray29 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(privateKey1, publicKey26, "SM3", "SHA512");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: improperly specified input name: SM3");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(privateKey1);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(x509Certificate8);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(privateKey18);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

    }



    @Test

    public void test175() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test175");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_NOPadding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_NOPadding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_NOPadding));

    }



    @Test

    public void test176() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test176");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherTOGMC1C3C2(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test177() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test177");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        java.security.PublicKey publicKey7 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray9 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.encrypt(byteArray4, publicKey7, "hi!");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test178() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test178");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToX509Certificate(byteArray1, true);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

    }



    @Test

    public void test179() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test179");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "SM2WITHBLAKE2B";

    }



    @Test

    public void test180() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test180");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA512 = "pkcs12";

    }



    @Test

    public void test181() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test181");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_224WithRSA = "SHA3-256WithRSA";

    }



    @Test

    public void test182() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test182");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "SM2";

    }



    @Test

    public void test183() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test183");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.KeyStore.PKCS12 = "SM2WITHSHA256";

    }



    @Test

    public void test184() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test184");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        java.security.PublicKey publicKey9 = null;

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean11 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray1, byteArray6, publicKey9, "SHA1WithRSA");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

    }



    @Test

    public void test185() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test185");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "SHA3-512WithRSA";

    }



    @Test

    public void test186() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test186");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA224 = "AES";

    }



    @Test

    public void test187() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test187");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.KeyStore.PKCS12 = "";

    }



    @Test

    public void test188() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test188");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey5 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyByEnvelopedKeyBlob(byteArray1, privateKey5);

            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(privateKey5);

    }



    @Test

    public void test189() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test189");

        lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool privateKeyTool0 = new lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool();

    }



    @Test

    public void test190() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test190");

        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        byte[] byteArray5 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray2, byteArray5);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: corrupted stream - invalid high tag number found");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test191() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test191");

        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        java.security.cert.Certificate certificate4 = null;

        java.security.PrivateKey privateKey5 = null;

        java.security.cert.Certificate[] certificateArray6 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data7 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate4, privateKey5, certificateArray6);

        java.security.cert.Certificate[] certificateArray8 = p12Data7.getCertificateChain();

        java.security.cert.Certificate[] certificateArray9 = p12Data7.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate certificate12 = null;

        java.security.PrivateKey privateKey13 = null;

        java.security.cert.Certificate[] certificateArray14 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate12, privateKey13, certificateArray14);

        java.security.cert.Certificate[] certificateArray16 = p12Data15.getCertificateChain();

        java.security.cert.Certificate[] certificateArray17 = p12Data15.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data18 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate10, privateKey11, certificateArray17);

        p12Data7.setCert((java.security.cert.Certificate) x509Certificate10);

        java.security.PrivateKey privateKey20 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate21 = null;

        java.security.PrivateKey privateKey22 = null;

        java.security.cert.Certificate[] certificateArray23 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data24 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate21, privateKey22, certificateArray23);

        java.security.cert.Certificate[] certificateArray25 = p12Data24.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data26 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate10, privateKey20, certificateArray25);

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool27 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey28 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate29 = null;

        java.security.PrivateKey privateKey30 = null;

        java.security.cert.Certificate[] certificateArray31 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data32 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate29, privateKey30, certificateArray31);

        java.security.cert.Certificate[] certificateArray33 = p12Data32.getCertificateChain();

        java.security.cert.Certificate[] certificateArray34 = p12Data32.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate35 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey36 = null;

        java.security.cert.Certificate certificate37 = null;

        java.security.PrivateKey privateKey38 = null;

        java.security.cert.Certificate[] certificateArray39 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate37, privateKey38, certificateArray39);

        java.security.cert.Certificate[] certificateArray41 = p12Data40.getCertificateChain();

        java.security.cert.Certificate[] certificateArray42 = p12Data40.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data43 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate35, privateKey36, certificateArray42);

        p12Data32.setCert((java.security.cert.Certificate) x509Certificate35);

        java.security.PrivateKey privateKey45 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate46 = null;

        java.security.PrivateKey privateKey47 = null;

        java.security.cert.Certificate[] certificateArray48 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data49 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate46, privateKey47, certificateArray48);

        java.security.cert.Certificate[] certificateArray50 = p12Data49.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data51 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate35, privateKey45, certificateArray50);

        symmetricTool27.setRSAroot(privateKey28, x509Certificate35);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray53 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray2, privateKey20, x509Certificate35);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(certificateArray8);

        org.junit.Assert.assertNotNull(certificateArray9);

        org.junit.Assert.assertNotNull(x509Certificate10);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray17);

        org.junit.Assert.assertNotNull(privateKey20);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray25);

        org.junit.Assert.assertNotNull(privateKey28);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNotNull(certificateArray33);

        org.junit.Assert.assertNotNull(certificateArray34);

        org.junit.Assert.assertNotNull(x509Certificate35);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(certificateArray42);

        org.junit.Assert.assertNotNull(privateKey45);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(certificateArray50);

    }



    @Test

    public void test192() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test192");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL = "SM2WITHSHA224";

    }



    @Test

    public void test193() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test193");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA256;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA256" + "'", str0, "SHA256");

    }



    @Test

    public void test194() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test194");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "SM2WITHSHA256";

    }



    @Test

    public void test195() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test195");

        byte[] byteArray0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey1 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyByEnvelopedKeyBlob(byteArray0);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test196() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test196");

        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };

        java.security.PublicKey publicKey6 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.encrypt(byteArray5, publicKey6, "SM2WITHSHA512");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 0, 100, -1]");

    }



    @Test

    public void test197() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test197");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA = "hi!";

    }



    @Test

    public void test198() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test198");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray5 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray5);

        byte[] byteArray8 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray8);

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5, byteArray8);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher11 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding;

        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray16 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray5, cipher11, byteArray15);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: IV must be 16 bytes long.");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNull(publicKey10);

        org.junit.Assert.assertTrue("'" + cipher11 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding + "'", cipher11.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding));

        org.junit.Assert.assertNotNull(byteArray15);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 10]");

    }



    @Test

    public void test199() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test199");

        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1 };

        java.security.PrivateKey privateKey5 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray4, privateKey5, "MD2");

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, -1]");

    }



    @Test

    public void test200() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test200");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1 };

        byte[] byteArray5 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray5);

        java.security.PrivateKey privateKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray5);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray5);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray9 = defaultSM4Ext0.encrypt(byteArray3, byteArray5);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, -1]");

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(privateKey8);

    }



    @Test

    public void test201() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test201");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_NOPadding;

        java.lang.String str1 = cipher0.getAlgorithm();

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_NOPadding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_NOPadding));

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AES/CBC/NOPadding" + "'", str1, "AES/CBC/NOPadding");

    }



    @Test

    public void test202() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test202");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray1, true);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test203() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test203");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher9 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_NOPadding;

        java.lang.String str10 = cipher9.getKeyType();

        byte[] byteArray12 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey13 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray12);

        byte[] byteArray15 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray15);

        java.security.PublicKey publicKey17 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray12, byteArray15);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray18 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray6, cipher9, byteArray12);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: IV must be 16 bytes long.");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertTrue("'" + cipher9 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_NOPadding + "'", cipher9.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_NOPadding));

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AES" + "'", str10, "AES");

        org.junit.Assert.assertNotNull(byteArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");

        org.junit.Assert.assertNull(publicKey13);

        org.junit.Assert.assertNotNull(byteArray15);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");

        org.junit.Assert.assertNull(publicKey16);

        org.junit.Assert.assertNull(publicKey17);

    }



    @Test

    public void test204() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test204");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA256 = "";

    }



    @Test

    public void test205() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test205");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator keyPairGenerator0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator();

    }



    @Test

    public void test206() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test206");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = p12Data3.getCert();

        java.security.PrivateKey privateKey7 = p12Data3.getPrivateKey();

        java.security.PrivateKey privateKey8 = p12Data3.getPrivateKey();

        java.security.cert.Certificate[] certificateArray9 = p12Data3.getCertificateChain();

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(certificate6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNotNull(certificateArray9);

    }



    @Test

    public void test207() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test207");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA224WithRSA = "SM2WITHSHA512";

    }



    @Test

    public void test208() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test208");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA";

    }



    @Test

    public void test209() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test209");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RSASSA_PSS = "MD2";

    }



    @Test

    public void test210() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test210");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        java.security.cert.Certificate certificate7 = null;

        java.security.PrivateKey privateKey8 = null;

        java.security.cert.Certificate[] certificateArray9 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data10 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate7, privateKey8, certificateArray9);

        java.security.cert.Certificate[] certificateArray11 = p12Data10.getCertificateChain();

        java.security.cert.Certificate[] certificateArray12 = p12Data10.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate13 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey14 = null;

        java.security.cert.Certificate certificate15 = null;

        java.security.PrivateKey privateKey16 = null;

        java.security.cert.Certificate[] certificateArray17 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data18 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate15, privateKey16, certificateArray17);

        java.security.cert.Certificate[] certificateArray19 = p12Data18.getCertificateChain();

        java.security.cert.Certificate[] certificateArray20 = p12Data18.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data21 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate13, privateKey14, certificateArray20);

        p12Data10.setCert((java.security.cert.Certificate) x509Certificate13);

        java.security.PrivateKey privateKey23 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate24 = null;

        java.security.PrivateKey privateKey25 = null;

        java.security.cert.Certificate[] certificateArray26 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data27 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate24, privateKey25, certificateArray26);

        java.security.cert.Certificate[] certificateArray28 = p12Data27.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate13, privateKey23, certificateArray28);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey30 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyByEnvelopedKeyBlob(byteArray4, privateKey23);

            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(certificateArray9);

        org.junit.Assert.assertNotNull(certificateArray11);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(x509Certificate13);

        org.junit.Assert.assertNotNull(certificateArray17);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(certificateArray20);

        org.junit.Assert.assertNotNull(privateKey23);

        org.junit.Assert.assertNotNull(certificateArray26);

        org.junit.Assert.assertNotNull(certificateArray28);

    }



    @Test

    public void test211() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test211");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.GMC1C3C2TOSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(publicKey3);

    }



    @Test

    public void test212() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test212");

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool0 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey1 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate2 = null;

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.Certificate[] certificateArray4 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data5 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate2, privateKey3, certificateArray4);

        java.security.cert.Certificate[] certificateArray6 = p12Data5.getCertificateChain();

        java.security.cert.Certificate[] certificateArray7 = p12Data5.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate certificate10 = null;

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate[] certificateArray12 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate10, privateKey11, certificateArray12);

        java.security.cert.Certificate[] certificateArray14 = p12Data13.getCertificateChain();

        java.security.cert.Certificate[] certificateArray15 = p12Data13.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data16 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey9, certificateArray15);

        p12Data5.setCert((java.security.cert.Certificate) x509Certificate8);

        java.security.PrivateKey privateKey18 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data24 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey18, certificateArray23);

        symmetricTool0.setRSAroot(privateKey1, x509Certificate8);

        java.security.cert.Certificate certificate26 = null;

        java.security.PrivateKey privateKey27 = null;

        java.security.cert.Certificate[] certificateArray28 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate26, privateKey27, certificateArray28);

        java.security.cert.Certificate[] certificateArray30 = p12Data29.getCertificateChain();

        java.security.cert.Certificate[] certificateArray31 = p12Data29.getCertificateChain();

        java.security.cert.Certificate certificate32 = p12Data29.getCert();

        java.security.PrivateKey privateKey33 = p12Data29.getPrivateKey();

        java.security.PrivateKey privateKey34 = p12Data29.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool35 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey36 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate37 = null;

        java.security.PrivateKey privateKey38 = null;

        java.security.cert.Certificate[] certificateArray39 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate37, privateKey38, certificateArray39);

        java.security.cert.Certificate[] certificateArray41 = p12Data40.getCertificateChain();

        java.security.cert.Certificate[] certificateArray42 = p12Data40.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate43 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey44 = null;

        java.security.cert.Certificate certificate45 = null;

        java.security.PrivateKey privateKey46 = null;

        java.security.cert.Certificate[] certificateArray47 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate45, privateKey46, certificateArray47);

        java.security.cert.Certificate[] certificateArray49 = p12Data48.getCertificateChain();

        java.security.cert.Certificate[] certificateArray50 = p12Data48.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data51 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey44, certificateArray50);

        p12Data40.setCert((java.security.cert.Certificate) x509Certificate43);

        java.security.PrivateKey privateKey53 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate54 = null;

        java.security.PrivateKey privateKey55 = null;

        java.security.cert.Certificate[] certificateArray56 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data57 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate54, privateKey55, certificateArray56);

        java.security.cert.Certificate[] certificateArray58 = p12Data57.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data59 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey53, certificateArray58);

        symmetricTool35.setRSAroot(privateKey36, x509Certificate43);

        p12Data29.setCert((java.security.cert.Certificate) x509Certificate43);

        java.security.cert.Certificate certificate62 = null;

        java.security.PrivateKey privateKey63 = null;

        java.security.cert.Certificate[] certificateArray64 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data65 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate62, privateKey63, certificateArray64);

        java.security.cert.Certificate[] certificateArray66 = p12Data65.getCertificateChain();

        java.security.cert.Certificate[] certificateArray67 = p12Data65.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate68 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey69 = null;

        java.security.cert.Certificate certificate70 = null;

        java.security.PrivateKey privateKey71 = null;

        java.security.cert.Certificate[] certificateArray72 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data73 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate70, privateKey71, certificateArray72);

        java.security.cert.Certificate[] certificateArray74 = p12Data73.getCertificateChain();

        java.security.cert.Certificate[] certificateArray75 = p12Data73.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data76 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate68, privateKey69, certificateArray75);

        p12Data65.setCert((java.security.cert.Certificate) x509Certificate68);

        java.security.PrivateKey privateKey78 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate79 = null;

        java.security.PrivateKey privateKey80 = null;

        java.security.cert.Certificate[] certificateArray81 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data82 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate79, privateKey80, certificateArray81);

        java.security.cert.Certificate[] certificateArray83 = p12Data82.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data84 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate68, privateKey78, certificateArray83);

        java.security.cert.Certificate certificate85 = null;

        java.security.PrivateKey privateKey86 = null;

        java.security.cert.Certificate[] certificateArray87 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data88 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate85, privateKey86, certificateArray87);

        java.security.cert.Certificate[] certificateArray89 = p12Data88.getCertificateChain();

        java.security.cert.Certificate[] certificateArray90 = p12Data88.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data91 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey78, certificateArray90);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray94 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS12(privateKey1, certificateArray90, "SM2", "");

            org.junit.Assert.fail("Expected exception of type java.security.KeyStoreException; message:  not found");

        } catch (java.security.KeyStoreException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(privateKey1);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(x509Certificate8);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(privateKey18);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNull(certificate32);

        org.junit.Assert.assertNull(privateKey33);

        org.junit.Assert.assertNull(privateKey34);

        org.junit.Assert.assertNotNull(privateKey36);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(certificateArray42);

        org.junit.Assert.assertNotNull(x509Certificate43);

        org.junit.Assert.assertNotNull(certificateArray47);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(certificateArray50);

        org.junit.Assert.assertNotNull(privateKey53);

        org.junit.Assert.assertNotNull(certificateArray56);

        org.junit.Assert.assertNotNull(certificateArray58);

        org.junit.Assert.assertNotNull(certificateArray64);

        org.junit.Assert.assertNotNull(certificateArray66);

        org.junit.Assert.assertNotNull(certificateArray67);

        org.junit.Assert.assertNotNull(x509Certificate68);

        org.junit.Assert.assertNotNull(certificateArray72);

        org.junit.Assert.assertNotNull(certificateArray74);

        org.junit.Assert.assertNotNull(certificateArray75);

        org.junit.Assert.assertNotNull(privateKey78);

        org.junit.Assert.assertNotNull(certificateArray81);

        org.junit.Assert.assertNotNull(certificateArray83);

        org.junit.Assert.assertNotNull(certificateArray87);

        org.junit.Assert.assertNotNull(certificateArray89);

        org.junit.Assert.assertNotNull(certificateArray90);

    }



    @Test

    public void test213() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test213");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA = "RSASSA_PSS";

    }



    @Test

    public void test214() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test214");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.KeyStore keyStore0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.KeyStore();

    }



    @Test

    public void test215() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test215");

        byte[] byteArray0 = null;

        byte[] byteArray2 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray2);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher5 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_PKCS5Padding;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray6 = lich.tool.encryptionAndDecryption.core.SymmetricTool.decrypt(byteArray0, byteArray2, cipher5);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: no IV set when one expected");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertTrue("'" + cipher5 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_PKCS5Padding + "'", cipher5.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_CBC_PKCS5Padding));

    }



    @Test

    public void test216() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test216");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.MD5;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MD5" + "'", str0, "MD5");

    }



    @Test

    public void test217() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test217");

        byte[] byteArray2 = new byte[] { (byte) 1, (byte) -1 };

        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1 };

        byte[] byteArray8 = new byte[] { (byte) 1, (byte) -1 };

        byte[][] byteArray9 = new byte[][] { byteArray2, byteArray5, byteArray8 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.certificateChainToP7b(byteArray9, false);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: DER length more than 4 bytes: 127");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, -1]");

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1]");

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, -1]");

        org.junit.Assert.assertNotNull(byteArray9);

    }



    @Test

    public void test218() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test218");

        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.GMC1C3C2TOSM2Cipher(byteArray6);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 100, 0, 10]");

    }



    @Test

    public void test219() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test219");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        lich.tool.encryptionAndDecryption.core.Base.setSm4ext((lich.tool.encryptionAndDecryption.ext.SM4Ext) defaultSM4Ext0);

        byte[] byteArray3 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray3);

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray3);

        byte[] byteArray7 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray7);

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray7);

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray7);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray11 = defaultSM4Ext0.decrypt(byteArray3, byteArray7);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");

        org.junit.Assert.assertNull(publicKey4);

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNull(privateKey10);

    }



    @Test

    public void test220() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test220");

        java.security.PrivateKey privateKey0 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.PublicKey publicKey1 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray2 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toEnvelopedKeyBlobByGMPrivateKey(privateKey0, publicKey1);

            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey cannot be cast to org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey");

        } catch (java.lang.ClassCastException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(privateKey0);

    }



    @Test

    public void test221() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test221");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA384WithRSA = "SHA3-512WithRSA";

    }



    @Test

    public void test222() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test222");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_PKCS5Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_PKCS5Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.SM4_ECB_PKCS5Padding));

    }



    @Test

    public void test223() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test223");

        lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool keyStoreTool0 = new lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool();

    }



    @Test

    public void test224() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test224");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.PrivateKey privateKey6 = p12Data3.getPrivateKey();

        java.security.cert.Certificate certificate7 = null;

        java.security.PrivateKey privateKey8 = null;

        java.security.cert.Certificate[] certificateArray9 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data10 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate7, privateKey8, certificateArray9);

        java.security.cert.Certificate[] certificateArray11 = p12Data10.getCertificateChain();

        java.security.cert.Certificate[] certificateArray12 = p12Data10.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate13 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey14 = null;

        java.security.cert.Certificate certificate15 = null;

        java.security.PrivateKey privateKey16 = null;

        java.security.cert.Certificate[] certificateArray17 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data18 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate15, privateKey16, certificateArray17);

        java.security.cert.Certificate[] certificateArray19 = p12Data18.getCertificateChain();

        java.security.cert.Certificate[] certificateArray20 = p12Data18.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data21 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate13, privateKey14, certificateArray20);

        p12Data10.setCert((java.security.cert.Certificate) x509Certificate13);

        java.security.PrivateKey privateKey23 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate24 = null;

        java.security.PrivateKey privateKey25 = null;

        java.security.cert.Certificate[] certificateArray26 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data27 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate24, privateKey25, certificateArray26);

        java.security.cert.Certificate[] certificateArray28 = p12Data27.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate13, privateKey23, certificateArray28);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate13);

        java.security.cert.Certificate[] certificateArray31 = p12Data3.getCertificateChain();

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(privateKey6);

        org.junit.Assert.assertNotNull(certificateArray9);

        org.junit.Assert.assertNotNull(certificateArray11);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(x509Certificate13);

        org.junit.Assert.assertNotNull(certificateArray17);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(certificateArray20);

        org.junit.Assert.assertNotNull(privateKey23);

        org.junit.Assert.assertNotNull(certificateArray26);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray31);

    }



    @Test

    public void test225() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test225");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSM3 = "SHA3-224";

    }



    @Test

    public void test226() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test226");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA = "SHA512";

    }



    @Test

    public void test227() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test227");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RAWRSASSA_PSS = "pkcs12";

    }



    @Test

    public void test228() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test228");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.util.Date date10 = publicKeyInfo9.getNotBefore();

        java.util.Date date11 = null;

        publicKeyInfo9.setNotAfter(date11);

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNull(date10);

    }



    @Test

    public void test229() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test229");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate6 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey7 = null;

        java.security.cert.Certificate certificate8 = null;

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate[] certificateArray10 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data11 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate8, privateKey9, certificateArray10);

        java.security.cert.Certificate[] certificateArray12 = p12Data11.getCertificateChain();

        java.security.cert.Certificate[] certificateArray13 = p12Data11.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate6, privateKey7, certificateArray13);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate6);

        java.security.PrivateKey privateKey16 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate17 = null;

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate[] certificateArray19 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data20 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate17, privateKey18, certificateArray19);

        java.security.cert.Certificate[] certificateArray21 = p12Data20.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate6, privateKey16, certificateArray21);

        java.security.cert.Certificate certificate23 = p12Data22.getCert();

        java.security.PrivateKey privateKey24 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate25 = null;

        java.security.PrivateKey privateKey26 = null;

        java.security.cert.Certificate[] certificateArray27 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data28 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate25, privateKey26, certificateArray27);

        java.security.cert.Certificate[] certificateArray29 = p12Data28.getCertificateChain();

        java.security.cert.Certificate[] certificateArray30 = p12Data28.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate31 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey32 = null;

        java.security.cert.Certificate certificate33 = null;

        java.security.PrivateKey privateKey34 = null;

        java.security.cert.Certificate[] certificateArray35 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data36 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate33, privateKey34, certificateArray35);

        java.security.cert.Certificate[] certificateArray37 = p12Data36.getCertificateChain();

        java.security.cert.Certificate[] certificateArray38 = p12Data36.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data39 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate31, privateKey32, certificateArray38);

        p12Data28.setCert((java.security.cert.Certificate) x509Certificate31);

        java.security.PrivateKey privateKey41 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate42 = null;

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate[] certificateArray44 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data45 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate42, privateKey43, certificateArray44);

        java.security.cert.Certificate[] certificateArray46 = p12Data45.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate31, privateKey41, certificateArray46);

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate23, privateKey24, certificateArray46);

        java.security.PublicKey publicKey49 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray52 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(privateKey24, publicKey49, "SM2WITHMD5", "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: improperly specified input name: SM2WITHMD5");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(x509Certificate6);

        org.junit.Assert.assertNotNull(certificateArray10);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(privateKey16);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificate23);

        org.junit.Assert.assertNotNull(privateKey24);

        org.junit.Assert.assertNotNull(certificateArray27);

        org.junit.Assert.assertNotNull(certificateArray29);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(x509Certificate31);

        org.junit.Assert.assertNotNull(certificateArray35);

        org.junit.Assert.assertNotNull(certificateArray37);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(privateKey41);

        org.junit.Assert.assertNotNull(certificateArray44);

        org.junit.Assert.assertNotNull(certificateArray46);

    }



    @Test

    public void test230() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test230");

        lich.tool.encryptionAndDecryption.core.Base base0 = new lich.tool.encryptionAndDecryption.core.Base();

    }



    @Test

    public void test231() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test231");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RSASSA_PSS = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA";

    }



    @Test

    public void test232() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test232");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate6 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey7 = null;

        java.security.cert.Certificate certificate8 = null;

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate[] certificateArray10 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data11 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate8, privateKey9, certificateArray10);

        java.security.cert.Certificate[] certificateArray12 = p12Data11.getCertificateChain();

        java.security.cert.Certificate[] certificateArray13 = p12Data11.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate6, privateKey7, certificateArray13);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate6);

        java.security.PrivateKey privateKey16 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate17 = null;

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate[] certificateArray19 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data20 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate17, privateKey18, certificateArray19);

        java.security.cert.Certificate[] certificateArray21 = p12Data20.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate6, privateKey16, certificateArray21);

        java.security.cert.Certificate certificate23 = p12Data22.getCert();

        java.security.PrivateKey privateKey24 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate25 = null;

        java.security.PrivateKey privateKey26 = null;

        java.security.cert.Certificate[] certificateArray27 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data28 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate25, privateKey26, certificateArray27);

        java.security.cert.Certificate[] certificateArray29 = p12Data28.getCertificateChain();

        java.security.cert.Certificate[] certificateArray30 = p12Data28.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate31 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey32 = null;

        java.security.cert.Certificate certificate33 = null;

        java.security.PrivateKey privateKey34 = null;

        java.security.cert.Certificate[] certificateArray35 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data36 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate33, privateKey34, certificateArray35);

        java.security.cert.Certificate[] certificateArray37 = p12Data36.getCertificateChain();

        java.security.cert.Certificate[] certificateArray38 = p12Data36.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data39 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate31, privateKey32, certificateArray38);

        p12Data28.setCert((java.security.cert.Certificate) x509Certificate31);

        java.security.PrivateKey privateKey41 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate42 = null;

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate[] certificateArray44 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data45 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate42, privateKey43, certificateArray44);

        java.security.cert.Certificate[] certificateArray46 = p12Data45.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate31, privateKey41, certificateArray46);

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate23, privateKey24, certificateArray46);

        java.security.PublicKey publicKey49 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray50 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toEnvelopedKeyBlobByGMPrivateKey(privateKey24, publicKey49);

            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateCrtKey cannot be cast to org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey");

        } catch (java.lang.ClassCastException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(x509Certificate6);

        org.junit.Assert.assertNotNull(certificateArray10);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(privateKey16);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificate23);

        org.junit.Assert.assertNotNull(privateKey24);

        org.junit.Assert.assertNotNull(certificateArray27);

        org.junit.Assert.assertNotNull(certificateArray29);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(x509Certificate31);

        org.junit.Assert.assertNotNull(certificateArray35);

        org.junit.Assert.assertNotNull(certificateArray37);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(privateKey41);

        org.junit.Assert.assertNotNull(certificateArray44);

        org.junit.Assert.assertNotNull(certificateArray46);

    }



    @Test

    public void test233() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test233");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC = "SM2WITHSM3";

    }



    @Test

    public void test234() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test234");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_NOPADDING = "SHA3-384";

    }



    @Test

    public void test235() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test235");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.x509CertificateToPublicKey(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test236() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test236");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_NOPADDING = "SHA3-224";

    }



    @Test

    public void test237() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test237");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA384WithRSA");

        java.lang.Throwable[] throwableArray2 = encryptionAndDecryptionException1.getSuppressed();

        java.lang.String str3 = encryptionAndDecryptionException1.toString();

        org.junit.Assert.assertNotNull(throwableArray2);

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA" + "'", str3, "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA");

    }



    @Test

    public void test238() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test238");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "SHA256";

    }



    @Test

    public void test239() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test239");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray2 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray2);

        byte[] byteArray5 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = defaultSM4Ext0.decrypt(byteArray2, byteArray5);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test240() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test240");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC = "SHA512";

    }



    @Test

    public void test241() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test241");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL = "SHA256";

    }



    @Test

    public void test242() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test242");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = null;

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool4 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey5 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate6 = null;

        java.security.PrivateKey privateKey7 = null;

        java.security.cert.Certificate[] certificateArray8 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate6, privateKey7, certificateArray8);

        java.security.cert.Certificate[] certificateArray10 = p12Data9.getCertificateChain();

        java.security.cert.Certificate[] certificateArray11 = p12Data9.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate12 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey13 = null;

        java.security.cert.Certificate certificate14 = null;

        java.security.PrivateKey privateKey15 = null;

        java.security.cert.Certificate[] certificateArray16 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data17 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate14, privateKey15, certificateArray16);

        java.security.cert.Certificate[] certificateArray18 = p12Data17.getCertificateChain();

        java.security.cert.Certificate[] certificateArray19 = p12Data17.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data20 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate12, privateKey13, certificateArray19);

        p12Data9.setCert((java.security.cert.Certificate) x509Certificate12);

        java.security.PrivateKey privateKey22 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate23 = null;

        java.security.PrivateKey privateKey24 = null;

        java.security.cert.Certificate[] certificateArray25 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data26 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate23, privateKey24, certificateArray25);

        java.security.cert.Certificate[] certificateArray27 = p12Data26.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data28 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate12, privateKey22, certificateArray27);

        symmetricTool4.setRSAroot(privateKey5, x509Certificate12);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray30 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey3, x509Certificate12);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(privateKey5);

        org.junit.Assert.assertNotNull(certificateArray8);

        org.junit.Assert.assertNotNull(certificateArray10);

        org.junit.Assert.assertNotNull(certificateArray11);

        org.junit.Assert.assertNotNull(x509Certificate12);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray18);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(privateKey22);

        org.junit.Assert.assertNotNull(certificateArray25);

        org.junit.Assert.assertNotNull(certificateArray27);

    }



    @Test

    public void test243() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test243");

        byte[] byteArray0 = new byte[] {};

        java.security.cert.Certificate certificate1 = null;

        java.security.PrivateKey privateKey2 = null;

        java.security.cert.Certificate[] certificateArray3 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data4 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate1, privateKey2, certificateArray3);

        java.security.cert.Certificate[] certificateArray5 = p12Data4.getCertificateChain();

        java.security.cert.Certificate[] certificateArray6 = p12Data4.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate7 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey8 = null;

        java.security.cert.Certificate certificate9 = null;

        java.security.PrivateKey privateKey10 = null;

        java.security.cert.Certificate[] certificateArray11 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data12 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate9, privateKey10, certificateArray11);

        java.security.cert.Certificate[] certificateArray13 = p12Data12.getCertificateChain();

        java.security.cert.Certificate[] certificateArray14 = p12Data12.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate7, privateKey8, certificateArray14);

        p12Data4.setCert((java.security.cert.Certificate) x509Certificate7);

        java.security.PrivateKey privateKey17 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate18 = null;

        java.security.PrivateKey privateKey19 = null;

        java.security.cert.Certificate[] certificateArray20 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data21 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate18, privateKey19, certificateArray20);

        java.security.cert.Certificate[] certificateArray22 = p12Data21.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data23 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate7, privateKey17, certificateArray22);

        java.security.cert.Certificate certificate24 = p12Data23.getCert();

        java.security.PrivateKey privateKey25 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate26 = null;

        java.security.PrivateKey privateKey27 = null;

        java.security.cert.Certificate[] certificateArray28 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate26, privateKey27, certificateArray28);

        java.security.cert.Certificate[] certificateArray30 = p12Data29.getCertificateChain();

        java.security.cert.Certificate[] certificateArray31 = p12Data29.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate32 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey33 = null;

        java.security.cert.Certificate certificate34 = null;

        java.security.PrivateKey privateKey35 = null;

        java.security.cert.Certificate[] certificateArray36 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data37 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate34, privateKey35, certificateArray36);

        java.security.cert.Certificate[] certificateArray38 = p12Data37.getCertificateChain();

        java.security.cert.Certificate[] certificateArray39 = p12Data37.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate32, privateKey33, certificateArray39);

        p12Data29.setCert((java.security.cert.Certificate) x509Certificate32);

        java.security.PrivateKey privateKey42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate43 = null;

        java.security.PrivateKey privateKey44 = null;

        java.security.cert.Certificate[] certificateArray45 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data46 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate43, privateKey44, certificateArray45);

        java.security.cert.Certificate[] certificateArray47 = p12Data46.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate32, privateKey42, certificateArray47);

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data49 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate24, privateKey25, certificateArray47);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray51 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray0, privateKey25, "SHA224");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

        org.junit.Assert.assertNotNull(certificateArray3);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(x509Certificate7);

        org.junit.Assert.assertNotNull(certificateArray11);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(privateKey17);

        org.junit.Assert.assertNotNull(certificateArray20);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(certificate24);

        org.junit.Assert.assertNotNull(privateKey25);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNotNull(x509Certificate32);

        org.junit.Assert.assertNotNull(certificateArray36);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(privateKey42);

        org.junit.Assert.assertNotNull(certificateArray45);

        org.junit.Assert.assertNotNull(certificateArray47);

    }



    @Test

    public void test244() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test244");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.DEFAULT = "SHA384WithRSA";

    }



    @Test

    public void test245() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test245");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_256WithRSA = "AES";

    }



    @Test

    public void test246() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test246");

        byte[] byteArray0 = null;

        java.security.cert.Certificate certificate1 = null;

        java.security.PrivateKey privateKey2 = null;

        java.security.cert.Certificate[] certificateArray3 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data4 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate1, privateKey2, certificateArray3);

        java.security.cert.Certificate[] certificateArray5 = p12Data4.getCertificateChain();

        java.security.cert.Certificate[] certificateArray6 = p12Data4.getCertificateChain();

        java.security.cert.Certificate certificate7 = p12Data4.getCert();

        java.security.PrivateKey privateKey8 = p12Data4.getPrivateKey();

        java.security.PrivateKey privateKey9 = p12Data4.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool10 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey11 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate12 = null;

        java.security.PrivateKey privateKey13 = null;

        java.security.cert.Certificate[] certificateArray14 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate12, privateKey13, certificateArray14);

        java.security.cert.Certificate[] certificateArray16 = p12Data15.getCertificateChain();

        java.security.cert.Certificate[] certificateArray17 = p12Data15.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate18 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey19 = null;

        java.security.cert.Certificate certificate20 = null;

        java.security.PrivateKey privateKey21 = null;

        java.security.cert.Certificate[] certificateArray22 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data23 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate20, privateKey21, certificateArray22);

        java.security.cert.Certificate[] certificateArray24 = p12Data23.getCertificateChain();

        java.security.cert.Certificate[] certificateArray25 = p12Data23.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data26 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate18, privateKey19, certificateArray25);

        p12Data15.setCert((java.security.cert.Certificate) x509Certificate18);

        java.security.PrivateKey privateKey28 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate29 = null;

        java.security.PrivateKey privateKey30 = null;

        java.security.cert.Certificate[] certificateArray31 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data32 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate29, privateKey30, certificateArray31);

        java.security.cert.Certificate[] certificateArray33 = p12Data32.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data34 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate18, privateKey28, certificateArray33);

        symmetricTool10.setRSAroot(privateKey11, x509Certificate18);

        p12Data4.setCert((java.security.cert.Certificate) x509Certificate18);

        java.security.cert.Certificate certificate37 = null;

        java.security.PrivateKey privateKey38 = null;

        java.security.cert.Certificate[] certificateArray39 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate37, privateKey38, certificateArray39);

        java.security.cert.Certificate[] certificateArray41 = p12Data40.getCertificateChain();

        java.security.cert.Certificate[] certificateArray42 = p12Data40.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate43 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey44 = null;

        java.security.cert.Certificate certificate45 = null;

        java.security.PrivateKey privateKey46 = null;

        java.security.cert.Certificate[] certificateArray47 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate45, privateKey46, certificateArray47);

        java.security.cert.Certificate[] certificateArray49 = p12Data48.getCertificateChain();

        java.security.cert.Certificate[] certificateArray50 = p12Data48.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data51 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey44, certificateArray50);

        p12Data40.setCert((java.security.cert.Certificate) x509Certificate43);

        java.security.PrivateKey privateKey53 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate54 = null;

        java.security.PrivateKey privateKey55 = null;

        java.security.cert.Certificate[] certificateArray56 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data57 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate54, privateKey55, certificateArray56);

        java.security.cert.Certificate[] certificateArray58 = p12Data57.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data59 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey53, certificateArray58);

        java.security.cert.Certificate certificate60 = null;

        java.security.PrivateKey privateKey61 = null;

        java.security.cert.Certificate[] certificateArray62 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data63 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate60, privateKey61, certificateArray62);

        java.security.cert.Certificate[] certificateArray64 = p12Data63.getCertificateChain();

        java.security.cert.Certificate[] certificateArray65 = p12Data63.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data66 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate18, privateKey53, certificateArray65);

        java.security.cert.X509Certificate x509Certificate67 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray68 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray0, privateKey53, x509Certificate67);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray3);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNull(certificate7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNotNull(privateKey11);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray17);

        org.junit.Assert.assertNotNull(x509Certificate18);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(certificateArray25);

        org.junit.Assert.assertNotNull(privateKey28);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNotNull(certificateArray33);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(certificateArray42);

        org.junit.Assert.assertNotNull(x509Certificate43);

        org.junit.Assert.assertNotNull(certificateArray47);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(certificateArray50);

        org.junit.Assert.assertNotNull(privateKey53);

        org.junit.Assert.assertNotNull(certificateArray56);

        org.junit.Assert.assertNotNull(certificateArray58);

        org.junit.Assert.assertNotNull(certificateArray62);

        org.junit.Assert.assertNotNull(certificateArray64);

        org.junit.Assert.assertNotNull(certificateArray65);

        org.junit.Assert.assertNotNull(x509Certificate67);

    }



    @Test

    public void test247() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test247");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2EncDataC1C2C3ToSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test248() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test248");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2EncDataC1C2C3ToSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test249() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test249");

        byte[] byteArray0 = new byte[] {};

        byte[][] byteArray1 = new byte[][] { byteArray0 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.certificateChainToP7b(byteArray1, true);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no content found");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray0);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");

        org.junit.Assert.assertNotNull(byteArray1);

    }



    @Test

    public void test250() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test250");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray5);

        java.security.cert.X509Certificate x509Certificate7 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean8 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray1, byteArray5, x509Certificate7);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(x509Certificate7);

    }



    @Test

    public void test251() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test251");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.util.Date date4 = null;

        publicKeyInfo3.setNotAfter(date4);

        java.math.BigInteger bigInteger6 = publicKeyInfo3.getSerial();

        org.junit.Assert.assertNotNull(bigInteger6);

    }



    @Test

    public void test252() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test252");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        java.security.cert.X509Certificate x509Certificate10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate certificate12 = null;

        java.security.PrivateKey privateKey13 = null;

        java.security.cert.Certificate[] certificateArray14 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate12, privateKey13, certificateArray14);

        java.security.cert.Certificate[] certificateArray16 = p12Data15.getCertificateChain();

        java.security.cert.Certificate[] certificateArray17 = p12Data15.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data18 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate10, privateKey11, certificateArray17);

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean19 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray1, byteArray6, x509Certificate10);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNotNull(x509Certificate10);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray17);

    }



    @Test

    public void test253() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test253");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM2WITHSHA256" + "'", str0, "SM2WITHSHA256");

    }



    @Test

    public void test254() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test254");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        java.security.PrivateKey privateKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherToSM2EncDataC1C2C3(byteArray4);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: unexpected end-of-contents marker");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNull(privateKey7);

    }



    @Test

    public void test255() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test255");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHRIPEMD160 = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ";

    }



    @Test

    public void test256() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test256");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        publicKeyInfo3.setNotBefore(date5);

        java.security.PublicKey publicKey7 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getX509Certificate(publicKeyInfo3, publicKey7);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: badly formatted directory string");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(bigInteger4);

    }



    @Test

    public void test257() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test257");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = p12Data3.getCert();

        java.security.PrivateKey privateKey7 = p12Data3.getPrivateKey();

        java.security.PrivateKey privateKey8 = p12Data3.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool9 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate17 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        java.security.cert.Certificate[] certificateArray24 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey18, certificateArray24);

        p12Data14.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.PrivateKey privateKey27 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate28 = null;

        java.security.PrivateKey privateKey29 = null;

        java.security.cert.Certificate[] certificateArray30 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data31 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate28, privateKey29, certificateArray30);

        java.security.cert.Certificate[] certificateArray32 = p12Data31.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data33 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey27, certificateArray32);

        symmetricTool9.setRSAroot(privateKey10, x509Certificate17);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.cert.Certificate certificate36 = null;

        java.security.PrivateKey privateKey37 = null;

        java.security.cert.Certificate[] certificateArray38 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data39 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate36, privateKey37, certificateArray38);

        java.security.cert.Certificate[] certificateArray40 = p12Data39.getCertificateChain();

        java.security.cert.Certificate[] certificateArray41 = p12Data39.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate certificate44 = null;

        java.security.PrivateKey privateKey45 = null;

        java.security.cert.Certificate[] certificateArray46 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate44, privateKey45, certificateArray46);

        java.security.cert.Certificate[] certificateArray48 = p12Data47.getCertificateChain();

        java.security.cert.Certificate[] certificateArray49 = p12Data47.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data50 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey43, certificateArray49);

        p12Data39.setCert((java.security.cert.Certificate) x509Certificate42);

        java.security.PrivateKey privateKey52 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate53 = null;

        java.security.PrivateKey privateKey54 = null;

        java.security.cert.Certificate[] certificateArray55 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data56 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate53, privateKey54, certificateArray55);

        java.security.cert.Certificate[] certificateArray57 = p12Data56.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data58 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey52, certificateArray57);

        java.security.cert.Certificate certificate59 = null;

        java.security.PrivateKey privateKey60 = null;

        java.security.cert.Certificate[] certificateArray61 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data62 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate59, privateKey60, certificateArray61);

        java.security.cert.Certificate[] certificateArray63 = p12Data62.getCertificateChain();

        java.security.cert.Certificate[] certificateArray64 = p12Data62.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data65 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey52, certificateArray64);

        java.security.PublicKey publicKey66 = null;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray69 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(privateKey52, publicKey66, "RSASSA_PSS", "SHA512");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: improperly specified input name: RSASSA_PSS");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(certificate6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNotNull(privateKey10);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(x509Certificate17);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(privateKey27);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray32);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(certificateArray40);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(x509Certificate42);

        org.junit.Assert.assertNotNull(certificateArray46);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(privateKey52);

        org.junit.Assert.assertNotNull(certificateArray55);

        org.junit.Assert.assertNotNull(certificateArray57);

        org.junit.Assert.assertNotNull(certificateArray61);

        org.junit.Assert.assertNotNull(certificateArray63);

        org.junit.Assert.assertNotNull(certificateArray64);

    }



    @Test

    public void test258() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test258");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHMD5 = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ";

    }



    @Test

    public void test259() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test259");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_PKCS1PADDING;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SM3" + "'", str0, "SM3");

    }



    @Test

    public void test260() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test260");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2SignatureToRS(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: unexpected end-of-contents marker");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(publicKey3);

    }



    @Test

    public void test261() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test261");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA rSA0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA();

    }



    @Test

    public void test262() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test262");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.RSToSM2Signature(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

    }



    @Test

    public void test263() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test263");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA384WithRSA = "SHA256";

    }



    @Test

    public void test264() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test264");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray1, byteArray6);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

    }



    @Test

    public void test265() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test265");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray4);

        byte[] byteArray7 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7);

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4, byteArray7);

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray7);

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        java.security.PrivateKey privateKey17 = p12Data14.getPrivateKey();

        java.security.cert.Certificate certificate18 = null;

        java.security.PrivateKey privateKey19 = null;

        java.security.cert.Certificate[] certificateArray20 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data21 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate18, privateKey19, certificateArray20);

        java.security.cert.Certificate[] certificateArray22 = p12Data21.getCertificateChain();

        java.security.cert.Certificate[] certificateArray23 = p12Data21.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate24 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey25 = null;

        java.security.cert.Certificate certificate26 = null;

        java.security.PrivateKey privateKey27 = null;

        java.security.cert.Certificate[] certificateArray28 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate26, privateKey27, certificateArray28);

        java.security.cert.Certificate[] certificateArray30 = p12Data29.getCertificateChain();

        java.security.cert.Certificate[] certificateArray31 = p12Data29.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data32 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate24, privateKey25, certificateArray31);

        p12Data21.setCert((java.security.cert.Certificate) x509Certificate24);

        java.security.PrivateKey privateKey34 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate35 = null;

        java.security.PrivateKey privateKey36 = null;

        java.security.cert.Certificate[] certificateArray37 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data38 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate35, privateKey36, certificateArray37);

        java.security.cert.Certificate[] certificateArray39 = p12Data38.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate24, privateKey34, certificateArray39);

        p12Data14.setCert((java.security.cert.Certificate) x509Certificate24);

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean42 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray1, byteArray7, x509Certificate24);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNull(privateKey10);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNull(privateKey17);

        org.junit.Assert.assertNotNull(certificateArray20);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(x509Certificate24);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNotNull(privateKey34);

        org.junit.Assert.assertNotNull(certificateArray37);

        org.junit.Assert.assertNotNull(certificateArray39);

    }



    @Test

    public void test266() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test266");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = p12Data3.getCert();

        java.security.PrivateKey privateKey7 = p12Data3.getPrivateKey();

        java.security.PrivateKey privateKey8 = p12Data3.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool9 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate17 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        java.security.cert.Certificate[] certificateArray24 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey18, certificateArray24);

        p12Data14.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.PrivateKey privateKey27 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate28 = null;

        java.security.PrivateKey privateKey29 = null;

        java.security.cert.Certificate[] certificateArray30 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data31 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate28, privateKey29, certificateArray30);

        java.security.cert.Certificate[] certificateArray32 = p12Data31.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data33 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey27, certificateArray32);

        symmetricTool9.setRSAroot(privateKey10, x509Certificate17);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.cert.Certificate certificate36 = null;

        java.security.PrivateKey privateKey37 = null;

        java.security.cert.Certificate[] certificateArray38 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data39 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate36, privateKey37, certificateArray38);

        java.security.cert.Certificate[] certificateArray40 = p12Data39.getCertificateChain();

        java.security.cert.Certificate[] certificateArray41 = p12Data39.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate certificate44 = null;

        java.security.PrivateKey privateKey45 = null;

        java.security.cert.Certificate[] certificateArray46 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate44, privateKey45, certificateArray46);

        java.security.cert.Certificate[] certificateArray48 = p12Data47.getCertificateChain();

        java.security.cert.Certificate[] certificateArray49 = p12Data47.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data50 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey43, certificateArray49);

        p12Data39.setCert((java.security.cert.Certificate) x509Certificate42);

        java.security.PrivateKey privateKey52 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate53 = null;

        java.security.PrivateKey privateKey54 = null;

        java.security.cert.Certificate[] certificateArray55 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data56 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate53, privateKey54, certificateArray55);

        java.security.cert.Certificate[] certificateArray57 = p12Data56.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data58 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey52, certificateArray57);

        java.security.cert.Certificate certificate59 = null;

        java.security.PrivateKey privateKey60 = null;

        java.security.cert.Certificate[] certificateArray61 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data62 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate59, privateKey60, certificateArray61);

        java.security.cert.Certificate[] certificateArray63 = p12Data62.getCertificateChain();

        java.security.cert.Certificate[] certificateArray64 = p12Data62.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data65 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey52, certificateArray64);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray66 = null; // flaky: lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toEnvelopedKeyBlobByGMPrivateKey(privateKey52);

// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(certificate6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNotNull(privateKey10);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(x509Certificate17);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(privateKey27);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray32);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(certificateArray40);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(x509Certificate42);

        org.junit.Assert.assertNotNull(certificateArray46);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(privateKey52);

        org.junit.Assert.assertNotNull(certificateArray55);

        org.junit.Assert.assertNotNull(certificateArray57);

        org.junit.Assert.assertNotNull(certificateArray61);

        org.junit.Assert.assertNotNull(certificateArray63);

        org.junit.Assert.assertNotNull(certificateArray64);

    }



    @Test

    public void test267() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test267");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.security.PublicKey publicKey4 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getX509Certificate(publicKeyInfo3, publicKey4);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: badly formatted directory string");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

    }



    @Test

    public void test268() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test268");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA256 = "SM2WITHMD5";

    }



    @Test

    public void test269() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test269");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        lich.tool.encryptionAndDecryption.core.Base.setSm4ext((lich.tool.encryptionAndDecryption.ext.SM4Ext) defaultSM4Ext0);

        byte[] byteArray3 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray3);

        byte[] byteArray6 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6);

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray3, byteArray6);

        byte[] byteArray10 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray10);

        byte[] byteArray13 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray13);

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray10, byteArray13);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray16 = defaultSM4Ext0.decrypt(byteArray6, byteArray13);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");

        org.junit.Assert.assertNull(publicKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");

        org.junit.Assert.assertNull(publicKey11);

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNull(publicKey15);

    }



    @Test

    public void test270() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test270");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray5 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray5);

        byte[] byteArray8 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray8);

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5, byteArray8);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher11 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_NOPadding;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray12 = lich.tool.encryptionAndDecryption.core.SymmetricTool.decrypt(byteArray1, byteArray8, cipher11);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.InvalidKeyOrParametersException; message: 7");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNull(publicKey10);

        org.junit.Assert.assertTrue("'" + cipher11 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_NOPadding + "'", cipher11.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_NOPadding));

    }



    @Test

    public void test271() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test271");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ";

    }



    @Test

    public void test272() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test272");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.RSToSM2Signature(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");

        } catch (java.lang.ArrayIndexOutOfBoundsException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(publicKey3);

    }



    @Test

    public void test273() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test273");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2B = "MD5";

    }



    @Test

    public void test274() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test274");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray2 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray2);

        byte[] byteArray5 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5);

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray5);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray8 = defaultSM4Ext0.decrypt(byteArray2, byteArray5);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNull(publicKey7);

    }



    @Test

    public void test275() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test275");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature signature0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature();

        java.lang.Class<?> wildcardClass1 = signature0.getClass();

        boolean boolean3 = lich.tool.encryptionAndDecryption.ProviderMode.Check.contains((java.lang.Class) wildcardClass1, "SHA1WithRSA");

        org.junit.Assert.assertNotNull(wildcardClass1);

        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);

    }



    @Test

    public void test276() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test276");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSM3 = "MD2";

    }



    @Test

    public void test277() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test277");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.DEFAULT = "SHA3-256";

    }



    @Test

    public void test278() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test278");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray1 = null;

        byte[] byteArray3 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray3);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = defaultSM4Ext0.decrypt(byteArray1, byteArray3);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");

        org.junit.Assert.assertNull(publicKey4);

    }



    @Test

    public void test279() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test279");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2S = "AES";

    }



    @Test

    public void test280() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test280");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher cipher0 = new lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher();

    }



    @Test

    public void test281() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test281");

        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2SignatureToRS(byteArray4);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: DER length more than 4 bytes: 127");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, -1, 0]");

    }



    @Test

    public void test282() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test282");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray7 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2SignatureToRS(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

    }



    @Test

    public void test283() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test283");

        java.security.cert.X509Certificate x509Certificate0 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate certificate2 = null;

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.Certificate[] certificateArray4 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data5 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate2, privateKey3, certificateArray4);

        java.security.cert.Certificate[] certificateArray6 = p12Data5.getCertificateChain();

        java.security.cert.Certificate[] certificateArray7 = p12Data5.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data8 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate0, privateKey1, certificateArray7);

        java.security.cert.Certificate[] certificateArray9 = p12Data8.getCertificateChain();

        org.junit.Assert.assertNotNull(x509Certificate0);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(certificateArray9);

    }



    @Test

    public void test284() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test284");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SM3WITHSM2 = "SM3";

    }



    @Test

    public void test285() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test285");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_PKCS5Padding;

        java.lang.String str1 = cipher0.getKeyType();

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_PKCS5Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_PKCS5Padding));

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DESede" + "'", str1, "DESede");

    }



    @Test

    public void test286() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test286");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "SHA256";

    }



    @Test

    public void test287() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test287");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA384 = "hi!";

    }



    @Test

    public void test288() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test288");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.DEFAULT = "SM2";

    }



    @Test

    public void test289() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test289");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHMD5 = "MD5";

    }



    @Test

    public void test290() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test290");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "SHA3-224";

    }



    @Test

    public void test291() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test291");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2B = "AES";

    }



    @Test

    public void test292() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test292");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.GMC1C3C2TOSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test293() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test293");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_PKCS7Padding;

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_PKCS7Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_ECB_PKCS7Padding));

    }



    @Test

    public void test294() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test294");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher9 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_PKCS7Padding;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray10 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray6, cipher9);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: key size must be 16 or 24 bytes.");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNotNull(publicKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertTrue("'" + cipher9 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_PKCS7Padding + "'", cipher9.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_CBC_PKCS7Padding));

    }



    @Test

    public void test295() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test295");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_PKCS1PADDING = "SHA512";

    }



    @Test

    public void test296() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test296");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RSASSA_PSS;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA" + "'", str0, "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA");

    }



    @Test

    public void test297() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test297");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.cert.Certificate certificate3 = null;

        java.security.PrivateKey privateKey4 = null;

        java.security.cert.Certificate[] certificateArray5 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data6 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate3, privateKey4, certificateArray5);

        java.security.cert.Certificate[] certificateArray7 = p12Data6.getCertificateChain();

        java.security.cert.Certificate[] certificateArray8 = p12Data6.getCertificateChain();

        java.security.cert.Certificate certificate9 = p12Data6.getCert();

        java.security.PrivateKey privateKey10 = p12Data6.getPrivateKey();

        java.security.PrivateKey privateKey11 = p12Data6.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool12 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey13 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate14 = null;

        java.security.PrivateKey privateKey15 = null;

        java.security.cert.Certificate[] certificateArray16 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data17 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate14, privateKey15, certificateArray16);

        java.security.cert.Certificate[] certificateArray18 = p12Data17.getCertificateChain();

        java.security.cert.Certificate[] certificateArray19 = p12Data17.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate20 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey21 = null;

        java.security.cert.Certificate certificate22 = null;

        java.security.PrivateKey privateKey23 = null;

        java.security.cert.Certificate[] certificateArray24 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate22, privateKey23, certificateArray24);

        java.security.cert.Certificate[] certificateArray26 = p12Data25.getCertificateChain();

        java.security.cert.Certificate[] certificateArray27 = p12Data25.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data28 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate20, privateKey21, certificateArray27);

        p12Data17.setCert((java.security.cert.Certificate) x509Certificate20);

        java.security.PrivateKey privateKey30 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate31 = null;

        java.security.PrivateKey privateKey32 = null;

        java.security.cert.Certificate[] certificateArray33 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data34 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate31, privateKey32, certificateArray33);

        java.security.cert.Certificate[] certificateArray35 = p12Data34.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data36 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate20, privateKey30, certificateArray35);

        symmetricTool12.setRSAroot(privateKey13, x509Certificate20);

        p12Data6.setCert((java.security.cert.Certificate) x509Certificate20);

        java.security.cert.Certificate certificate39 = null;

        java.security.PrivateKey privateKey40 = null;

        java.security.cert.Certificate[] certificateArray41 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data42 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate39, privateKey40, certificateArray41);

        java.security.cert.Certificate[] certificateArray43 = p12Data42.getCertificateChain();

        java.security.cert.Certificate[] certificateArray44 = p12Data42.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate45 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey46 = null;

        java.security.cert.Certificate certificate47 = null;

        java.security.PrivateKey privateKey48 = null;

        java.security.cert.Certificate[] certificateArray49 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data50 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate47, privateKey48, certificateArray49);

        java.security.cert.Certificate[] certificateArray51 = p12Data50.getCertificateChain();

        java.security.cert.Certificate[] certificateArray52 = p12Data50.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data53 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate45, privateKey46, certificateArray52);

        p12Data42.setCert((java.security.cert.Certificate) x509Certificate45);

        java.security.PrivateKey privateKey55 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate56 = null;

        java.security.PrivateKey privateKey57 = null;

        java.security.cert.Certificate[] certificateArray58 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data59 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate56, privateKey57, certificateArray58);

        java.security.cert.Certificate[] certificateArray60 = p12Data59.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data61 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate45, privateKey55, certificateArray60);

        java.security.cert.Certificate certificate62 = null;

        java.security.PrivateKey privateKey63 = null;

        java.security.cert.Certificate[] certificateArray64 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data65 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate62, privateKey63, certificateArray64);

        java.security.cert.Certificate[] certificateArray66 = p12Data65.getCertificateChain();

        java.security.cert.Certificate[] certificateArray67 = p12Data65.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data68 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate20, privateKey55, certificateArray67);

        java.security.cert.X509Certificate x509Certificate69 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray70 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey55, x509Certificate69);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(certificateArray8);

        org.junit.Assert.assertNull(certificate9);

        org.junit.Assert.assertNull(privateKey10);

        org.junit.Assert.assertNull(privateKey11);

        org.junit.Assert.assertNotNull(privateKey13);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray18);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(x509Certificate20);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(certificateArray26);

        org.junit.Assert.assertNotNull(certificateArray27);

        org.junit.Assert.assertNotNull(privateKey30);

        org.junit.Assert.assertNotNull(certificateArray33);

        org.junit.Assert.assertNotNull(certificateArray35);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(certificateArray43);

        org.junit.Assert.assertNotNull(certificateArray44);

        org.junit.Assert.assertNotNull(x509Certificate45);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(certificateArray51);

        org.junit.Assert.assertNotNull(certificateArray52);

        org.junit.Assert.assertNotNull(privateKey55);

        org.junit.Assert.assertNotNull(certificateArray58);

        org.junit.Assert.assertNotNull(certificateArray60);

        org.junit.Assert.assertNotNull(certificateArray64);

        org.junit.Assert.assertNotNull(certificateArray66);

        org.junit.Assert.assertNotNull(certificateArray67);

        org.junit.Assert.assertNotNull(x509Certificate69);

    }



    @Test

    public void test298() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test298");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2B = "SHA224WithRSA";

    }



    @Test

    public void test299() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test299");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA512 = "hi!";

    }



    @Test

    public void test300() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test300");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray2 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray2);

        java.security.PrivateKey privateKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray2);

        byte[] byteArray7 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray7);

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray7);

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray11 = defaultSM4Ext0.encrypt(byteArray2, byteArray7);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNull(privateKey5);

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNotNull(publicKey10);

    }



    @Test

    public void test301() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test301");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA512" + "'", str0, "SHA512");

    }



    @Test

    public void test302() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test302");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "hi!";

    }



    @Test

    public void test303() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test303");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = p12Data3.getCert();

        java.security.PrivateKey privateKey7 = p12Data3.getPrivateKey();

        java.security.PrivateKey privateKey8 = p12Data3.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool9 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate17 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        java.security.cert.Certificate[] certificateArray24 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey18, certificateArray24);

        p12Data14.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.PrivateKey privateKey27 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate28 = null;

        java.security.PrivateKey privateKey29 = null;

        java.security.cert.Certificate[] certificateArray30 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data31 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate28, privateKey29, certificateArray30);

        java.security.cert.Certificate[] certificateArray32 = p12Data31.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data33 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey27, certificateArray32);

        symmetricTool9.setRSAroot(privateKey10, x509Certificate17);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.cert.Certificate certificate36 = null;

        java.security.PrivateKey privateKey37 = null;

        java.security.cert.Certificate[] certificateArray38 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data39 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate36, privateKey37, certificateArray38);

        java.security.cert.Certificate[] certificateArray40 = p12Data39.getCertificateChain();

        java.security.cert.Certificate[] certificateArray41 = p12Data39.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate certificate44 = null;

        java.security.PrivateKey privateKey45 = null;

        java.security.cert.Certificate[] certificateArray46 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate44, privateKey45, certificateArray46);

        java.security.cert.Certificate[] certificateArray48 = p12Data47.getCertificateChain();

        java.security.cert.Certificate[] certificateArray49 = p12Data47.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data50 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey43, certificateArray49);

        p12Data39.setCert((java.security.cert.Certificate) x509Certificate42);

        java.security.PrivateKey privateKey52 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate53 = null;

        java.security.PrivateKey privateKey54 = null;

        java.security.cert.Certificate[] certificateArray55 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data56 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate53, privateKey54, certificateArray55);

        java.security.cert.Certificate[] certificateArray57 = p12Data56.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data58 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey52, certificateArray57);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate42);

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(certificate6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNotNull(privateKey10);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(x509Certificate17);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(privateKey27);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray32);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(certificateArray40);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(x509Certificate42);

        org.junit.Assert.assertNotNull(certificateArray46);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(privateKey52);

        org.junit.Assert.assertNotNull(certificateArray55);

        org.junit.Assert.assertNotNull(certificateArray57);

    }



    @Test

    public void test304() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test304");

        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 1 };

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2SignatureToRS(byteArray2);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: DEF length 1 object truncated by 1");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 1]");

    }



    @Test

    public void test305() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test305");

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool0 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey1 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate2 = null;

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.Certificate[] certificateArray4 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data5 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate2, privateKey3, certificateArray4);

        java.security.cert.Certificate[] certificateArray6 = p12Data5.getCertificateChain();

        java.security.cert.Certificate[] certificateArray7 = p12Data5.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate certificate10 = null;

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate[] certificateArray12 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate10, privateKey11, certificateArray12);

        java.security.cert.Certificate[] certificateArray14 = p12Data13.getCertificateChain();

        java.security.cert.Certificate[] certificateArray15 = p12Data13.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data16 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey9, certificateArray15);

        p12Data5.setCert((java.security.cert.Certificate) x509Certificate8);

        java.security.PrivateKey privateKey18 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data24 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey18, certificateArray23);

        symmetricTool0.setRSAroot(privateKey1, x509Certificate8);

        java.security.cert.Certificate certificate26 = null;

        java.security.PrivateKey privateKey27 = null;

        java.security.cert.Certificate[] certificateArray28 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate26, privateKey27, certificateArray28);

        java.security.cert.Certificate[] certificateArray30 = p12Data29.getCertificateChain();

        java.security.cert.Certificate[] certificateArray31 = p12Data29.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate32 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey33 = null;

        java.security.cert.Certificate certificate34 = null;

        java.security.PrivateKey privateKey35 = null;

        java.security.cert.Certificate[] certificateArray36 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data37 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate34, privateKey35, certificateArray36);

        java.security.cert.Certificate[] certificateArray38 = p12Data37.getCertificateChain();

        java.security.cert.Certificate[] certificateArray39 = p12Data37.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate32, privateKey33, certificateArray39);

        p12Data29.setCert((java.security.cert.Certificate) x509Certificate32);

        java.security.PrivateKey privateKey42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate43 = null;

        java.security.PrivateKey privateKey44 = null;

        java.security.cert.Certificate[] certificateArray45 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data46 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate43, privateKey44, certificateArray45);

        java.security.cert.Certificate[] certificateArray47 = p12Data46.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate32, privateKey42, certificateArray47);

        java.security.cert.Certificate certificate49 = null;

        java.security.PrivateKey privateKey50 = null;

        java.security.cert.Certificate[] certificateArray51 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data52 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate49, privateKey50, certificateArray51);

        java.security.cert.Certificate[] certificateArray53 = p12Data52.getCertificateChain();

        java.security.cert.Certificate[] certificateArray54 = p12Data52.getCertificateChain();

        java.security.PrivateKey privateKey55 = p12Data52.getPrivateKey();

        java.security.cert.Certificate certificate56 = null;

        java.security.PrivateKey privateKey57 = null;

        java.security.cert.Certificate[] certificateArray58 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data59 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate56, privateKey57, certificateArray58);

        java.security.cert.Certificate[] certificateArray60 = p12Data59.getCertificateChain();

        java.security.cert.Certificate[] certificateArray61 = p12Data59.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate62 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey63 = null;

        java.security.cert.Certificate certificate64 = null;

        java.security.PrivateKey privateKey65 = null;

        java.security.cert.Certificate[] certificateArray66 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data67 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate64, privateKey65, certificateArray66);

        java.security.cert.Certificate[] certificateArray68 = p12Data67.getCertificateChain();

        java.security.cert.Certificate[] certificateArray69 = p12Data67.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data70 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate62, privateKey63, certificateArray69);

        p12Data59.setCert((java.security.cert.Certificate) x509Certificate62);

        java.security.PrivateKey privateKey72 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate73 = null;

        java.security.PrivateKey privateKey74 = null;

        java.security.cert.Certificate[] certificateArray75 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data76 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate73, privateKey74, certificateArray75);

        java.security.cert.Certificate[] certificateArray77 = p12Data76.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data78 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate62, privateKey72, certificateArray77);

        p12Data52.setCert((java.security.cert.Certificate) x509Certificate62);

        symmetricTool0.setGMroot(privateKey42, x509Certificate62);

        org.junit.Assert.assertNotNull(privateKey1);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(x509Certificate8);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(privateKey18);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNotNull(x509Certificate32);

        org.junit.Assert.assertNotNull(certificateArray36);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(privateKey42);

        org.junit.Assert.assertNotNull(certificateArray45);

        org.junit.Assert.assertNotNull(certificateArray47);

        org.junit.Assert.assertNotNull(certificateArray51);

        org.junit.Assert.assertNotNull(certificateArray53);

        org.junit.Assert.assertNotNull(certificateArray54);

        org.junit.Assert.assertNull(privateKey55);

        org.junit.Assert.assertNotNull(certificateArray58);

        org.junit.Assert.assertNotNull(certificateArray60);

        org.junit.Assert.assertNotNull(certificateArray61);

        org.junit.Assert.assertNotNull(x509Certificate62);

        org.junit.Assert.assertNotNull(certificateArray66);

        org.junit.Assert.assertNotNull(certificateArray68);

        org.junit.Assert.assertNotNull(certificateArray69);

        org.junit.Assert.assertNotNull(privateKey72);

        org.junit.Assert.assertNotNull(certificateArray75);

        org.junit.Assert.assertNotNull(certificateArray77);

    }



    @Test

    public void test306() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test306");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray1, false);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test307() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test307");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.cert.Certificate certificate3 = null;

        java.security.PrivateKey privateKey4 = null;

        java.security.cert.Certificate[] certificateArray5 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data6 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate3, privateKey4, certificateArray5);

        java.security.cert.Certificate[] certificateArray7 = p12Data6.getCertificateChain();

        java.security.cert.Certificate[] certificateArray8 = p12Data6.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate9 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey10 = null;

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data17 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate9, privateKey10, certificateArray16);

        p12Data6.setCert((java.security.cert.Certificate) x509Certificate9);

        java.security.PrivateKey privateKey19 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate20 = null;

        java.security.PrivateKey privateKey21 = null;

        java.security.cert.Certificate[] certificateArray22 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data23 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate20, privateKey21, certificateArray22);

        java.security.cert.Certificate[] certificateArray24 = p12Data23.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate9, privateKey19, certificateArray24);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray27 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.decrypt(byteArray1, privateKey19, "SHA1WithRSA");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(certificateArray8);

        org.junit.Assert.assertNotNull(x509Certificate9);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(privateKey19);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(certificateArray24);

    }



    @Test

    public void test308() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test308");

        byte[] byteArray0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray0, true);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test309() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test309");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherTOGMC1C3C2(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: unexpected end-of-contents marker");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test310() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test310");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA384WithRSA");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException3 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("");

        encryptionAndDecryptionException1.addSuppressed((java.lang.Throwable) encryptionAndDecryptionException3);

    }



    @Test

    public void test311() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test311");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA3-512WithRSA");

        java.lang.Throwable[] throwableArray2 = encryptionAndDecryptionException1.getSuppressed();

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException4 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA3-512WithRSA");

        java.lang.Throwable[] throwableArray5 = encryptionAndDecryptionException4.getSuppressed();

        encryptionAndDecryptionException1.addSuppressed((java.lang.Throwable) encryptionAndDecryptionException4);

        org.junit.Assert.assertNotNull(throwableArray2);

        org.junit.Assert.assertNotNull(throwableArray5);

    }



    @Test

    public void test312() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test312");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSM3 = "hi!";

    }



    @Test

    public void test313() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test313");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray1, "SHA224");

        java.security.cert.Certificate certificate9 = null;

        java.security.PrivateKey privateKey10 = null;

        java.security.cert.Certificate[] certificateArray11 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data12 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate9, privateKey10, certificateArray11);

        java.security.cert.Certificate[] certificateArray13 = p12Data12.getCertificateChain();

        java.security.cert.Certificate[] certificateArray14 = p12Data12.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate15 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey16 = null;

        java.security.cert.Certificate certificate17 = null;

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate[] certificateArray19 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data20 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate17, privateKey18, certificateArray19);

        java.security.cert.Certificate[] certificateArray21 = p12Data20.getCertificateChain();

        java.security.cert.Certificate[] certificateArray22 = p12Data20.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data23 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate15, privateKey16, certificateArray22);

        p12Data12.setCert((java.security.cert.Certificate) x509Certificate15);

        java.security.PrivateKey privateKey25 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate26 = null;

        java.security.PrivateKey privateKey27 = null;

        java.security.cert.Certificate[] certificateArray28 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate26, privateKey27, certificateArray28);

        java.security.cert.Certificate[] certificateArray30 = p12Data29.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data31 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate15, privateKey25, certificateArray30);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray33 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray8, privateKey25, "MD5");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-29, 63, -99, 117, -26, -82, 19, 105, -37, -85, -8, 27, -106, -76, 89, 26, -28, 107, -70, 48, -75, -111, -90, -74, -58, 37, 66, -75]");

        org.junit.Assert.assertNotNull(certificateArray11);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(x509Certificate15);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(privateKey25);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray30);

    }



    @Test

    public void test314() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test314");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA512 = "SM2WITHSHA512";

    }



    @Test

    public void test315() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test315");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = p12Data3.getCert();

        java.security.PrivateKey privateKey7 = p12Data3.getPrivateKey();

        java.security.PrivateKey privateKey8 = p12Data3.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool9 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate17 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey18 = null;

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        java.security.cert.Certificate[] certificateArray24 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey18, certificateArray24);

        p12Data14.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.PrivateKey privateKey27 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate28 = null;

        java.security.PrivateKey privateKey29 = null;

        java.security.cert.Certificate[] certificateArray30 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data31 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate28, privateKey29, certificateArray30);

        java.security.cert.Certificate[] certificateArray32 = p12Data31.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data33 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey27, certificateArray32);

        symmetricTool9.setRSAroot(privateKey10, x509Certificate17);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate17);

        java.security.cert.Certificate certificate36 = null;

        java.security.PrivateKey privateKey37 = null;

        java.security.cert.Certificate[] certificateArray38 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data39 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate36, privateKey37, certificateArray38);

        java.security.cert.Certificate[] certificateArray40 = p12Data39.getCertificateChain();

        java.security.cert.Certificate[] certificateArray41 = p12Data39.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate42 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey43 = null;

        java.security.cert.Certificate certificate44 = null;

        java.security.PrivateKey privateKey45 = null;

        java.security.cert.Certificate[] certificateArray46 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data47 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate44, privateKey45, certificateArray46);

        java.security.cert.Certificate[] certificateArray48 = p12Data47.getCertificateChain();

        java.security.cert.Certificate[] certificateArray49 = p12Data47.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data50 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey43, certificateArray49);

        p12Data39.setCert((java.security.cert.Certificate) x509Certificate42);

        java.security.PrivateKey privateKey52 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate53 = null;

        java.security.PrivateKey privateKey54 = null;

        java.security.cert.Certificate[] certificateArray55 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data56 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate53, privateKey54, certificateArray55);

        java.security.cert.Certificate[] certificateArray57 = p12Data56.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data58 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate42, privateKey52, certificateArray57);

        java.security.cert.Certificate certificate59 = null;

        java.security.PrivateKey privateKey60 = null;

        java.security.cert.Certificate[] certificateArray61 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data62 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate59, privateKey60, certificateArray61);

        java.security.cert.Certificate[] certificateArray63 = p12Data62.getCertificateChain();

        java.security.cert.Certificate[] certificateArray64 = p12Data62.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data65 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate17, privateKey52, certificateArray64);

        byte[] byteArray67 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey68 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray67);

        java.security.PrivateKey privateKey69 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray67);

        java.security.PublicKey publicKey70 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray67);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray73 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.toPKCS10(privateKey52, publicKey70, "SM2WITHSM3", "SM2WITHSHA512");

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: improperly specified input name: SM2WITHSM3");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(certificate6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNotNull(privateKey10);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(x509Certificate17);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(privateKey27);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray32);

        org.junit.Assert.assertNotNull(certificateArray38);

        org.junit.Assert.assertNotNull(certificateArray40);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(x509Certificate42);

        org.junit.Assert.assertNotNull(certificateArray46);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(privateKey52);

        org.junit.Assert.assertNotNull(certificateArray55);

        org.junit.Assert.assertNotNull(certificateArray57);

        org.junit.Assert.assertNotNull(certificateArray61);

        org.junit.Assert.assertNotNull(certificateArray63);

        org.junit.Assert.assertNotNull(certificateArray64);

        org.junit.Assert.assertNotNull(byteArray67);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[-1]");

        org.junit.Assert.assertNull(publicKey68);

        org.junit.Assert.assertNull(privateKey69);

        org.junit.Assert.assertNotNull(publicKey70);

    }



    @Test

    public void test316() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test316");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.util.Date date10 = publicKeyInfo9.getNotBefore();

        byte[] byteArray12 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey13 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray12);

        java.security.PrivateKey privateKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray12);

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray12);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate16 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getX509Certificate(publicKeyInfo9, publicKey15);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: badly formatted directory string");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNull(date10);

        org.junit.Assert.assertNotNull(byteArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");

        org.junit.Assert.assertNull(publicKey13);

        org.junit.Assert.assertNull(privateKey14);

        org.junit.Assert.assertNotNull(publicKey15);

    }



    @Test

    public void test317() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test317");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.SHA1;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA1" + "'", str0, "SHA1");

    }



    @Test

    public void test318() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test318");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA512WithRSA;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHA3-512WithRSA" + "'", str0, "SHA3-512WithRSA");

    }



    @Test

    public void test319() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test319");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray8);

        byte[] byteArray11 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey12 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray11);

        java.security.PublicKey publicKey13 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray11);

        byte[] byteArray15 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray15);

        java.security.PrivateKey privateKey17 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray15);

        java.security.PublicKey publicKey18 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray15);

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean20 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray8, byteArray11, publicKey18, "SHA256WithRSA");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNotNull(byteArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");

        org.junit.Assert.assertNull(publicKey12);

        org.junit.Assert.assertNull(publicKey13);

        org.junit.Assert.assertNotNull(byteArray15);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");

        org.junit.Assert.assertNull(publicKey16);

        org.junit.Assert.assertNull(privateKey17);

        org.junit.Assert.assertNotNull(publicKey18);

    }



    @Test

    public void test320() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test320");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_256WithRSA = "SM2WITHSHA512";

    }



    @Test

    public void test321() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test321");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA256");

        publicKeyInfo3.setSubject("MD2");

    }



    @Test

    public void test322() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test322");

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher0 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_PKCS7Padding;

        java.lang.String str1 = cipher0.getAlgorithm();

        org.junit.Assert.assertTrue("'" + cipher0 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_PKCS7Padding + "'", cipher0.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DESede_ECB_PKCS7Padding));

        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DESede/ECB/PKCS7Padding" + "'", str1, "DESede/ECB/PKCS7Padding");

    }



    @Test

    public void test323() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test323");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.lang.String str4 = publicKeyInfo3.getSubject();

        java.lang.String str5 = publicKeyInfo3.getSubject();

        java.util.Date date6 = publicKeyInfo3.getNotBefore();

        java.util.Date date7 = publicKeyInfo3.getNotBefore();

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SM2WITHSHA512" + "'", str4, "SM2WITHSHA512");

        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SM2WITHSHA512" + "'", str5, "SM2WITHSHA512");

        org.junit.Assert.assertNull(date6);

        org.junit.Assert.assertNull(date7);

    }



    @Test

    public void test324() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test324");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL = "AES";

    }



    @Test

    public void test325() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test325");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray8);

        byte[] byteArray11 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey12 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray11);

        byte[] byteArray14 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray14);

        java.security.PublicKey publicKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray11, byteArray14);

        java.security.PrivateKey privateKey17 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray11);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher18 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_PKCS5Padding;

        byte[] byteArray20 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey21 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray20);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray22 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray11, cipher18, byteArray20);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: IV must be 8 bytes long.");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNotNull(byteArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");

        org.junit.Assert.assertNull(publicKey12);

        org.junit.Assert.assertNotNull(byteArray14);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");

        org.junit.Assert.assertNull(publicKey15);

        org.junit.Assert.assertNull(publicKey16);

        org.junit.Assert.assertNull(privateKey17);

        org.junit.Assert.assertTrue("'" + cipher18 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_PKCS5Padding + "'", cipher18.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_PKCS5Padding));

        org.junit.Assert.assertNotNull(byteArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");

        org.junit.Assert.assertNull(publicKey21);

    }



    @Test

    public void test326() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test326");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_224WithRSA = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA384WithRSA";

    }



    @Test

    public void test327() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test327");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "pkcs12");

        java.util.Date date4 = publicKeyInfo3.getNotBefore();

        org.junit.Assert.assertNull(date4);

    }



    @Test

    public void test328() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test328");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA = "SM3";

    }



    @Test

    public void test329() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test329");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherTOGMC1C3C2(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

    }



    @Test

    public void test330() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test330");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data4 = lich.tool.encryptionAndDecryption.core.asymmetric.KeyStoreTool.loadPKCS12(byteArray1, "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ");

            org.junit.Assert.fail("Expected exception of type java.security.KeyStoreException; message:  not found");

        } catch (java.security.KeyStoreException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test331() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test331");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SHA256WITHSM2 = "SHA384WithRSA";

    }



    @Test

    public void test332() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test332");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray4);

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKey(byteArray1, byteArray4);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Scalar is not in the interval [1, n - 1]");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");

        org.junit.Assert.assertNull(publicKey5);

    }



    @Test

    public void test333() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test333");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2B = "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: ";

    }



    @Test

    public void test334() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test334");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2S = "SM2WITHSHA256";

    }



    @Test

    public void test335() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test335");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.math.BigInteger bigInteger10 = publicKeyInfo9.getSerial();

        java.util.Date date11 = null;

        java.util.Date date12 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger10, date11, date12, "SHA3-256");

        byte[] byteArray16 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey17 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray16);

        java.security.PrivateKey privateKey18 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray16);

        java.security.PublicKey publicKey19 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray16);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate20 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getX509Certificate(publicKeyInfo14, publicKey19);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: badly formatted directory string");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNotNull(bigInteger10);

        org.junit.Assert.assertNotNull(byteArray16);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");

        org.junit.Assert.assertNull(publicKey17);

        org.junit.Assert.assertNull(privateKey18);

        org.junit.Assert.assertNotNull(publicKey19);

    }



    @Test

    public void test336() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test336");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC = "SHA1WithRSA";

    }



    @Test

    public void test337() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test337");

        byte[] byteArray0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray0, false);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test338() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test338");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC = "DESede";

    }



    @Test

    public void test339() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test339");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray1, "SHA224");

        byte[] byteArray10 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray10);

        byte[] byteArray13 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray13);

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray10, byteArray13);

        byte[] byteArray17 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray10, "SHA224");

        // The following exception was thrown during execution in test generation

        try {

            java.security.PrivateKey privateKey18 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toGMPrivateKeyBySignedAndEnvelopedData(byteArray1, byteArray10);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-29, 63, -99, 117, -26, -82, 19, 105, -37, -85, -8, 27, -106, -76, 89, 26, -28, 107, -70, 48, -75, -111, -90, -74, -58, 37, 66, -75]");

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");

        org.junit.Assert.assertNull(publicKey11);

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNull(publicKey15);

        org.junit.Assert.assertNotNull(byteArray17);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-29, 63, -99, 117, -26, -82, 19, 105, -37, -85, -8, 27, -106, -76, 89, 26, -28, 107, -70, 48, -75, -111, -90, -74, -58, 37, 66, -75]");

    }



    @Test

    public void test340() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test340");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_PKCS1PADDING = "SHA256";

    }



    @Test

    public void test341() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test341");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SHA3-512");

        java.util.Date date4 = publicKeyInfo3.getNotAfter();

        java.lang.String str5 = publicKeyInfo3.getSignatureAlgorithm();

        org.junit.Assert.assertNull(date4);

        org.junit.Assert.assertNull(str5);

    }



    @Test

    public void test342() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test342");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = publicKeyInfo3.getNotBefore();

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNull(date5);

    }



    @Test

    public void test343() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test343");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray8);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray10 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherTOGMC1C3C2(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey9);

    }



    @Test

    public void test344() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test344");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = p12Data3.getCert();

        java.security.PrivateKey privateKey7 = p12Data3.getPrivateKey();

        java.security.cert.Certificate certificate8 = p12Data3.getCert();

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(certificate6);

        org.junit.Assert.assertNull(privateKey7);

        org.junit.Assert.assertNull(certificate8);

    }



    @Test

    public void test345() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test345");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHWHIRLPOOL;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AES" + "'", str0, "AES");

    }



    @Test

    public void test346() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test346");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA1 = "SHA3-512";

    }



    @Test

    public void test347() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test347");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA256");

        java.util.Date date4 = null;

        publicKeyInfo3.setNotBefore(date4);

    }



    @Test

    public void test348() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test348");

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool0 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.X509Certificate x509Certificate2 = null;

        symmetricTool0.setGMroot(privateKey1, x509Certificate2);

        java.lang.Class<?> wildcardClass4 = symmetricTool0.getClass();

        boolean boolean6 = lich.tool.encryptionAndDecryption.ProviderMode.Check.contains((java.lang.Class) wildcardClass4, "SM2WITHMD5");

        boolean boolean8 = lich.tool.encryptionAndDecryption.ProviderMode.Check.contains((java.lang.Class) wildcardClass4, "SM2WITHMD5");

        org.junit.Assert.assertNotNull(wildcardClass4);

        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);

        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);

    }



    @Test

    public void test349() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test349");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHRIPEMD160 = "SHA512";

    }



    @Test

    public void test350() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test350");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSA = "MD2";

    }



    @Test

    public void test351() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test351");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray8);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate[] x509CertificateArray11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToChain(byteArray8, true);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey9);

    }



    @Test

    public void test352() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test352");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.RAWRSASSA_PSS = "SHA3-256WithRSA";

    }



    @Test

    public void test353() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test353");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray1, "SHA224");

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray11 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.sign(byteArray1, privateKey9, "SHA384WithRSA");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-29, 63, -99, 117, -26, -82, 19, 105, -37, -85, -8, 27, -106, -76, 89, 26, -28, 107, -70, 48, -75, -111, -90, -74, -58, 37, 66, -75]");

        org.junit.Assert.assertNotNull(privateKey9);

    }



    @Test

    public void test354() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test354");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_256WithRSA = "SM2WITHBLAKE2B";

    }



    @Test

    public void test355() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test355");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSM3 = "";

    }



    @Test

    public void test356() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test356");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHBLAKE2B = "";

    }



    @Test

    public void test357() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test357");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.util.Date date4 = null;

        publicKeyInfo3.setNotAfter(date4);

        java.util.Date date6 = null;

        java.util.Date date7 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date6, date7, "SM2WITHSHA512");

        java.lang.String str10 = publicKeyInfo9.getSubject();

        java.math.BigInteger bigInteger11 = publicKeyInfo9.getSerial();

        publicKeyInfo3.setSerial(bigInteger11);

        java.math.BigInteger bigInteger13 = publicKeyInfo3.getSerial();

        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SM2WITHSHA512" + "'", str10, "SM2WITHSHA512");

        org.junit.Assert.assertNotNull(bigInteger11);

        org.junit.Assert.assertNotNull(bigInteger13);

    }



    @Test

    public void test358() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test358");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray8);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher10 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_NOPadding;

        java.lang.String str11 = cipher10.getAlgorithm();

        byte[] byteArray13 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray13);

        java.security.PrivateKey privateKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray13);

        java.security.PublicKey publicKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray13);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray17 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray8, cipher10, byteArray13);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: ECB mode does not use an IV");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertTrue("'" + cipher10 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_NOPadding + "'", cipher10.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_ECB_NOPadding));

        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AES/ECB/NOPadding" + "'", str11, "AES/ECB/NOPadding");

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1]");

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNull(privateKey15);

        org.junit.Assert.assertNotNull(publicKey16);

    }



    @Test

    public void test359() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test359");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SHA3-512");

        java.util.Date date4 = publicKeyInfo3.getNotAfter();

        java.math.BigInteger bigInteger5 = publicKeyInfo3.getSerial();

        org.junit.Assert.assertNull(date4);

        org.junit.Assert.assertNotNull(bigInteger5);

    }



    @Test

    public void test360() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test360");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray3 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2CipherTOGMC1C3C2(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: EOF found inside tag value.");

        } catch (java.io.EOFException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

    }



    @Test

    public void test361() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test361");

        java.lang.String str0 = lich.tool.encryptionAndDecryption.ProviderMode.MessageDigest.MD4;

        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MD4" + "'", str0, "MD4");

    }



    @Test

    public void test362() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test362");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.lang.String str4 = publicKeyInfo3.getSubject();

        java.math.BigInteger bigInteger5 = publicKeyInfo3.getSerial();

        byte[] byteArray7 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray7);

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray7);

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getX509Certificate(publicKeyInfo3, publicKey10);

            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: badly formatted directory string");

        } catch (java.lang.IllegalArgumentException e) {

            // Expected exception.

        }

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SM2WITHSHA512" + "'", str4, "SM2WITHSHA512");

        org.junit.Assert.assertNotNull(bigInteger5);

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNotNull(publicKey10);

    }



    @Test

    public void test363() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test363");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA = "AES/CBC/NOPadding";

    }



    @Test

    public void test364() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test364");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };

        byte[] byteArray9 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray9);

        byte[] byteArray12 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey13 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray12);

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray9, byteArray12);

        java.security.PrivateKey privateKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray12);

        java.security.PublicKey publicKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7, byteArray12);

        byte[] byteArray18 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey19 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray18);

        byte[] byteArray21 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey22 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray21);

        java.security.PublicKey publicKey23 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray18, byteArray21);

        byte[] byteArray25 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray18, "SHA224");

        byte[] byteArray27 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey28 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray27);

        java.security.PublicKey publicKey29 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray27);

        java.security.PublicKey publicKey30 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray18, byteArray27);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray31 = defaultSM4Ext0.decrypt(byteArray12, byteArray27);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, 0, 0, 0]");

        org.junit.Assert.assertNotNull(byteArray9);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");

        org.junit.Assert.assertNull(publicKey10);

        org.junit.Assert.assertNotNull(byteArray12);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");

        org.junit.Assert.assertNull(publicKey13);

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNull(privateKey15);

        org.junit.Assert.assertNull(publicKey16);

        org.junit.Assert.assertNotNull(byteArray18);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");

        org.junit.Assert.assertNull(publicKey19);

        org.junit.Assert.assertNotNull(byteArray21);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");

        org.junit.Assert.assertNull(publicKey22);

        org.junit.Assert.assertNull(publicKey23);

        org.junit.Assert.assertNotNull(byteArray25);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-29, 63, -99, 117, -26, -82, 19, 105, -37, -85, -8, 27, -106, -76, 89, 26, -28, 107, -70, 48, -75, -111, -90, -74, -58, 37, 66, -75]");

        org.junit.Assert.assertNotNull(byteArray27);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");

        org.junit.Assert.assertNull(publicKey28);

        org.junit.Assert.assertNull(publicKey29);

        org.junit.Assert.assertNull(publicKey30);

    }



    @Test

    public void test365() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test365");

        lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool publicKeyTool0 = new lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool();

    }



    @Test

    public void test366() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test366");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        lich.tool.encryptionAndDecryption.core.Base.setSm4ext((lich.tool.encryptionAndDecryption.ext.SM4Ext) defaultSM4Ext0);

        byte[] byteArray3 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray3);

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray3);

        byte[] byteArray7 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7);

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray10 = defaultSM4Ext0.decrypt(byteArray3, byteArray7);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");

        org.junit.Assert.assertNull(publicKey4);

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNull(publicKey9);

    }



    @Test

    public void test367() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test367");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.util.Date date10 = null;

        java.util.Date date11 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date10, date11, "SM2WITHSM3", "RSASSA_PSS");

        java.math.BigInteger bigInteger15 = publicKeyInfo14.getSerial();

        java.util.Date date16 = publicKeyInfo14.getNotBefore();

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNotNull(bigInteger15);

        org.junit.Assert.assertNull(date16);

    }



    @Test

    public void test368() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test368");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.math.BigInteger bigInteger10 = publicKeyInfo9.getSerial();

        publicKeyInfo9.setSubject("SHA3-384");

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNotNull(bigInteger10);

    }



    @Test

    public void test369() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test369");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2B", "MD2");

        java.util.Date date10 = null;

        java.util.Date date11 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date10, date11, "AES/CBC/NOPadding");

        org.junit.Assert.assertNotNull(bigInteger4);

    }



    @Test

    public void test370() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test370");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.lang.String str4 = publicKeyInfo3.getSubject();

        java.math.BigInteger bigInteger5 = publicKeyInfo3.getSerial();

        java.util.Date date6 = null;

        java.util.Date date7 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo10 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger5, date6, date7, "hi!", "SM2WITHSM3");

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SM2WITHSHA512" + "'", str4, "SM2WITHSHA512");

        org.junit.Assert.assertNotNull(bigInteger5);

    }



    @Test

    public void test371() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test371");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Cipher.RSA_ECB_PKCS1PADDING = "AES";

    }



    @Test

    public void test372() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test372");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.util.Date date4 = null;

        publicKeyInfo3.setNotBefore(date4);

    }



    @Test

    public void test373() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test373");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = lich.tool.encryptionAndDecryption.core.DigestTool.getDigest(byteArray1, "SHA224");

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray9 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.SM2EncDataC1C2C3ToSM2Cipher(byteArray1);

            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");

        } catch (java.lang.NegativeArraySizeException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-29, 63, -99, 117, -26, -82, 19, 105, -37, -85, -8, 27, -106, -76, 89, 26, -28, 107, -70, 48, -75, -111, -90, -74, -58, 37, 66, -75]");

    }



    @Test

    public void test374() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test374");

        byte[] byteArray0 = null;

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToX509Certificate(byteArray0, true);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

    }



    @Test

    public void test375() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test375");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA1 = "MD4";

    }



    @Test

    public void test376() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test376");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.KeyPairGenerator.EC = "SHA384";

    }



    @Test

    public void test377() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test377");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA3-512WithRSA");

        java.lang.Throwable[] throwableArray2 = encryptionAndDecryptionException1.getSuppressed();

        java.lang.String str3 = encryptionAndDecryptionException1.toString();

        org.junit.Assert.assertNotNull(throwableArray2);

        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA3-512WithRSA" + "'", str3, "lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException: SHA3-512WithRSA");

    }



    @Test

    public void test378() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test378");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.PrivateKey privateKey6 = p12Data3.getPrivateKey();

        java.security.cert.Certificate certificate7 = null;

        java.security.PrivateKey privateKey8 = null;

        java.security.cert.Certificate[] certificateArray9 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data10 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate7, privateKey8, certificateArray9);

        java.security.cert.Certificate[] certificateArray11 = p12Data10.getCertificateChain();

        java.security.cert.Certificate[] certificateArray12 = p12Data10.getCertificateChain();

        java.security.PrivateKey privateKey13 = p12Data10.getPrivateKey();

        java.security.cert.Certificate certificate14 = null;

        java.security.PrivateKey privateKey15 = null;

        java.security.cert.Certificate[] certificateArray16 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data17 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate14, privateKey15, certificateArray16);

        java.security.cert.Certificate[] certificateArray18 = p12Data17.getCertificateChain();

        java.security.cert.Certificate[] certificateArray19 = p12Data17.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate20 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey21 = null;

        java.security.cert.Certificate certificate22 = null;

        java.security.PrivateKey privateKey23 = null;

        java.security.cert.Certificate[] certificateArray24 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate22, privateKey23, certificateArray24);

        java.security.cert.Certificate[] certificateArray26 = p12Data25.getCertificateChain();

        java.security.cert.Certificate[] certificateArray27 = p12Data25.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data28 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate20, privateKey21, certificateArray27);

        p12Data17.setCert((java.security.cert.Certificate) x509Certificate20);

        java.security.PrivateKey privateKey30 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate31 = null;

        java.security.PrivateKey privateKey32 = null;

        java.security.cert.Certificate[] certificateArray33 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data34 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate31, privateKey32, certificateArray33);

        java.security.cert.Certificate[] certificateArray35 = p12Data34.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data36 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate20, privateKey30, certificateArray35);

        p12Data10.setCert((java.security.cert.Certificate) x509Certificate20);

        p12Data3.setCert((java.security.cert.Certificate) x509Certificate20);

        java.security.PrivateKey privateKey39 = p12Data3.getPrivateKey();

        java.security.cert.Certificate[] certificateArray40 = p12Data3.getCertificateChain();

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNull(privateKey6);

        org.junit.Assert.assertNotNull(certificateArray9);

        org.junit.Assert.assertNotNull(certificateArray11);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNull(privateKey13);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray18);

        org.junit.Assert.assertNotNull(certificateArray19);

        org.junit.Assert.assertNotNull(x509Certificate20);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(certificateArray26);

        org.junit.Assert.assertNotNull(certificateArray27);

        org.junit.Assert.assertNotNull(privateKey30);

        org.junit.Assert.assertNotNull(certificateArray33);

        org.junit.Assert.assertNotNull(certificateArray35);

        org.junit.Assert.assertNull(privateKey39);

        org.junit.Assert.assertNotNull(certificateArray40);

    }



    @Test

    public void test379() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test379");

        lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext defaultSM4Ext0 = new lich.tool.encryptionAndDecryption.ext.DefaultSM4Ext();

        byte[] byteArray2 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray2);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray2);

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray2);

        byte[] byteArray7 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray7);

        byte[] byteArray10 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray10);

        java.security.PublicKey publicKey12 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray7, byteArray10);

        java.security.PrivateKey privateKey13 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray10);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray14 = defaultSM4Ext0.decrypt(byteArray2, byteArray10);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: SM4 requires a 128 bit key");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray2);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");

        org.junit.Assert.assertNull(publicKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(publicKey5);

        org.junit.Assert.assertNotNull(byteArray7);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");

        org.junit.Assert.assertNull(publicKey8);

        org.junit.Assert.assertNotNull(byteArray10);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");

        org.junit.Assert.assertNull(publicKey11);

        org.junit.Assert.assertNull(publicKey12);

        org.junit.Assert.assertNull(privateKey13);

    }



    @Test

    public void test380() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test380");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2 = "MD4";

    }



    @Test

    public void test381() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test381");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.lang.String str4 = publicKeyInfo3.getSubject();

        java.math.BigInteger bigInteger5 = publicKeyInfo3.getSerial();

        java.util.Date date6 = null;

        java.util.Date date7 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger5, date6, date7, "SHA384WithRSA");

        java.util.Date date10 = null;

        java.util.Date date11 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger5, date10, date11, "SHA3-224");

        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SM2WITHSHA512" + "'", str4, "SM2WITHSHA512");

        org.junit.Assert.assertNotNull(bigInteger5);

    }



    @Test

    public void test382() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test382");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2B", "MD2");

        java.util.Date date10 = null;

        java.util.Date date11 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date10, date11, "AES/CBC/NOPadding", "SM3");

        org.junit.Assert.assertNotNull(bigInteger4);

    }



    @Test

    public void test383() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test383");

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool0 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey1 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate2 = null;

        java.security.PrivateKey privateKey3 = null;

        java.security.cert.Certificate[] certificateArray4 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data5 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate2, privateKey3, certificateArray4);

        java.security.cert.Certificate[] certificateArray6 = p12Data5.getCertificateChain();

        java.security.cert.Certificate[] certificateArray7 = p12Data5.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate8 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey9 = null;

        java.security.cert.Certificate certificate10 = null;

        java.security.PrivateKey privateKey11 = null;

        java.security.cert.Certificate[] certificateArray12 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data13 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate10, privateKey11, certificateArray12);

        java.security.cert.Certificate[] certificateArray14 = p12Data13.getCertificateChain();

        java.security.cert.Certificate[] certificateArray15 = p12Data13.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data16 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey9, certificateArray15);

        p12Data5.setCert((java.security.cert.Certificate) x509Certificate8);

        java.security.PrivateKey privateKey18 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate19 = null;

        java.security.PrivateKey privateKey20 = null;

        java.security.cert.Certificate[] certificateArray21 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data22 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate19, privateKey20, certificateArray21);

        java.security.cert.Certificate[] certificateArray23 = p12Data22.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data24 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey18, certificateArray23);

        symmetricTool0.setRSAroot(privateKey1, x509Certificate8);

        java.security.cert.Certificate certificate26 = null;

        java.security.PrivateKey privateKey27 = null;

        java.security.cert.Certificate[] certificateArray28 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data29 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate26, privateKey27, certificateArray28);

        java.security.cert.Certificate[] certificateArray30 = p12Data29.getCertificateChain();

        java.security.cert.Certificate[] certificateArray31 = p12Data29.getCertificateChain();

        java.security.cert.Certificate certificate32 = p12Data29.getCert();

        java.security.PrivateKey privateKey33 = p12Data29.getPrivateKey();

        java.security.PrivateKey privateKey34 = p12Data29.getPrivateKey();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool35 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey36 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate37 = null;

        java.security.PrivateKey privateKey38 = null;

        java.security.cert.Certificate[] certificateArray39 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data40 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate37, privateKey38, certificateArray39);

        java.security.cert.Certificate[] certificateArray41 = p12Data40.getCertificateChain();

        java.security.cert.Certificate[] certificateArray42 = p12Data40.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate43 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey44 = null;

        java.security.cert.Certificate certificate45 = null;

        java.security.PrivateKey privateKey46 = null;

        java.security.cert.Certificate[] certificateArray47 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data48 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate45, privateKey46, certificateArray47);

        java.security.cert.Certificate[] certificateArray49 = p12Data48.getCertificateChain();

        java.security.cert.Certificate[] certificateArray50 = p12Data48.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data51 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey44, certificateArray50);

        p12Data40.setCert((java.security.cert.Certificate) x509Certificate43);

        java.security.PrivateKey privateKey53 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate54 = null;

        java.security.PrivateKey privateKey55 = null;

        java.security.cert.Certificate[] certificateArray56 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data57 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate54, privateKey55, certificateArray56);

        java.security.cert.Certificate[] certificateArray58 = p12Data57.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data59 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey53, certificateArray58);

        symmetricTool35.setRSAroot(privateKey36, x509Certificate43);

        p12Data29.setCert((java.security.cert.Certificate) x509Certificate43);

        java.security.cert.Certificate certificate62 = null;

        java.security.PrivateKey privateKey63 = null;

        java.security.cert.Certificate[] certificateArray64 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data65 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate62, privateKey63, certificateArray64);

        java.security.cert.Certificate[] certificateArray66 = p12Data65.getCertificateChain();

        java.security.cert.Certificate[] certificateArray67 = p12Data65.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate68 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey69 = null;

        java.security.cert.Certificate certificate70 = null;

        java.security.PrivateKey privateKey71 = null;

        java.security.cert.Certificate[] certificateArray72 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data73 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate70, privateKey71, certificateArray72);

        java.security.cert.Certificate[] certificateArray74 = p12Data73.getCertificateChain();

        java.security.cert.Certificate[] certificateArray75 = p12Data73.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data76 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate68, privateKey69, certificateArray75);

        p12Data65.setCert((java.security.cert.Certificate) x509Certificate68);

        java.security.PrivateKey privateKey78 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate79 = null;

        java.security.PrivateKey privateKey80 = null;

        java.security.cert.Certificate[] certificateArray81 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data82 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate79, privateKey80, certificateArray81);

        java.security.cert.Certificate[] certificateArray83 = p12Data82.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data84 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate68, privateKey78, certificateArray83);

        java.security.cert.Certificate certificate85 = null;

        java.security.PrivateKey privateKey86 = null;

        java.security.cert.Certificate[] certificateArray87 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data88 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate85, privateKey86, certificateArray87);

        java.security.cert.Certificate[] certificateArray89 = p12Data88.getCertificateChain();

        java.security.cert.Certificate[] certificateArray90 = p12Data88.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data91 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate43, privateKey78, certificateArray90);

        java.security.cert.Certificate certificate92 = null;

        java.security.PrivateKey privateKey93 = null;

        java.security.cert.Certificate[] certificateArray94 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data95 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate92, privateKey93, certificateArray94);

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data96 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate8, privateKey78, certificateArray94);

        org.junit.Assert.assertNotNull(privateKey1);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray6);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(x509Certificate8);

        org.junit.Assert.assertNotNull(certificateArray12);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(privateKey18);

        org.junit.Assert.assertNotNull(certificateArray21);

        org.junit.Assert.assertNotNull(certificateArray23);

        org.junit.Assert.assertNotNull(certificateArray28);

        org.junit.Assert.assertNotNull(certificateArray30);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNull(certificate32);

        org.junit.Assert.assertNull(privateKey33);

        org.junit.Assert.assertNull(privateKey34);

        org.junit.Assert.assertNotNull(privateKey36);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(certificateArray41);

        org.junit.Assert.assertNotNull(certificateArray42);

        org.junit.Assert.assertNotNull(x509Certificate43);

        org.junit.Assert.assertNotNull(certificateArray47);

        org.junit.Assert.assertNotNull(certificateArray49);

        org.junit.Assert.assertNotNull(certificateArray50);

        org.junit.Assert.assertNotNull(privateKey53);

        org.junit.Assert.assertNotNull(certificateArray56);

        org.junit.Assert.assertNotNull(certificateArray58);

        org.junit.Assert.assertNotNull(certificateArray64);

        org.junit.Assert.assertNotNull(certificateArray66);

        org.junit.Assert.assertNotNull(certificateArray67);

        org.junit.Assert.assertNotNull(x509Certificate68);

        org.junit.Assert.assertNotNull(certificateArray72);

        org.junit.Assert.assertNotNull(certificateArray74);

        org.junit.Assert.assertNotNull(certificateArray75);

        org.junit.Assert.assertNotNull(privateKey78);

        org.junit.Assert.assertNotNull(certificateArray81);

        org.junit.Assert.assertNotNull(certificateArray83);

        org.junit.Assert.assertNotNull(certificateArray87);

        org.junit.Assert.assertNotNull(certificateArray89);

        org.junit.Assert.assertNotNull(certificateArray90);

        org.junit.Assert.assertNotNull(certificateArray94);

    }



    @Test

    public void test384() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test384");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_224WithRSA = "SHA224";

    }



    @Test

    public void test385() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test385");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.math.BigInteger bigInteger10 = publicKeyInfo9.getSerial();

        java.util.Date date11 = null;

        java.util.Date date12 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger10, date11, date12, "SHA3-512WithRSA", "MD2");

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNotNull(bigInteger10);

    }



    @Test

    public void test386() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test386");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        byte[] byteArray4 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray4);

        java.security.PublicKey publicKey6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray4);

        byte[] byteArray8 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray8);

        java.security.PrivateKey privateKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray8);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher11 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_NOPadding;

        byte[] byteArray13 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray13);

        java.security.PrivateKey privateKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray13);

        java.security.PrivateKey privateKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray13);

        byte[] byteArray18 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey19 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray18);

        java.security.PrivateKey privateKey20 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray18);

        java.security.PrivateKey privateKey21 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray18);

        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey26 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray18, byteArray25);

        java.security.PublicKey publicKey27 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray13, byteArray18);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray28 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray8, cipher11, byteArray13);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidAlgorithmParameterException; message: IV must be 8 bytes long.");

        } catch (java.security.InvalidAlgorithmParameterException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray4);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");

        org.junit.Assert.assertNull(publicKey5);

        org.junit.Assert.assertNull(publicKey6);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNull(privateKey10);

        org.junit.Assert.assertTrue("'" + cipher11 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_NOPadding + "'", cipher11.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.DES_CBC_NOPadding));

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1]");

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNull(privateKey15);

        org.junit.Assert.assertNull(privateKey16);

        org.junit.Assert.assertNotNull(byteArray18);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");

        org.junit.Assert.assertNull(publicKey19);

        org.junit.Assert.assertNull(privateKey20);

        org.junit.Assert.assertNull(privateKey21);

        org.junit.Assert.assertNotNull(byteArray25);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey26);

        org.junit.Assert.assertNotNull(publicKey27);

    }



    @Test

    public void test387() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test387");

        java.security.cert.Certificate certificate0 = null;

        java.security.PrivateKey privateKey1 = null;

        java.security.cert.Certificate[] certificateArray2 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate0, privateKey1, certificateArray2);

        java.security.cert.Certificate[] certificateArray4 = p12Data3.getCertificateChain();

        java.security.cert.Certificate[] certificateArray5 = p12Data3.getCertificateChain();

        java.security.cert.Certificate certificate6 = null;

        java.security.PrivateKey privateKey7 = null;

        java.security.cert.Certificate[] certificateArray8 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate6, privateKey7, certificateArray8);

        java.security.cert.Certificate[] certificateArray10 = p12Data9.getCertificateChain();

        p12Data3.setCertificateChain(certificateArray10);

        java.security.cert.Certificate certificate12 = null;

        java.security.PrivateKey privateKey13 = null;

        java.security.cert.Certificate[] certificateArray14 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data15 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate12, privateKey13, certificateArray14);

        java.security.cert.Certificate[] certificateArray16 = p12Data15.getCertificateChain();

        java.security.cert.Certificate[] certificateArray17 = p12Data15.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate18 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey19 = null;

        java.security.cert.Certificate certificate20 = null;

        java.security.PrivateKey privateKey21 = null;

        java.security.cert.Certificate[] certificateArray22 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data23 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate20, privateKey21, certificateArray22);

        java.security.cert.Certificate[] certificateArray24 = p12Data23.getCertificateChain();

        java.security.cert.Certificate[] certificateArray25 = p12Data23.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data26 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate18, privateKey19, certificateArray25);

        p12Data15.setCert((java.security.cert.Certificate) x509Certificate18);

        java.security.PrivateKey privateKey28 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate29 = null;

        java.security.PrivateKey privateKey30 = null;

        java.security.cert.Certificate[] certificateArray31 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data32 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate29, privateKey30, certificateArray31);

        java.security.cert.Certificate[] certificateArray33 = p12Data32.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data34 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate18, privateKey28, certificateArray33);

        java.security.cert.Certificate certificate35 = null;

        java.security.PrivateKey privateKey36 = null;

        java.security.cert.Certificate[] certificateArray37 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data38 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate35, privateKey36, certificateArray37);

        java.security.cert.Certificate[] certificateArray39 = p12Data38.getCertificateChain();

        java.security.cert.Certificate[] certificateArray40 = p12Data38.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate41 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey42 = null;

        java.security.cert.Certificate certificate43 = null;

        java.security.PrivateKey privateKey44 = null;

        java.security.cert.Certificate[] certificateArray45 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data46 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate43, privateKey44, certificateArray45);

        java.security.cert.Certificate[] certificateArray47 = p12Data46.getCertificateChain();

        java.security.cert.Certificate[] certificateArray48 = p12Data46.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data49 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate41, privateKey42, certificateArray48);

        p12Data38.setCert((java.security.cert.Certificate) x509Certificate41);

        java.security.PrivateKey privateKey51 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate52 = null;

        java.security.PrivateKey privateKey53 = null;

        java.security.cert.Certificate[] certificateArray54 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data55 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate52, privateKey53, certificateArray54);

        java.security.cert.Certificate[] certificateArray56 = p12Data55.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data57 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate41, privateKey51, certificateArray56);

        java.security.cert.Certificate certificate58 = p12Data57.getCert();

        java.security.PrivateKey privateKey59 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate60 = null;

        java.security.PrivateKey privateKey61 = null;

        java.security.cert.Certificate[] certificateArray62 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data63 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate60, privateKey61, certificateArray62);

        java.security.cert.Certificate[] certificateArray64 = p12Data63.getCertificateChain();

        java.security.cert.Certificate[] certificateArray65 = p12Data63.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate66 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey67 = null;

        java.security.cert.Certificate certificate68 = null;

        java.security.PrivateKey privateKey69 = null;

        java.security.cert.Certificate[] certificateArray70 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data71 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate68, privateKey69, certificateArray70);

        java.security.cert.Certificate[] certificateArray72 = p12Data71.getCertificateChain();

        java.security.cert.Certificate[] certificateArray73 = p12Data71.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data74 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate66, privateKey67, certificateArray73);

        p12Data63.setCert((java.security.cert.Certificate) x509Certificate66);

        java.security.PrivateKey privateKey76 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate77 = null;

        java.security.PrivateKey privateKey78 = null;

        java.security.cert.Certificate[] certificateArray79 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data80 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate77, privateKey78, certificateArray79);

        java.security.cert.Certificate[] certificateArray81 = p12Data80.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data82 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate66, privateKey76, certificateArray81);

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data83 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate58, privateKey59, certificateArray81);

        p12Data34.setPrivateKey(privateKey59);

        p12Data3.setPrivateKey(privateKey59);

        org.junit.Assert.assertNotNull(certificateArray2);

        org.junit.Assert.assertNotNull(certificateArray4);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray8);

        org.junit.Assert.assertNotNull(certificateArray10);

        org.junit.Assert.assertNotNull(certificateArray14);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(certificateArray17);

        org.junit.Assert.assertNotNull(x509Certificate18);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(certificateArray24);

        org.junit.Assert.assertNotNull(certificateArray25);

        org.junit.Assert.assertNotNull(privateKey28);

        org.junit.Assert.assertNotNull(certificateArray31);

        org.junit.Assert.assertNotNull(certificateArray33);

        org.junit.Assert.assertNotNull(certificateArray37);

        org.junit.Assert.assertNotNull(certificateArray39);

        org.junit.Assert.assertNotNull(certificateArray40);

        org.junit.Assert.assertNotNull(x509Certificate41);

        org.junit.Assert.assertNotNull(certificateArray45);

        org.junit.Assert.assertNotNull(certificateArray47);

        org.junit.Assert.assertNotNull(certificateArray48);

        org.junit.Assert.assertNotNull(privateKey51);

        org.junit.Assert.assertNotNull(certificateArray54);

        org.junit.Assert.assertNotNull(certificateArray56);

        org.junit.Assert.assertNotNull(certificate58);

        org.junit.Assert.assertNotNull(privateKey59);

        org.junit.Assert.assertNotNull(certificateArray62);

        org.junit.Assert.assertNotNull(certificateArray64);

        org.junit.Assert.assertNotNull(certificateArray65);

        org.junit.Assert.assertNotNull(x509Certificate66);

        org.junit.Assert.assertNotNull(certificateArray70);

        org.junit.Assert.assertNotNull(certificateArray72);

        org.junit.Assert.assertNotNull(certificateArray73);

        org.junit.Assert.assertNotNull(privateKey76);

        org.junit.Assert.assertNotNull(certificateArray79);

        org.junit.Assert.assertNotNull(certificateArray81);

    }



    @Test

    public void test388() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test388");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHSHA512 = "SHA256WithRSA";

    }



    @Test

    public void test389() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test389");

        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate6 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadX509Certificate(byteArray5);

            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: corrupted stream - out of bounds length found: 100 >= 5");

        } catch (java.io.IOException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray5);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, 1, 100]");

    }



    @Test

    public void test390() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test390");

        byte[] byteArray1 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        byte[] byteArray3 = new byte[] {};

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher4 = null;

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        byte[] byteArray9 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey10 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray9);

        java.security.PublicKey publicKey11 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6, byteArray9);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray12 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray1, byteArray3, cipher4, byteArray9);

            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");

        } catch (java.lang.NullPointerException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNotNull(byteArray3);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNotNull(byteArray9);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");

        org.junit.Assert.assertNull(publicKey10);

        org.junit.Assert.assertNull(publicKey11);

    }



    @Test

    public void test391() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test391");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Cipher.SM2WITHMD5 = "MD4";

    }



    @Test

    public void test392() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test392");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "hi!";

    }



    @Test

    public void test393() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test393");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SHA3-224");

    }



    @Test

    public void test394() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test394");

        lich.tool.encryptionAndDecryption.core.DigestTool digestTool0 = new lich.tool.encryptionAndDecryption.core.DigestTool();

        lich.tool.encryptionAndDecryption.core.SymmetricTool symmetricTool1 = new lich.tool.encryptionAndDecryption.core.SymmetricTool();

        java.security.PrivateKey privateKey2 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate3 = null;

        java.security.PrivateKey privateKey4 = null;

        java.security.cert.Certificate[] certificateArray5 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data6 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate3, privateKey4, certificateArray5);

        java.security.cert.Certificate[] certificateArray7 = p12Data6.getCertificateChain();

        java.security.cert.Certificate[] certificateArray8 = p12Data6.getCertificateChain();

        java.security.cert.X509Certificate x509Certificate9 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAX509Certificate();

        java.security.PrivateKey privateKey10 = null;

        java.security.cert.Certificate certificate11 = null;

        java.security.PrivateKey privateKey12 = null;

        java.security.cert.Certificate[] certificateArray13 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate11, privateKey12, certificateArray13);

        java.security.cert.Certificate[] certificateArray15 = p12Data14.getCertificateChain();

        java.security.cert.Certificate[] certificateArray16 = p12Data14.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data17 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate9, privateKey10, certificateArray16);

        p12Data6.setCert((java.security.cert.Certificate) x509Certificate9);

        java.security.PrivateKey privateKey19 = lich.tool.encryptionAndDecryption.core.Base.getRootRSAPrivateKey();

        java.security.cert.Certificate certificate20 = null;

        java.security.PrivateKey privateKey21 = null;

        java.security.cert.Certificate[] certificateArray22 = new java.security.cert.Certificate[] {};

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data23 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data(certificate20, privateKey21, certificateArray22);

        java.security.cert.Certificate[] certificateArray24 = p12Data23.getCertificateChain();

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data p12Data25 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.P12Data((java.security.cert.Certificate) x509Certificate9, privateKey19, certificateArray24);

        symmetricTool1.setRSAroot(privateKey2, x509Certificate9);

        java.security.cert.X509Certificate x509Certificate27 = null;

        digestTool0.setRSAroot(privateKey2, x509Certificate27);

        org.junit.Assert.assertNotNull(privateKey2);

        org.junit.Assert.assertNotNull(certificateArray5);

        org.junit.Assert.assertNotNull(certificateArray7);

        org.junit.Assert.assertNotNull(certificateArray8);

        org.junit.Assert.assertNotNull(x509Certificate9);

        org.junit.Assert.assertNotNull(certificateArray13);

        org.junit.Assert.assertNotNull(certificateArray15);

        org.junit.Assert.assertNotNull(certificateArray16);

        org.junit.Assert.assertNotNull(privateKey19);

        org.junit.Assert.assertNotNull(certificateArray22);

        org.junit.Assert.assertNotNull(certificateArray24);

    }



    @Test

    public void test395() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test395");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA256");

    }



    @Test

    public void test396() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test396");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA384WithRSA = "MD4";

    }



    @Test

    public void test397() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test397");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.GM.Signature.SM3WITHSM2 = "SHA3-384";

    }



    @Test

    public void test398() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test398");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray8);

        byte[] byteArray11 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey12 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray11);

        byte[] byteArray14 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray14);

        java.security.PrivateKey privateKey16 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray14);

        java.security.PublicKey publicKey17 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray14);

        // The following exception was thrown during execution in test generation

        try {

            boolean boolean19 = lich.tool.encryptionAndDecryption.core.asymmetric.AsymmetricTool.verify(byteArray8, byteArray11, publicKey17, "SM2WITHMD5");

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray8);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey9);

        org.junit.Assert.assertNotNull(byteArray11);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");

        org.junit.Assert.assertNull(publicKey12);

        org.junit.Assert.assertNotNull(byteArray14);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");

        org.junit.Assert.assertNull(publicKey15);

        org.junit.Assert.assertNull(privateKey16);

        org.junit.Assert.assertNotNull(publicKey17);

    }



    @Test

    public void test399() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test399");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_384WithRSA = "SM2WITHMD5";

    }



    @Test

    public void test400() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test400");

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException1 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA384WithRSA");

        java.lang.Throwable[] throwableArray2 = encryptionAndDecryptionException1.getSuppressed();

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException4 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("SHA384WithRSA");

        encryptionAndDecryptionException1.addSuppressed((java.lang.Throwable) encryptionAndDecryptionException4);

        lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException encryptionAndDecryptionException7 = new lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException("");

        encryptionAndDecryptionException4.addSuppressed((java.lang.Throwable) encryptionAndDecryptionException7);

        org.junit.Assert.assertNotNull(throwableArray2);

    }



    @Test

    public void test401() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test401");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.Signature.SHA3_512WithRSA = "SHA3-384";

    }



    @Test

    public void test402() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test402");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PublicKey publicKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1);

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray5 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.getPublicKeyByte(publicKey4);

            org.junit.Assert.fail("Expected exception of type lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException; message: RSA????????");

        } catch (lich.tool.encryptionAndDecryption.EncryptionAndDecryptionException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNotNull(publicKey4);

    }



    @Test

    public void test403() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test403");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6, byteArray13);

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray6);

        byte[] byteArray17 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey18 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray17);

        byte[] byteArray20 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey21 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray20);

        java.security.PublicKey publicKey22 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray17, byteArray20);

        java.security.PublicKey publicKey23 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6, byteArray20);

        // The following exception was thrown during execution in test generation

        try {

            java.security.cert.X509Certificate x509Certificate25 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.loadP7bToX509Certificate(byteArray6, true);

            org.junit.Assert.fail("Expected exception of type org.bouncycastle.cms.CMSException; message: IOException reading content.");

        } catch (org.bouncycastle.cms.CMSException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNotNull(publicKey15);

        org.junit.Assert.assertNotNull(byteArray17);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");

        org.junit.Assert.assertNull(publicKey18);

        org.junit.Assert.assertNotNull(byteArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");

        org.junit.Assert.assertNull(publicKey21);

        org.junit.Assert.assertNull(publicKey22);

        org.junit.Assert.assertNull(publicKey23);

    }



    @Test

    public void test404() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test404");

        lich.tool.encryptionAndDecryption.ProviderMode.Asymmetric.RSA.KeyPairGenerator.RSASSA_PSS = "AES";

    }



    @Test

    public void test405() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test405");

        byte[] byteArray1 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey2 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray1);

        java.security.PrivateKey privateKey3 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        java.security.PrivateKey privateKey4 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray1);

        byte[] byteArray6 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey7 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray6);

        java.security.PrivateKey privateKey8 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        java.security.PrivateKey privateKey9 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray6);

        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey14 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6, byteArray13);

        java.security.PublicKey publicKey15 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray1, byteArray6);

        byte[] byteArray17 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey18 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray17);

        byte[] byteArray20 = new byte[] { (byte) 0 };

        java.security.PublicKey publicKey21 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray20);

        java.security.PublicKey publicKey22 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray17, byteArray20);

        java.security.PublicKey publicKey23 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray6, byteArray20);

        byte[] byteArray25 = new byte[] { (byte) -1 };

        java.security.PublicKey publicKey26 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toGMPublicKey(byteArray25);

        java.security.PrivateKey privateKey27 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray25);

        java.security.PrivateKey privateKey28 = lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toRSAPrivateKey(byteArray25);

        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 0, (byte) 10 };

        java.security.PublicKey publicKey33 = lich.tool.encryptionAndDecryption.core.asymmetric.PublicKeyTool.toRSAPublicKey(byteArray25, byteArray32);

        lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher cipher34 = lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding;

        // The following exception was thrown during execution in test generation

        try {

            byte[] byteArray35 = lich.tool.encryptionAndDecryption.core.SymmetricTool.encrypt(byteArray20, byteArray32, cipher34);

            org.junit.Assert.fail("Expected exception of type java.security.InvalidKeyException; message: Key length not 128/192/256 bits.");

        } catch (java.security.InvalidKeyException e) {

            // Expected exception.

        }

        org.junit.Assert.assertNotNull(byteArray1);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");

        org.junit.Assert.assertNull(publicKey2);

        org.junit.Assert.assertNull(privateKey3);

        org.junit.Assert.assertNull(privateKey4);

        org.junit.Assert.assertNotNull(byteArray6);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");

        org.junit.Assert.assertNull(publicKey7);

        org.junit.Assert.assertNull(privateKey8);

        org.junit.Assert.assertNull(privateKey9);

        org.junit.Assert.assertNotNull(byteArray13);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey14);

        org.junit.Assert.assertNotNull(publicKey15);

        org.junit.Assert.assertNotNull(byteArray17);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");

        org.junit.Assert.assertNull(publicKey18);

        org.junit.Assert.assertNotNull(byteArray20);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");

        org.junit.Assert.assertNull(publicKey21);

        org.junit.Assert.assertNull(publicKey22);

        org.junit.Assert.assertNull(publicKey23);

        org.junit.Assert.assertNotNull(byteArray25);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");

        org.junit.Assert.assertNull(publicKey26);

        org.junit.Assert.assertNull(privateKey27);

        org.junit.Assert.assertNull(privateKey28);

        org.junit.Assert.assertNotNull(byteArray32);

        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 0, 10]");

        org.junit.Assert.assertNull(publicKey33);

        org.junit.Assert.assertTrue("'" + cipher34 + "' != '" + lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding + "'", cipher34.equals(lich.tool.encryptionAndDecryption.ProviderMode.Symmetric.Cipher.AES_CBC_PKCS5Padding));

    }



    @Test

    public void test406() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test406");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        java.util.Date date6 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo9 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date5, date6, "SM2WITHBLAKE2S", "");

        java.util.Date date10 = null;

        java.util.Date date11 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo14 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(bigInteger4, date10, date11, "", "MD5");

        org.junit.Assert.assertNotNull(bigInteger4);

    }



    @Test

    public void test407() throws Throwable {

        if (debug)

            System.out.format("%n%s%n", "TestGroup100Case0.test407");

        java.util.Date date0 = null;

        java.util.Date date1 = null;

        lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo publicKeyInfo3 = new lich.tool.encryptionAndDecryption.asymmetric.OtherObj.PublicKeyInfo(date0, date1, "SM2WITHSHA512");

        java.math.BigInteger bigInteger4 = publicKeyInfo3.getSerial();

        java.util.Date date5 = null;

        publicKeyInfo3.setNotBefore(date5);

        java.util.Date date7 = publicKeyInfo3.getNotAfter();

        org.junit.Assert.assertNotNull(bigInteger4);

        org.junit.Assert.assertNull(date7);

    }

}
