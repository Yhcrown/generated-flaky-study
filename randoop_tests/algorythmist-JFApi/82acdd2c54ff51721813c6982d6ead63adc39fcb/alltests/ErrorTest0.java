import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        com.tecacet.finance.model.calendar.TradingDay tradingDay1 = tradingDayBuilder0.build();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on tradingDay1", tradingDay1.compareTo(tradingDay1) == 0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.tecacet.finance.service.calendar.enrico.EnricoHoliday enricoHoliday0 = new com.tecacet.finance.service.calendar.enrico.EnricoHoliday();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.time.LocalDate localDate1 = enricoHoliday0.getDate();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        java.time.LocalDate localDate1 = quote0.getDate();
        double double2 = quote0.getAdjustedClose();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = quote0.toString();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.tecacet.finance.service.calendar.enrico.EnricoHoliday enricoHoliday0 = new com.tecacet.finance.service.calendar.enrico.EnricoHoliday();
        java.lang.String str1 = enricoHoliday0.getHolidayType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.time.LocalDate localDate2 = enricoHoliday0.getDate();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder0 = com.tecacet.finance.model.calendar.TradingDay.builder();
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder2 = tradingDayBuilder0.description("Holiday.HolidayBuilder(date=null, locale=null, type=null, description=null)");
        com.tecacet.finance.model.calendar.TradingDay.TradingDayBuilder tradingDayBuilder4 = tradingDayBuilder2.description("TradingCalendar(month=365, year=10)");
        com.tecacet.finance.model.calendar.TradingDay tradingDay5 = tradingDayBuilder4.build();
        org.junit.Assert.assertTrue("Contract failed: compareTo-reflexive on tradingDay5", tradingDay5.compareTo(tradingDay5) == 0);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        long long1 = quote0.getVolume();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = quote0.toString();
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.tecacet.finance.service.asset.BarchartAssetService barchartAssetService1 = new com.tecacet.finance.service.asset.BarchartAssetService(false);
        java.util.Set<com.tecacet.finance.model.Asset> assetSet2 = barchartAssetService1.getAssets();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet3 = barchartAssetService1.getAssets();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet4 = barchartAssetService1.getAssets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on assetSet2 and assetSet3", assetSet2.equals(assetSet3) ? assetSet2.hashCode() == assetSet3.hashCode() : true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.tecacet.finance.service.asset.BarchartAssetService barchartAssetService1 = new com.tecacet.finance.service.asset.BarchartAssetService(false);
        java.util.Set<com.tecacet.finance.model.Asset> assetSet2 = barchartAssetService1.getAssets();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet3 = barchartAssetService1.getAssets();
        java.util.Set<com.tecacet.finance.model.Asset> assetSet4 = barchartAssetService1.getAssets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on assetSet2 and assetSet3", assetSet2.equals(assetSet3) ? assetSet2.hashCode() == assetSet3.hashCode() : true);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        com.tecacet.finance.model.Quote quote0 = new com.tecacet.finance.model.Quote();
        double double1 = quote0.getHigh();
        double double2 = quote0.getHigh();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = quote0.toString();
    }
}

