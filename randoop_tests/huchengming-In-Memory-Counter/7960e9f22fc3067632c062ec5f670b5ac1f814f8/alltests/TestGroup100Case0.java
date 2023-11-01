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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794993961L + "'", long1 == 1698794993961L);
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794994L + "'", long1 == 1698794994L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, 1L, (long) (byte) 0, 35L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698794993851L, 1698794994L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, 2L, 0L);
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
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, (-1L), (long) (byte) 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 1698794994L, (long) (short) -1, (long) 100);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounterInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, 1L, (long) (short) 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 12L + "'", long14 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) 100, (long) (short) -1, 2L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 12L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 23L + "'", long12 == 23L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) (byte) 1, (long) (short) -1, (long) 'a');
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 10L, 1698794994752L, (long) (byte) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, 1698794994867L, 100L, 1698794993961L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698794993961L, (long) '#', (long) (short) 1);
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, (long) (short) -1, 22L, 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, 22L, (long) 0, 12L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 2L, 35L, 12L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995147L + "'", long1 == 1698794995147L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993851L, 100L, 1698794994134L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) ' ', 0L, 12L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
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
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 11L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass3 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995L + "'", long1 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        java.lang.CharSequence charSequence8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = charSequenceInMemoryCounter4.increment(charSequence8, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994867L, 1698794993962L, 22L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995433L + "'", long1 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995433L + "'", long1 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995433L + "'", long4 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 101L + "'", long14 == 101L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, 1698794995433L, 1698794994867L, (long) (short) -1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994811L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994811L + "'", long7 == 1698794994811L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 11L, 1698794995147L, (long) ' ');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 101L);
        java.lang.Class<?> wildcardClass19 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, (long) 100, 35L, 0L);
        java.lang.Class<?> wildcardClass5 = genericDeclarationInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995710L + "'", long1 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995710L + "'", long4 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995710L + "'", long5 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 1);
        java.lang.Class<?> wildcardClass19 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993962L + "'", long18 == 1698794993962L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 11L);
        java.lang.Class<?> wildcardClass16 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22L + "'", long15 == 22L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 12L, (long) (short) 100, 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 1);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993851L, 100L, 1698794994134L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993962L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794993963L + "'", long9 == 1698794993963L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698794995655L, 1698794995L, 1698794994811L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass17 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 12L + "'", long16 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 10L, (long) '4', (long) 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995147L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995147L + "'", long7 == 1698794995147L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, (long) (short) -1, 23L, (long) '#');
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, 1698794994752L, 1698794994752L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589989504L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3397589989506L + "'", long14 == 3397589989506L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 10L, 1698794995999L, (long) ' ');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 2L, 12L, 3397589989504L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, (long) (short) 0, 1698794995325L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995543L);
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589989504L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3397589989504L + "'", long18 == 3397589989504L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6795179979008L + "'", long21 == 6795179979008L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 1698794996213L, 1698794995543L, 1698794994469L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass15 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (-1), (long) '4', 3397589989504L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996L + "'", long1 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996269L + "'", long3 == 1698794996269L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993851L);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698794993851L + "'", long11 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698794993852L + "'", long13 == 1698794993852L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 10, 1698794994753L, (long) '4');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, (long) 'a', 1698794994811L, 1698794994867L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993851L);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698794993851L + "'", long11 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698794993852L + "'", long13 == 1698794993852L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993853L + "'", long15 == 1698794993853L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993961L + "'", long15 == 1698794993961L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1698794993962L + "'", long17 == 1698794993962L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996376L + "'", long1 == 1698794996376L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996376L + "'", long2 == 1698794996376L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996376L + "'", long5 == 1698794996376L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996L + "'", long1 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996427L + "'", long4 == 1698794996427L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, (long) (short) 0, 1698794995325L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996543L + "'", long1 == 1698794996543L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996543L + "'", long2 == 1698794996543L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence12, 1698794994134L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, 100L, 1698794993962L, 1698794994163L);
        java.lang.Class<?> wildcardClass5 = genericDeclarationInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994134L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794994134L + "'", long10 == 1698794994134L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794994135L + "'", long12 == 1698794994135L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996695L + "'", long1 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996695L + "'", long3 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996695L + "'", long4 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, (long) (short) 0, 1698794995037L, 1698794995381L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993851L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993851L + "'", long12 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993851L + "'", long15 == 1698794993851L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, 1698794993853L, 3397589989506L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, 23L, 1698794996695L, (long) (byte) 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, 1698794994752L, 1698794994752L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996806L + "'", long1 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996806L + "'", long2 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 22L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 22L + "'", long10 == 22L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996806L + "'", long1 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996806L + "'", long3 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996806L + "'", long4 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, 1698794995088L, 1698794995488L, 100L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994811L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794994811L + "'", long12 == 1698794994811L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698794994812L + "'", long14 == 1698794994812L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698794995598L, 35L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994867L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = charSequenceInMemoryCounter4.increment(charSequence10, 1698794995433L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994867L + "'", long7 == 1698794994867L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993851L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) ' ');
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993851L + "'", long12 == 1698794993851L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993883L + "'", long15 == 1698794993883L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993983L + "'", long18 == 1698794993983L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995999L, 1698794993852L, 1698794996543L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>> charSequenceInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.CharSequence>>(inMemoryCounterPersistClient0, 1698794995943L, 23L, 22L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) (byte) 100, (long) 1, (long) '#');
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997053L + "'", long1 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997053L + "'", long5 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 3L);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 38L + "'", long10 == 38L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 12L, 1698794994812L, 1698794996213L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997053L + "'", long1 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993851L, 100L, 1698794994134L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994134L, 1698794994811L, 0L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, (long) (short) 100, 1698794994L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994134L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994134L + "'", long7 == 1698794994134L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997111L + "'", long1 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997111L + "'", long3 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997111L + "'", long4 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997111L + "'", long5 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698794995088L, 3397589989504L, (long) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995655L, 1698794993962L, 3397589989504L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 101L);
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994062L);
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = charSequenceInMemoryCounter4.increment(charSequence22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994L, 3L, 1698794996376L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 'a', 1698794996213L, 12L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993961L + "'", long15 == 1698794993961L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1698794993962L + "'", long17 == 1698794993962L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1698794993963L + "'", long22 == 1698794993963L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997L + "'", long1 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997278L + "'", long4 == 1698794997278L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995147L, 1698794994134L, 1698794996376L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, 1698794994527L, (long) (-1));
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 12L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 13L + "'", long9 == 13L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 11L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass18 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22L + "'", long15 == 22L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (-1L));
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (byte) -1);
        java.lang.CharSequence charSequence13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = charSequenceInMemoryCounter4.increment(charSequence13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, 1698794994752L, 1698794994752L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4L + "'", long19 == 4L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1698794994062L, 1698794993954L, 1698794995543L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 'a', 1698794995381L, 1698794995088L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994134L);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794996376L);
        java.lang.Class<?> wildcardClass14 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794994134L + "'", long10 == 1698794994134L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3397589990510L + "'", long13 == 3397589990510L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 'a', 1698794996213L, 12L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993963L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794993963L + "'", long7 == 1698794993963L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997569L + "'", long1 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997569L + "'", long4 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997569L + "'", long5 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997L + "'", long1 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997623L + "'", long4 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997623L + "'", long5 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 1, 1698794997333L, 1698794995433L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, 1698794996594L, 1698794996213L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, 1698794995325L, 13L, 38L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995381L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794995381L + "'", long15 == 1698794995381L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794996427L, 10L, 1698794994163L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993853L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794993853L + "'", long7 == 1698794993853L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        java.lang.CharSequence charSequence8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = charSequenceInMemoryCounter4.increment(charSequence8, 1698794997683L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        java.lang.CharSequence charSequence16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = charSequenceInMemoryCounter4.increment(charSequence16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
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
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997683L + "'", long1 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997683L + "'", long2 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997683L + "'", long5 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1698794995381L, 2L, 6795179979008L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 3397589989504L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3397589989504L + "'", long9 == 3397589989504L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997734L + "'", long1 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997734L + "'", long3 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 3397589990510L, (long) '#', 10L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, 2L, 0L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994L + "'", long7 == 1698794994L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589989504L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3397589989504L + "'", long7 == 3397589989504L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 10L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 10, 1698794994753L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995207L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995325L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995207L + "'", long7 == 1698794995207L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794995325L + "'", long10 == 1698794995325L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794996269L);
        long long19 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995037L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698794996270L + "'", long16 == 1698794996270L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3397589991307L + "'", long19 == 3397589991307L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 101L);
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994062L);
        long long23 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1698794994063L + "'", long23 == 1698794994063L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997848L + "'", long1 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997848L + "'", long2 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997848L + "'", long4 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        java.lang.Class<?> wildcardClass16 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993961L + "'", long15 == 1698794993961L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993852L, 1698794995942L, 1698794996376L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794996543L, 1698794994135L, 1698794994811L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (-1L));
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589989504L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3397589989502L + "'", long16 == 3397589989502L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997957L + "'", long1 == 1698794997957L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997957L + "'", long3 == 1698794997957L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993962L, (long) (short) 100, 1698794997623L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993853L);
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 101L);
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = charSequenceInMemoryCounter4.increment(charSequence22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993853L + "'", long18 == 1698794993853L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993954L + "'", long21 == 1698794993954L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998017L + "'", long4 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998017L + "'", long5 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995942L, 1698794997899L, 1698794995655L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 23L, 1698794994754L, 1698794994469L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698794993963L, (long) 1, 3397589989506L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993853L);
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 101L);
        long long24 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993853L + "'", long18 == 1698794993853L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993954L + "'", long21 == 1698794993954L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1698794994054L + "'", long24 == 1698794994054L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698794995598L, 35L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994867L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994867L + "'", long7 == 1698794994867L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998073L + "'", long2 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998073L + "'", long1 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998073L + "'", long5 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
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
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994752L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794994753L + "'", long12 == 1698794994753L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794994753L + "'", long15 == 1698794994753L);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698794994752L, 1698794995942L, 1698794996213L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, 11L, 1698794996376L, 38L);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, 3397589990182L, 1698794995488L, 100L);
        java.lang.Class<?> wildcardClass5 = genericDeclarationInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998132L + "'", long1 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998132L + "'", long2 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998132L + "'", long5 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998132L + "'", long2 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998186L + "'", long1 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998186L + "'", long2 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995544L, 1698794993963L, 1698794996L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, (long) (short) 100, 1698794994L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3L);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589989502L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3397589989505L + "'", long13 == 3397589989505L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794996594L, 1698794996213L, (long) (short) 100);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698794994812L, 1698794996594L, 1698794997278L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 101L);
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698794994063L + "'", long20 == 1698794994063L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 2L, 101L, 1698794994752L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998238L + "'", long1 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998238L + "'", long4 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (-1L));
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        java.lang.Class<?> wildcardClass17 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698794995655L + "'", long16 == 1698794995655L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, (long) '#', (long) (-1));
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698794996594L, 1698794995942L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998298L + "'", long1 == 1698794998298L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995433L, 1698794993851L, 1698794995999L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994135L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994135L + "'", long7 == 1698794994135L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, (long) (byte) 0, 1698794995488L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998298L + "'", long3 == 1698794998298L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998298L + "'", long4 == 1698794998298L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 100, 1698794997111L, 1698794994753L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994527L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3397589990182L + "'", long10 == 3397589990182L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994752L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794994753L + "'", long12 == 1698794994753L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698794994754L + "'", long14 == 1698794994754L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 100L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995543L);
        java.lang.Class<?> wildcardClass19 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3397589989504L + "'", long18 == 3397589989504L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994134L, 1698794993962L, 13L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 23L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23L + "'", long7 == 23L);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) -1, 10L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995088L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995088L + "'", long7 == 1698794995088L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698794993851L, 1698794994L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794997509L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997509L + "'", long7 == 1698794997509L);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = charSequenceInMemoryCounter4.increment(charSequence15, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 10, 1698794994753L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = charSequenceInMemoryCounter4.increment(charSequence7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) 100, 1698794995207L, (long) (short) 100);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995037L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995037L + "'", long7 == 1698794995037L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998416L + "'", long2 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998416L + "'", long3 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 'a', 1698794996213L, 12L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993963L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794997223L);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794993963L + "'", long7 == 1698794993963L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794997223L + "'", long10 == 1698794997223L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (-1L), 1698794995543L, 35L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, (long) (short) 0, 1698794995325L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 23L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23L + "'", long7 == 23L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 24L + "'", long11 == 24L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, (long) (short) 100, 1698794994L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794996270L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794996273L + "'", long15 == 1698794996273L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, (long) (short) 100, 1698794995037L, 1698794993963L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 4L, (long) (short) 1, 1698794995543L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995543L);
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long22 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794995544L + "'", long18 == 1698794995544L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1698794995545L + "'", long22 == 1698794995545L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994054L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794994054L + "'", long10 == 1698794994054L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998529L + "'", long1 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998529L + "'", long2 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993851L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) ' ');
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 6795179979008L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993851L + "'", long12 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993883L + "'", long15 == 1698794993883L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 6795179979008L + "'", long18 == 6795179979008L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998529L + "'", long1 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998529L + "'", long3 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998529L + "'", long4 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998529L + "'", long5 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 3397589989504L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3397589989504L + "'", long9 == 3397589989504L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3397589989505L + "'", long11 == 3397589989505L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long23 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794997053L);
        java.lang.Class<?> wildcardClass24 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1698794997054L + "'", long23 == 1698794997054L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794995655L + "'", long10 == 1698794995655L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 0, 1698794995147L, 10L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass7 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998642L + "'", long2 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998642L + "'", long4 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, (long) (short) 0, 1698794995325L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 23L);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23L + "'", long7 == 23L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998642L + "'", long1 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993961L, 2L, 0L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995381L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794995381L + "'", long10 == 1698794995381L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994134L, (long) (byte) 10, 0L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794995883L, (long) (short) 100, 1698794995037L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994527L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994867L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994527L + "'", long7 == 1698794994527L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794994868L + "'", long12 == 1698794994868L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, 1698794994752L, 1698794994752L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998702L + "'", long2 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998702L + "'", long3 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, 1698794994063L, 1698794995088L, (long) (short) -1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994134L, 1698794993962L, 13L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794996427L, 1698794996487L, 1698794994812L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794996427L, 10L, 1698794994163L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) ' ', 0L, 12L);
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = charSequenceInMemoryCounter4.increment(charSequence5, 1698794993962L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (-1L));
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998702L + "'", long1 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998702L + "'", long6 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794993851L, 100L, 1698794994134L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794997053L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997053L + "'", long7 == 1698794997053L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998757L + "'", long1 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998757L + "'", long4 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
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
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998757L + "'", long1 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998757L + "'", long2 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998757L + "'", long1 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998757L + "'", long3 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement> annotatedElementInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement>(inMemoryCounterPersistClient0, 6795179979008L, (long) (-1), (long) 1);
        java.lang.Class<?> wildcardClass5 = annotatedElementInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (short) 10, 1698794994753L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589990182L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3397589990182L + "'", long7 == 3397589990182L);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994134L);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994135L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794994134L + "'", long10 == 1698794994134L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3397589988269L + "'", long13 == 3397589988269L);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794998416L, 3397589990182L, 1698794997223L);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794997333L, 1698794996644L, 1698794998073L);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 0);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995942L);
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long21 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993883L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698794995943L + "'", long16 == 1698794995943L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993886L + "'", long21 == 1698794993886L);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        java.lang.CharSequence charSequence8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = charSequenceInMemoryCounter4.increment(charSequence8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998866L + "'", long2 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998866L + "'", long3 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998866L + "'", long4 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698794995598L, 35L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994867L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994868L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994867L + "'", long7 == 1698794994867L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3397589989735L + "'", long10 == 3397589989735L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) 10);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        long long17 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993883L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993961L + "'", long15 == 1698794993961L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1698794993962L + "'", long17 == 1698794993962L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698794993893L + "'", long20 == 1698794993893L);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698794997L, 1698794996L, 22L);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 1698794994054L, 1698794998132L, 1698794997054L);
        java.lang.Class<?> wildcardClass5 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, 3397589988269L, 1698794993954L);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, (long) (short) 100, 1698794994L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        java.lang.Class<?> wildcardClass8 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long18 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995543L);
        long long20 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass21 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794995544L + "'", long18 == 1698794995544L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698794997002L, 1698794995943L, 1698794996806L);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998973L + "'", long1 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998973L + "'", long3 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994134L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794994134L + "'", long7 == 1698794994134L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998973L + "'", long1 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998973L + "'", long2 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 3L, 1698794994L, 1698794997848L);
    }
}
