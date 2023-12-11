package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test113_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.security.PrivateKey privateKey0 = lich.tool.encryptionAndDecryption.core.Base.getRootGMPrivateKey();
         org.junit.Assert.assertNull(privateKey0);
    }
	@Test
    public void test152_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.security.cert.X509Certificate x509Certificate0 = lich.tool.encryptionAndDecryption.core.Base.getRootGMX509Certificate();
         org.junit.Assert.assertNull(x509Certificate0);
    }
	@Test
    public void test266_1() throws Throwable {
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
            byte[] byteArray66 = null;  lich.tool.encryptionAndDecryption.core.asymmetric.PrivateKeyTool.toEnvelopedKeyBlobByGMPrivateKey(privateKey52);
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
    public void test266_2() throws Throwable {
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
             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
}