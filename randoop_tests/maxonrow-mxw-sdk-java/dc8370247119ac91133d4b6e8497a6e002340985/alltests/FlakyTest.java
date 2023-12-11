package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test051_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateFullNewWalletFile("cin", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-11-20T08-48-59.513000000Z--mxw17e5rj6p4leexgv2mtla989ve9njhmf3sevxpev.json" + "'", str2, "UTC--2023-11-20T08-48-59.513000000Z--mxw17e5rj6p4leexgv2mtla989ve9njhmf3sevxpev.json");
    }
	@Test
    public void test116_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        com.mxw.providers.Provider provider1 = wallet0.getProvider();
        java.lang.String str2 = wallet0.getPrivateKey();
        org.junit.Assert.assertNotNull(wallet0);
        org.junit.Assert.assertNull(provider1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x3f735f375f246cce0cdfc278e746452e28f6bf175d2e8b3b929b0ae58d6acca9" + "'", str2, "0x3f735f375f246cce0cdfc278e746452e28f6bf175d2e8b3b929b0ae58d6acca9");
    }
	@Test
    public void test146_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        com.mxw.providers.Provider provider1 = wallet0.getProvider();
        java.lang.String str3 = wallet0.encryptWalletJson("cin");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = wallet0.getAccountNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: missing provider");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wallet0);
        org.junit.Assert.assertNull(provider1);
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"address\":\"mxw18mfndv7kur3csup8vf60kly0dqqnmlrq0qpwh0\",\"id\":\"24f9db58-02a1-46ad-b174-050894f61bc3\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"f657ed922313c2767ca26831363056bafc823e487c39092fc2ccfb4210c94f68\",\"cipherparams\":{\"iv\":\"59062e491f87b5b7cfd9b3351238f4e8\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":48,\"n\":131072,\"p\":1,\"r\":8,\"salt\":\"298d5dddd6340fb86934cff6290bebfb7d46aca0b687c8ace8db0bd09d735baa\"},\"mac\":\"de7619e140145978c33e7b018e52a22b4bf303ab653c3bb35deefe7131e5773d\"}}" + "'", str3, "{\"address\":\"mxw18mfndv7kur3csup8vf60kly0dqqnmlrq0qpwh0\",\"id\":\"24f9db58-02a1-46ad-b174-050894f61bc3\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"f657ed922313c2767ca26831363056bafc823e487c39092fc2ccfb4210c94f68\",\"cipherparams\":{\"iv\":\"59062e491f87b5b7cfd9b3351238f4e8\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":48,\"n\":131072,\"p\":1,\"r\":8,\"salt\":\"298d5dddd6340fb86934cff6290bebfb7d46aca0b687c8ace8db0bd09d735baa\"},\"mac\":\"de7619e140145978c33e7b018e52a22b4bf303ab653c3bb35deefe7131e5773d\"}}");
    }
	@Test
    public void test169_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        java.lang.String str1 = wallet0.getPublicKey();
        org.junit.Assert.assertNotNull(wallet0);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x03fca673aef7ac30a998a60428e304e2c8f3150a11bd5e0894b100fdd9cb70d962" + "'", str1, "0x03fca673aef7ac30a998a60428e304e2c8f3150a11bd5e0894b100fdd9cb70d962");
    }
	@Test
    public void test173_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateFullNewWalletFile("/Users/yhcrown/Library/mxw", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-11-20T08-49-02.529000000Z--mxw1h58d98wvy6lq5hcyxf8jl7ahmdw5hgrdjxym4z.json" + "'", str2, "UTC--2023-11-20T08-49-02.529000000Z--mxw1h58d98wvy6lq5hcyxf8jl7ahmdw5hgrdjxym4z.json");
    }
	@Test
    public void test196_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateNewWalletFile("UTC--2023-11-20T08-49-02.529000000Z--mxw1h58d98wvy6lq5hcyxf8jl7ahmdw5hgrdjxym4z.json", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-11-20T08-49-03.335000000Z--mxw1u23mtrhsjank5f2p53fh90grthz9hkfhnag3gs.json" + "'", str2, "UTC--2023-11-20T08-49-03.335000000Z--mxw1u23mtrhsjank5f2p53fh90grthz9hkfhnag3gs.json");
    }
	@Test
    public void test340_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateNewWalletFile("latest", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-11-20T08-49-07.574000000Z--mxw1dpfktr6ssrz9awdr8f3q3q5dzpyjpa2sg0upum.json" + "'", str2, "UTC--2023-11-20T08-49-07.574000000Z--mxw1dpfktr6ssrz9awdr8f3q3q5dzpyjpa2sg0upum.json");
    }
}