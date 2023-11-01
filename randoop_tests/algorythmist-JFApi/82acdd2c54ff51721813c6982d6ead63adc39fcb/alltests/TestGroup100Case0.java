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
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        java.lang.Throwable throwable2 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException3 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable2);
        // The following exception was thrown during execution in test generation
        try {
            exchangeRateException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser6 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray0, strArray5);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Quote> quoteList8 = yahooPriceParser6.parse(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        java.lang.Throwable throwable3 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException4 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable3);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException5 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException4);
        stockServiceException2.addSuppressed((java.lang.Throwable) stockServiceException5);
        java.lang.String str7 = stockServiceException5.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" + "'", str7, "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) 10, (int) (short) 0);
        int int4 = split3.getNumerator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.Currency currency1 = null;
        java.util.Currency currency2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getExchangeRate(currency1, currency2, localDate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        com.tecacet.finance.service.stock.yahoo.YahooSplitParser yahooSplitParser0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitParser();
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.Split split2 = yahooSplitParser0.parse("com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'com.tecacet.finance.service.stock.StockServiceException: com.tec...' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        com.tecacet.finance.service.stock.yahoo.YahooSplitParser yahooSplitParser0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitParser();
        java.lang.Class<?> wildcardClass1 = yahooSplitParser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        com.tecacet.finance.service.WebServiceException webServiceException1 = new com.tecacet.finance.service.WebServiceException("TradingCalendar(month=365, year=10)");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        java.lang.String str3 = tradingDayBuilder0.toString();
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)" + "'", str3, "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("", "");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest// failed with response code 404 and message: Not Found");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.util.List<java.lang.String> strList6 = holidaySupport5.getRegions();
        java.util.List<java.lang.String> strList7 = holidaySupport5.getHolidayTypes();
        java.time.LocalDate localDate8 = holidaySupport5.getToDate();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        com.tecacet.finance.model.AssetType assetType0 = com.tecacet.finance.model.AssetType.ETF;
        org.junit.Assert.assertTrue("'" + assetType0 + "' != '" + com.tecacet.finance.model.AssetType.ETF + "'", assetType0.equals(com.tecacet.finance.model.AssetType.ETF));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        com.tecacet.finance.io.parser.BarchartAssetParser barchartAssetParser0 = new com.tecacet.finance.io.parser.BarchartAssetParser();
        java.io.InputStream inputStream1 = null;
        com.tecacet.finance.model.AssetType assetType2 = com.tecacet.finance.model.AssetType.MUTUAL_FUND;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Asset> assetList3 = barchartAssetParser0.parse(inputStream1, assetType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + assetType2 + "' != '" + com.tecacet.finance.model.AssetType.MUTUAL_FUND + "'", assetType2.equals(com.tecacet.finance.model.AssetType.MUTUAL_FUND));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException2 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException1);
        java.lang.String str3 = exchangeRateException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: " + "'", str3, "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        java.lang.Throwable throwable3 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException4 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable3);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException5 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException4);
        stockServiceException2.addSuppressed((java.lang.Throwable) stockServiceException5);
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException7 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException2);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException8 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) stockServiceException2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.util.List<java.lang.String> strList6 = holidaySupport5.getRegions();
        com.tecacet.finance.model.calendar.Country country7 = holidaySupport5.getCountry();
        java.util.List<java.lang.String> strList8 = holidaySupport5.getHolidayTypes();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(country7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("0:10 on null", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = com.tecacet.finance.service.stock.yahoo.CrumbManager.getCookie();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Server returned HTTP response code: 429 for URL: https://query1.finance.yahoo.com/v1/test/getcrumb");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        com.tecacet.finance.model.calendar.TradingDay.MarketStatus marketStatus3 = com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.marketStatus(marketStatus3);
        java.time.LocalTime localTime5 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder6 = tradingDayBuilder2.startTime(localTime5);
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertTrue("'" + marketStatus3 + "' != '" + com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN + "'", marketStatus3.equals(com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN));
        org.junit.Assert.assertNotNull(tradingDayBuilder4);
        org.junit.Assert.assertNotNull(tradingDayBuilder6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray2 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3, tradingDayArray2);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar5 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3);
        int int6 = tradingCalendar5.getMonth();
        org.junit.Assert.assertNotNull(tradingDayArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = tradierTradingDayService0.getTradingDays((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        com.tecacet.finance.io.parser.BarchartAssetParser barchartAssetParser0 = new com.tecacet.finance.io.parser.BarchartAssetParser();
        java.io.InputStream inputStream1 = null;
        com.tecacet.finance.model.AssetType assetType2 = com.tecacet.finance.model.AssetType.STOCK;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Asset> assetList3 = barchartAssetParser0.parse(inputStream1, assetType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + assetType2 + "' != '" + com.tecacet.finance.model.AssetType.STOCK + "'", assetType2.equals(com.tecacet.finance.model.AssetType.STOCK));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("TradingCalendar(month=365, year=10)", "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest/TradingCalendar(month=365, year=10)/Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null) failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        com.tecacet.finance.io.parser.MutualFundAssetParser mutualFundAssetParser0 = new com.tecacet.finance.io.parser.MutualFundAssetParser();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Asset> assetList2 = mutualFundAssetParser0.parse(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        com.tecacet.finance.service.calendar.enrico.EnricoHoliday enricoHoliday0 = new com.tecacet.finance.service.calendar.enrico.EnricoHoliday();
        java.lang.String str1 = enricoHoliday0.getHolidayType();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getHigh();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate6 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder7 = holidaySupportBuilder5.fromDate(localDate6);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder16 = holidaySupportBuilder8.holidayTypes((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder17 = holidaySupportBuilder7.regions((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = holidaySupportBuilder4.holidayTypes((java.util.List<java.lang.String>) strList14);
        java.lang.String[] strArray21 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "0:10 on null" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder24 = holidaySupportBuilder18.regions((java.util.List<java.lang.String>) strList22);
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder7);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder16);
        org.junit.Assert.assertNotNull(holidaySupportBuilder17);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder24);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        java.lang.String str3 = tradingDayBuilder2.toString();
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)" + "'", str3, "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        com.tecacet.finance.io.parser.NasdaqAssetParser nasdaqAssetParser0 = new com.tecacet.finance.io.parser.NasdaqAssetParser();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Asset> assetList2 = nasdaqAssetParser0.parse(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = tradierTradingDayService0.getTradingDays((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException("");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        com.tecacet.finance.model.calendar.Holiday holiday2 = holidayBuilder0.build();
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder4 = holidayBuilder0.description("");
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday2);
        org.junit.Assert.assertNotNull(holidayBuilder4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        com.tecacet.finance.io.parser.OtherAssetParser otherAssetParser0 = new com.tecacet.finance.io.parser.OtherAssetParser();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Asset> assetList2 = otherAssetParser0.parse(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str0 = com.tecacet.finance.service.stock.yahoo.CrumbManager.getCrumb();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Server returned HTTP response code: 429 for URL: https://query1.finance.yahoo.com/v1/test/getcrumb");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        com.tecacet.finance.service.asset.BarchartAssetService barchartAssetService1 = new com.tecacet.finance.service.asset.BarchartAssetService(false);
        java.util.Set<com.tecacet.finance.model.Asset> assetSet2 = barchartAssetService1.getAssets();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet3 = barchartAssetService1.getAssets();
        org.junit.Assert.assertNotNull(assetSet2);
        org.junit.Assert.assertNotNull(assetSet3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("Holiday(date=null, description=null)", "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest/Holiday(date=null, description=null)/Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null) failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (short) 10, (int) (short) 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray5 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = holidaySupportBuilder0.holidayTypes((java.util.List<java.lang.String>) strList6);
        java.lang.String str9 = holidaySupportBuilder8.toString();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)" + "'", str9, "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        com.tecacet.finance.service.WebServiceException webServiceException1 = new com.tecacet.finance.service.WebServiceException("com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.util.List<java.lang.String> strList6 = holidaySupport5.getRegions();
        java.util.List<java.lang.String> strList7 = holidaySupport5.getHolidayTypes();
        java.time.LocalDate localDate8 = holidaySupport5.getFromDate();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray2 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3, tradingDayArray2);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar5 = new com.tecacet.finance.model.calendar.TradingCalendar((int) (byte) 0, (int) (short) 0, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3);
        org.junit.Assert.assertNotNull(tradingDayArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray4 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList5 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList5, tradingDayArray4);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar7 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList5);
        java.lang.String str8 = tradingCalendar7.toString();
        int int9 = tradingCalendar7.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList10 = tradingCalendar7.getTradingDays();
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar11 = new com.tecacet.finance.model.calendar.TradingCalendar((int) (short) 1, 1, tradingDayList10);
        org.junit.Assert.assertNotNull(tradingDayArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str8, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(tradingDayList10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.util.Currency currency2 = null;
        java.util.Currency currency3 = null;
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = grandtrunkCurrencyExchangeService0.getExchangeRate(currency2, currency3, localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest/hi!/com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.tecacet.finance.service.WebUtil.getResponseAsString("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: com.tecacet.finance.service.currency.exchangerateexception");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        com.tecacet.finance.service.WebServiceException webServiceException1 = new com.tecacet.finance.service.WebServiceException("");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        com.tecacet.finance.service.stock.yahoo.CrumbManager crumbManager0 = new com.tecacet.finance.service.stock.yahoo.CrumbManager();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.tecacet.finance.service.WebUtil.getResponseAsString("com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: com.tecacet.finance.service.stock.stockserviceexception");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("0:10 on null");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: 0:10 on null");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        java.lang.Throwable throwable3 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException4 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable3);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException5 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException4);
        stockServiceException2.addSuppressed((java.lang.Throwable) stockServiceException5);
        java.lang.Throwable[] throwableArray7 = stockServiceException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        com.tecacet.finance.service.asset.BarchartAssetService barchartAssetService0 = new com.tecacet.finance.service.asset.BarchartAssetService();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet1 = barchartAssetService0.getAssets();
        org.junit.Assert.assertNotNull(assetSet1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        com.tecacet.finance.model.StandardPeriodType standardPeriodType0 = com.tecacet.finance.model.StandardPeriodType.YEAR;
        int int1 = standardPeriodType0.getPeriodsInYear();
        org.junit.Assert.assertTrue("'" + standardPeriodType0 + "' != '" + com.tecacet.finance.model.StandardPeriodType.YEAR + "'", standardPeriodType0.equals(com.tecacet.finance.model.StandardPeriodType.YEAR));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser6 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray0, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "TradingCalendar(month=365, year=10)" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser14 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray5, strArray13);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser21 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray15, strArray20);
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser22 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray5, strArray15);
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Quote> quoteList24 = yahooPriceParser22.parse(inputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.util.List<java.lang.String> strList6 = holidaySupport5.getRegions();
        com.tecacet.finance.model.calendar.Country country7 = holidaySupport5.getCountry();
        com.tecacet.finance.model.calendar.Country country8 = holidaySupport5.getCountry();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(country7);
        org.junit.Assert.assertNull(country8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        com.tecacet.finance.service.stock.yahoo.YahooDividendParser yahooDividendParser0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendParser();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap2 = yahooDividendParser0.parse(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        com.tecacet.finance.service.asset.BarchartAssetService barchartAssetService1 = new com.tecacet.finance.service.asset.BarchartAssetService(false);
        java.util.Set<com.tecacet.finance.model.Asset> assetSet2 = barchartAssetService1.getAssets();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet3 = barchartAssetService1.getAssets();
        org.junit.Assert.assertNotNull(assetSet2);
        org.junit.Assert.assertNotNull(assetSet3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) -1, (int) 'a');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradierTradingDayService0.getTradingDays((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)", "");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest/HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)/ failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException("TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException3 = new com.tecacet.finance.service.stock.StockServiceException("");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException4 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException3);
        exchangeRateException1.addSuppressed((java.lang.Throwable) stockServiceException3);
        java.lang.String str6 = exchangeRateException1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)" + "'", str6, "com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.lang.String str6 = holidaySupportBuilder2.toString();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)" + "'", str6, "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        com.tecacet.finance.model.Exchange exchange0 = com.tecacet.finance.model.Exchange.NYSE;
        org.junit.Assert.assertTrue("'" + exchange0 + "' != '" + com.tecacet.finance.model.Exchange.NYSE + "'", exchange0.equals(com.tecacet.finance.model.Exchange.NYSE));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        com.tecacet.finance.service.WebServiceException webServiceException1 = new com.tecacet.finance.service.WebServiceException("0:10 on null");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList4 = enricoHolidayService0.getHolidaysForMonth((int) ' ', (int) '4', "com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'com.tecacet.finance.service.currency.exchangerateexception: tradingday.tradingdaybuilder(date=null, starttime=null, endtime=null, description=null, marketstatus=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("hi!", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException3 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException2);
        java.lang.Throwable[] throwableArray4 = stockServiceException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar3 = tradierTradingDayService0.getCalendar(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar10 = tradierTradingDayService0.getCalendar(1, 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        long long1 = quote0.getVolume();
        double double2 = quote0.getClose();
        double double3 = quote0.getClose();
        double double4 = quote0.getHigh();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList4 = enricoHolidayService0.getHolidaysForYear((int) '#', "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'holiday.holidaybuilder(date=null, locale=null, type=null, description=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar10 = tradierTradingDayService0.getCalendar((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) 10, (int) (short) 0);
        java.lang.String str4 = split3.toString();
        java.time.LocalDate localDate5 = split3.getDate();
        boolean boolean6 = split3.isReverse();
        boolean boolean7 = split3.isReverse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:10 on null" + "'", str4, "0:10 on null");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList2 = tradierTradingDayService0.getTradingDays((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        com.tecacet.finance.model.StandardPeriodType standardPeriodType0 = com.tecacet.finance.model.StandardPeriodType.MONTH;
        org.junit.Assert.assertTrue("'" + standardPeriodType0 + "' != '" + com.tecacet.finance.model.StandardPeriodType.MONTH + "'", standardPeriodType0.equals(com.tecacet.finance.model.StandardPeriodType.MONTH));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradierTradingDayService0.getTradingDays((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList7 = enricoHolidayService0.getHolidaysForDateRange(localDate4, localDate5, "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        java.time.LocalDate localDate6 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder7 = holidayBuilder5.date(localDate6);
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holidayBuilder7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getClose();
        long long3 = quote0.getVolume();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("TradingCalendar(month=365, year=10)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate6 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder7 = holidaySupportBuilder5.fromDate(localDate6);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder16 = holidaySupportBuilder8.holidayTypes((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder17 = holidaySupportBuilder7.regions((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = holidaySupportBuilder4.holidayTypes((java.util.List<java.lang.String>) strList14);
        java.time.LocalDate localDate19 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder20 = holidaySupportBuilder18.fromDate(localDate19);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport21 = holidaySupportBuilder20.build();
        java.util.List<java.lang.String> strList22 = holidaySupport21.getRegions();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder7);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder16);
        org.junit.Assert.assertNotNull(holidaySupportBuilder17);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(holidaySupportBuilder20);
        org.junit.Assert.assertNotNull(holidaySupport21);
        org.junit.Assert.assertNull(strList22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) 10, (int) (short) 0);
        java.lang.String str4 = split3.toString();
        java.time.LocalDate localDate5 = split3.getDate();
        boolean boolean6 = split3.isReverse();
        int int7 = split3.getDenominator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:10 on null" + "'", str4, "0:10 on null");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradierTradingDayService0.getTradingDays(0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException3 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException5 = new com.tecacet.finance.service.stock.StockServiceException("");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException6 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException5);
        stockServiceException3.addSuppressed((java.lang.Throwable) stockServiceException5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        long long1 = quote0.getVolume();
        double double2 = quote0.getClose();
        java.time.LocalDate localDate3 = quote0.getDate();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(localDate3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        java.lang.String str6 = holidayBuilder3.toString();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)" + "'", str6, "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate3 = null;
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList6 = enricoHolidayService0.getHolidaysForDateRange(localDate3, localDate4, "Holiday(date=null, description=null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder3 = assetBuilder0.roundLotSize((int) '4');
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertNotNull(assetBuilder3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        com.tecacet.finance.service.stock.yahoo.YahooSplitParser yahooSplitParser0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitParser();
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.Split split2 = yahooSplitParser0.parse("");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text '' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.tecacet.finance.service.WebUtil.getResponseAsString("com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: com.tecacet.finance.service.currency.exchangerateexception");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        java.lang.String str2 = assetBuilder0.toString();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)" + "'", str2, "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        long long1 = quote0.getVolume();
        double double2 = quote0.getClose();
        double double3 = quote0.getHigh();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("hi!", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str3 = country2.getCountryCode();
        java.time.LocalDate localDate4 = null;
        com.tecacet.finance.model.Split split7 = new com.tecacet.finance.model.Split(localDate4, (int) (byte) 10, (int) (short) 0);
        boolean boolean8 = country2.equals((java.lang.Object) split7);
        boolean boolean9 = split7.isReverse();
        int int10 = split7.getDenominator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate1 = quote0.getDate();
        double double2 = quote0.getAdjustedClose();
        double double3 = quote0.getClose();
        long long4 = quote0.getVolume();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getOpen();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray2 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3, tradingDayArray2);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar5 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3);
        java.lang.String str6 = tradingCalendar5.toString();
        int int7 = tradingCalendar5.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList8 = tradingCalendar5.getTradingDays();
        java.lang.String str9 = tradingCalendar5.toString();
        org.junit.Assert.assertNotNull(tradingDayArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str6, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(tradingDayList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str9, "TradingCalendar(month=365, year=10)");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.tecacet.finance.service.WebUtil.getResponseAsString("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        com.tecacet.finance.model.Exchange exchange0 = com.tecacet.finance.model.Exchange.NASDAQ;
        org.junit.Assert.assertTrue("'" + exchange0 + "' != '" + com.tecacet.finance.model.Exchange.NASDAQ + "'", exchange0.equals(com.tecacet.finance.model.Exchange.NASDAQ));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate6 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder7 = holidaySupportBuilder5.fromDate(localDate6);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder16 = holidaySupportBuilder8.holidayTypes((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder17 = holidaySupportBuilder7.regions((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = holidaySupportBuilder4.holidayTypes((java.util.List<java.lang.String>) strList14);
        java.time.LocalDate localDate19 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder20 = holidaySupportBuilder18.fromDate(localDate19);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport21 = holidaySupportBuilder20.build();
        java.time.LocalDate localDate22 = holidaySupport21.getToDate();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder7);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder16);
        org.junit.Assert.assertNotNull(holidaySupportBuilder17);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(holidaySupportBuilder20);
        org.junit.Assert.assertNotNull(holidaySupport21);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        com.tecacet.finance.service.stock.yahoo.YahooStockPriceService yahooStockPriceService0 = new com.tecacet.finance.service.stock.yahoo.YahooStockPriceService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.StandardPeriodType standardPeriodType4 = com.tecacet.finance.model.StandardPeriodType.WEEK;
        int int5 = standardPeriodType4.getPeriodsInYear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Quote> quoteList6 = yahooStockPriceService0.getPriceHistory("com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", localDate2, localDate3, standardPeriodType4);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + standardPeriodType4 + "' != '" + com.tecacet.finance.model.StandardPeriodType.WEEK + "'", standardPeriodType4.equals(com.tecacet.finance.model.StandardPeriodType.WEEK));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException2 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException1);
        java.lang.String str3 = stockServiceException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.tecacet.finance.service.stock.StockServiceException: " + "'", str3, "com.tecacet.finance.service.stock.StockServiceException: ");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("TradingCalendar(month=365, year=10)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray13 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList14 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14, tradingDayArray13);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar16 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet17 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList19 = tradierTradingDayService0.getTradingDays((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tradingDaySet17);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        com.tecacet.finance.service.stock.yahoo.YahooSplitParser yahooSplitParser0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitParser();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList2 = yahooSplitParser0.parse(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        com.tecacet.finance.model.calendar.Holiday holiday2 = holidayBuilder0.build();
        com.tecacet.finance.model.calendar.Holiday holiday3 = holidayBuilder0.build();
        java.lang.String str4 = holiday3.getDescription();
        java.lang.String str5 = holiday3.getType();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday2);
        org.junit.Assert.assertNotNull(holiday3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.util.List<java.lang.String> strList6 = holidaySupport5.getRegions();
        java.time.LocalDate localDate7 = holidaySupport5.getFromDate();
        java.time.LocalDate localDate8 = holidaySupport5.getFromDate();
        java.time.LocalDate localDate9 = holidaySupport5.getToDate();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str3 = country2.getCountryCode();
        com.tecacet.finance.service.WebServiceException webServiceException5 = new com.tecacet.finance.service.WebServiceException("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        boolean boolean6 = country2.equals((java.lang.Object) webServiceException5);
        java.lang.Class<?> wildcardClass7 = country2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: unknown protocol: com.tecacet.finance.service.currency.exchangerateexception");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray13 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList14 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14, tradingDayArray13);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar16 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet17 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList19 = tradierTradingDayService0.getTradingDays(365);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tradingDaySet17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.Currency currency1 = null;
        java.util.Currency currency2 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double3 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate(currency1, currency2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray5 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = holidaySupportBuilder0.holidayTypes((java.util.List<java.lang.String>) strList6);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport9 = holidaySupportBuilder0.build();
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder10 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = holidaySupportBuilder10.holidayTypes((java.util.List<java.lang.String>) strList16);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder19 = holidaySupportBuilder0.holidayTypes((java.util.List<java.lang.String>) strList16);
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(holidaySupport9);
        org.junit.Assert.assertNotNull(holidaySupportBuilder10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(holidaySupportBuilder19);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.tecacet.finance.model.calendar.Country, java.util.List<com.tecacet.finance.model.calendar.Holiday>> countryMap5 = enricoHolidayService0.whereIsPublicHoliday(localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        java.lang.String str2 = asset1.getName();
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder3 = asset1.toBuilder();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(assetBuilder3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList6 = enricoHolidayService0.getHolidaysForMonth((int) (byte) 1, (int) (byte) 1, "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'asset.assetbuilder(symbol=null, name=null, assettype=null, roundlotsize=0, exchange=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        com.tecacet.finance.model.Exchange exchange0 = com.tecacet.finance.model.Exchange.NYSE_ARCA;
        org.junit.Assert.assertTrue("'" + exchange0 + "' != '" + com.tecacet.finance.model.Exchange.NYSE_ARCA + "'", exchange0.equals(com.tecacet.finance.model.Exchange.NYSE_ARCA));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder2 = assetBuilder0.name("Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder4 = assetBuilder2.name("Holiday(date=null, description=null)");
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(assetBuilder2);
        org.junit.Assert.assertNotNull(assetBuilder4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("0:10 on null", "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest/0:10 on null/com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException:  failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday holiday6 = holidayBuilder3.build();
        java.lang.String str7 = holidayBuilder3.toString();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holiday6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)" + "'", str7, "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        java.lang.String str2 = asset1.getSymbol();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList7 = enricoHolidayService0.getHolidaysForMonth((int) 'a', (int) (short) 10, "Holiday(date=null, description=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'holiday(date=null, description=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("", "0:10 on null");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest//0:10 on null failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService3 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList4 = grandtrunkCurrencyExchangeService3.getSupportedCurrencies();
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = holidaySupportBuilder0.holidayTypes(strList4);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport6 = holidaySupportBuilder0.build();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupport6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("com.tecacet.finance.service.stock.StockServiceException: ", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate1 = quote0.getDate();
        double double2 = quote0.getAdjustedClose();
        double double3 = quote0.getClose();
        double double4 = quote0.getOpen();
        long long5 = quote0.getVolume();
        long long6 = quote0.getVolume();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (short) 0, (int) (byte) 1);
        java.lang.String str4 = split3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1:0 on null" + "'", str4, "1:0 on null");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        com.tecacet.finance.model.calendar.TradingDay.MarketStatus marketStatus3 = com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.marketStatus(marketStatus3);
        java.time.LocalDate localDate5 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder6 = tradingDayBuilder2.date(localDate5);
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder8 = tradingDayBuilder2.description("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        java.lang.Class<?> wildcardClass9 = tradingDayBuilder8.getClass();
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertTrue("'" + marketStatus3 + "' != '" + com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN + "'", marketStatus3.equals(com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN));
        org.junit.Assert.assertNotNull(tradingDayBuilder4);
        org.junit.Assert.assertNotNull(tradingDayBuilder6);
        org.junit.Assert.assertNotNull(tradingDayBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException3 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException4 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) exchangeRateException1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        com.tecacet.finance.model.calendar.Country country6 = holidaySupport5.getCountry();
        java.util.List<java.lang.String> strList7 = holidaySupport5.getHolidayTypes();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(country6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        com.tecacet.finance.model.Exchange exchange2 = com.tecacet.finance.model.Exchange.BATS;
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder3 = assetBuilder0.exchange(exchange2);
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder5 = assetBuilder0.roundLotSize(1);
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + exchange2 + "' != '" + com.tecacet.finance.model.Exchange.BATS + "'", exchange2.equals(com.tecacet.finance.model.Exchange.BATS));
        org.junit.Assert.assertNotNull(assetBuilder3);
        org.junit.Assert.assertNotNull(assetBuilder5);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray8 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9, tradingDayArray8);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet11 = tradierTradingDayService0.getEarlyCloseDays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar14 = tradierTradingDayService0.getCalendar(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
        org.junit.Assert.assertNotNull(tradingDayArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tradingDaySet11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday holiday6 = holidayBuilder3.build();
        com.tecacet.finance.model.calendar.Holiday holiday7 = holidayBuilder3.build();
        java.time.LocalDate localDate8 = holiday7.getDate();
        java.util.Locale locale9 = holiday7.getLocale();
        java.lang.String str10 = holiday7.getType();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holiday6);
        org.junit.Assert.assertNotNull(holiday7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: " + "'", str10, "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder7 = holidayBuilder5.type("Holiday(date=null, description=null)");
        java.lang.String str8 = holidayBuilder7.toString();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holidayBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=Holiday(date=null, description=null), description=null)" + "'", str8, "Holiday.HolidayBuilder(date=null, locale=null, type=Holiday(date=null, description=null), description=null)");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str3 = country2.getCountryCode();
        java.lang.String str4 = country2.getCountryName();
        java.lang.String str5 = country2.getCountryCode();
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder6 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str7 = holidayBuilder6.toString();
        java.util.Locale locale8 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder9 = holidayBuilder6.locale(locale8);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder11 = holidayBuilder9.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday holiday12 = holidayBuilder9.build();
        java.lang.String str13 = holiday12.toString();
        boolean boolean14 = country2.equals((java.lang.Object) holiday12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(holidayBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str7, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder9);
        org.junit.Assert.assertNotNull(holidayBuilder11);
        org.junit.Assert.assertNotNull(holiday12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Holiday(date=null, description=null)" + "'", str13, "Holiday(date=null, description=null)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("0:10 on null", "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        java.lang.String str3 = country2.getCountryName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str3, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        com.tecacet.finance.service.stock.yahoo.YahooSplitParser yahooSplitParser0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitParser();
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.Split split2 = yahooSplitParser0.parse("Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)");
            org.junit.Assert.fail("Expected exception of type java.time.format.DateTimeParseException; message: Text 'Asset.AssetBuilder(symbol=null' could not be parsed at index 0");
        } catch (java.time.format.DateTimeParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getAdjustedClose();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        com.tecacet.finance.service.WebUtil webUtil0 = new com.tecacet.finance.service.WebUtil();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport3 = holidaySupportBuilder2.build();
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport4 = holidaySupportBuilder2.build();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupport3);
        org.junit.Assert.assertNotNull(holidaySupport4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser6 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray0, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "TradingCalendar(month=365, year=10)" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser14 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray5, strArray13);
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Quote> quoteList16 = yahooPriceParser14.parse(inputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray5 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = holidaySupportBuilder0.holidayTypes((java.util.List<java.lang.String>) strList6);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport9 = holidaySupportBuilder0.build();
        com.tecacet.finance.model.calendar.Country country10 = holidaySupport9.getCountry();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(holidaySupport9);
        org.junit.Assert.assertNull(country10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray13 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList14 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14, tradingDayArray13);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar16 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet17 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar20 = tradierTradingDayService0.getCalendar((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tradingDaySet17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getClose();
        double double3 = quote0.getHigh();
        long long4 = quote0.getVolume();
        double double5 = quote0.getAdjustedClose();
        java.time.LocalDate localDate6 = quote0.getDate();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str3 = country2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Country(countryCode=hi!, countryName=)" + "'", str3, "Country(countryCode=hi!, countryName=)");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService11 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray14 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList15 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15, tradingDayArray14);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar17 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15);
        java.lang.String str18 = tradingCalendar17.toString();
        int int19 = tradingCalendar17.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList20 = tradingCalendar17.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet21 = tradierTradingDayService11.getEarlyCloseDays(tradingDayList20);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet22 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList25 = tradierTradingDayService0.getTradingDays((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str18, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(tradingDayList20);
        org.junit.Assert.assertNotNull(tradingDaySet21);
        org.junit.Assert.assertNotNull(tradingDaySet22);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        com.tecacet.finance.service.stock.yahoo.YahooDividendService yahooDividendService0 = new com.tecacet.finance.service.stock.yahoo.YahooDividendService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.time.LocalDate, java.math.BigDecimal> localDateMap4 = yahooDividendService0.getHistoricalDividends("", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList4 = enricoHolidayService0.getSupportedCountries();
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
        org.junit.Assert.assertNotNull(holidaySupportList4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        java.time.LocalDate localDate5 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder6 = holidaySupportBuilder4.toDate(localDate5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService2 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray5 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList6 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList6, tradingDayArray5);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar8 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList6);
        java.lang.String str9 = tradingCalendar8.toString();
        int int10 = tradingCalendar8.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList11 = tradingCalendar8.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet12 = tradierTradingDayService2.getEarlyCloseDays(tradingDayList11);
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService13 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray16 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList17 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList17, tradingDayArray16);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar19 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList17);
        java.lang.String str20 = tradingCalendar19.toString();
        int int21 = tradingCalendar19.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList22 = tradingCalendar19.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet23 = tradierTradingDayService13.getEarlyCloseDays(tradingDayList22);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet24 = tradierTradingDayService2.getEarlyCloseDays(tradingDayList22);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar25 = new com.tecacet.finance.model.calendar.TradingCalendar(0, (int) '#', tradingDayList22);
        org.junit.Assert.assertNotNull(tradingDayArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str9, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(tradingDayList11);
        org.junit.Assert.assertNotNull(tradingDaySet12);
        org.junit.Assert.assertNotNull(tradingDayArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str20, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(tradingDayList22);
        org.junit.Assert.assertNotNull(tradingDaySet23);
        org.junit.Assert.assertNotNull(tradingDaySet24);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList7 = enricoHolidayService0.getHolidaysForMonth((int) '4', (int) ' ', "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'holiday.holidaybuilder(date=null, locale=null, type=null, description=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        com.tecacet.finance.model.StandardPeriodType standardPeriodType0 = com.tecacet.finance.model.StandardPeriodType.DAY;
        int int1 = standardPeriodType0.getPeriodsInYear();
        int int2 = standardPeriodType0.getPeriodsInYear();
        int int3 = standardPeriodType0.getPeriodsInYear();
        org.junit.Assert.assertTrue("'" + standardPeriodType0 + "' != '" + com.tecacet.finance.model.StandardPeriodType.DAY + "'", standardPeriodType0.equals(com.tecacet.finance.model.StandardPeriodType.DAY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getExchangeRate("Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)", "", localDate3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        java.util.Locale locale6 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder7 = holidayBuilder5.locale(locale6);
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holidayBuilder7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday holiday6 = holidayBuilder3.build();
        com.tecacet.finance.model.calendar.Holiday holiday7 = holidayBuilder3.build();
        java.util.Locale locale8 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder9 = holidayBuilder3.locale(locale8);
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holiday6);
        org.junit.Assert.assertNotNull(holiday7);
        org.junit.Assert.assertNotNull(holidayBuilder9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray2 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3, tradingDayArray2);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar5 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3);
        java.lang.String str6 = tradingCalendar5.toString();
        int int7 = tradingCalendar5.getMonth();
        org.junit.Assert.assertNotNull(tradingDayArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str6, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar13 = tradierTradingDayService0.getCalendar((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray8 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9, tradingDayArray8);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet11 = tradierTradingDayService0.getEarlyCloseDays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList14 = tradierTradingDayService0.getTradingDays((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
        org.junit.Assert.assertNotNull(tradingDayArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tradingDaySet11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        int int2 = asset1.getRoundLotSize();
        com.tecacet.finance.model.Exchange exchange3 = asset1.getExchange();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(exchange3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList5 = enricoHolidayService0.getHolidaysForYear((int) (short) 100, "Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'asset.assetbuilder(symbol=holiday.holidaybuilder(date=null, locale=null, type=null, description=null), name=null, assettype=null, roundlotsize=0, exchange=bats)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest/Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)/HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null) failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        com.tecacet.finance.model.calendar.TradingDay.MarketStatus marketStatus3 = com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.marketStatus(marketStatus3);
        java.time.LocalTime localTime5 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder6 = tradingDayBuilder4.endTime(localTime5);
        java.time.LocalTime localTime7 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder8 = tradingDayBuilder6.startTime(localTime7);
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertTrue("'" + marketStatus3 + "' != '" + com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN + "'", marketStatus3.equals(com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN));
        org.junit.Assert.assertNotNull(tradingDayBuilder4);
        org.junit.Assert.assertNotNull(tradingDayBuilder6);
        org.junit.Assert.assertNotNull(tradingDayBuilder8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException3 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        java.lang.Throwable[] throwableArray4 = exchangeRateException1.getSuppressed();
        java.lang.String str5 = exchangeRateException1.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException" + "'", str5, "com.tecacet.finance.service.currency.ExchangeRateException");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate4 = null;
        java.time.LocalDate localDate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList7 = enricoHolidayService0.getHolidaysForDateRange(localDate4, localDate5, "Holiday(date=null, description=null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate6 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder7 = holidaySupportBuilder5.fromDate(localDate6);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder16 = holidaySupportBuilder8.holidayTypes((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder17 = holidaySupportBuilder7.regions((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = holidaySupportBuilder4.holidayTypes((java.util.List<java.lang.String>) strList14);
        java.time.LocalDate localDate19 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder20 = holidaySupportBuilder18.fromDate(localDate19);
        java.lang.String[] strArray38 = new java.lang.String[] { "Holiday.HolidayBuilder(date=null, locale=null, type=Holiday(date=null, description=null), description=null)", "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", "Holiday.HolidayBuilder(date=null, locale=null, type=Holiday(date=null, description=null), description=null)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)", "Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)", "Holiday(date=null, description=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)", "Country(countryCode=hi!, countryName=)", "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)", "0:10 on null", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder41 = holidaySupportBuilder18.holidayTypes((java.util.List<java.lang.String>) strList39);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport42 = holidaySupportBuilder18.build();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder7);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder16);
        org.junit.Assert.assertNotNull(holidaySupportBuilder17);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(holidaySupportBuilder20);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder41);
        org.junit.Assert.assertNotNull(holidaySupport42);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray8 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9, tradingDayArray8);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet11 = tradierTradingDayService0.getEarlyCloseDays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList13 = tradierTradingDayService0.getTradingDays((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
        org.junit.Assert.assertNotNull(tradingDayArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tradingDaySet11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = grandtrunkCurrencyExchangeService0.getExchangeRate("Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)", "com.tecacet.finance.service.stock.StockServiceException: ", localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService11 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray14 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList15 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15, tradingDayArray14);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar17 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15);
        java.lang.String str18 = tradingCalendar17.toString();
        int int19 = tradingCalendar17.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList20 = tradingCalendar17.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet21 = tradierTradingDayService11.getEarlyCloseDays(tradingDayList20);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet22 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList20);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar25 = tradierTradingDayService0.getCalendar((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str18, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(tradingDayList20);
        org.junit.Assert.assertNotNull(tradingDaySet21);
        org.junit.Assert.assertNotNull(tradingDaySet22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday holiday6 = holidayBuilder3.build();
        java.lang.String str7 = holiday6.toString();
        java.lang.String str8 = holiday6.getType();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holiday6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Holiday(date=null, description=null)" + "'", str7, "Holiday(date=null, description=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: " + "'", str8, "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        long long1 = quote0.getVolume();
        double double2 = quote0.getClose();
        double double3 = quote0.getAdjustedClose();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        java.time.LocalDate localDate5 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder6 = holidaySupportBuilder2.toDate(localDate5);
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService7 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList8 = grandtrunkCurrencyExchangeService7.getSupportedCurrencies();
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder9 = holidaySupportBuilder2.regions(strList8);
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(holidaySupportBuilder9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        com.tecacet.finance.service.WebServiceException webServiceException1 = new com.tecacet.finance.service.WebServiceException("Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("TradingCalendar(month=365, year=10)");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: TradingCalendar(month=365, year=10)");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradierTradingDayService0.getTradingDays((int) '4');
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        com.tecacet.finance.model.AssetType assetType2 = com.tecacet.finance.model.AssetType.STOCK;
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder3 = assetBuilder0.assetType(assetType2);
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + assetType2 + "' != '" + com.tecacet.finance.model.AssetType.STOCK + "'", assetType2.equals(com.tecacet.finance.model.AssetType.STOCK));
        org.junit.Assert.assertNotNull(assetBuilder3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        com.tecacet.finance.model.calendar.Holiday holiday2 = holidayBuilder0.build();
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder4 = holidayBuilder0.type("HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder6 = holidayBuilder4.description("0:10 on null");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder8 = holidayBuilder6.description("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        java.lang.String str9 = holidayBuilder6.toString();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday2);
        org.junit.Assert.assertNotNull(holidayBuilder4);
        org.junit.Assert.assertNotNull(holidayBuilder6);
        org.junit.Assert.assertNotNull(holidayBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null), description=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: )" + "'", str9, "Holiday.HolidayBuilder(date=null, locale=null, type=HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null), description=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: )");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        com.tecacet.finance.model.calendar.Holiday holiday2 = holidayBuilder0.build();
        java.lang.String str3 = holiday2.toString();
        java.time.LocalDate localDate4 = holiday2.getDate();
        java.lang.String str5 = holiday2.toString();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Holiday(date=null, description=null)" + "'", str3, "Holiday(date=null, description=null)");
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Holiday(date=null, description=null)" + "'", str5, "Holiday(date=null, description=null)");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser6 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray0, strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "TradingCalendar(month=365, year=10)" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser14 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray5, strArray13);
        java.lang.String[] strArray15 = new java.lang.String[] {};
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser21 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray15, strArray20);
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser22 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray5, strArray15);
        java.lang.String[] strArray23 = new java.lang.String[] {};
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser29 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray23, strArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "TradingCalendar(month=365, year=10)" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser37 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray28, strArray36);
        java.lang.String[] strArray38 = new java.lang.String[] {};
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "hi!", "" };
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser44 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray38, strArray43);
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser45 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray28, strArray38);
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser46 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser(strArray5, strArray28);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList7 = enricoHolidayService0.getHolidaysForMonth((int) (short) 1, (int) (short) 100, "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'holidaysupport.holidaysupportbuilder(country=null, holidaytypes=[tradingcalendar(month=365, year=10), com.tecacet.finance.service.stock.stockserviceexception: com.tecacet.finance.service.currency.exchangerateexception, hi!, com.tecacet.finance.service.stock.stockserviceexception: com.tecacet.finance.service.currency.exchangerateexception], regions=null, fromdate=null, todate=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.tecacet.finance.service.WebUtil.getResponseAsString("com.tecacet.finance.service.currency.ExchangeRateException");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: com.tecacet.finance.service.currency.ExchangeRateException");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        int int2 = asset1.getRoundLotSize();
        int int3 = asset1.getRoundLotSize();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (byte) 10, (int) (short) 0);
        java.lang.String str4 = split3.toString();
        java.time.LocalDate localDate5 = split3.getDate();
        boolean boolean6 = split3.isReverse();
        int int7 = split3.getNumerator();
        boolean boolean8 = split3.isReverse();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:10 on null" + "'", str4, "0:10 on null");
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("0:10 on null", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getClose();
        double double3 = quote0.getHigh();
        long long4 = quote0.getVolume();
        double double5 = quote0.getAdjustedClose();
        double double6 = quote0.getLow();
        double double7 = quote0.getOpen();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList7 = enricoHolidayService0.getHolidaysForMonth((int) (short) 1, (int) (short) 0, "Holiday.HolidayBuilder(date=null, locale=null, type=HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null), description=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: )");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'holiday.holidaybuilder(date=null, locale=null, type=holidaysupport.holidaysupportbuilder(country=null, holidaytypes=[tradingcalendar(month=365, year=10), com.tecacet.finance.service.stock.stockserviceexception: com.tecacet.finance.service.currency.exchangerateexception, hi!, com.tecacet.finance.service.stock.stockserviceexception: com.tecacet.finance.service.currency.exchangerateexception], regions=null, fromdate=null, todate=null), description=com.tecacet.finance.service.curr\"[truncated 106 chars]; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder3 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray8 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder11 = holidaySupportBuilder3.holidayTypes((java.util.List<java.lang.String>) strList9);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder12 = holidaySupportBuilder2.regions((java.util.List<java.lang.String>) strList9);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder13 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate14 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder15 = holidaySupportBuilder13.fromDate(localDate14);
        java.time.LocalDate localDate16 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder17 = holidaySupportBuilder15.fromDate(localDate16);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate19 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder20 = holidaySupportBuilder18.fromDate(localDate19);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder21 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray26 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder29 = holidaySupportBuilder21.holidayTypes((java.util.List<java.lang.String>) strList27);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder30 = holidaySupportBuilder20.regions((java.util.List<java.lang.String>) strList27);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder31 = holidaySupportBuilder17.holidayTypes((java.util.List<java.lang.String>) strList27);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder32 = holidaySupportBuilder12.holidayTypes((java.util.List<java.lang.String>) strList27);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder33 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate34 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder35 = holidaySupportBuilder33.fromDate(localDate34);
        java.time.LocalDate localDate36 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder37 = holidaySupportBuilder35.fromDate(localDate36);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder38 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate39 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder40 = holidaySupportBuilder38.fromDate(localDate39);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder41 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder49 = holidaySupportBuilder41.holidayTypes((java.util.List<java.lang.String>) strList47);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder50 = holidaySupportBuilder40.regions((java.util.List<java.lang.String>) strList47);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder51 = holidaySupportBuilder37.holidayTypes((java.util.List<java.lang.String>) strList47);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder52 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate53 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder54 = holidaySupportBuilder52.fromDate(localDate53);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder55 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray60 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder63 = holidaySupportBuilder55.holidayTypes((java.util.List<java.lang.String>) strList61);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder64 = holidaySupportBuilder54.regions((java.util.List<java.lang.String>) strList61);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder65 = holidaySupportBuilder37.regions((java.util.List<java.lang.String>) strList61);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder66 = holidaySupportBuilder32.holidayTypes((java.util.List<java.lang.String>) strList61);
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder11);
        org.junit.Assert.assertNotNull(holidaySupportBuilder12);
        org.junit.Assert.assertNotNull(holidaySupportBuilder13);
        org.junit.Assert.assertNotNull(holidaySupportBuilder15);
        org.junit.Assert.assertNotNull(holidaySupportBuilder17);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(holidaySupportBuilder20);
        org.junit.Assert.assertNotNull(holidaySupportBuilder21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder29);
        org.junit.Assert.assertNotNull(holidaySupportBuilder30);
        org.junit.Assert.assertNotNull(holidaySupportBuilder31);
        org.junit.Assert.assertNotNull(holidaySupportBuilder32);
        org.junit.Assert.assertNotNull(holidaySupportBuilder33);
        org.junit.Assert.assertNotNull(holidaySupportBuilder35);
        org.junit.Assert.assertNotNull(holidaySupportBuilder37);
        org.junit.Assert.assertNotNull(holidaySupportBuilder38);
        org.junit.Assert.assertNotNull(holidaySupportBuilder40);
        org.junit.Assert.assertNotNull(holidaySupportBuilder41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder49);
        org.junit.Assert.assertNotNull(holidaySupportBuilder50);
        org.junit.Assert.assertNotNull(holidaySupportBuilder51);
        org.junit.Assert.assertNotNull(holidaySupportBuilder52);
        org.junit.Assert.assertNotNull(holidaySupportBuilder54);
        org.junit.Assert.assertNotNull(holidaySupportBuilder55);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder63);
        org.junit.Assert.assertNotNull(holidaySupportBuilder64);
        org.junit.Assert.assertNotNull(holidaySupportBuilder65);
        org.junit.Assert.assertNotNull(holidaySupportBuilder66);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.net.URL uRL0 = null;
        com.tecacet.finance.service.stock.yahoo.RedirectableRequest redirectableRequest2 = new com.tecacet.finance.service.stock.yahoo.RedirectableRequest(uRL0, 0);
        redirectableRequest2.setConnectTimeout(365);
        // The following exception was thrown during execution in test generation
        try {
            java.net.URLConnection uRLConnection5 = redirectableRequest2.openConnection();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException2 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException1);
        java.lang.Throwable throwable3 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException4 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable3);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException5 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException4);
        stockServiceException2.addSuppressed((java.lang.Throwable) stockServiceException5);
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException7 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException2);
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException9 = new com.tecacet.finance.service.currency.ExchangeRateException("TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException11 = new com.tecacet.finance.service.stock.StockServiceException("");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException12 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException11);
        exchangeRateException9.addSuppressed((java.lang.Throwable) stockServiceException11);
        stockServiceException2.addSuppressed((java.lang.Throwable) stockServiceException11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray4 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList5 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList5, tradingDayArray4);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar7 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList5);
        java.lang.String str8 = tradingCalendar7.toString();
        int int9 = tradingCalendar7.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList10 = tradingCalendar7.getTradingDays();
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar11 = new com.tecacet.finance.model.calendar.TradingCalendar((int) (short) 10, (int) (byte) 100, tradingDayList10);
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList12 = tradingCalendar11.getTradingDays();
        org.junit.Assert.assertNotNull(tradingDayArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str8, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(tradingDayList10);
        org.junit.Assert.assertNotNull(tradingDayList12);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str3 = country2.getCountryCode();
        java.time.LocalDate localDate4 = null;
        com.tecacet.finance.model.Split split7 = new com.tecacet.finance.model.Split(localDate4, (int) (byte) 10, (int) (short) 0);
        boolean boolean8 = country2.equals((java.lang.Object) split7);
        java.time.LocalDate localDate9 = split7.getDate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        com.tecacet.finance.model.calendar.TradingDay.MarketStatus marketStatus3 = com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.marketStatus(marketStatus3);
        java.time.LocalTime localTime5 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder6 = tradingDayBuilder4.endTime(localTime5);
        com.tecacet.finance.model.calendar.TradingDay.MarketStatus marketStatus7 = com.tecacet.finance.model.calendar.TradingDay.MarketStatus.CLOSED;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder8 = tradingDayBuilder6.marketStatus(marketStatus7);
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertTrue("'" + marketStatus3 + "' != '" + com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN + "'", marketStatus3.equals(com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN));
        org.junit.Assert.assertNotNull(tradingDayBuilder4);
        org.junit.Assert.assertNotNull(tradingDayBuilder6);
        org.junit.Assert.assertTrue("'" + marketStatus7 + "' != '" + com.tecacet.finance.model.calendar.TradingDay.MarketStatus.CLOSED + "'", marketStatus7.equals(com.tecacet.finance.model.calendar.TradingDay.MarketStatus.CLOSED));
        org.junit.Assert.assertNotNull(tradingDayBuilder8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        java.net.URL uRL0 = null;
        com.tecacet.finance.service.stock.yahoo.RedirectableRequest redirectableRequest2 = new com.tecacet.finance.service.stock.yahoo.RedirectableRequest(uRL0, 0);
        redirectableRequest2.setConnectTimeout((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URLConnection uRLConnection6 = redirectableRequest2.openConnection(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        com.tecacet.finance.model.Exchange exchange2 = com.tecacet.finance.model.Exchange.BATS;
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder3 = assetBuilder0.exchange(exchange2);
        com.tecacet.finance.model.Asset asset4 = assetBuilder0.build();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + exchange2 + "' != '" + com.tecacet.finance.model.Exchange.BATS + "'", exchange2.equals(com.tecacet.finance.model.Exchange.BATS));
        org.junit.Assert.assertNotNull(assetBuilder3);
        org.junit.Assert.assertNotNull(asset4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        com.tecacet.finance.service.stock.yahoo.YahooStockPriceService yahooStockPriceService0 = new com.tecacet.finance.service.stock.yahoo.YahooStockPriceService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.StandardPeriodType standardPeriodType4 = com.tecacet.finance.model.StandardPeriodType.YEAR;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Quote> quoteList5 = yahooStockPriceService0.getPriceHistory("Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)", localDate2, localDate3, standardPeriodType4);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + standardPeriodType4 + "' != '" + com.tecacet.finance.model.StandardPeriodType.YEAR + "'", standardPeriodType4.equals(com.tecacet.finance.model.StandardPeriodType.YEAR));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        long long1 = quote0.getVolume();
        double double2 = quote0.getClose();
        double double3 = quote0.getClose();
        long long4 = quote0.getVolume();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        java.net.URL uRL0 = null;
        com.tecacet.finance.service.stock.yahoo.RedirectableRequest redirectableRequest2 = new com.tecacet.finance.service.stock.yahoo.RedirectableRequest(uRL0, 0);
        redirectableRequest2.setConnectTimeout((int) (byte) 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        com.tecacet.finance.model.AssetType assetType2 = asset1.getAssetType();
        int int3 = asset1.getRoundLotSize();
        java.lang.String str4 = asset1.getSymbol();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertNull(assetType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("1:0 on null", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        java.lang.Throwable throwable0 = null;
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException(throwable0);
        java.lang.String str2 = exchangeRateException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException" + "'", str2, "com.tecacet.finance.service.currency.ExchangeRateException");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        java.util.Locale locale2 = null;
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder3 = holidayBuilder0.locale(locale2);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder5 = holidayBuilder3.type("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday holiday6 = holidayBuilder3.build();
        java.lang.String str7 = holiday6.getType();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holidayBuilder3);
        org.junit.Assert.assertNotNull(holidayBuilder5);
        org.junit.Assert.assertNotNull(holiday6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: " + "'", str7, "com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.description("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.description("TradingCalendar(month=365, year=10)");
        java.time.LocalTime localTime5 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder6 = tradingDayBuilder4.endTime(localTime5);
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertNotNull(tradingDayBuilder4);
        org.junit.Assert.assertNotNull(tradingDayBuilder6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        com.tecacet.finance.service.stock.yahoo.YahooStockPriceService yahooStockPriceService0 = new com.tecacet.finance.service.stock.yahoo.YahooStockPriceService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.StandardPeriodType standardPeriodType4 = com.tecacet.finance.model.StandardPeriodType.DAY;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Quote> quoteList5 = yahooStockPriceService0.getPriceHistory("0:10 on null", localDate2, localDate3, standardPeriodType4);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + standardPeriodType4 + "' != '" + com.tecacet.finance.model.StandardPeriodType.DAY + "'", standardPeriodType4.equals(com.tecacet.finance.model.StandardPeriodType.DAY));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.tecacet.finance.model.calendar.Country, java.util.List<com.tecacet.finance.model.calendar.Holiday>> countryMap5 = enricoHolidayService0.whereIsPublicHoliday(localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        java.net.URL uRL0 = null;
        com.tecacet.finance.service.stock.yahoo.RedirectableRequest redirectableRequest2 = new com.tecacet.finance.service.stock.yahoo.RedirectableRequest(uRL0, 0);
        redirectableRequest2.setReadTimeout((int) (short) 1);
        redirectableRequest2.setConnectTimeout((int) (byte) 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        java.lang.String str5 = holidaySupportBuilder2.toString();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)" + "'", str5, "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray13 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList14 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14, tradingDayArray13);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar16 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet17 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList14);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray22 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList23 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList23, tradingDayArray22);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar25 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList23);
        java.lang.String str26 = tradingCalendar25.toString();
        int int27 = tradingCalendar25.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList28 = tradingCalendar25.getTradingDays();
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar29 = new com.tecacet.finance.model.calendar.TradingCalendar((int) (short) 10, (int) (byte) 100, tradingDayList28);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet30 = tradierTradingDayService0.getHolidays(tradingDayList28);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar33 = tradierTradingDayService0.getCalendar((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: month");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tradingDaySet17);
        org.junit.Assert.assertNotNull(tradingDayArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str26, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(tradingDayList28);
        org.junit.Assert.assertNotNull(tradingDaySet30);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, 10, (int) (byte) -1);
        java.lang.String str4 = split3.toString();
        java.lang.String str5 = split3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1:10 on null" + "'", str4, "-1:10 on null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1:10 on null" + "'", str5, "-1:10 on null");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        com.tecacet.finance.io.CSVPriceWriter cSVPriceWriter0 = new com.tecacet.finance.io.CSVPriceWriter();
        com.tecacet.finance.model.Quote quote2 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate3 = quote2.getDate();
        double double4 = quote2.getAdjustedClose();
        com.tecacet.finance.model.Quote quote5 = new com.tecacet.finance.model.Quote();
        double double6 = quote5.getHigh();
        double double7 = quote5.getHigh();
        com.tecacet.finance.model.Quote quote8 = new com.tecacet.finance.model.Quote();
        double double9 = quote8.getHigh();
        double double10 = quote8.getClose();
        double double11 = quote8.getHigh();
        long long12 = quote8.getVolume();
        double double13 = quote8.getAdjustedClose();
        com.tecacet.finance.model.Quote quote14 = new com.tecacet.finance.model.Quote();
        double double15 = quote14.getHigh();
        double double16 = quote14.getClose();
        double double17 = quote14.getHigh();
        long long18 = quote14.getVolume();
        double double19 = quote14.getAdjustedClose();
        com.tecacet.finance.model.Quote quote20 = new com.tecacet.finance.model.Quote();
        double double21 = quote20.getHigh();
        double double22 = quote20.getClose();
        double double23 = quote20.getHigh();
        com.tecacet.finance.model.Quote quote24 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate25 = quote24.getDate();
        double double26 = quote24.getAdjustedClose();
        double double27 = quote24.getClose();
        double double28 = quote24.getOpen();
        long long29 = quote24.getVolume();
        com.tecacet.finance.model.Quote quote30 = new com.tecacet.finance.model.Quote();
        long long31 = quote30.getVolume();
        double double32 = quote30.getClose();
        double double33 = quote30.getAdjustedClose();
        com.tecacet.finance.model.Quote quote34 = new com.tecacet.finance.model.Quote();
        double double35 = quote34.getHigh();
        double double36 = quote34.getClose();
        double double37 = quote34.getHigh();
        long long38 = quote34.getVolume();
        double double39 = quote34.getAdjustedClose();
        com.tecacet.finance.model.Quote quote40 = new com.tecacet.finance.model.Quote();
        double double41 = quote40.getHigh();
        double double42 = quote40.getClose();
        double double43 = quote40.getHigh();
        long long44 = quote40.getVolume();
        double double45 = quote40.getAdjustedClose();
        com.tecacet.finance.model.Quote quote46 = new com.tecacet.finance.model.Quote();
        double double47 = quote46.getHigh();
        double double48 = quote46.getClose();
        double double49 = quote46.getHigh();
        long long50 = quote46.getVolume();
        double double51 = quote46.getAdjustedClose();
        com.tecacet.finance.model.Quote quote52 = new com.tecacet.finance.model.Quote();
        double double53 = quote52.getHigh();
        double double54 = quote52.getAdjustedClose();
        com.tecacet.finance.model.Quote quote55 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate56 = quote55.getDate();
        double double57 = quote55.getAdjustedClose();
        double double58 = quote55.getClose();
        double double59 = quote55.getOpen();
        com.tecacet.finance.model.Quote quote60 = new com.tecacet.finance.model.Quote();
        long long61 = quote60.getVolume();
        double double62 = quote60.getClose();
        double double63 = quote60.getAdjustedClose();
        com.tecacet.finance.model.Quote quote64 = new com.tecacet.finance.model.Quote();
        com.tecacet.finance.model.Quote quote65 = new com.tecacet.finance.model.Quote();
        double double66 = quote65.getHigh();
        double double67 = quote65.getClose();
        double double68 = quote65.getHigh();
        long long69 = quote65.getVolume();
        com.tecacet.finance.model.Quote quote70 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate71 = quote70.getDate();
        double double72 = quote70.getAdjustedClose();
        double double73 = quote70.getClose();
        long long74 = quote70.getVolume();
        com.tecacet.finance.model.Quote quote75 = new com.tecacet.finance.model.Quote();
        long long76 = quote75.getVolume();
        double double77 = quote75.getClose();
        double double78 = quote75.getClose();
        double double79 = quote75.getHigh();
        com.tecacet.finance.model.Quote quote80 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate81 = quote80.getDate();
        double double82 = quote80.getAdjustedClose();
        double double83 = quote80.getLow();
        com.tecacet.finance.model.Quote quote84 = new com.tecacet.finance.model.Quote();
        double double85 = quote84.getHigh();
        double double86 = quote84.getClose();
        long long87 = quote84.getVolume();
        com.tecacet.finance.model.Quote[] quoteArray88 = new com.tecacet.finance.model.Quote[] { quote2, quote5, quote8, quote14, quote20, quote24, quote30, quote34, quote40, quote46, quote52, quote55, quote60, quote64, quote65, quote70, quote75, quote80, quote84 };
        java.util.ArrayList<com.tecacet.finance.model.Quote> quoteList89 = new java.util.ArrayList<com.tecacet.finance.model.Quote>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.Quote>) quoteList89, quoteArray88);
        cSVPriceWriter0.write("TradingCalendar(month=365, year=10)", (java.util.Collection<com.tecacet.finance.model.Quote>) quoteList89);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNull(localDate56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNull(localDate71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNull(localDate81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(quoteArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        com.tecacet.finance.model.calendar.Holiday holiday2 = holidayBuilder0.build();
        java.lang.String str3 = holiday2.toString();
        java.lang.String str4 = holiday2.toString();
        java.lang.String str5 = holiday2.getType();
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Holiday(date=null, description=null)" + "'", str3, "Holiday(date=null, description=null)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Holiday(date=null, description=null)" + "'", str4, "Holiday(date=null, description=null)");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList6 = enricoHolidayService0.getHolidaysForYear((int) ' ', "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'holiday.holidaybuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.exchangerateexception: com.tecacet.finance.service.stock.stockserviceexception: , description=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        java.time.LocalTime localTime1 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.startTime(localTime1);
        com.tecacet.finance.model.calendar.TradingDay.MarketStatus marketStatus3 = com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.marketStatus(marketStatus3);
        java.time.LocalTime localTime5 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder6 = tradingDayBuilder4.endTime(localTime5);
        java.time.LocalTime localTime7 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder8 = tradingDayBuilder6.endTime(localTime7);
        java.time.LocalTime localTime9 = null;
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder10 = tradingDayBuilder6.startTime(localTime9);
        org.junit.Assert.assertNotNull(tradingDayBuilder0);
        org.junit.Assert.assertNotNull(tradingDayBuilder2);
        org.junit.Assert.assertTrue("'" + marketStatus3 + "' != '" + com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN + "'", marketStatus3.equals(com.tecacet.finance.model.calendar.TradingDay.MarketStatus.OPEN));
        org.junit.Assert.assertNotNull(tradingDayBuilder4);
        org.junit.Assert.assertNotNull(tradingDayBuilder6);
        org.junit.Assert.assertNotNull(tradingDayBuilder8);
        org.junit.Assert.assertNotNull(tradingDayBuilder10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        com.tecacet.finance.model.Exchange exchange2 = com.tecacet.finance.model.Exchange.BATS;
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder3 = assetBuilder0.exchange(exchange2);
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder5 = assetBuilder3.symbol("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        java.lang.String str6 = assetBuilder5.toString();
        com.tecacet.finance.model.AssetType assetType7 = com.tecacet.finance.model.AssetType.MUTUAL_FUND;
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder8 = assetBuilder5.assetType(assetType7);
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + exchange2 + "' != '" + com.tecacet.finance.model.Exchange.BATS + "'", exchange2.equals(com.tecacet.finance.model.Exchange.BATS));
        org.junit.Assert.assertNotNull(assetBuilder3);
        org.junit.Assert.assertNotNull(assetBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)" + "'", str6, "Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)");
        org.junit.Assert.assertTrue("'" + assetType7 + "' != '" + com.tecacet.finance.model.AssetType.MUTUAL_FUND + "'", assetType7.equals(com.tecacet.finance.model.AssetType.MUTUAL_FUND));
        org.junit.Assert.assertNotNull(assetBuilder8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getLow();
        double double2 = quote0.getOpen();
        double double3 = quote0.getHigh();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str3 = country2.getCountryCode();
        com.tecacet.finance.service.WebServiceException webServiceException5 = new com.tecacet.finance.service.WebServiceException("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        boolean boolean6 = country2.equals((java.lang.Object) webServiceException5);
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder7 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str8 = holidayBuilder7.toString();
        com.tecacet.finance.model.calendar.Holiday holiday9 = holidayBuilder7.build();
        com.tecacet.finance.model.calendar.Holiday holiday10 = holidayBuilder7.build();
        java.lang.String str11 = holiday10.getDescription();
        boolean boolean12 = country2.equals((java.lang.Object) str11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(holidayBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str8, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday9);
        org.junit.Assert.assertNotNull(holiday10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.util.List<java.lang.String> strList2 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.time.LocalDate localDate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = grandtrunkCurrencyExchangeService0.getExchangeRate("Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)", localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: temporal");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException2 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException1);
        com.tecacet.finance.service.stock.StockServiceException stockServiceException3 = new com.tecacet.finance.service.stock.StockServiceException((java.lang.Exception) exchangeRateException2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService3 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList4 = grandtrunkCurrencyExchangeService3.getSupportedCurrencies();
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = holidaySupportBuilder0.holidayTypes(strList4);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder6 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate7 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = holidaySupportBuilder6.fromDate(localDate7);
        java.time.LocalDate localDate9 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder10 = holidaySupportBuilder8.fromDate(localDate9);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder11 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate12 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder13 = holidaySupportBuilder11.fromDate(localDate12);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder14 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray19 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder22 = holidaySupportBuilder14.holidayTypes((java.util.List<java.lang.String>) strList20);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder23 = holidaySupportBuilder13.regions((java.util.List<java.lang.String>) strList20);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder24 = holidaySupportBuilder10.holidayTypes((java.util.List<java.lang.String>) strList20);
        java.time.LocalDate localDate25 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder26 = holidaySupportBuilder24.fromDate(localDate25);
        java.lang.String[] strArray44 = new java.lang.String[] { "Holiday.HolidayBuilder(date=null, locale=null, type=Holiday(date=null, description=null), description=null)", "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", "Holiday.HolidayBuilder(date=null, locale=null, type=Holiday(date=null, description=null), description=null)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)", "Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)", "Holiday(date=null, description=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=null, regions=null, fromDate=null, toDate=null)", "Country(countryCode=hi!, countryName=)", "TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)", "0:10 on null", "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)", "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder47 = holidaySupportBuilder24.holidayTypes((java.util.List<java.lang.String>) strList45);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder48 = holidaySupportBuilder0.regions((java.util.List<java.lang.String>) strList45);
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder6);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(holidaySupportBuilder10);
        org.junit.Assert.assertNotNull(holidaySupportBuilder11);
        org.junit.Assert.assertNotNull(holidaySupportBuilder13);
        org.junit.Assert.assertNotNull(holidaySupportBuilder14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder22);
        org.junit.Assert.assertNotNull(holidaySupportBuilder23);
        org.junit.Assert.assertNotNull(holidaySupportBuilder24);
        org.junit.Assert.assertNotNull(holidaySupportBuilder26);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder47);
        org.junit.Assert.assertNotNull(holidaySupportBuilder48);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder0 = com.tecacet.finance.model.calendar.Holiday.builder();
        java.lang.String str1 = holidayBuilder0.toString();
        com.tecacet.finance.model.calendar.Holiday holiday2 = holidayBuilder0.build();
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder4 = holidayBuilder0.type("HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=null, fromDate=null, toDate=null)");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder6 = holidayBuilder4.description("0:10 on null");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder8 = holidayBuilder6.description("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.model.calendar.Holiday.HolidayBuilder holidayBuilder10 = holidayBuilder6.description("");
        org.junit.Assert.assertNotNull(holidayBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)" + "'", str1, "Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        org.junit.Assert.assertNotNull(holiday2);
        org.junit.Assert.assertNotNull(holidayBuilder4);
        org.junit.Assert.assertNotNull(holidayBuilder6);
        org.junit.Assert.assertNotNull(holidayBuilder8);
        org.junit.Assert.assertNotNull(holidayBuilder10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport holidaySupport5 = holidaySupportBuilder2.build();
        java.util.List<java.lang.String> strList6 = holidaySupport5.getRegions();
        java.util.List<java.lang.String> strList7 = holidaySupport5.getRegions();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupport5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        java.net.URL uRL0 = null;
        com.tecacet.finance.service.stock.yahoo.RedirectableRequest redirectableRequest2 = new com.tecacet.finance.service.stock.yahoo.RedirectableRequest(uRL0, 0);
        redirectableRequest2.setConnectTimeout((int) (short) 0);
        redirectableRequest2.setReadTimeout(52);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException1 = new com.tecacet.finance.service.currency.ExchangeRateException("hi!");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException2 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) exchangeRateException1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.util.List<java.lang.String> strList2 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.util.Currency currency3 = null;
        java.util.Currency currency4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate(currency3, currency4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream1 = com.tecacet.finance.service.WebUtil.getResponseAsStream("Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        // The following exception was thrown during execution in test generation
        try {
            com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar13 = tradierTradingDayService0.getCalendar((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Call failed with code 400 and message: Invalid Parameter: year");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        com.tecacet.finance.service.stock.StockServiceException stockServiceException1 = new com.tecacet.finance.service.stock.StockServiceException("com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: ");
        com.tecacet.finance.service.currency.ExchangeRateException exchangeRateException2 = new com.tecacet.finance.service.currency.ExchangeRateException((java.lang.Throwable) stockServiceException1);
        com.tecacet.finance.model.calendar.Country country5 = new com.tecacet.finance.model.calendar.Country("hi!", "");
        java.lang.String str6 = country5.getCountryCode();
        com.tecacet.finance.service.WebServiceException webServiceException8 = new com.tecacet.finance.service.WebServiceException("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        boolean boolean9 = country5.equals((java.lang.Object) webServiceException8);
        exchangeRateException2.addSuppressed((java.lang.Throwable) webServiceException8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        com.tecacet.finance.model.calendar.Country country2 = new com.tecacet.finance.model.calendar.Country("", "");
        java.lang.String str3 = country2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Country(countryCode=, countryName=)" + "'", str3, "Country(countryCode=, countryName=)");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.util.List<java.lang.String> strList2 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate("", "0:10 on null");
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.currency.ExchangeRateException; message: com.tecacet.finance.service.WebServiceException: Connect to http://currencies.apps.grandtrunk.net/getlatest//0:10 on null failed with response code 400 and message: Bad Request");
        } catch (com.tecacet.finance.service.currency.ExchangeRateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        java.time.LocalDate localDate0 = null;
        com.tecacet.finance.model.Split split3 = new com.tecacet.finance.model.Split(localDate0, (int) (short) 10, (int) (byte) -1);
        int int4 = split3.getDenominator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder0 = com.tecacet.finance.model.Asset.builder();
        com.tecacet.finance.model.Asset asset1 = assetBuilder0.build();
        int int2 = asset1.getRoundLotSize();
        java.lang.String str3 = asset1.getSymbol();
        com.tecacet.finance.model.Asset.AssetBuilder assetBuilder4 = asset1.toBuilder();
        org.junit.Assert.assertNotNull(assetBuilder0);
        org.junit.Assert.assertNotNull(asset1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(assetBuilder4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList6 = enricoHolidayService0.getHolidaysForYear((int) 'a', "Asset.AssetBuilder(symbol=null, name=null, assetType=null, roundLotSize=0, exchange=null)");
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.databind.exc.MismatchedInputException; message: Cannot deserialize value of type `java.util.ArrayList<com.tecacet.finance.service.calendar.enrico.EnricoHoliday>` from Object value (token `JsonToken.START_OBJECT`)? at [Source: (String)\"{\"error\":\"Country 'asset.assetbuilder(symbol=null, name=null, assettype=null, roundlotsize=0, exchange=null)' is not supported\"}\"; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.databind.exc.MismatchedInputException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        com.tecacet.finance.service.stock.yahoo.YahooSplitService yahooSplitService0 = new com.tecacet.finance.service.stock.yahoo.YahooSplitService();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.Split> splitList4 = yahooSplitService0.getSplitHistory("Asset.AssetBuilder(symbol=Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null), name=null, assetType=null, roundLotSize=0, exchange=BATS)", localDate2, localDate3);
            org.junit.Assert.fail("Expected exception of type com.tecacet.finance.service.stock.StockServiceException; message: java.lang.NullPointerException");
        } catch (com.tecacet.finance.service.stock.StockServiceException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService2 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray5 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList6 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList6, tradingDayArray5);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar8 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList6);
        java.lang.String str9 = tradingCalendar8.toString();
        int int10 = tradingCalendar8.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList11 = tradingCalendar8.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet12 = tradierTradingDayService2.getEarlyCloseDays(tradingDayList11);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar13 = new com.tecacet.finance.model.calendar.TradingCalendar((int) ' ', 0, tradingDayList11);
        org.junit.Assert.assertNotNull(tradingDayArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str9, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(tradingDayList11);
        org.junit.Assert.assertNotNull(tradingDaySet12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet7 = tradierTradingDayService0.getHolidays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray8 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9, tradingDayArray8);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet11 = tradierTradingDayService0.getEarlyCloseDays((java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList9);
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray14 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList15 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15, tradingDayArray14);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar17 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15);
        java.lang.String str18 = tradingCalendar17.toString();
        int int19 = tradingCalendar17.getYear();
        int int20 = tradingCalendar17.getYear();
        int int21 = tradingCalendar17.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList22 = tradingCalendar17.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet23 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList22);
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tradingDaySet7);
        org.junit.Assert.assertNotNull(tradingDayArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tradingDaySet11);
        org.junit.Assert.assertNotNull(tradingDayArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str18, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(tradingDayList22);
        org.junit.Assert.assertNotNull(tradingDaySet23);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService grandtrunkCurrencyExchangeService0 = new com.tecacet.finance.service.currency.GrandtrunkCurrencyExchangeService();
        java.util.List<java.lang.String> strList1 = grandtrunkCurrencyExchangeService0.getSupportedCurrencies();
        java.util.Currency currency2 = null;
        java.util.Currency currency3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = grandtrunkCurrencyExchangeService0.getCurrentExchangeRate(currency2, currency3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray2 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList3 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3, tradingDayArray2);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar5 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList3);
        java.lang.String str6 = tradingCalendar5.toString();
        int int7 = tradingCalendar5.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList8 = tradingCalendar5.getTradingDays();
        int int9 = tradingCalendar5.getYear();
        java.lang.String str10 = tradingCalendar5.toString();
        int int11 = tradingCalendar5.getYear();
        org.junit.Assert.assertNotNull(tradingDayArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str6, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(tradingDayList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str10, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder0 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate1 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder2 = holidaySupportBuilder0.fromDate(localDate1);
        java.time.LocalDate localDate3 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder4 = holidaySupportBuilder2.fromDate(localDate3);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder5 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate6 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder7 = holidaySupportBuilder5.fromDate(localDate6);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder8 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder16 = holidaySupportBuilder8.holidayTypes((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder17 = holidaySupportBuilder7.regions((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder18 = holidaySupportBuilder4.holidayTypes((java.util.List<java.lang.String>) strList14);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder19 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.time.LocalDate localDate20 = null;
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder21 = holidaySupportBuilder19.fromDate(localDate20);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder22 = com.tecacet.finance.model.calendar.HolidaySupport.builder();
        java.lang.String[] strArray27 = new java.lang.String[] { "TradingCalendar(month=365, year=10)", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException", "hi!", "com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder30 = holidaySupportBuilder22.holidayTypes((java.util.List<java.lang.String>) strList28);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder31 = holidaySupportBuilder21.regions((java.util.List<java.lang.String>) strList28);
        com.tecacet.finance.model.calendar.HolidaySupport.HolidaySupportBuilder holidaySupportBuilder32 = holidaySupportBuilder4.regions((java.util.List<java.lang.String>) strList28);
        java.lang.String str33 = holidaySupportBuilder4.toString();
        org.junit.Assert.assertNotNull(holidaySupportBuilder0);
        org.junit.Assert.assertNotNull(holidaySupportBuilder2);
        org.junit.Assert.assertNotNull(holidaySupportBuilder4);
        org.junit.Assert.assertNotNull(holidaySupportBuilder5);
        org.junit.Assert.assertNotNull(holidaySupportBuilder7);
        org.junit.Assert.assertNotNull(holidaySupportBuilder8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder16);
        org.junit.Assert.assertNotNull(holidaySupportBuilder17);
        org.junit.Assert.assertNotNull(holidaySupportBuilder18);
        org.junit.Assert.assertNotNull(holidaySupportBuilder19);
        org.junit.Assert.assertNotNull(holidaySupportBuilder21);
        org.junit.Assert.assertNotNull(holidaySupportBuilder22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(holidaySupportBuilder30);
        org.junit.Assert.assertNotNull(holidaySupportBuilder31);
        org.junit.Assert.assertNotNull(holidaySupportBuilder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], fromDate=null, toDate=null)" + "'", str33, "HolidaySupport.HolidaySupportBuilder(country=null, holidayTypes=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], regions=[TradingCalendar(month=365, year=10), com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException, hi!, com.tecacet.finance.service.stock.StockServiceException: com.tecacet.finance.service.currency.ExchangeRateException], fromDate=null, toDate=null)");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.tecacet.finance.model.calendar.Holiday> holidayList5 = enricoHolidayService0.getHolidaysForDateRange(localDate2, localDate3, "Holiday.HolidayBuilder(date=null, locale=null, type=com.tecacet.finance.service.currency.ExchangeRateException: com.tecacet.finance.service.stock.StockServiceException: , description=null)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate1 = quote0.getDate();
        double double2 = quote0.getAdjustedClose();
        double double3 = quote0.getLow();
        double double4 = quote0.getClose();
        double double5 = quote0.getLow();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        com.tecacet.finance.service.WebServiceException webServiceException1 = new com.tecacet.finance.service.WebServiceException("com.tecacet.finance.service.currency.ExchangeRateException: TradingDay.TradingDayBuilder(date=null, startTime=null, endTime=null, description=null, marketStatus=null)");
        java.lang.Throwable[] throwableArray2 = webServiceException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        com.tecacet.finance.service.stock.yahoo.YahooPriceParser yahooPriceParser0 = new com.tecacet.finance.service.stock.yahoo.YahooPriceParser();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getClose();
        double double3 = quote0.getHigh();
        long long4 = quote0.getVolume();
        double double5 = quote0.getLow();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService0 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray3 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList4 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4, tradingDayArray3);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar6 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList4);
        java.lang.String str7 = tradingCalendar6.toString();
        int int8 = tradingCalendar6.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList9 = tradingCalendar6.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet10 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList9);
        com.tecacet.finance.service.calendar.tradier.TradierTradingDayService tradierTradingDayService11 = new com.tecacet.finance.service.calendar.tradier.TradierTradingDayService();
        com.tecacet.finance.model.calendar.TradingDay[] tradingDayArray14 = new com.tecacet.finance.model.calendar.TradingDay[] {};
        java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay> tradingDayList15 = new java.util.ArrayList<com.tecacet.finance.model.calendar.TradingDay>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15, tradingDayArray14);
        com.tecacet.finance.model.calendar.TradingCalendar tradingCalendar17 = new com.tecacet.finance.model.calendar.TradingCalendar(365, (int) (short) 10, (java.util.List<com.tecacet.finance.model.calendar.TradingDay>) tradingDayList15);
        java.lang.String str18 = tradingCalendar17.toString();
        int int19 = tradingCalendar17.getYear();
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList20 = tradingCalendar17.getTradingDays();
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet21 = tradierTradingDayService11.getEarlyCloseDays(tradingDayList20);
        java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet22 = tradierTradingDayService0.getEarlyCloseDays(tradingDayList20);
        java.util.List<com.tecacet.finance.model.calendar.TradingDay> tradingDayList23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<com.tecacet.finance.model.calendar.TradingDay> tradingDaySet24 = tradierTradingDayService0.getHolidays(tradingDayList23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tradingDayArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str7, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(tradingDayList9);
        org.junit.Assert.assertNotNull(tradingDaySet10);
        org.junit.Assert.assertNotNull(tradingDayArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "TradingCalendar(month=365, year=10)" + "'", str18, "TradingCalendar(month=365, year=10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(tradingDayList20);
        org.junit.Assert.assertNotNull(tradingDaySet21);
        org.junit.Assert.assertNotNull(tradingDaySet22);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        com.tecacet.finance.service.calendar.enrico.EnricoHolidayService enricoHolidayService0 = new com.tecacet.finance.service.calendar.enrico.EnricoHolidayService();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList1 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList2 = enricoHolidayService0.getSupportedCountries();
        java.util.List<com.tecacet.finance.model.calendar.HolidaySupport> holidaySupportList3 = enricoHolidayService0.getSupportedCountries();
        java.time.LocalDate localDate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.tecacet.finance.model.calendar.Country, java.util.List<com.tecacet.finance.model.calendar.Holiday>> countryMap5 = enricoHolidayService0.whereIsPublicHoliday(localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(holidaySupportList1);
        org.junit.Assert.assertNotNull(holidaySupportList2);
        org.junit.Assert.assertNotNull(holidaySupportList3);
    }
}

