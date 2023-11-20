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
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY_ID;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY_ID + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY_ID));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError0 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_KEYS;
        org.junit.Assert.assertTrue("'" + ingestAssetError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_KEYS + "'", ingestAssetError0.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_KEYS));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.addSharedSecret(sharedSecretRequest3, "hi!");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY_ID;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY_ID + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY_ID));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.linkAccountToSubMerchant(linkAccountToSubMerchantRequest3, "");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError0 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        org.junit.Assert.assertTrue("'" + ingestAssetError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError0.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.updateAuthorizationSettings(updateAuthorizationSettingsRequest3, "hi!");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.brightcove.castlabs.client.request.AssetType assetType0 = com.brightcove.castlabs.client.request.AssetType.WIDEVINE;
        org.junit.Assert.assertTrue("'" + assetType0 + "' != '" + com.brightcove.castlabs.client.request.AssetType.WIDEVINE + "'", assetType0.equals(com.brightcove.castlabs.client.request.AssetType.WIDEVINE));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError0 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        org.junit.Assert.assertTrue("'" + ingestAssetError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError0.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError0 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_TYPE;
        org.junit.Assert.assertTrue("'" + ingestAssetError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_TYPE + "'", ingestAssetError0.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_TYPE));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest3 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest3.setSecret("");
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.addSharedSecret(sharedSecretRequest3, "hi!");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_ALGORITHM;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_ALGORITHM + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_ALGORITHM));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException3 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException1.addSuppressed((java.lang.Throwable) castlabsException3);
        java.lang.Throwable[] throwableArray5 = castlabsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        com.brightcove.castlabs.client.request.IngestKeysRequest ingestKeysRequest3 = new com.brightcove.castlabs.client.request.IngestKeysRequest();
        java.lang.String str4 = ingestKeysRequest3.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.IngestAssetsResponse ingestAssetsResponse6 = castlabsClient2.ingestKeys(ingestKeysRequest3, "hi!");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str4, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.brightcove.castlabs.client.request.AssetType assetType0 = com.brightcove.castlabs.client.request.AssetType.CENC;
        java.lang.Class<?> wildcardClass1 = assetType0.getClass();
        org.junit.Assert.assertTrue("'" + assetType0 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType0.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest3 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.linkAccountToSubMerchant(linkAccountToSubMerchantRequest3, "");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.brightcove.castlabs.client.response.DownloadKeysResponse> downloadKeysResponseList4 = castlabsClient2.downloadKeys("");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.ingestChannel = "IngestKeysRequest [assets=[]]";
        java.lang.String str7 = downloadKeysResponse0.auditChanged;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]" + "'", str1, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType2 = null;
        ingestKey0.setAlgorithm(algorithmType2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse4 = castlabsClient2.listAccounts("");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.uuid;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException3 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException5 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException3.addSuppressed((java.lang.Throwable) castlabsException5);
        castlabsException1.addSuppressed((java.lang.Throwable) castlabsException3);
        java.lang.String str8 = castlabsException3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.brightcove.castlabs.client.CastlabsException: " + "'", str8, "com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.brightcove.castlabs.client.request.StreamType streamType0 = com.brightcove.castlabs.client.request.StreamType.HD;
        org.junit.Assert.assertTrue("'" + streamType0 + "' != '" + com.brightcove.castlabs.client.request.StreamType.HD + "'", streamType0.equals(com.brightcove.castlabs.client.request.StreamType.HD));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.brightcove.castlabs.client.request.StreamType streamType0 = com.brightcove.castlabs.client.request.StreamType.SD;
        org.junit.Assert.assertTrue("'" + streamType0 + "' != '" + com.brightcove.castlabs.client.request.StreamType.SD + "'", streamType0.equals(com.brightcove.castlabs.client.request.StreamType.SD));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        fairplayRequest0.setApplicationSecretKey("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        sharedSecretRequest0.setEnabled((java.lang.Boolean) false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyId("com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.getCallbackUrl();
        updateAuthorizationSettingsRequest0.setMode("IngestKeysRequest [assets=[]]");
        java.lang.Class<?> wildcardClass4 = updateAuthorizationSettingsRequest0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        updateAuthorizationSettingsRequest0.setMode("com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        java.lang.String str1 = sharedSecretRequest0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "SharedSecretRequest{enabled='null', description='null', secret='null'}" + "'", str1, "SharedSecretRequest{enabled='null', description='null', secret='null'}");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest0.setType(assetType1);
        java.lang.String str3 = assetRequest0.getAssetId();
        com.brightcove.castlabs.client.request.IngestKey ingestKey4 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey4.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType7 = null;
        ingestKey4.setAlgorithm(algorithmType7);
        com.brightcove.castlabs.client.request.IngestKey ingestKey9 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey9.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType12 = null;
        ingestKey9.setAlgorithm(algorithmType12);
        com.brightcove.castlabs.client.request.IngestKey ingestKey14 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str15 = ingestKey14.getWvAssetId();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType16 = null;
        ingestKey14.setAlgorithm(algorithmType16);
        com.brightcove.castlabs.client.request.IngestKey ingestKey18 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str19 = ingestKey18.getWvAssetId();
        java.lang.String str20 = ingestKey18.getKeyRotationId();
        com.brightcove.castlabs.client.request.IngestKey ingestKey21 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str22 = ingestKey21.getWvAssetId();
        java.lang.String str23 = ingestKey21.getWvAssetId();
        ingestKey21.setKey("hi!");
        com.brightcove.castlabs.client.request.IngestKey ingestKey26 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey26.setKeyId("com.brightcove.castlabs.client.CastlabsException: ");
        com.brightcove.castlabs.client.request.IngestKey ingestKey29 = new com.brightcove.castlabs.client.request.IngestKey();
        com.brightcove.castlabs.client.request.IngestKey ingestKey30 = new com.brightcove.castlabs.client.request.IngestKey();
        com.brightcove.castlabs.client.request.IngestKey ingestKey31 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey31.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType34 = null;
        ingestKey31.setAlgorithm(algorithmType34);
        com.brightcove.castlabs.client.request.IngestKey[] ingestKeyArray36 = new com.brightcove.castlabs.client.request.IngestKey[] { ingestKey4, ingestKey9, ingestKey14, ingestKey18, ingestKey21, ingestKey26, ingestKey29, ingestKey30, ingestKey31 };
        java.util.ArrayList<com.brightcove.castlabs.client.request.IngestKey> ingestKeyList37 = new java.util.ArrayList<com.brightcove.castlabs.client.request.IngestKey>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.request.IngestKey>) ingestKeyList37, ingestKeyArray36);
        assetRequest0.setIngestKeys((java.util.List<com.brightcove.castlabs.client.request.IngestKey>) ingestKeyList37);
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(ingestKeyArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_IV;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_IV + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_IV));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        java.lang.String str8 = downloadKeysResponse0.assetId;
        java.lang.String str9 = downloadKeysResponse0.ingestRegion;
        java.lang.String str10 = downloadKeysResponse0.keyRotationId;
        java.lang.String str11 = downloadKeysResponse0.getAuditChangedBy();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        com.brightcove.castlabs.client.response.IngestAssetsResponse ingestAssetsResponse0 = new com.brightcove.castlabs.client.response.IngestAssetsResponse();
        com.brightcove.castlabs.client.response.AssetResponse assetResponse1 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.AssetResponse[] assetResponseArray2 = new com.brightcove.castlabs.client.response.AssetResponse[] { assetResponse1 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.AssetResponse> assetResponseList3 = new java.util.ArrayList<com.brightcove.castlabs.client.response.AssetResponse>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.AssetResponse>) assetResponseList3, assetResponseArray2);
        ingestAssetsResponse0.setAssets((java.util.List<com.brightcove.castlabs.client.response.AssetResponse>) assetResponseList3);
        com.brightcove.castlabs.client.response.IngestAssetsResponse ingestAssetsResponse6 = new com.brightcove.castlabs.client.response.IngestAssetsResponse();
        java.lang.String str7 = ingestAssetsResponse6.toString();
        java.lang.String str8 = ingestAssetsResponse6.toString();
        java.util.List<com.brightcove.castlabs.client.response.AssetResponse> assetResponseList9 = ingestAssetsResponse6.getAssets();
        ingestAssetsResponse0.setAssets(assetResponseList9);
        org.junit.Assert.assertNotNull(assetResponseArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IngestAssetsResponse [assets=[]]" + "'", str7, "IngestAssetsResponse [assets=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IngestAssetsResponse [assets=[]]" + "'", str8, "IngestAssetsResponse [assets=[]]");
        org.junit.Assert.assertNotNull(assetResponseList9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest0.setType(assetType1);
        com.brightcove.castlabs.client.request.AssetType assetType3 = assetRequest0.getType();
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertTrue("'" + assetType3 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType3.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.brightcove.castlabs.client.request.StreamType streamType0 = com.brightcove.castlabs.client.request.StreamType.UHD;
        org.junit.Assert.assertTrue("'" + streamType0 + "' != '" + com.brightcove.castlabs.client.request.StreamType.UHD + "'", streamType0.equals(com.brightcove.castlabs.client.request.StreamType.UHD));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.streamType = "hi!";
        java.lang.String str3 = downloadKeysResponse0.variantId;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.keyId;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        com.brightcove.castlabs.client.request.IngestKeysRequest ingestKeysRequest0 = new com.brightcove.castlabs.client.request.IngestKeysRequest();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest1 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str2 = assetRequest1.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest3 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType4 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest3.setType(assetType4);
        com.brightcove.castlabs.client.request.AssetType assetType6 = assetRequest3.getType();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest7 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType8 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest7.setType(assetType8);
        java.lang.String str10 = assetRequest7.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest11 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str12 = assetRequest11.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest13 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest14 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType15 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest14.setType(assetType15);
        com.brightcove.castlabs.client.request.AssetType assetType17 = assetRequest14.getType();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest18 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType19 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest18.setType(assetType19);
        java.lang.String str21 = assetRequest18.getAssetId();
        com.brightcove.castlabs.client.request.IngestKey ingestKey22 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey22.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType25 = null;
        ingestKey22.setAlgorithm(algorithmType25);
        com.brightcove.castlabs.client.request.IngestKey ingestKey27 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey27.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType30 = null;
        ingestKey27.setAlgorithm(algorithmType30);
        com.brightcove.castlabs.client.request.IngestKey ingestKey32 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str33 = ingestKey32.getWvAssetId();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType34 = null;
        ingestKey32.setAlgorithm(algorithmType34);
        com.brightcove.castlabs.client.request.IngestKey ingestKey36 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str37 = ingestKey36.getWvAssetId();
        java.lang.String str38 = ingestKey36.getKeyRotationId();
        com.brightcove.castlabs.client.request.IngestKey ingestKey39 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str40 = ingestKey39.getWvAssetId();
        java.lang.String str41 = ingestKey39.getWvAssetId();
        ingestKey39.setKey("hi!");
        com.brightcove.castlabs.client.request.IngestKey ingestKey44 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey44.setKeyId("com.brightcove.castlabs.client.CastlabsException: ");
        com.brightcove.castlabs.client.request.IngestKey ingestKey47 = new com.brightcove.castlabs.client.request.IngestKey();
        com.brightcove.castlabs.client.request.IngestKey ingestKey48 = new com.brightcove.castlabs.client.request.IngestKey();
        com.brightcove.castlabs.client.request.IngestKey ingestKey49 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey49.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType52 = null;
        ingestKey49.setAlgorithm(algorithmType52);
        com.brightcove.castlabs.client.request.IngestKey[] ingestKeyArray54 = new com.brightcove.castlabs.client.request.IngestKey[] { ingestKey22, ingestKey27, ingestKey32, ingestKey36, ingestKey39, ingestKey44, ingestKey47, ingestKey48, ingestKey49 };
        java.util.ArrayList<com.brightcove.castlabs.client.request.IngestKey> ingestKeyList55 = new java.util.ArrayList<com.brightcove.castlabs.client.request.IngestKey>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.request.IngestKey>) ingestKeyList55, ingestKeyArray54);
        assetRequest18.setIngestKeys((java.util.List<com.brightcove.castlabs.client.request.IngestKey>) ingestKeyList55);
        com.brightcove.castlabs.client.request.AssetRequest assetRequest58 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str59 = assetRequest58.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest60 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str61 = assetRequest60.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest62 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType63 = com.brightcove.castlabs.client.request.AssetType.CENC;
        assetRequest62.setType(assetType63);
        com.brightcove.castlabs.client.request.AssetType assetType65 = assetRequest62.getType();
        com.brightcove.castlabs.client.request.AssetRequest[] assetRequestArray66 = new com.brightcove.castlabs.client.request.AssetRequest[] { assetRequest1, assetRequest3, assetRequest7, assetRequest11, assetRequest13, assetRequest14, assetRequest18, assetRequest58, assetRequest60, assetRequest62 };
        java.util.ArrayList<com.brightcove.castlabs.client.request.AssetRequest> assetRequestList67 = new java.util.ArrayList<com.brightcove.castlabs.client.request.AssetRequest>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.request.AssetRequest>) assetRequestList67, assetRequestArray66);
        ingestKeysRequest0.setAssets((java.util.List<com.brightcove.castlabs.client.request.AssetRequest>) assetRequestList67);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + assetType4 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType4.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertTrue("'" + assetType6 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType6.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertTrue("'" + assetType8 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType8.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + assetType15 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType15.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertTrue("'" + assetType17 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType17.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertTrue("'" + assetType19 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType19.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(ingestKeyArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + assetType63 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType63.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertTrue("'" + assetType65 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType65.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertNotNull(assetRequestArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError1 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError2 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError3 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray4 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError1, ingestAssetError2, ingestAssetError3 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList5 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5, ingestAssetErrorArray4);
        assetResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5);
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse8 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse8.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse11 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse12 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse11.setCencResponse(ingestCENCResponse12);
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse14 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse15 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse15.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        com.brightcove.castlabs.client.response.IngestKeysResponse[] ingestKeysResponseArray18 = new com.brightcove.castlabs.client.response.IngestKeysResponse[] { ingestKeysResponse8, ingestKeysResponse11, ingestKeysResponse14, ingestKeysResponse15 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList19 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestKeysResponse>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList19, ingestKeysResponseArray18);
        assetResponse0.setKeys((java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList19);
        org.junit.Assert.assertTrue("'" + ingestAssetError1 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError1.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError2 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError2.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError3 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError3.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ingestKeysResponseArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("IngestKeysRequest [assets=[]]", "");
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse5 = castlabsClient2.addSubMerchantAccount(addSubMerchantAccountRequest3, "SharedSecretRequest{enabled='null', description='null', secret='null'}");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.brightcove.castlabs.client.response.DownloadKeysResponse> downloadKeysResponseList4 = castlabsClient2.downloadKeys("");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse1 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse0.setCencResponse(ingestCENCResponse1);
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetKeyError> ingestAssetKeyErrorList3 = ingestKeysResponse0.getErrors();
        org.junit.Assert.assertNotNull(ingestAssetKeyErrorList3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        java.lang.String str3 = ingestKeysResponse0.getKeyRotationId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestAssetsResponse [assets=[]]" + "'", str3, "IngestAssetsResponse [assets=[]]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse5 = castlabsClient2.addSubMerchantAccount(addSubMerchantAccountRequest3, "com.brightcove.castlabs.client.CastlabsException: ");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse0 = new com.brightcove.castlabs.client.response.ListAccountsResponse();
        java.util.List<com.brightcove.castlabs.client.response.Account> accountList1 = listAccountsResponse0.getAccounts();
        org.junit.Assert.assertNull(accountList1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse1 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse0.setCencResponse(ingestCENCResponse1);
        java.lang.String str3 = ingestKeysResponse0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]" + "'", str3, "IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.addSharedSecret(sharedSecretRequest3, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse0 = new com.brightcove.castlabs.client.response.ListAccountsResponse();
        com.brightcove.castlabs.client.response.Account account1 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str2 = account1.getLogin();
        java.lang.Boolean boolean3 = account1.getAPI();
        java.lang.String str4 = account1.getFirstName();
        com.brightcove.castlabs.client.response.Account account5 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str6 = account5.getLogin();
        java.lang.Boolean boolean7 = account5.getAPI();
        account5.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str10 = account5.getID();
        com.brightcove.castlabs.client.response.Account account11 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str12 = account11.getLogin();
        java.lang.Boolean boolean13 = account11.getAPI();
        java.lang.String str14 = account11.getFirstName();
        com.brightcove.castlabs.client.response.Account[] accountArray15 = new com.brightcove.castlabs.client.response.Account[] { account1, account5, account11 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.Account> accountList16 = new java.util.ArrayList<com.brightcove.castlabs.client.response.Account>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.Account>) accountList16, accountArray15);
        listAccountsResponse0.setAccounts((java.util.List<com.brightcove.castlabs.client.response.Account>) accountList16);
        java.lang.String str19 = listAccountsResponse0.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(accountArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}" + "'", str19, "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        java.lang.String str3 = sharedSecretRequest0.getSecret();
        java.lang.String str4 = sharedSecretRequest0.toString();
        java.lang.String str5 = sharedSecretRequest0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SharedSecretRequest{enabled='null', description='null', secret='hi!'}" + "'", str4, "SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SharedSecretRequest{enabled='null', description='null', secret='hi!'}" + "'", str5, "SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest3 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str4 = fairplayRequest3.getApplicationSecretKey();
        fairplayRequest3.setProviderCertificate("hi!");
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.setFairplayConfiguration(fairplayRequest3, "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        sharedSecretRequest0.setSecret("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.getCallbackUrl();
        updateAuthorizationSettingsRequest0.setMode("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("hi!");
        java.lang.String str2 = castlabsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.brightcove.castlabs.client.CastlabsException: hi!" + "'", str2, "com.brightcove.castlabs.client.CastlabsException: hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str1 = assetResponse0.getAssetId();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList2 = assetResponse0.getKeys();
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList3 = assetResponse0.getErrors();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(ingestKeysResponseList2);
        org.junit.Assert.assertNotNull(ingestAssetErrorList3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.brightcove.castlabs.client.response.DownloadKeysResponse> downloadKeysResponseList4 = castlabsClient2.downloadKeys("IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        ingestKey0.setKeyMetadata(strMap3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("IngestKeysRequest [assets=[]]", "");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest3 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        linkAccountToSubMerchantRequest3.setSubMerchantUuid("IngestKeysRequest [assets=[]]");
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.linkAccountToSubMerchant(linkAccountToSubMerchantRequest3, "SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.StreamType streamType3 = ingestKey0.getStreamType();
        org.junit.Assert.assertNull(streamType3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.auditChangedBy;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str1 = assetRequest0.getAssetId();
        java.util.List<com.brightcove.castlabs.client.request.IngestKey> ingestKeyList2 = assetRequest0.getIngestKeys();
        assetRequest0.setVariantId("com.brightcove.castlabs.client.CastlabsException: hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(ingestKeyList2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.CENC;
        assetRequest0.setType(assetType1);
        com.brightcove.castlabs.client.request.AssetType assetType3 = assetRequest0.getType();
        java.util.List<com.brightcove.castlabs.client.request.IngestKey> ingestKeyList4 = assetRequest0.getIngestKeys();
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertTrue("'" + assetType3 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType3.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertNotNull(ingestKeyList4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.ingestChannel = "IngestKeysRequest [assets=[]]";
        java.lang.String str7 = downloadKeysResponse0.getIngestRegion();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse0 = new com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse();
        addSubMerchantAccountResponse0.setSubMerchantUuid("");
        java.lang.String str3 = addSubMerchantAccountResponse0.getSubMerchantUuid();
        addSubMerchantAccountResponse0.setSubMerchantUuid("IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.lang.String str4 = ingestKey0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]" + "'", str4, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest0.setType(assetType1);
        assetRequest0.setAssetId("IngestAssetsResponse [assets=[]]");
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse4 = castlabsClient2.listAccounts("ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.setAuditChangedBy("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        account0.setAPI((java.lang.Boolean) true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("IngestKeysRequest [assets=[]]", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.brightcove.castlabs.client.response.DownloadKeysResponse> downloadKeysResponseList4 = castlabsClient2.downloadKeys("IngestAssetsResponse [assets=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.type = "IngestKeysRequest [assets=[]]";
        java.lang.String str8 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.setKeyRotationId("com.brightcove.castlabs.client.CastlabsException: ");
        downloadKeysResponse0.streamType = "hi!";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        linkAccountToSubMerchantRequest0.setSubMerchantUuid("IngestKeysRequest [assets=[]]");
        java.lang.String str3 = linkAccountToSubMerchantRequest0.getSubMerchantUuid();
        java.util.List<java.lang.String> strList4 = linkAccountToSubMerchantRequest0.getAccountUuids();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str3, "IngestKeysRequest [assets=[]]");
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        java.lang.String str3 = sharedSecretRequest0.getSecret();
        java.lang.String str4 = sharedSecretRequest0.toString();
        sharedSecretRequest0.setDescription("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SharedSecretRequest{enabled='null', description='null', secret='hi!'}" + "'", str4, "SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        com.brightcove.castlabs.client.CastlabsException castlabsException2 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException4 = new com.brightcove.castlabs.client.CastlabsException("hi!");
        castlabsException2.addSuppressed((java.lang.Throwable) castlabsException4);
        com.brightcove.castlabs.client.CastlabsException castlabsException6 = new com.brightcove.castlabs.client.CastlabsException("com.brightcove.castlabs.client.CastlabsException: hi!", (java.lang.Throwable) castlabsException2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        com.brightcove.castlabs.client.request.IngestKey ingestKey4 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str5 = ingestKey4.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        ingestKey4.setKeyMetadata(strMap6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = ingestKey4.getKeyMetadata();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType9 = com.brightcove.castlabs.client.request.AlgorithmType.AES;
        ingestKey4.setAlgorithm(algorithmType9);
        ingestKey0.setAlgorithm(algorithmType9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + algorithmType9 + "' != '" + com.brightcove.castlabs.client.request.AlgorithmType.AES + "'", algorithmType9.equals(com.brightcove.castlabs.client.request.AlgorithmType.AES));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse3 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse4 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse3.setCencResponse(ingestCENCResponse4);
        ingestKeysResponse0.setCencResponse(ingestCENCResponse4);
        java.lang.String str7 = ingestKeysResponse0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]" + "'", str7, "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        ingestKey0.setWvAssetId("IngestCENCResponse [systemId=null]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        downloadKeysResponse0.setUuid("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        java.lang.Class<?> wildcardClass8 = downloadKeysResponse0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        java.lang.String str3 = sharedSecretRequest0.getSecret();
        sharedSecretRequest0.setDescription("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.ingestChannel;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        updateAuthorizationSettingsRequest0.setCallbackUrl("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
        updateAuthorizationSettingsRequest0.setMode("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("");
        sharedSecretRequest0.setSecret("");
        java.lang.String str5 = sharedSecretRequest0.getDescription();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        java.lang.String str3 = ingestKeysResponse0.toString();
        ingestKeysResponse0.setKeyId("IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        java.lang.String str6 = ingestKeysResponse0.getKeyRotationId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]" + "'", str3, "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IngestAssetsResponse [assets=[]]" + "'", str6, "IngestAssetsResponse [assets=[]]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        downloadKeysResponse0.setUuid("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        java.lang.String str6 = downloadKeysResponse0.getAuditChangedBy();
        downloadKeysResponse0.keyId = "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.String str2 = account0.getLogin();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException3 = new com.brightcove.castlabs.client.CastlabsException("hi!");
        castlabsException1.addSuppressed((java.lang.Throwable) castlabsException3);
        java.lang.String str5 = castlabsException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.brightcove.castlabs.client.CastlabsException: " + "'", str5, "com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest3 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str4 = updateAuthorizationSettingsRequest3.getCallbackUrl();
        updateAuthorizationSettingsRequest3.setMode("IngestKeysRequest [assets=[]]");
        java.lang.String str7 = updateAuthorizationSettingsRequest3.getCallbackUrl();
        updateAuthorizationSettingsRequest3.setCallbackUrl("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        java.lang.String str10 = updateAuthorizationSettingsRequest3.getMode();
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.updateAuthorizationSettings(updateAuthorizationSettingsRequest3, "IngestAssetsResponse [assets=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str10, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        java.lang.String str3 = ingestKeysResponse0.getKeyRotationId();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse4 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse4.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse7 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse8 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse7.setCencResponse(ingestCENCResponse8);
        ingestKeysResponse4.setCencResponse(ingestCENCResponse8);
        ingestKeysResponse0.setCencResponse(ingestCENCResponse8);
        java.lang.String str12 = ingestKeysResponse0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]" + "'", str12, "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetKeyError> ingestAssetKeyErrorList1 = ingestKeysResponse0.getErrors();
        org.junit.Assert.assertNotNull(ingestAssetKeyErrorList1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        linkAccountToSubMerchantRequest0.setSubMerchantUuid("IngestKeysRequest [assets=[]]");
        linkAccountToSubMerchantRequest0.setSubMerchantUuid("IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.keyRotationId = "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]";
        java.lang.String str8 = downloadKeysResponse0.toString();
        downloadKeysResponse0.ingestChannel = "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='null', assetId='null', variantId='null', keyRotationId='IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]', ingestChannel='null', ingestRegion='null', auditChanged='IngestKeysRequest [assets=[]]', auditChangedBy='null'}" + "'", str8, "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='null', assetId='null', variantId='null', keyRotationId='IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]', ingestChannel='null', ingestRegion='null', auditChanged='IngestKeysRequest [assets=[]]', auditChangedBy='null'}");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList1 = assetResponse0.getKeys();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList2 = assetResponse0.getKeys();
        java.lang.String str3 = assetResponse0.toString();
        org.junit.Assert.assertNotNull(ingestKeysResponseList1);
        org.junit.Assert.assertNotNull(ingestKeysResponseList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Asset [assetId=null, keys=[], errors=[]]" + "'", str3, "Asset [assetId=null, keys=[], errors=[]]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.setVariantId("Asset [assetId=null, keys=[], errors=[]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.lang.String str2 = ingestKey0.getWvAssetId();
        ingestKey0.setKey("hi!");
        java.lang.String str5 = ingestKey0.getKeyId();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = ingestKey0.getKeyMetadata();
        ingestKey0.setWvAssetId("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.lang.String str2 = ingestKey0.getWvAssetId();
        java.lang.String str3 = ingestKey0.getIv();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.setStreamType("IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.streamType = "hi!";
        java.lang.String str3 = downloadKeysResponse0.ingestChannel;
        java.lang.String str4 = downloadKeysResponse0.getVariantId();
        java.lang.String str5 = downloadKeysResponse0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}" + "'", str5, "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError1 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError2 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError3 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray4 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError1, ingestAssetError2, ingestAssetError3 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList5 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5, ingestAssetErrorArray4);
        assetResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5);
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList8 = assetResponse0.getKeys();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList9 = assetResponse0.getKeys();
        org.junit.Assert.assertTrue("'" + ingestAssetError1 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError1.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError2 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError2.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError3 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError3.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ingestKeysResponseList8);
        org.junit.Assert.assertNotNull(ingestKeysResponseList9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        java.lang.String str3 = ingestKeysResponse0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=null, errors=[]]" + "'", str3, "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=null, errors=[]]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.keyRotationId = "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]";
        java.lang.String str8 = downloadKeysResponse0.toString();
        downloadKeysResponse0.setVariantId("IngestKeysRequest [assets=[]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='null', assetId='null', variantId='null', keyRotationId='IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]', ingestChannel='null', ingestRegion='null', auditChanged='IngestKeysRequest [assets=[]]', auditChangedBy='null'}" + "'", str8, "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='null', assetId='null', variantId='null', keyRotationId='IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]', ingestChannel='null', ingestRegion='null', auditChanged='IngestKeysRequest [assets=[]]', auditChangedBy='null'}");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.streamType = "hi!";
        java.lang.String str3 = downloadKeysResponse0.ingestChannel;
        downloadKeysResponse0.ingestChannel = "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.toString();
        java.lang.String str2 = updateAuthorizationSettingsRequest0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}" + "'", str1, "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}" + "'", str2, "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.setIngestRegion("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str8 = downloadKeysResponse0.getStreamType();
        java.lang.String str9 = downloadKeysResponse0.getVariantId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        java.lang.String str2 = fairplayRequest0.getApplicationSecretKey();
        java.lang.String str3 = fairplayRequest0.getProviderCertificate();
        fairplayRequest0.setProviderCertificate("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        java.lang.String str8 = downloadKeysResponse0.assetId;
        java.lang.String str9 = downloadKeysResponse0.ingestRegion;
        downloadKeysResponse0.setAuditChanged("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        fairplayRequest0.setProviderCertificate("IngestKeysRequest [assets=[]]");
        fairplayRequest0.setApplicationSecretKey("Asset [assetId=null, keys=[], errors=[]]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        java.lang.String str1 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str2 = linkAccountToSubMerchantRequest0.toString();
        java.util.List<java.lang.String> strList3 = linkAccountToSubMerchantRequest0.getAccountUuids();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str1, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str2, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertNull(strList3);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.lang.String str2 = ingestKey0.getWvAssetId();
        ingestKey0.setKey("hi!");
        java.lang.String str5 = ingestKey0.getKeyId();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType6 = com.brightcove.castlabs.client.request.AlgorithmType.AES_KEYSEED;
        ingestKey0.setAlgorithm(algorithmType6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + algorithmType6 + "' != '" + com.brightcove.castlabs.client.request.AlgorithmType.AES_KEYSEED + "'", algorithmType6.equals(com.brightcove.castlabs.client.request.AlgorithmType.AES_KEYSEED));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        linkAccountToSubMerchantRequest0.setSubMerchantUuid("IngestKeysRequest [assets=[]]");
        java.lang.String str3 = linkAccountToSubMerchantRequest0.getSubMerchantUuid();
        linkAccountToSubMerchantRequest0.setSubMerchantUuid("DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str3, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("IngestKeysRequest [assets=[]]", "");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest3 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str4 = fairplayRequest3.getApplicationSecretKey();
        fairplayRequest3.setProviderCertificate("IngestKeysRequest [assets=[]]");
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.setFairplayConfiguration(fairplayRequest3, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList1 = assetResponse0.getKeys();
        java.lang.String str2 = assetResponse0.toString();
        org.junit.Assert.assertNotNull(ingestKeysResponseList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asset [assetId=null, keys=[], errors=[]]" + "'", str2, "Asset [assetId=null, keys=[], errors=[]]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str1 = assetRequest0.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest2 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType3 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest2.setType(assetType3);
        assetRequest0.setType(assetType3);
        com.brightcove.castlabs.client.request.AssetRequest assetRequest6 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType7 = com.brightcove.castlabs.client.request.AssetType.CENC;
        assetRequest6.setType(assetType7);
        com.brightcove.castlabs.client.request.AssetType assetType9 = assetRequest6.getType();
        assetRequest0.setType(assetType9);
        java.lang.String str11 = assetRequest0.getAssetId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + assetType3 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType3.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertTrue("'" + assetType7 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType7.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertTrue("'" + assetType9 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType9.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.brightcove.castlabs.client.response.DownloadKeysResponse> downloadKeysResponseList4 = castlabsClient2.downloadKeys("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        java.lang.String str2 = fairplayRequest0.getApplicationSecretKey();
        java.lang.String str3 = fairplayRequest0.getProviderCertificate();
        fairplayRequest0.setProviderCertificate("IngestKeysRequest [assets=[]]");
        fairplayRequest0.setProviderPrivateKey("IngestAssetsResponse [assets=[]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType3 = null;
        ingestKey0.setAlgorithm(algorithmType3);
        com.brightcove.castlabs.client.request.StreamType streamType5 = com.brightcove.castlabs.client.request.StreamType.AUDIO;
        ingestKey0.setStreamType(streamType5);
        org.junit.Assert.assertTrue("'" + streamType5 + "' != '" + com.brightcove.castlabs.client.request.StreamType.AUDIO + "'", streamType5.equals(com.brightcove.castlabs.client.request.StreamType.AUDIO));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getType();
        java.lang.String str8 = downloadKeysResponse0.getStreamType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getAuditChangedBy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.lang.String str2 = ingestKey0.getKeyRotationId();
        java.lang.String str3 = ingestKey0.toString();
        java.lang.String str4 = ingestKey0.getWvAssetId();
        java.lang.String str5 = ingestKey0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]" + "'", str3, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]" + "'", str5, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        java.lang.String str3 = ingestKeysResponse0.toString();
        ingestKeysResponse0.setKeyId("IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetKeyError> ingestAssetKeyErrorList6 = ingestKeysResponse0.getErrors();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]" + "'", str3, "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
        org.junit.Assert.assertNotNull(ingestAssetKeyErrorList6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.CENC;
        assetRequest0.setType(assetType1);
        com.brightcove.castlabs.client.request.AssetType assetType3 = assetRequest0.getType();
        java.lang.String str4 = assetRequest0.getVariantId();
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertTrue("'" + assetType3 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType3.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        java.lang.String str8 = downloadKeysResponse0.assetId;
        java.lang.String str9 = downloadKeysResponse0.ingestRegion;
        java.lang.String str10 = downloadKeysResponse0.keyRotationId;
        downloadKeysResponse0.setAuditChanged("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.setUuid("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str8 = downloadKeysResponse0.keyId;
        java.lang.String str9 = downloadKeysResponse0.getVariantId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        java.lang.String str8 = downloadKeysResponse0.assetId;
        java.lang.String str9 = downloadKeysResponse0.ingestRegion;
        java.lang.String str10 = downloadKeysResponse0.keyRotationId;
        downloadKeysResponse0.keyRotationId = "IngestAssetsResponse [assets=[]]";
        downloadKeysResponse0.setKeyRotationId("LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        java.lang.String str3 = ingestKey0.getWvAssetId();
        java.lang.String str4 = ingestKey0.getKeyId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.setKeyRotationId("com.brightcove.castlabs.client.CastlabsException: ");
        downloadKeysResponse0.setIngestChannel("Asset [assetId=null, keys=[], errors=[]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = ingestKey0.getKeyMetadata();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType5 = com.brightcove.castlabs.client.request.AlgorithmType.AES;
        ingestKey0.setAlgorithm(algorithmType5);
        java.lang.String str7 = ingestKey0.getKeyId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + algorithmType5 + "' != '" + com.brightcove.castlabs.client.request.AlgorithmType.AES + "'", algorithmType5.equals(com.brightcove.castlabs.client.request.AlgorithmType.AES));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("IngestKeysRequest [assets=[]]", "");
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse4 = castlabsClient2.listAccounts("");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str5 = account0.getID();
        java.lang.String str6 = account0.getLastName();
        account0.setEnabled((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.brightcove.castlabs.client.CastlabsException castlabsException2 = new com.brightcove.castlabs.client.CastlabsException("hi!");
        com.brightcove.castlabs.client.CastlabsException castlabsException4 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException6 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException4.addSuppressed((java.lang.Throwable) castlabsException6);
        castlabsException2.addSuppressed((java.lang.Throwable) castlabsException6);
        com.brightcove.castlabs.client.CastlabsException castlabsException9 = new com.brightcove.castlabs.client.CastlabsException("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]", (java.lang.Throwable) castlabsException2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.type = "IngestKeysRequest [assets=[]]";
        java.lang.String str8 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.setKeyRotationId("com.brightcove.castlabs.client.CastlabsException: ");
        java.lang.String str11 = downloadKeysResponse0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DownloadKeysResponse{uuid='null', type='IngestKeysRequest [assets=[]]', keyId='null', streamType='null', assetId='', variantId='hi!', keyRotationId='com.brightcove.castlabs.client.CastlabsException: ', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}" + "'", str11, "DownloadKeysResponse{uuid='null', type='IngestKeysRequest [assets=[]]', keyId='null', streamType='null', assetId='', variantId='hi!', keyRotationId='com.brightcove.castlabs.client.CastlabsException: ', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("");
        sharedSecretRequest0.setDescription("hi!");
        java.lang.String str5 = sharedSecretRequest0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SharedSecretRequest{enabled='null', description='hi!', secret=''}" + "'", str5, "SharedSecretRequest{enabled='null', description='hi!', secret=''}");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        java.lang.String str2 = fairplayRequest0.getProviderPrivateKey();
        java.lang.String str3 = fairplayRequest0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}" + "'", str3, "FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse0 = new com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse();
        java.lang.String str1 = addSubMerchantAccountResponse0.getSubMerchantUuid();
        addSubMerchantAccountResponse0.setSubMerchantUuid("com.brightcove.castlabs.client.CastlabsException: ");
        java.lang.String str4 = addSubMerchantAccountResponse0.getSubMerchantUuid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "com.brightcove.castlabs.client.CastlabsException: " + "'", str4, "com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        java.lang.String str1 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str2 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str3 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str4 = linkAccountToSubMerchantRequest0.getSubMerchantUuid();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str1, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str2, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str3, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        downloadKeysResponse0.setUuid("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        downloadKeysResponse0.setVariantId("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        downloadKeysResponse0.auditChangedBy = "SharedSecretRequest{enabled='null', description='null', secret='hi!'}";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.lang.String str4 = ingestKey0.getKey();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}", "SharedSecretRequest{enabled='null', description='null', secret='null'}");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.brightcove.castlabs.client.response.DownloadKeysResponse> downloadKeysResponseList4 = castlabsClient2.downloadKeys("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse4 = castlabsClient2.listAccounts("IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.setAuditChanged("IngestCENCResponse [systemId=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.brightcove.castlabs.client.response.IngestAssetsResponse ingestAssetsResponse0 = new com.brightcove.castlabs.client.response.IngestAssetsResponse();
        java.lang.String str1 = ingestAssetsResponse0.toString();
        java.lang.String str2 = ingestAssetsResponse0.toString();
        java.util.List<com.brightcove.castlabs.client.response.AssetResponse> assetResponseList3 = ingestAssetsResponse0.getAssets();
        java.util.List<com.brightcove.castlabs.client.response.AssetResponse> assetResponseList4 = ingestAssetsResponse0.getAssets();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IngestAssetsResponse [assets=[]]" + "'", str1, "IngestAssetsResponse [assets=[]]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IngestAssetsResponse [assets=[]]" + "'", str2, "IngestAssetsResponse [assets=[]]");
        org.junit.Assert.assertNotNull(assetResponseList3);
        org.junit.Assert.assertNotNull(assetResponseList4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_IV;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_IV + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_IV));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("");
        sharedSecretRequest0.setDescription("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.streamType = "IngestAssetsResponse [assets=[]]";
        downloadKeysResponse0.variantId = "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = ingestKey0.getKeyMetadata();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType5 = com.brightcove.castlabs.client.request.AlgorithmType.AES;
        ingestKey0.setAlgorithm(algorithmType5);
        java.lang.String str7 = ingestKey0.toString();
        ingestKey0.setKeyRotationId("DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + algorithmType5 + "' != '" + com.brightcove.castlabs.client.request.AlgorithmType.AES + "'", algorithmType5.equals(com.brightcove.castlabs.client.request.AlgorithmType.AES));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]" + "'", str7, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.type = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.uuid = "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}";
        java.lang.String str10 = downloadKeysResponse0.variantId;
        downloadKeysResponse0.ingestRegion = "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        account0.setLogin("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.lang.String str2 = ingestKey0.getWvAssetId();
        ingestKey0.setKey("hi!");
        java.lang.String str5 = ingestKey0.getKeyId();
        ingestKey0.setIv("SharedSecretRequest{enabled='null', description='hi!', secret=''}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient5 = new com.brightcove.castlabs.client.CastlabsClient("Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]", "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}", "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}", "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse7 = castlabsClient5.listAccounts("AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 34: UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}/cas/v1/tickets");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.setKeyRotationId("com.brightcove.castlabs.client.CastlabsException: ");
        java.lang.String str8 = downloadKeysResponse0.getUuid();
        java.lang.String str9 = downloadKeysResponse0.getAssetId();
        java.lang.String str10 = downloadKeysResponse0.auditChanged;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str10, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str1 = assetResponse0.getAssetId();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList2 = assetResponse0.getKeys();
        java.lang.String str3 = assetResponse0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(ingestKeysResponseList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Asset [assetId=null, keys=[], errors=[]]" + "'", str3, "Asset [assetId=null, keys=[], errors=[]]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        downloadKeysResponse0.setAssetId("hi!");
        downloadKeysResponse0.keyId = "com.brightcove.castlabs.client.CastlabsException: ";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest0.setType(assetType1);
        java.lang.String str3 = assetRequest0.getAssetId();
        com.brightcove.castlabs.client.request.AssetType assetType4 = assetRequest0.getType();
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + assetType4 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType4.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        java.lang.String str3 = sharedSecretRequest0.getSecret();
        java.lang.String str4 = sharedSecretRequest0.toString();
        sharedSecretRequest0.setDescription("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SharedSecretRequest{enabled='null', description='null', secret='hi!'}" + "'", str4, "SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.auditChanged;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.streamType = "hi!";
        java.lang.String str3 = downloadKeysResponse0.ingestChannel;
        downloadKeysResponse0.keyId = "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse0 = new com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse();
        java.lang.String str1 = addSubMerchantAccountResponse0.getSubMerchantUuid();
        java.lang.String str2 = addSubMerchantAccountResponse0.getSubMerchantUuid();
        addSubMerchantAccountResponse0.setSubMerchantUuid("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.lang.String str2 = ingestKey0.getWvAssetId();
        java.lang.String str3 = ingestKey0.toString();
        java.lang.String str4 = ingestKey0.getKeyId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]" + "'", str3, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        account0.setEnabled((java.lang.Boolean) false);
        java.lang.String str3 = account0.getLogin();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("IngestKeysRequest [assets=[]]");
        java.lang.String str2 = castlabsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.brightcove.castlabs.client.CastlabsException: IngestKeysRequest [assets=[]]" + "'", str2, "com.brightcove.castlabs.client.CastlabsException: IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}" + "'", str1, "Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("");
        sharedSecretRequest0.setDescription("hi!");
        sharedSecretRequest0.setEnabled((java.lang.Boolean) false);
        sharedSecretRequest0.setEnabled((java.lang.Boolean) false);
        java.lang.String str9 = sharedSecretRequest0.getDescription();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str1 = assetResponse0.getAssetId();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList2 = assetResponse0.getKeys();
        com.brightcove.castlabs.client.response.AssetResponse assetResponse3 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError4 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError5 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError6 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray7 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError4, ingestAssetError5, ingestAssetError6 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList8 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList8, ingestAssetErrorArray7);
        assetResponse3.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList8);
        assetResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(ingestKeysResponseList2);
        org.junit.Assert.assertTrue("'" + ingestAssetError4 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError4.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError5 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError5.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError6 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError6.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        downloadKeysResponse0.variantId = "";
        downloadKeysResponse0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        downloadKeysResponse0.keyId = "FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}";
        java.lang.String str12 = downloadKeysResponse0.getStreamType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.setKeyRotationId("com.brightcove.castlabs.client.CastlabsException: ");
        downloadKeysResponse0.variantId = "Asset [assetId=null, keys=[], errors=[]]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getType();
        java.lang.String str8 = downloadKeysResponse0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str5 = account0.getID();
        java.lang.String str6 = account0.getLastName();
        account0.setLastName("ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.keyRotationId;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        fairplayRequest0.setProviderCertificate("hi!");
        fairplayRequest0.setApplicationSecretKey("");
        java.lang.String str6 = fairplayRequest0.getProviderPrivateKey();
        java.lang.String str7 = fairplayRequest0.getProviderCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.CENC;
        assetRequest0.setType(assetType1);
        com.brightcove.castlabs.client.request.AssetType assetType3 = assetRequest0.getType();
        assetRequest0.setVariantId("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        java.lang.String str6 = assetRequest0.getAssetId();
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertTrue("'" + assetType3 + "' != '" + com.brightcove.castlabs.client.request.AssetType.CENC + "'", assetType3.equals(com.brightcove.castlabs.client.request.AssetType.CENC));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str5 = account0.getID();
        java.lang.String str6 = account0.getLastName();
        java.lang.Boolean boolean7 = account0.getEnabled();
        java.lang.Boolean boolean8 = account0.getAPI();
        java.lang.String str9 = account0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}" + "'", str9, "Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setID("hi!");
        account0.setEnabled((java.lang.Boolean) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        fairplayRequest0.setProviderCertificate("hi!");
        java.lang.String str4 = fairplayRequest0.getProviderCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.setUuid("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str8 = downloadKeysResponse0.keyId;
        java.lang.String str9 = downloadKeysResponse0.auditChanged;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.brightcove.castlabs.client.request.StreamType streamType0 = com.brightcove.castlabs.client.request.StreamType.VIDEO_AUDIO;
        org.junit.Assert.assertTrue("'" + streamType0 + "' != '" + com.brightcove.castlabs.client.request.StreamType.VIDEO_AUDIO + "'", streamType0.equals(com.brightcove.castlabs.client.request.StreamType.VIDEO_AUDIO));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        java.lang.String str6 = downloadKeysResponse0.variantId;
        downloadKeysResponse0.setUuid("AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest3 = new com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest();
        java.lang.String str4 = addSubMerchantAccountRequest3.toString();
        java.lang.String str5 = addSubMerchantAccountRequest3.getApiNameSuffix();
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse7 = castlabsClient2.addSubMerchantAccount(addSubMerchantAccountRequest3, "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}" + "'", str4, "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str1 = assetResponse0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Asset [assetId=null, keys=[], errors=[]]" + "'", str1, "Asset [assetId=null, keys=[], errors=[]]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        java.lang.String str2 = fairplayRequest0.getProviderPrivateKey();
        java.lang.String str3 = fairplayRequest0.getProviderCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.getStreamType();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.type = "IngestKeysRequest [assets=[]]";
        java.lang.String str8 = downloadKeysResponse0.getAuditChanged();
        java.lang.String str9 = downloadKeysResponse0.keyRotationId;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("");
        java.lang.String str3 = sharedSecretRequest0.getDescription();
        java.lang.String str4 = sharedSecretRequest0.getSecret();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        downloadKeysResponse0.setUuid("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        downloadKeysResponse0.keyId = "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}";
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient5 = new com.brightcove.castlabs.client.CastlabsClient("SharedSecretRequest{enabled='null', description='null', secret='null'}", "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}", "hi!", "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}", 1);
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest6 = new com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest();
        java.lang.String str7 = addSubMerchantAccountRequest6.toString();
        java.lang.String str8 = addSubMerchantAccountRequest6.getLinkedUserUuid();
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.AddSubMerchantAccountResponse addSubMerchantAccountResponse10 = castlabsClient5.addSubMerchantAccount(addSubMerchantAccountRequest6, "SharedSecretRequest{enabled='null', description='null', secret='null'}");
            org.junit.Assert.fail("Expected exception of type org.apache.http.client.ClientProtocolException; message: null");
        } catch (org.apache.http.client.ClientProtocolException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}" + "'", str7, "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setSecret("hi!");
        java.lang.String str3 = sharedSecretRequest0.getSecret();
        java.lang.String str4 = sharedSecretRequest0.toString();
        sharedSecretRequest0.setDescription("FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}");
        java.lang.String str7 = sharedSecretRequest0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SharedSecretRequest{enabled='null', description='null', secret='hi!'}" + "'", str4, "SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SharedSecretRequest{enabled='null', description='FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}', secret='hi!'}" + "'", str7, "SharedSecretRequest{enabled='null', description='FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}', secret='hi!'}");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        linkAccountToSubMerchantRequest0.setSubMerchantUuid("IngestKeysRequest [assets=[]]");
        java.lang.String[] strArray25 = new java.lang.String[] { "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]", "com.brightcove.castlabs.client.CastlabsException: hi!", "SharedSecretRequest{enabled='null', description='hi!', secret=''}", "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]", "SharedSecretRequest{enabled='null', description='null', secret='hi!'}", "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]", "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}", "SharedSecretRequest{enabled='null', description='hi!', secret=''}", "Asset [assetId=null, keys=[], errors=[]]", "Asset [assetId=null, keys=[], errors=[]]", "IngestAssetsResponse [assets=[]]", "com.brightcove.castlabs.client.CastlabsException: ", "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]", "IngestKeysRequest [assets=[]]", "Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}", "", "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]", "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]", "DownloadKeysResponse{uuid='null', type='IngestKeysRequest [assets=[]]', keyId='null', streamType='null', assetId='', variantId='hi!', keyRotationId='com.brightcove.castlabs.client.CastlabsException: ', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}", "IngestCENCResponse [systemId=null]", "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}", "IngestAssetsResponse [assets=[]]" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        linkAccountToSubMerchantRequest0.setAccountUuids((java.util.List<java.lang.String>) strList26);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError0 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_WIDEVINE_ASSET_ID;
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError0 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_WIDEVINE_ASSET_ID + "'", ingestAssetKeyError0.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_WIDEVINE_ASSET_ID));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.keyId = "IngestKeysResponse [keyId=null, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse3 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        java.util.Map<java.lang.String, com.brightcove.castlabs.client.response.IngestCENCProtectionDetails> strMap4 = null;
        ingestCENCResponse3.setSystemId(strMap4);
        java.lang.String str6 = ingestCENCResponse3.toString();
        ingestKeysResponse0.setCencResponse(ingestCENCResponse3);
        ingestKeysResponse0.setKeyRotationId("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        java.lang.String str10 = ingestKeysResponse0.getKeyRotationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IngestCENCResponse [systemId=null]" + "'", str6, "IngestCENCResponse [systemId=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}" + "'", str10, "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.type = "IngestKeysRequest [assets=[]]";
        java.lang.String str8 = downloadKeysResponse0.getType();
        downloadKeysResponse0.setIngestChannel("IngestAssetsResponse [assets=[]]");
        downloadKeysResponse0.setIngestRegion("DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}");
        java.lang.String str13 = downloadKeysResponse0.getType();
        java.lang.String str14 = downloadKeysResponse0.getKeyRotationId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str8, "IngestKeysRequest [assets=[]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str13, "IngestKeysRequest [assets=[]]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getID();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        java.lang.String str1 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str2 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str3 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str4 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str5 = linkAccountToSubMerchantRequest0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str1, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str2, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str3, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str4, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str5, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        fairplayRequest0.setProviderCertificate("IngestKeysRequest [assets=[]]");
        java.lang.String str4 = fairplayRequest0.getProviderCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str4, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        java.lang.String str3 = ingestKeysResponse0.toString();
        ingestKeysResponse0.setKeyRotationId("IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]" + "'", str3, "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = ingestKey0.getKeyMetadata();
        java.lang.String str5 = ingestKey0.getKeyId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.getCallbackUrl();
        updateAuthorizationSettingsRequest0.setMode("IngestKeysRequest [assets=[]]");
        java.lang.String str4 = updateAuthorizationSettingsRequest0.getCallbackUrl();
        updateAuthorizationSettingsRequest0.setCallbackUrl("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        java.lang.String str7 = updateAuthorizationSettingsRequest0.getMode();
        updateAuthorizationSettingsRequest0.setMode("");
        updateAuthorizationSettingsRequest0.setCallbackUrl("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str7, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.keyRotationId;
        downloadKeysResponse0.setIngestChannel("SharedSecretRequest{enabled='null', description='hi!', secret=''}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        java.lang.String str5 = downloadKeysResponse0.auditChanged;
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest0.setType(assetType1);
        java.lang.String str3 = assetRequest0.toString();
        java.lang.String str4 = assetRequest0.getAssetId();
        java.util.List<com.brightcove.castlabs.client.request.IngestKey> ingestKeyList5 = assetRequest0.getIngestKeys();
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]" + "'", str3, "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(ingestKeyList5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient5 = new com.brightcove.castlabs.client.CastlabsClient("Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]", "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}", "UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}", "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]", (int) (byte) 1);
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest6 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        updateAuthorizationSettingsRequest6.setCallbackUrl("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
        java.lang.String str9 = updateAuthorizationSettingsRequest6.getCallbackUrl();
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient5.updateAuthorizationSettings(updateAuthorizationSettingsRequest6, "SharedSecretRequest{enabled='null', description='FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}', secret='hi!'}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 34: UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}/cas/v1/tickets");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]" + "'", str9, "IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = ingestKey0.getKeyMetadata();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType5 = com.brightcove.castlabs.client.request.AlgorithmType.AES;
        ingestKey0.setAlgorithm(algorithmType5);
        com.brightcove.castlabs.client.request.StreamType streamType7 = ingestKey0.getStreamType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + algorithmType5 + "' != '" + com.brightcove.castlabs.client.request.AlgorithmType.AES + "'", algorithmType5.equals(com.brightcove.castlabs.client.request.AlgorithmType.AES));
        org.junit.Assert.assertNull(streamType7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str5 = account0.getID();
        java.util.List<java.lang.String> strList6 = account0.getPermissions();
        java.lang.String[] strArray9 = new java.lang.String[] { "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]", "IngestKeysRequest [assets=[]]" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        account0.setPermissions((java.util.List<java.lang.String>) strList10);
        java.util.List<java.lang.String> strList13 = account0.getPermissions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType4 = ingestKey0.getAlgorithm();
        com.brightcove.castlabs.client.request.StreamType streamType5 = com.brightcove.castlabs.client.request.StreamType.VIDEO;
        ingestKey0.setStreamType(streamType5);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(algorithmType4);
        org.junit.Assert.assertTrue("'" + streamType5 + "' != '" + com.brightcove.castlabs.client.request.StreamType.VIDEO + "'", streamType5.equals(com.brightcove.castlabs.client.request.StreamType.VIDEO));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        java.lang.String str8 = downloadKeysResponse0.assetId;
        java.lang.String str9 = downloadKeysResponse0.getAuditChangedBy();
        downloadKeysResponse0.assetId = "AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        downloadKeysResponse0.setKeyRotationId("com.brightcove.castlabs.client.CastlabsException: ");
        java.lang.String str8 = downloadKeysResponse0.getUuid();
        downloadKeysResponse0.setAuditChanged("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest3 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str4 = updateAuthorizationSettingsRequest3.getCallbackUrl();
        updateAuthorizationSettingsRequest3.setMode("IngestKeysRequest [assets=[]]");
        java.lang.String str7 = updateAuthorizationSettingsRequest3.getCallbackUrl();
        updateAuthorizationSettingsRequest3.setCallbackUrl("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient2.updateAuthorizationSettings(updateAuthorizationSettingsRequest3, "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        java.lang.String str1 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str2 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str3 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str4 = linkAccountToSubMerchantRequest0.toString();
        java.lang.String str5 = linkAccountToSubMerchantRequest0.getSubMerchantUuid();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str1, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str2, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str3, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str4, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getWvAssetId();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        ingestKey0.setKeyMetadata(strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = ingestKey0.getKeyMetadata();
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType5 = com.brightcove.castlabs.client.request.AlgorithmType.AES;
        ingestKey0.setAlgorithm(algorithmType5);
        ingestKey0.setIv("com.brightcove.castlabs.client.CastlabsException: IngestKeysRequest [assets=[]]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strMap4);
        org.junit.Assert.assertTrue("'" + algorithmType5 + "' != '" + com.brightcove.castlabs.client.request.AlgorithmType.AES + "'", algorithmType5.equals(com.brightcove.castlabs.client.request.AlgorithmType.AES));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setLogin("LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        account0.setAPI((java.lang.Boolean) true);
        java.lang.Boolean boolean7 = account0.getAPI();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + true + "'", boolean7, true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.brightcove.castlabs.client.CastlabsException castlabsException4 = new com.brightcove.castlabs.client.CastlabsException("hi!");
        com.brightcove.castlabs.client.CastlabsException castlabsException6 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException8 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException6.addSuppressed((java.lang.Throwable) castlabsException8);
        castlabsException4.addSuppressed((java.lang.Throwable) castlabsException8);
        com.brightcove.castlabs.client.CastlabsException castlabsException11 = new com.brightcove.castlabs.client.CastlabsException("hi!", (java.lang.Throwable) castlabsException8);
        com.brightcove.castlabs.client.CastlabsException castlabsException12 = new com.brightcove.castlabs.client.CastlabsException("IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]", (java.lang.Throwable) castlabsException8);
        java.lang.Throwable[] throwableArray13 = castlabsException8.getSuppressed();
        com.brightcove.castlabs.client.CastlabsException castlabsException14 = new com.brightcove.castlabs.client.CastlabsException("SharedSecretRequest{enabled='null', description='null', secret='null'}", (java.lang.Throwable) castlabsException8);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType3 = null;
        ingestKey0.setAlgorithm(algorithmType3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        ingestKey0.setKeyMetadata(strMap5);
        ingestKey0.setIv("UpdateAuthorizationSettingsRequest{mode='null', callbackUrl='null'}");
        java.lang.String str9 = ingestKey0.getKeyId();
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.brightcove.castlabs.client.request.IngestKeysRequest ingestKeysRequest0 = new com.brightcove.castlabs.client.request.IngestKeysRequest();
        java.util.List<com.brightcove.castlabs.client.request.AssetRequest> assetRequestList1 = ingestKeysRequest0.getAssets();
        java.lang.String str2 = ingestKeysRequest0.toString();
        org.junit.Assert.assertNotNull(assetRequestList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IngestKeysRequest [assets=[]]" + "'", str2, "IngestKeysRequest [assets=[]]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse3 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        java.util.Map<java.lang.String, com.brightcove.castlabs.client.response.IngestCENCProtectionDetails> strMap4 = null;
        ingestCENCResponse3.setSystemId(strMap4);
        java.lang.String str6 = ingestCENCResponse3.toString();
        ingestKeysResponse0.setCencResponse(ingestCENCResponse3);
        java.lang.String str8 = ingestCENCResponse3.toString();
        java.lang.String str9 = ingestCENCResponse3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IngestCENCResponse [systemId=null]" + "'", str6, "IngestCENCResponse [systemId=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IngestCENCResponse [systemId=null]" + "'", str8, "IngestCENCResponse [systemId=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IngestCENCResponse [systemId=null]" + "'", str9, "IngestCENCResponse [systemId=null]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        java.lang.String str3 = account0.getFirstName();
        java.lang.Boolean boolean4 = account0.getEnabled();
        java.lang.String str5 = account0.getFirstName();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='hi!', secret=''}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.getCallbackUrl();
        updateAuthorizationSettingsRequest0.setMode("IngestKeysRequest [assets=[]]");
        updateAuthorizationSettingsRequest0.setMode("Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.brightcove.castlabs.client.response.IngestAssetsResponse ingestAssetsResponse0 = new com.brightcove.castlabs.client.response.IngestAssetsResponse();
        java.util.List<com.brightcove.castlabs.client.response.AssetResponse> assetResponseList1 = ingestAssetsResponse0.getAssets();
        org.junit.Assert.assertNotNull(assetResponseList1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.brightcove.castlabs.client.CastlabsException castlabsException2 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException4 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException6 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException4.addSuppressed((java.lang.Throwable) castlabsException6);
        castlabsException2.addSuppressed((java.lang.Throwable) castlabsException4);
        com.brightcove.castlabs.client.CastlabsException castlabsException9 = new com.brightcove.castlabs.client.CastlabsException("ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}", (java.lang.Throwable) castlabsException2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        fairplayRequest0.setProviderCertificate("IngestKeysRequest [assets=[]]");
        java.lang.String str4 = fairplayRequest0.getProviderPrivateKey();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        java.lang.String str1 = ingestKey0.getKeyId();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        java.lang.String str5 = downloadKeysResponse0.auditChanged;
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.ingestRegion;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest0 = new com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest();
        java.lang.String str1 = addSubMerchantAccountRequest0.getApiNameSuffix();
        addSubMerchantAccountRequest0.setName("FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}");
        addSubMerchantAccountRequest0.setLinkedUserUuid("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata={}]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        java.lang.String str3 = ingestKeysResponse0.getKeyRotationId();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse4 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse4.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse7 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse8 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse7.setCencResponse(ingestCENCResponse8);
        ingestKeysResponse4.setCencResponse(ingestCENCResponse8);
        ingestKeysResponse0.setCencResponse(ingestCENCResponse8);
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError12 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_WIDEVINE_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError13 = com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY_ID;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError14 = com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError15 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError16 = com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError17 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError18 = com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError19 = com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_IV;
        com.brightcove.castlabs.client.response.IngestAssetKeyError ingestAssetKeyError20 = com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_ALGORITHM;
        com.brightcove.castlabs.client.response.IngestAssetKeyError[] ingestAssetKeyErrorArray21 = new com.brightcove.castlabs.client.response.IngestAssetKeyError[] { ingestAssetKeyError12, ingestAssetKeyError13, ingestAssetKeyError14, ingestAssetKeyError15, ingestAssetKeyError16, ingestAssetKeyError17, ingestAssetKeyError18, ingestAssetKeyError19, ingestAssetKeyError20 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetKeyError> ingestAssetKeyErrorList22 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetKeyError>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetKeyError>) ingestAssetKeyErrorList22, ingestAssetKeyErrorArray21);
        ingestKeysResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetKeyError>) ingestAssetKeyErrorList22);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError12 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_WIDEVINE_ASSET_ID + "'", ingestAssetKeyError12.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_WIDEVINE_ASSET_ID));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError13 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY_ID + "'", ingestAssetKeyError13.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY_ID));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError14 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY + "'", ingestAssetKeyError14.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError15 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID + "'", ingestAssetKeyError15.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError16 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY + "'", ingestAssetKeyError16.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.DUPLICATE_KEY));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError17 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID + "'", ingestAssetKeyError17.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_KEY_ID));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError18 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY + "'", ingestAssetKeyError18.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_KEY));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError19 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_IV + "'", ingestAssetKeyError19.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.MISSING_IV));
        org.junit.Assert.assertTrue("'" + ingestAssetKeyError20 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_ALGORITHM + "'", ingestAssetKeyError20.equals(com.brightcove.castlabs.client.response.IngestAssetKeyError.INVALID_ALGORITHM));
        org.junit.Assert.assertNotNull(ingestAssetKeyErrorArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.getMode();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError1 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError2 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError3 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray4 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError1, ingestAssetError2, ingestAssetError3 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList5 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5, ingestAssetErrorArray4);
        assetResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5);
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList8 = assetResponse0.getKeys();
        com.brightcove.castlabs.client.response.AssetResponse assetResponse9 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError10 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError11 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError12 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray13 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError10, ingestAssetError11, ingestAssetError12 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList14 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList14, ingestAssetErrorArray13);
        assetResponse9.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList14);
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList17 = assetResponse9.getErrors();
        assetResponse0.setErrors(ingestAssetErrorList17);
        org.junit.Assert.assertTrue("'" + ingestAssetError1 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError1.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError2 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError2.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError3 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError3.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ingestKeysResponseList8);
        org.junit.Assert.assertTrue("'" + ingestAssetError10 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError10.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError11 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError11.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError12 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError12.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(ingestAssetErrorList17);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        downloadKeysResponse0.variantId = "";
        downloadKeysResponse0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        downloadKeysResponse0.keyId = "FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}";
        downloadKeysResponse0.keyId = "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        java.lang.String str3 = ingestKey0.getWvAssetId();
        java.lang.String str4 = ingestKey0.getIv();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = ingestKey0.getKeyMetadata();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("IngestKeysRequest [assets=[]]", "");
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse4 = castlabsClient2.listAccounts("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=null, errors=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException3 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException5 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException3.addSuppressed((java.lang.Throwable) castlabsException5);
        castlabsException1.addSuppressed((java.lang.Throwable) castlabsException3);
        com.brightcove.castlabs.client.CastlabsException castlabsException9 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException1.addSuppressed((java.lang.Throwable) castlabsException9);
        java.lang.String str11 = castlabsException1.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "com.brightcove.castlabs.client.CastlabsException: " + "'", str11, "com.brightcove.castlabs.client.CastlabsException: ");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        downloadKeysResponse0.auditChanged = "IngestKeysRequest [assets=[]]";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.type;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getIngestChannel();
        java.lang.String str8 = downloadKeysResponse0.assetId;
        java.lang.String str9 = downloadKeysResponse0.ingestRegion;
        downloadKeysResponse0.uuid = "IngestCENCResponse [systemId=null]";
        downloadKeysResponse0.uuid = "IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]";
        java.lang.String str14 = downloadKeysResponse0.ingestChannel;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        java.lang.String str5 = downloadKeysResponse0.uuid;
        java.lang.String str6 = downloadKeysResponse0.getUuid();
        java.lang.String str7 = downloadKeysResponse0.getAuditChanged();
        downloadKeysResponse0.uuid = "IngestCENCResponse [systemId=null]";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest0 = new com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest();
        java.lang.String str1 = addSubMerchantAccountRequest0.getApiNameSuffix();
        java.lang.String str2 = addSubMerchantAccountRequest0.getLinkedUserUuid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str7 = downloadKeysResponse0.getAuditChanged();
        downloadKeysResponse0.setUuid("Asset [assetId=null, keys=[], errors=[]]");
        java.lang.String str10 = downloadKeysResponse0.getIngestRegion();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType1 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest0.setType(assetType1);
        java.lang.String str3 = assetRequest0.toString();
        java.lang.String str4 = assetRequest0.getAssetId();
        java.lang.String str5 = assetRequest0.toString();
        assetRequest0.setVariantId("SharedSecretRequest{enabled='null', description='FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}', secret='hi!'}");
        org.junit.Assert.assertTrue("'" + assetType1 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType1.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]" + "'", str3, "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]" + "'", str5, "Asset [type=FAIRPLAY, assetId=null, variantId=null, ingestKeys=[]]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.keyId;
        java.lang.String str2 = downloadKeysResponse0.getUuid();
        java.lang.String str3 = downloadKeysResponse0.getAssetId();
        downloadKeysResponse0.auditChanged = "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=null, errors=[]]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse1 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse0.setCencResponse(ingestCENCResponse1);
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse3 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse3.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse6 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse7 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse6.setCencResponse(ingestCENCResponse7);
        ingestKeysResponse3.setCencResponse(ingestCENCResponse7);
        java.util.Map<java.lang.String, com.brightcove.castlabs.client.response.IngestCENCProtectionDetails> strMap10 = ingestCENCResponse7.getSystemId();
        ingestCENCResponse1.setSystemId(strMap10);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getKeyRotationId();
        java.lang.String str5 = downloadKeysResponse0.getKeyId();
        java.lang.String str6 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.streamType = "IngestAssetsResponse [assets=[]]";
        downloadKeysResponse0.setAuditChangedBy("hi!");
        java.lang.String str11 = downloadKeysResponse0.ingestChannel;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse0 = new com.brightcove.castlabs.client.response.ListAccountsResponse();
        com.brightcove.castlabs.client.response.Account account1 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str2 = account1.getLogin();
        java.lang.Boolean boolean3 = account1.getAPI();
        java.lang.String str4 = account1.getFirstName();
        com.brightcove.castlabs.client.response.Account account5 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str6 = account5.getLogin();
        java.lang.Boolean boolean7 = account5.getAPI();
        account5.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str10 = account5.getID();
        com.brightcove.castlabs.client.response.Account account11 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str12 = account11.getLogin();
        java.lang.Boolean boolean13 = account11.getAPI();
        java.lang.String str14 = account11.getFirstName();
        com.brightcove.castlabs.client.response.Account[] accountArray15 = new com.brightcove.castlabs.client.response.Account[] { account1, account5, account11 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.Account> accountList16 = new java.util.ArrayList<com.brightcove.castlabs.client.response.Account>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.Account>) accountList16, accountArray15);
        listAccountsResponse0.setAccounts((java.util.List<com.brightcove.castlabs.client.response.Account>) accountList16);
        java.util.List<com.brightcove.castlabs.client.response.Account> accountList19 = listAccountsResponse0.getAccounts();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(boolean3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(accountArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(accountList19);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.brightcove.castlabs.client.CastlabsException castlabsException1 = new com.brightcove.castlabs.client.CastlabsException("");
        com.brightcove.castlabs.client.CastlabsException castlabsException3 = new com.brightcove.castlabs.client.CastlabsException("");
        castlabsException1.addSuppressed((java.lang.Throwable) castlabsException3);
        com.brightcove.castlabs.client.CastlabsException castlabsException6 = new com.brightcove.castlabs.client.CastlabsException("hi!");
        castlabsException3.addSuppressed((java.lang.Throwable) castlabsException6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse1 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse0.setCencResponse(ingestCENCResponse1);
        ingestKeysResponse0.setKeyId("ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}");
        java.lang.String str5 = ingestKeysResponse0.getKeyId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}" + "'", str5, "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse0 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse0.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse3 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse3.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse6 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        com.brightcove.castlabs.client.response.IngestCENCResponse ingestCENCResponse7 = new com.brightcove.castlabs.client.response.IngestCENCResponse();
        ingestKeysResponse6.setCencResponse(ingestCENCResponse7);
        ingestKeysResponse3.setCencResponse(ingestCENCResponse7);
        ingestKeysResponse0.setCencResponse(ingestCENCResponse7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        java.lang.String str1 = downloadKeysResponse0.getType();
        java.lang.String str2 = downloadKeysResponse0.getKeyRotationId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str1 = assetResponse0.getAssetId();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse2 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse2.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        java.lang.String str5 = ingestKeysResponse2.getKeyRotationId();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse6 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse6.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse[] ingestKeysResponseArray9 = new com.brightcove.castlabs.client.response.IngestKeysResponse[] { ingestKeysResponse2, ingestKeysResponse6 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList10 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestKeysResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList10, ingestKeysResponseArray9);
        assetResponse0.setKeys((java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList10);
        com.brightcove.castlabs.client.response.AssetResponse assetResponse13 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str14 = assetResponse13.getAssetId();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse15 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse15.setKeyId("SharedSecretRequest{enabled='null', description='null', secret='null'}");
        java.lang.String str18 = ingestKeysResponse15.getKeyRotationId();
        com.brightcove.castlabs.client.response.IngestKeysResponse ingestKeysResponse19 = new com.brightcove.castlabs.client.response.IngestKeysResponse();
        ingestKeysResponse19.setKeyRotationId("IngestAssetsResponse [assets=[]]");
        com.brightcove.castlabs.client.response.IngestKeysResponse[] ingestKeysResponseArray22 = new com.brightcove.castlabs.client.response.IngestKeysResponse[] { ingestKeysResponse15, ingestKeysResponse19 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList23 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestKeysResponse>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList23, ingestKeysResponseArray22);
        assetResponse13.setKeys((java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList23);
        assetResponse0.setKeys((java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse>) ingestKeysResponseList23);
        assetResponse0.setAssetId("AddSubMerchantAccountRequest{name='null', apiNameSuffix='null', linkedUserUuid='null'}");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(ingestKeysResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(ingestKeysResponseArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient5 = new com.brightcove.castlabs.client.CastlabsClient("SharedSecretRequest{enabled='null', description='null', secret='null'}", "ListAccountsResponse{accounts='[Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}, Account{id='null', enabled='null', api='null', login='null', firstName='null', lastName='null', permissions='null'}]'}", "hi!", "DownloadKeysResponse{uuid='null', type='null', keyId='null', streamType='hi!', assetId='null', variantId='null', keyRotationId='null', ingestChannel='null', ingestRegion='null', auditChanged='null', auditChangedBy='null'}", 1);
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest6 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        java.lang.String str7 = linkAccountToSubMerchantRequest6.toString();
        java.lang.String str8 = linkAccountToSubMerchantRequest6.toString();
        // The following exception was thrown during execution in test generation
        try {
            castlabsClient5.linkAccountToSubMerchant(linkAccountToSubMerchantRequest6, "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
            org.junit.Assert.fail("Expected exception of type org.apache.http.client.ClientProtocolException; message: null");
        } catch (org.apache.http.client.ClientProtocolException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str7, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}" + "'", str8, "LinkAccountToSubMerchantRequest{subMerchantUuid='null', accountUuids=null}");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        java.lang.String str5 = downloadKeysResponse0.uuid;
        downloadKeysResponse0.auditChanged = "Account{id='null', enabled='null', api='null', login='null', firstName='SharedSecretRequest{enabled='null', description='null', secret='hi!'}', lastName='null', permissions='null'}";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.variantId;
        java.lang.String str5 = downloadKeysResponse0.getUuid();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.brightcove.castlabs.client.request.FairplayRequest fairplayRequest0 = new com.brightcove.castlabs.client.request.FairplayRequest();
        java.lang.String str1 = fairplayRequest0.getApplicationSecretKey();
        fairplayRequest0.setProviderCertificate("hi!");
        fairplayRequest0.setApplicationSecretKey("");
        java.lang.String str6 = fairplayRequest0.getProviderCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.type = "IngestKeysRequest [assets=[]]";
        java.lang.String str8 = downloadKeysResponse0.getKeyRotationId();
        downloadKeysResponse0.setKeyRotationId("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=null, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.brightcove.castlabs.client.request.SharedSecretRequest sharedSecretRequest0 = new com.brightcove.castlabs.client.request.SharedSecretRequest();
        sharedSecretRequest0.setDescription("IngestKeysResponse [keyId=null, keyRotationId=IngestAssetsResponse [assets=[]], cencResponse=IngestCENCResponse [systemId={}], errors=[]]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest linkAccountToSubMerchantRequest0 = new com.brightcove.castlabs.client.request.LinkAccountToSubMerchantRequest();
        java.lang.String str1 = linkAccountToSubMerchantRequest0.getSubMerchantUuid();
        java.util.List<java.lang.String> strList2 = linkAccountToSubMerchantRequest0.getAccountUuids();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        java.lang.String str1 = assetResponse0.getAssetId();
        java.lang.Class<?> wildcardClass2 = assetResponse0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest addSubMerchantAccountRequest0 = new com.brightcove.castlabs.client.request.AddSubMerchantAccountRequest();
        java.lang.String str1 = addSubMerchantAccountRequest0.getApiNameSuffix();
        addSubMerchantAccountRequest0.setName("FairplayRequest{providerCertificate='null', providerPrivateKey='null', applicationSecretKey='null'}");
        java.lang.String str4 = addSubMerchantAccountRequest0.getLinkedUserUuid();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.brightcove.castlabs.client.response.Account account0 = new com.brightcove.castlabs.client.response.Account();
        java.lang.String str1 = account0.getLogin();
        java.lang.Boolean boolean2 = account0.getAPI();
        account0.setFirstName("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str5 = account0.getID();
        java.lang.Boolean boolean6 = account0.getEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(boolean2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse0 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError1 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError2 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError3 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray4 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError1, ingestAssetError2, ingestAssetError3 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList5 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5, ingestAssetErrorArray4);
        assetResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList5);
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList8 = assetResponse0.getErrors();
        java.util.List<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList9 = assetResponse0.getErrors();
        java.util.List<com.brightcove.castlabs.client.response.IngestKeysResponse> ingestKeysResponseList10 = assetResponse0.getKeys();
        assetResponse0.setAssetId("com.brightcove.castlabs.client.CastlabsException: hi!");
        com.brightcove.castlabs.client.response.AssetResponse assetResponse13 = new com.brightcove.castlabs.client.response.AssetResponse();
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError14 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError15 = com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION;
        com.brightcove.castlabs.client.response.IngestAssetError ingestAssetError16 = com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID;
        com.brightcove.castlabs.client.response.IngestAssetError[] ingestAssetErrorArray17 = new com.brightcove.castlabs.client.response.IngestAssetError[] { ingestAssetError14, ingestAssetError15, ingestAssetError16 };
        java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError> ingestAssetErrorList18 = new java.util.ArrayList<com.brightcove.castlabs.client.response.IngestAssetError>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList18, ingestAssetErrorArray17);
        assetResponse13.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList18);
        assetResponse0.setErrors((java.util.List<com.brightcove.castlabs.client.response.IngestAssetError>) ingestAssetErrorList18);
        org.junit.Assert.assertTrue("'" + ingestAssetError1 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError1.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError2 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError2.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError3 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError3.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ingestAssetErrorList8);
        org.junit.Assert.assertNotNull(ingestAssetErrorList9);
        org.junit.Assert.assertNotNull(ingestKeysResponseList10);
        org.junit.Assert.assertTrue("'" + ingestAssetError14 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError14.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError15 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION + "'", ingestAssetError15.equals(com.brightcove.castlabs.client.response.IngestAssetError.EXCEPTION));
        org.junit.Assert.assertTrue("'" + ingestAssetError16 + "' != '" + com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID + "'", ingestAssetError16.equals(com.brightcove.castlabs.client.response.IngestAssetError.MISSING_ASSET_ID));
        org.junit.Assert.assertNotNull(ingestAssetErrorArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest updateAuthorizationSettingsRequest0 = new com.brightcove.castlabs.client.request.UpdateAuthorizationSettingsRequest();
        java.lang.String str1 = updateAuthorizationSettingsRequest0.getCallbackUrl();
        updateAuthorizationSettingsRequest0.setMode("IngestKeysRequest [assets=[]]");
        java.lang.String str4 = updateAuthorizationSettingsRequest0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UpdateAuthorizationSettingsRequest{mode='IngestKeysRequest [assets=[]]', callbackUrl='null'}" + "'", str4, "UpdateAuthorizationSettingsRequest{mode='IngestKeysRequest [assets=[]]', callbackUrl='null'}");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        java.lang.String str5 = downloadKeysResponse0.auditChanged;
        java.lang.String str6 = downloadKeysResponse0.getUuid();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.auditChanged;
        java.lang.String str4 = downloadKeysResponse0.getAssetId();
        java.lang.String str5 = downloadKeysResponse0.uuid;
        java.lang.String str6 = downloadKeysResponse0.getUuid();
        java.lang.String str7 = downloadKeysResponse0.getAuditChanged();
        java.lang.String str8 = downloadKeysResponse0.getVariantId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.brightcove.castlabs.client.request.AssetRequest assetRequest0 = new com.brightcove.castlabs.client.request.AssetRequest();
        java.lang.String str1 = assetRequest0.getAssetId();
        com.brightcove.castlabs.client.request.AssetRequest assetRequest2 = new com.brightcove.castlabs.client.request.AssetRequest();
        com.brightcove.castlabs.client.request.AssetType assetType3 = com.brightcove.castlabs.client.request.AssetType.FAIRPLAY;
        assetRequest2.setType(assetType3);
        assetRequest0.setType(assetType3);
        java.lang.String str6 = assetRequest0.getAssetId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + assetType3 + "' != '" + com.brightcove.castlabs.client.request.AssetType.FAIRPLAY + "'", assetType3.equals(com.brightcove.castlabs.client.request.AssetType.FAIRPLAY));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("", "");
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.ListAccountsResponse listAccountsResponse4 = castlabsClient2.listAccounts("IngestKey [keyId=null, keyRotationId=null, streamType=null, algorithm=AES, key=null, iv=null, wvAssetId=null, keyMetadata=null]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.brightcove.castlabs.client.request.IngestKey ingestKey0 = new com.brightcove.castlabs.client.request.IngestKey();
        ingestKey0.setKeyRotationId("IngestKeysRequest [assets=[]]");
        com.brightcove.castlabs.client.request.AlgorithmType algorithmType3 = null;
        ingestKey0.setAlgorithm(algorithmType3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = ingestKey0.getKeyMetadata();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.brightcove.castlabs.client.response.DownloadKeysResponse downloadKeysResponse0 = new com.brightcove.castlabs.client.response.DownloadKeysResponse();
        downloadKeysResponse0.assetId = "";
        java.lang.String str3 = downloadKeysResponse0.streamType;
        downloadKeysResponse0.setVariantId("hi!");
        downloadKeysResponse0.setUuid("SharedSecretRequest{enabled='null', description='null', secret='hi!'}");
        java.lang.String str8 = downloadKeysResponse0.keyId;
        downloadKeysResponse0.setStreamType("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.brightcove.castlabs.client.CastlabsClient castlabsClient2 = new com.brightcove.castlabs.client.CastlabsClient("hi!", "hi!");
        com.brightcove.castlabs.client.request.IngestKeysRequest ingestKeysRequest3 = new com.brightcove.castlabs.client.request.IngestKeysRequest();
        // The following exception was thrown during execution in test generation
        try {
            com.brightcove.castlabs.client.response.IngestAssetsResponse ingestAssetsResponse5 = castlabsClient2.ingestKeys(ingestKeysRequest3, "IngestKeysResponse [keyId=SharedSecretRequest{enabled='null', description='null', secret='null'}, keyRotationId=null, cencResponse=null, errors=[]]");
            org.junit.Assert.fail("Expected exception of type com.brightcove.castlabs.client.CastlabsException; message: Login failed: Response code=403, Reason=Forbidden");
        } catch (com.brightcove.castlabs.client.CastlabsException e) {
            // Expected exception.
        }
    }
}

