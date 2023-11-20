import org.junit.FixMethodOrder;

import org.junit.Test;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FlakyTests{
    public static boolean debug = false;


    public void test004_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass2 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794993961L + "'", long1 == 1698794993961L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    public void test006_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass2 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794994L + "'", long1 == 1698794994L);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    public void test009_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    public void test015_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    public void test015_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    public void test015_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    public void test016_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    public void test020_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 12L + "'", long14 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    public void test020_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 12L + "'", long14 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    public void test023_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
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

    public void test024_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 12L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 23L + "'", long12 == 23L);
    }

    public void test025_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    public void test027_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    public void test035_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass5 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995147L + "'", long1 == 1698794995147L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    public void test035_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    public void test035_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    public void test035_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    public void test036_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    public void test039_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    public void test039_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    public void test040_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass3 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995L + "'", long1 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    public void test040_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass3 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995L + "'", long1 == 1698794995L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    public void test043_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995433L + "'", long1 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
    }

    public void test043_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
    }

    public void test043_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
    }

    public void test043_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995L + "'", long4 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
    }

    public void test043_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
    }

    public void test044_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995433L + "'", long1 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995433L + "'", long4 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test044_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995433L + "'", long4 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test044_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995433L + "'", long4 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test044_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995433L + "'", long4 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test044_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995433L + "'", long5 == 1698794995433L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test044_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995433L + "'", long6 == 1698794995433L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test045_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 101L + "'", long14 == 101L);
    }

    public void test045_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 101L + "'", long14 == 101L);
    }

    public void test045_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 101L + "'", long14 == 101L);
    }

    public void test049_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    public void test051_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794995710L + "'", long1 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995710L + "'", long4 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995710L + "'", long5 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test051_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794995L + "'", long2 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995710L + "'", long4 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995710L + "'", long5 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test051_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794995L + "'", long3 == 1698794995L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995710L + "'", long4 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995710L + "'", long5 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test051_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794995710L + "'", long4 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995710L + "'", long5 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test051_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794995710L + "'", long5 == 1698794995710L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test051_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794995L + "'", long6 == 1698794995L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test055_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993962L + "'", long18 == 1698794993962L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    public void test056_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22L + "'", long15 == 22L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    public void test059_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        java.lang.Class<?> wildcardClass12 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    public void test065_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 12L + "'", long16 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    public void test065_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 12L + "'", long16 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    public void test065_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 12L + "'", long16 == 12L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    public void test074_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3397589989504L + "'", long18 == 3397589989504L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6795179979008L + "'", long21 == 6795179979008L);
    }

    public void test074_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3397589989504L + "'", long18 == 3397589989504L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 6795179979008L + "'", long21 == 6795179979008L);
    }

    public void test076_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    public void test076_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    public void test078_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996L + "'", long1 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996269L + "'", long3 == 1698794996269L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    public void test078_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass4 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996L + "'", long1 == 1698794996L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996269L + "'", long3 == 1698794996269L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    public void test078_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996269L + "'", long3 == 1698794996269L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    public void test079_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698794993851L + "'", long11 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698794993852L + "'", long13 == 1698794993852L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    public void test079_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    public void test082_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698794993851L + "'", long11 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698794993852L + "'", long13 == 1698794993852L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993853L + "'", long15 == 1698794993853L);
    }

    public void test083_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993961L + "'", long15 == 1698794993961L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1698794993962L + "'", long17 == 1698794993962L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    public void test084_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996376L + "'", long1 == 1698794996376L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996376L + "'", long2 == 1698794996376L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996376L + "'", long5 == 1698794996376L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test084_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996376L + "'", long2 == 1698794996376L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996376L + "'", long5 == 1698794996376L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test084_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996376L + "'", long5 == 1698794996376L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test084_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996376L + "'", long5 == 1698794996376L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test084_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996376L + "'", long5 == 1698794996376L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test085_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996L + "'", long1 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996427L + "'", long4 == 1698794996427L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test085_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996427L + "'", long4 == 1698794996427L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test085_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996427L + "'", long4 == 1698794996427L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test085_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996427L + "'", long4 == 1698794996427L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test085_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test086_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
    }

    public void test086_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2L + "'", long19 == 2L);
    }

    public void test088_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    public void test088_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    public void test089_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996543L + "'", long1 == 1698794996543L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996543L + "'", long2 == 1698794996543L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test089_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996543L + "'", long2 == 1698794996543L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test089_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test089_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test089_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test089_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996543L + "'", long6 == 1698794996543L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test093_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996695L + "'", long1 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996695L + "'", long3 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996695L + "'", long4 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    public void test093_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996695L + "'", long3 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996695L + "'", long4 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    public void test093_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996695L + "'", long3 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996695L + "'", long4 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    public void test093_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996695L + "'", long4 == 1698794996695L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    public void test093_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996L + "'", long5 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    public void test093_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
    }

    public void test095_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794993851L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993851L + "'", long12 == 1698794993851L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993851L + "'", long15 == 1698794993851L);
    }

    public void test099_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996806L + "'", long1 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996806L + "'", long2 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test099_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996806L + "'", long2 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test099_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996L + "'", long3 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test099_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996L + "'", long4 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test099_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test099_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test101_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794996806L + "'", long1 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996806L + "'", long3 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996806L + "'", long4 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test101_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794996L + "'", long2 == 1698794996L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996806L + "'", long3 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996806L + "'", long4 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test101_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794996806L + "'", long3 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996806L + "'", long4 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test101_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794996806L + "'", long4 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test101_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794996806L + "'", long5 == 1698794996806L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test101_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794996L + "'", long6 == 1698794996L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test103_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794994811L);
        long long14 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794994811L + "'", long12 == 1698794994811L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698794994812L + "'", long14 == 1698794994812L);
    }

    public void test106_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993883L + "'", long15 == 1698794993883L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993983L + "'", long18 == 1698794993983L);
    }

    public void test106_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993983L + "'", long18 == 1698794993983L);
    }

    public void test108_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) -1);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (short) 10);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    public void test108_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    public void test111_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997053L + "'", long1 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997053L + "'", long5 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test111_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997053L + "'", long5 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test111_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997053L + "'", long5 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test111_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997053L + "'", long5 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test111_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997053L + "'", long5 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test111_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test111_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test112_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) '#');
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 3L);
        java.lang.Class<?> wildcardClass11 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 38L + "'", long10 == 38L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    public void test114_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997053L + "'", long1 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test114_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test114_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997053L + "'", long3 == 1698794997053L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test114_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test114_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test114_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997053L + "'", long6 == 1698794997053L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test120_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997111L + "'", long1 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997111L + "'", long3 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997111L + "'", long4 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997111L + "'", long5 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test120_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997111L + "'", long3 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997111L + "'", long4 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997111L + "'", long5 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test120_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997111L + "'", long3 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997111L + "'", long4 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997111L + "'", long5 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test120_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997111L + "'", long4 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997111L + "'", long5 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test120_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997111L + "'", long5 == 1698794997111L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test120_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test120_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997111L + "'", long7 == 1698794997111L);
    }

    public void test123_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
    }

    public void test123_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
    }

    public void test123_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
    }

    public void test126_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1698794993963L + "'", long22 == 1698794993963L);
    }

    public void test126_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1698794993963L + "'", long22 == 1698794993963L);
    }

    public void test127_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997L + "'", long1 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997278L + "'", long4 == 1698794997278L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test127_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997278L + "'", long4 == 1698794997278L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test127_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997278L + "'", long4 == 1698794997278L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test127_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997278L + "'", long4 == 1698794997278L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test127_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test127_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test127_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
    }

    public void test130_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    public void test130_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 12L + "'", long11 == 12L);
    }

    public void test131_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22L + "'", long15 == 22L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    public void test131_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 22L + "'", long15 == 22L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    public void test132_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    public void test133_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    public void test135_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4L + "'", long19 == 4L);
    }

    public void test135_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4L + "'", long19 == 4L);
    }

    public void test140_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass10 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    public void test142_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997569L + "'", long1 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997569L + "'", long4 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997569L + "'", long5 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997569L + "'", long4 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997569L + "'", long5 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997569L + "'", long4 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997569L + "'", long5 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997569L + "'", long4 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997569L + "'", long5 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997569L + "'", long5 == 1698794997569L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test142_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
    }

    public void test143_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997L + "'", long1 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997623L + "'", long4 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997623L + "'", long5 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test143_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997623L + "'", long4 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997623L + "'", long5 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test143_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997623L + "'", long4 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997623L + "'", long5 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test143_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997623L + "'", long4 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997623L + "'", long5 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test143_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997623L + "'", long5 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test143_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997623L + "'", long6 == 1698794997623L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test143_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test147_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794995381L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794995381L + "'", long15 == 1698794995381L);
    }

    public void test150_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
    }

    public void test150_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
    }

    public void test151_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997683L + "'", long1 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997683L + "'", long2 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997683L + "'", long5 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997683L + "'", long2 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997683L + "'", long5 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997683L + "'", long5 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997683L + "'", long5 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997683L + "'", long5 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997683L + "'", long6 == 1698794997683L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997L + "'", long7 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997L + "'", long8 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test151_9() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794997L + "'", long9 == 1698794997L);
    }

    public void test154_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997734L + "'", long1 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997734L + "'", long3 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997734L + "'", long3 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997734L + "'", long3 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997734L + "'", long6 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794997734L + "'", long7 == 1698794997734L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test154_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794997734L + "'", long8 == 1698794997734L);
    }

    public void test158_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 10L);
        long long15 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    public void test158_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 11L + "'", long12 == 11L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    public void test160_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1698794993961L);
        java.lang.Class<?> wildcardClass13 = charSequenceInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11L + "'", long9 == 11L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698794993961L + "'", long12 == 1698794993961L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    public void test162_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1698794994063L + "'", long23 == 1698794994063L);
    }

    public void test162_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794994163L + "'", long21 == 1698794994163L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1698794994063L + "'", long23 == 1698794994063L);
    }

    public void test163_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997848L + "'", long1 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997848L + "'", long2 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997848L + "'", long4 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test163_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997848L + "'", long2 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997848L + "'", long4 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test163_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997L + "'", long3 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997848L + "'", long4 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test163_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997848L + "'", long4 == 1698794997848L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test163_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test164_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698794993961L + "'", long15 == 1698794993961L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    public void test167_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) (-1));
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (long) 0);
        long long13 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", (-1L));
        long long16 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 3397589989504L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3397589989502L + "'", long16 == 3397589989502L);
    }

    public void test167_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2L) + "'", long13 == (-2L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3397589989502L + "'", long16 == 3397589989502L);
    }

    public void test167_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3397589989502L + "'", long16 == 3397589989502L);
    }

    public void test168_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794997957L + "'", long1 == 1698794997957L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997957L + "'", long3 == 1698794997957L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    public void test168_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794997L + "'", long2 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997957L + "'", long3 == 1698794997957L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    public void test168_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794997957L + "'", long3 == 1698794997957L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    public void test168_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794997L + "'", long4 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    public void test168_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794997L + "'", long5 == 1698794997L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    public void test168_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794997L + "'", long6 == 1698794997L);
    }

    public void test170_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993853L + "'", long18 == 1698794993853L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993954L + "'", long21 == 1698794993954L);
    }

    public void test170_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993853L + "'", long18 == 1698794993853L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993954L + "'", long21 == 1698794993954L);
    }

    public void test170_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993853L + "'", long18 == 1698794993853L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993954L + "'", long21 == 1698794993954L);
    }

    public void test171_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998017L + "'", long4 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998017L + "'", long5 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test171_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998017L + "'", long4 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998017L + "'", long5 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test171_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998017L + "'", long4 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998017L + "'", long5 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test171_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998017L + "'", long4 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998017L + "'", long5 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test171_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998017L + "'", long5 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test171_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998017L + "'", long6 == 1698794998017L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test171_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998017L + "'", long7 == 1698794998017L);
    }

    public void test175_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794993853L + "'", long18 == 1698794993853L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698794993954L + "'", long21 == 1698794993954L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1698794994054L + "'", long24 == 1698794994054L);
    }

    public void test177_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test177_9() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998073L + "'", long9 == 1698794998073L);
    }

    public void test178_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998073L + "'", long2 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test178_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998073L + "'", long2 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test178_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test178_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test178_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test178_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998073L + "'", long6 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test178_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test179_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998073L + "'", long1 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998073L + "'", long5 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test179_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998073L + "'", long5 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test179_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998073L + "'", long5 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test179_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998073L + "'", long4 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998073L + "'", long5 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test179_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998073L + "'", long5 == 1698794998073L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test179_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test179_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998073L + "'", long7 == 1698794998073L);
    }

    public void test185_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998132L + "'", long1 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998132L + "'", long2 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998132L + "'", long5 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test185_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998132L + "'", long2 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998132L + "'", long5 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test185_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998132L + "'", long5 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test185_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998132L + "'", long5 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test185_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998132L + "'", long5 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test185_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998132L + "'", long6 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test185_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test186_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998132L + "'", long2 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test186_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998132L + "'", long2 == 1698794998132L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test186_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test186_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test186_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test186_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test186_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998132L + "'", long7 == 1698794998132L);
    }

    public void test187_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998186L + "'", long1 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998186L + "'", long2 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998186L + "'", long2 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998186L + "'", long7 == 1698794998186L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test187_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998186L + "'", long8 == 1698794998186L);
    }

    public void test189_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
    }

    public void test189_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
    }

    public void test189_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
    }

    public void test189_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
    }

    public void test193_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 101L + "'", long15 == 101L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698794994062L + "'", long18 == 1698794994062L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698794994063L + "'", long20 == 1698794994063L);
    }

    public void test195_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998238L + "'", long1 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998238L + "'", long4 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
    }

    public void test195_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998238L + "'", long4 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
    }

    public void test195_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998238L + "'", long4 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
    }

    public void test195_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998238L + "'", long4 == 1698794998238L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
    }

    public void test195_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
    }

    public void test199_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998298L + "'", long1 == 1698794998298L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    public void test199_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    public void test199_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    public void test199_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    public void test199_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    public void test199_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998298L + "'", long6 == 1698794998298L);
    }

    public void test202_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998298L + "'", long3 == 1698794998298L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998298L + "'", long4 == 1698794998298L);
    }

    public void test202_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998298L + "'", long3 == 1698794998298L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998298L + "'", long4 == 1698794998298L);
    }

    public void test202_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998298L + "'", long3 == 1698794998298L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998298L + "'", long4 == 1698794998298L);
    }

    public void test202_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998298L + "'", long4 == 1698794998298L);
    }

    public void test204_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 1, (long) ' ', 1698794995381L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794995655L);
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 1698794994527L);
        long long12 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794995655L + "'", long7 == 1698794995655L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3397589990182L + "'", long10 == 3397589990182L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    public void test205_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    public void test209_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!", 1L);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    public void test211_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    public void test214_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998416L + "'", long2 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998416L + "'", long3 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    public void test214_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998416L + "'", long2 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998416L + "'", long3 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    public void test214_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998416L + "'", long3 == 1698794998416L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    public void test214_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    public void test214_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    public void test214_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998416L + "'", long6 == 1698794998416L);
    }

    public void test224_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998529L + "'", long1 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998529L + "'", long2 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test224_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998529L + "'", long2 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test224_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test224_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test224_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test224_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test224_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test226_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998529L + "'", long1 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998529L + "'", long3 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998529L + "'", long4 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998529L + "'", long5 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    public void test226_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998529L + "'", long3 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998529L + "'", long4 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998529L + "'", long5 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    public void test226_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998529L + "'", long3 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998529L + "'", long4 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998529L + "'", long5 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    public void test226_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998529L + "'", long4 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998529L + "'", long5 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    public void test226_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998529L + "'", long5 == 1698794998529L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    public void test226_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998529L + "'", long6 == 1698794998529L);
    }

    public void test228_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1698794997054L + "'", long23 == 1698794997054L);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    public void test230_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test230_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test230_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test230_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test230_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    public void test231_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test231_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test231_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test231_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998583L + "'", long4 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test231_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test231_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998583L + "'", long6 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test231_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998583L + "'", long7 == 1698794998583L);
    }

    public void test233_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test233_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998583L + "'", long2 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test233_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998583L + "'", long3 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test233_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test233_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998583L + "'", long5 == 1698794998583L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test233_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test235_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998642L + "'", long2 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998642L + "'", long4 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test235_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998642L + "'", long2 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998642L + "'", long4 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test235_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998642L + "'", long4 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test235_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998642L + "'", long4 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test235_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test235_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998642L + "'", long6 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    public void test237_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998642L + "'", long1 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test237_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test237_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998642L + "'", long3 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test237_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test237_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998642L + "'", long5 == 1698794998642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test237_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test237_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998642L + "'", long7 == 1698794998642L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    public void test241_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) 100, 1698794994752L, 1698794994752L);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
    }

    public void test242_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998702L + "'", long2 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998702L + "'", long3 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test242_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998702L + "'", long2 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998702L + "'", long3 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test242_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998702L + "'", long3 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test242_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test242_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test242_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test248_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    public void test248_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    public void test248_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    public void test249_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998702L + "'", long1 == 1698794998702L);
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

    public void test249_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998702L + "'", long6 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998702L + "'", long6 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998702L + "'", long4 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998702L + "'", long6 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998702L + "'", long5 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998702L + "'", long6 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998702L + "'", long6 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998702L + "'", long8 == 1698794998702L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_9() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test249_10() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998702L + "'", long10 == 1698794998702L);
    }

    public void test251_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998757L + "'", long1 == 1698794998757L);
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

    public void test251_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998757L + "'", long4 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998757L + "'", long4 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998757L + "'", long4 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998L + "'", long8 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_9() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698794998L + "'", long9 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test251_10() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698794998L + "'", long10 == 1698794998L);
    }

    public void test252_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    public void test252_2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, 0L, (long) (byte) 10, 1698794993851L);
        long long7 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", (long) (byte) 10);
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    public void test253_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998757L + "'", long1 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998757L + "'", long2 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998757L + "'", long2 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test253_8() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698794998757L + "'", long8 == 1698794998757L);
    }

    public void test254_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998757L + "'", long1 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998757L + "'", long3 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test254_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998757L + "'", long3 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test254_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998757L + "'", long3 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test254_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test254_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998757L + "'", long5 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test254_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998757L + "'", long6 == 1698794998757L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test254_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test256_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long9 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "", 0L);
        long long11 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    public void test262_1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long6 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long8 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        long long10 = charSequenceInMemoryCounter4.increment((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    public void test264_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998L + "'", long1 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998866L + "'", long2 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998866L + "'", long3 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998866L + "'", long4 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test264_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998866L + "'", long2 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998866L + "'", long3 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998866L + "'", long4 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test264_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998866L + "'", long3 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998866L + "'", long4 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test264_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998866L + "'", long4 == 1698794998866L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test264_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test264_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998L + "'", long6 == 1698794998L);
    }

    public void test274_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998973L + "'", long1 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998973L + "'", long3 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test274_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998L + "'", long2 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998973L + "'", long3 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test274_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998973L + "'", long3 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test274_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test274_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test274_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test274_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998L + "'", long7 == 1698794998L);
    }

    public void test277_1() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698794998973L + "'", long1 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998973L + "'", long2 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    public void test277_2() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698794998973L + "'", long2 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    public void test277_3() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698794998L + "'", long3 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    public void test277_4() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698794998L + "'", long4 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    public void test277_5() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698794998L + "'", long5 == 1698794998L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    public void test277_6() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698794998973L + "'", long6 == 1698794998973L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }

    public void test277_7() throws Throwable {
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
         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698794998973L + "'", long7 == 1698794998973L);
    }
}