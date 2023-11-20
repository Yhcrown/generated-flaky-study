import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test051_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateFullNewWalletFile("cin", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json" + "'", str2, "UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
    }

    public void test116_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        com.mxw.providers.Provider provider1 = wallet0.getProvider();
        java.lang.String str2 = wallet0.getPrivateKey();
        org.junit.Assert.assertNotNull(wallet0);
        org.junit.Assert.assertNull(provider1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d" + "'", str2, "0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d");
    }

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
         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"address\":\"mxw1hkvwyeemhn8qmwrsaycp2qrggqu9utdygc290d\",\"id\":\"6afe199a-a9c0-47bd-9638-d47aa85414dc\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"8f60bf6217ecc1b673f563917a6d4073f842859c66ef395551dbe52b24425da1\",\"cipherparams\":{\"iv\":\"aa5f4d0862987ade7b1f36b55355e276\"}

    public void test169_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        java.lang.String str1 = wallet0.getPublicKey();
        org.junit.Assert.assertNotNull(wallet0);
         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x034848d4770612501e13ce0e8f4f354ea0289394c9c249f837760ccdd53ec05a3d" + "'", str1, "0x034848d4770612501e13ce0e8f4f354ea0289394c9c249f837760ccdd53ec05a3d");
    }

    public void test173_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateFullNewWalletFile("/Users/yhcrown/Library/mxw", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-05.740000000Z--mxw1jld58vjsqa4m73jm4u7du9mszcygqrwpalhhxk.json" + "'", str2, "UTC--2023-10-31T23-40-05.740000000Z--mxw1jld58vjsqa4m73jm4u7du9mszcygqrwpalhhxk.json");
    }

    public void test196_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateNewWalletFile("UTC--2023-10-31T23-40-05.740000000Z--mxw1jld58vjsqa4m73jm4u7du9mszcygqrwpalhhxk.json", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-06.591000000Z--mxw12ldyka6g70u22zlk4p0vrdu4ph8udyw0g7kx56.json" + "'", str2, "UTC--2023-10-31T23-40-06.591000000Z--mxw12ldyka6g70u22zlk4p0vrdu4ph8udyw0g7kx56.json");
    }

    public void test340_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateNewWalletFile("latest", file1);
         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-10.922000000Z--mxw1puhd288we4g0d6g3u2aeetj3acyszny7lx9x54.json" + "'", str2, "UTC--2023-10-31T23-40-10.922000000Z--mxw1puhd288we4g0d6g3u2aeetj3acyszny7lx9x54.json");
    }
}