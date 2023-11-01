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
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.KWD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KWD" + "'", str0, "KWD");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.PAB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PAB" + "'", str0, "PAB");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.HKD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HKD" + "'", str0, "HKD");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.USDC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "USDC" + "'", str0, "USDC");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.XPF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "XPF" + "'", str0, "XPF");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.TZS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TZS" + "'", str0, "TZS");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GTQ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GTQ" + "'", str0, "GTQ");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BRL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BRL" + "'", str0, "BRL");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("", "");
        // The following exception was thrown during execution in test generation
        try {
            com.bitpay.sdk_light.model.Bill.Bill bill4 = client2.getBill("KWD");
            org.junit.Assert.fail("Expected exception of type com.bitpay.sdk_light.BitPayException; message: Error - failed to retrieve HTTP response body : Error: This endpoint does not support the `public` facade");
        } catch (com.bitpay.sdk_light.BitPayException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CAD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CAD" + "'", str0, "CAD");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.TWD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TWD" + "'", str0, "TWD");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MWK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MWK" + "'", str0, "MWK");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GYD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GYD" + "'", str0, "GYD");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MVR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MVR" + "'", str0, "MVR");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MNT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MNT" + "'", str0, "MNT");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ETH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ETH" + "'", str0, "ETH");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.PLN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PLN" + "'", str0, "PLN");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SVC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SVC" + "'", str0, "SVC");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ZAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ZAR" + "'", str0, "ZAR");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("", "");
        // The following exception was thrown during execution in test generation
        try {
            com.bitpay.sdk_light.model.Invoice.Invoice invoice4 = client2.getInvoice("");
            org.junit.Assert.fail("Expected exception of type com.bitpay.sdk_light.BitPayException; message: Error - failed to retrieve HTTP response body : Error: This endpoint does not support the `public` facade");
        } catch (com.bitpay.sdk_light.BitPayException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.INR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "INR" + "'", str0, "INR");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MYR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MYR" + "'", str0, "MYR");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.IDR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "IDR" + "'", str0, "IDR");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SSP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SSP" + "'", str0, "SSP");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.RSD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RSD" + "'", str0, "RSD");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BBD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BBD" + "'", str0, "BBD");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.NIO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NIO" + "'", str0, "NIO");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.KMF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KMF" + "'", str0, "KMF");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.AFN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AFN" + "'", str0, "AFN");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.UZS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UZS" + "'", str0, "UZS");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.COU;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "COU" + "'", str0, "COU");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ILS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ILS" + "'", str0, "ILS");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.bitpay.sdk_light.model.Invoice.InvoiceStatus invoiceStatus0 = new com.bitpay.sdk_light.model.Invoice.InvoiceStatus();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.LYD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LYD" + "'", str0, "LYD");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig2 = null;
        java.lang.Boolean boolean3 = dateDeserializer0.supportsUpdate(deserializationConfig2);
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MRU;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MRU" + "'", str0, "MRU");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CHE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CHE" + "'", str0, "CHE");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MXN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MXN" + "'", str0, "MXN");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.HRK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HRK" + "'", str0, "HRK");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        java.lang.String str0 = com.bitpay.sdk_light.model.Invoice.InvoiceStatus.Expired;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "expired" + "'", str0, "expired");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.FJD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FJD" + "'", str0, "FJD");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.STN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "STN" + "'", str0, "STN");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SDG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SDG" + "'", str0, "SDG");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CDF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CDF" + "'", str0, "CDF");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.XAF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "XAF" + "'", str0, "XAF");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MXV;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MXV" + "'", str0, "MXV");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.util.Collection<java.lang.Object> objCollection2 = dateDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = dateDeserializer0.getNullValue(deserializationContext3);
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CRC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CRC" + "'", str0, "CRC");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MAD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MAD" + "'", str0, "MAD");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        java.lang.String str1 = rate0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.bitpay.sdk_light.model.Bill.BillStatus billStatus0 = new com.bitpay.sdk_light.model.Bill.BillStatus();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ZMW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ZMW" + "'", str0, "ZMW");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        rate0.setValue((java.lang.Double) 10.0d);
        rate0.setValue((java.lang.Double) 1.0d);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CNY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CNY" + "'", str0, "CNY");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.PHP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PHP" + "'", str0, "PHP");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GIP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GIP" + "'", str0, "GIP");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.RUB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RUB" + "'", str0, "RUB");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.XUA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "XUA" + "'", str0, "XUA");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        int int0 = com.bitpay.sdk_light.util.BitPayLogger.DEBUG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.DJF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DJF" + "'", str0, "DJF");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees2 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem3 = minerFees2.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem4 = minerFees2.getBtc();
        minerFees0.setEth(minerFeesItem4);
        java.lang.Class<?> wildcardClass6 = minerFees0.getClass();
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNotNull(minerFeesItem3);
        org.junit.Assert.assertNotNull(minerFeesItem4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SBD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SBD" + "'", str0, "SBD");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BOV;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BOV" + "'", str0, "BOV");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.KHR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KHR" + "'", str0, "KHR");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.FKP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "FKP" + "'", str0, "FKP");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        java.lang.String str0 = com.bitpay.sdk_light.model.Invoice.InvoiceStatus.Paid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "paid" + "'", str0, "paid");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.EGP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EGP" + "'", str0, "EGP");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SHP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SHP" + "'", str0, "SHP");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SZL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SZL" + "'", str0, "SZL");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ISK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ISK" + "'", str0, "ISK");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("PAB", "GTQ");
        client2.setLoggerLevel((int) (short) 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BWP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BWP" + "'", str0, "BWP");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BND" + "'", str0, "BND");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ETB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ETB" + "'", str0, "ETB");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MDL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MDL" + "'", str0, "MDL");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        int int0 = com.bitpay.sdk_light.util.BitPayLogger.INFO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        int int0 = com.bitpay.sdk_light.util.BitPayLogger.WARN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.KRW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KRW" + "'", str0, "KRW");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.TJS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TJS" + "'", str0, "TJS");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = dateDeserializer0.getDelegatee();
        com.fasterxml.jackson.core.JsonParser jsonParser3 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext4 = null;
        com.fasterxml.jackson.databind.jsontype.TypeDeserializer typeDeserializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dateDeserializer0.deserializeWithType(jsonParser3, deserializationContext4, typeDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        java.lang.String str0 = com.bitpay.sdk_light.model.Bill.BillStatus.Paid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "paid" + "'", str0, "paid");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.JOD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "JOD" + "'", str0, "JOD");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ERN" + "'", str0, "ERN");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.DOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DOP" + "'", str0, "DOP");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.NPR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NPR" + "'", str0, "NPR");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CLP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CLP" + "'", str0, "CLP");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BMD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BMD" + "'", str0, "BMD");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ARS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ARS" + "'", str0, "ARS");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SCR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SCR" + "'", str0, "SCR");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setPhone("SSP");
        java.lang.String str9 = bill6.getName();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getEmail();
        java.lang.String str3 = buyer0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.util.Collection<java.lang.Object> objCollection2 = dateDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        java.lang.Boolean boolean4 = dateDeserializer0.supportsUpdate(deserializationConfig3);
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer5 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern6 = dateDeserializer5.getEmptyAccessPattern();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer7 = dateDeserializer5.getDelegatee();
        boolean boolean8 = dateDeserializer5.isCachable();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer9 = dateDeserializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Long>) dateDeserializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + accessPattern6 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern6.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardJsonDeserializer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies0 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency1 = null;
        supportedTransactionCurrencies0.setBtc(supportedTransactionCurrency1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.JMD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "JMD" + "'", str0, "JMD");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer0.serialize((java.lang.Long) 10L, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.UYI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UYI" + "'", str0, "UYI");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.String str0 = com.bitpay.sdk_light.Env.Prod;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Prod" + "'", str0, "Prod");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.XCD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "XCD" + "'", str0, "XCD");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.util.Collection<java.lang.Object> objCollection2 = dateDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Object obj4 = dateDeserializer0.getEmptyValue(deserializationContext3);
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("PAB", "GTQ");
        org.apache.http.HttpResponse httpResponse5 = client2.post("ETB", "XAF");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray9 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList10 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList10, itemArray9);
        com.bitpay.sdk_light.model.Bill.Bill bill12 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList10);
        java.util.List<java.lang.String> strList13 = bill12.getCc();
        bill12.setId("FJD");
        bill12.setUrl("USDC");
        // The following exception was thrown during execution in test generation
        try {
            com.bitpay.sdk_light.model.Bill.Bill bill18 = client2.createBill(bill12);
            org.junit.Assert.fail("Expected exception of type com.bitpay.sdk_light.BitPayException; message: Error - failed to retrieve HTTP response body : Error: Invalid token");
        } catch (com.bitpay.sdk_light.BitPayException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpResponse5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.IQD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "IQD" + "'", str0, "IQD");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("PAB", "GTQ");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bitpay.sdk_light.model.Invoice.Invoice invoice4 = client2.createInvoice(invoice3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CUC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CUC" + "'", str0, "CUC");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SYP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SYP" + "'", str0, "SYP");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.LSL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LSL" + "'", str0, "LSL");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MUR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MUR" + "'", str0, "MUR");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("PAB", "GTQ");
        org.apache.http.HttpResponse httpResponse5 = client2.post("ETB", "XAF");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.bitpay.sdk_light.model.Invoice.Invoice invoice7 = client2.createInvoice(invoice6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpResponse5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GUSD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GUSD" + "'", str0, "GUSD");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.NGN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NGN" + "'", str0, "NGN");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        java.lang.String str0 = com.bitpay.sdk_light.model.Invoice.InvoiceStatus.Invalid;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invalid" + "'", str0, "invalid");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GNF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GNF" + "'", str0, "GNF");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.HUF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HUF" + "'", str0, "HUF");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SRD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SRD" + "'", str0, "SRD");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getAddress2();
        buyer0.setCountry("XPF");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SOS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SOS" + "'", str0, "SOS");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.PGK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PGK" + "'", str0, "PGK");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BIF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BIF" + "'", str0, "BIF");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.bitpay.sdk_light.BitPayException bitPayException1 = new com.bitpay.sdk_light.BitPayException("XPF");
        com.bitpay.sdk_light.BitPayException bitPayException3 = new com.bitpay.sdk_light.BitPayException("XPF");
        bitPayException1.addSuppressed((java.lang.Throwable) bitPayException3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setBtc(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setGusd(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = paymentTotal0.getBtc();
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ALL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ALL" + "'", str0, "ALL");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        buyer0.setPhone("CAD");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GBP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GBP" + "'", str0, "GBP");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.RON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "RON" + "'", str0, "RON");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BHD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BHD" + "'", str0, "BHD");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.lang.Class<?> wildcardClass2 = dateDeserializer0.handledType();
        java.lang.Class<?> wildcardClass3 = dateDeserializer0.handledType();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long7 = dateDeserializer0.deserialize(jsonParser4, deserializationContext5, (java.lang.Long) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setEth(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setPax(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = paymentTotal0.getGusd();
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        java.lang.Double double1 = rate0.getValue();
        org.junit.Assert.assertNull(double1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getMerchant();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.AOA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AOA" + "'", str0, "AOA");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem2 = minerFees0.getEth();
        java.lang.Double double3 = minerFeesItem2.getTotalFee();
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNotNull(minerFeesItem2);
        org.junit.Assert.assertNull(double3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getEmail();
        java.lang.String str3 = buyer0.getPhone();
        java.lang.String str4 = buyer0.getEmail();
        java.lang.String str5 = buyer0.getName();
        java.lang.String str6 = buyer0.getLocality();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.UYU;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UYU" + "'", str0, "UYU");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.bitpay.sdk_light.Client client1 = new com.bitpay.sdk_light.Client("expired");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        java.lang.String str8 = bill6.getMerchant();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.NOK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NOK" + "'", str0, "NOK");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.THB;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "THB" + "'", str0, "THB");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.bitpay.sdk_light.model.Invoice.Shopper shopper0 = new com.bitpay.sdk_light.model.Invoice.Shopper();
        shopper0.setName("GBP");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.AUD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AUD" + "'", str0, "AUD");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        java.util.List<java.lang.String> strList8 = bill6.getCc();
        bill6.setPhone("SCR");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setEth(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setBch(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = null;
        paymentTotal0.setGusd(bigDecimal5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        java.util.List<java.lang.String> strList8 = bill6.getCc();
        bill6.setCountry("CNY");
        bill6.setPhone("LSL");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        boolean boolean1 = dateDeserializer0.isCachable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.LAK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LAK" + "'", str0, "LAK");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BZD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BZD" + "'", str0, "BZD");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.BDT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "BDT" + "'", str0, "BDT");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        int int0 = com.bitpay.sdk_light.util.BitPayLogger.ERR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode0 = new com.bitpay.sdk_light.model.Invoice.PaymentCode();
        java.lang.String str1 = paymentCode0.getBip72b();
        paymentCode0.setBip72b("BOV");
        java.lang.String str4 = paymentCode0.getBip73();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setBtc(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setPax(bigDecimal3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.WST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "WST" + "'", str0, "WST");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.UAH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UAH" + "'", str0, "UAH");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.EUR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "EUR" + "'", str0, "EUR");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.bitpay.sdk_light.BitPayException bitPayException1 = new com.bitpay.sdk_light.BitPayException("MXV");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.AMD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AMD" + "'", str0, "AMD");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SLL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SLL" + "'", str0, "SLL");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setEth(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setPax(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = paymentTotal0.getPax();
        org.junit.Assert.assertNull(bigDecimal5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees2 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem3 = minerFees2.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem4 = minerFees2.getBtc();
        minerFees0.setEth(minerFeesItem4);
        java.lang.Class<?> wildcardClass6 = minerFeesItem4.getClass();
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNotNull(minerFeesItem3);
        org.junit.Assert.assertNotNull(minerFeesItem4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.LRD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LRD" + "'", str0, "LRD");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.YER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "YER" + "'", str0, "YER");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CHW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CHW" + "'", str0, "CHW");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.bitpay.sdk_light.BitPayException bitPayException1 = new com.bitpay.sdk_light.BitPayException("XCD");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bitPayException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.XOF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "XOF" + "'", str0, "XOF");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean2 = dateSerializer0.isEmpty((java.lang.Long) 1L);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer4 = dateSerializer0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer6 = longJsonSerializer4.unwrappingSerializer(nameTransformer5);
        java.lang.Class<java.lang.Long> longClass7 = longJsonSerializer6.handledType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longJsonSerializer4);
        org.junit.Assert.assertNotNull(longJsonSerializer6);
        org.junit.Assert.assertNull(longClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getEth();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem2 = minerFees0.getBch();
        minerFeesItem2.setSatoshisPerByte((java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNotNull(minerFeesItem2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        com.bitpay.sdk_light.model.Rate.Rate[] rateArray1 = new com.bitpay.sdk_light.model.Rate.Rate[] { rate0 };
        java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate> rateList2 = new java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, rateArray1);
        com.bitpay.sdk_light.Client client6 = new com.bitpay.sdk_light.Client("", "");
        com.bitpay.sdk_light.model.Rate.Rates rates7 = new com.bitpay.sdk_light.model.Rate.Rates((java.util.List<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, client6);
        org.apache.http.HttpResponse httpResponse9 = client6.get("KHR");
        org.apache.http.message.BasicNameValuePair[] basicNameValuePairArray11 = new org.apache.http.message.BasicNameValuePair[] {};
        java.util.ArrayList<org.apache.http.message.BasicNameValuePair> basicNameValuePairList12 = new java.util.ArrayList<org.apache.http.message.BasicNameValuePair>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.http.message.BasicNameValuePair>) basicNameValuePairList12, basicNameValuePairArray11);
        org.apache.http.HttpResponse httpResponse14 = client6.get("KWD", (java.util.List<org.apache.http.message.BasicNameValuePair>) basicNameValuePairList12);
        org.junit.Assert.assertNotNull(rateArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(httpResponse9);
        org.junit.Assert.assertNotNull(basicNameValuePairArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(httpResponse14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.DKK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DKK" + "'", str0, "DKK");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.bitpay.sdk_light.model.Bill.Item item0 = new com.bitpay.sdk_light.model.Bill.Item();
        item0.setId("GUSD");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        java.lang.String str0 = com.bitpay.sdk_light.model.Bill.BillStatus.Complete;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "complete" + "'", str0, "complete");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.util.Collection<java.lang.Object> objCollection2 = dateDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        java.lang.Boolean boolean4 = dateDeserializer0.supportsUpdate(deserializationConfig3);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern5 = dateDeserializer0.getEmptyAccessPattern();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + accessPattern5 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern5.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.VEF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "VEF" + "'", str0, "VEF");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CVE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CVE" + "'", str0, "CVE");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.JPY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "JPY" + "'", str0, "JPY");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes0 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode1 = paymentCodes0.getBtc();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode2 = paymentCodes0.getEth();
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes3 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode4 = paymentCodes3.getBtc();
        paymentCodes0.setBtc(paymentCode4);
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes6 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode7 = paymentCodes6.getBtc();
        paymentCodes0.setEth(paymentCode7);
        java.lang.String str9 = paymentCode7.getBip73();
        org.junit.Assert.assertNotNull(paymentCode1);
        org.junit.Assert.assertNotNull(paymentCode2);
        org.junit.Assert.assertNotNull(paymentCode4);
        org.junit.Assert.assertNotNull(paymentCode7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext1 = null;
        java.lang.Object obj2 = dateDeserializer0.getEmptyValue(deserializationContext1);
        boolean boolean3 = dateDeserializer0.isCachable();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.UGX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UGX" + "'", str0, "UGX");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        bill6.setAddress1("SSP");
        bill6.setToken("DJF");
        bill6.setState("PHP");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = paymentTotal0.getUsdc();
        java.math.BigDecimal bigDecimal2 = null;
        paymentTotal0.setBch(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = null;
        paymentTotal0.setXrp(bigDecimal4);
        org.junit.Assert.assertNull(bigDecimal1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        java.lang.String str0 = com.bitpay.sdk_light.model.Invoice.InvoiceStatus.New;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "new" + "'", str0, "new");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies0 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency1 = supportedTransactionCurrencies0.getBch();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency2 = null;
        supportedTransactionCurrencies0.setEth(supportedTransactionCurrency2);
        org.junit.Assert.assertNotNull(supportedTransactionCurrency1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.TMT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TMT" + "'", str0, "TMT");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("GBP", "UZS");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SAR" + "'", str0, "SAR");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal2 = invoice0.getPaymentDisplaySubTotals();
        java.lang.String str3 = invoice0.getId();
        java.util.List<java.lang.String> strList4 = invoice0.getPaymentCurrencies();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(paymentTotal2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.bitpay.sdk_light.BitPayException bitPayException1 = new com.bitpay.sdk_light.BitPayException("XCD");
        java.lang.Throwable[] throwableArray2 = bitPayException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.CUP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "CUP" + "'", str0, "CUP");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean1 = dateSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dateSerializer0.isEmpty(serializerProvider2, (java.lang.Long) 100L);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.bitpay.sdk_light.model.Currency currency0 = new com.bitpay.sdk_light.model.Currency();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SEK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SEK" + "'", str0, "SEK");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes0 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode1 = paymentCodes0.getBtc();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode2 = paymentCodes0.getEth();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode3 = paymentCodes0.getEth();
        org.junit.Assert.assertNotNull(paymentCode1);
        org.junit.Assert.assertNotNull(paymentCode2);
        org.junit.Assert.assertNotNull(paymentCode3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        java.lang.String str0 = com.bitpay.sdk_light.model.Bill.BillStatus.New;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "new" + "'", str0, "new");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getEmail();
        java.lang.String str3 = buyer0.getPhone();
        boolean boolean4 = buyer0.getNotify();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.deser.SettableBeanProperty settableBeanProperty2 = dateDeserializer0.findBackReference("BZD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot handle managed/back reference 'BZD': type: value deserializer of type com.bitpay.sdk_light.util.DateDeserializer does not support them");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setUrl("USDC");
        java.lang.String str10 = bill6.getCurrency();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "INR" + "'", str10, "INR");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.DZD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DZD" + "'", str0, "DZD");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GMD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GMD" + "'", str0, "GMD");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.lang.Class<?> wildcardClass2 = dateDeserializer0.handledType();
        java.lang.Object obj3 = dateDeserializer0.getEmptyValue();
        boolean boolean4 = dateDeserializer0.isCachable();
        java.lang.Object obj5 = dateDeserializer0.getEmptyValue();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        bill6.setCountry("NPR");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getAddress2();
        buyer0.setAddress2("TZS");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.SGD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "SGD" + "'", str0, "SGD");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        buyer0.setPostalCode("CAD");
        java.lang.String str4 = buyer0.getAddress2();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.NZD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "NZD" + "'", str0, "NZD");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.USN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "USN" + "'", str0, "USN");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        bill6.setState("PHP");
        java.lang.String str14 = bill6.getId();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "FJD" + "'", str14, "FJD");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean1 = dateSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dateSerializer0.isEmpty(serializerProvider2, (java.lang.Long) 100L);
        java.lang.Class<java.lang.Long> longClass5 = dateSerializer0.handledType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(longClass5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        bill6.setAddress1("SSP");
        bill6.setEmail("GYD");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.IRR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "IRR" + "'", str0, "IRR");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.bitpay.sdk_light.model.Bill.Item item0 = new com.bitpay.sdk_light.model.Bill.Item();
        item0.setDescription("SAR");
        java.lang.String str3 = item0.getId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        bill6.setAddress1("SSP");
        java.lang.String str10 = bill6.getZip();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setNotificationEmail("NGN");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal3 = invoice0.getPaymentDisplayTotals();
        org.junit.Assert.assertNull(paymentTotal3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        java.util.List<java.lang.String> strList8 = bill6.getCc();
        java.lang.String str9 = bill6.getId();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies2 = invoice0.getSupportedTransactionCurrencies();
        invoice0.setFullNotifications(false);
        java.util.ArrayList arrayList5 = invoice0.getRefundAddresses();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies2);
        org.junit.Assert.assertNull(arrayList5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        invoice0.setItemCode("BWP");
        invoice0.setPosData("PHP");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setPhone("SSP");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray12 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList13 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList13, itemArray12);
        com.bitpay.sdk_light.model.Bill.Bill bill15 = new com.bitpay.sdk_light.model.Bill.Bill("CRC", "SBD", "KMF", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList13);
        bill6.setItems((java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList13);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal1 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal2 = null;
        paymentTotal1.setBtc(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = null;
        paymentTotal1.setBch(bigDecimal4);
        invoice0.setPaymentDisplayTotals(paymentTotal1);
        boolean boolean7 = invoice0.getExtendedNotifications();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal8 = invoice0.getPaymentTotals();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(paymentTotal8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        java.lang.String str12 = bill6.getCreateDate();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getEmail();
        java.lang.String str3 = buyer0.getPhone();
        java.lang.String str4 = buyer0.getEmail();
        java.lang.String str5 = buyer0.getRegion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        java.util.List<java.lang.String> strList8 = bill6.getCc();
        bill6.setUrl("GBP");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.ZWL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ZWL" + "'", str0, "ZWL");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.MOP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "MOP" + "'", str0, "MOP");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes0 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode1 = paymentCodes0.getBtc();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode2 = paymentCodes0.getEth();
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes3 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode4 = paymentCodes3.getBtc();
        paymentCodes0.setBtc(paymentCode4);
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode6 = paymentCodes0.getBtc();
        org.junit.Assert.assertNotNull(paymentCode1);
        org.junit.Assert.assertNotNull(paymentCode2);
        org.junit.Assert.assertNotNull(paymentCode4);
        org.junit.Assert.assertNotNull(paymentCode6);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies3 = invoice0.getSupportedTransactionCurrencies();
        invoice0.setTransactionCurrency("KMF");
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getEmail();
        java.lang.String str3 = buyer0.getPhone();
        buyer0.setAddress1("SRD");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.util.Collection<java.lang.Object> objCollection2 = dateDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationConfig deserializationConfig3 = null;
        java.lang.Boolean boolean4 = dateDeserializer0.supportsUpdate(deserializationConfig3);
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader5 = dateDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(objCollection2);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(objectIdReader5);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies2 = invoice0.getSupportedTransactionCurrencies();
        invoice0.setFullNotifications(false);
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal5 = invoice0.getPaymentDisplayTotals();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies2);
        org.junit.Assert.assertNull(paymentTotal5);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setEth(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setPax(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = paymentTotal0.getBch();
        java.math.BigDecimal bigDecimal6 = paymentTotal0.getBch();
        org.junit.Assert.assertNull(bigDecimal5);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.QAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "QAR" + "'", str0, "QAR");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = null;
        paymentTotal0.setEth(bigDecimal1);
        java.math.BigDecimal bigDecimal3 = null;
        paymentTotal0.setPax(bigDecimal3);
        java.math.BigDecimal bigDecimal5 = null;
        paymentTotal0.setPax(bigDecimal5);
        java.math.BigDecimal bigDecimal7 = paymentTotal0.getPax();
        java.math.BigDecimal bigDecimal8 = paymentTotal0.getXrp();
        org.junit.Assert.assertNull(bigDecimal7);
        org.junit.Assert.assertNull(bigDecimal8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        buyer0.setName("FJD");
        java.lang.String str4 = buyer0.getRegion();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        buyer0.setName("FJD");
        buyer0.setAddress2("LRD");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        java.lang.String str10 = bill6.getNumber();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SSP" + "'", str10, "SSP");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        rate0.setValue((java.lang.Double) 10.0d);
        java.lang.String str3 = rate0.getName();
        rate0.setValue((java.lang.Double) 10.0d);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.bitpay.sdk_light.model.Bill.Item item0 = new com.bitpay.sdk_light.model.Bill.Item();
        item0.setId("QAR");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getEmail();
        java.lang.String str3 = buyer0.getPhone();
        java.lang.String str4 = buyer0.getEmail();
        java.lang.String str5 = buyer0.getName();
        java.lang.String str6 = buyer0.getCountry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.AWG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "AWG" + "'", str0, "AWG");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes0 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode1 = paymentCodes0.getBtc();
        java.lang.String str2 = paymentCode1.getBip73();
        org.junit.Assert.assertNotNull(paymentCode1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        buyer0.setPhone("CHE");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        java.lang.String str0 = com.bitpay.sdk_light.Env.Test;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Test" + "'", str0, "Test");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        com.bitpay.sdk_light.model.Rate.Rate[] rateArray1 = new com.bitpay.sdk_light.model.Rate.Rate[] { rate0 };
        java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate> rateList2 = new java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, rateArray1);
        com.bitpay.sdk_light.Client client6 = new com.bitpay.sdk_light.Client("", "");
        com.bitpay.sdk_light.model.Rate.Rates rates7 = new com.bitpay.sdk_light.model.Rate.Rates((java.util.List<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, client6);
        org.apache.http.HttpResponse httpResponse9 = client6.get("KHR");
        com.bitpay.sdk_light.model.Rate.Rates rates10 = client6.getRates();
        double double12 = rates10.getRate("BIF");
        rates10.update();
        org.junit.Assert.assertNotNull(rateArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(httpResponse9);
        org.junit.Assert.assertNotNull(rates10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.741530649E7d + "'", double12 == 9.741530649E7d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        bill6.setState("PHP");
        java.lang.String str14 = bill6.getAddress1();
        bill6.setUrl("MYR");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies0 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency1 = supportedTransactionCurrencies0.getBch();
        boolean boolean2 = supportedTransactionCurrency1.getEnabled();
        org.junit.Assert.assertNotNull(supportedTransactionCurrency1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        invoice0.setTransactionSpeed("ZAR");
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal1 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal2 = null;
        paymentTotal1.setBtc(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = null;
        paymentTotal1.setBch(bigDecimal4);
        invoice0.setPaymentDisplayTotals(paymentTotal1);
        invoice0.setInvoiceTime((long) (-1));
        java.util.Hashtable<java.lang.String, java.util.Hashtable<java.lang.String, java.lang.String>> strMap9 = invoice0.getExchangeRates();
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        com.bitpay.sdk_light.model.Rate.Rate[] rateArray1 = new com.bitpay.sdk_light.model.Rate.Rate[] { rate0 };
        java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate> rateList2 = new java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, rateArray1);
        com.bitpay.sdk_light.Client client6 = new com.bitpay.sdk_light.Client("", "");
        com.bitpay.sdk_light.model.Rate.Rates rates7 = new com.bitpay.sdk_light.model.Rate.Rates((java.util.List<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, client6);
        org.apache.http.HttpResponse httpResponse9 = client6.get("KHR");
        com.bitpay.sdk_light.model.Rate.Rates rates10 = client6.getRates();
        java.util.List<org.apache.http.message.BasicNameValuePair> basicNameValuePairList12 = null;
        org.apache.http.HttpResponse httpResponse13 = client6.get("", basicNameValuePairList12);
        org.junit.Assert.assertNotNull(rateArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(httpResponse9);
        org.junit.Assert.assertNotNull(rates10);
        org.junit.Assert.assertNotNull(httpResponse13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees3 = invoice0.getMinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem4 = minerFees3.getEth();
        org.junit.Assert.assertNotNull(minerFees3);
        org.junit.Assert.assertNotNull(minerFeesItem4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setCurrency("MVR");
        bill6.setAddress2("KWD");
        bill6.setMerchant("MNT");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        com.bitpay.sdk_light.model.Invoice.Invoice invoice2 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal3 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal4 = null;
        paymentTotal3.setBtc(bigDecimal4);
        java.math.BigDecimal bigDecimal6 = null;
        paymentTotal3.setBch(bigDecimal6);
        invoice2.setPaymentDisplayTotals(paymentTotal3);
        invoice0.setPaymentTotals(paymentTotal3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        invoice0.setItemCode("BWP");
        invoice0.setExceptionStatus("SDG");
        long long6 = invoice0.getInvoiceTime();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem0 = new com.bitpay.sdk_light.model.Invoice.MinerFeesItem();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        buyer0.setName("MXN");
        java.lang.String str3 = buyer0.getAddress2();
        java.lang.String str4 = buyer0.getAddress1();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.bitpay.sdk_light.model.Invoice.RefundInfo refundInfo0 = new com.bitpay.sdk_light.model.Invoice.RefundInfo();
        java.lang.String str1 = refundInfo0.getCurrency();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        buyer0.setAddress2("ILS");
        java.lang.String str3 = buyer0.getName();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.bitpay.sdk_light.model.Invoice.RefundInfo refundInfo0 = new com.bitpay.sdk_light.model.Invoice.RefundInfo();
        java.lang.String str1 = refundInfo0.getSupportRequest();
        refundInfo0.setCurrency("BZD");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies0 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency1 = null;
        supportedTransactionCurrencies0.setEth(supportedTransactionCurrency1);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies3 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency4 = null;
        supportedTransactionCurrencies3.setEth(supportedTransactionCurrency4);
        com.bitpay.sdk_light.model.Invoice.Invoice invoice6 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean7 = invoice6.getExtendedNotifications();
        invoice6.setTransactionCurrency("DKK");
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies10 = invoice6.getSupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.Invoice invoice11 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice11.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies14 = invoice11.getSupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies15 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrency supportedTransactionCurrency16 = supportedTransactionCurrencies15.getBch();
        supportedTransactionCurrencies14.setEth(supportedTransactionCurrency16);
        supportedTransactionCurrencies10.setBtc(supportedTransactionCurrency16);
        supportedTransactionCurrencies3.setBtc(supportedTransactionCurrency16);
        supportedTransactionCurrencies0.setBtc(supportedTransactionCurrency16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies10);
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies14);
        org.junit.Assert.assertNotNull(supportedTransactionCurrency16);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        bill6.setState("PHP");
        java.lang.String str14 = bill6.getAddress1();
        java.lang.String str15 = bill6.getToken();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        bill6.setDueDate("ZMW");
        bill6.setPassProcessingFee(true);
        java.lang.String str12 = bill6.getPhone();
        java.lang.String str13 = bill6.getPhone();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.LBP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "LBP" + "'", str0, "LBP");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.XDR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "XDR" + "'", str0, "XDR");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        java.lang.String str2 = buyer0.getPostalCode();
        buyer0.setNotify(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setCurrency("MVR");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray12 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList13 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList13, itemArray12);
        com.bitpay.sdk_light.model.Bill.Bill bill15 = new com.bitpay.sdk_light.model.Bill.Bill("CRC", "SBD", "KMF", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList13);
        bill6.setItems((java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList13);
        bill6.setNumber("MDL");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.bitpay.sdk_light.model.Bill.Bill bill0 = new com.bitpay.sdk_light.model.Bill.Bill();
        bill0.setStatus("TJS");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice2 = new com.bitpay.sdk_light.model.Invoice.Invoice((java.lang.Double) (-1.0d), "UYU");
        invoice2.setRedirectURL("USN");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getBtc();
        java.lang.Double double2 = minerFeesItem1.getSatoshisPerByte();
        minerFeesItem1.setSatoshisPerByte((java.lang.Double) 100.0d);
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNull(double2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setCurrency("MVR");
        bill6.setDueDate("KWD");
        java.lang.String str11 = bill6.getId();
        bill6.setAddress1("");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.KZT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "KZT" + "'", str0, "KZT");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        bill6.setState("PHP");
        java.lang.String[] strArray39 = new java.lang.String[] { "RON", "PLN", "AFN", "MYR", "ERN", "MUR", "DKK", "HUF", "SYP", "MYR", "NIO", "BDT", "TZS", "CVE", "CDF", "JOD", "XCD", "EGP", "ARS", "AOA", "PGK", "new", "complete", "ERN", "DJF" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        bill6.setCc((java.util.List<java.lang.String>) strList40);
        bill6.setCity("");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies3 = invoice0.getSupportedTransactionCurrencies();
        boolean boolean4 = invoice0.getExtendedNotifications();
        invoice0.setCurrentTime((long) (short) 100);
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        invoice0.setInvoiceTime((-1L));
        java.math.BigDecimal bigDecimal4 = invoice0.getAmountPaid();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.lang.Class<?> wildcardClass2 = dateDeserializer0.handledType();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer3 = dateDeserializer0.getDelegatee();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardJsonDeserializer3);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        com.bitpay.sdk_light.model.Bill.Item item0 = new com.bitpay.sdk_light.model.Bill.Item();
        item0.setDescription("JPY");
        java.lang.String str3 = item0.getId();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem2 = minerFees0.getBtc();
        java.lang.Double double3 = minerFeesItem2.getSatoshisPerByte();
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNotNull(minerFeesItem2);
        org.junit.Assert.assertNull(double3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        bill6.setState("PHP");
        java.lang.String str14 = bill6.getAddress1();
        java.lang.String str15 = bill6.getAddress2();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        invoice0.setTransactionCurrency("DKK");
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies4 = invoice0.getSupportedTransactionCurrencies();
        java.util.List<com.bitpay.sdk_light.model.Invoice.InvoiceTransaction> invoiceTransactionList5 = invoice0.getTransactions();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies4);
        org.junit.Assert.assertNull(invoiceTransactionList5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.GEL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GEL" + "'", str0, "GEL");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode0 = new com.bitpay.sdk_light.model.Invoice.PaymentCode();
        java.lang.String str1 = paymentCode0.getBip72b();
        paymentCode0.setBip72b("BOV");
        paymentCode0.setBip73("GNF");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal2 = invoice0.getPaymentDisplaySubTotals();
        com.bitpay.sdk_light.model.Bill.Item[] itemArray6 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList7 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList7, itemArray6);
        com.bitpay.sdk_light.model.Bill.Bill bill9 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList7);
        java.util.List<java.lang.String> strList10 = bill9.getCc();
        bill9.setId("FJD");
        bill9.setUrl("USDC");
        bill9.setState("PHP");
        java.lang.String[] strArray42 = new java.lang.String[] { "RON", "PLN", "AFN", "MYR", "ERN", "MUR", "DKK", "HUF", "SYP", "MYR", "NIO", "BDT", "TZS", "CVE", "CDF", "JOD", "XCD", "EGP", "ARS", "AOA", "PGK", "new", "complete", "ERN", "DJF" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        bill9.setCc((java.util.List<java.lang.String>) strList43);
        invoice0.setPaymentCurrencies((java.util.List<java.lang.String>) strList43);
        invoice0.setRefundAddressRequestPending(false);
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(paymentTotal2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees3 = invoice0.getMinerFees();
        java.lang.String str4 = invoice0.getCurrency();
        com.bitpay.sdk_light.model.Invoice.Shopper shopper5 = new com.bitpay.sdk_light.model.Invoice.Shopper();
        java.lang.String str6 = shopper5.getName();
        invoice0.setShopper(shopper5);
        org.junit.Assert.assertNotNull(minerFees3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.PYG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PYG" + "'", str0, "PYG");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo();
        invoiceBuyerProvidedInfo0.setName("ARS");
        invoiceBuyerProvidedInfo0.setPhoneNumber("CLP");
        invoiceBuyerProvidedInfo0.setEmailAddress("XUA");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem1 = minerFees0.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem2 = minerFees0.getBtc();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem3 = null;
        minerFees0.setEth(minerFeesItem3);
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem5 = minerFees0.getEth();
        org.junit.Assert.assertNotNull(minerFeesItem1);
        org.junit.Assert.assertNotNull(minerFeesItem2);
        org.junit.Assert.assertNull(minerFeesItem5);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("CRC", "SBD", "KMF", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setAddress1("HUF");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        com.fasterxml.jackson.databind.JsonDeserializer<?> wildcardJsonDeserializer2 = dateDeserializer0.getDelegatee();
        boolean boolean3 = dateDeserializer0.isCachable();
        java.util.Collection<java.lang.Object> objCollection4 = dateDeserializer0.getKnownPropertyNames();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext5 = null;
        java.lang.Object obj6 = dateDeserializer0.getEmptyValue(deserializationContext5);
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext7 = null;
        java.lang.Long long8 = dateDeserializer0.getNullValue(deserializationContext7);
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern9 = dateDeserializer0.getEmptyAccessPattern();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardJsonDeserializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(objCollection4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(long8);
        org.junit.Assert.assertTrue("'" + accessPattern9 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern9.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean2 = dateSerializer0.isEmpty((java.lang.Long) 1L);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer4 = dateSerializer0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer6 = longJsonSerializer4.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = longJsonSerializer4.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longJsonSerializer4);
        org.junit.Assert.assertNotNull(longJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        com.bitpay.sdk_light.model.Bill.Item item0 = new com.bitpay.sdk_light.model.Bill.Item();
        item0.setDescription("JPY");
        item0.setId("ISK");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        com.bitpay.sdk_light.model.Invoice.Shopper shopper0 = new com.bitpay.sdk_light.model.Invoice.Shopper();
        java.lang.String str1 = shopper0.getName();
        shopper0.setName("CUP");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.lang.Class<?> wildcardClass2 = dateDeserializer0.handledType();
        java.lang.Object obj3 = dateDeserializer0.getEmptyValue();
        boolean boolean4 = dateDeserializer0.isCachable();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = null;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long8 = dateDeserializer0.deserialize(jsonParser5, deserializationContext6, (java.lang.Long) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        rate0.setValue((java.lang.Double) 10.0d);
        java.lang.String str3 = rate0.getName();
        rate0.setValue((java.lang.Double) 0.0d);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        java.lang.String str1 = buyer0.getPhone();
        buyer0.setPostalCode("CAD");
        buyer0.setEmail("PGK");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.TND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TND" + "'", str0, "TND");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees3 = invoice0.getMinerFees();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies4 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        invoice0.setSupportedTransactionCurrencies(supportedTransactionCurrencies4);
        invoice0.setItemCode("CRC");
        org.junit.Assert.assertNotNull(minerFees3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode0 = new com.bitpay.sdk_light.model.Invoice.PaymentCode();
        java.lang.String str1 = paymentCode0.getBip72b();
        paymentCode0.setBip72b("BOV");
        paymentCode0.setBip73("BOV");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        invoice0.setFullNotifications(false);
        org.junit.Assert.assertNull(strList1);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        com.bitpay.sdk_light.model.Rate.Rate[] rateArray1 = new com.bitpay.sdk_light.model.Rate.Rate[] { rate0 };
        java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate> rateList2 = new java.util.ArrayList<com.bitpay.sdk_light.model.Rate.Rate>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, rateArray1);
        com.bitpay.sdk_light.Client client6 = new com.bitpay.sdk_light.Client("", "");
        com.bitpay.sdk_light.model.Rate.Rates rates7 = new com.bitpay.sdk_light.model.Rate.Rates((java.util.List<com.bitpay.sdk_light.model.Rate.Rate>) rateList2, client6);
        org.apache.http.message.BasicNameValuePair[] basicNameValuePairArray9 = new org.apache.http.message.BasicNameValuePair[] {};
        java.util.ArrayList<org.apache.http.message.BasicNameValuePair> basicNameValuePairList10 = new java.util.ArrayList<org.apache.http.message.BasicNameValuePair>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.http.message.BasicNameValuePair>) basicNameValuePairList10, basicNameValuePairArray9);
        org.apache.http.HttpResponse httpResponse12 = client6.get("FJD", (java.util.List<org.apache.http.message.BasicNameValuePair>) basicNameValuePairList10);
        org.junit.Assert.assertNotNull(rateArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(basicNameValuePairArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(httpResponse12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean2 = dateSerializer0.isEmpty((java.lang.Long) 1L);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer4 = dateSerializer0.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer6 = longJsonSerializer4.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = longJsonSerializer4.properties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(longJsonSerializer4);
        org.junit.Assert.assertNotNull(longJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        invoice0.setExtendedNotifications(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean1 = dateSerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider2 = null;
        boolean boolean4 = dateSerializer0.isEmpty(serializerProvider2, (java.lang.Long) 100L);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = dateSerializer0.properties();
        com.bitpay.sdk_light.util.DateSerializer dateSerializer6 = new com.bitpay.sdk_light.util.DateSerializer();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long> longJsonSerializer7 = dateSerializer0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Long>) dateSerializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.lang.Class<?> wildcardClass2 = dateDeserializer0.handledType();
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader3 = dateDeserializer0.getObjectIdReader();
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(objectIdReader3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        com.bitpay.sdk_light.model.Rate.Rate rate0 = new com.bitpay.sdk_light.model.Rate.Rate();
        rate0.setValue((java.lang.Double) 10.0d);
        java.lang.String str3 = rate0.getCode();
        rate0.setValue((java.lang.Double) 9.741530649E7d);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees3 = invoice0.getMinerFees();
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies4 = new com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies();
        invoice0.setSupportedTransactionCurrencies(supportedTransactionCurrencies4);
        java.lang.String str6 = invoice0.getUrl();
        invoice0.setAcceptanceWindow((long) (byte) 10);
        org.junit.Assert.assertNotNull(minerFees3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal0 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal1 = paymentTotal0.getUsdc();
        java.math.BigDecimal bigDecimal2 = null;
        paymentTotal0.setBch(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = paymentTotal0.getXrp();
        org.junit.Assert.assertNull(bigDecimal1);
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        java.lang.String str0 = com.bitpay.sdk_light.model.Bill.BillStatus.Sent;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sent" + "'", str0, "sent");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        com.bitpay.sdk_light.BitPayException bitPayException1 = new com.bitpay.sdk_light.BitPayException("XPF");
        com.bitpay.sdk_light.BitPayException bitPayException3 = new com.bitpay.sdk_light.BitPayException("NGN");
        bitPayException1.addSuppressed((java.lang.Throwable) bitPayException3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        invoice0.setTransactionCurrency("DKK");
        invoice0.setStatus("MUR");
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal6 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal7 = null;
        paymentTotal6.setEth(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = null;
        paymentTotal6.setPax(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = null;
        paymentTotal6.setPax(bigDecimal11);
        invoice0.setPaymentSubtotals(paymentTotal6);
        java.math.BigDecimal bigDecimal14 = null;
        paymentTotal6.setPax(bigDecimal14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        invoice0.setItemCode("BWP");
        invoice0.setItemCode("SDG");
        long long6 = invoice0.getExpirationTime();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("GTQ", "LBP");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        com.bitpay.sdk_light.model.Invoice.Buyer buyer0 = new com.bitpay.sdk_light.model.Invoice.Buyer();
        buyer0.setName("MWK");
        java.lang.String str3 = buyer0.getAddress2();
        buyer0.setName("RUB");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        com.bitpay.sdk_light.Client client1 = new com.bitpay.sdk_light.Client("KHR");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setStatus("JMD");
        java.lang.String str10 = bill6.getMerchant();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        boolean boolean1 = invoice0.getExtendedNotifications();
        invoice0.setInvoiceTime((-1L));
        invoice0.setBillId("INR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo();
        invoiceBuyerProvidedInfo0.setName("ARS");
        invoiceBuyerProvidedInfo0.setPhoneNumber("CLP");
        invoiceBuyerProvidedInfo0.setName("FJD");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList1 = invoice0.getPaymentCurrencies();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal2 = invoice0.getPaymentDisplaySubTotals();
        invoice0.setPhysical(false);
        java.lang.String str5 = invoice0.getToken();
        org.junit.Assert.assertNull(strList1);
        org.junit.Assert.assertNull(paymentTotal2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("", "");
        org.apache.http.HttpResponse httpResponse4 = client2.get("SEK");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = client2.deliverBill("ZAR", "ZWL");
            org.junit.Assert.fail("Expected exception of type com.bitpay.sdk_light.BitPayException; message: Error - failed to retrieve HTTP response body : Error: Invalid token");
        } catch (com.bitpay.sdk_light.BitPayException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(httpResponse4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes0 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode1 = paymentCodes0.getBtc();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode2 = paymentCodes0.getEth();
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes3 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode4 = paymentCodes3.getBtc();
        paymentCodes0.setBtc(paymentCode4);
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes6 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode7 = paymentCodes6.getBtc();
        paymentCodes0.setEth(paymentCode7);
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode9 = paymentCodes0.getBtc();
        paymentCode9.setBip73("");
        org.junit.Assert.assertNotNull(paymentCode1);
        org.junit.Assert.assertNotNull(paymentCode2);
        org.junit.Assert.assertNotNull(paymentCode4);
        org.junit.Assert.assertNotNull(paymentCode7);
        org.junit.Assert.assertNotNull(paymentCode9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean2 = dateSerializer0.isEmpty((java.lang.Long) 1L);
        boolean boolean4 = dateSerializer0.isEmpty((java.lang.Long) 10L);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateSerializer0.serializeWithType((java.lang.Long) 0L, jsonGenerator6, serializerProvider7, typeSerializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.util.List<java.lang.String> strList7 = bill6.getCc();
        bill6.setId("FJD");
        bill6.setUrl("USDC");
        bill6.setState("PHP");
        java.lang.String str14 = bill6.getAddress1();
        java.lang.String str15 = bill6.getDueDate();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        java.lang.String str0 = com.bitpay.sdk_light.model.Currency.VND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "VND" + "'", str0, "VND");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        com.bitpay.sdk_light.util.DateSerializer dateSerializer0 = new com.bitpay.sdk_light.util.DateSerializer();
        boolean boolean1 = dateSerializer0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = dateSerializer0.properties();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setCurrency("MVR");
        java.lang.String str9 = bill6.getNumber();
        bill6.setPassProcessingFee(true);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SSP" + "'", str9, "SSP");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal1 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal2 = null;
        paymentTotal1.setBtc(bigDecimal2);
        java.math.BigDecimal bigDecimal4 = null;
        paymentTotal1.setBch(bigDecimal4);
        invoice0.setPaymentDisplayTotals(paymentTotal1);
        invoice0.setInvoiceTime((long) (-1));
        java.lang.Boolean boolean9 = invoice0.getLowFeeDetected();
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees3 = invoice0.getMinerFees();
        java.lang.String str4 = invoice0.getCurrency();
        com.bitpay.sdk_light.model.Invoice.Shopper shopper5 = invoice0.getShopper();
        org.junit.Assert.assertNotNull(minerFees3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(shopper5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        com.bitpay.sdk_light.model.Bill.Item item0 = new com.bitpay.sdk_light.model.Bill.Item();
        item0.setDescription("SAR");
        java.lang.Integer int3 = item0.getQuantity();
        java.lang.Integer int4 = item0.getQuantity();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.Invoice invoice3 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        java.util.List<java.lang.String> strList4 = invoice3.getPaymentCurrencies();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal5 = invoice3.getPaymentDisplaySubTotals();
        com.bitpay.sdk_light.model.Bill.Item[] itemArray9 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList10 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList10, itemArray9);
        com.bitpay.sdk_light.model.Bill.Bill bill12 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList10);
        java.util.List<java.lang.String> strList13 = bill12.getCc();
        bill12.setId("FJD");
        bill12.setUrl("USDC");
        bill12.setState("PHP");
        java.lang.String[] strArray45 = new java.lang.String[] { "RON", "PLN", "AFN", "MYR", "ERN", "MUR", "DKK", "HUF", "SYP", "MYR", "NIO", "BDT", "TZS", "CVE", "CDF", "JOD", "XCD", "EGP", "ARS", "AOA", "PGK", "new", "complete", "ERN", "DJF" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        bill12.setCc((java.util.List<java.lang.String>) strList46);
        invoice3.setPaymentCurrencies((java.util.List<java.lang.String>) strList46);
        invoice0.setPaymentCurrencies((java.util.List<java.lang.String>) strList46);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(paymentTotal5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        java.lang.String str7 = bill6.getCreateDate();
        bill6.setAddress1("SSP");
        java.lang.String str10 = bill6.getCountry();
        java.lang.String str11 = bill6.getStatus();
        boolean boolean12 = bill6.getPassProcessingFee();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo invoiceBuyerProvidedInfo0 = new com.bitpay.sdk_light.model.Invoice.InvoiceBuyerProvidedInfo();
        java.lang.String str1 = invoiceBuyerProvidedInfo0.getPhoneNumber();
        java.lang.String str2 = invoiceBuyerProvidedInfo0.getEmailAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies3 = invoice0.getSupportedTransactionCurrencies();
        invoice0.setTransactionSpeed("SYP");
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees0 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFees minerFees1 = new com.bitpay.sdk_light.model.Invoice.MinerFees();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem2 = minerFees1.getEth();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem3 = minerFees1.getBch();
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem4 = minerFees1.getBtc();
        minerFees0.setEth(minerFeesItem4);
        com.bitpay.sdk_light.model.Invoice.MinerFeesItem minerFeesItem6 = minerFees0.getBch();
        org.junit.Assert.assertNotNull(minerFeesItem2);
        org.junit.Assert.assertNotNull(minerFeesItem3);
        org.junit.Assert.assertNotNull(minerFeesItem4);
        org.junit.Assert.assertNotNull(minerFeesItem6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        com.bitpay.sdk_light.util.DateDeserializer dateDeserializer0 = new com.bitpay.sdk_light.util.DateDeserializer();
        com.fasterxml.jackson.databind.util.AccessPattern accessPattern1 = dateDeserializer0.getEmptyAccessPattern();
        java.lang.Class<?> wildcardClass2 = dateDeserializer0.handledType();
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext3 = null;
        java.lang.Long long4 = dateDeserializer0.getNullValue(deserializationContext3);
        org.junit.Assert.assertTrue("'" + accessPattern1 + "' != '" + com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC + "'", accessPattern1.equals(com.fasterxml.jackson.databind.util.AccessPattern.DYNAMIC));
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(long4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setCurrency("MVR");
        java.lang.String str9 = bill6.getNumber();
        bill6.setDueDate("LAK");
        java.lang.String str12 = bill6.getCurrency();
        bill6.setToken("ETH");
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SSP" + "'", str9, "SSP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MVR" + "'", str12, "MVR");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("", "");
        client2.setLoggerLevel((-1));
        // The following exception was thrown during execution in test generation
        try {
            com.bitpay.sdk_light.model.Invoice.Invoice invoice6 = client2.getInvoice("expired");
            org.junit.Assert.fail("Expected exception of type com.bitpay.sdk_light.BitPayException; message: Error - failed to retrieve HTTP response body : Error: Invoice not found");
        } catch (com.bitpay.sdk_light.BitPayException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        com.bitpay.sdk_light.model.Bill.Item[] itemArray3 = new com.bitpay.sdk_light.model.Bill.Item[] {};
        java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item> itemList4 = new java.util.ArrayList<com.bitpay.sdk_light.model.Bill.Item>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.bitpay.sdk_light.model.Bill.Item>) itemList4, itemArray3);
        com.bitpay.sdk_light.model.Bill.Bill bill6 = new com.bitpay.sdk_light.model.Bill.Bill("SSP", "INR", "SDG", (java.util.List<com.bitpay.sdk_light.model.Bill.Item>) itemList4);
        bill6.setCurrency("MVR");
        java.lang.String str9 = bill6.getNumber();
        bill6.setDueDate("LAK");
        java.lang.String str12 = bill6.getDueDate();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SSP" + "'", str9, "SSP");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "LAK" + "'", str12, "LAK");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies3 = invoice0.getSupportedTransactionCurrencies();
        java.lang.String str4 = invoice0.getItemDesc();
        java.util.List<com.bitpay.sdk_light.model.Invoice.InvoiceTransaction> invoiceTransactionList5 = invoice0.getTransactions();
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(invoiceTransactionList5);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        com.bitpay.sdk_light.Client client2 = new com.bitpay.sdk_light.Client("PAB", "GTQ");
        org.apache.http.HttpResponse httpResponse4 = client2.get("ZWL");
        org.junit.Assert.assertNotNull(httpResponse4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes0 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode1 = paymentCodes0.getBtc();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode2 = paymentCodes0.getEth();
        com.bitpay.sdk_light.model.Invoice.PaymentCodes paymentCodes3 = new com.bitpay.sdk_light.model.Invoice.PaymentCodes();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode4 = paymentCodes3.getBtc();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode5 = paymentCodes3.getEth();
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode6 = paymentCodes3.getBch();
        paymentCodes0.setBtc(paymentCode6);
        com.bitpay.sdk_light.model.Invoice.PaymentCode paymentCode8 = paymentCodes0.getBch();
        paymentCode8.setBip73("GMD");
        org.junit.Assert.assertNotNull(paymentCode1);
        org.junit.Assert.assertNotNull(paymentCode2);
        org.junit.Assert.assertNotNull(paymentCode4);
        org.junit.Assert.assertNotNull(paymentCode5);
        org.junit.Assert.assertNotNull(paymentCode6);
        org.junit.Assert.assertNotNull(paymentCode8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        com.bitpay.sdk_light.model.Invoice.Invoice invoice0 = new com.bitpay.sdk_light.model.Invoice.Invoice();
        invoice0.setPhysical(true);
        com.bitpay.sdk_light.model.Invoice.SupportedTransactionCurrencies supportedTransactionCurrencies3 = invoice0.getSupportedTransactionCurrencies();
        boolean boolean4 = invoice0.getExtendedNotifications();
        long long5 = invoice0.getAcceptanceWindow();
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal6 = new com.bitpay.sdk_light.model.Invoice.PaymentTotal();
        java.math.BigDecimal bigDecimal7 = null;
        paymentTotal6.setEth(bigDecimal7);
        java.math.BigDecimal bigDecimal9 = null;
        paymentTotal6.setPax(bigDecimal9);
        java.math.BigDecimal bigDecimal11 = paymentTotal6.getBch();
        invoice0.setPaymentDisplaySubTotals(paymentTotal6);
        com.bitpay.sdk_light.model.Invoice.PaymentTotal paymentTotal13 = invoice0.getPaymentSubtotals();
        org.junit.Assert.assertNotNull(supportedTransactionCurrencies3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(paymentTotal13);
    }
}

