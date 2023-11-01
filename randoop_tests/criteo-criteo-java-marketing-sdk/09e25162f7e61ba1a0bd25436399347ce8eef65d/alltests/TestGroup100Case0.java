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
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum1 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value ''");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_CUSTOM_LABEL1;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "customLabel1" + "'", str0, "customLabel1");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        com.criteo.marketing.model.SellerBudgetMessage.StatusEnum statusEnum0 = com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.SCHEDULED;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.SCHEDULED + "'", statusEnum0.equals(com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.SCHEDULED));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = com.criteo.marketing.model.MapiUserMessage.SERIALIZED_NAME_CONTACT_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "contactEmail" + "'", str0, "contactEmail");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        com.criteo.marketing.JSON jSON0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.JSON.ByteArrayAdapter byteArrayAdapter1 = jSON0.new ByteArrayAdapter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.criteo.marketing.JSON$ByteArrayAdapter with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetInfoMessage.SERIALIZED_NAME_BUDGET_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "budgetId" + "'", str0, "budgetId");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.ThrottlePolicy.PolicyTypeEnum policyTypeEnum1 = com.criteo.marketing.model.ThrottlePolicy.PolicyTypeEnum.fromValue("customLabel1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'customLabel1'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = com.criteo.marketing.model.AdvertiserCampaignMessage.SERIALIZED_NAME_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "id" + "'", str0, "id");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_SHIPPING_WIDTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "shippingWidth" + "'", str0, "shippingWidth");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = com.criteo.marketing.model.ThrottlePolicyRates.SERIALIZED_NAME_MINUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "minute" + "'", str0, "minute");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetUpdateMessage.SERIALIZED_NAME_END_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "endDate" + "'", str0, "endDate");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_COST_OF_GOODS_SOLD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "costOfGoodsSold" + "'", str0, "costOfGoodsSold");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.DUPLICATECATEGORYENTRY;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.DUPLICATECATEGORYENTRY + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.DUPLICATECATEGORYENTRY));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_AVAILABILITY_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "availabilityDate" + "'", str0, "availabilityDate");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.INVALIDCATALOGID;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.INVALIDCATALOGID + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.INVALIDCATALOGID));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum campaignStatusEnum1 = com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value ''");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = com.criteo.marketing.model.MarketplaceCampaignMessage.SERIALIZED_NAME_ADVERTISER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserId" + "'", str0, "advertiserId");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = com.criteo.marketing.model.CategoryUpdateError.SERIALIZED_NAME_CATEGORY_HASH_CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryHashCode" + "'", str0, "categoryHashCode");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = com.criteo.marketing.model.UpdateSellerBudgetMessageBase.SERIALIZED_NAME_IS_SUSPENDED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "isSuspended" + "'", str0, "isSuspended");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePatchResponse.SERIALIZED_NAME_SAMPLE_INVALID_IDENTIFIERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sampleInvalidIdentifiers" + "'", str0, "sampleInvalidIdentifiers");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = com.criteo.marketing.model.CreateSellerBudgetMapiMessage.SERIALIZED_NAME_BUDGET_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "budgetType" + "'", str0, "budgetType");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.SELLER;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.SELLER + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.SELLER));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = com.criteo.marketing.model.CampaignMessage.SERIALIZED_NAME_CAMPAIGN_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignBid" + "'", str0, "campaignBid");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = com.criteo.marketing.model.MarketplaceCampaignMessage.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.criteo.marketing.model.SellerBudgetUpdateMessage.StatusEnum statusEnum0 = com.criteo.marketing.model.SellerBudgetUpdateMessage.StatusEnum.INACTIVE;
        java.lang.String str1 = statusEnum0.getValue();
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.SellerBudgetUpdateMessage.StatusEnum.INACTIVE + "'", statusEnum0.equals(com.criteo.marketing.model.SellerBudgetUpdateMessage.StatusEnum.INACTIVE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Inactive" + "'", str1, "Inactive");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = com.criteo.marketing.model.ProductTaxV3.SERIALIZED_NAME_RATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rate" + "'", str0, "rate");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_ADDITIONAL_IMAGE_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "additionalImageLink" + "'", str0, "additionalImageLink");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_LOYATY_POINTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "loyatyPoints" + "'", str0, "loyatyPoints");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.SellerBudgetInfoMessage.StatusEnum statusEnum1 = com.criteo.marketing.model.SellerBudgetInfoMessage.StatusEnum.fromValue("isSuspended");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'isSuspended'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.OK;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.OK + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.OK));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CATEGORY;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CATEGORY + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CATEGORY));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CatalogProduct.MethodEnum methodEnum1 = com.criteo.marketing.model.CatalogProduct.MethodEnum.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value ''");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        categoryMessage0.setEnabled((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.criteo.marketing.model.GoogleProductV3.ChannelEnum channelEnum0 = com.criteo.marketing.model.GoogleProductV3.ChannelEnum.ONLINE;
        org.junit.Assert.assertTrue("'" + channelEnum0 + "' != '" + com.criteo.marketing.model.GoogleProductV3.ChannelEnum.ONLINE + "'", channelEnum0.equals(com.criteo.marketing.model.GoogleProductV3.ChannelEnum.ONLINE));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.criteo.marketing.model.GoogleProductV3.SourceEnum sourceEnum0 = com.criteo.marketing.model.GoogleProductV3.SourceEnum.CRAWL;
        org.junit.Assert.assertTrue("'" + sourceEnum0 + "' != '" + com.criteo.marketing.model.GoogleProductV3.SourceEnum.CRAWL + "'", sourceEnum0.equals(com.criteo.marketing.model.GoogleProductV3.SourceEnum.CRAWL));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.ENABLEDCATEGORYNUMBEREXCEEDED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.ENABLEDCATEGORYNUMBEREXCEEDED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.ENABLEDCATEGORYNUMBEREXCEEDED));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_SIZE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sizeType" + "'", str0, "sizeType");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = com.criteo.marketing.model.AudienceCreateRequest.SERIALIZED_NAME_ADVERTISER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserId" + "'", str0, "advertiserId");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.FOUND;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.FOUND + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.FOUND));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str0 = com.criteo.marketing.model.Installment.SERIALIZED_NAME_AMOUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "amount" + "'", str0, "amount");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = com.criteo.marketing.model.RoutePolicy.SERIALIZED_NAME_THROTTLE_POLICY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttlePolicy" + "'", str0, "throttlePolicy");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str0 = com.criteo.marketing.model.CampaignMessage.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.SERIALIZED_NAME_ERROR_CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "errorCode" + "'", str0, "errorCode");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CATEGORYID;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CATEGORYID + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CATEGORYID));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetMessage.SERIALIZED_NAME_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "id" + "'", str0, "id");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = com.criteo.marketing.model.CategoryBidMessage.SERIALIZED_NAME_CATEGORY_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryBid" + "'", str0, "categoryBid");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CampaignReportQueryMessage.DimensionsEnum dimensionsEnum1 = com.criteo.marketing.model.CampaignReportQueryMessage.DimensionsEnum.fromValue("id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'id'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        com.criteo.marketing.ApiException apiException3 = new com.criteo.marketing.ApiException((int) (byte) 1, strMap1, "isSuspended");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_AGE_GROUP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ageGroup" + "'", str0, "ageGroup");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        okhttp3.MediaType mediaType0 = null;
        okio.ByteString byteString1 = null;
        okhttp3.RequestBody requestBody2 = okhttp3.RequestBody.create(mediaType0, byteString1);
        boolean boolean3 = requestBody2.isDuplex();
        org.junit.Assert.assertNotNull(requestBody2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.SELLER;
        java.lang.String str1 = dimensionsEnum0.toString();
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.SELLER + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.SELLER));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Seller" + "'", str1, "Seller");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePatchRequest.SERIALIZED_NAME_SCHEMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "schema" + "'", str0, "schema");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_SHIPPING_WEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "shippingWeight" + "'", str0, "shippingWeight");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_UNIT_PRICING_BASE_MEASURE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unitPricingBaseMeasure" + "'", str0, "unitPricingBaseMeasure");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_TITLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "title" + "'", str0, "title");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum formatEnum1 = com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.fromValue("categoryHashCode");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'categoryHashCode'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = offsetDateTimeTypeAdapter0.fromJson(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str0 = com.criteo.marketing.model.AudienceResponse.SERIALIZED_NAME_NB_MATCHES_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nbMatchesEmail" + "'", str0, "nbMatchesEmail");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "link" + "'", str0, "link");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetMessage.SERIALIZED_NAME_END_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "endDate" + "'", str0, "endDate");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_TAX_CATEGORY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "taxCategory" + "'", str0, "taxCategory");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.NOCONTENT;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.NOCONTENT + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.NOCONTENT));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.ADVERTISERID;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.ADVERTISERID + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.ADVERTISERID));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String str0 = com.criteo.marketing.model.InstallmentV3.SERIALIZED_NAME_AMOUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "amount" + "'", str0, "amount");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_ADULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "adult" + "'", str0, "adult");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.EXPECTATIONFAILED;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.EXPECTATIONFAILED + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.EXPECTATIONFAILED));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        com.criteo.marketing.model.GoogleProductV3.SourceEnum sourceEnum0 = com.criteo.marketing.model.GoogleProductV3.SourceEnum.API;
        org.junit.Assert.assertTrue("'" + sourceEnum0 + "' != '" + com.criteo.marketing.model.GoogleProductV3.SourceEnum.API + "'", sourceEnum0.equals(com.criteo.marketing.model.GoogleProductV3.SourceEnum.API));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = com.criteo.marketing.model.BudgetMessage.SERIALIZED_NAME_ACTIVE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "active" + "'", str0, "active");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = com.criteo.marketing.model.AudienceResponse.SERIALIZED_NAME_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "description" + "'", str0, "description");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CAMPAIGNID;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CAMPAIGNID + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.CAMPAIGNID));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CatalogProductV3.MethodEnum methodEnum1 = com.criteo.marketing.model.CatalogProductV3.MethodEnum.fromValue("availabilityDate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'availabilityDate'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetsCreateMessage.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.criteo.marketing.model.ThrottlePolicyRates throttlePolicyRates0 = new com.criteo.marketing.model.ThrottlePolicyRates();
        java.lang.Long long1 = throttlePolicyRates0.getHour();
        org.junit.Assert.assertNull(long1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_MIN_HANDLING_TIME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "minHandlingTime" + "'", str0, "minHandlingTime");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = com.criteo.marketing.model.CategoryBidMessage.SERIALIZED_NAME_CATEGORY_HASHCODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryHashcode" + "'", str0, "categoryHashcode");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        java.lang.String str0 = com.criteo.marketing.model.RoutePolicy.SERIALIZED_NAME_POLICY_ROUTE_INFO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "policyRouteInfo" + "'", str0, "policyRouteInfo");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        java.lang.String str0 = com.criteo.marketing.model.CampaignReportQueryMessage.SERIALIZED_NAME_FORMAT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "format" + "'", str0, "format");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.criteo.marketing.JSON jSON0 = null;
        java.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.JSON.LocalDateTypeAdapter localDateTypeAdapter2 = jSON0.new LocalDateTypeAdapter(dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.criteo.marketing.JSON$LocalDateTypeAdapter with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str0 = com.criteo.marketing.model.LoyatyPoints.SERIALIZED_NAME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        java.lang.String str0 = com.criteo.marketing.model.ProductShippingWeightV3.SERIALIZED_NAME_UNIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unit" + "'", str0, "unit");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime2 = offsetDateTimeTypeAdapter0.fromJson("categoryHashCode");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum campaignStatusEnum0 = com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.RUNNING;
        org.junit.Assert.assertTrue("'" + campaignStatusEnum0 + "' != '" + com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.RUNNING + "'", campaignStatusEnum0.equals(com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.RUNNING));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str0 = com.criteo.marketing.model.AudienceResponse.SERIALIZED_NAME_UPDATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "updated" + "'", str0, "updated");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_DISPLAY_ADS_TITLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "displayAdsTitle" + "'", str0, "displayAdsTitle");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        com.criteo.marketing.model.SellerBudgetResponseMessage sellerBudgetResponseMessage0 = new com.criteo.marketing.model.SellerBudgetResponseMessage();
        sellerBudgetResponseMessage0.setAmount((java.lang.Double) 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str0 = com.criteo.marketing.model.SellerCampaignMessage.SERIALIZED_NAME_SELLER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerId" + "'", str0, "sellerId");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_SHIPPING_LABEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "shippingLabel" + "'", str0, "shippingLabel");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str0 = com.criteo.marketing.model.ErrorSource.SERIALIZED_NAME_SOURCE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "source" + "'", str0, "source");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.NONAUTHORITATIVEINFORMATION;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.NONAUTHORITATIVEINFORMATION + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.NONAUTHORITATIVEINFORMATION));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.UNSUPPORTEDMEDIATYPE;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.UNSUPPORTEDMEDIATYPE + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.UNSUPPORTEDMEDIATYPE));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_OFFER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "offerId" + "'", str0, "offerId");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.StatisticsApi statisticsApi1 = new com.criteo.marketing.api.StatisticsApi(apiClient0);
        com.criteo.marketing.model.StatsQueryMessageEx statsQueryMessageEx3 = null;
        com.criteo.marketing.ApiCallback apiCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call5 = statisticsApi1.getStatsCall("active", statsQueryMessageEx3, apiCallback4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        java.lang.String str0 = com.criteo.marketing.model.ProductImporterMessage.SERIALIZED_NAME_ENTRIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "entries" + "'", str0, "entries");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_MODEL_NUMBER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "modelNumber" + "'", str0, "modelNumber");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePutRequest.SERIALIZED_NAME_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "description" + "'", str0, "description");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum campaignStatusEnum0 = com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.ARCHIVED;
        org.junit.Assert.assertTrue("'" + campaignStatusEnum0 + "' != '" + com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.ARCHIVED + "'", campaignStatusEnum0.equals(com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.ARCHIVED));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.SellerBudgetUpdateMessage.StatusEnum statusEnum1 = com.criteo.marketing.model.SellerBudgetUpdateMessage.StatusEnum.fromValue("costOfGoodsSold");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'costOfGoodsSold'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePatchResponse.SERIALIZED_NAME_NB_INVALID_IDENTIFIERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nbInvalidIdentifiers" + "'", str0, "nbInvalidIdentifiers");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        java.lang.String str0 = com.criteo.marketing.model.BidMessage.SERIALIZED_NAME_BID_IS_PENDING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bidIsPending" + "'", str0, "bidIsPending");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessage.TimezoneEnum timezoneEnum1 = com.criteo.marketing.model.StatsQueryMessage.TimezoneEnum.fromValue("displayAdsTitle");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'displayAdsTitle'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String str0 = com.criteo.marketing.model.CategoryBidChangeRequest.SERIALIZED_NAME_CATEGORY_HASHCODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryHashcode" + "'", str0, "categoryHashcode");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_SALE_PRICE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "salePrice" + "'", str0, "salePrice");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        java.lang.Integer int1 = categoryMessage0.getCatalogId();
        categoryMessage0.setAdvertiserId((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.criteo.marketing.Configuration configuration0 = new com.criteo.marketing.Configuration();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.FOURDECIMALSNOTALLOWED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.FOURDECIMALSNOTALLOWED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.FOURDECIMALSNOTALLOWED));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.ACCEPTED;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.ACCEPTED + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.ACCEPTED));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage0 = new com.criteo.marketing.model.CampaignReportQueryMessage();
        campaignReportQueryMessage0.setTimezone("rate");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str0 = com.criteo.marketing.model.CatalogProductV3.SERIALIZED_NAME_PRODUCT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "product" + "'", str0, "product");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum campaignStatusEnum1 = com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum.fromValue("nbMatchesEmail");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'nbMatchesEmail'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str0 = com.criteo.marketing.model.SellerInfoMessage.SERIALIZED_NAME_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String str0 = com.criteo.marketing.model.MapiUserMessage.SERIALIZED_NAME_UMS_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "umsId" + "'", str0, "umsId");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        com.criteo.marketing.ApiCallback apiCallback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call8 = campaignsApi1.getCampaignsCall("Seller", "title", "", "budgetType", "minHandlingTime", apiCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage4 = categoryMessage0.categoryName("sampleInvalidIdentifiers");
        java.lang.Boolean boolean5 = categoryMessage4.getEnabled();
        java.lang.Integer int6 = categoryMessage4.getCatalogId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(categoryMessage4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_CUSTOM_LABEL4;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "customLabel4" + "'", str0, "customLabel4");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str0 = com.criteo.marketing.model.MarketplaceCampaignMessage.SERIALIZED_NAME_CAMPAIGN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignName" + "'", str0, "campaignName");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        java.time.OffsetDateTime offsetDateTime1 = null;
        java.lang.String str2 = offsetDateTimeTypeAdapter0.toJson(offsetDateTime1);
        java.io.Writer writer3 = null;
        java.time.OffsetDateTime offsetDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            offsetDateTimeTypeAdapter0.toJson(writer3, offsetDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.criteo.marketing.model.CampaignBidChangeResponse campaignBidChangeResponse0 = new com.criteo.marketing.model.CampaignBidChangeResponse();
        java.util.List<com.criteo.marketing.model.CategoryUpdateError> categoryUpdateErrorList1 = campaignBidChangeResponse0.getCategories();
        java.util.List<com.criteo.marketing.model.CategoryUpdateError> categoryUpdateErrorList2 = campaignBidChangeResponse0.getCategories();
        org.junit.Assert.assertNull(categoryUpdateErrorList1);
        org.junit.Assert.assertNull(categoryUpdateErrorList2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        java.lang.String str0 = com.criteo.marketing.model.PolicyRouteInfo.SERIALIZED_NAME_ROUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "route" + "'", str0, "route");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.BudgetsApi budgetsApi1 = new com.criteo.marketing.api.BudgetsApi(apiClient0);
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.BudgetMessage>> budgetMessageListApiCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call7 = budgetsApi1.getAsync("product", "status", "format", (java.lang.Boolean) true, budgetMessageListApiCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_TAX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tax" + "'", str0, "tax");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.criteo.marketing.model.StatsQueryMessageEx.ReportTypeEnum reportTypeEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.ReportTypeEnum.TRANSACTIONID;
        org.junit.Assert.assertTrue("'" + reportTypeEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.ReportTypeEnum.TRANSACTIONID + "'", reportTypeEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.ReportTypeEnum.TRANSACTIONID));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum timezoneEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.GMT;
        org.junit.Assert.assertTrue("'" + timezoneEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.GMT + "'", timezoneEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.GMT));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        com.criteo.marketing.model.LoyaltyPointsV3 loyaltyPointsV3_0 = new com.criteo.marketing.model.LoyaltyPointsV3();
        loyaltyPointsV3_0.setPointsValue((java.lang.Object) (byte) 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_IDENTIFIER_EXISTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "identifierExists" + "'", str0, "identifierExists");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_NUMBER_OF_REVIEWS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "numberOfReviews" + "'", str0, "numberOfReviews");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_KIND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "kind" + "'", str0, "kind");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.criteo.marketing.model.CampaignMessage.CampaignStatusEnum campaignStatusEnum0 = com.criteo.marketing.model.CampaignMessage.CampaignStatusEnum.ARCHIVED;
        org.junit.Assert.assertTrue("'" + campaignStatusEnum0 + "' != '" + com.criteo.marketing.model.CampaignMessage.CampaignStatusEnum.ARCHIVED + "'", campaignStatusEnum0.equals(com.criteo.marketing.model.CampaignMessage.CampaignStatusEnum.ARCHIVED));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        java.lang.String str0 = com.criteo.marketing.model.CampaignMessage.SERIALIZED_NAME_CATEGORIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categories" + "'", str0, "categories");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String str0 = com.criteo.marketing.model.CategoryBidMessage.SERIALIZED_NAME_CATEGORY_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryName" + "'", str0, "categoryName");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        java.lang.String str0 = com.criteo.marketing.model.Price.SERIALIZED_NAME_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "value" + "'", str0, "value");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CatalogProduct.MethodEnum methodEnum1 = com.criteo.marketing.model.CatalogProduct.MethodEnum.fromValue("campaignName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'campaignName'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.criteo.marketing.model.SellerBudgetsCreateMessage sellerBudgetsCreateMessage0 = new com.criteo.marketing.model.SellerBudgetsCreateMessage();
        com.criteo.marketing.model.SellerBudgetCreateMessage[] sellerBudgetCreateMessageArray1 = new com.criteo.marketing.model.SellerBudgetCreateMessage[] {};
        java.util.ArrayList<com.criteo.marketing.model.SellerBudgetCreateMessage> sellerBudgetCreateMessageList2 = new java.util.ArrayList<com.criteo.marketing.model.SellerBudgetCreateMessage>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.SellerBudgetCreateMessage>) sellerBudgetCreateMessageList2, sellerBudgetCreateMessageArray1);
        sellerBudgetsCreateMessage0.setSellerBudgets((java.util.List<com.criteo.marketing.model.SellerBudgetCreateMessage>) sellerBudgetCreateMessageList2);
        sellerBudgetsCreateMessage0.setCampaignId((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(sellerBudgetCreateMessageArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_EXCLUDED_DESTINATIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "excludedDestinations" + "'", str0, "excludedDestinations");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.criteo.marketing.model.CategoryUpdatesPerCatalog categoryUpdatesPerCatalog0 = new com.criteo.marketing.model.CategoryUpdatesPerCatalog();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetsUpdateMessage.SERIALIZED_NAME_SELLER_BUDGETS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerBudgets" + "'", str0, "sellerBudgets");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str0 = com.criteo.marketing.model.CampaignReportQueryMessage.SERIALIZED_NAME_METRICS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "metrics" + "'", str0, "metrics");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_MATERIAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "material" + "'", str0, "material");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.String str0 = com.criteo.marketing.model.ProductUnitPricingBaseMeasureV3.SERIALIZED_NAME_UNIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unit" + "'", str0, "unit");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum formatEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.EXCEL;
        org.junit.Assert.assertTrue("'" + formatEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.EXCEL + "'", formatEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.EXCEL));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.String str0 = com.criteo.marketing.model.PublisherStatsQueryMessage.SERIALIZED_NAME_START_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startDate" + "'", str0, "startDate");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.OK;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.OK + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.OK));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_CUSTOM_LABEL2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "customLabel2" + "'", str0, "customLabel2");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.CATEGORY;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.CATEGORY + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.CATEGORY));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String str0 = com.criteo.marketing.model.InstallmentAmount.SERIALIZED_NAME_CURRENCY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "currency" + "'", str0, "currency");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.BudgetsApi budgetsApi1 = new com.criteo.marketing.api.BudgetsApi(apiClient0);
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.BudgetMessage>> budgetMessageListApiCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call7 = budgetsApi1.getAsync("tax", "shippingWidth", "contactEmail", (java.lang.Boolean) false, budgetMessageListApiCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.criteo.marketing.model.CampaignReportQueryMessage.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.CampaignReportQueryMessage.DimensionsEnum.ADVERTISER;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.CampaignReportQueryMessage.DimensionsEnum.ADVERTISER + "'", dimensionsEnum0.equals(com.criteo.marketing.model.CampaignReportQueryMessage.DimensionsEnum.ADVERTISER));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_SHIPPING_HEIGHT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "shippingHeight" + "'", str0, "shippingHeight");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_MOBILE_LINK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mobileLink" + "'", str0, "mobileLink");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str0 = com.criteo.marketing.model.LoyaltyPointsV3.SERIALIZED_NAME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetsMessage.SERIALIZED_NAME_SELLER_BUDGETS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerBudgets" + "'", str0, "sellerBudgets");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        java.lang.String str0 = com.criteo.marketing.model.CreateSellerCampaignMessageMapi.SERIALIZED_NAME_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bid" + "'", str0, "bid");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.criteo.marketing.model.PublisherStatsQueryMessage publisherStatsQueryMessage0 = new com.criteo.marketing.model.PublisherStatsQueryMessage();
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum1 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.ADVERTISER;
        boolean boolean2 = publisherStatsQueryMessage0.equals((java.lang.Object) dimensionsEnum1);
        java.lang.String str3 = publisherStatsQueryMessage0.getAdvertiserIds();
        org.junit.Assert.assertTrue("'" + dimensionsEnum1 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.ADVERTISER + "'", dimensionsEnum1.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.ADVERTISER));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_UNIT_PRICING_MEASURE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unitPricingMeasure" + "'", str0, "unitPricingMeasure");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.criteo.marketing.model.AdvertiserCampaignMessage advertiserCampaignMessage0 = new com.criteo.marketing.model.AdvertiserCampaignMessage();
        java.lang.Integer int1 = advertiserCampaignMessage0.getId();
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum errorCodeEnum2 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.BIDNOTINRANGE;
        boolean boolean3 = advertiserCampaignMessage0.equals((java.lang.Object) errorCodeEnum2);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertTrue("'" + errorCodeEnum2 + "' != '" + com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.BIDNOTINRANGE + "'", errorCodeEnum2.equals(com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.BIDNOTINRANGE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.SellersV2StatsApi sellersV2StatsApi1 = new com.criteo.marketing.api.SellersV2StatsApi(apiClient0);
        java.time.OffsetDateTime offsetDateTime5 = null;
        java.time.OffsetDateTime offsetDateTime6 = null;
        com.criteo.marketing.ApiCallback<byte[]> byteArrayApiCallback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call12 = sellersV2StatsApi1.sellerCampaignsAsync("numberOfReviews", "link", "customLabel2", offsetDateTime5, offsetDateTime6, "nbMatchesEmail", "mobileLink", (java.lang.Integer) 1, (java.lang.Integer) 0, byteArrayApiCallback11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String str0 = com.criteo.marketing.model.ThrottlePolicy.SERIALIZED_NAME_RATES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "rates" + "'", str0, "rates");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str0 = com.criteo.marketing.model.ClientRegistrationRequestMessage.SERIALIZED_NAME_CONTACT_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "contactEmail" + "'", str0, "contactEmail");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum formatEnum1 = com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.fromValue("currency");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'currency'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetMessage.SERIALIZED_NAME_START_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startDate" + "'", str0, "startDate");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String str0 = com.criteo.marketing.model.CampaignBidMessage.SERIALIZED_NAME_CAMPAIGN_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignBid" + "'", str0, "campaignBid");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_CUSTOM_LABEL0;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "customLabel0" + "'", str0, "customLabel0");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum formatEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.JSON;
        org.junit.Assert.assertTrue("'" + formatEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.JSON + "'", formatEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.JSON));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        java.lang.String str0 = com.criteo.marketing.model.CampaignReportQueryMessage.SERIALIZED_NAME_DIMENSIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "dimensions" + "'", str0, "dimensions");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePatchRequest.SERIALIZED_NAME_GUM_CALLER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gumCallerId" + "'", str0, "gumCallerId");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        java.lang.String str0 = com.criteo.marketing.model.StatsQueryMessage.SERIALIZED_NAME_END_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "endDate" + "'", str0, "endDate");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.SERVICEUNAVAILABLE;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.SERVICEUNAVAILABLE + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.SERVICEUNAVAILABLE));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage0 = new com.criteo.marketing.model.CampaignReportQueryMessage();
        java.lang.String str1 = campaignReportQueryMessage0.getCurrency();
        boolean boolean3 = campaignReportQueryMessage0.equals((java.lang.Object) "sizeType");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.String str0 = com.criteo.marketing.model.SellerMessage.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "id" + "'", str0, "id");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetUpdateMessage.SERIALIZED_NAME_BUDGET_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "budgetId" + "'", str0, "budgetId");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum formatEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.CSV;
        org.junit.Assert.assertTrue("'" + formatEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.CSV + "'", formatEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.CSV));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_CUSTOM_LABEL3;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "customLabel3" + "'", str0, "customLabel3");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.String str0 = com.criteo.marketing.model.ProductShippingDimensionV3.SERIALIZED_NAME_UNIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unit" + "'", str0, "unit");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        com.google.gson.stream.JsonWriter jsonWriter1 = null;
        java.time.OffsetDateTime offsetDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            offsetDateTimeTypeAdapter0.write(jsonWriter1, offsetDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.criteo.marketing.model.BidMessage.BidTypeEnum bidTypeEnum0 = com.criteo.marketing.model.BidMessage.BidTypeEnum.UNKNOWN;
        java.lang.String str1 = bidTypeEnum0.toString();
        org.junit.Assert.assertTrue("'" + bidTypeEnum0 + "' != '" + com.criteo.marketing.model.BidMessage.BidTypeEnum.UNKNOWN + "'", bidTypeEnum0.equals(com.criteo.marketing.model.BidMessage.BidTypeEnum.UNKNOWN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Unknown" + "'", str1, "Unknown");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = null;
        campaignsApi1.setApiClient(apiClient2);
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CategoryMessage categoryMessage7 = campaignsApi1.getCategories((java.lang.Integer) 1, "value", (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum timezoneEnum1 = com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.fromValue("customLabel3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'customLabel3'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.CatalogProduct.MethodEnum methodEnum1 = com.criteo.marketing.model.CatalogProduct.MethodEnum.fromValue("umsId");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'umsId'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String str0 = com.criteo.marketing.model.MarketplaceCampaignMessage.SERIALIZED_NAME_CAMPAIGN_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignBid" + "'", str0, "campaignBid");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        java.lang.String str0 = com.criteo.marketing.model.AdvertiserCampaignMessage.SERIALIZED_NAME_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        java.lang.String str0 = com.criteo.marketing.model.Tax.SERIALIZED_NAME_POSTAL_CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "postalCode" + "'", str0, "postalCode");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.DUPLICATECATALOGENTRY;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.DUPLICATECATALOGENTRY + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.DUPLICATECATALOGENTRY));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.REQUESTURITOOLONG;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.REQUESTURITOOLONG + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.REQUESTURITOOLONG));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.criteo.marketing.model.ThrottlePolicy throttlePolicy0 = new com.criteo.marketing.model.ThrottlePolicy();
        java.lang.String str1 = throttlePolicy0.toString();
        com.criteo.marketing.model.ThrottlePolicyRates throttlePolicyRates2 = new com.criteo.marketing.model.ThrottlePolicyRates();
        throttlePolicy0.setRates(throttlePolicyRates2);
        throttlePolicyRates2.setHour((java.lang.Long) 0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ThrottlePolicy {\n    policyType: null\n    rates: null\n}" + "'", str1, "class ThrottlePolicy {\n    policyType: null\n    rates: null\n}");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.HOUR;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.HOUR + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.HOUR));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.ACCESSDENIED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.ACCESSDENIED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.ACCESSDENIED));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.REQUESTEDRANGENOTSATISFIABLE;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.REQUESTEDRANGENOTSATISFIABLE + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.REQUESTEDRANGENOTSATISFIABLE));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.criteo.marketing.model.CreateSellerBudgetMapiMessage createSellerBudgetMapiMessage0 = new com.criteo.marketing.model.CreateSellerBudgetMapiMessage();
        com.criteo.marketing.model.CategoryMessage categoryMessage1 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean3 = categoryMessage1.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage5 = categoryMessage1.categoryName("sampleInvalidIdentifiers");
        boolean boolean6 = createSellerBudgetMapiMessage0.equals((java.lang.Object) categoryMessage1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(categoryMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.MONTH;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.MONTH + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.MONTH));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        java.lang.String str0 = com.criteo.marketing.model.SellerBase.SERIALIZED_NAME_SELLER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerName" + "'", str0, "sellerName");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        com.criteo.marketing.model.ServiceStatusCheckResult serviceStatusCheckResult0 = new com.criteo.marketing.model.ServiceStatusCheckResult();
        com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum statusEnum1 = com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.ACTIVE;
        java.lang.String str2 = statusEnum1.toString();
        boolean boolean3 = serviceStatusCheckResult0.equals((java.lang.Object) statusEnum1);
        java.lang.String str4 = serviceStatusCheckResult0.toString();
        org.junit.Assert.assertTrue("'" + statusEnum1 + "' != '" + com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.ACTIVE + "'", statusEnum1.equals(com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.ACTIVE));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Active" + "'", str2, "Active");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class ServiceStatusCheckResult {\n    checkResults: null\n    successful: null\n}" + "'", str4, "class ServiceStatusCheckResult {\n    checkResults: null\n    successful: null\n}");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage4 = categoryMessage0.categoryName("sampleInvalidIdentifiers");
        java.lang.Boolean boolean5 = categoryMessage4.getEnabled();
        com.criteo.marketing.model.BidMessage bidMessage6 = null;
        categoryMessage4.setCategoryBid(bidMessage6);
        com.criteo.marketing.model.CategoryMessage categoryMessage9 = categoryMessage4.categoryHashCode((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(categoryMessage4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(categoryMessage9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        java.lang.String str0 = com.criteo.marketing.model.SellerBidInfoMessage.SERIALIZED_NAME_SELLER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerName" + "'", str0, "sellerName");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.criteo.marketing.model.CategoryBidMessage categoryBidMessage0 = new com.criteo.marketing.model.CategoryBidMessage();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.CampaignBidMessage> campaignBidMessageList9 = campaignsApi1.getBids("gumCallerId", "categoryHashCode", "", "Active", "customLabel1", "shippingHeight", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = null;
        campaignsApi1.setApiClient(apiClient2);
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.CampaignMessage>> campaignMessageListApiCallback9 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call10 = campaignsApi1.getCampaignsAsync("categories", "", "bid", "null", "active", campaignMessageListApiCallback9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        java.lang.String str0 = com.criteo.marketing.model.CategoryMessage.SERIALIZED_NAME_CATEGORY_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryBid" + "'", str0, "categoryBid");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.String str0 = com.criteo.marketing.model.ClientRegistrationRequestMessage.SERIALIZED_NAME_ADVERTISER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserId" + "'", str0, "advertiserId");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String str0 = com.criteo.marketing.model.CampaignMessage.SERIALIZED_NAME_CAMPAIGN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignName" + "'", str0, "campaignName");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        okhttp3.MediaType mediaType0 = null;
        okhttp3.RequestBody requestBody2 = okhttp3.RequestBody.create(mediaType0, "modelNumber");
        org.junit.Assert.assertNotNull(requestBody2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.criteo.marketing.model.AdvertiserCampaignMessage advertiserCampaignMessage0 = new com.criteo.marketing.model.AdvertiserCampaignMessage();
        com.criteo.marketing.model.AdvertiserCampaignMessage.StatusEnum statusEnum1 = null;
        com.criteo.marketing.model.AdvertiserCampaignMessage advertiserCampaignMessage2 = advertiserCampaignMessage0.status(statusEnum1);
        java.lang.String str3 = advertiserCampaignMessage2.toString();
        org.junit.Assert.assertNotNull(advertiserCampaignMessage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class AdvertiserCampaignMessage {\n    id: null\n    campaignName: null\n    campaignStatus: null\n    status: null\n}" + "'", str3, "class AdvertiserCampaignMessage {\n    id: null\n    campaignName: null\n    campaignStatus: null\n    status: null\n}");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.criteo.marketing.model.ThrottlePolicyRates throttlePolicyRates0 = new com.criteo.marketing.model.ThrottlePolicyRates();
        java.lang.Long long1 = throttlePolicyRates0.getSecond();
        com.criteo.marketing.model.ThrottlePolicyRates throttlePolicyRates3 = throttlePolicyRates0.custom((java.lang.Long) 10L);
        org.junit.Assert.assertNull(long1);
        org.junit.Assert.assertNotNull(throttlePolicyRates3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.SellerCampaignMessage> sellerCampaignMessageList7 = sellersV2Api0.getSellerCampaigns("rates", "campaignBid", "sellerId", (java.lang.Integer) 10, "id", (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.SellerBudgetMessage.StatusEnum statusEnum1 = com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.fromValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value ''");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.INACTIVECATEGORY;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.INACTIVECATEGORY + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.INACTIVECATEGORY));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_ITEM_GROUP_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "itemGroupId" + "'", str0, "itemGroupId");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.criteo.marketing.model.CreateSellerBudgetMapiMessage createSellerBudgetMapiMessage0 = new com.criteo.marketing.model.CreateSellerBudgetMapiMessage();
        java.lang.Integer[] intArray4 = new java.lang.Integer[] { (-1), (-1), (-1) };
        java.util.ArrayList<java.lang.Integer> intList5 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList5, intArray4);
        createSellerBudgetMapiMessage0.setCampaignIds((java.util.List<java.lang.Integer>) intList5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_TITLE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "title" + "'", str0, "title");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.CATEGORIESNOTENABLED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.CATEGORIESNOTENABLED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.CATEGORIESNOTENABLED));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.HTTPVERSIONNOTSUPPORTED;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.HTTPVERSIONNOTSUPPORTED + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.HTTPVERSIONNOTSUPPORTED));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        java.lang.String str0 = com.criteo.marketing.model.CategoryMessage.SERIALIZED_NAME_CAMPAIGN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignName" + "'", str0, "campaignName");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.criteo.marketing.model.ThrottlePolicy throttlePolicy0 = new com.criteo.marketing.model.ThrottlePolicy();
        com.criteo.marketing.model.ThrottlePolicy.PolicyTypeEnum policyTypeEnum1 = throttlePolicy0.getPolicyType();
        org.junit.Assert.assertNull(policyTypeEnum1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.lang.String str0 = com.criteo.marketing.model.CreateSellerBudgetMapiMessage.SERIALIZED_NAME_START_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startDate" + "'", str0, "startDate");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage4 = categoryMessage0.campaignId((java.lang.Integer) (-1));
        java.lang.String str5 = categoryMessage0.getAdvertiserName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(categoryMessage4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.BIDDINGONTHISCAMPAIGNNOTALLOWED));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_TARGET_COUNTRY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "targetCountry" + "'", str0, "targetCountry");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.criteo.marketing.model.SellerBudgetsCreateMessage sellerBudgetsCreateMessage0 = new com.criteo.marketing.model.SellerBudgetsCreateMessage();
        com.criteo.marketing.model.SellerBudgetCreateMessage sellerBudgetCreateMessage1 = null;
        com.criteo.marketing.model.SellerBudgetsCreateMessage sellerBudgetsCreateMessage2 = sellerBudgetsCreateMessage0.addSellerBudgetsItem(sellerBudgetCreateMessage1);
        java.lang.String str3 = sellerBudgetsCreateMessage2.toString();
        org.junit.Assert.assertNotNull(sellerBudgetsCreateMessage2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class SellerBudgetsCreateMessage {\n    campaignId: null\n    sellerBudgets: [null]\n}" + "'", str3, "class SellerBudgetsCreateMessage {\n    campaignId: null\n    sellerBudgets: [null]\n}");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.lang.String str0 = com.criteo.marketing.model.LoyatyPoints.SERIALIZED_NAME_POINTS_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pointsValue" + "'", str0, "pointsValue");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.RESETCONTENT;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.RESETCONTENT + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.RESETCONTENT));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<java.util.List<com.criteo.marketing.model.AdvertiserInfoMessage>> advertiserInfoMessageListApiResponse2 = sellersV2Api0.getAdvertisersWithHttpInfo("targetCountry");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_SALE_PRICE_EFFECTIVE_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "salePriceEffectiveDate" + "'", str0, "salePriceEffectiveDate");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.criteo.marketing.auth.HttpBearerAuth httpBearerAuth1 = new com.criteo.marketing.auth.HttpBearerAuth("postalCode");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        com.criteo.marketing.ApiException apiException4 = new com.criteo.marketing.ApiException((int) (byte) -1, "campaignId", strMap2, "title");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_MPN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mpn" + "'", str0, "mpn");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        java.time.OffsetDateTime offsetDateTime6 = null;
        java.time.OffsetDateTime offsetDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.SellerBudgetMessage> sellerBudgetMessageList11 = sellersV2Api0.getBudgetsByAdvertiser((java.lang.Integer) 0, "sellerId", "link", (java.lang.Boolean) false, (java.lang.Boolean) false, offsetDateTime6, offsetDateTime7, (java.lang.Long) 0L, (java.lang.Long) 1L, "Inactive");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.criteo.marketing.model.CatalogProductV3.MethodEnum methodEnum0 = com.criteo.marketing.model.CatalogProductV3.MethodEnum.INSERT;
        org.junit.Assert.assertTrue("'" + methodEnum0 + "' != '" + com.criteo.marketing.model.CatalogProductV3.MethodEnum.INSERT + "'", methodEnum0.equals(com.criteo.marketing.model.CatalogProductV3.MethodEnum.INSERT));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        java.time.OffsetDateTime offsetDateTime1 = null;
        com.google.gson.JsonElement jsonElement2 = offsetDateTimeTypeAdapter0.toJsonTree(offsetDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            java.time.OffsetDateTime offsetDateTime4 = offsetDateTimeTypeAdapter0.fromJson("class SellerBudgetsCreateMessage {\n    campaignId: null\n    sellerBudgets: [null]\n}");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement2);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        java.lang.String str0 = com.criteo.marketing.model.CampaignReportQueryMessage.SERIALIZED_NAME_ADVERTISER_IDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserIds" + "'", str0, "advertiserIds");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetCreateMessage.SERIALIZED_NAME_END_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "endDate" + "'", str0, "endDate");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.criteo.marketing.model.ServiceStatusCheckResult serviceStatusCheckResult0 = new com.criteo.marketing.model.ServiceStatusCheckResult();
        java.util.List<com.criteo.marketing.model.CheckResult> checkResultList1 = serviceStatusCheckResult0.getCheckResults();
        org.junit.Assert.assertNull(checkResultList1);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum campaignStatusEnum1 = com.criteo.marketing.model.MarketplaceCampaignMessage.CampaignStatusEnum.fromValue("advertiserId");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'advertiserId'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.criteo.marketing.model.LoyaltyPointsV3 loyaltyPointsV3_0 = new com.criteo.marketing.model.LoyaltyPointsV3();
        java.lang.Double double1 = loyaltyPointsV3_0.getRatio();
        org.junit.Assert.assertNull(double1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.MULTIPLECHOICES;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.MULTIPLECHOICES + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.MULTIPLECHOICES));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.GoogleProductV3.KindEnum kindEnum1 = com.criteo.marketing.model.GoogleProductV3.KindEnum.fromValue("categoryBid");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'categoryBid'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum formatEnum1 = com.criteo.marketing.model.StatsQueryMessageEx.FormatEnum.fromValue("categoryName");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'categoryName'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.String str0 = com.criteo.marketing.model.PublisherStatsQueryMessage.SERIALIZED_NAME_ADVERTISER_IDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserIds" + "'", str0, "advertiserIds");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        java.lang.String str0 = com.criteo.marketing.model.SellerCampaignMessage.SERIALIZED_NAME_BID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bid" + "'", str0, "bid");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        java.lang.String str0 = com.criteo.marketing.model.AudienceCreateRequest.SERIALIZED_NAME_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "description" + "'", str0, "description");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.criteo.marketing.model.MessageWithDetailsCampaignBidChangeResponse messageWithDetailsCampaignBidChangeResponse0 = new com.criteo.marketing.model.MessageWithDetailsCampaignBidChangeResponse();
        com.criteo.marketing.model.CampaignBidChangeResponse campaignBidChangeResponse1 = new com.criteo.marketing.model.CampaignBidChangeResponse();
        messageWithDetailsCampaignBidChangeResponse0.setDetails(campaignBidChangeResponse1);
        java.util.List<com.criteo.marketing.model.CategoryUpdateError> categoryUpdateErrorList3 = null;
        campaignBidChangeResponse1.setCategories(categoryUpdateErrorList3);
        com.criteo.marketing.model.CampaignBidChangeResponse campaignBidChangeResponse6 = campaignBidChangeResponse1.campaignId((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(campaignBidChangeResponse6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        java.lang.String str0 = com.criteo.marketing.model.StatsQueryMessageEx.SERIALIZED_NAME_TIMEZONE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "timezone" + "'", str0, "timezone");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        java.time.OffsetDateTime offsetDateTime6 = null;
        java.time.OffsetDateTime offsetDateTime7 = null;
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.SellerBudgetMessage>> sellerBudgetMessageListApiCallback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call12 = sellersV2Api0.getBudgetsByAdvertiserAsync((java.lang.Integer) 10, "", "entries", (java.lang.Boolean) false, (java.lang.Boolean) false, offsetDateTime6, offsetDateTime7, (java.lang.Long) 100L, (java.lang.Long) 1L, "product", sellerBudgetMessageListApiCallback11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: username or password is not present.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.criteo.marketing.model.SellerBudgetsCreateMessage sellerBudgetsCreateMessage0 = new com.criteo.marketing.model.SellerBudgetsCreateMessage();
        sellerBudgetsCreateMessage0.setCampaignId((java.lang.Integer) 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.lang.String str0 = com.criteo.marketing.model.StatsQueryMessageEx.SERIALIZED_NAME_ADVERTISER_IDS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserIds" + "'", str0, "advertiserIds");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_PRICE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "price" + "'", str0, "price");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        java.time.OffsetDateTime offsetDateTime6 = null;
        java.time.OffsetDateTime offsetDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.SellerBudgetMessage> sellerBudgetMessageList11 = sellersV2Api0.getBudgetsByAdvertiser((java.lang.Integer) 10, "budgetId", "minHandlingTime", (java.lang.Boolean) false, (java.lang.Boolean) false, offsetDateTime6, offsetDateTime7, (java.lang.Long) 10L, (java.lang.Long) 1L, "shippingWeight");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        java.lang.String str0 = com.criteo.marketing.model.CreateSellerBudgetMapiMessage.SERIALIZED_NAME_SELLER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerId" + "'", str0, "sellerId");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.criteo.marketing.model.ThrottlePolicy throttlePolicy0 = new com.criteo.marketing.model.ThrottlePolicy();
        java.lang.String str1 = throttlePolicy0.toString();
        com.criteo.marketing.model.ThrottlePolicyRates throttlePolicyRates2 = new com.criteo.marketing.model.ThrottlePolicyRates();
        throttlePolicy0.setRates(throttlePolicyRates2);
        java.lang.String str4 = throttlePolicy0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ThrottlePolicy {\n    policyType: null\n    rates: null\n}" + "'", str1, "class ThrottlePolicy {\n    policyType: null\n    rates: null\n}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class ThrottlePolicy {\n    policyType: null\n    rates: class ThrottlePolicyRates {\n        second: null\n        minute: null\n        hour: null\n        custom: null\n    }\n}" + "'", str4, "class ThrottlePolicy {\n    policyType: null\n    rates: class ThrottlePolicyRates {\n        second: null\n        minute: null\n        hour: null\n        custom: null\n    }\n}");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_INSTALLMENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "installment" + "'", str0, "installment");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.criteo.marketing.model.CreateSellerBudgetMapiMessage createSellerBudgetMapiMessage0 = new com.criteo.marketing.model.CreateSellerBudgetMapiMessage();
        java.lang.String str1 = createSellerBudgetMapiMessage0.getSellerId();
        java.time.OffsetDateTime offsetDateTime2 = createSellerBudgetMapiMessage0.getStartDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(offsetDateTime2);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.criteo.marketing.model.SellerBase sellerBase0 = new com.criteo.marketing.model.SellerBase();
        com.criteo.marketing.model.CreateSellerBudgetMapiMessage createSellerBudgetMapiMessage1 = new com.criteo.marketing.model.CreateSellerBudgetMapiMessage();
        boolean boolean2 = sellerBase0.equals((java.lang.Object) createSellerBudgetMapiMessage1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetInfoMessage.SERIALIZED_NAME_REMAINING_AMOUNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "remainingAmount" + "'", str0, "remainingAmount");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_SHIPPING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "shipping" + "'", str0, "shipping");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.criteo.marketing.model.SellerBudgetResponseMessage sellerBudgetResponseMessage0 = new com.criteo.marketing.model.SellerBudgetResponseMessage();
        sellerBudgetResponseMessage0.setAmount((java.lang.Double) (-1.0d));
        com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum statusEnum3 = com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.ACTIVE;
        sellerBudgetResponseMessage0.setStatus(statusEnum3);
        org.junit.Assert.assertTrue("'" + statusEnum3 + "' != '" + com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.ACTIVE + "'", statusEnum3.equals(com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.ACTIVE));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage4 = categoryMessage0.categoryName("sampleInvalidIdentifiers");
        categoryMessage0.setCategoryName("postalCode");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(categoryMessage4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.AuthenticationApi authenticationApi1 = new com.criteo.marketing.api.AuthenticationApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = authenticationApi1.getApiClient();
        com.criteo.marketing.ApiClient apiClient3 = null;
        authenticationApi1.setApiClient(apiClient3);
        org.junit.Assert.assertNull(apiClient2);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_PATTERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pattern" + "'", str0, "pattern");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        java.lang.String str0 = com.criteo.marketing.model.Shipping.SERIALIZED_NAME_SERVICE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "service" + "'", str0, "service");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        java.util.List<com.criteo.marketing.model.UpdateSellerBudgetMessage> updateSellerBudgetMessageList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<java.util.List<com.criteo.marketing.model.SellerBudgetMessage>> sellerBudgetMessageListApiResponse3 = sellersV2Api0.updateSellerBudgetsWithHttpInfo("customLabel2", updateSellerBudgetMessageList2);
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: Missing the required parameter 'updateSellerBudgets' when calling updateSellerBudgets(Async)");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum timezoneEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.PST;
        org.junit.Assert.assertTrue("'" + timezoneEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.PST + "'", timezoneEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.TimezoneEnum.PST));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        java.time.OffsetDateTime offsetDateTime6 = null;
        java.time.OffsetDateTime offsetDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.SellerBudgetMessage> sellerBudgetMessageList9 = sellersV2Api0.getBudgetsBySellerCampaignId("amount", "adult", "categoryName", (java.lang.Boolean) false, (java.lang.Boolean) false, offsetDateTime6, offsetDateTime7, "targetCountry");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage0 = new com.criteo.marketing.model.CampaignReportQueryMessage();
        com.criteo.marketing.model.CampaignReportQueryMessage.FormatEnum formatEnum1 = campaignReportQueryMessage0.getFormat();
        org.junit.Assert.assertNull(formatEnum1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.String str0 = com.criteo.marketing.model.AdvertiserCampaignMessage.SERIALIZED_NAME_CAMPAIGN_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignStatus" + "'", str0, "campaignStatus");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        java.lang.String str0 = com.criteo.marketing.model.PublisherStatsMessage.SERIALIZED_NAME_ADVERTISER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advertiserId" + "'", str0, "advertiserId");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.WEEK;
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.WEEK + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.WEEK));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.criteo.marketing.model.MessageWithDetailsCampaignBidChangeResponse messageWithDetailsCampaignBidChangeResponse0 = new com.criteo.marketing.model.MessageWithDetailsCampaignBidChangeResponse();
        com.criteo.marketing.model.MessageWithDetailsCampaignBidChangeResponse messageWithDetailsCampaignBidChangeResponse2 = messageWithDetailsCampaignBidChangeResponse0.message("bid");
        org.junit.Assert.assertNotNull(messageWithDetailsCampaignBidChangeResponse2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.criteo.marketing.api.PublishersApi publishersApi0 = new com.criteo.marketing.api.PublishersApi();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.CATEGORIESNOTENABLED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.CATEGORIESNOTENABLED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdateError.ErrorCodeEnum.CATEGORIESNOTENABLED));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        java.lang.String str0 = com.criteo.marketing.model.CategoryUpdateInput.SERIALIZED_NAME_CATEGORY_HASH_CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categoryHashCode" + "'", str0, "categoryHashCode");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        com.criteo.marketing.ApiException apiException1 = new com.criteo.marketing.ApiException("advertiserId");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage0 = new com.criteo.marketing.model.CampaignReportQueryMessage();
        java.lang.String str1 = campaignReportQueryMessage0.toString();
        java.lang.String[] strArray24 = new java.lang.String[] { "minHandlingTime", "customLabel3", "installment", "campaignBid", "installment", "schema", "categories", "class AdvertiserCampaignMessage {\n    id: null\n    campaignName: null\n    campaignStatus: null\n    status: null\n}", "Active", "bid", "mpn", "bid", "class SellerMessage {\n    campaignId: null\n    sellers: null\n}", "minHandlingTime", "status", "numberOfReviews", "categoryHashCode", "active", "material", "timezone", "budgetId", "sellerId" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage27 = campaignReportQueryMessage0.metrics((java.util.List<java.lang.String>) strList25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class CampaignReportQueryMessage {\n    advertiserIds: null\n    startDate: null\n    endDate: null\n    dimensions: null\n    metrics: null\n    format: null\n    currency: null\n    timezone: null\n}" + "'", str1, "class CampaignReportQueryMessage {\n    advertiserIds: null\n    startDate: null\n    endDate: null\n    dimensions: null\n    metrics: null\n    format: null\n    currency: null\n    timezone: null\n}");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(campaignReportQueryMessage27);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.MOVEDPERMANENTLY;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.MOVEDPERMANENTLY + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.MOVEDPERMANENTLY));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.ShippingSize.UnitEnum unitEnum1 = com.criteo.marketing.model.ShippingSize.UnitEnum.fromValue("rate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'rate'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String str0 = com.criteo.marketing.model.MessageWithDetailsCampaignBidChangeResponse.SERIALIZED_NAME_MESSAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "message" + "'", str0, "message");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_PRICE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "price" + "'", str0, "price");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_DISPLAY_ADS_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "displayAdsValue" + "'", str0, "displayAdsValue");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.criteo.marketing.model.CategoryUpdateError categoryUpdateError0 = new com.criteo.marketing.model.CategoryUpdateError();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum1 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.fromValue("campaignBid");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'campaignBid'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        java.lang.String str0 = com.criteo.marketing.model.AudienceResponse.SERIALIZED_NAME_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "id" + "'", str0, "id");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.criteo.marketing.model.AdvertiserCampaignMessage advertiserCampaignMessage0 = new com.criteo.marketing.model.AdvertiserCampaignMessage();
        com.criteo.marketing.model.AdvertiserCampaignMessage.StatusEnum statusEnum1 = null;
        com.criteo.marketing.model.AdvertiserCampaignMessage advertiserCampaignMessage2 = advertiserCampaignMessage0.status(statusEnum1);
        com.criteo.marketing.model.AdvertiserCampaignMessage advertiserCampaignMessage4 = advertiserCampaignMessage2.campaignName("categoryName");
        boolean boolean6 = advertiserCampaignMessage2.equals((java.lang.Object) "status");
        com.criteo.marketing.model.AdvertiserCampaignMessage.StatusEnum statusEnum7 = null;
        advertiserCampaignMessage2.setStatus(statusEnum7);
        org.junit.Assert.assertNotNull(advertiserCampaignMessage2);
        org.junit.Assert.assertNotNull(advertiserCampaignMessage4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        com.criteo.marketing.model.CampaignBidChangeRequest[] campaignBidChangeRequestArray3 = new com.criteo.marketing.model.CampaignBidChangeRequest[] {};
        java.util.ArrayList<com.criteo.marketing.model.CampaignBidChangeRequest> campaignBidChangeRequestList4 = new java.util.ArrayList<com.criteo.marketing.model.CampaignBidChangeRequest>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.CampaignBidChangeRequest>) campaignBidChangeRequestList4, campaignBidChangeRequestArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.CampaignMessage> campaignMessageList6 = campaignsApi1.updateBids("currency", (java.util.List<com.criteo.marketing.model.CampaignBidChangeRequest>) campaignBidChangeRequestList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(campaignBidChangeRequestArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.criteo.marketing.model.LoyaltyPointsV3 loyaltyPointsV3_0 = new com.criteo.marketing.model.LoyaltyPointsV3();
        java.lang.String str1 = loyaltyPointsV3_0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class LoyaltyPointsV3 {\n    name: null\n    pointsValue: null\n    ratio: null\n}" + "'", str1, "class LoyaltyPointsV3 {\n    name: null\n    pointsValue: null\n    ratio: null\n}");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_GOOGLE_PRODUCT_CATEGORY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "googleProductCategory" + "'", str0, "googleProductCategory");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.criteo.marketing.model.SellerBudgetUpdateMessage sellerBudgetUpdateMessage0 = new com.criteo.marketing.model.SellerBudgetUpdateMessage();
        sellerBudgetUpdateMessage0.setBudgetId((java.lang.Long) 1L);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = null;
        campaignsApi1.setApiClient(apiClient2);
        com.criteo.marketing.ApiCallback apiCallback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call12 = campaignsApi1.getBidsCall("googleProductCategory", "sampleInvalidIdentifiers", "campaignStatus", "customLabel0", "pattern", "nbInvalidIdentifiers", (java.lang.Boolean) false, apiCallback11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.PublishersApi publishersApi1 = new com.criteo.marketing.api.PublishersApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = null;
        publishersApi1.setApiClient(apiClient2);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.criteo.marketing.model.ProductShippingDimensionV3 productShippingDimensionV3_0 = new com.criteo.marketing.model.ProductShippingDimensionV3();
        java.lang.String str1 = productShippingDimensionV3_0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class ProductShippingDimensionV3 {\n    value: null\n    unit: null\n}" + "'", str1, "class ProductShippingDimensionV3 {\n    value: null\n    unit: null\n}");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.String str0 = com.criteo.marketing.model.PolicyRouteInfo.SERIALIZED_NAME_CONTROLLER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "controllerName" + "'", str0, "controllerName");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        java.lang.String str0 = com.criteo.marketing.model.AudiencesGetResponse.SERIALIZED_NAME_AUDIENCES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "audiences" + "'", str0, "audiences");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.UNUSED;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.UNUSED + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.UNUSED));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_SALE_PRICE_EFFECTIVE_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "salePriceEffectiveDate" + "'", str0, "salePriceEffectiveDate");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetUpdateMessage.SERIALIZED_NAME_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.criteo.marketing.model.SellerBudgetInfoMessage sellerBudgetInfoMessage0 = new com.criteo.marketing.model.SellerBudgetInfoMessage();
        com.criteo.marketing.model.SellerBudgetInfoMessage sellerBudgetInfoMessage2 = sellerBudgetInfoMessage0.remainingAmount((java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(sellerBudgetInfoMessage2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "id" };
        boolean boolean5 = com.criteo.marketing.StringUtil.containsIgnoreCase(strArray3, "hi!");
        boolean boolean7 = com.criteo.marketing.StringUtil.containsIgnoreCase(strArray3, "costOfGoodsSold");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        com.criteo.marketing.ApiCallback<com.criteo.marketing.model.AdvertiserInfoMessage> advertiserInfoMessageApiCallback3 = null;
        okhttp3.Call call4 = sellersV2Api0.getAdvertiserAsync((java.lang.Integer) 100, "categories", advertiserInfoMessageApiCallback3);
        com.criteo.marketing.ApiCallback<com.criteo.marketing.model.SellerCampaignMessage> sellerCampaignMessageApiCallback7 = null;
        okhttp3.Call call8 = sellersV2Api0.getSellerCampaignAsync("", "entries", sellerCampaignMessageApiCallback7);
        java.time.OffsetDateTime offsetDateTime14 = null;
        java.time.OffsetDateTime offsetDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<java.util.List<com.criteo.marketing.model.SellerBudgetMessage>> sellerBudgetMessageListApiResponse17 = sellersV2Api0.getBudgetsBySellerCampaignIdWithHttpInfo("", "entries", "gumCallerId", (java.lang.Boolean) false, (java.lang.Boolean) false, offsetDateTime14, offsetDateTime15, "Unknown");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(call4);
        org.junit.Assert.assertNotNull(call8);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        java.lang.String str0 = com.criteo.marketing.model.BudgetMessage.SERIALIZED_NAME_REMAINING_BUDGET_UPDATED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "remainingBudgetUpdated" + "'", str0, "remainingBudgetUpdated");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sellersV2Api0.getSellerAdDemo((java.lang.Integer) 100, (java.lang.Long) 1L, "", (java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: username or password is not present.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePutRequest.SERIALIZED_NAME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.criteo.marketing.model.SellerMessage sellerMessage0 = new com.criteo.marketing.model.SellerMessage();
        java.lang.String str1 = sellerMessage0.toString();
        sellerMessage0.setCampaignId((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class SellerMessage {\n    campaignId: null\n    sellers: null\n}" + "'", str1, "class SellerMessage {\n    campaignId: null\n    sellers: null\n}");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        java.lang.String str0 = com.criteo.marketing.model.AdvertiserInfoMessage.SERIALIZED_NAME_CURRENCY_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "currencyName" + "'", str0, "currencyName");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.criteo.marketing.model.SellerBudgetResponseMessage sellerBudgetResponseMessage0 = new com.criteo.marketing.model.SellerBudgetResponseMessage();
        sellerBudgetResponseMessage0.setSellerName("campaignBid");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.criteo.marketing.ApiException apiException0 = new com.criteo.marketing.ApiException();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        com.criteo.marketing.ApiCallback<com.criteo.marketing.model.AdvertiserInfoMessage> advertiserInfoMessageApiCallback3 = null;
        okhttp3.Call call4 = sellersV2Api0.getAdvertiserAsync((java.lang.Integer) 100, "categories", advertiserInfoMessageApiCallback3);
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<java.util.List<com.criteo.marketing.model.SellerCampaignMessage>> sellerCampaignMessageListApiResponse10 = sellersV2Api0.getSellerCampaignsBySellerWithHttpInfo("categoryHashcode", "campaignBid", "numberOfReviews", (java.lang.Integer) 1, "sellerId");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(call4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.criteo.marketing.model.PublisherStatsQueryMessage publisherStatsQueryMessage0 = new com.criteo.marketing.model.PublisherStatsQueryMessage();
        com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum1 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.ADVERTISER;
        boolean boolean2 = publisherStatsQueryMessage0.equals((java.lang.Object) dimensionsEnum1);
        java.lang.String str3 = dimensionsEnum1.getValue();
        org.junit.Assert.assertTrue("'" + dimensionsEnum1 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.ADVERTISER + "'", dimensionsEnum1.equals(com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.ADVERTISER));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Advertiser" + "'", str3, "Advertiser");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        java.lang.String str0 = com.criteo.marketing.model.ProductShippingWeightV3.SERIALIZED_NAME_VALUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "value" + "'", str0, "value");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_PRODUCT_RATING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "productRating" + "'", str0, "productRating");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        com.google.gson.TypeAdapter<java.time.OffsetDateTime> offsetDateTimeTypeAdapter1 = offsetDateTimeTypeAdapter0.nullSafe();
        org.junit.Assert.assertNotNull(offsetDateTimeTypeAdapter1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        java.lang.String str0 = com.criteo.marketing.model.UpdateSellerBudgetMessageBase.SERIALIZED_NAME_START_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startDate" + "'", str0, "startDate");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        java.lang.String str0 = com.criteo.marketing.model.AdvertiserQuotaMessage.SERIALIZED_NAME_QUOTA_LIMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "quotaLimit" + "'", str0, "quotaLimit");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetResponseMessage.SERIALIZED_NAME_START_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "startDate" + "'", str0, "startDate");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.criteo.marketing.model.CampaignBidMessage campaignBidMessage0 = new com.criteo.marketing.model.CampaignBidMessage();
        java.util.List<com.criteo.marketing.model.CategoryBidMessage> categoryBidMessageList1 = campaignBidMessage0.getCategories();
        java.lang.String str2 = campaignBidMessage0.getCampaignName();
        java.lang.String str3 = campaignBidMessage0.toString();
        org.junit.Assert.assertNull(categoryBidMessageList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class CampaignBidMessage {\n    campaignId: null\n    campaignName: null\n    campaignBid: null\n    categories: null\n    campaignStatus: null\n}" + "'", str3, "class CampaignBidMessage {\n    campaignId: null\n    campaignName: null\n    campaignBid: null\n    categories: null\n    campaignStatus: null\n}");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        okhttp3.MediaType mediaType0 = null;
        okio.ByteString byteString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.ResponseBody responseBody2 = okhttp3.ResponseBody.create(mediaType0, byteString1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: byteString == null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.criteo.marketing.model.CatalogProduct.MethodEnum methodEnum0 = com.criteo.marketing.model.CatalogProduct.MethodEnum.DELETE;
        org.junit.Assert.assertTrue("'" + methodEnum0 + "' != '" + com.criteo.marketing.model.CatalogProduct.MethodEnum.DELETE + "'", methodEnum0.equals(com.criteo.marketing.model.CatalogProduct.MethodEnum.DELETE));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.criteo.marketing.model.SellerBase sellerBase0 = new com.criteo.marketing.model.SellerBase();
        java.lang.String str1 = sellerBase0.getSellerName();
        sellerBase0.setSellerName("service");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.String str0 = com.criteo.marketing.model.ErrorSource.SERIALIZED_NAME_STATUS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "status" + "'", str0, "status");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_SIZE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sizeType" + "'", str0, "sizeType");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_CONTENT_LANGUAGE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "contentLanguage" + "'", str0, "contentLanguage");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        com.criteo.marketing.model.RoutePolicy routePolicy0 = new com.criteo.marketing.model.RoutePolicy();
        com.criteo.marketing.model.PolicyRouteInfo policyRouteInfo1 = routePolicy0.getPolicyRouteInfo();
        org.junit.Assert.assertNull(policyRouteInfo1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.INACTIVECATEGORY;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.INACTIVECATEGORY + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.INACTIVECATEGORY));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_MATERIAL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "material" + "'", str0, "material");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        com.criteo.marketing.model.SellerMessage sellerMessage0 = new com.criteo.marketing.model.SellerMessage();
        java.lang.Integer int1 = sellerMessage0.getCampaignId();
        com.criteo.marketing.model.SellerMessage sellerMessage2 = new com.criteo.marketing.model.SellerMessage();
        com.criteo.marketing.model.SellerInfoMessage[] sellerInfoMessageArray3 = new com.criteo.marketing.model.SellerInfoMessage[] {};
        java.util.ArrayList<com.criteo.marketing.model.SellerInfoMessage> sellerInfoMessageList4 = new java.util.ArrayList<com.criteo.marketing.model.SellerInfoMessage>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.SellerInfoMessage>) sellerInfoMessageList4, sellerInfoMessageArray3);
        sellerMessage2.setSellers((java.util.List<com.criteo.marketing.model.SellerInfoMessage>) sellerInfoMessageList4);
        com.criteo.marketing.model.SellerMessage sellerMessage7 = sellerMessage0.sellers((java.util.List<com.criteo.marketing.model.SellerInfoMessage>) sellerInfoMessageList4);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(sellerInfoMessageArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sellerMessage7);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        java.lang.String str0 = com.criteo.marketing.model.CampaignBidChangeResponse.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.TEMPORARYREDIRECT;
        java.lang.String str1 = statusEnum0.toString();
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.TEMPORARYREDIRECT + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.TEMPORARYREDIRECT));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TemporaryRedirect" + "'", str1, "TemporaryRedirect");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePatchResponse.SERIALIZED_NAME_REQUEST_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "requestDate" + "'", str0, "requestDate");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_ADS_GROUPING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "adsGrouping" + "'", str0, "adsGrouping");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        com.criteo.marketing.model.Shipping shipping0 = new com.criteo.marketing.model.Shipping();
        com.criteo.marketing.model.Shipping shipping2 = shipping0.locationId((java.lang.Long) 0L);
        org.junit.Assert.assertNotNull(shipping2);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum dimensionsEnum0 = com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.WEEK;
        java.lang.String str1 = dimensionsEnum0.getValue();
        org.junit.Assert.assertTrue("'" + dimensionsEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.WEEK + "'", dimensionsEnum0.equals(com.criteo.marketing.model.StatsQueryMessageEx.DimensionsEnum.WEEK));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Week" + "'", str1, "Week");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        com.criteo.marketing.model.SellerCampaignMessage sellerCampaignMessage0 = new com.criteo.marketing.model.SellerCampaignMessage();
        java.time.OffsetDateTime offsetDateTime1 = null;
        com.criteo.marketing.model.SellerCampaignMessage sellerCampaignMessage2 = sellerCampaignMessage0.suspendedSince(offsetDateTime1);
        com.criteo.marketing.model.SellerCampaignMessage sellerCampaignMessage4 = sellerCampaignMessage0.bid((java.lang.Double) 1.0d);
        sellerCampaignMessage0.setCampaignId((java.lang.Integer) 10);
        java.time.OffsetDateTime offsetDateTime7 = null;
        com.criteo.marketing.model.SellerCampaignMessage sellerCampaignMessage8 = sellerCampaignMessage0.suspendedSince(offsetDateTime7);
        org.junit.Assert.assertNotNull(sellerCampaignMessage2);
        org.junit.Assert.assertNotNull(sellerCampaignMessage4);
        org.junit.Assert.assertNotNull(sellerCampaignMessage8);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        com.criteo.marketing.JSON.DateTypeAdapter dateTypeAdapter0 = new com.criteo.marketing.JSON.DateTypeAdapter();
        java.io.Writer writer1 = null;
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter0.toJson(writer1, date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage4 = categoryMessage0.categoryName("sampleInvalidIdentifiers");
        com.criteo.marketing.model.CategoryMessage categoryMessage6 = categoryMessage4.campaignName("class ThrottlePolicy {\n    policyType: null\n    rates: null\n}");
        java.lang.String str7 = categoryMessage6.toString();
        java.lang.String str8 = categoryMessage6.getAdvertiserName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(categoryMessage4);
        org.junit.Assert.assertNotNull(categoryMessage6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class CategoryMessage {\n    categoryHashCode: null\n    categoryName: sampleInvalidIdentifiers\n    catalogId: null\n    catalogName: null\n    advertiserId: null\n    advertiserName: null\n    campaignId: null\n    campaignName: class ThrottlePolicy {\n        policyType: null\n        rates: null\n    }\n    averagePrice: null\n    numberOfProducts: null\n    categoryBid: null\n    enabled: null\n}" + "'", str7, "class CategoryMessage {\n    categoryHashCode: null\n    categoryName: sampleInvalidIdentifiers\n    catalogId: null\n    catalogName: null\n    advertiserId: null\n    advertiserName: null\n    campaignId: null\n    campaignName: class ThrottlePolicy {\n        policyType: null\n        rates: null\n    }\n    averagePrice: null\n    numberOfProducts: null\n    categoryBid: null\n    enabled: null\n}");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum dimensionsEnum1 = com.criteo.marketing.model.StatsQueryMessage.DimensionsEnum.fromValue("updated");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'updated'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test334");
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum statusEnum1 = com.criteo.marketing.model.SellerBudgetResponseMessage.StatusEnum.fromValue("class CampaignBidMessage {\n    campaignId: null\n    campaignName: null\n    campaignBid: null\n    categories: null\n    campaignStatus: null\n}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unexpected value 'class CampaignBidMessage {?    campaignId: null?    campaignName: null?    campaignBid: null?    categories: null?    campaignStatus: null?}'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        com.criteo.marketing.api.AudiencesApi audiencesApi0 = new com.criteo.marketing.api.AudiencesApi();
        com.criteo.marketing.model.AudiencePutRequest audiencePutRequest3 = null;
        com.criteo.marketing.ApiCallback apiCallback4 = null;
        okhttp3.Call call5 = audiencesApi0.updateAudienceMetadataCall((java.lang.Integer) 100, "categoryHashCode", audiencePutRequest3, apiCallback4);
        org.junit.Assert.assertNotNull(call5);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        java.lang.String str0 = com.criteo.marketing.model.AudienceResponse.SERIALIZED_NAME_NB_LINES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "nbLines" + "'", str0, "nbLines");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.StatisticsApi statisticsApi1 = new com.criteo.marketing.api.StatisticsApi(apiClient0);
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage3 = new com.criteo.marketing.model.CampaignReportQueryMessage();
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<byte[]> byteArrayApiResponse4 = statisticsApi1.getCampaignReportWithHttpInfo("productRating", campaignReportQueryMessage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.SellersV2StatsApi sellersV2StatsApi1 = new com.criteo.marketing.api.SellersV2StatsApi(apiClient0);
        java.time.OffsetDateTime offsetDateTime5 = null;
        java.time.OffsetDateTime offsetDateTime6 = null;
        com.criteo.marketing.ApiCallback<byte[]> byteArrayApiCallback11 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call12 = sellersV2StatsApi1.sellerCampaignsAsync("", "targetCountry", "ageGroup", offsetDateTime5, offsetDateTime6, "offerId", "customLabel1", (java.lang.Integer) 1, (java.lang.Integer) 0, byteArrayApiCallback11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        com.criteo.marketing.model.UpdateSellerBudgetMessage updateSellerBudgetMessage0 = new com.criteo.marketing.model.UpdateSellerBudgetMessage();
        java.lang.Boolean boolean1 = updateSellerBudgetMessage0.getIsSuspended();
        java.time.OffsetDateTime offsetDateTime2 = null;
        updateSellerBudgetMessage0.setStartDate(offsetDateTime2);
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        com.criteo.marketing.model.PublisherStatsQueryMessage publisherStatsQueryMessage0 = new com.criteo.marketing.model.PublisherStatsQueryMessage();
        java.lang.String str1 = publisherStatsQueryMessage0.getAdvertiserIds();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.StatisticsApi statisticsApi1 = new com.criteo.marketing.api.StatisticsApi(apiClient0);
        com.criteo.marketing.model.StatsQueryMessageEx statsQueryMessageEx3 = null;
        com.criteo.marketing.ApiCallback<byte[]> byteArrayApiCallback4 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call5 = statisticsApi1.getStatsAsync("rate", statsQueryMessageEx3, byteArrayApiCallback4);
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: Missing the required parameter 'statsQuery' when calling getStats(Async)");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.SellersV2StatsApi sellersV2StatsApi1 = new com.criteo.marketing.api.SellersV2StatsApi(apiClient0);
        java.time.OffsetDateTime offsetDateTime5 = null;
        java.time.OffsetDateTime offsetDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<byte[]> byteArrayApiResponse10 = sellersV2StatsApi1.campaignsWithHttpInfo("class CampaignReportQueryMessage {\n    advertiserIds: null\n    startDate: null\n    endDate: null\n    dimensions: null\n    metrics: null\n    format: null\n    currency: null\n    timezone: null\n}", "tax", "umsId", offsetDateTime5, offsetDateTime6, "campaignId", (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.AuthenticationApi authenticationApi1 = new com.criteo.marketing.api.AuthenticationApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = authenticationApi1.getApiClient();
        com.criteo.marketing.ApiClient apiClient3 = authenticationApi1.getApiClient();
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.InlineResponse200 inlineResponse200_7 = authenticationApi1.oAuth2TokenPost("currency", "categoryHashcode", "quotaLimit");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(apiClient2);
        org.junit.Assert.assertNull(apiClient3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_PRODUCT_TYPE_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "productTypeKey" + "'", str0, "productTypeKey");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        com.criteo.marketing.model.SellerBudgetInfoMessage sellerBudgetInfoMessage0 = new com.criteo.marketing.model.SellerBudgetInfoMessage();
        sellerBudgetInfoMessage0.setBudgetId((java.lang.Long) (-1L));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        java.lang.String str0 = com.criteo.marketing.model.CategoryMessage.SERIALIZED_NAME_NUMBER_OF_PRODUCTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "numberOfProducts" + "'", str0, "numberOfProducts");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        com.criteo.marketing.model.CampaignBidMessage campaignBidMessage0 = new com.criteo.marketing.model.CampaignBidMessage();
        com.criteo.marketing.model.CategoryBidMessage categoryBidMessage1 = new com.criteo.marketing.model.CategoryBidMessage();
        com.criteo.marketing.model.CategoryBidMessage[] categoryBidMessageArray2 = new com.criteo.marketing.model.CategoryBidMessage[] { categoryBidMessage1 };
        java.util.ArrayList<com.criteo.marketing.model.CategoryBidMessage> categoryBidMessageList3 = new java.util.ArrayList<com.criteo.marketing.model.CategoryBidMessage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.CategoryBidMessage>) categoryBidMessageList3, categoryBidMessageArray2);
        com.criteo.marketing.model.CampaignBidMessage campaignBidMessage5 = campaignBidMessage0.categories((java.util.List<com.criteo.marketing.model.CategoryBidMessage>) categoryBidMessageList3);
        com.criteo.marketing.model.BidMessage bidMessage6 = null;
        campaignBidMessage5.setCampaignBid(bidMessage6);
        com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum campaignStatusEnum8 = com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum.ARCHIVED;
        campaignBidMessage5.setCampaignStatus(campaignStatusEnum8);
        org.junit.Assert.assertNotNull(categoryBidMessageArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(campaignBidMessage5);
        org.junit.Assert.assertTrue("'" + campaignStatusEnum8 + "' != '" + com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum.ARCHIVED + "'", campaignStatusEnum8.equals(com.criteo.marketing.model.CampaignBidMessage.CampaignStatusEnum.ARCHIVED));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProduct.SERIALIZED_NAME_ADWORD_REDIRECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "adwordRedirect" + "'", str0, "adwordRedirect");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetMessage.SERIALIZED_NAME_SELLER_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sellerId" + "'", str0, "sellerId");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.SellersV2StatsApi sellersV2StatsApi1 = new com.criteo.marketing.api.SellersV2StatsApi(apiClient0);
        java.time.OffsetDateTime offsetDateTime5 = null;
        java.time.OffsetDateTime offsetDateTime6 = null;
        com.criteo.marketing.ApiCallback<byte[]> byteArrayApiCallback10 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call11 = sellersV2StatsApi1.campaignsAsync("price", "campaignId", "Seller", offsetDateTime5, offsetDateTime6, "shippingWeight", (java.lang.Integer) 1, (java.lang.Integer) 0, byteArrayApiCallback10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        com.criteo.marketing.model.Shipping shipping0 = new com.criteo.marketing.model.Shipping();
        shipping0.setCountry("loyatyPoints");
        com.criteo.marketing.model.Shipping shipping4 = shipping0.service("sellerBudgets");
        com.criteo.marketing.model.Shipping shipping6 = shipping4.region("customLabel0");
        org.junit.Assert.assertNotNull(shipping4);
        org.junit.Assert.assertNotNull(shipping6);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        java.lang.String str0 = com.criteo.marketing.model.SellerCampaignMessage.SERIALIZED_NAME_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "id" + "'", str0, "id");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        java.lang.String str0 = com.criteo.marketing.model.SellerBase.SERIALIZED_NAME_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "id" + "'", str0, "id");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        com.criteo.marketing.model.SellerBudgetUpdateMessage sellerBudgetUpdateMessage0 = new com.criteo.marketing.model.SellerBudgetUpdateMessage();
        sellerBudgetUpdateMessage0.setAmount((java.lang.Double) 0.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        com.criteo.marketing.api.CampaignsApi campaignsApi0 = new com.criteo.marketing.api.CampaignsApi();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<com.criteo.marketing.model.CategoryMessage> categoryMessageApiResponse5 = campaignsApi1.getCategoriesWithHttpInfo((java.lang.Integer) 1, "class SellerBudgetsCreateMessage {\n    campaignId: null\n    sellerBudgets: [null]\n}", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage0 = new com.criteo.marketing.model.CampaignReportQueryMessage();
        java.lang.String str1 = campaignReportQueryMessage0.getCurrency();
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage3 = campaignReportQueryMessage0.currency("price");
        com.criteo.marketing.model.CampaignReportQueryMessage campaignReportQueryMessage5 = campaignReportQueryMessage0.addMetricsItem("requestDate");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(campaignReportQueryMessage3);
        org.junit.Assert.assertNotNull(campaignReportQueryMessage5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        java.lang.String str0 = com.criteo.marketing.model.UpdateSellerBudgetMessage.SERIALIZED_NAME_BUDGET_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "budgetId" + "'", str0, "budgetId");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        com.criteo.marketing.model.StatsQueryMessage.TimezoneEnum timezoneEnum0 = com.criteo.marketing.model.StatsQueryMessage.TimezoneEnum.JST;
        java.lang.String str1 = timezoneEnum0.toString();
        org.junit.Assert.assertTrue("'" + timezoneEnum0 + "' != '" + com.criteo.marketing.model.StatsQueryMessage.TimezoneEnum.JST + "'", timezoneEnum0.equals(com.criteo.marketing.model.StatsQueryMessage.TimezoneEnum.JST));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "JST" + "'", str1, "JST");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        com.criteo.marketing.JSON.DateTypeAdapter dateTypeAdapter0 = new com.criteo.marketing.JSON.DateTypeAdapter();
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = dateTypeAdapter0.fromJson(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        com.criteo.marketing.model.CampaignBidChangeResponse campaignBidChangeResponse0 = new com.criteo.marketing.model.CampaignBidChangeResponse();
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum1 = campaignBidChangeResponse0.getErrorCode();
        org.junit.Assert.assertNull(errorCodeEnum1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        java.lang.String str0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.SERIALIZED_NAME_CATEGORIES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "categories" + "'", str0, "categories");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        java.lang.String str0 = com.criteo.marketing.model.InlineResponse200.SERIALIZED_NAME_ACCESS_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "access_token" + "'", str0, "access_token");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        com.criteo.marketing.model.CategoryMessage categoryMessage0 = new com.criteo.marketing.model.CategoryMessage();
        boolean boolean2 = categoryMessage0.equals((java.lang.Object) "budgetType");
        com.criteo.marketing.model.CategoryMessage categoryMessage4 = categoryMessage0.categoryName("sampleInvalidIdentifiers");
        categoryMessage4.setCategoryHashCode((java.lang.Integer) 1);
        com.criteo.marketing.model.SellerMessage sellerMessage7 = new com.criteo.marketing.model.SellerMessage();
        com.criteo.marketing.model.SellerInfoMessage[] sellerInfoMessageArray8 = new com.criteo.marketing.model.SellerInfoMessage[] {};
        java.util.ArrayList<com.criteo.marketing.model.SellerInfoMessage> sellerInfoMessageList9 = new java.util.ArrayList<com.criteo.marketing.model.SellerInfoMessage>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.SellerInfoMessage>) sellerInfoMessageList9, sellerInfoMessageArray8);
        sellerMessage7.setSellers((java.util.List<com.criteo.marketing.model.SellerInfoMessage>) sellerInfoMessageList9);
        boolean boolean12 = categoryMessage4.equals((java.lang.Object) sellerMessage7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(categoryMessage4);
        org.junit.Assert.assertNotNull(sellerInfoMessageArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        java.lang.String str0 = com.criteo.marketing.model.CustomAttributeV3.SERIALIZED_NAME_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.model.SellerBudgetMessage sellerBudgetMessage3 = sellersV2Api0.getSellerBudget((java.lang.Long) 100L, "entries");
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.PublishersApi publishersApi1 = new com.criteo.marketing.api.PublishersApi(apiClient0);
        com.criteo.marketing.model.PublisherStatsQueryMessage publisherStatsQueryMessage3 = new com.criteo.marketing.model.PublisherStatsQueryMessage();
        com.criteo.marketing.model.PublisherStatsQueryMessage publisherStatsQueryMessage5 = publisherStatsQueryMessage3.advertiserIds("errorCode");
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.PublisherStatsMessage>> publisherStatsMessageListApiCallback6 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call7 = publishersApi1.getStatsAsync("errorCode", publisherStatsQueryMessage3, publisherStatsMessageListApiCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(publisherStatsQueryMessage5);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        java.lang.String str0 = com.criteo.marketing.model.AudiencePatchRequest.SERIALIZED_NAME_IDENTIFIERS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "identifiers" + "'", str0, "identifiers");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        java.lang.String str0 = com.criteo.marketing.model.CampaignBidChangeRequest.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CampaignBidChangeResponse.ErrorCodeEnum.BIDDINGONTARGETBUDGETCAMPAIGNNOTALLOWED));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        com.criteo.marketing.model.SellerBudgetResponseMessage sellerBudgetResponseMessage0 = new com.criteo.marketing.model.SellerBudgetResponseMessage();
        sellerBudgetResponseMessage0.setAmount((java.lang.Double) (-1.0d));
        com.criteo.marketing.model.SellerBudgetResponseMessage sellerBudgetResponseMessage4 = sellerBudgetResponseMessage0.budgetId((java.lang.Long) 10L);
        sellerBudgetResponseMessage0.setBudgetId((java.lang.Long) 100L);
        org.junit.Assert.assertNotNull(sellerBudgetResponseMessage4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        com.criteo.marketing.model.UpdateSellerBudgetMessage updateSellerBudgetMessage2 = new com.criteo.marketing.model.UpdateSellerBudgetMessage();
        com.criteo.marketing.model.UpdateSellerBudgetMessage[] updateSellerBudgetMessageArray3 = new com.criteo.marketing.model.UpdateSellerBudgetMessage[] { updateSellerBudgetMessage2 };
        java.util.ArrayList<com.criteo.marketing.model.UpdateSellerBudgetMessage> updateSellerBudgetMessageList4 = new java.util.ArrayList<com.criteo.marketing.model.UpdateSellerBudgetMessage>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.UpdateSellerBudgetMessage>) updateSellerBudgetMessageList4, updateSellerBudgetMessageArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.criteo.marketing.ApiResponse<java.util.List<com.criteo.marketing.model.SellerBudgetMessage>> sellerBudgetMessageListApiResponse6 = sellersV2Api0.updateSellerBudgetsWithHttpInfo("id", (java.util.List<com.criteo.marketing.model.UpdateSellerBudgetMessage>) updateSellerBudgetMessageList4);
            org.junit.Assert.fail("Expected exception of type com.criteo.marketing.ApiException; message: ");
        } catch (com.criteo.marketing.ApiException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(updateSellerBudgetMessageArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.CampaignsApi campaignsApi1 = new com.criteo.marketing.api.CampaignsApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = null;
        campaignsApi1.setApiClient(apiClient2);
        com.criteo.marketing.model.CampaignBidChangeRequest[] campaignBidChangeRequestArray5 = new com.criteo.marketing.model.CampaignBidChangeRequest[] {};
        java.util.ArrayList<com.criteo.marketing.model.CampaignBidChangeRequest> campaignBidChangeRequestList6 = new java.util.ArrayList<com.criteo.marketing.model.CampaignBidChangeRequest>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.criteo.marketing.model.CampaignBidChangeRequest>) campaignBidChangeRequestList6, campaignBidChangeRequestArray5);
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.CampaignMessage>> campaignMessageListApiCallback8 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call9 = campaignsApi1.updateBidsAsync("categoryHashCode", (java.util.List<com.criteo.marketing.model.CampaignBidChangeRequest>) campaignBidChangeRequestList6, campaignMessageListApiCallback8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(campaignBidChangeRequestArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        java.lang.String str0 = com.criteo.marketing.model.CampaignReportQueryMessage.SERIALIZED_NAME_END_DATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "endDate" + "'", str0, "endDate");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError categoryUpdatesPerCatalogError0 = new com.criteo.marketing.model.CategoryUpdatesPerCatalogError();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter0 = new com.criteo.marketing.JSON.OffsetDateTimeTypeAdapter();
        java.time.OffsetDateTime offsetDateTime1 = null;
        com.google.gson.JsonElement jsonElement2 = offsetDateTimeTypeAdapter0.toJsonTree(offsetDateTime1);
        java.time.OffsetDateTime offsetDateTime3 = null;
        java.lang.String str4 = offsetDateTimeTypeAdapter0.toJson(offsetDateTime3);
        java.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        offsetDateTimeTypeAdapter0.setFormat(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(jsonElement2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.lang.String str0 = com.criteo.marketing.model.StatsQueryMessageEx.SERIALIZED_NAME_IGNORE_X_DEVICE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ignoreXDevice" + "'", str0, "ignoreXDevice");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.SellersV2StatsApi sellersV2StatsApi1 = new com.criteo.marketing.api.SellersV2StatsApi(apiClient0);
        java.time.OffsetDateTime offsetDateTime5 = null;
        java.time.OffsetDateTime offsetDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = sellersV2StatsApi1.sellerCampaigns("productTypeKey", "adult", "campaignStatus", offsetDateTime5, offsetDateTime6, "format", "format", (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.lang.String str0 = com.criteo.marketing.model.Tax.SERIALIZED_NAME_REGION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "region" + "'", str0, "region");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        com.criteo.marketing.model.BidMessage bidMessage0 = new com.criteo.marketing.model.BidMessage();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        com.criteo.marketing.model.SellerBudgetMessage.StatusEnum statusEnum0 = com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.CURRENT;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.CURRENT + "'", statusEnum0.equals(com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.CURRENT));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        com.criteo.marketing.model.CreateSellerBudgetMapiMessage createSellerBudgetMapiMessage0 = new com.criteo.marketing.model.CreateSellerBudgetMapiMessage();
        java.lang.String str1 = createSellerBudgetMapiMessage0.getSellerId();
        com.criteo.marketing.model.CreateSellerBudgetMapiMessage createSellerBudgetMapiMessage3 = createSellerBudgetMapiMessage0.sellerId("campaignId");
        java.time.OffsetDateTime offsetDateTime4 = null;
        createSellerBudgetMapiMessage0.setStartDate(offsetDateTime4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(createSellerBudgetMapiMessage3);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_MAX_HANDLING_TIME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "maxHandlingTime" + "'", str0, "maxHandlingTime");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        com.criteo.marketing.model.CampaignBidChangeResponse campaignBidChangeResponse0 = new com.criteo.marketing.model.CampaignBidChangeResponse();
        java.util.List<com.criteo.marketing.model.CategoryUpdateError> categoryUpdateErrorList1 = campaignBidChangeResponse0.getCategories();
        java.lang.Integer int2 = campaignBidChangeResponse0.getCampaignId();
        org.junit.Assert.assertNull(categoryUpdateErrorList1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        com.criteo.marketing.model.SellerBudgetMessage.StatusEnum statusEnum0 = com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.ARCHIVED;
        java.lang.String str1 = statusEnum0.toString();
        java.lang.String str2 = statusEnum0.toString();
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.ARCHIVED + "'", statusEnum0.equals(com.criteo.marketing.model.SellerBudgetMessage.StatusEnum.ARCHIVED));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Archived" + "'", str1, "Archived");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Archived" + "'", str2, "Archived");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        java.lang.String str0 = com.criteo.marketing.model.GoogleProductV3.SERIALIZED_NAME_ADS_LABELS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "adsLabels" + "'", str0, "adsLabels");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.SellersV2StatsApi sellersV2StatsApi1 = new com.criteo.marketing.api.SellersV2StatsApi(apiClient0);
        java.time.OffsetDateTime offsetDateTime5 = null;
        java.time.OffsetDateTime offsetDateTime6 = null;
        com.criteo.marketing.ApiCallback<byte[]> byteArrayApiCallback10 = null;
        // The following exception was thrown during execution in test generation
        try {
            okhttp3.Call call11 = sellersV2StatsApi1.sellersAsync("currencyName", "tax", "class AdvertiserCampaignMessage {\n    id: null\n    campaignName: null\n    campaignStatus: null\n    status: null\n}", offsetDateTime5, offsetDateTime6, "", (java.lang.Integer) (-1), (java.lang.Integer) 10, byteArrayApiCallback10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        com.criteo.marketing.model.ErrorSource.StatusEnum statusEnum0 = com.criteo.marketing.model.ErrorSource.StatusEnum.REDIRECTMETHOD;
        org.junit.Assert.assertTrue("'" + statusEnum0 + "' != '" + com.criteo.marketing.model.ErrorSource.StatusEnum.REDIRECTMETHOD + "'", statusEnum0.equals(com.criteo.marketing.model.ErrorSource.StatusEnum.REDIRECTMETHOD));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        java.lang.String str0 = com.criteo.marketing.model.SellerBudgetsMessage.SERIALIZED_NAME_CAMPAIGN_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "campaignId" + "'", str0, "campaignId");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum errorCodeEnum0 = com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.DUPLICATECATALOGENTRY;
        org.junit.Assert.assertTrue("'" + errorCodeEnum0 + "' != '" + com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.DUPLICATECATALOGENTRY + "'", errorCodeEnum0.equals(com.criteo.marketing.model.CategoryUpdatesPerCatalogError.ErrorCodeEnum.DUPLICATECATALOGENTRY));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        com.criteo.marketing.api.SellersV2Api sellersV2Api0 = new com.criteo.marketing.api.SellersV2Api();
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.SellerCampaignMessage>> sellerCampaignMessageListApiCallback3 = null;
        okhttp3.Call call4 = sellersV2Api0.getSellerCampaignsByAdvertiserAsync((java.lang.Integer) 10, "endDate", sellerCampaignMessageListApiCallback3);
        java.time.OffsetDateTime offsetDateTime9 = null;
        java.time.OffsetDateTime offsetDateTime10 = null;
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.SellerBudgetMessage>> sellerBudgetMessageListApiCallback15 = null;
        okhttp3.Call call16 = sellersV2Api0.getSellerBudgetsAsync("sampleInvalidIdentifiers", "additionalImageLink", (java.lang.Boolean) false, (java.lang.Boolean) true, offsetDateTime9, offsetDateTime10, (java.lang.Integer) 100, "customLabel4", "amount", (java.lang.Integer) 100, sellerBudgetMessageListApiCallback15);
        java.lang.String[] strArray53 = new java.lang.String[] { "startDate", "shippingHeight", "price", "nbInvalidIdentifiers", "active", "sellerId", "umsId", "googleProductCategory", "Inactive", "isSuspended", "costOfGoodsSold", "quotaLimit", "schema", "sellerBudgets", "price", "customLabel4", "class ThrottlePolicy {\n    policyType: null\n    rates: class ThrottlePolicyRates {\n        second: null\n        minute: null\n        hour: null\n        custom: null\n    }\n}", "shippingLabel", "contentLanguage", "isSuspended", "sellerName", "numberOfReviews", "hi!", "class CategoryMessage {\n    categoryHashCode: null\n    categoryName: sampleInvalidIdentifiers\n    catalogId: null\n    catalogName: null\n    advertiserId: null\n    advertiserName: null\n    campaignId: null\n    campaignName: class ThrottlePolicy {\n        policyType: null\n        rates: null\n    }\n    averagePrice: null\n    numberOfProducts: null\n    categoryBid: null\n    enabled: null\n}", "categoryName", "message", "budgetType", "tax", "policyRouteInfo", "remainingAmount", "contactEmail", "source", "TemporaryRedirect", "taxCategory" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        com.criteo.marketing.ApiCallback<java.util.List<com.criteo.marketing.model.SellerBase>> sellerBaseListApiCallback57 = null;
        okhttp3.Call call58 = sellersV2Api0.createSellersAsync((java.lang.Integer) 10, "remainingAmount", (java.util.List<java.lang.String>) strList54, (java.lang.Integer) 0, sellerBaseListApiCallback57);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.criteo.marketing.model.AdvertiserInfoMessage> advertiserInfoMessageList60 = sellersV2Api0.getAdvertisers("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: username or password is not present.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(call4);
        org.junit.Assert.assertNotNull(call16);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(call58);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        com.criteo.marketing.ApiClient apiClient0 = null;
        com.criteo.marketing.api.StatisticsApi statisticsApi1 = new com.criteo.marketing.api.StatisticsApi(apiClient0);
        com.criteo.marketing.ApiClient apiClient2 = null;
        statisticsApi1.setApiClient(apiClient2);
        com.criteo.marketing.ApiClient apiClient4 = statisticsApi1.getApiClient();
        org.junit.Assert.assertNull(apiClient4);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        com.criteo.marketing.model.CatalogProduct catalogProduct0 = new com.criteo.marketing.model.CatalogProduct();
        catalogProduct0.setProductId("modelNumber");
        com.criteo.marketing.model.CatalogProduct catalogProduct4 = catalogProduct0.catalogId((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(catalogProduct4);
    }
}

