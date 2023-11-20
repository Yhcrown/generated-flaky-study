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
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass1 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass2 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469554380L + "'", long1 == 1700469554380L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass2 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1700469554L + "'", long1 == 1700469554L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) ' ', (long) ' ');
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, (long) 1, (long) (byte) 100, (long) '4');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 1, 10L, 0L);
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = charSequenceInMemoryCounter4.increment(charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 1700469554219L, (long) 0, (long) (short) 0);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounterInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 55L + "'", long13 == 55L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469554489L, 1L, 53L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test018() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test019() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) (short) 100, 36L, 1700469555125L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 10L, 1700469554L, 55L);
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555180L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555180L + "'", long7 == 1700469555180L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) (short) 0, 2L, 54L);
    }

    @Test
    public void test027() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555333L + "'", long18 == 1700469555333L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, 1700469555235L, 1700469554380L, 0L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, (long) (short) 1, 1700469554489L, 1700469554L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 55L, 1700469555L, 1L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test033() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469555L + "'", long4 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 1700469555125L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1700469556L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1700469554380L, (long) (byte) 10, 1700469554219L);
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, (long) (byte) 1, (long) (byte) 0, (-1L));
        java.lang.Class<?> wildcardClass5 = strInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, 0L, (long) (byte) 10);
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = charSequenceInMemoryCounter4.increment(charSequence5, 1700469555235L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) ' ', (long) 1, 54L);
    }

    @Test
    public void test042() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469555724L + "'", long5 == 1700469555724L);
    }

    @Test
    public void test043() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555724L + "'", long6 == 1700469555724L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, (long) (short) -1, (long) '#', (long) (short) 10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (-1), 0L, 55L);
    }

    @Test
    public void test047() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, (long) '#', 10L, 0L);
        java.lang.Class<?> wildcardClass5 = genericDeclarationInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469555L + "'", long6 == 1700469555L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (-1));
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, (long) (short) 1, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test054() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36L + "'", long10 == 36L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 36L, 63L, 0L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 1, 1700469555L, 1700469554380L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555180L, (long) (short) 10, 36L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469554219L, 55L, (long) (byte) 10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, (long) (byte) 1, 1700469555L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, 0L, (long) (byte) 10);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (-1L), (long) 0, (long) (byte) 100);
    }

    @Test
    public void test064() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 98L + "'", long15 == 98L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test065() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 56L + "'", long16 == 56L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 53L, 1700469555125L, 1700469555614L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 10, 55L, 1700469555180L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) ' ');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556L, 1700469556201L, 1700469555669L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 1700469555885L, 1700469555841L, 1L);
    }

    @Test
    public void test070() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3400939111439L + "'", long15 == 3400939111439L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 3400939111439L, 1700469555778L, 53L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (-1), (long) '4', 1700469556256L);
    }

    @Test
    public void test074() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469556527L + "'", long3 == 1700469556527L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 10, 1700469556527L, (long) '4');
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, (long) 'a', 36L, 1700469555125L);
    }

    @Test
    public void test078() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement> annotatedElementInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement>(inMemoryCounterPersistClient0, (long) (short) 100, 3L, (long) '4');
    }

    @Test
    public void test080() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556578L + "'", long5 == 1700469556578L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469556L + "'", long5 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 55L + "'", long19 == 55L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555724L, 1700469608L, (long) 100);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1700469556201L + "'", long14 == 1700469556201L);
    }

    @Test
    public void test085() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556737L + "'", long6 == 1700469556737L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555724L, 1700469608L, (long) 100);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555235L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555235L + "'", long7 == 1700469555235L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test087() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, 1700469556135L, 54L, 35L);
        java.lang.Class<?> wildcardClass5 = genericDeclarationInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, (long) (byte) 1, 1700469555L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 36L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 2L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test090() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, (long) (byte) -1, 1700469555614L, 1700469554912L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, 1700469555830L, 2L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, 0L, 1700469555333L, 63L);
    }

    @Test
    public void test094() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test095() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469556L + "'", long6 == 1700469556L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557L + "'", long6 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, (long) '#', 1700469555669L, 53L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (-1));
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 10);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556527L, 1700469556136L, (long) (byte) 10);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555180L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = charSequenceInMemoryCounter4.increment(charSequence10, 1700469556527L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555180L + "'", long7 == 1700469555180L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test101() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1700469555941L + "'", long18 == 1700469555941L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 0, (long) 0, 63L);
    }

    @Test
    public void test103() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469608L + "'", long12 == 1700469608L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 1700469556472L, 1700469556201L, (long) (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) (short) -1, 54L, 1700469555L);
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469556256L);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469556291L + "'", long10 == 1700469556291L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test108() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469557220L + "'", long6 == 1700469557220L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, 0L, (long) (byte) 10);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 10, 1700469556527L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (-1));
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test112() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1700469557165L + "'", long20 == 1700469557165L);
    }

    @Test
    public void test113() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test114() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557275L + "'", long7 == 1700469557275L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1700469556527L, (long) '#', 1700469556151L);
    }

    @Test
    public void test116() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555450L + "'", long9 == 1700469555450L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111064L + "'", long12 == 3400939111064L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555614L, 1700469555342L, 1700469555724L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 10, 32L, (long) (byte) 100);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test119() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469556135L + "'", long15 == 1700469556135L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1700469556136L + "'", long17 == 1700469556136L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 54L + "'", long20 == 54L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1700469556137L + "'", long22 == 1700469556137L);
    }

    @Test
    public void test120() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556256L, (long) (byte) 0, 1700469555L);
    }

    @Test
    public void test122() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5101408667642L + "'", long22 == 5101408667642L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test124() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557547L + "'", long7 == 1700469557547L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) -1);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 2L);
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = charSequenceInMemoryCounter4.increment(charSequence11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test126() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test127() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557597L + "'", long7 == 1700469557597L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, 5101408667642L, 1700469555669L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1700469555724L, 1700469555505L, 1700469555778L);
    }

    @Test
    public void test130() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469556L + "'", long12 == 1700469556L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469556135L + "'", long15 == 1700469556135L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 10, 32L, (long) (byte) 100);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 63L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 63L + "'", long7 == 63L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 0, (long) (byte) 1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) -1);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test134() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557L + "'", long8 == 1700469557L);
    }

    @Test
    public void test135() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557L + "'", long7 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 1);
        java.lang.Class<?> wildcardClass15 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555342L, 1700469557165L, 1700469557385L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, 1700469555885L, 1700469557385L, 32L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, (long) (short) 0, 1700469556527L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469556419L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469556419L + "'", long7 == 1700469556419L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, (long) (byte) 1, 1700469555L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 36L);
        java.lang.CharSequence charSequence8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = charSequenceInMemoryCounter4.increment(charSequence8, 1700469556419L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
    }

    @Test
    public void test142() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469555449L + "'", long9 == 1700469555449L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, (-1L), 1700469556632L, 1700469556895L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test145() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469557868L + "'", long8 == 1700469557868L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469557330L, 33L, 1700469557330L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 1, 10L, 0L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3400939111063L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3400939111063L + "'", long7 == 3400939111063L);
    }

    @Test
    public void test148() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 10, 1700469556527L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 11L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555614L + "'", long7 == 1700469555614L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 1, 10L, 0L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555939L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555939L + "'", long7 == 1700469555939L);
    }

    @Test
    public void test152() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 54L + "'", long11 == 54L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 33L + "'", long16 == 33L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1700469554307L + "'", long19 == 1700469554307L);
    }

    @Test
    public void test153() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3400939111064L + "'", long17 == 3400939111064L);
    }

    @Test
    public void test154() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469557L + "'", long5 == 1700469557L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556099L);
        java.lang.Class<?> wildcardClass16 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1700469556135L + "'", long15 == 1700469556135L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469557978L, 1700469557165L, 1700469556256L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555614L, (long) ' ', 1700469555724L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 1);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555841L);
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36L + "'", long10 == 36L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1700469555877L + "'", long13 == 1700469555877L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1700469555974L + "'", long16 == 1700469555974L);
    }

    @Test
    public void test159() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 53L + "'", long18 == 53L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test160() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556841L, 1700469556895L, 36L);
    }

    @Test
    public void test162() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1700469556137L + "'", long16 == 1700469556137L);
    }

    @Test
    public void test163() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558141L + "'", long7 == 1700469558141L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555342L, 1700469555877L, 1700469555505L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1700469556737L, 3400939111063L, 1700469557439L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1700469557813L, 2L, 1700469556790L);
    }

    @Test
    public void test167() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1700469556137L + "'", long16 == 1700469556137L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3400939112978L + "'", long19 == 3400939112978L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556527L, 1700469556136L, (long) (byte) 10);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555180L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555180L + "'", long7 == 1700469555180L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test169() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558196L + "'", long9 == 1700469558196L);
    }

    @Test
    public void test170() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }

    @Test
    public void test171() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558196L + "'", long7 == 1700469558196L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 3400939111063L, 32L, 1700469556737L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, 1700469557651L, 3400939111063L, 1700469556527L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, 1L, 1700469555778L, (long) 100);
        java.lang.Class<?> wildcardClass5 = genericDeclarationInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test177() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1700469557439L + "'", long23 == 1700469557439L);
    }

    @Test
    public void test179() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558248L + "'", long7 == 1700469558248L);
    }

    @Test
    public void test180() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558248L + "'", long8 == 1700469558248L);
    }

    @Test
    public void test181() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 2L, 1700469556135L, 1700469556L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test183() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3400939111064L + "'", long14 == 3400939111064L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469554489L, 1700469555333L, 55L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test185() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1700469558L + "'", long5 == 1700469558L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 1);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555841L);
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555180L);
        java.lang.Class<?> wildcardClass17 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36L + "'", long10 == 36L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1700469555877L + "'", long13 == 1700469555877L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1700469555180L + "'", long16 == 1700469555180L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555841L, (long) (short) -1, 1700469555342L);
    }

    @Test
    public void test189() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558353L + "'", long6 == 1700469558353L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555778L, 1700469555L, (long) 10);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, 1700469555830L, (long) 10);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469557439L, 1700469556135L, 1700469556291L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555939L, 1700469556841L, 100L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469557758L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557758L + "'", long7 == 1700469557758L);
    }

    @Test
    public void test195() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558407L + "'", long4 == 1700469558407L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469558029L, 1700469557275L, 1700469557978L);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, (long) (byte) 1, 1700469555L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 36L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) ' ');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 68L + "'", long10 == 68L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test198() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test199() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555449L + "'", long12 == 1700469555449L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555504L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555505L + "'", long12 == 1700469555505L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = charSequenceInMemoryCounter4.increment(charSequence15, 1700469557978L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 54L + "'", long10 == 54L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
    }

    @Test
    public void test202() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 63L + "'", long15 == 63L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469554912L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469554912L + "'", long7 == 1700469554912L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469554913L + "'", long9 == 1700469554913L);
    }

    @Test
    public void test205() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558514L + "'", long6 == 1700469558514L);
    }

    @Test
    public void test206() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 55L + "'", long14 == 55L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 37L + "'", long16 == 37L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 56L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 56L + "'", long7 == 56L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test208() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2L + "'", long21 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1700469557548L + "'", long24 == 1700469557548L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, 1700469554L, 1700469555669L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 54L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 54L + "'", long7 == 54L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 100, (long) 'a', 0L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, (long) (short) 100, 1700469557548L, 3400939111439L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, (long) (short) 1, 53L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469554L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469554L + "'", long7 == 1700469554L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 98L, 1700469557165L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556737L, (long) 10, (long) (short) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, (long) (short) 1, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469556L + "'", long9 == 1700469556L);
    }

    @Test
    public void test216() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '4');
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 63L + "'", long12 == 63L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2L + "'", long17 == 2L);
    }

    @Test
    public void test218() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558622L + "'", long6 == 1700469558622L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 100, (long) (byte) 100, (long) 10);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556291L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469556291L + "'", long7 == 1700469556291L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test221() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3400939111063L + "'", long12 == 3400939111063L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1700469556842L + "'", long20 == 1700469556842L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 10, 32L, (long) (byte) 100);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 63L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469556578L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 63L + "'", long7 == 63L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469556578L + "'", long10 == 1700469556578L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469556579L + "'", long12 == 1700469556579L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558677L + "'", long7 == 1700469558677L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, (long) '4', 100L, (long) '#');
        java.lang.Class<?> wildcardClass5 = inMemoryClockInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test226() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test228() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1700469558L + "'", long4 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 1, 10L, 0L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, (long) (byte) 1, 1700469555L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 36L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) -1, 1700469556946L, 0L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469555941L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555941L + "'", long7 == 1700469555941L);
    }

    @Test
    public void test232() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 54L + "'", long20 == 54L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1700469556139L + "'", long23 == 1700469556139L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 32L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 33L + "'", long12 == 33L);
    }

    @Test
    public void test234() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, 1700469554307L, 1700469557758L, 1700469558086L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555235L, 1700469556135L, 1700469557493L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469556632L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469556632L + "'", long7 == 1700469556632L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 3400939111063L, 3L, 3400939111064L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 1700469554L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555504L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1700469555505L + "'", long12 == 1700469555505L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1700469555506L + "'", long14 == 1700469555506L);
    }

    @Test
    public void test240() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558784L + "'", long10 == 1700469558784L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, 1700469554L, 1700469555669L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469555614L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469555614L + "'", long7 == 1700469555614L);
    }

    @Test
    public void test242() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1700469558L + "'", long10 == 1700469558L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469555724L, 1700469608L, (long) 100);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 36L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 98L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 36L + "'", long7 == 36L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 98L + "'", long10 == 98L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 37L + "'", long12 == 37L);
    }

    @Test
    public void test244() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1700469558836L + "'", long8 == 1700469558836L);
    }

    @Test
    public void test245() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 55L, 1L, 63L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, (long) (short) 0, 1700469556527L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test248() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1700469558L + "'", long9 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, (long) (short) 1, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 0);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1700469557978L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1700469557980L + "'", long14 == 1700469557980L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 68L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 103L + "'", long10 == 103L);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '4', 1700469556136L, 1700469558L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469557547L, 1700469556139L, 1700469557055L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469557868L, 1700469555990L, (long) 100);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556201L, 100L, 2L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469557868L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469557868L + "'", long7 == 1700469557868L);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = charSequenceInMemoryCounter4.increment(charSequence12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test257() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1700469558L + "'", long6 == 1700469558L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1700469554912L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1700469554913L + "'", long14 == 1700469554913L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 2L, 53L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1700469555504L, 1700469557597L, (long) 100);
    }

    @Test
    public void test262() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1700469558L + "'", long3 == 1700469558L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 36L + "'", long16 == 36L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469556201L, 100L, 2L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1700469558514L, 53L, 53L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 68L, (long) (short) 10, 1700469557L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 55L, (long) 0, 1700469556291L);
        java.lang.Class<?> wildcardClass5 = wildcardClassInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1700469555941L, 1700469555990L, 1700469558029L);
    }

    @Test
    public void test269() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1700469558L + "'", long7 == 1700469558L);
    }

    @Test
    public void test270() throws Throwable {
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
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 1700469554489L, 54L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}
