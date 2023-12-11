package flaky; 

import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTest{
    public static boolean debug = false;

	@Test
    public void test004_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass2 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469554380L + "'", long1 == 1700469554380L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
	@Test
    public void test006_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass2 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469554L + "'", long1 == 1700469554L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
	@Test
    public void test014_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 55L + "'", long13 == 55L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
	@Test
    public void test014_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 55L + "'", long13 == 55L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
	@Test
    public void test014_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 55L + "'", long13 == 55L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
	@Test
    public void test015_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
	@Test
    public void test018_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
	@Test
    public void test019_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
	@Test
    public void test019_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
	@Test
    public void test021_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
	@Test
    public void test022_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test024_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test027_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 'a');
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555235L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555333L + "'", long18 == 1700469555333L);
    }
	@Test
    public void test027_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 'a');
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555235L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555333L + "'", long18 == 1700469555333L);
    }
	@Test
    public void test028_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
	@Test
    public void test033_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555449L + "'", long1 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test033_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555449L + "'", long1 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test033_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555449L + "'", long1 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test033_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555449L + "'", long1 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test039_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }
	@Test
    public void test042_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
    }
	@Test
    public void test042_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
    }
	@Test
    public void test042_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
    }
	@Test
    public void test042_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
    }
	@Test
    public void test042_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
    }
	@Test
    public void test043_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555724L + "'", long4 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test043_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555724L + "'", long4 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test043_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555724L + "'", long4 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test043_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555724L + "'", long4 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test043_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555724L + "'", long4 == 1700469555724L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test043_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555724L + "'", long1 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555724L + "'", long4 == 1700469555724L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test044_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
    }
	@Test
    public void test044_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
    }
	@Test
    public void test044_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
    }
	@Test
    public void test047_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test047_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test049_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555990L + "'", long1 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555990L + "'", long4 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555990L + "'", long5 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test049_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555990L + "'", long1 == 1700469555990L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555990L + "'", long4 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555990L + "'", long5 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test049_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555990L + "'", long1 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555990L + "'", long4 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555990L + "'", long5 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test049_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555990L + "'", long1 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555990L + "'", long4 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555990L + "'", long5 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test049_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555990L + "'", long1 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555990L + "'", long4 == 1700469555990L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555990L + "'", long5 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test049_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469555990L + "'", long1 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469555L + "'", long2 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469555L + "'", long3 == 1700469555L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555990L + "'", long4 == 1700469555990L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555990L + "'", long5 == 1700469555990L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test054_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 'a');
        java.lang.Class<?> wildcardClass16 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
	@Test
    public void test055_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36L + "'", long10 == 36L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
	@Test
    public void test060_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test064_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 'a');
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }
	@Test
    public void test065_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 56L + "'", long16 == 56L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
	@Test
    public void test065_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 56L + "'", long16 == 56L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
	@Test
    public void test070_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 0);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555990L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555449L + "'", long12 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3400939111439L + "'", long15 == 3400939111439L);
    }
	@Test
    public void test070_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 0);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555990L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555449L + "'", long12 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3400939111439L + "'", long15 == 3400939111439L);
    }
	@Test
    public void test070_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 0);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555990L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555449L + "'", long12 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3400939111439L + "'", long15 == 3400939111439L);
    }
	@Test
    public void test074_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556527L + "'", long3 == 1700469556527L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
	@Test
    public void test074_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556527L + "'", long3 == 1700469556527L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
	@Test
    public void test074_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556527L + "'", long3 == 1700469556527L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
	@Test
    public void test075_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }
	@Test
    public void test075_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }
	@Test
    public void test078_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
	@Test
    public void test080_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556578L + "'", long1 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556578L + "'", long2 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556578L + "'", long5 == 1700469556578L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test080_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556578L + "'", long1 == 1700469556578L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556578L + "'", long2 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556578L + "'", long5 == 1700469556578L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test080_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556578L + "'", long1 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556578L + "'", long2 == 1700469556578L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556578L + "'", long5 == 1700469556578L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test080_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556578L + "'", long1 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556578L + "'", long2 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556578L + "'", long5 == 1700469556578L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test080_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556578L + "'", long1 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556578L + "'", long2 == 1700469556578L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556578L + "'", long5 == 1700469556578L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test081_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556632L + "'", long4 == 1700469556632L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test081_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556632L + "'", long4 == 1700469556632L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test081_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556632L + "'", long4 == 1700469556632L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test081_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556632L + "'", long4 == 1700469556632L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test081_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556L + "'", long1 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556632L + "'", long4 == 1700469556632L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test082_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 55L + "'", long19 == 55L);
    }
	@Test
    public void test082_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 55L + "'", long19 == 55L);
    }
	@Test
    public void test084_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556201L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1700469556201L + "'", long14 == 1700469556201L);
    }
	@Test
    public void test084_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556201L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1700469556201L + "'", long14 == 1700469556201L);
    }
	@Test
    public void test085_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556737L + "'", long1 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556737L + "'", long2 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test085_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556737L + "'", long1 == 1700469556737L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556737L + "'", long2 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test085_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556737L + "'", long1 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556737L + "'", long2 == 1700469556737L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test085_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556737L + "'", long1 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556737L + "'", long2 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test085_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556737L + "'", long1 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556737L + "'", long2 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test085_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556737L + "'", long1 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556737L + "'", long2 == 1700469556737L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test087_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
    }
	@Test
    public void test087_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
    }
	@Test
    public void test090_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556895L + "'", long1 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556895L + "'", long3 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556895L + "'", long4 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }
	@Test
    public void test090_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556895L + "'", long1 == 1700469556895L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556895L + "'", long3 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556895L + "'", long4 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }
	@Test
    public void test090_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556895L + "'", long1 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556895L + "'", long3 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556895L + "'", long4 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }
	@Test
    public void test090_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556895L + "'", long1 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556895L + "'", long3 == 1700469556895L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556895L + "'", long4 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }
	@Test
    public void test090_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556895L + "'", long1 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556895L + "'", long3 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556895L + "'", long4 == 1700469556895L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }
	@Test
    public void test090_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556895L + "'", long1 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556L + "'", long2 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556895L + "'", long3 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556895L + "'", long4 == 1700469556895L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }
	@Test
    public void test094_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 'a');
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 98L + "'", long11 == 98L);
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }
	@Test
    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556946L + "'", long1 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556946L + "'", long2 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556946L + "'", long5 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test095_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556946L + "'", long1 == 1700469556946L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556946L + "'", long2 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556946L + "'", long5 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test095_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556946L + "'", long1 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556946L + "'", long2 == 1700469556946L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556946L + "'", long5 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test095_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556946L + "'", long1 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556946L + "'", long2 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556946L + "'", long5 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test095_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556946L + "'", long1 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556946L + "'", long2 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556946L + "'", long5 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test095_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469556946L + "'", long1 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469556946L + "'", long2 == 1700469556946L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556L + "'", long3 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469556L + "'", long4 == 1700469556L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556946L + "'", long5 == 1700469556946L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test096_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557000L + "'", long1 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557000L + "'", long3 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557000L + "'", long4 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557000L + "'", long5 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test096_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557000L + "'", long1 == 1700469557000L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557000L + "'", long3 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557000L + "'", long4 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557000L + "'", long5 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test096_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557000L + "'", long1 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557000L + "'", long3 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557000L + "'", long4 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557000L + "'", long5 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test096_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557000L + "'", long1 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557000L + "'", long3 == 1700469557000L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557000L + "'", long4 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557000L + "'", long5 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test096_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557000L + "'", long1 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557000L + "'", long3 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557000L + "'", long4 == 1700469557000L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557000L + "'", long5 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test096_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557000L + "'", long1 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557000L + "'", long3 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557000L + "'", long4 == 1700469557000L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557000L + "'", long5 == 1700469557000L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test098_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (-1));
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 10);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }
	@Test
    public void test101_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555778L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 63L + "'", long12 == 63L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469555841L + "'", long15 == 1700469555841L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555941L + "'", long18 == 1700469555941L);
    }
	@Test
    public void test101_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555778L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 63L + "'", long12 == 63L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469555841L + "'", long15 == 1700469555841L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555941L + "'", long18 == 1700469555941L);
    }
	@Test
    public void test101_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555778L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 63L + "'", long12 == 63L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469555841L + "'", long15 == 1700469555841L);
         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555941L + "'", long18 == 1700469555941L);
    }
	@Test
    public void test103_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469608L + "'", long12 == 1700469608L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test103_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469608L + "'", long12 == 1700469608L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test106_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test106_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test106_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test106_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test106_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test106_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test106_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557220L + "'", long5 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test107_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469556256L);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469556291L + "'", long10 == 1700469556291L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
	@Test
    public void test108_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test108_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test108_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test108_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test108_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test108_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557220L + "'", long1 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557220L + "'", long3 == 1700469557220L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
	@Test
    public void test112_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469557165L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1700469557165L + "'", long20 == 1700469557165L);
    }
	@Test
    public void test113_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass20 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
	@Test
    public void test114_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test114_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test114_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test114_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test114_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test114_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test114_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557275L + "'", long1 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557275L + "'", long3 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557275L + "'", long4 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557275L + "'", long5 == 1700469557275L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }
	@Test
    public void test116_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        java.lang.CharSequence charSequence16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = charSequenceInMemoryCounter4.increment(charSequence16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555450L + "'", long9 == 1700469555450L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111064L + "'", long12 == 3400939111064L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }
	@Test
    public void test119_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556099L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469556135L + "'", long15 == 1700469556135L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1700469556136L + "'", long17 == 1700469556136L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 54L + "'", long20 == 54L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1700469556137L + "'", long22 == 1700469556137L);
    }
	@Test
    public void test120_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test120_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test120_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test120_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test120_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test120_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test120_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557439L + "'", long4 == 1700469557439L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }
	@Test
    public void test122_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556578L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3400939111064L + "'", long19 == 3400939111064L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5101408667642L + "'", long22 == 5101408667642L);
    }
	@Test
    public void test122_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556578L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3400939111064L + "'", long19 == 3400939111064L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5101408667642L + "'", long22 == 5101408667642L);
    }
	@Test
    public void test122_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556578L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3400939111064L + "'", long19 == 3400939111064L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5101408667642L + "'", long22 == 5101408667642L);
    }
	@Test
    public void test122_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556578L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3400939111064L + "'", long19 == 3400939111064L);
         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5101408667642L + "'", long22 == 5101408667642L);
    }
	@Test
    public void test124_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test124_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test124_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test124_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test124_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test124_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test124_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557547L + "'", long1 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557547L + "'", long3 == 1700469557547L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557547L + "'", long6 == 1700469557547L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test126_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }
	@Test
    public void test126_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }
	@Test
    public void test127_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test127_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test127_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test127_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test127_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test127_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test127_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557597L + "'", long1 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557597L + "'", long3 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557597L + "'", long5 == 1700469557597L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test130_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556135L);
        java.lang.Class<?> wildcardClass16 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469556L + "'", long12 == 1700469556L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469556135L + "'", long15 == 1700469556135L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
	@Test
    public void test132_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test134_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test134_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557758L + "'", long1 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }
	@Test
    public void test135_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test135_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test135_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test135_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test135_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test135_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test135_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557L + "'", long1 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557758L + "'", long4 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557758L + "'", long5 == 1700469557758L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557758L + "'", long6 == 1700469557758L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test142_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        java.lang.CharSequence charSequence10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = charSequenceInMemoryCounter4.increment(charSequence10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
    }
	@Test
    public void test145_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test145_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557868L + "'", long1 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557L + "'", long2 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557868L + "'", long3 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557L + "'", long4 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557868L + "'", long6 == 1700469557868L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }
	@Test
    public void test148_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) -1);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }
	@Test
    public void test152_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 32L);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469554274L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 33L + "'", long16 == 33L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1700469554307L + "'", long19 == 1700469554307L);
    }
	@Test
    public void test153_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3400939111064L + "'", long17 == 3400939111064L);
    }
	@Test
    public void test153_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3400939111064L + "'", long17 == 3400939111064L);
    }
	@Test
    public void test153_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3400939111064L + "'", long17 == 3400939111064L);
    }
	@Test
    public void test154_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557978L + "'", long1 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557978L + "'", long2 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557978L + "'", long4 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test154_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557978L + "'", long1 == 1700469557978L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557978L + "'", long2 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557978L + "'", long4 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test154_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557978L + "'", long1 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557978L + "'", long2 == 1700469557978L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557978L + "'", long4 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test154_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557978L + "'", long1 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557978L + "'", long2 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557978L + "'", long4 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test154_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469557978L + "'", long1 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469557978L + "'", long2 == 1700469557978L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469557L + "'", long3 == 1700469557L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469557978L + "'", long4 == 1700469557978L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
	@Test
    public void test159_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (-1L));
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 53L + "'", long18 == 53L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }
	@Test
    public void test160_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558086L + "'", long1 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558086L + "'", long3 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test160_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558086L + "'", long1 == 1700469558086L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558086L + "'", long3 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test160_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558086L + "'", long1 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558086L + "'", long3 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test160_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558086L + "'", long1 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558086L + "'", long3 == 1700469558086L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test160_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558086L + "'", long1 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558086L + "'", long3 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test160_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558086L + "'", long1 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558086L + "'", long3 == 1700469558086L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test162_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556137L);
        java.lang.CharSequence charSequence17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = charSequenceInMemoryCounter4.increment(charSequence17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1700469556137L + "'", long16 == 1700469556137L);
    }
	@Test
    public void test163_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test163_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test163_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test163_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test163_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test163_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test163_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558141L + "'", long4 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558141L + "'", long5 == 1700469558141L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558141L + "'", long6 == 1700469558141L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }
	@Test
    public void test167_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556137L);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556841L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1700469556137L + "'", long16 == 1700469556137L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3400939112978L + "'", long19 == 3400939112978L);
    }
	@Test
    public void test169_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test169_9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }
	@Test
    public void test170_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test170_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test170_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test170_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test170_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test170_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test170_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558196L + "'", long2 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558196L + "'", long6 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test171_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test171_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test171_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test171_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test171_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test171_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test171_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558196L + "'", long1 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558196L + "'", long4 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558196L + "'", long5 == 1700469558196L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }
	@Test
    public void test172_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }
	@Test
    public void test177_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test177_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test177_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test177_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test177_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test177_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test177_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558248L + "'", long5 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558248L + "'", long6 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
	@Test
    public void test178_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long23 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469557385L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1700469557439L + "'", long23 == 1700469557439L);
    }
	@Test
    public void test178_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long23 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469557385L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1700469557439L + "'", long23 == 1700469557439L);
    }
	@Test
    public void test179_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test179_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test179_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test179_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test179_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test179_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test179_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }
	@Test
    public void test180_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test180_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558248L + "'", long1 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558248L + "'", long2 == 1700469558248L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }
	@Test
    public void test181_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
    }
	@Test
    public void test181_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
    }
	@Test
    public void test181_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
    }
	@Test
    public void test181_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
    }
	@Test
    public void test183_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3400939111064L + "'", long14 == 3400939111064L);
    }
	@Test
    public void test183_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3400939111064L + "'", long14 == 3400939111064L);
    }
	@Test
    public void test183_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3400939111064L + "'", long14 == 3400939111064L);
    }
	@Test
    public void test185_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558302L + "'", long1 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558302L + "'", long4 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
    }
	@Test
    public void test185_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558302L + "'", long1 == 1700469558302L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558302L + "'", long4 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
    }
	@Test
    public void test185_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558302L + "'", long1 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558302L + "'", long4 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
    }
	@Test
    public void test185_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558302L + "'", long1 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558302L + "'", long4 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
    }
	@Test
    public void test185_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558302L + "'", long1 == 1700469558302L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558302L + "'", long4 == 1700469558302L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
    }
	@Test
    public void test189_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558353L + "'", long1 == 1700469558353L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }
	@Test
    public void test189_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558353L + "'", long1 == 1700469558353L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }
	@Test
    public void test189_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558353L + "'", long1 == 1700469558353L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }
	@Test
    public void test189_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558353L + "'", long1 == 1700469558353L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }
	@Test
    public void test189_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558353L + "'", long1 == 1700469558353L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }
	@Test
    public void test189_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558353L + "'", long1 == 1700469558353L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }
	@Test
    public void test192_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }
	@Test
    public void test195_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558407L + "'", long3 == 1700469558407L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558407L + "'", long4 == 1700469558407L);
    }
	@Test
    public void test195_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558407L + "'", long3 == 1700469558407L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558407L + "'", long4 == 1700469558407L);
    }
	@Test
    public void test195_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558407L + "'", long3 == 1700469558407L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558407L + "'", long4 == 1700469558407L);
    }
	@Test
    public void test195_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558407L + "'", long3 == 1700469558407L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558407L + "'", long4 == 1700469558407L);
    }
	@Test
    public void test198_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }
	@Test
    public void test199_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 0);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555449L + "'", long12 == 1700469555449L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test199_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 0);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555449L + "'", long12 == 1700469555449L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
	@Test
    public void test202_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        java.lang.CharSequence charSequence16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = charSequenceInMemoryCounter4.increment(charSequence16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 63L + "'", long12 == 63L);
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 63L + "'", long15 == 63L);
    }
	@Test
    public void test203_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }
	@Test
    public void test205_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558514L + "'", long2 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558514L + "'", long3 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }
	@Test
    public void test205_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558514L + "'", long2 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558514L + "'", long3 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }
	@Test
    public void test205_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558514L + "'", long2 == 1700469558514L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558514L + "'", long3 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }
	@Test
    public void test205_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558514L + "'", long2 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558514L + "'", long3 == 1700469558514L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }
	@Test
    public void test205_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558514L + "'", long2 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558514L + "'", long3 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }
	@Test
    public void test205_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558514L + "'", long2 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558514L + "'", long3 == 1700469558514L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }
	@Test
    public void test206_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass17 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 37L + "'", long16 == 37L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
	@Test
    public void test208_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long24 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469557547L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1700469557548L + "'", long24 == 1700469557548L);
    }
	@Test
    public void test208_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long24 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469557547L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1700469557548L + "'", long24 == 1700469557548L);
    }
	@Test
    public void test216_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test216_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test216_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test216_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test216_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test216_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test216_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558622L + "'", long2 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test218_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558622L + "'", long3 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558622L + "'", long4 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558622L + "'", long5 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }
	@Test
    public void test218_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558622L + "'", long3 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558622L + "'", long4 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558622L + "'", long5 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }
	@Test
    public void test218_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558622L + "'", long3 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558622L + "'", long4 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558622L + "'", long5 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }
	@Test
    public void test218_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558622L + "'", long3 == 1700469558622L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558622L + "'", long4 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558622L + "'", long5 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }
	@Test
    public void test218_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558622L + "'", long3 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558622L + "'", long4 == 1700469558622L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558622L + "'", long5 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }
	@Test
    public void test218_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558622L + "'", long1 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558622L + "'", long3 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558622L + "'", long4 == 1700469558622L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558622L + "'", long5 == 1700469558622L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }
	@Test
    public void test221_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469556841L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1700469556842L + "'", long20 == 1700469556842L);
    }
	@Test
    public void test221_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555449L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469556841L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1700469556842L + "'", long20 == 1700469556842L);
    }
	@Test
    public void test224_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test224_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test224_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test224_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test224_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test224_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test224_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558677L + "'", long4 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558677L + "'", long6 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }
	@Test
    public void test226_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test226_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test226_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test226_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test226_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test226_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558677L + "'", long2 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558677L + "'", long3 == 1700469558677L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558677L + "'", long5 == 1700469558677L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test228_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558729L + "'", long1 == 1700469558729L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558729L + "'", long3 == 1700469558729L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test228_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558729L + "'", long1 == 1700469558729L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558729L + "'", long3 == 1700469558729L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test228_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558729L + "'", long1 == 1700469558729L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558729L + "'", long3 == 1700469558729L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test228_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558729L + "'", long1 == 1700469558729L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558729L + "'", long3 == 1700469558729L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
	@Test
    public void test232_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556099L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long23 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469556135L + "'", long15 == 1700469556135L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1700469556136L + "'", long17 == 1700469556136L);
         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 54L + "'", long20 == 54L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1700469556139L + "'", long23 == 1700469556139L);
    }
	@Test
    public void test234_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558784L + "'", long2 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558784L + "'", long3 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test234_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558784L + "'", long2 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558784L + "'", long3 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test234_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558784L + "'", long2 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558784L + "'", long3 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test234_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558784L + "'", long2 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558784L + "'", long3 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test234_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558784L + "'", long2 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558784L + "'", long3 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test234_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558784L + "'", long2 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558784L + "'", long3 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test240_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test240_10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558784L + "'", long1 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558784L + "'", long4 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558784L + "'", long5 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558784L + "'", long6 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558784L + "'", long8 == 1700469558784L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }
	@Test
    public void test242_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test242_10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558836L + "'", long4 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }
	@Test
    public void test244_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test244_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558836L + "'", long2 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }
	@Test
    public void test245_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test245_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test245_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test245_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test245_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test245_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test245_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558836L + "'", long1 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558836L + "'", long3 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558836L + "'", long5 == 1700469558836L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558836L + "'", long6 == 1700469558836L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test248_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test248_9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558891L + "'", long1 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558891L + "'", long2 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558891L + "'", long5 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558891L + "'", long6 == 1700469558891L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558L + "'", long8 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
	@Test
    public void test257_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558945L + "'", long3 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558945L + "'", long4 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test257_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558945L + "'", long3 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558945L + "'", long4 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test257_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558945L + "'", long3 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558945L + "'", long4 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test257_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558945L + "'", long3 == 1700469558945L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558945L + "'", long4 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test257_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558945L + "'", long3 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558945L + "'", long4 == 1700469558945L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test257_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558L + "'", long1 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558945L + "'", long3 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558945L + "'", long4 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }
	@Test
    public void test259_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }
	@Test
    public void test262_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558945L + "'", long1 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
	@Test
    public void test262_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558945L + "'", long1 == 1700469558945L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
	@Test
    public void test262_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558945L + "'", long1 == 1700469558945L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558945L + "'", long2 == 1700469558945L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
	@Test
    public void test269_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test269_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test269_3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test269_4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test269_5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test269_6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test269_7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469558995L + "'", long1 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1700469558L + "'", long2 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558995L + "'", long3 == 1700469558995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558995L + "'", long6 == 1700469558995L);
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }
	@Test
    public void test270_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
    }
	@Test
    public void test270_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
    }
}