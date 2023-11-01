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
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.mxw.utils.Numeric.toHexStringZeroPadded(bigInteger0, 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str1 = com.mxw.crypto.Hash.sha3("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67" + "'", str1, "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.math.BigDecimal bigDecimal0 = null;
        com.mxw.utils.Convert.Unit unit1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal2 = com.mxw.utils.Convert.toCIN(bigDecimal0, unit1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = com.mxw.protocol.response.JsonTokenName.BLOCK_NUMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "blockNumber" + "'", str0, "blockNumber");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = com.mxw.Constants.Power13UnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Mcin" + "'", str0, "Mcin");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        com.mxw.crypto.Sign.SignatureData signatureData2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.mxw.crypto.Keys.verifyMessage(byteArray1, signatureData2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.mxw.utils.Numeric.toHexStringWithPrefixZeroPadded(bigInteger0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = com.mxw.crypto.Hash.sha3(byteArray3, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input buffer too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 1, 0]");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.util.Optional<int[]> intArrayOptional1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SigningKey.fromMnemonic("", intArrayOptional1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions fungibleTokenActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.MINT;
        org.junit.Assert.assertTrue("'" + fungibleTokenActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.MINT + "'", fungibleTokenActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.MINT));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.mxw.crypto.SigningKey signingKey0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.Wallet wallet1 = new com.mxw.Wallet(signingKey0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1 };
        com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair7 = new com.mxw.crypto.Bip32ECKeyPair(bigInteger0, bigInteger1, (int) '4', byteArray5, bip32ECKeyPair6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = com.mxw.protocol.response.JsonTokenName.GAS_USED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gasUsed" + "'", str0, "gasUsed");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        int int0 = com.mxw.crypto.Keys.ADDRESS_LENGTH_IN_HEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40 + "'", int0 == 40);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.mxw.crypto.Sign.SignatureData signatureData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.mxw.crypto.Keys.verifyMessage("hi!", signatureData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.mxw.crypto.ECKeyPair eCKeyPair1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.WalletFile walletFile2 = com.mxw.crypto.SecretStorage.createLight("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", eCKeyPair1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = com.mxw.crypto.SecretStorageUtils.getDefaultKeyDirectory();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/Users/yhcrown/Library/mxw" + "'", str0, "/Users/yhcrown/Library/mxw");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.math.BigInteger bigInteger2 = null;
        com.mxw.protocol.request.messages.BankSend bankSend4 = new com.mxw.protocol.request.messages.BankSend("gasUsed", "Mcin", bigInteger2, "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = com.mxw.crypto.MnemonicUtils.generateEntropy("blockNumber");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mnemonic word 'blockNumber' should be in the word list");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.mxw.exceptions.AddressFormatException addressFormatException0 = new com.mxw.exceptions.AddressFormatException();
        java.lang.String str1 = addressFormatException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "com.mxw.exceptions.AddressFormatException" + "'", str1, "com.mxw.exceptions.AddressFormatException");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.ECKeyPair eCKeyPair2 = new com.mxw.crypto.ECKeyPair(bigInteger0, bigInteger1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.util.Optional<int[]> intArrayOptional1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SigningKey.fromMnemonic("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", intArrayOptional1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = com.mxw.Constants.Power7UnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Tcin" + "'", str0, "Tcin");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.mxw.utils.Convert.Unit unit0 = com.mxw.utils.Convert.Unit.MXW;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.mxw.utils.Convert.Unit.MXW + "'", unit0.equals(com.mxw.utils.Convert.Unit.MXW));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.util.concurrent.Callable<com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions> fungibleTokenStatusActionsCallable0 = null;
        com.mxw.protocol.RemoteCall<com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions> fungibleTokenStatusActionsRemoteCall1 = new com.mxw.protocol.RemoteCall<com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions>(fungibleTokenStatusActionsCallable0);
        io.reactivex.Flowable<com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions> fungibleTokenStatusActionsFlowable2 = fungibleTokenStatusActionsRemoteCall1.flowable();
        org.junit.Assert.assertNotNull(fungibleTokenStatusActionsFlowable2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = com.mxw.utils.Numeric.toBigIntNoPrefix("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"xb\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.bouncycastle.math.ec.ECPoint eCPoint2 = com.mxw.crypto.Sign.decompressKey(bigInteger0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        com.mxw.crypto.Sign.SignatureData signatureData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.mxw.crypto.Sign.signedMessageToKey(byteArray5, signatureData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, -1, 0]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = com.mxw.protocol.ObjectMapperFactory.getObjectMapper(true);
        org.junit.Assert.assertNotNull(objectMapper1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags nFTokenStateFlags0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.MINT;
        org.junit.Assert.assertTrue("'" + nFTokenStateFlags0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.MINT + "'", nFTokenStateFlags0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.MINT));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty2 = bigIntegerDeserializer0.findBackReference("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference 'hi!': type: value deserializer of type com.mxw.protocol.deserializer.BigIntegerDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        com.mxw.crypto.Sign.SignatureData signatureData6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = com.mxw.crypto.Sign.signedMessageHashToKey(byteArray5, signatureData6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        java.lang.String str0 = com.mxw.Constants.SmallestUnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cin" + "'", str0, "cin");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.protocol.request.BlockTagName blockTagName3 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonRpcProvider1.getKycAddress("/Users/yhcrown/Library/mxw", (com.mxw.protocol.request.BlockTag) blockTagName3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName3 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName3.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        boolean boolean1 = com.mxw.utils.Strings.isEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.mxw.protocol.response.NodeInfo.Other other0 = new com.mxw.protocol.response.NodeInfo.Other();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags nFTokenStateFlags0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.NON_FUNGIBLE;
        org.junit.Assert.assertTrue("'" + nFTokenStateFlags0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.NON_FUNGIBLE + "'", nFTokenStateFlags0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.NON_FUNGIBLE));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = com.mxw.protocol.response.JsonTokenName.SUCCESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "success" + "'", str0, "success");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.security.KeyFactory keyFactory0 = com.mxw.crypto.Keys.createBCKeyFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.security.PublicKey publicKey2 = com.mxw.crypto.Keys.keyFromPublic(keyFactory0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid public or private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyFactory0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.mxw.networks.Network network0 = null;
        com.mxw.networks.Network network1 = com.mxw.networks.Network.getNetwork(network0);
        org.junit.Assert.assertNull(network1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.mxw.protocol.response.nonFungibleToken.NFTokenBurn nFTokenBurn2 = new com.mxw.protocol.response.nonFungibleToken.NFTokenBurn("Tcin", "/Users/yhcrown/Library/mxw");
        java.lang.String str3 = nFTokenBurn2.getItemID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/Users/yhcrown/Library/mxw" + "'", str3, "/Users/yhcrown/Library/mxw");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = jsonRpcProvider1.getKycAddress("Tcin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.protocol.request.BlockTagName blockTagName8 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = wallet7.isWhitelisted((com.mxw.protocol.request.BlockTag) blockTagName8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertTrue("'" + blockTagName8 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName8.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        com.fasterxml.jackson.core.JsonParser jsonParser1 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext2 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = bigIntegerDeserializer0.deserializeWithType(jsonParser1, deserializationContext2, typeDeserializer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions fungibleTokenStatusActions1 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.APPROVE_TRANSFER_TOKEN_OWNERSHIP;
        com.mxw.crypto.SigningKey signingKey4 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey4.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider8 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet9 = new com.mxw.Wallet(signingKey4, (com.mxw.providers.Provider) jsonRpcProvider8);
        com.mxw.protocol.common.Bundle bundle10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload fungibleTokenStatusPayload11 = com.mxw.fungibleToken.FungibleToken.createFungibleTokenStatusPayload("Tcin", fungibleTokenStatusActions1, wallet9, bundle10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + fungibleTokenStatusActions1 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.APPROVE_TRANSFER_TOKEN_OWNERSHIP + "'", fungibleTokenStatusActions1.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.APPROVE_TRANSFER_TOKEN_OWNERSHIP));
        org.junit.Assert.assertNotNull(signingKey4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.mxw.exceptions.AddressFormatException.InvalidPrefix invalidPrefix1 = new com.mxw.exceptions.AddressFormatException.InvalidPrefix("/Users/yhcrown/Library/mxw");
        java.lang.String str2 = invalidPrefix1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw" + "'", str2, "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        int int0 = com.mxw.crypto.Bip32ECKeyPair.HARDENED_BIT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        int[] intArray9 = new int[] { (-2147483648), (byte) 0, (short) 1, (short) 0 };
        signingKey2.setPath(intArray9);
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-2147483648, 0, 1, 0]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = com.mxw.utils.Numeric.decodeQuantity("Mcin");
            org.junit.Assert.fail("Expected exception of type com.mxw.exceptions.MessageDecodingException; message: Value must be in format 0x[1-9]+[0-9]* or 0x0");
        } catch (com.mxw.exceptions.MessageDecodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        java.util.Optional<int[]> intArrayOptional1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SigningKey.fromMnemonic("cin", intArrayOptional1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateFullNewWalletFile("cin", file1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json" + "'", str2, "UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions fungibleTokenStatusActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.APPROVE;
        org.junit.Assert.assertTrue("'" + fungibleTokenStatusActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.APPROVE + "'", fungibleTokenStatusActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.APPROVE));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.protocol.request.BlockTagName blockTagName9 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TokenState tokenState10 = jsonRpcProvider6.getTokenState("blockNumber", (com.mxw.protocol.request.BlockTag) blockTagName9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertTrue("'" + blockTagName9 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName9.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.providers.Provider provider8 = wallet7.getProvider();
        com.mxw.protocol.request.BlockTagName blockTagName10 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str11 = blockTagName10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.AccountState accountState12 = provider8.getAccountState("blockNumber", (com.mxw.protocol.request.BlockTag) blockTagName10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertTrue("'" + blockTagName10 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName10.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "latest" + "'", str11, "latest");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = com.mxw.utils.Numeric.toBigIntNoPrefix("gasUsed");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"gasUsed\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        byte[] byteArray3 = new byte[] {};
        com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair5 = new com.mxw.crypto.Bip32ECKeyPair(bigInteger0, bigInteger1, 40, byteArray3, bip32ECKeyPair4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = com.mxw.Constants.HashZero;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0x0000000000000000000000000000000000000000000000000000000000000000" + "'", str0, "0x0000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.mxw.crypto.SigningKey signingKey1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.WalletFile walletFile2 = com.mxw.crypto.SecretStorage.createEncryptedWallet("com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw", signingKey1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = com.mxw.Constants.Power1UnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mxw" + "'", str0, "mxw");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.mxw.crypto.LinuxSecureRandom linuxSecureRandom0 = new com.mxw.crypto.LinuxSecureRandom();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.mxw.crypto.WalletFile walletFile1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.ECKeyPair eCKeyPair2 = com.mxw.crypto.SecretStorage.decrypt("0xe39598BAD2465a747Facf0Df083C70D9C77F6862", walletFile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.protocol.request.BlockTagName blockTagName8 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str9 = blockTagName8.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.Block block10 = jsonRpcProvider6.getBlock((com.mxw.protocol.request.BlockTag) blockTagName8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertTrue("'" + blockTagName8 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName8.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "latest" + "'", str9, "latest");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.math.BigInteger bigInteger0 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = com.mxw.crypto.Bech32.toWords(byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray12 = com.mxw.crypto.Bech32.toWords(byteArray11);
        byte[] byteArray13 = com.mxw.utils.Bytes.concat(byteArray6, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair14 = com.mxw.crypto.Bip32ECKeyPair.create(bigInteger0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags nFTokenStateFlags0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.BURN;
        int int1 = nFTokenStateFlags0.getValue();
        org.junit.Assert.assertTrue("'" + nFTokenStateFlags0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.BURN + "'", nFTokenStateFlags0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.BURN));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.utils.Numeric.encodeQuantity(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = com.mxw.protocol.response.JsonTokenName.NONCE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nonce" + "'", str0, "nonce");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.mxw.protocol.deserializer.PayloadDeserializer payloadDeserializer0 = new com.mxw.protocol.deserializer.PayloadDeserializer();
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer1 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean2 = bigIntegerDeserializer1.isCachable();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = bigIntegerDeserializer1.getEmptyValue(deserializationContext3);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer5 = payloadDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger>) bigIntegerDeserializer1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        okhttp3.MediaType mediaType0 = com.mxw.protocol.http.HttpService.JSON_MEDIA_TYPE;
        org.junit.Assert.assertNotNull(mediaType0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.mxw.exceptions.AddressFormatException.InvalidDataLength invalidDataLength1 = new com.mxw.exceptions.AddressFormatException.InvalidDataLength();
        com.mxw.exceptions.CipherException cipherException2 = new com.mxw.exceptions.CipherException("mxw", (java.lang.Throwable) invalidDataLength1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = com.mxw.protocol.response.JsonTokenName.STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.mxw.protocol.response.TokenAccountState tokenAccountState0 = new com.mxw.protocol.response.TokenAccountState();
        tokenAccountState0.setOwner("nonce");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        com.mxw.protocol.common.Bundle bundle10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.fungibleToken.FungibleTokenState fungibleTokenState11 = fungibleToken9.refresh(bundle10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.Wallet wallet2 = com.mxw.Wallet.fromEncryptedJson("success", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid json wallet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.mxw.protocol.response.Status.SyncInfo syncInfo0 = new com.mxw.protocol.response.Status.SyncInfo();
        java.lang.String str1 = syncInfo0.getLatestBlockHash();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.mxw.crypto.WalletFile.Crypto crypto0 = new com.mxw.crypto.WalletFile.Crypto();
        boolean boolean2 = crypto0.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.math.BigInteger bigInteger2 = null;
        com.mxw.protocol.request.messages.BankSend bankSend3 = new com.mxw.protocol.request.messages.BankSend("", "hi!", bigInteger2);
        bankSend3.setToAddress("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        bankSend3.setFromAddress("mxw");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray12 = com.mxw.utils.Bytes.concat(byteArray5, byteArray10);
        com.mxw.crypto.ECKeyPair eCKeyPair13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.Sign.SignatureData signatureData15 = com.mxw.crypto.Sign.signMessage(byteArray5, eCKeyPair13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.utils.Numeric.toHexStringNoPrefix(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.math.BigDecimal bigDecimal0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.mxw.utils.Numeric.isIntegerValue(bigDecimal0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.mxw.networks.Networks networks0 = com.mxw.networks.Networks.HOMESTEAD;
        com.mxw.networks.Network network1 = networks0.getNetwork();
        org.junit.Assert.assertTrue("'" + networks0 + "' != '" + com.mxw.networks.Networks.HOMESTEAD + "'", networks0.equals(com.mxw.networks.Networks.HOMESTEAD));
        org.junit.Assert.assertNotNull(network1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = com.mxw.crypto.Sign.publicKeyFromPrivate(bigInteger0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions fungibleTokenStatusActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.FREEZE;
        org.junit.Assert.assertTrue("'" + fungibleTokenStatusActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.FREEZE + "'", fungibleTokenStatusActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.FREEZE));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str1 = com.mxw.utils.Numeric.prependHexPrefix("Tcin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0xTcin" + "'", str1, "0xTcin");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte byte6 = com.mxw.crypto.MnemonicUtils.calculateChecksum(byteArray5);
        com.mxw.crypto.Sign.SignatureData signatureData7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.mxw.crypto.Keys.recoverAddress(byteArray5, signatureData7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -128 + "'", byte6 == (byte) -128);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.utils.Base64s.decode("com.mxw.exceptions.AddressFormatException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal base64 character 2e");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        com.mxw.protocol.request.BlockTagName blockTagName10 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str11 = blockTagName10.getValue();
        com.mxw.protocol.common.Bundle bundle12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.fungibleToken.FungibleTokenState fungibleTokenState13 = fungibleToken9.getState((com.mxw.protocol.request.BlockTag) blockTagName10, bundle12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
        org.junit.Assert.assertTrue("'" + blockTagName10 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName10.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "latest" + "'", str11, "latest");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str1 = com.mxw.crypto.Keys.getKeyAddressHex("gasUsed");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0" + "'", str1, "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = jsonRpcProvider6.getBalance("success");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.String str1 = com.mxw.crypto.Keys.getKeyAddressHex("0x0000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70" + "'", str1, "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.mxw.exceptions.AddressFormatException addressFormatException2 = new com.mxw.exceptions.AddressFormatException();
        com.mxw.exceptions.TransactionException transactionException3 = new com.mxw.exceptions.TransactionException("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", (java.lang.Throwable) addressFormatException2);
        com.mxw.exceptions.InvalidResponseException invalidResponseException4 = new com.mxw.exceptions.InvalidResponseException("success", (java.lang.Throwable) addressFormatException2);
        com.mxw.exceptions.StreamEndedException streamEndedException5 = new com.mxw.exceptions.StreamEndedException((java.lang.Throwable) addressFormatException2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.providers.Provider provider8 = wallet7.getProvider();
        com.mxw.protocol.request.BlockTagName blockTagName10 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str11 = blockTagName10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.nonFungibleToken.NFTokenState nFTokenState12 = provider8.getNFTokenState("com.mxw.exceptions.AddressFormatException", (com.mxw.protocol.request.BlockTag) blockTagName10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertTrue("'" + blockTagName10 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName10.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "latest" + "'", str11, "latest");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.mxw.protocol.response.NodeInfo.Other other2 = new com.mxw.protocol.response.NodeInfo.Other("0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70", "com.mxw.exceptions.AddressFormatException");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = wallet0.computeSharedSecret("UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid public or private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wallet0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionFeeSetting transactionFeeSetting3 = jsonRpcProvider1.getTransactionFeeSetting("0xTcin");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.security.PrivateKey privateKey1 = com.mxw.crypto.Keys.keyFromPrivate("mxw");
        org.junit.Assert.assertNotNull(privateKey1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str6 = blockTagName5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.AccountState accountState7 = jsonRpcProvider3.getAccountState("nonce", (com.mxw.protocol.request.BlockTag) blockTagName5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "latest" + "'", str6, "latest");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray12 = com.mxw.utils.Bytes.concat(byteArray5, byteArray10);
        com.mxw.crypto.Sign.SignatureData signatureData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = com.mxw.crypto.Keys.recoverPublicKey(byteArray10, signatureData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.mxw.crypto.WalletFile.CipherParams cipherParams0 = new com.mxw.crypto.WalletFile.CipherParams();
        java.lang.String str1 = cipherParams0.getIv();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        java.lang.String str10 = wallet8.getHexAddress();
        com.mxw.protocol.request.TransactionRequest transactionRequest11 = new com.mxw.protocol.request.TransactionRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = wallet8.sign(transactionRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0xe39598BAD2465a747Facf0Df083C70D9C77F6862" + "'", str10, "0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags nFTokenStateFlags0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.BURN;
        java.lang.String str1 = nFTokenStateFlags0.toString();
        org.junit.Assert.assertTrue("'" + nFTokenStateFlags0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.BURN + "'", nFTokenStateFlags0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.BURN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.security.PublicKey publicKey1 = com.mxw.crypto.Keys.keyFromPublic("Mcin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid public or private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.providers.Provider provider8 = wallet7.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = wallet7.getBalance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(provider8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.mxw.protocol.deserializer.TransactionMessageDeserializer transactionMessageDeserializer3 = new com.mxw.protocol.deserializer.TransactionMessageDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger>) bigIntegerDeserializer0);
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = transactionMessageDeserializer3.deserializeWithType(jsonParser4, deserializationContext5, typeDeserializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.mxw.protocol.common.Response.Error error0 = new com.mxw.protocol.common.Response.Error();
        error0.setData("Tcin");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.mxw.crypto.Sign.SignatureData signatureData1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.mxw.crypto.Keys.verifyMessage("gasUsed", signatureData1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.mxw.protocol.response.TransactionLog transactionLog0 = new com.mxw.protocol.response.TransactionLog();
        transactionLog0.setSuccess((java.lang.Boolean) true);
        java.lang.Integer int3 = transactionLog0.getMsgIndex();
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = bigIntegerDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionFee transactionFee6 = jsonRpcProvider3.getTokenTransactionFee("Tcin", "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags nFTokenStateFlags0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.MODIFIABLE;
        org.junit.Assert.assertTrue("'" + nFTokenStateFlags0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.MODIFIABLE + "'", nFTokenStateFlags0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.MODIFIABLE));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.mxw.utils.Convert.Unit unit0 = com.mxw.utils.Convert.Unit.CIN;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.mxw.utils.Convert.Unit.CIN + "'", unit0.equals(com.mxw.utils.Convert.Unit.CIN));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt0 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        com.mxw.protocol.response.TransactionReceipt.Result result1 = linuxSecureRandomTransactionReceipt0.getResult();
        org.junit.Assert.assertNull(result1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions nFTokenActions0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.TRANSFER;
        org.junit.Assert.assertTrue("'" + nFTokenActions0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.TRANSFER + "'", nFTokenActions0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.TRANSFER));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.protocol.request.BlockTagName blockTagName3 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str4 = blockTagName3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = jsonRpcProvider1.getBalance("0x0000000000000000000000000000000000000000000000000000000000000000", (com.mxw.protocol.request.BlockTag) blockTagName3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName3 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName3.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "latest" + "'", str4, "latest");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionResponse transactionResponse4 = jsonRpcProvider1.sendTransaction("cin", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions fungibleTokenStatusActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.REJECT;
        java.lang.String str1 = fungibleTokenStatusActions0.toString();
        org.junit.Assert.assertTrue("'" + fungibleTokenStatusActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.REJECT + "'", fungibleTokenStatusActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStatusActions.REJECT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "REJECT" + "'", str1, "REJECT");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        com.mxw.providers.Provider provider1 = wallet0.getProvider();
        java.lang.String str2 = wallet0.getPrivateKey();
        org.junit.Assert.assertNotNull(wallet0);
        org.junit.Assert.assertNull(provider1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d" + "'", str2, "0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.protocol.response.nonFungibleToken.NFTokenBurn nFTokenBurn10 = null;
        com.mxw.protocol.request.messages.builder.nonFungibleToken.NFTokenBurnBuilder nFTokenBurnBuilder12 = new com.mxw.protocol.request.messages.builder.nonFungibleToken.NFTokenBurnBuilder(nFTokenBurn10, "Tcin");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.request.TransactionRequest transactionRequest13 = jsonRpcProvider6.getTransactionRequest("Tcin", "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70", (com.mxw.protocol.request.messages.builder.TransactionValueBuilder) nFTokenBurnBuilder12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: operation not implemented: Tcin/0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.providers.Provider provider9 = wallet8.getProvider();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.nonFungibleToken.NonFungibleToken nonFungibleToken10 = new com.mxw.nonFungibleToken.NonFungibleToken("", (com.mxw.Signer) wallet8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: symbol is required");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
        org.junit.Assert.assertNotNull(provider9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray12 = com.mxw.utils.Bytes.concat(byteArray5, byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray30 = com.mxw.crypto.Bech32.toWords(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray36 = com.mxw.crypto.Bech32.toWords(byteArray35);
        byte[] byteArray37 = com.mxw.utils.Bytes.concat(byteArray30, byteArray35);
        byte[] byteArray38 = com.mxw.utils.Bytes.concat(byteArray24, byteArray30);
        byte[] byteArray39 = com.mxw.utils.Bytes.concat(byteArray18, byteArray24);
        byte[] byteArray40 = com.mxw.utils.Bytes.concat(byteArray5, byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.Wallet wallet41 = new com.mxw.Wallet(byteArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags nFTokenStateFlags0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.COMMON;
        org.junit.Assert.assertTrue("'" + nFTokenStateFlags0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.COMMON + "'", nFTokenStateFlags0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenStateFlags.COMMON));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.protocol.request.BlockTagName blockTagName9 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.fungibleToken.FungibleTokenState fungibleTokenState10 = jsonRpcProvider6.getFungibleTokenState("0xe39598BAD2465a747Facf0Df083C70D9C77F6862", (com.mxw.protocol.request.BlockTag) blockTagName9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertTrue("'" + blockTagName9 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName9.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionReceipt transactionReceipt9 = jsonRpcProvider6.getTransaction("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.mxw.crypto.Bip39Wallet bip39Wallet2 = new com.mxw.crypto.Bip39Wallet("", "mxw");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        com.mxw.crypto.SigningKey signingKey5 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey5.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider9 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet10 = new com.mxw.Wallet(signingKey5, (com.mxw.providers.Provider) jsonRpcProvider9);
        com.mxw.providers.Provider provider11 = wallet10.getProvider();
        com.mxw.Wallet wallet12 = new com.mxw.Wallet(signingKey2, provider11);
        com.mxw.protocol.request.BlockTagName blockTagName14 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = provider11.getKycAddress("/Users/yhcrown/Library/mxw", (com.mxw.protocol.request.BlockTag) blockTagName14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(signingKey5);
        org.junit.Assert.assertNotNull(provider11);
        org.junit.Assert.assertTrue("'" + blockTagName14 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName14.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        boolean boolean1 = com.mxw.utils.Numeric.containsHexPrefix("4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        int[] intArray1 = com.mxw.crypto.HDPathUtils.fromStringPath("Tcin");
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        java.util.Optional<int[]> intArrayOptional1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SigningKey.fromMnemonic("com.mxw.exceptions.AddressFormatException", intArrayOptional1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload fungibleTokenStatusPayload10 = null;
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusTransaction fungibleTokenStatusTransaction11 = new com.mxw.protocol.response.fungibleToken.FungibleTokenStatusTransaction(fungibleTokenStatusPayload10);
        com.mxw.protocol.common.Bundle bundle12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.request.TransactionRequest transactionRequest13 = fungibleToken9.sendFungibleTokenStatusTransaction(fungibleTokenStatusTransaction11, bundle12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: transaction item missing");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStateFlags fungibleTokenStateFlags0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStateFlags.MINT;
        org.junit.Assert.assertTrue("'" + fungibleTokenStateFlags0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStateFlags.MINT + "'", fungibleTokenStateFlags0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenStateFlags.MINT));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.mxw.utils.Convert.Unit unit0 = com.mxw.utils.Convert.Unit.MCIN;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.mxw.utils.Convert.Unit.MCIN + "'", unit0.equals(com.mxw.utils.Convert.Unit.MCIN));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.ECKeyPair eCKeyPair1 = com.mxw.crypto.ECKeyPair.create("com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"com.mx\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray18 = com.mxw.utils.Bytes.concat(byteArray11, byteArray16);
        byte[] byteArray19 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = com.mxw.crypto.Hash.sha3(byteArray5, (-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.mxw.protocol.deserializer.PayloadDeserializer payloadDeserializer0 = new com.mxw.protocol.deserializer.PayloadDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = payloadDeserializer0.getEmptyValue(deserializationContext1);
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = payloadDeserializer0.getDelegatee();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.protocol.request.BlockTag blockTag3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = jsonRpcProvider1.getKycAddress("0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d", blockTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.mxw.protocol.response.PublicKey publicKey0 = null;
        com.mxw.protocol.response.Signature signature2 = new com.mxw.protocol.response.Signature(publicKey0, "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        com.mxw.protocol.response.PublicKey publicKey3 = signature2.getPublicKey();
        signature2.setSignature("4");
        org.junit.Assert.assertNull(publicKey3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.math.BigInteger bigInteger2 = null;
        com.mxw.protocol.request.messages.builder.BankSendBuilder bankSendBuilder3 = new com.mxw.protocol.request.messages.builder.BankSendBuilder("0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d", "Mcin", bigInteger2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions fungibleTokenActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.TRANSFER;
        org.junit.Assert.assertTrue("'" + fungibleTokenActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.TRANSFER + "'", fungibleTokenActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.TRANSFER));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.mxw.crypto.Bip39Wallet bip39Wallet2 = new com.mxw.crypto.Bip39Wallet("latest", "cin");
        java.lang.String str3 = bip39Wallet2.getMnemonic();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cin" + "'", str3, "cin");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum nonFungibleTokenEnum0 = new com.mxw.nonFungibleToken.NonFungibleTokenEnum();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.mxw.protocol.response.nonFungibleToken.NFTokenCreate nFTokenCreate6 = new com.mxw.protocol.response.nonFungibleToken.NFTokenCreate("gasUsed", "hi!", "hi!", "/Users/yhcrown/Library/mxw", "hi!", "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        java.lang.String str7 = nFTokenCreate6.getName();
        java.lang.String str8 = nFTokenCreate6.getSymbol();
        com.mxw.protocol.response.nonFungibleToken.NFTokenCreate.Fee fee9 = nFTokenCreate6.getFee();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67" + "'", str8, "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        org.junit.Assert.assertNotNull(fee9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions fungibleTokenActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.TRANSFER_OWNERSHIP;
        org.junit.Assert.assertTrue("'" + fungibleTokenActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.TRANSFER_OWNERSHIP + "'", fungibleTokenActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.TRANSFER_OWNERSHIP));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.utils.Numeric.toHexStringWithPrefix(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray18 = com.mxw.utils.Bytes.concat(byteArray11, byteArray16);
        byte[] byteArray19 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        com.mxw.crypto.Sign.SignatureData signatureData20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = com.mxw.crypto.Keys.recoverPublicKey(byteArray11, signatureData20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.mxw.protocol.deserializer.TransactionMessageDeserializer transactionMessageDeserializer3 = new com.mxw.protocol.deserializer.TransactionMessageDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger>) bigIntegerDeserializer0);
        java.lang.Class<?> wildcardClass4 = transactionMessageDeserializer3.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = transactionMessageDeserializer3.deserializeWithType(jsonParser5, deserializationContext6, typeDeserializer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.mxw.crypto.WalletFile.Crypto crypto0 = new com.mxw.crypto.WalletFile.Crypto();
        crypto0.setMac("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
    }

    @Test
    public void test146() throws Throwable {
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
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{\"address\":\"mxw1hkvwyeemhn8qmwrsaycp2qrggqu9utdygc290d\",\"id\":\"6afe199a-a9c0-47bd-9638-d47aa85414dc\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"8f60bf6217ecc1b673f563917a6d4073f842859c66ef395551dbe52b24425da1\",\"cipherparams\":{\"iv\":\"aa5f4d0862987ade7b1f36b55355e276\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":48,\"n\":131072,\"p\":1,\"r\":8,\"salt\":\"596dd4fe53722ac812b87fa2d4688fbb6337b252b6a38dd7397aa511d2843b92\"},\"mac\":\"bc9e00c3c70321033da45c618ca7286212b2dc797384a460069939d35c30c2d3\"}}" + "'", str3, "{\"address\":\"mxw1hkvwyeemhn8qmwrsaycp2qrggqu9utdygc290d\",\"id\":\"6afe199a-a9c0-47bd-9638-d47aa85414dc\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"8f60bf6217ecc1b673f563917a6d4073f842859c66ef395551dbe52b24425da1\",\"cipherparams\":{\"iv\":\"aa5f4d0862987ade7b1f36b55355e276\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":48,\"n\":131072,\"p\":1,\"r\":8,\"salt\":\"596dd4fe53722ac812b87fa2d4688fbb6337b252b6a38dd7397aa511d2843b92\"},\"mac\":\"bc9e00c3c70321033da45c618ca7286212b2dc797384a460069939d35c30c2d3\"}}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.mxw.protocol.response.nonFungibleToken.NFTokenCreate.Fee fee0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenCreate.Fee();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean3 = jsonRpcProvider1.isWhiteListed("{\"address\":\"mxw1j4pgkzj9w9069psj7ms3k0777fv4cyg8fw6neq\",\"id\":\"fa84958d-99c6-4495-9570-223269edd817\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"a9fbd5def7d5b36bc46d520cd59b6867e66f13f852c21740d9da859b3bb117de\",\"cipherparams\":{\"iv\":\"34d6c1d205e408c2b9fb7872536d6e60\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":48,\"n\":131072,\"p\":1,\"r\":8,\"salt\":\"b1ad59ea64418bfa36d217953564a07203d604b1f12acdc90c9d82ceae3921cc\"},\"mac\":\"63f9f9ac4d50487879f685cfe77c2e47cffe3607effce9ec779b0e5e7e8ce12a\"}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.mxw.protocol.response.TransactionLog.Info info0 = new com.mxw.protocol.response.TransactionLog.Info();
        java.math.BigInteger bigInteger1 = null;
        info0.setNonce(bigInteger1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.mxw.protocol.response.NodeInfo.Other other2 = new com.mxw.protocol.response.NodeInfo.Other("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        other2.setRpcAddress("0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.Wallet wallet6 = new com.mxw.Wallet(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray18 = com.mxw.utils.Bytes.concat(byteArray11, byteArray16);
        byte[] byteArray19 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        java.lang.String str20 = com.mxw.utils.Address.getHash(byteArray5);
        java.lang.String str21 = com.mxw.utils.Numeric.toHexString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0x0c100010000210" + "'", str20, "0x0c100010000210");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0x0c100010000210" + "'", str21, "0x0c100010000210");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.mxw.protocol.response.TransactionLog.Info info0 = new com.mxw.protocol.response.TransactionLog.Info();
        info0.setMessage("com.mxw.exceptions.AddressFormatException");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        okhttp3.OkHttpClient okHttpClient1 = null;
        com.mxw.protocol.http.HttpService httpService2 = new com.mxw.protocol.http.HttpService("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0", okHttpClient1);
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider((com.mxw.protocol.Service) httpService2);
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str6 = blockTagName5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = jsonRpcProvider3.getKycAddress("REJECT", (com.mxw.protocol.request.BlockTag) blockTagName5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "latest" + "'", str6, "latest");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        com.mxw.crypto.SigningKey signingKey5 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey5.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider9 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet10 = new com.mxw.Wallet(signingKey5, (com.mxw.providers.Provider) jsonRpcProvider9);
        com.mxw.providers.Provider provider11 = wallet10.getProvider();
        com.mxw.Wallet wallet12 = new com.mxw.Wallet(signingKey2, provider11);
        com.mxw.protocol.request.TransactionRequest transactionRequest13 = new com.mxw.protocol.request.TransactionRequest();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionResponse transactionResponse14 = wallet12.sendTransaction(transactionRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(signingKey5);
        org.junit.Assert.assertNotNull(provider11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.math.BigInteger bigInteger2 = null;
        com.mxw.protocol.request.messages.BankSend bankSend3 = new com.mxw.protocol.request.messages.BankSend("", "hi!", bigInteger2);
        bankSend3.setToAddress("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        java.lang.String str6 = bankSend3.getFromAddress();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions fungibleTokenActions0 = com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.BURN;
        java.lang.String str1 = fungibleTokenActions0.toString();
        org.junit.Assert.assertTrue("'" + fungibleTokenActions0 + "' != '" + com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.BURN + "'", fungibleTokenActions0.equals(com.mxw.fungibleToken.FungibleTokenEnum.FungibleTokenActions.BURN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "burn" + "'", str1, "burn");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        boolean boolean1 = com.mxw.utils.Numeric.containsHexPrefix("0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        com.mxw.crypto.SigningKey signingKey5 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey5.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider9 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet10 = new com.mxw.Wallet(signingKey5, (com.mxw.providers.Provider) jsonRpcProvider9);
        com.mxw.providers.Provider provider11 = wallet10.getProvider();
        com.mxw.Wallet wallet12 = new com.mxw.Wallet(signingKey2, provider11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean14 = provider11.isWhiteListed("REJECT_TRANSFER_TOKEN_OWNERSHIP");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(signingKey5);
        org.junit.Assert.assertNotNull(provider11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload nFTokenStatusPayload0 = null;
        com.mxw.Wallet wallet1 = null;
        com.mxw.protocol.common.Bundle bundle2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.nonFungibleToken.NFTokenStatusTransaction nFTokenStatusTransaction3 = com.mxw.nonFungibleToken.NonFungibleToken.signNonFungibleTokenStatusTransaction(nFTokenStatusPayload0, wallet1, bundle2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: set non fungible token status transaction require signer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray12 = com.mxw.utils.Bytes.concat(byteArray5, byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray30 = com.mxw.crypto.Bech32.toWords(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray36 = com.mxw.crypto.Bech32.toWords(byteArray35);
        byte[] byteArray37 = com.mxw.utils.Bytes.concat(byteArray30, byteArray35);
        byte[] byteArray38 = com.mxw.utils.Bytes.concat(byteArray24, byteArray30);
        byte[] byteArray39 = com.mxw.utils.Bytes.concat(byteArray18, byteArray24);
        byte[] byteArray40 = com.mxw.utils.Bytes.concat(byteArray5, byteArray39);
        java.lang.String str41 = com.mxw.utils.Numeric.toHexString(byteArray39);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0x0c1000100002100c100010000210" + "'", str41, "0x0c1000100002100c100010000210");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions nonFungibleTokenStatusActions0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.FREEZE;
        org.junit.Assert.assertTrue("'" + nonFungibleTokenStatusActions0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.FREEZE + "'", nonFungibleTokenStatusActions0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.FREEZE));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.mxw.crypto.WalletFile walletFile1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.ECKeyPair eCKeyPair2 = com.mxw.crypto.SecretStorage.decrypt("com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw", walletFile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.protocol.request.BlockTagName blockTagName6 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str7 = blockTagName6.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TokenAccountState tokenAccountState8 = jsonRpcProvider3.getTokenAccountState("hi!", "0xTcin", (com.mxw.protocol.request.BlockTag) blockTagName6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName6 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName6.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "latest" + "'", str7, "latest");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str1 = com.mxw.utils.Address.getChecksum("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x4" + "'", str1, "0x4");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.mxw.protocol.response.nonFungibleToken.NFTokenMint nFTokenMint4 = new com.mxw.protocol.response.nonFungibleToken.NFTokenMint("/Users/yhcrown/Library/mxw", "Tcin", "Mcin", "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
        java.lang.String str5 = nFTokenMint4.getSymbol();
        nFTokenMint4.setOwner("com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/Users/yhcrown/Library/mxw" + "'", str5, "/Users/yhcrown/Library/mxw");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.utils.Numeric.toHexStringWithPrefixSafe(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.mxw.protocol.response.fungibleToken.FungibleTokenMint fungibleTokenMint0 = null;
        com.mxw.protocol.request.messages.builder.fungibleToken.FungibleTokenMintBuilder fungibleTokenMintBuilder2 = new com.mxw.protocol.request.messages.builder.fungibleToken.FungibleTokenMintBuilder(fungibleTokenMint0, "0x0c100010000210");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        java.lang.String str1 = wallet0.getPublicKey();
        org.junit.Assert.assertNotNull(wallet0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x034848d4770612501e13ce0e8f4f354ea0289394c9c249f837760ccdd53ec05a3d" + "'", str1, "0x034848d4770612501e13ce0e8f4f354ea0289394c9c249f837760ccdd53ec05a3d");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload nFTokenStatusPayload0 = null;
        com.mxw.Wallet wallet1 = com.mxw.Wallet.createNewWallet();
        com.mxw.protocol.common.Bundle bundle2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.nonFungibleToken.NFTokenStatusTransaction nFTokenStatusTransaction3 = com.mxw.nonFungibleToken.NonFungibleToken.signNonFungibleTokenStatusTransaction(nFTokenStatusPayload0, wallet1, bundle2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: payload item missing");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wallet1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.mxw.crypto.WalletFile.MxwMetaData mxwMetaData4 = new com.mxw.crypto.WalletFile.MxwMetaData("0xe39598BAD2465a747Facf0Df083C70D9C77F6862", "status", "success", "Mcin");
        java.lang.String str5 = mxwMetaData4.getVersion();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.1" + "'", str5, "0.1");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions nonFungibleTokenStatusActions0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.REJECT;
        org.junit.Assert.assertTrue("'" + nonFungibleTokenStatusActions0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.REJECT + "'", nonFungibleTokenStatusActions0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.REJECT));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateFullNewWalletFile("/Users/yhcrown/Library/mxw", file1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-05.740000000Z--mxw1jld58vjsqa4m73jm4u7du9mszcygqrwpalhhxk.json" + "'", str2, "UTC--2023-10-31T23-40-05.740000000Z--mxw1jld58vjsqa4m73jm4u7du9mszcygqrwpalhhxk.json");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        com.mxw.crypto.SigningKey signingKey5 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey5.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider9 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet10 = new com.mxw.Wallet(signingKey5, (com.mxw.providers.Provider) jsonRpcProvider9);
        com.mxw.providers.Provider provider11 = wallet10.getProvider();
        com.mxw.Wallet wallet12 = new com.mxw.Wallet(signingKey2, provider11);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionFeeSetting transactionFeeSetting14 = provider11.getTransactionFeeSetting("cin");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(signingKey5);
        org.junit.Assert.assertNotNull(provider11);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.mxw.protocol.http.HttpService httpService0 = new com.mxw.protocol.http.HttpService();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        java.lang.String str10 = wallet8.getHexAddress();
        java.lang.String str11 = wallet8.getAddress();
        org.junit.Assert.assertNotNull(signingKey3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0xe39598BAD2465a747Facf0Df083C70D9C77F6862" + "'", str10, "0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg" + "'", str11, "mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.String str1 = com.mxw.crypto.Keys.getKeyAddressHex("0x4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0xeb87417d8bd9691b4b39d7be34a3c03c7ceb70803d21b2b341c5b002947c7589" + "'", str1, "0xeb87417d8bd9691b4b39d7be34a3c03c7ceb70803d21b2b341c5b002947c7589");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.mxw.protocol.response.nonFungibleToken.NFTokenBurn nFTokenBurn2 = new com.mxw.protocol.response.nonFungibleToken.NFTokenBurn("Tcin", "/Users/yhcrown/Library/mxw");
        java.lang.String str3 = nFTokenBurn2.getSymbol();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Tcin" + "'", str3, "Tcin");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = jsonRpcProvider6.getAccountNumber("Tcin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.mxw.exceptions.TransactionException transactionException1 = new com.mxw.exceptions.TransactionException("latest");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        com.mxw.protocol.request.BlockTagName blockTagName10 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str11 = blockTagName10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = wallet8.getBalance((com.mxw.protocol.request.BlockTag) blockTagName10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
        org.junit.Assert.assertTrue("'" + blockTagName10 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName10.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "latest" + "'", str11, "latest");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStateResponse nFTokenStateResponse0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenStateResponse();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.mxw.protocol.response.nonFungibleToken.NFTokenMint nFTokenMint4 = new com.mxw.protocol.response.nonFungibleToken.NFTokenMint("/Users/yhcrown/Library/mxw", "Tcin", "Mcin", "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
        java.lang.String str5 = nFTokenMint4.getSymbol();
        java.lang.String str6 = nFTokenMint4.getMetadata();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/Users/yhcrown/Library/mxw" + "'", str5, "/Users/yhcrown/Library/mxw");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw" + "'", str6, "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.mxw.crypto.Keys.computeKycAddress("0xeb87417d8bd9691b4b39d7be34a3c03c7ceb70803d21b2b341c5b002947c7589", "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Human-readable part is too short");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        java.lang.String str0 = com.mxw.Constants.Power18UnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cin" + "'", str0, "cin");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.mxw.crypto.WalletFile.Crypto crypto0 = new com.mxw.crypto.WalletFile.Crypto();
        crypto0.setCipher("0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.security.KeyPair keyPair0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.ECKeyPair eCKeyPair1 = com.mxw.crypto.ECKeyPair.create(keyPair0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair0 = null;
        int[] intArray7 = new int[] { '#', (byte) 100, 1, (byte) 100, (short) 10, 'a' };
        int[] intArray8 = com.mxw.crypto.HDPathUtils.parseHardened(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.Bip32ECKeyPair bip32ECKeyPair9 = com.mxw.crypto.Bip32ECKeyPair.deriveKeyPair(bip32ECKeyPair0, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 100, 1, 100, 10, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-2147483613, -2147483548, -2147483647, 100, 10, 97]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.mxw.protocol.response.AccountState accountState0 = new com.mxw.protocol.response.AccountState();
        com.mxw.protocol.response.AccountState.Value value1 = accountState0.getValue();
        accountState0.setType("latest");
        org.junit.Assert.assertNull(value1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.mxw.exceptions.MessageEncodingException messageEncodingException1 = new com.mxw.exceptions.MessageEncodingException("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.AccountState accountState9 = jsonRpcProvider6.getAccountState("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.mxw.protocol.response.TypeAttributes.Attribute attribute0 = new com.mxw.protocol.response.TypeAttributes.Attribute();
        attribute0.setKey("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setMnemonic("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        java.lang.String str5 = signingKey2.getCompressedPublicKey();
        java.lang.String str6 = signingKey2.getCompressedPublicKey();
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf" + "'", str5, "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf" + "'", str6, "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionFeeSetting transactionFeeSetting5 = jsonRpcProvider3.getTransactionFeeSetting("burn");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.mxw.protocol.http.HttpService httpService1 = new com.mxw.protocol.http.HttpService("0x0c1000100002100c100010000210");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateNewWalletFile("UTC--2023-10-31T23-40-05.740000000Z--mxw1jld58vjsqa4m73jm4u7du9mszcygqrwpalhhxk.json", file1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-06.591000000Z--mxw12ldyka6g70u22zlk4p0vrdu4ph8udyw0g7kx56.json" + "'", str2, "UTC--2023-10-31T23-40-06.591000000Z--mxw12ldyka6g70u22zlk4p0vrdu4ph8udyw0g7kx56.json");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.mxw.exceptions.AddressFormatException.InvalidDataLength invalidDataLength2 = new com.mxw.exceptions.AddressFormatException.InvalidDataLength("");
        com.mxw.exceptions.StreamEndedException streamEndedException3 = new com.mxw.exceptions.StreamEndedException("com.mxw.exceptions.AddressFormatException", (java.lang.Throwable) invalidDataLength2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.Bech32.Bech32Data bech32Data1 = com.mxw.crypto.Bech32.decode("0xeb87417d8bd9691b4b39d7be34a3c03c7ceb70803d21b2b341c5b002947c7589");
            org.junit.Assert.fail("Expected exception of type com.mxw.exceptions.AddressFormatException.InvalidCharacter; message: Invalid character 'b' at position 54");
        } catch (com.mxw.exceptions.AddressFormatException.InvalidCharacter e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.mxw.protocol.deserializer.PayloadDeserializer payloadDeserializer0 = new com.mxw.protocol.deserializer.PayloadDeserializer();
        boolean boolean1 = payloadDeserializer0.isCachable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray23 = com.mxw.crypto.Bech32.toWords(byteArray22);
        byte[] byteArray24 = com.mxw.utils.Bytes.concat(byteArray17, byteArray22);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray11, byteArray17);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        com.mxw.crypto.ECKeyPair eCKeyPair27 = com.mxw.crypto.ECKeyPair.create(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = com.mxw.crypto.Keys.computePublicKey(byteArray11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid public or private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair27);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.mxw.crypto.WalletFile.ScryptKdfParams scryptKdfParams0 = new com.mxw.crypto.WalletFile.ScryptKdfParams();
        scryptKdfParams0.setSalt("0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
        java.lang.String str3 = scryptKdfParams0.getSalt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0xe39598BAD2465a747Facf0Df083C70D9C77F6862" + "'", str3, "0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.mxw.protocol.response.nonFungibleToken.NFTokenMint nFTokenMint4 = new com.mxw.protocol.response.nonFungibleToken.NFTokenMint("/Users/yhcrown/Library/mxw", "hi!", "0x0000000000000000000000000000000000000000000000000000000000000000", "REJECT_TRANSFER_TOKEN_OWNERSHIP");
        java.lang.String str5 = nFTokenMint4.getMetadata();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "REJECT_TRANSFER_TOKEN_OWNERSHIP" + "'", str5, "REJECT_TRANSFER_TOKEN_OWNERSHIP");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = bigIntegerDeserializer0.getNullAccessPattern();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.mxw.protocol.response.AccountState accountState0 = new com.mxw.protocol.response.AccountState();
        com.mxw.protocol.response.AccountState.Value value1 = new com.mxw.protocol.response.AccountState.Value();
        java.util.List<com.mxw.protocol.response.Coin> coinList2 = null;
        value1.setCoins(coinList2);
        java.util.List<com.mxw.protocol.response.Coin> coinList4 = value1.getCoins();
        accountState0.setValue(value1);
        org.junit.Assert.assertNull(coinList4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str6 = blockTagName5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = jsonRpcProvider3.getBalance("0x0000000000000000000000000000000000000000000000000000000000000000", (com.mxw.protocol.request.BlockTag) blockTagName5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "latest" + "'", str6, "latest");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse nFTokenEndorse3 = new com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse("0x0c100010000210", "status", "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
        nFTokenEndorse3.setFrom("UTC--2023-10-31T23-40-06.591000000Z--mxw12ldyka6g70u22zlk4p0vrdu4ph8udyw0g7kx56.json");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.mxw.crypto.WalletFile.Aes128CtrKdfParams aes128CtrKdfParams0 = new com.mxw.crypto.WalletFile.Aes128CtrKdfParams();
        java.lang.String str1 = aes128CtrKdfParams0.getPrf();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions nFTokenActions0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.MINT;
        org.junit.Assert.assertTrue("'" + nFTokenActions0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.MINT + "'", nFTokenActions0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.MINT));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.mxw.protocol.response.Status.SyncInfo syncInfo0 = new com.mxw.protocol.response.Status.SyncInfo();
        java.lang.String str1 = syncInfo0.getLatestAppHash();
        java.lang.String str2 = syncInfo0.getLatestAppHash();
        java.lang.Boolean boolean3 = syncInfo0.getCatchingUp();
        syncInfo0.setCatchingUp((java.lang.Boolean) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.mxw.protocol.response.AccountState.Value value0 = new com.mxw.protocol.response.AccountState.Value();
        java.util.List<com.mxw.protocol.response.Coin> coinList1 = null;
        value0.setCoins(coinList1);
        value0.setPublicKey("com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.mxw.Signer signer1 = null;
        com.mxw.protocol.common.Bundle bundle2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.fungibleToken.FungibleToken fungibleToken3 = com.mxw.fungibleToken.FungibleToken.fromSymbol("gasUsed", signer1, bundle2);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: invalid signer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusFee fungibleTokenStatusFee0 = new com.mxw.protocol.response.fungibleToken.FungibleTokenStatusFee();
        java.lang.String str1 = fungibleTokenStatusFee0.action;
        java.lang.String str2 = fungibleTokenStatusFee0.action;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.mxw.protocol.deserializer.TransactionMessageDeserializer transactionMessageDeserializer3 = new com.mxw.protocol.deserializer.TransactionMessageDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger>) bigIntegerDeserializer0);
        java.lang.Class<?> wildcardClass4 = transactionMessageDeserializer3.handledType();
        java.lang.Object obj5 = transactionMessageDeserializer3.getEmptyValue();
        com.fasterxml.jackson.databind.JavaType javaType6 = transactionMessageDeserializer3.getValueType();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer9 = null;
        com.mxw.protocol.response.TransactionMessage transactionMessage10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = transactionMessageDeserializer3.deserializeWithType(jsonParser7, deserializationContext8, typeDeserializer9, transactionMessage10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(javaType6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.mxw.protocol.response.BlockTransaction blockTransaction0 = new com.mxw.protocol.response.BlockTransaction();
        java.util.List<com.mxw.protocol.response.TransactionEvent> transactionEventList1 = blockTransaction0.getEvents();
        java.lang.String str2 = blockTransaction0.getHash();
        org.junit.Assert.assertNull(transactionEventList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.mxw.crypto.ECKeyPair eCKeyPair0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.crypto.Keys.computeAddress(eCKeyPair0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.mxw.protocol.response.nonFungibleToken.NFTokenBurn nFTokenBurn2 = new com.mxw.protocol.response.nonFungibleToken.NFTokenBurn("hi!", "");
        nFTokenBurn2.setFrom("0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload fungibleTokenStatusPayload0 = new com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload();
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload.FungibleTokenSetting fungibleTokenSetting1 = fungibleTokenStatusPayload0.token;
        fungibleTokenSetting1.nonce = "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0";
        boolean boolean4 = fungibleTokenSetting1.burnable;
        fungibleTokenSetting1.from = "gasUsed";
        org.junit.Assert.assertNotNull(fungibleTokenSetting1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.mxw.protocol.response.kyc.KycWhitelist kycWhitelist0 = null;
        com.mxw.protocol.request.messages.builder.KycWhiteListBuilder kycWhiteListBuilder1 = new com.mxw.protocol.request.messages.builder.KycWhiteListBuilder(kycWhitelist0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.mxw.crypto.WalletFile.Aes128CtrKdfParams aes128CtrKdfParams0 = new com.mxw.crypto.WalletFile.Aes128CtrKdfParams();
        int int1 = aes128CtrKdfParams0.getDklen();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.String str1 = com.mxw.crypto.Hash.sha3("nonce");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x2e0d2acefc4d713366628b5f69258e252c0cd2c25890ed7854541c307f3a48eb" + "'", str1, "0x2e0d2acefc4d713366628b5f69258e252c0cd2c25890ed7854541c307f3a48eb");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.Block block5 = jsonRpcProvider3.getBlock(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        byte byte2 = com.mxw.utils.Numeric.asByte((int) (short) 10, 4);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -92 + "'", byte2 == (byte) -92);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        java.security.SecureRandom secureRandom0 = null;
        com.mxw.crypto.ECKeyPair eCKeyPair1 = com.mxw.crypto.Keys.createEcKeyPair(secureRandom0);
        org.junit.Assert.assertNotNull(eCKeyPair1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        okhttp3.OkHttpClient okHttpClient1 = null;
        com.mxw.protocol.http.HttpService httpService2 = new com.mxw.protocol.http.HttpService("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0", okHttpClient1);
        httpService2.close();
        httpService2.close();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.mxw.protocol.response.TransactionPayload transactionPayload0 = new com.mxw.protocol.response.TransactionPayload();
        com.mxw.protocol.response.TransactionFee transactionFee1 = transactionPayload0.getFee();
        org.junit.Assert.assertNull(transactionFee1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        int[] intArray0 = new int[] {};
        int[] intArray1 = com.mxw.crypto.HDPathUtils.parseHardened(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadSigningKey("0xe39598BAD2465a747Facf0Df083C70D9C77F6862", "");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload fungibleTokenStatusPayload0 = new com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload();
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload.FungibleTokenSetting fungibleTokenSetting1 = fungibleTokenStatusPayload0.token;
        fungibleTokenSetting1.burnable = false;
        boolean boolean4 = fungibleTokenSetting1.burnable;
        org.junit.Assert.assertNotNull(fungibleTokenSetting1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("Mcin", "gasUsed");
        signingKey2.setAddress("Mcin");
        signingKey2.setPublicKey("");
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        java.math.BigInteger bigInteger0 = null;
        com.mxw.protocol.response.TransactionFee transactionFee2 = null;
        com.mxw.protocol.response.TransactionMessage[] transactionMessageArray4 = new com.mxw.protocol.response.TransactionMessage[] {};
        java.util.ArrayList<com.mxw.protocol.response.TransactionMessage> transactionMessageList5 = new java.util.ArrayList<com.mxw.protocol.response.TransactionMessage>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.mxw.protocol.response.TransactionMessage>) transactionMessageList5, transactionMessageArray4);
        java.math.BigInteger bigInteger7 = null;
        com.mxw.protocol.response.TransactionPayload transactionPayload8 = new com.mxw.protocol.response.TransactionPayload(bigInteger0, "nonce", transactionFee2, "blockNumber", (java.util.List<com.mxw.protocol.response.TransactionMessage>) transactionMessageList5, bigInteger7);
        org.junit.Assert.assertNotNull(transactionMessageArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.mxw.networks.Networks networks0 = com.mxw.networks.Networks.ALLOYS;
        org.junit.Assert.assertTrue("'" + networks0 + "' != '" + com.mxw.networks.Networks.ALLOYS + "'", networks0.equals(com.mxw.networks.Networks.ALLOYS));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.mxw.exceptions.CipherException cipherException1 = new com.mxw.exceptions.CipherException("4");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.protocol.request.BlockTagName blockTagName3 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = jsonRpcProvider1.getAccountNumber("mintNonFungibleItem", (com.mxw.protocol.request.BlockTag) blockTagName3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName3 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName3.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        boolean boolean1 = com.mxw.utils.Numeric.containsHexPrefix("0x2e0d2acefc4d713366628b5f69258e252c0cd2c25890ed7854541c307f3a48eb");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider2 = new com.mxw.providers.JsonRpcProvider("Tcin", "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = jsonRpcProvider3.getAliasState("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", (com.mxw.protocol.request.BlockTag) blockTagName5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions nFTokenActions0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.TRANSFER_OWNERSHIP;
        org.junit.Assert.assertTrue("'" + nFTokenActions0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.TRANSFER_OWNERSHIP + "'", nFTokenActions0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NFTokenActions.TRANSFER_OWNERSHIP));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.mxw.exceptions.AddressFormatException.InvalidChecksum invalidChecksum0 = new com.mxw.exceptions.AddressFormatException.InvalidChecksum();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.mxw.protocol.response.nonFungibleToken.NFTokenCreate nFTokenCreate6 = new com.mxw.protocol.response.nonFungibleToken.NFTokenCreate("UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json", "Tcin", "", "com.mxw.exceptions.AddressFormatException", "mintNonFungibleItem", "mintNonFungibleItem");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.mxw.protocol.response.nonFungibleToken.NFTokenMint nFTokenMint4 = new com.mxw.protocol.response.nonFungibleToken.NFTokenMint("/Users/yhcrown/Library/mxw", "Tcin", "Mcin", "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
        java.lang.String str5 = nFTokenMint4.getSymbol();
        nFTokenMint4.setTo("Tcin");
        java.lang.String str8 = nFTokenMint4.getOwner();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/Users/yhcrown/Library/mxw" + "'", str5, "/Users/yhcrown/Library/mxw");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = jsonRpcProvider6.isWhiteListed("0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.mxw.protocol.request.TransactionRequest transactionRequest0 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue1 = transactionRequest0.getValue();
        java.lang.String str2 = transactionRequest0.getType();
        java.math.BigInteger bigInteger3 = transactionRequest0.getSequence();
        org.junit.Assert.assertNull(transactionValue1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        java.lang.String str8 = signingKey2.getMnemonic();
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider("0x0000000000000000000000000000000000000000000000000000000000000000", network2);
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str6 = blockTagName5.getValue();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TokenState tokenState7 = jsonRpcProvider3.getTokenState("0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf", (com.mxw.protocol.request.BlockTag) blockTagName5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "latest" + "'", str6, "latest");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.mxw.protocol.response.nonFungibleToken.NFTokenAcceptOwnership nFTokenAcceptOwnership2 = new com.mxw.protocol.response.nonFungibleToken.NFTokenAcceptOwnership("success", "UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
        java.lang.String str3 = nFTokenAcceptOwnership2.getSymbol();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "success" + "'", str3, "success");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.mxw.protocol.response.fungibleToken.FungibleTokenState fungibleTokenState0 = new com.mxw.protocol.response.fungibleToken.FungibleTokenState();
        int int1 = fungibleTokenState0.getFlags();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.mxw.crypto.Bech32.Bech32Data bech32Data0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.mxw.crypto.Bech32.encode(bech32Data0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.crypto.SigningKey signingKey6 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        signingKey6.setPublicKeyType("");
        java.lang.String str9 = signingKey6.getPublicKeyType();
        com.mxw.tx.DefaultTransactionManager defaultTransactionManager10 = new com.mxw.tx.DefaultTransactionManager((com.mxw.providers.Provider) jsonRpcProvider3, signingKey6);
        com.mxw.protocol.response.nonFungibleToken.NFTokenMint nFTokenMint15 = new com.mxw.protocol.response.nonFungibleToken.NFTokenMint("/Users/yhcrown/Library/mxw", "Tcin", "Mcin", "com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
        java.lang.String str16 = nFTokenMint15.getSymbol();
        com.mxw.protocol.request.messages.builder.nonFungibleToken.NFTokenMintBuilder nFTokenMintBuilder18 = new com.mxw.protocol.request.messages.builder.nonFungibleToken.NFTokenMintBuilder(nFTokenMint15, "4");
        java.lang.String str19 = nFTokenMintBuilder18.getTransactionType();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionResponse transactionResponse20 = defaultTransactionManager10.sendTransaction((com.mxw.protocol.request.messages.builder.TransactionValueBuilder) nFTokenMintBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/Users/yhcrown/Library/mxw" + "'", str16, "/Users/yhcrown/Library/mxw");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mintNonFungibleItem" + "'", str19, "mintNonFungibleItem");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider("0x0000000000000000000000000000000000000000000000000000000000000000", network2);
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.AccountState accountState6 = jsonRpcProvider3.getAccountState("{\"address\":\"mxw1j4pgkzj9w9069psj7ms3k0777fv4cyg8fw6neq\",\"id\":\"fa84958d-99c6-4495-9570-223269edd817\",\"version\":3,\"crypto\":{\"cipher\":\"aes-256-ctr\",\"ciphertext\":\"a9fbd5def7d5b36bc46d520cd59b6867e66f13f852c21740d9da859b3bb117de\",\"cipherparams\":{\"iv\":\"34d6c1d205e408c2b9fb7872536d6e60\"},\"kdf\":\"scrypt\",\"kdfparams\":{\"dklen\":48,\"n\":131072,\"p\":1,\"r\":8,\"salt\":\"b1ad59ea64418bfa36d217953564a07203d604b1f12acdc90c9d82ceae3921cc\"},\"mac\":\"63f9f9ac4d50487879f685cfe77c2e47cffe3607effce9ec779b0e5e7e8ce12a\"}}", (com.mxw.protocol.request.BlockTag) blockTagName5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.mxw.protocol.response.TokenAccountState tokenAccountState0 = new com.mxw.protocol.response.TokenAccountState();
        tokenAccountState0.setOwner("0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray12 = com.mxw.utils.Bytes.concat(byteArray5, byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray30 = com.mxw.crypto.Bech32.toWords(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray36 = com.mxw.crypto.Bech32.toWords(byteArray35);
        byte[] byteArray37 = com.mxw.utils.Bytes.concat(byteArray30, byteArray35);
        byte[] byteArray38 = com.mxw.utils.Bytes.concat(byteArray24, byteArray30);
        byte[] byteArray39 = com.mxw.utils.Bytes.concat(byteArray18, byteArray24);
        byte[] byteArray40 = com.mxw.utils.Bytes.concat(byteArray5, byteArray39);
        java.lang.String str41 = com.mxw.utils.Address.getHash(byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0x0c100010000210" + "'", str41, "0x0c100010000210");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions nonFungibleTokenStatusActions0 = com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.REJECT_TRANSFER_TOKEN_OWNERSHIP;
        java.lang.String str1 = nonFungibleTokenStatusActions0.toString();
        java.lang.String str2 = nonFungibleTokenStatusActions0.toString();
        org.junit.Assert.assertTrue("'" + nonFungibleTokenStatusActions0 + "' != '" + com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.REJECT_TRANSFER_TOKEN_OWNERSHIP + "'", nonFungibleTokenStatusActions0.equals(com.mxw.nonFungibleToken.NonFungibleTokenEnum.NonFungibleTokenStatusActions.REJECT_TRANSFER_TOKEN_OWNERSHIP));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "REJECT_TRANSFER_TOKEN_OWNERSHIP" + "'", str1, "REJECT_TRANSFER_TOKEN_OWNERSHIP");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "REJECT_TRANSFER_TOKEN_OWNERSHIP" + "'", str2, "REJECT_TRANSFER_TOKEN_OWNERSHIP");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setMnemonic("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        java.lang.String str5 = signingKey2.getCompressedPublicKey();
        signingKey2.setHexAddress("0x0c1000100002100c100010000210");
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf" + "'", str5, "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.mxw.protocol.common.Response.Error error0 = new com.mxw.protocol.common.Response.Error();
        java.lang.String str1 = error0.getData();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = com.mxw.crypto.Bech32.toWords(byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray12 = com.mxw.crypto.Bech32.toWords(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray18, byteArray23);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray12, byteArray18);
        byte[] byteArray27 = com.mxw.utils.Bytes.concat(byteArray6, byteArray12);
        com.mxw.crypto.ECKeyPair eCKeyPair28 = com.mxw.crypto.ECKeyPair.create(byteArray12);
        eCKeyPair28.setPublicKeyType("UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.WalletFile walletFile33 = com.mxw.crypto.SecretStorage.create("mintNonFungibleItem", eCKeyPair28, 40, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cost parameter N must be > 1 and a power of 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair28);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider1 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt3 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray9 = com.mxw.crypto.Bech32.toWords(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray15 = com.mxw.crypto.Bech32.toWords(byteArray14);
        byte[] byteArray16 = com.mxw.utils.Bytes.concat(byteArray9, byteArray14);
        java.math.BigInteger bigInteger17 = com.mxw.utils.Numeric.toBigInt(byteArray14);
        linuxSecureRandomTransactionReceipt3.setBlockNumber(bigInteger17);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionReceipt transactionReceipt19 = jsonRpcProvider1.waitForTransaction("status", bigInteger17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.mxw.protocol.events.NotificationParams<java.lang.Throwable> throwableNotificationParams0 = new com.mxw.protocol.events.NotificationParams<java.lang.Throwable>();
        java.lang.Throwable throwable1 = throwableNotificationParams0.getResult();
        org.junit.Assert.assertNull(throwable1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.mxw.protocol.request.TransactionRequest transactionRequest0 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue1 = transactionRequest0.getValue();
        transactionRequest0.setType("status");
        org.junit.Assert.assertNull(transactionValue1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.mxw.crypto.WalletFile.Aes128CtrKdfParams aes128CtrKdfParams0 = new com.mxw.crypto.WalletFile.Aes128CtrKdfParams();
        aes128CtrKdfParams0.setSalt("0x0c100010000210");
        aes128CtrKdfParams0.setC((int) '4');
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusPayload fungibleTokenStatusPayload0 = null;
        com.mxw.protocol.response.fungibleToken.FungibleTokenStatusTransaction fungibleTokenStatusTransaction1 = new com.mxw.protocol.response.fungibleToken.FungibleTokenStatusTransaction(fungibleTokenStatusPayload0);
        java.lang.String str2 = fungibleTokenStatusTransaction1.owner;
        com.mxw.protocol.response.PublicKey publicKey3 = null;
        com.mxw.protocol.response.Signature signature5 = new com.mxw.protocol.response.Signature(publicKey3, "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        com.mxw.protocol.response.PublicKey publicKey6 = signature5.getPublicKey();
        signature5.setSignature("4");
        com.mxw.protocol.response.Signature[] signatureArray9 = new com.mxw.protocol.response.Signature[] { signature5 };
        java.util.ArrayList<com.mxw.protocol.response.Signature> signatureList10 = new java.util.ArrayList<com.mxw.protocol.response.Signature>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mxw.protocol.response.Signature>) signatureList10, signatureArray9);
        fungibleTokenStatusTransaction1.signatures = signatureList10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(publicKey6);
        org.junit.Assert.assertNotNull(signatureArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.mxw.protocol.request.BlockTagName blockTagName0 = com.mxw.protocol.request.BlockTagName.EARLIEST;
        org.junit.Assert.assertTrue("'" + blockTagName0 + "' != '" + com.mxw.protocol.request.BlockTagName.EARLIEST + "'", blockTagName0.equals(com.mxw.protocol.request.BlockTagName.EARLIEST));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        java.io.File file2 = null;
        com.mxw.crypto.Bip39Wallet bip39Wallet3 = com.mxw.crypto.SecretStorageUtils.generateBip39WalletFromMnemonic("4", "cin", file2);
        java.lang.String str4 = bip39Wallet3.getMnemonic();
        org.junit.Assert.assertNotNull(bip39Wallet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "cin" + "'", str4, "cin");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        java.lang.String str5 = signingKey2.getPrivateKey();
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x3a8de5ac34c0f087b4f49f2221fb9a30c449d04e594e8f91f8711e9a926446c" + "'", str5, "0x3a8de5ac34c0f087b4f49f2221fb9a30c449d04e594e8f91f8711e9a926446c");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray7 = com.mxw.crypto.Bech32.toWords(byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray13 = com.mxw.crypto.Bech32.toWords(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray19 = com.mxw.crypto.Bech32.toWords(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray25 = com.mxw.crypto.Bech32.toWords(byteArray24);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray19, byteArray24);
        byte[] byteArray27 = com.mxw.utils.Bytes.concat(byteArray13, byteArray19);
        byte[] byteArray28 = com.mxw.utils.Bytes.concat(byteArray7, byteArray13);
        com.mxw.crypto.ECKeyPair eCKeyPair29 = com.mxw.crypto.ECKeyPair.create(byteArray13);
        boolean boolean31 = eCKeyPair29.equals((java.lang.Object) 4);
        com.mxw.crypto.WalletFile walletFile32 = com.mxw.crypto.SecretStorage.createStandard("hi!", eCKeyPair29);
        java.lang.String str33 = eCKeyPair29.getPublicKeyType();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.WalletFile walletFile36 = com.mxw.crypto.SecretStorage.create("status", eCKeyPair29, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cost parameter N must be > 1 and a power of 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(walletFile32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PubKeySecp256k1" + "'", str33, "PubKeySecp256k1");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt0 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        com.mxw.protocol.response.DeliverTransaction deliverTransaction1 = null;
        linuxSecureRandomTransactionReceipt0.setDeliverTransaction(deliverTransaction1);
        com.mxw.protocol.response.TransactionReceipt.Result result3 = null;
        linuxSecureRandomTransactionReceipt0.setResult(result3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str2 = com.mxw.crypto.Keys.computeKycAddress("REJECT_TRANSFER_TOKEN_OWNERSHIP", "latest");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray12 = com.mxw.utils.Bytes.concat(byteArray5, byteArray10);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray30 = com.mxw.crypto.Bech32.toWords(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray36 = com.mxw.crypto.Bech32.toWords(byteArray35);
        byte[] byteArray37 = com.mxw.utils.Bytes.concat(byteArray30, byteArray35);
        byte[] byteArray38 = com.mxw.utils.Bytes.concat(byteArray24, byteArray30);
        byte[] byteArray39 = com.mxw.utils.Bytes.concat(byteArray18, byteArray24);
        byte[] byteArray40 = com.mxw.utils.Bytes.concat(byteArray5, byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = com.mxw.crypto.MnemonicUtils.generateMnemonic(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The allowed size of ENT is 128-256 bits of multiples of 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        java.io.File file1 = null;
        com.mxw.crypto.Bip39Wallet bip39Wallet2 = com.mxw.crypto.SecretStorageUtils.generateBip39Wallet("hi!", file1);
        org.junit.Assert.assertNotNull(bip39Wallet2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.mxw.crypto.WalletFile.Aes128CtrKdfParams aes128CtrKdfParams0 = new com.mxw.crypto.WalletFile.Aes128CtrKdfParams();
        aes128CtrKdfParams0.setSalt("status");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.mxw.protocol.response.InnerResponse innerResponse3 = new com.mxw.protocol.response.InnerResponse(0, "", "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
        int int4 = innerResponse3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        com.mxw.protocol.request.BlockTag blockTag1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = wallet0.getAccountNumber(blockTag1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: missing provider");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wallet0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.String str0 = com.mxw.Constants.Power10UnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Gcin" + "'", str0, "Gcin");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.mxw.protocol.response.InnerResponse innerResponse3 = new com.mxw.protocol.response.InnerResponse(0, "", "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = null;
        innerResponse3.setResponse(jsonNode4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        java.lang.String str1 = com.mxw.crypto.Hash.sha3String("cin");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x0663b4d3ca918444ac4683988c83697dabad80793b1db8581dfb9add0edc84d5" + "'", str1, "0x0663b4d3ca918444ac4683988c83697dabad80793b1db8581dfb9add0edc84d5");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        java.lang.String str1 = com.mxw.crypto.Hash.sha3String("mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0xdcd03448fe00f1a3610b683ec2ec51e77bf39c3b643580d19db68ba875c7dd9f" + "'", str1, "0xdcd03448fe00f1a3610b683ec2ec51e77bf39c3b643580d19db68ba875c7dd9f");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt0 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        linuxSecureRandomTransactionReceipt0.setHash("PubKeySecp256k1");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt3 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray9 = com.mxw.crypto.Bech32.toWords(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray15 = com.mxw.crypto.Bech32.toWords(byteArray14);
        byte[] byteArray16 = com.mxw.utils.Bytes.concat(byteArray9, byteArray14);
        java.math.BigInteger bigInteger17 = com.mxw.utils.Numeric.toBigInt(byteArray14);
        linuxSecureRandomTransactionReceipt3.setBlockNumber(bigInteger17);
        linuxSecureRandomTransactionReceipt0.setBlockNumber(bigInteger17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = com.mxw.crypto.Keys.computeAddress(bigInteger17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid public or private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        com.mxw.crypto.SigningKey signingKey5 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey5.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider9 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet10 = new com.mxw.Wallet(signingKey5, (com.mxw.providers.Provider) jsonRpcProvider9);
        com.mxw.providers.Provider provider11 = wallet10.getProvider();
        com.mxw.Wallet wallet12 = new com.mxw.Wallet(signingKey2, provider11);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.Block block14 = provider11.getBlock((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(signingKey5);
        org.junit.Assert.assertNotNull(provider11);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken nFToken0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken();
        java.lang.String str1 = nFToken0.nonce;
        nFToken0.nonce = "Tcin";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        java.lang.String str1 = com.mxw.utils.Address.getAddress("0xeb87417d8bd9691b4b39d7be34a3c03c7ceb70803d21b2b341c5b002947c7589");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.mxw.protocol.response.TokenList tokenList0 = new com.mxw.protocol.response.TokenList();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.mxw.protocol.response.PublicKey publicKey0 = null;
        com.mxw.protocol.response.Signature signature2 = new com.mxw.protocol.response.Signature(publicKey0, "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        com.mxw.protocol.response.PublicKey publicKey3 = signature2.getPublicKey();
        com.mxw.protocol.response.PublicKey publicKey4 = signature2.getPublicKey();
        org.junit.Assert.assertNull(publicKey3);
        org.junit.Assert.assertNull(publicKey4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        com.mxw.protocol.response.fungibleToken.FungibleTokenTransfer fungibleTokenTransfer10 = null;
        com.mxw.protocol.common.Bundle bundle12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.request.TransactionRequest transactionRequest13 = fungibleToken9.transfer(fungibleTokenTransfer10, "0xeb87417d8bd9691b4b39d7be34a3c03c7ceb70803d21b2b341c5b002947c7589", bundle12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: transfer item missing");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt0 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        linuxSecureRandomTransactionReceipt0.setHash("PubKeySecp256k1");
        com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom> linuxSecureRandomTransactionReceipt3 = new com.mxw.protocol.response.TransactionReceipt<com.mxw.crypto.LinuxSecureRandom>();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray9 = com.mxw.crypto.Bech32.toWords(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray15 = com.mxw.crypto.Bech32.toWords(byteArray14);
        byte[] byteArray16 = com.mxw.utils.Bytes.concat(byteArray9, byteArray14);
        java.math.BigInteger bigInteger17 = com.mxw.utils.Numeric.toBigInt(byteArray14);
        linuxSecureRandomTransactionReceipt3.setBlockNumber(bigInteger17);
        linuxSecureRandomTransactionReceipt0.setBlockNumber(bigInteger17);
        linuxSecureRandomTransactionReceipt0.setStatus((java.lang.Integer) (-2147483648));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger17);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken nFToken0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken();
        java.lang.String str1 = nFToken0.nonce;
        nFToken0.burnable = false;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = com.mxw.crypto.Bech32.toWords(byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray12 = com.mxw.crypto.Bech32.toWords(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray18, byteArray23);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray12, byteArray18);
        byte[] byteArray27 = com.mxw.utils.Bytes.concat(byteArray6, byteArray12);
        com.mxw.crypto.ECKeyPair eCKeyPair28 = com.mxw.crypto.ECKeyPair.create(byteArray12);
        boolean boolean30 = eCKeyPair28.equals((java.lang.Object) 4);
        com.mxw.crypto.WalletFile walletFile31 = com.mxw.crypto.SecretStorage.createStandard("hi!", eCKeyPair28);
        com.mxw.protocol.Service service32 = null;
        com.mxw.networks.Network network34 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider35 = new com.mxw.providers.JsonRpcProvider(service32, network34);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.Wallet wallet36 = new com.mxw.Wallet(eCKeyPair28, (com.mxw.providers.Provider) jsonRpcProvider35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid private key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(walletFile31);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.mxw.protocol.request.TransactionRequest transactionRequest0 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue1 = transactionRequest0.getValue();
        java.lang.String str2 = transactionRequest0.getType();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray8 = com.mxw.crypto.Bech32.toWords(byteArray7);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray14 = com.mxw.crypto.Bech32.toWords(byteArray13);
        byte[] byteArray15 = com.mxw.utils.Bytes.concat(byteArray8, byteArray13);
        java.math.BigInteger bigInteger16 = com.mxw.utils.Numeric.toBigInt(byteArray13);
        transactionRequest0.setSequence(bigInteger16);
        com.mxw.crypto.ECKeyPair eCKeyPair18 = com.mxw.crypto.ECKeyPair.create(bigInteger16);
        org.junit.Assert.assertNull(transactionValue1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(eCKeyPair18);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.mxw.Wallet wallet1 = com.mxw.Wallet.createNewWallet();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.nonFungibleToken.NonFungibleToken nonFungibleToken2 = new com.mxw.nonFungibleToken.NonFungibleToken("REJECT_TRANSFER_TOKEN_OWNERSHIP", (com.mxw.Signer) wallet1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: missing provider");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wallet1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        okhttp3.OkHttpClient okHttpClient1 = null;
        com.mxw.protocol.http.HttpService httpService2 = new com.mxw.protocol.http.HttpService("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0", okHttpClient1);
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider((com.mxw.protocol.Service) httpService2);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.AccountState accountState5 = jsonRpcProvider3.getAccountState("latest");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = com.mxw.crypto.Bech32.toWords(byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray12 = com.mxw.crypto.Bech32.toWords(byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray18 = com.mxw.crypto.Bech32.toWords(byteArray17);
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray24 = com.mxw.crypto.Bech32.toWords(byteArray23);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray18, byteArray23);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray12, byteArray18);
        byte[] byteArray27 = com.mxw.utils.Bytes.concat(byteArray6, byteArray12);
        com.mxw.crypto.ECKeyPair eCKeyPair28 = com.mxw.crypto.ECKeyPair.create(byteArray12);
        boolean boolean30 = eCKeyPair28.equals((java.lang.Object) 4);
        com.mxw.crypto.WalletFile walletFile31 = com.mxw.crypto.SecretStorage.createStandard("hi!", eCKeyPair28);
        java.lang.String str32 = walletFile31.getAddress();
        java.lang.String str33 = walletFile31.getAddress();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(walletFile31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "mxw1pe5gfs5dcevjrkvtsaxkn8x0u6pcu6dhyu7zcz" + "'", str32, "mxw1pe5gfs5dcevjrkvtsaxkn8x0u6pcu6dhyu7zcz");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "mxw1pe5gfs5dcevjrkvtsaxkn8x0u6pcu6dhyu7zcz" + "'", str33, "mxw1pe5gfs5dcevjrkvtsaxkn8x0u6pcu6dhyu7zcz");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.mxw.crypto.WalletFile.MxwMetaData mxwMetaData4 = new com.mxw.crypto.WalletFile.MxwMetaData("0xe39598BAD2465a747Facf0Df083C70D9C77F6862", "status", "success", "Mcin");
        mxwMetaData4.setMnemonicCounter("success");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger1 = null;
        com.mxw.crypto.ECDSASignature eCDSASignature2 = new com.mxw.crypto.ECDSASignature(bigInteger0, bigInteger1);
        java.math.BigInteger bigInteger3 = eCDSASignature2.r;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.ECDSASignature eCDSASignature4 = eCDSASignature2.toCanonicalised();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bigInteger3);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.mxw.utils.Convert.Unit unit0 = com.mxw.utils.Convert.Unit.TCIN;
        java.lang.String str1 = unit0.toString();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + com.mxw.utils.Convert.Unit.TCIN + "'", unit0.equals(com.mxw.utils.Convert.Unit.TCIN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Tcin" + "'", str1, "Tcin");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        java.math.BigInteger bigInteger6 = com.mxw.utils.Numeric.toBigInt(byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.mxw.crypto.WalletFile.ScryptKdfParams scryptKdfParams0 = new com.mxw.crypto.WalletFile.ScryptKdfParams();
        scryptKdfParams0.setSalt("0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
        scryptKdfParams0.setN((int) (byte) 100);
        int int5 = scryptKdfParams0.getP();
        com.mxw.protocol.common.Response.Error error6 = new com.mxw.protocol.common.Response.Error();
        boolean boolean7 = scryptKdfParams0.equals((java.lang.Object) error6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.mxw.utils.Assertions.verifyPrecondition(true, "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray23 = com.mxw.crypto.Bech32.toWords(byteArray22);
        byte[] byteArray24 = com.mxw.utils.Bytes.concat(byteArray17, byteArray22);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray11, byteArray17);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        com.mxw.crypto.Sign.SignatureData signatureData27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = com.mxw.crypto.Keys.recoverAddress(byteArray26, signatureData27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.mxw.protocol.deserializer.TransactionMessageDeserializer transactionMessageDeserializer3 = new com.mxw.protocol.deserializer.TransactionMessageDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger>) bigIntegerDeserializer0);
        java.lang.Class<?> wildcardClass4 = transactionMessageDeserializer3.handledType();
        java.lang.Object obj5 = transactionMessageDeserializer3.getEmptyValue();
        java.lang.Class<?> wildcardClass6 = transactionMessageDeserializer3.handledType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.mxw.exceptions.AddressFormatException.InvalidPrefix invalidPrefix1 = new com.mxw.exceptions.AddressFormatException.InvalidPrefix("/Users/yhcrown/Library/mxw");
        com.mxw.exceptions.AddressFormatException.InvalidDataLength invalidDataLength3 = new com.mxw.exceptions.AddressFormatException.InvalidDataLength();
        com.mxw.exceptions.CipherException cipherException4 = new com.mxw.exceptions.CipherException("com.mxw.exceptions.AddressFormatException", (java.lang.Throwable) invalidDataLength3);
        invalidPrefix1.addSuppressed((java.lang.Throwable) invalidDataLength3);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray7 = com.mxw.crypto.Bech32.toWords(byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray13 = com.mxw.crypto.Bech32.toWords(byteArray12);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray19 = com.mxw.crypto.Bech32.toWords(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray25 = com.mxw.crypto.Bech32.toWords(byteArray24);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray19, byteArray24);
        byte[] byteArray27 = com.mxw.utils.Bytes.concat(byteArray13, byteArray19);
        byte[] byteArray28 = com.mxw.utils.Bytes.concat(byteArray7, byteArray13);
        com.mxw.crypto.ECKeyPair eCKeyPair29 = com.mxw.crypto.ECKeyPair.create(byteArray13);
        boolean boolean31 = eCKeyPair29.equals((java.lang.Object) 4);
        com.mxw.crypto.WalletFile walletFile32 = com.mxw.crypto.SecretStorage.createStandard("hi!", eCKeyPair29);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.crypto.SigningKey signingKey33 = com.mxw.crypto.SecretStorage.decryptToSignKey("cin", walletFile32);
            org.junit.Assert.fail("Expected exception of type com.mxw.exceptions.CipherException; message: Invalid password provided");
        } catch (com.mxw.exceptions.CipherException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(walletFile32);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload nFTokenStatusPayload0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.utils.Assertions.verifyPrecondition(false, "0xTcin");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: 0xTcin");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray10 = com.mxw.crypto.Bech32.toWords(byteArray9);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray16 = com.mxw.crypto.Bech32.toWords(byteArray15);
        byte[] byteArray17 = com.mxw.utils.Bytes.concat(byteArray10, byteArray15);
        java.math.BigInteger bigInteger18 = com.mxw.utils.Numeric.toBigInt(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = bigIntegerDeserializer0.deserialize(jsonParser3, deserializationContext4, bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.mxw.crypto.WalletFile.Crypto crypto0 = new com.mxw.crypto.WalletFile.Crypto();
        crypto0.setCiphertext("REJECT");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.mxw.crypto.SigningKey signingKey3 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey3.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider7 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet8 = new com.mxw.Wallet(signingKey3, (com.mxw.providers.Provider) jsonRpcProvider7);
        com.mxw.fungibleToken.FungibleToken fungibleToken9 = new com.mxw.fungibleToken.FungibleToken("latest", (com.mxw.Signer) wallet8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = fungibleToken9.isFrozen();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: not initialized state");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        com.mxw.providers.Provider provider8 = wallet7.getProvider();
        java.lang.String str9 = wallet7.getAddress();
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNotNull(provider8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg" + "'", str9, "mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.crypto.SigningKey signingKey6 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        signingKey6.setPublicKeyType("");
        java.lang.String str9 = signingKey6.getPublicKeyType();
        com.mxw.tx.DefaultTransactionManager defaultTransactionManager10 = new com.mxw.tx.DefaultTransactionManager((com.mxw.providers.Provider) jsonRpcProvider3, signingKey6);
        com.mxw.protocol.request.BlockTag blockTag12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean13 = jsonRpcProvider3.isWhiteListed("hi!", blockTag12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.lang.String str0 = com.mxw.Constants.kycAddressPrefix;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "kyc" + "'", str0, "kyc");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray23 = com.mxw.crypto.Bech32.toWords(byteArray22);
        byte[] byteArray24 = com.mxw.utils.Bytes.concat(byteArray17, byteArray22);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray11, byteArray17);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        com.mxw.crypto.ECKeyPair eCKeyPair27 = com.mxw.crypto.ECKeyPair.create(byteArray11);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray33 = com.mxw.crypto.Bech32.toWords(byteArray32);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray39 = com.mxw.crypto.Bech32.toWords(byteArray38);
        byte[] byteArray40 = com.mxw.utils.Bytes.concat(byteArray33, byteArray38);
        eCKeyPair27.setPublicKeyBytes(byteArray33);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair27);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.mxw.protocol.response.PublicKey publicKey1 = null;
        com.mxw.protocol.request.TransactionRequest transactionRequest2 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue3 = transactionRequest2.getValue();
        java.lang.String str4 = transactionRequest2.getType();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray10 = com.mxw.crypto.Bech32.toWords(byteArray9);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray16 = com.mxw.crypto.Bech32.toWords(byteArray15);
        byte[] byteArray17 = com.mxw.utils.Bytes.concat(byteArray10, byteArray15);
        java.math.BigInteger bigInteger18 = com.mxw.utils.Numeric.toBigInt(byteArray15);
        transactionRequest2.setSequence(bigInteger18);
        com.mxw.protocol.response.Status.ValidatorInfo validatorInfo20 = new com.mxw.protocol.response.Status.ValidatorInfo("burn", publicKey1, bigInteger18);
        org.junit.Assert.assertNull(transactionValue3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.crypto.SigningKey signingKey6 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        signingKey6.setPublicKeyType("");
        java.lang.String str9 = signingKey6.getPublicKeyType();
        com.mxw.tx.DefaultTransactionManager defaultTransactionManager10 = new com.mxw.tx.DefaultTransactionManager((com.mxw.providers.Provider) jsonRpcProvider3, signingKey6);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = jsonRpcProvider3.getBlockNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray6 = com.mxw.crypto.Bech32.toWords(byteArray5);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray12 = com.mxw.crypto.Bech32.toWords(byteArray11);
        byte[] byteArray13 = com.mxw.utils.Bytes.concat(byteArray6, byteArray11);
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray19 = com.mxw.crypto.Bech32.toWords(byteArray18);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray25 = com.mxw.crypto.Bech32.toWords(byteArray24);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray31 = com.mxw.crypto.Bech32.toWords(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray37 = com.mxw.crypto.Bech32.toWords(byteArray36);
        byte[] byteArray38 = com.mxw.utils.Bytes.concat(byteArray31, byteArray36);
        byte[] byteArray39 = com.mxw.utils.Bytes.concat(byteArray25, byteArray31);
        byte[] byteArray40 = com.mxw.utils.Bytes.concat(byteArray19, byteArray25);
        byte[] byteArray41 = com.mxw.utils.Bytes.concat(byteArray6, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = com.mxw.crypto.Bech32.encode("UTC--2023-10-31T23-40-06.591000000Z--mxw12ldyka6g70u22zlk4p0vrdu4ph8udyw0g7kx56.json", byteArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Human-readable part is too long");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.mxw.Wallet wallet0 = com.mxw.Wallet.createNewWallet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = wallet0.isWhitelisted();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: missing provider");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wallet0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        okhttp3.OkHttpClient okHttpClient1 = null;
        com.mxw.protocol.http.HttpService httpService2 = new com.mxw.protocol.http.HttpService("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0", okHttpClient1);
        httpService2.close();
        com.mxw.protocol.common.Request request4 = null;
        com.mxw.protocol.request.BlockTagName blockTagName5 = com.mxw.protocol.request.BlockTagName.LATEST;
        java.lang.String str6 = blockTagName5.getValue();
        java.lang.Class<?> wildcardClass7 = blockTagName5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.common.Response<com.mxw.protocol.response.nonFungibleToken.NFTokenCreate> nFTokenCreateResponse8 = httpService2.send(request4, (java.lang.reflect.Type) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockTagName5 + "' != '" + com.mxw.protocol.request.BlockTagName.LATEST + "'", blockTagName5.equals(com.mxw.protocol.request.BlockTagName.LATEST));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "latest" + "'", str6, "latest");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("", "");
        network2.setChainId("mxw");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.mxw.protocol.response.InnerResponse innerResponse3 = new com.mxw.protocol.response.InnerResponse(0, "", "0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0");
        innerResponse3.setCodespace("UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse nFTokenEndorse3 = new com.mxw.protocol.response.nonFungibleToken.NFTokenEndorse("0x0c100010000210", "status", "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
        java.lang.String str4 = nFTokenEndorse3.getMetadata();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70" + "'", str4, "0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        okhttp3.OkHttpClient okHttpClient1 = null;
        com.mxw.protocol.http.HttpService httpService2 = new com.mxw.protocol.http.HttpService("0x60fe5838f73ce5b575d899c37e74daecd80a24c72b6916934e7dbf36860c4ad0", okHttpClient1);
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider((com.mxw.protocol.Service) httpService2);
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionResponse transactionResponse6 = jsonRpcProvider3.sendTransaction("4", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.lang.String str0 = com.mxw.Constants.Power16UnitName;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "kcin" + "'", str0, "kcin");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        com.mxw.protocol.response.TransactionFee transactionFee0 = new com.mxw.protocol.response.TransactionFee();
        java.math.BigInteger bigInteger1 = transactionFee0.getGas();
        org.junit.Assert.assertNull(bigInteger1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = jsonRpcProvider6.getBalance("burn");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected URL scheme 'http' or 'https' but no colon was found");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        com.mxw.protocol.response.TransactionLog transactionLog0 = new com.mxw.protocol.response.TransactionLog();
        transactionLog0.setLog("/Users/yhcrown/Library/mxw");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        com.mxw.protocol.response.nonFungibleToken.NFTokenCreate nFTokenCreate6 = new com.mxw.protocol.response.nonFungibleToken.NFTokenCreate("gasUsed", "hi!", "hi!", "/Users/yhcrown/Library/mxw", "hi!", "0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        com.mxw.protocol.response.nonFungibleToken.NFTokenCreate.Fee fee7 = nFTokenCreate6.getFee();
        nFTokenCreate6.setOwner("");
        org.junit.Assert.assertNotNull(fee7);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        com.mxw.crypto.WalletFile.MxwMetaData mxwMetaData3 = new com.mxw.crypto.WalletFile.MxwMetaData("0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf", "kcin", "status");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray5 = com.mxw.crypto.Bech32.toWords(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray11 = com.mxw.crypto.Bech32.toWords(byteArray10);
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray17 = com.mxw.crypto.Bech32.toWords(byteArray16);
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray23 = com.mxw.crypto.Bech32.toWords(byteArray22);
        byte[] byteArray24 = com.mxw.utils.Bytes.concat(byteArray17, byteArray22);
        byte[] byteArray25 = com.mxw.utils.Bytes.concat(byteArray11, byteArray17);
        byte[] byteArray26 = com.mxw.utils.Bytes.concat(byteArray5, byteArray11);
        com.mxw.crypto.ECKeyPair eCKeyPair27 = com.mxw.crypto.ECKeyPair.create(byteArray11);
        boolean boolean29 = eCKeyPair27.equals((java.lang.Object) 4);
        eCKeyPair27.setPrivateKey("4");
        // The following exception was thrown during execution in test generation
        try {
            eCKeyPair27.setCompressedPublicKey("UTC--2023-10-31T23-40-02.652000000Z--mxw12dkqkafxypp928waa826279r2ucl9tw9dzmmrs.json");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[12, 16, 0, 16, 0, 2, 16, 12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(eCKeyPair27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("Mcin", "gasUsed");
        signingKey2.setAddress("Mcin");
        signingKey2.setPublicKeyType("com.mxw.exceptions.AddressFormatException$InvalidPrefix: /Users/yhcrown/Library/mxw");
        org.junit.Assert.assertNotNull(signingKey2);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        java.lang.String str3 = signingKey2.getMnemonic();
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken nFToken0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken();
        boolean boolean1 = nFToken0.pub;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        com.mxw.Wallet wallet1 = com.mxw.Wallet.fromMnemonic("0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
        com.mxw.crypto.SigningKey signingKey4 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        signingKey4.setPublicKeyType("");
        com.mxw.crypto.ECKeyPair eCKeyPair7 = signingKey4.getKeyPair();
        wallet1.setSigningKey(signingKey4);
        java.lang.String str9 = signingKey4.getMnemonic();
        org.junit.Assert.assertNotNull(wallet1);
        org.junit.Assert.assertNotNull(signingKey4);
        org.junit.Assert.assertNotNull(eCKeyPair7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        com.mxw.crypto.SigningKey signingKey2 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey2.setCompressedPublicKey("com.mxw.exceptions.AddressFormatException");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider6 = new com.mxw.providers.JsonRpcProvider("/Users/yhcrown/Library/mxw");
        com.mxw.Wallet wallet7 = new com.mxw.Wallet(signingKey2, (com.mxw.providers.Provider) jsonRpcProvider6);
        java.lang.String str9 = jsonRpcProvider6.resolveName("mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg");
        org.junit.Assert.assertNotNull(signingKey2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg" + "'", str9, "mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        com.mxw.protocol.common.Request<com.mxw.protocol.deserializer.BigIntegerDeserializer, java.util.RandomAccess> bigIntegerDeserializerRequest0 = new com.mxw.protocol.common.Request<com.mxw.protocol.deserializer.BigIntegerDeserializer, java.util.RandomAccess>();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        java.lang.String str1 = com.mxw.utils.Numeric.cleanHexPrefix("0xe39598BAD2465a747Facf0Df083C70D9C77F6862");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e39598BAD2465a747Facf0Df083C70D9C77F6862" + "'", str1, "e39598BAD2465a747Facf0Df083C70D9C77F6862");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        com.mxw.protocol.deserializer.BigIntegerDeserializer bigIntegerDeserializer0 = new com.mxw.protocol.deserializer.BigIntegerDeserializer();
        boolean boolean1 = bigIntegerDeserializer0.isCachable();
        java.lang.Object obj2 = bigIntegerDeserializer0.getEmptyValue();
        com.mxw.protocol.deserializer.TransactionMessageDeserializer transactionMessageDeserializer3 = new com.mxw.protocol.deserializer.TransactionMessageDeserializer((com.fasterxml.jackson.databind.JsonDeserializer<java.math.BigInteger>) bigIntegerDeserializer0);
        java.lang.Class<?> wildcardClass4 = transactionMessageDeserializer3.handledType();
        java.util.Collection<java.lang.Object> objCollection5 = transactionMessageDeserializer3.getKnownPropertyNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNull(objCollection5);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        com.mxw.protocol.request.TransactionRequest transactionRequest2 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue3 = transactionRequest2.getValue();
        java.lang.String str4 = transactionRequest2.getType();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray10 = com.mxw.crypto.Bech32.toWords(byteArray9);
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray16 = com.mxw.crypto.Bech32.toWords(byteArray15);
        byte[] byteArray17 = com.mxw.utils.Bytes.concat(byteArray10, byteArray15);
        java.math.BigInteger bigInteger18 = com.mxw.utils.Numeric.toBigInt(byteArray15);
        transactionRequest2.setSequence(bigInteger18);
        java.math.BigInteger bigInteger20 = transactionRequest2.getSequence();
        com.mxw.protocol.request.messages.builder.BankSendBuilder bankSendBuilder23 = new com.mxw.protocol.request.messages.builder.BankSendBuilder("0x0663b4d3ca918444ac4683988c83697dabad80793b1db8581dfb9add0edc84d5", "blockNumber", bigInteger20, "REJECT_TRANSFER_TOKEN_OWNERSHIP", "REJECT");
        com.mxw.protocol.response.TransactionFee transactionFee25 = new com.mxw.protocol.response.TransactionFee();
        com.mxw.protocol.response.TransactionMessage[] transactionMessageArray27 = new com.mxw.protocol.response.TransactionMessage[] {};
        java.util.ArrayList<com.mxw.protocol.response.TransactionMessage> transactionMessageList28 = new java.util.ArrayList<com.mxw.protocol.response.TransactionMessage>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.mxw.protocol.response.TransactionMessage>) transactionMessageList28, transactionMessageArray27);
        com.mxw.protocol.request.TransactionRequest transactionRequest30 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue31 = transactionRequest30.getValue();
        java.lang.String str32 = transactionRequest30.getType();
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray38 = com.mxw.crypto.Bech32.toWords(byteArray37);
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray44 = com.mxw.crypto.Bech32.toWords(byteArray43);
        byte[] byteArray45 = com.mxw.utils.Bytes.concat(byteArray38, byteArray43);
        java.math.BigInteger bigInteger46 = com.mxw.utils.Numeric.toBigInt(byteArray43);
        transactionRequest30.setSequence(bigInteger46);
        java.math.BigInteger bigInteger48 = transactionRequest30.getSequence();
        com.mxw.protocol.response.TransactionPayload transactionPayload49 = new com.mxw.protocol.response.TransactionPayload(bigInteger20, "0.1", transactionFee25, "0xde71dd2df6ffd45bf46e40b6c1b214e2bae9e204381b37d9c0953228cc97a80d", (java.util.List<com.mxw.protocol.response.TransactionMessage>) transactionMessageList28, bigInteger48);
        org.junit.Assert.assertNull(transactionValue3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(transactionMessageArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(transactionValue31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertNotNull(bigInteger48);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        com.mxw.protocol.response.PublicKey publicKey3 = new com.mxw.protocol.response.PublicKey("Mcin", "gasUsed");
        com.mxw.protocol.request.TransactionRequest transactionRequest4 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue5 = transactionRequest4.getValue();
        java.lang.String str6 = transactionRequest4.getType();
        com.mxw.protocol.request.TransactionRequest transactionRequest7 = new com.mxw.protocol.request.TransactionRequest();
        com.mxw.protocol.response.TransactionValue transactionValue8 = transactionRequest7.getValue();
        java.lang.String str9 = transactionRequest7.getType();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray15 = com.mxw.crypto.Bech32.toWords(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        byte[] byteArray21 = com.mxw.crypto.Bech32.toWords(byteArray20);
        byte[] byteArray22 = com.mxw.utils.Bytes.concat(byteArray15, byteArray20);
        java.math.BigInteger bigInteger23 = com.mxw.utils.Numeric.toBigInt(byteArray20);
        transactionRequest7.setSequence(bigInteger23);
        java.math.BigInteger bigInteger25 = transactionRequest7.getSequence();
        transactionRequest4.setSequence(bigInteger25);
        com.mxw.protocol.response.Status.ValidatorInfo validatorInfo27 = new com.mxw.protocol.response.Status.ValidatorInfo("success", publicKey3, bigInteger25);
        org.junit.Assert.assertNull(transactionValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(transactionValue8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[12, 16, 0, 16, 0, 2, 16]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[12, 16, 0, 16, 0, 2, 16, 100, 1, 0, 10]");
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(bigInteger25);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        com.mxw.crypto.WalletFile.MxwMetaData mxwMetaData4 = new com.mxw.crypto.WalletFile.MxwMetaData("0xe39598BAD2465a747Facf0Df083C70D9C77F6862", "status", "success", "Mcin");
        mxwMetaData4.setVersion("Mcin");
        mxwMetaData4.setMnemonicCiphertext("/Users/yhcrown/Library/mxw");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        com.mxw.protocol.deserializer.PublicKeyDeserializer publicKeyDeserializer0 = new com.mxw.protocol.deserializer.PublicKeyDeserializer();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        com.mxw.Wallet wallet1 = com.mxw.Wallet.fromMnemonic("0x6aed34e6bddff5e1d872b5d7d5698a7b73abd6f3b33402732edc73ab9ffb9c70");
        com.mxw.crypto.SigningKey signingKey4 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        signingKey4.setPublicKeyType("");
        com.mxw.crypto.ECKeyPair eCKeyPair7 = signingKey4.getKeyPair();
        wallet1.setSigningKey(signingKey4);
        com.mxw.crypto.SigningKey signingKey11 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67", "Tcin");
        signingKey11.setMnemonic("0xbcdd273721bc9afe130ba8895dcec9dd6ff2a0e170365dfb320e26ea0bceec67");
        java.lang.String str14 = signingKey11.getCompressedPublicKey();
        signingKey11.setPublicKeyType("mxw1uw2e3wkjged8glav7r0ss0rsm8rh76rzxxcrxg");
        boolean boolean18 = signingKey11.equals((java.lang.Object) 40);
        wallet1.setSigningKey(signingKey11);
        org.junit.Assert.assertNotNull(wallet1);
        org.junit.Assert.assertNotNull(signingKey4);
        org.junit.Assert.assertNotNull(eCKeyPair7);
        org.junit.Assert.assertNotNull(signingKey11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf" + "'", str14, "0x034a8b942705a1e8064345acfc53e88d7202a8c5677415f43999477e3e1c0068cf");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        com.mxw.protocol.Service service0 = null;
        com.mxw.networks.Network network2 = new com.mxw.networks.Network("");
        com.mxw.providers.JsonRpcProvider jsonRpcProvider3 = new com.mxw.providers.JsonRpcProvider(service0, network2);
        com.mxw.crypto.SigningKey signingKey6 = com.mxw.crypto.SecretStorageUtils.loadBip39SigningKey("hi!", "Tcin");
        signingKey6.setPublicKeyType("");
        java.lang.String str9 = signingKey6.getPublicKeyType();
        com.mxw.tx.DefaultTransactionManager defaultTransactionManager10 = new com.mxw.tx.DefaultTransactionManager((com.mxw.providers.Provider) jsonRpcProvider3, signingKey6);
        com.mxw.protocol.request.TransactionRequest transactionRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mxw.protocol.response.TransactionResponse transactionResponse12 = defaultTransactionManager10.sendTransaction(transactionRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signingKey6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken nFToken0 = new com.mxw.protocol.response.nonFungibleToken.NFTokenStatusPayload.NFToken();
        java.lang.String str1 = nFToken0.nonce;
        java.lang.String str2 = nFToken0.mintLimit;
        nFToken0.burnable = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        java.io.File file1 = null;
        java.lang.String str2 = com.mxw.crypto.SecretStorageUtils.generateNewWalletFile("latest", file1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC--2023-10-31T23-40-10.922000000Z--mxw1puhd288we4g0d6g3u2aeetj3acyszny7lx9x54.json" + "'", str2, "UTC--2023-10-31T23-40-10.922000000Z--mxw1puhd288we4g0d6g3u2aeetj3acyszny7lx9x54.json");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        com.mxw.protocol.response.TransactionValue transactionValue0 = new com.mxw.protocol.response.TransactionValue();
    }
}
