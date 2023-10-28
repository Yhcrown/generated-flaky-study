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
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) 100, (long) '#');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 10, (long) 1, (long) 0);
        java.lang.constant.Constable constable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = constableInMemoryCounter4.increment(constable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>> constableInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>>(inMemoryCounterPersistClient0, 35L, (long) (short) -1, (long) 100);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounterInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long14 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass20 = constableInMemoryCounter19.getClass();
        long long22 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass20, (long) (short) 0);
        long long24 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter12.getClass();
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass25, (long) 100);
        java.lang.Class<?> wildcardClass28 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        java.lang.Class<?> wildcardClass10 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement> annotatedElementInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement>(inMemoryCounterPersistClient0, (long) (byte) -1, 1698467897743L, 1698467897743L);
        java.lang.Class<?> wildcardClass5 = annotatedElementInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698467897071L, (long) 1, 1698467898L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass6 = inMemoryClock5.getClass();
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass6, 1L);
        java.lang.Class<?> wildcardClass9 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long14 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass20 = constableInMemoryCounter19.getClass();
        long long22 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass20, (long) (short) 0);
        long long24 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter12.getClass();
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass25, (long) 100);
        long long30 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, 0L);
        hu.chengming.util.InMemoryClock inMemoryClock31 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass32 = inMemoryClock31.getClass();
        long long34 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass32, 1698467898L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1698467898L + "'", long34 == 1698467898L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898170L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) 100, (long) (byte) -1, 1698467897071L);
        java.lang.Class<?> wildcardClass5 = strComparableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467896965L, 1698467897743L, 1698467898L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        java.lang.Class<?> wildcardClass15 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467898L + "'", long1 == 1698467898L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467898L + "'", long2 == 1698467898L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467898L + "'", long3 == 1698467898L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467898706L + "'", long4 == 1698467898706L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467898L + "'", long5 == 1698467898L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897743L, (long) (short) 1);
        java.lang.constant.Constable constable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = constableInMemoryCounter4.increment(constable10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient5, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = serializableInMemoryCounter9.getClass();
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass10, 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient0, (long) '#', 32L, 0L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass20 = constableInMemoryCounter19.getClass();
        long long21 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass20);
        java.lang.constant.Constable constable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = constableInMemoryCounter4.increment(constable22, 1698467897L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) false, 0L);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, (long) (short) 0);
        java.lang.constant.Constable constable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = constableInMemoryCounter4.increment(constable16, 1698467897743L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 10, (long) 1, (long) 0);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) -1, (-1L));
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898919L, 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement> annotatedElementInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement>(inMemoryCounterPersistClient0, (long) (short) 1, 32L, 0L);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass6 = inMemoryClock5.getClass();
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass6, 1L);
        long long10 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0f), 1698467898223L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient14 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter18 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient14, (long) '#', 1L, (long) (byte) -1);
        long long21 = constableInMemoryCounter18.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock22 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass23 = inMemoryClock22.getClass();
        long long25 = constableInMemoryCounter18.increment((java.lang.constant.Constable) wildcardClass23, (long) (byte) -1);
        java.lang.Class<?> wildcardClass26 = constableInMemoryCounter18.getClass();
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass26);
        org.junit.Assert.assertNotNull(inMemoryClock5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467898223L + "'", long13 == 1698467898223L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896L);
        long long18 = constableInMemoryCounter4.increment((java.lang.constant.Constable) "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient12, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = serializableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass17, (long) ' ');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, (long) '#', 1L, (long) (byte) -1);
        long long27 = constableInMemoryCounter24.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock28 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass29 = inMemoryClock28.getClass();
        long long31 = constableInMemoryCounter24.increment((java.lang.constant.Constable) wildcardClass29, (long) (byte) -1);
        long long33 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) -1, 1698467898L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 10L + "'", long27 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1698467898L + "'", long33 == 1698467898L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long14 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass20 = constableInMemoryCounter19.getClass();
        long long22 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass20, (long) (short) 0);
        long long24 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter12.getClass();
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass25, (long) 100);
        long long30 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, 0L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient31 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter35 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient31, (long) '#', 1L, (long) (byte) -1);
        long long37 = constableInMemoryCounter35.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock38 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass39 = inMemoryClock38.getClass();
        long long40 = constableInMemoryCounter35.increment((java.lang.constant.Constable) wildcardClass39);
        long long42 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long40, 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467899L + "'", long1 == 1698467899L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467899L + "'", long2 == 1698467899L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467899L + "'", long3 == 1698467899L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467899615L + "'", long4 == 1698467899615L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467899615L + "'", long5 == 1698467899615L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467899L + "'", long6 == 1698467899L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (-1L), (long) (byte) -1, (long) (short) 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0d);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, 1698467896643L, 1698467898546L, 3L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass24);
        long long28 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899L, 1698467899L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467899L + "'", long13 == 1698467899L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467899L + "'", long14 == 1698467899L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467899L + "'", long28 == 1698467899L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient24 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter28 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient24, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter28.getClass();
        long long31 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass29, (long) (short) 0);
        long long32 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long31);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0d), (long) '4');
        java.lang.Class<?> wildcardClass36 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor> typeDescriptorInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor>(inMemoryCounterPersistClient0, (long) (byte) 10, 1698467898758L, (long) '4');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698467898654L, 1698467899669L, 1L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467900047L + "'", long1 == 1698467900047L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467900L + "'", long2 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467900047L + "'", long3 == 1698467900047L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467900047L + "'", long4 == 1698467900047L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467900L + "'", long5 == 1698467900L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass24);
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899564L);
        long long29 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898919L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900L + "'", long14 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, 1698467900L, 0L, 1698467898972L);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, (long) (byte) -1, (-1L), 0L);
        java.lang.Class<?> wildcardClass5 = wildcardClassInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467899511L, 1698467898867L, 2L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (-1L), 32L, 1698467897071L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        long long6 = inMemoryClock5.currentTimeMillis();
        long long7 = inMemoryClock5.currentTimeMillis();
        long long8 = inMemoryClock5.currentTimestamp();
        long long9 = inMemoryClock5.currentTimestamp();
        long long10 = inMemoryClock5.currentTimeMillis();
        java.lang.Class<?> wildcardClass11 = inMemoryClock5.getClass();
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass11, 1698467896643L);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899938L);
        org.junit.Assert.assertNotNull(inMemoryClock5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467900209L + "'", long6 == 1698467900209L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467900209L + "'", long7 == 1698467900209L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467900L + "'", long8 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900L + "'", long9 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467900209L + "'", long10 == 1698467900209L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467896643L + "'", long13 == 1698467896643L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, (long) 'a', 1698467898223L, 2L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long14 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass20 = constableInMemoryCounter19.getClass();
        long long22 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass20, (long) (short) 0);
        long long24 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter12.getClass();
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass25, (long) 100);
        long long29 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898706L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, (long) (short) 100, 1698467900209L, (long) '4');
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, 1698467898706L, 1698467897L, 0L);
        java.lang.Class<?> wildcardClass5 = inMemoryClockInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, 1698467900155L, 1698467900L, (long) (byte) 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467900314L + "'", long1 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467900314L + "'", long2 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467900L + "'", long3 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467900L + "'", long4 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467900314L + "'", long5 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467900314L + "'", long6 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467900L + "'", long7 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467900314L + "'", long8 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900314L + "'", long9 == 1698467900314L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467900314L + "'", long1 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467900314L + "'", long2 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467900L + "'", long3 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467900L + "'", long4 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467900314L + "'", long5 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467900314L + "'", long6 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467900314L + "'", long7 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467900314L + "'", long8 == 1698467900314L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900314L + "'", long9 == 1698467900314L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467896L, 1698467896965L, 0L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899828L, (long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>> constableInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>>(inMemoryCounterPersistClient0, (long) 1, 1698467896965L, 1698467898972L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long10 = constableInMemoryCounter4.increment((java.lang.constant.Constable) ' ', 3L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899081L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898919L, 1698467898706L, 3L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 100, 1L, (long) (short) 0);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) ' ', (long) 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 0L, (long) '#', (long) 1);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900209L, 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900L + "'", long14 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement> annotatedElementInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.AnnotatedElement>(inMemoryCounterPersistClient0, 1698467898331L, 1698467899615L, 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) ' ', 0L, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass17, (long) (short) 0);
        long long21 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long28 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass34 = constableInMemoryCounter33.getClass();
        long long36 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass34, (long) (short) 0);
        long long37 = constableInMemoryCounter9.increment((java.lang.constant.Constable) long36);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient38, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass43 = charSequenceInMemoryCounter42.getClass();
        long long44 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass43);
        long long45 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long44);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient46 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter50 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient46, (long) '#', 1L, (long) (byte) -1);
        long long53 = constableInMemoryCounter50.increment((java.lang.constant.Constable) 1.0d, (long) '#');
        java.lang.Class<?> wildcardClass54 = constableInMemoryCounter50.getClass();
        long long55 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass54);
        long long58 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 35L + "'", long53 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898276L, (long) (short) 1, (long) (short) -1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass13 = inMemoryClock12.getClass();
        long long14 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass13);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long14, 1698467899L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698467899L + "'", long16 == 1698467899L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient24 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter28 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient24, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter28.getClass();
        long long31 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass29, (long) (short) 0);
        long long32 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long31);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0d), (long) '4');
        long long38 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899186L, 1698467898546L);
        long long40 = constableInMemoryCounter4.increment((java.lang.constant.Constable) '4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1698467898546L + "'", long38 == 1698467898546L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        long long10 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass11 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467900578L + "'", long1 == 1698467900578L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467900578L + "'", long2 == 1698467900578L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467900L + "'", long3 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467900L + "'", long4 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467900578L + "'", long5 == 1698467900578L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467900578L + "'", long6 == 1698467900578L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467900L + "'", long7 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467900L + "'", long8 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900578L + "'", long9 == 1698467900578L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467900L + "'", long10 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, 1698467898652L, 1698467899938L, 1698467900314L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.ConstantDesc> constantDescInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.ConstantDesc>(inMemoryCounterPersistClient0, 1698467897743L, 32L, (long) '#');
        java.lang.Class<?> wildcardClass5 = constantDescInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (byte) -1, (-1L), (long) '4');
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896965L);
        java.lang.Class<?> wildcardClass7 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1698467897071L, (long) (byte) 1, (long) (byte) 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long14 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass20 = constableInMemoryCounter19.getClass();
        long long22 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass20, (long) (short) 0);
        long long24 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter12.getClass();
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass25, (long) 100);
        long long30 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, 0L);
        long long33 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) -1, (long) (byte) 100);
        java.lang.Class<?> wildcardClass34 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock7 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass8 = inMemoryClock7.getClass();
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass8);
        hu.chengming.util.InMemoryClock inMemoryClock10 = hu.chengming.util.InMemoryClock.getInstance();
        long long11 = inMemoryClock10.currentTimestamp();
        long long12 = inMemoryClock10.currentTimestamp();
        long long13 = inMemoryClock10.currentTimestamp();
        long long14 = inMemoryClock10.currentTimeMillis();
        java.lang.Class<?> wildcardClass15 = inMemoryClock10.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, 1698467898652L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient21 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter25 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient21, (long) '#', 1L, (long) (byte) -1);
        long long27 = constableInMemoryCounter25.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock28 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass29 = inMemoryClock28.getClass();
        long long30 = constableInMemoryCounter25.increment((java.lang.constant.Constable) wildcardClass29);
        hu.chengming.util.InMemoryClock inMemoryClock31 = hu.chengming.util.InMemoryClock.getInstance();
        long long32 = inMemoryClock31.currentTimestamp();
        long long33 = inMemoryClock31.currentTimestamp();
        long long34 = inMemoryClock31.currentTimestamp();
        long long35 = inMemoryClock31.currentTimeMillis();
        java.lang.Class<?> wildcardClass36 = inMemoryClock31.getClass();
        long long37 = constableInMemoryCounter25.increment((java.lang.constant.Constable) wildcardClass36);
        hu.chengming.util.InMemoryClock inMemoryClock38 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass39 = inMemoryClock38.getClass();
        long long41 = constableInMemoryCounter25.increment((java.lang.constant.Constable) wildcardClass39, 1698467898652L);
        long long43 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass39, 1698467928L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467900L + "'", long11 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467900L + "'", long12 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900733L + "'", long14 == 1698467900733L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698467898654L + "'", long20 == 1698467898654L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1698467900L + "'", long32 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1698467900L + "'", long33 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1698467900L + "'", long34 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1698467900733L + "'", long35 == 1698467900733L);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1698467898654L + "'", long41 == 1698467898654L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1700166366582L + "'", long43 == 1700166366582L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698467928L, 1698467897798L, 1698467899295L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0d);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient0, 1698467900155L, 35L, (long) (short) 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass24);
        long long28 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899L, 1698467899L);
        long long30 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900L + "'", long14 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467899L + "'", long28 == 1698467899L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1698467900L + "'", long30 == 1698467900L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass24);
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899564L);
        java.lang.Class<?> wildcardClass28 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900L + "'", long14 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) ' ', 1698467899938L, 1698467900420L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 32L, 35L);
        java.lang.constant.Constable constable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = constableInMemoryCounter4.increment(constable12, 1698467898654L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467900839L + "'", long1 == 1698467900839L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467900L + "'", long2 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467900839L + "'", long3 == 1698467900839L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467900L + "'", long4 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467900839L + "'", long5 == 1698467900839L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467900L + "'", long6 == 1698467900L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient12, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = serializableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass17, (long) ' ');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, (long) '#', 1L, (long) (byte) -1);
        long long27 = constableInMemoryCounter24.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long29 = constableInMemoryCounter24.increment((java.lang.constant.Constable) 1L);
        long long31 = constableInMemoryCounter24.increment((java.lang.constant.Constable) (short) 1);
        java.lang.Class<?> wildcardClass32 = constableInMemoryCounter24.getClass();
        long long34 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass32, 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient35 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter39 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient35, (long) '#', 1L, (long) (byte) -1);
        long long41 = constableInMemoryCounter39.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock42 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass43 = inMemoryClock42.getClass();
        long long44 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass43);
        hu.chengming.util.InMemoryClock inMemoryClock45 = hu.chengming.util.InMemoryClock.getInstance();
        long long46 = inMemoryClock45.currentTimestamp();
        long long47 = inMemoryClock45.currentTimestamp();
        long long48 = inMemoryClock45.currentTimestamp();
        long long49 = inMemoryClock45.currentTimeMillis();
        java.lang.Class<?> wildcardClass50 = inMemoryClock45.getClass();
        long long51 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass50);
        hu.chengming.util.InMemoryClock inMemoryClock52 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass53 = inMemoryClock52.getClass();
        long long55 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass53, 1698467898652L);
        long long56 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long55);
        long long59 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899615L, 1698467898867L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1698467928L + "'", long34 == 1698467928L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1698467900L + "'", long46 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1698467900L + "'", long47 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1698467900L + "'", long48 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1698467900892L + "'", long49 == 1698467900892L);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1698467898654L + "'", long55 == 1698467898654L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1698467898867L + "'", long59 == 1698467898867L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1698467900314L, 1698467898919L, 1698467900525L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0);
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898919L, (long) (byte) 10);
        java.lang.Class<?> wildcardClass26 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900L + "'", long14 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, (-1L), 1698467897L, 1698467898867L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        java.lang.Class<?> wildcardClass21 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467900L + "'", long13 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467900L + "'", long14 == 1698467900L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467899081L, 1698467900L, 1698467899992L);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) false, 0L);
        java.lang.Class<?> wildcardClass13 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467900999L + "'", long1 == 1698467900999L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467900999L + "'", long2 == 1698467900999L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467900L + "'", long3 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467900L + "'", long4 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467900999L + "'", long5 == 1698467900999L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467900999L + "'", long6 == 1698467900999L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467900999L + "'", long7 == 1698467900999L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467900999L + "'", long8 == 1698467900999L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900L + "'", long9 == 1698467900L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467900L + "'", long10 == 1698467900L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467900155L, 1698467899615L, 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901L + "'", long1 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901050L + "'", long2 == 1698467901050L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901050L + "'", long5 == 1698467901050L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467901L + "'", long13 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467901L + "'", long14 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901050L + "'", long1 == 1698467901050L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901050L + "'", long2 == 1698467901050L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901050L + "'", long4 == 1698467901050L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901050L + "'", long5 == 1698467901050L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698467899511L, (long) (byte) 10, 32L);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698467898170L, (long) (short) 10, 1698467900999L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 0L, (long) '#', (long) 1);
        java.lang.constant.Constable constable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = constableInMemoryCounter4.increment(constable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) '4', 1698467899615L);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient24 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter28 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient24, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter28.getClass();
        long long31 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass29, (long) (short) 0);
        long long32 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long31);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 1);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) true);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass6 = inMemoryClock5.getClass();
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass6, 1L);
        long long10 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0f), 1698467898223L);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient16 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter20 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient16, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass21 = constableInMemoryCounter20.getClass();
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass21);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient23 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter27 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient23, (long) '#', 1L, (long) (byte) -1);
        long long30 = constableInMemoryCounter27.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient31 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter35 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient31, (long) '#', 1L, (long) (byte) -1);
        long long37 = constableInMemoryCounter35.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient38, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass43 = constableInMemoryCounter42.getClass();
        long long45 = constableInMemoryCounter35.increment((java.lang.constant.Constable) wildcardClass43, (long) (short) 0);
        long long47 = constableInMemoryCounter35.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass48 = constableInMemoryCounter35.getClass();
        long long50 = constableInMemoryCounter27.increment((java.lang.constant.Constable) wildcardClass48, (long) 100);
        long long51 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass48);
        org.junit.Assert.assertNotNull(inMemoryClock5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467898223L + "'", long13 == 1698467898223L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898654L, 1698467898597L, 52L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900366L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467900209L, 1698467928L, 1698467900155L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) ' ');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient24 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter28 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient24, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter28.getClass();
        long long31 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass29, (long) (short) 0);
        long long33 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient34 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter38 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient34, (long) '#', 1L, (long) (byte) -1);
        long long40 = constableInMemoryCounter38.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient41 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter45 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient41, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass46 = constableInMemoryCounter45.getClass();
        long long48 = constableInMemoryCounter38.increment((java.lang.constant.Constable) wildcardClass46, (long) (short) 0);
        long long49 = constableInMemoryCounter21.increment((java.lang.constant.Constable) long48);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient50 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter54 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient50, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass55 = charSequenceInMemoryCounter54.getClass();
        long long56 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass55);
        java.lang.Class<?> wildcardClass57 = constableInMemoryCounter21.getClass();
        long long58 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass57);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient59 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter63 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient59, (long) '#', 1L, (long) (byte) -1);
        long long66 = constableInMemoryCounter63.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock67 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass68 = inMemoryClock67.getClass();
        long long70 = constableInMemoryCounter63.increment((java.lang.constant.Constable) wildcardClass68, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock71 = hu.chengming.util.InMemoryClock.getInstance();
        long long72 = inMemoryClock71.currentTimestamp();
        long long73 = inMemoryClock71.currentTimestamp();
        java.lang.Class<?> wildcardClass74 = inMemoryClock71.getClass();
        long long75 = constableInMemoryCounter63.increment((java.lang.constant.Constable) wildcardClass74);
        hu.chengming.util.InMemoryClock inMemoryClock76 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass77 = inMemoryClock76.getClass();
        long long79 = constableInMemoryCounter63.increment((java.lang.constant.Constable) wildcardClass77, (long) (-1));
        long long80 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long79);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 10L + "'", long66 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock71);
// flaky:         org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1698467901L + "'", long72 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1698467901L + "'", long73 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + (-1L) + "'", long79 == (-1L));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (byte) -1, (-1L), (long) '4');
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 32L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899992L, 1698467899403L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467899403L + "'", long9 == 1698467899403L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698467899938L, 32L, 1698467896L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467900420L, 100L, 1698467898170L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901320L + "'", long1 == 1698467901320L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901320L + "'", long2 == 1698467901320L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901320L + "'", long5 == 1698467901320L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901320L + "'", long6 == 1698467901320L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901320L + "'", long7 == 1698467901320L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock7 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass8 = inMemoryClock7.getClass();
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass8);
        hu.chengming.util.InMemoryClock inMemoryClock10 = hu.chengming.util.InMemoryClock.getInstance();
        long long11 = inMemoryClock10.currentTimestamp();
        long long12 = inMemoryClock10.currentTimestamp();
        long long13 = inMemoryClock10.currentTimestamp();
        long long14 = inMemoryClock10.currentTimeMillis();
        java.lang.Class<?> wildcardClass15 = inMemoryClock10.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, 1698467898652L);
        java.lang.constant.Constable constable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = constableInMemoryCounter4.increment(constable21, 1698467898758L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467901L + "'", long11 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467901L + "'", long12 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467901L + "'", long13 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467901320L + "'", long14 == 1698467901320L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698467898654L + "'", long20 == 1698467898654L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897743L, (long) (short) 1);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898L, (long) (byte) 10);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 10L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, (long) '#', 1L, (long) (byte) -1);
        long long21 = constableInMemoryCounter19.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass27 = constableInMemoryCounter26.getClass();
        long long29 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass27, (long) (short) 0);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient30 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter34 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient30, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass35 = constableInMemoryCounter34.getClass();
        long long36 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass35);
        long long38 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass35, (long) (byte) 100);
        long long41 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898546L, 0L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient42 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter46 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient42, (long) '#', 1L, (long) (byte) -1);
        long long48 = constableInMemoryCounter46.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient49 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter53 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient49, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass54 = constableInMemoryCounter53.getClass();
        long long56 = constableInMemoryCounter46.increment((java.lang.constant.Constable) wildcardClass54, (long) (short) 0);
        long long58 = constableInMemoryCounter46.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient59 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter63 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient59, (long) '#', 1L, (long) (byte) -1);
        long long65 = constableInMemoryCounter63.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient66 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter70 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient66, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass71 = constableInMemoryCounter70.getClass();
        long long73 = constableInMemoryCounter63.increment((java.lang.constant.Constable) wildcardClass71, (long) (short) 0);
        long long74 = constableInMemoryCounter46.increment((java.lang.constant.Constable) long73);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient75 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter79 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient75, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass80 = charSequenceInMemoryCounter79.getClass();
        long long81 = constableInMemoryCounter46.increment((java.lang.constant.Constable) wildcardClass80);
        java.lang.Class<?> wildcardClass82 = constableInMemoryCounter46.getClass();
        long long83 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass82);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 101L + "'", long83 == 101L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898170L, 1698467901050L, (long) 'a');
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901320L, 1698467896L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467896L + "'", long7 == 1698467896L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467899723L, 1698467900944L, 1698467901050L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long15 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient16 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter20 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient16, (long) '#', 1L, (long) (byte) -1);
        long long22 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient23 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter27 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient23, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass28 = constableInMemoryCounter27.getClass();
        long long30 = constableInMemoryCounter20.increment((java.lang.constant.Constable) wildcardClass28, (long) (short) 0);
        long long32 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter20.getClass();
        long long35 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass33, (long) 100);
        long long36 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass33);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient37 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter41 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient37, (long) '#', 1L, (long) (byte) -1);
        long long44 = constableInMemoryCounter41.increment((java.lang.constant.Constable) (short) 0, 0L);
        java.lang.Class<?> wildcardClass45 = constableInMemoryCounter41.getClass();
        long long47 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass45, (long) 1);
        java.lang.Class<?> wildcardClass48 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 2L + "'", long47 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0);
        long long24 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898331L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467901L + "'", long13 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467901L + "'", long14 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>> constableInMemoryCounterInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>>(inMemoryCounterPersistClient0, 1698467899081L, 1698467899186L, 1698467899240L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 0, 100L, (long) (byte) 0);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1L, (long) 'a', 1698467898331L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) -1, 1698467900155L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900155L + "'", long9 == 1698467900155L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass6 = inMemoryClock5.getClass();
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass6, 1L);
        long long10 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0f), 1698467898223L);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) '#', 1698467898331L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock24 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass25 = inMemoryClock24.getClass();
        long long26 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass25);
        hu.chengming.util.InMemoryClock inMemoryClock27 = hu.chengming.util.InMemoryClock.getInstance();
        long long28 = inMemoryClock27.currentTimestamp();
        long long29 = inMemoryClock27.currentTimestamp();
        long long30 = inMemoryClock27.currentTimestamp();
        long long31 = inMemoryClock27.currentTimeMillis();
        java.lang.Class<?> wildcardClass32 = inMemoryClock27.getClass();
        long long33 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass32);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long33, (long) (short) 0);
        long long37 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) -1);
        org.junit.Assert.assertNotNull(inMemoryClock5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467898223L + "'", long13 == 1698467898223L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698467898331L + "'", long16 == 1698467898331L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467901L + "'", long28 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1698467901L + "'", long29 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1698467901L + "'", long30 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1698467901478L + "'", long31 == 1698467901478L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898170L, 1698467897798L, 1698467897798L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898867L);
        java.lang.Class<?> wildcardClass7 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        java.lang.Class<?> wildcardClass15 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897743L, (long) (short) 1);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898L, (long) (byte) 10);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901050L, 1698467900102L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient16 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter20 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient16, 1698467897071L, (long) (byte) 10, 0L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient21 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter25 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient21, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass26 = constableInMemoryCounter25.getClass();
        long long28 = constableInMemoryCounter20.increment((java.lang.constant.Constable) wildcardClass26, 1698467897071L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter20.getClass();
        long long30 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass29);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698467900102L + "'", long15 == 1698467900102L);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467897071L + "'", long28 == 1698467897071L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901532L + "'", long1 == 1698467901532L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901L + "'", long2 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901532L + "'", long3 == 1698467901532L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901532L + "'", long4 == 1698467901532L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901532L + "'", long5 == 1698467901532L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901532L + "'", long6 == 1698467901532L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901L + "'", long7 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock7 = hu.chengming.util.InMemoryClock.getInstance();
        long long8 = inMemoryClock7.currentTimestamp();
        long long9 = inMemoryClock7.currentTimestamp();
        java.lang.Class<?> wildcardClass10 = inMemoryClock7.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897743L, (long) (short) 1);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898L, (long) (byte) 10);
        java.lang.Class<?> wildcardClass13 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0d);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimeMillis();
        long long14 = inMemoryClock12.currentTimeMillis();
        long long15 = inMemoryClock12.currentTimestamp();
        long long16 = inMemoryClock12.currentTimestamp();
        long long17 = inMemoryClock12.currentTimeMillis();
        long long18 = inMemoryClock12.currentTimeMillis();
        long long19 = inMemoryClock12.currentTimestamp();
        long long20 = inMemoryClock12.currentTimeMillis();
        long long21 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass22 = inMemoryClock12.getClass();
        long long24 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass22, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467901587L + "'", long13 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467901587L + "'", long14 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698467901L + "'", long15 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698467901L + "'", long16 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1698467901587L + "'", long17 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698467901587L + "'", long18 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1698467901L + "'", long19 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698467901587L + "'", long20 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698467901L + "'", long21 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        long long6 = inMemoryClock5.currentTimeMillis();
        long long7 = inMemoryClock5.currentTimeMillis();
        long long8 = inMemoryClock5.currentTimestamp();
        long long9 = inMemoryClock5.currentTimestamp();
        long long10 = inMemoryClock5.currentTimeMillis();
        java.lang.Class<?> wildcardClass11 = inMemoryClock5.getClass();
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass11);
        java.lang.constant.Constable constable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = constableInMemoryCounter4.increment(constable13, 2L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(inMemoryClock5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901587L + "'", long6 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901587L + "'", long7 == 1698467901587L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467901587L + "'", long10 == 1698467901587L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        java.lang.constant.Constable constable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = constableInMemoryCounter4.increment(constable23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467901L + "'", long13 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467901L + "'", long14 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1698467898867L, 1698467901532L, 1698467899L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901L + "'", long1 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901L + "'", long2 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901642L + "'", long4 == 1698467901642L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901642L + "'", long5 == 1698467901642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901642L + "'", long6 == 1698467901642L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) ' ', 0L, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass17, (long) (short) 0);
        long long21 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long28 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass34 = constableInMemoryCounter33.getClass();
        long long36 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass34, (long) (short) 0);
        long long37 = constableInMemoryCounter9.increment((java.lang.constant.Constable) long36);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient38, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass43 = charSequenceInMemoryCounter42.getClass();
        long long44 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass43);
        long long45 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long44);
        long long47 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100L);
        java.lang.Class<?> wildcardClass48 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
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
        long long10 = inMemoryClock0.currentTimestamp();
        long long11 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901642L + "'", long1 == 1698467901642L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901642L + "'", long2 == 1698467901642L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901642L + "'", long5 == 1698467901642L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901642L + "'", long6 == 1698467901642L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901L + "'", long7 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467901L + "'", long10 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467901642L + "'", long11 == 1698467901642L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898170L, 1698467897798L, 1698467897798L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901L, 1698467900262L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900262L + "'", long9 == 1698467900262L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, (long) '#', 1L, (long) (byte) -1);
        long long22 = constableInMemoryCounter19.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long26 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass24, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock27 = hu.chengming.util.InMemoryClock.getInstance();
        long long28 = inMemoryClock27.currentTimestamp();
        long long29 = inMemoryClock27.currentTimestamp();
        java.lang.Class<?> wildcardClass30 = inMemoryClock27.getClass();
        long long31 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass30);
        hu.chengming.util.InMemoryClock inMemoryClock32 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass33 = inMemoryClock32.getClass();
        long long35 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass33, (long) (-1));
        long long37 = constableInMemoryCounter19.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock38 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass39 = inMemoryClock38.getClass();
        long long40 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass39);
        long long41 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long40);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467901L + "'", long28 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1698467901L + "'", long29 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, 1698467900047L, 1698467900525L, 10L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 0, 100L, (long) (byte) 0);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896965L, 1698467899511L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467899511L + "'", long7 == 1698467899511L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899081L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0.0f, 1698467900262L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467900262L + "'", long9 == 1698467900262L);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) ' ', 0L, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass17, (long) (short) 0);
        long long21 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long28 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass34 = constableInMemoryCounter33.getClass();
        long long36 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass34, (long) (short) 0);
        long long37 = constableInMemoryCounter9.increment((java.lang.constant.Constable) long36);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient38, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass43 = charSequenceInMemoryCounter42.getClass();
        long long44 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass43);
        long long45 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long44);
        long long47 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100L);
        long long50 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898652L, 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467901426L, 1698467898276L, (long) (short) -1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 100, 1698467898170L, 1698467898170L);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) -1, (-1L));
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient12, 100L, 1698467897798L, 100L);
        java.lang.Class<?> wildcardClass17 = strInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass17, (long) (-1));
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, 10L, (long) (short) 10, 1698467899L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient25 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter29 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient25, 100L, 1698467897798L, 100L);
        java.lang.Class<?> wildcardClass30 = strInMemoryCounter29.getClass();
        long long31 = constableInMemoryCounter24.increment((java.lang.constant.Constable) wildcardClass30);
        long long33 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long31, 1698467899459L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1698467899459L + "'", long33 == 1698467899459L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (byte) -1, (-1L), (long) '4');
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896965L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, (long) (byte) -1, (-1L), (long) '4');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, (long) '#', 1L, (long) (byte) -1);
        long long18 = constableInMemoryCounter16.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient19 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter23 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient19, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass24 = constableInMemoryCounter23.getClass();
        long long26 = constableInMemoryCounter16.increment((java.lang.constant.Constable) wildcardClass24, (long) (short) 0);
        long long28 = constableInMemoryCounter16.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter16.getClass();
        long long31 = constableInMemoryCounter11.increment((java.lang.constant.Constable) wildcardClass29, (long) (byte) -1);
        java.lang.Class<?> wildcardClass32 = constableInMemoryCounter11.getClass();
        long long33 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 32L, 1698467898919L, (long) 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) false, 0L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient13 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter17 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient13, (long) '#', 1L, (long) (byte) -1);
        long long19 = constableInMemoryCounter17.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter24.getClass();
        long long27 = constableInMemoryCounter17.increment((java.lang.constant.Constable) wildcardClass25, (long) (short) 0);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient28 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter32 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient28, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter32.getClass();
        long long34 = constableInMemoryCounter17.increment((java.lang.constant.Constable) wildcardClass33);
        long long36 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long34, 2L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient37 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter41 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient37, (long) '#', 1L, (long) (byte) -1);
        long long44 = constableInMemoryCounter41.increment((java.lang.constant.Constable) (short) 0, 0L);
        java.lang.Class<?> wildcardClass45 = constableInMemoryCounter41.getClass();
        long long47 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass45, 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3L + "'", long36 == 3L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467901478L, 1698467900209L, 1698467900525L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass6 = inMemoryClock5.getClass();
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass6, 1L);
        long long10 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0f), 1698467898223L);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) '#', 1698467898331L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock24 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass25 = inMemoryClock24.getClass();
        long long26 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass25);
        hu.chengming.util.InMemoryClock inMemoryClock27 = hu.chengming.util.InMemoryClock.getInstance();
        long long28 = inMemoryClock27.currentTimestamp();
        long long29 = inMemoryClock27.currentTimestamp();
        long long30 = inMemoryClock27.currentTimestamp();
        long long31 = inMemoryClock27.currentTimeMillis();
        java.lang.Class<?> wildcardClass32 = inMemoryClock27.getClass();
        long long33 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass32);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long33, (long) (short) 0);
        long long38 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899295L, (long) (short) 0);
        org.junit.Assert.assertNotNull(inMemoryClock5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467898223L + "'", long13 == 1698467898223L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698467898331L + "'", long16 == 1698467898331L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467901L + "'", long28 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1698467901L + "'", long29 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1698467901L + "'", long30 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1698467901804L + "'", long31 == 1698467901804L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900102L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
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
        long long10 = inMemoryClock0.currentTimestamp();
        long long11 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901854L + "'", long1 == 1698467901854L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901854L + "'", long2 == 1698467901854L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901854L + "'", long5 == 1698467901854L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901854L + "'", long6 == 1698467901854L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901L + "'", long7 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467901L + "'", long10 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467901L + "'", long11 == 1698467901L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, (long) '#', 1L, (long) (byte) -1);
        long long22 = constableInMemoryCounter19.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long26 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass24, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock27 = hu.chengming.util.InMemoryClock.getInstance();
        long long28 = inMemoryClock27.currentTimestamp();
        long long29 = inMemoryClock27.currentTimestamp();
        java.lang.Class<?> wildcardClass30 = inMemoryClock27.getClass();
        long long31 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass30);
        long long32 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long31);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899992L, 1698467899938L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467901L + "'", long28 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1698467901L + "'", long29 == 1698467901L);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1698467899938L + "'", long35 == 1698467899938L);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901906L + "'", long1 == 1698467901906L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901L + "'", long2 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901906L + "'", long4 == 1698467901906L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901L + "'", long5 == 1698467901L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) false, 0L);
        java.lang.constant.Constable constable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = constableInMemoryCounter4.increment(constable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467901320L, 1698467901532L, 1698467900155L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.Type> typeInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.Type>(inMemoryCounterPersistClient0, 1698467900155L, 1698467901478L, (long) (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor> typeDescriptorInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor>(inMemoryCounterPersistClient0, 100L, 1698467899L, 1698467897071L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L, 32L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899828L, 1698467897743L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467897743L + "'", long12 == 1698467897743L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901957L + "'", long1 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901L + "'", long2 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901957L + "'", long3 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901957L + "'", long4 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901957L + "'", long5 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901957L + "'", long6 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901957L + "'", long7 == 1698467901957L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901957L + "'", long1 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901L + "'", long2 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901L + "'", long5 == 1698467901L);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
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
        long long10 = inMemoryClock0.currentTimeMillis();
        long long11 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901957L + "'", long1 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901957L + "'", long2 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901957L + "'", long5 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901957L + "'", long6 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901L + "'", long7 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901L + "'", long8 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467901957L + "'", long10 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467901L + "'", long11 == 1698467901L);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        long long11 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467901957L + "'", long1 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467901957L + "'", long2 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467901L + "'", long3 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467901L + "'", long4 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467901957L + "'", long5 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467901957L + "'", long6 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901957L + "'", long7 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467901957L + "'", long8 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901L + "'", long9 == 1698467901L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467901957L + "'", long10 == 1698467901957L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467901957L + "'", long11 == 1698467901957L);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467896L, 1698467896965L, 0L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899828L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, (long) (byte) 0, (long) (byte) -1, 0L);
        java.lang.Class<?> wildcardClass5 = serializableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock> inMemoryClockInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<hu.chengming.util.InMemoryClock>(inMemoryCounterPersistClient0, 1698467901050L, 1698467898972L, 1698467899564L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>> strComparableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Comparable<java.lang.String>>(inMemoryCounterPersistClient0, 1698467900420L, (long) 100, 1698467898170L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor> typeDescriptorInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor>(inMemoryCounterPersistClient0, 1698467899081L, 1698467897743L, 1698467896965L);
        java.lang.Class<?> wildcardClass5 = typeDescriptorInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902009L + "'", long2 == 1698467902009L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902009L + "'", long4 == 1698467902009L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902009L + "'", long5 == 1698467902009L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902064L + "'", long2 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902064L + "'", long4 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902064L + "'", long5 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902064L + "'", long8 == 1698467902064L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 100, 1698467900892L, 1698467898276L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902064L + "'", long1 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902L + "'", long2 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902064L + "'", long4 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902064L + "'", long5 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902064L + "'", long6 == 1698467902064L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902115L + "'", long1 == 1698467902115L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902L + "'", long2 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902115L + "'", long4 == 1698467902115L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902115L + "'", long5 == 1698467902115L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902115L + "'", long7 == 1698467902115L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902L + "'", long8 == 1698467902L);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient12, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = serializableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass17, (long) ' ');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, (long) '#', 1L, (long) (byte) -1);
        long long27 = constableInMemoryCounter24.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long29 = constableInMemoryCounter24.increment((java.lang.constant.Constable) 1L);
        long long31 = constableInMemoryCounter24.increment((java.lang.constant.Constable) (short) 1);
        java.lang.Class<?> wildcardClass32 = constableInMemoryCounter24.getClass();
        long long34 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass32, 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient35 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter39 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient35, (long) '#', 1L, (long) (byte) -1);
        long long41 = constableInMemoryCounter39.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock42 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass43 = inMemoryClock42.getClass();
        long long44 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass43);
        hu.chengming.util.InMemoryClock inMemoryClock45 = hu.chengming.util.InMemoryClock.getInstance();
        long long46 = inMemoryClock45.currentTimestamp();
        long long47 = inMemoryClock45.currentTimestamp();
        long long48 = inMemoryClock45.currentTimestamp();
        long long49 = inMemoryClock45.currentTimeMillis();
        java.lang.Class<?> wildcardClass50 = inMemoryClock45.getClass();
        long long51 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass50);
        hu.chengming.util.InMemoryClock inMemoryClock52 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass53 = inMemoryClock52.getClass();
        long long55 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass53, 1698467898652L);
        long long56 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long55);
        long long58 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898972L);
        java.lang.Class<?> wildcardClass59 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1698467928L + "'", long34 == 1698467928L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1698467902L + "'", long46 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1698467902L + "'", long47 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1698467902L + "'", long48 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1698467902115L + "'", long49 == 1698467902115L);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1698467898654L + "'", long55 == 1698467898654L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) ' ', 0L, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass17, (long) (short) 0);
        long long21 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long28 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass34 = constableInMemoryCounter33.getClass();
        long long36 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass34, (long) (short) 0);
        long long37 = constableInMemoryCounter9.increment((java.lang.constant.Constable) long36);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient38, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass43 = charSequenceInMemoryCounter42.getClass();
        long long44 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass43);
        long long45 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long44);
        long long47 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient48 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter52 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient48, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass53 = charSequenceInMemoryCounter52.getClass();
        long long55 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass53, (long) '#');
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 35L + "'", long55 == 35L);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900999L);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898597L, 1698467898758L, 1698467899295L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass6 = inMemoryClock5.getClass();
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass6, 1L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient9 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter13 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient9, (-1L), 32L, 1698467897071L);
        hu.chengming.util.InMemoryClock inMemoryClock14 = hu.chengming.util.InMemoryClock.getInstance();
        long long15 = inMemoryClock14.currentTimeMillis();
        long long16 = inMemoryClock14.currentTimeMillis();
        long long17 = inMemoryClock14.currentTimestamp();
        long long18 = inMemoryClock14.currentTimestamp();
        long long19 = inMemoryClock14.currentTimeMillis();
        java.lang.Class<?> wildcardClass20 = inMemoryClock14.getClass();
        long long22 = constableInMemoryCounter13.increment((java.lang.constant.Constable) wildcardClass20, 1698467896643L);
        long long23 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass20);
        org.junit.Assert.assertNotNull(inMemoryClock5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698467902115L + "'", long15 == 1698467902115L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1698467902115L + "'", long16 == 1698467902115L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1698467902L + "'", long17 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698467902L + "'", long18 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1698467902115L + "'", long19 == 1698467902115L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1698467896643L + "'", long22 == 1698467896643L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898223L, 1698467900839L, 1698467898867L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467900155L, 1698467900839L, 1698467901957L);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0d);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) 100);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 0, 100L, (long) (byte) 0);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900155L);
        java.lang.Class<?> wildcardClass7 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (-1L), 32L, 1698467897071L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        long long6 = inMemoryClock5.currentTimestamp();
        long long7 = inMemoryClock5.currentTimestamp();
        long long8 = inMemoryClock5.currentTimeMillis();
        java.lang.Class<?> wildcardClass9 = inMemoryClock5.getClass();
        long long10 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9);
        org.junit.Assert.assertNotNull(inMemoryClock5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902221L + "'", long8 == 1698467902221L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467900262L, 1698467900632L, 1698467900209L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long15 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient16 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter20 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient16, (long) '#', 1L, (long) (byte) -1);
        long long22 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient23 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter27 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient23, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass28 = constableInMemoryCounter27.getClass();
        long long30 = constableInMemoryCounter20.increment((java.lang.constant.Constable) wildcardClass28, (long) (short) 0);
        long long32 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter20.getClass();
        long long35 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass33, (long) 100);
        long long36 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass33);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient37 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter41 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient37, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass42 = charSequenceInMemoryCounter41.getClass();
        long long43 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass42);
        long long46 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 'a', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2L + "'", long43 == 2L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimestamp();
        long long9 = inMemoryClock0.currentTimeMillis();
        long long10 = inMemoryClock0.currentTimestamp();
        long long11 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902221L + "'", long1 == 1698467902221L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902221L + "'", long2 == 1698467902221L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902221L + "'", long5 == 1698467902221L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902221L + "'", long6 == 1698467902221L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902L + "'", long8 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467902221L + "'", long9 == 1698467902221L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467902L + "'", long10 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467902221L + "'", long11 == 1698467902221L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467901215L, (long) (byte) 10, 1698467899295L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) true, 1698467900999L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467902064L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467900999L + "'", long7 == 1698467900999L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass24);
        long long28 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899L, 1698467899L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, (long) '#', 1L, (long) (byte) -1);
        long long35 = constableInMemoryCounter33.increment((java.lang.constant.Constable) 1);
        long long37 = constableInMemoryCounter33.increment((java.lang.constant.Constable) 0L);
        long long40 = constableInMemoryCounter33.increment((java.lang.constant.Constable) (short) -1, (-1L));
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient41 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter45 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient41, 100L, 1698467897798L, 100L);
        java.lang.Class<?> wildcardClass46 = strInMemoryCounter45.getClass();
        long long48 = constableInMemoryCounter33.increment((java.lang.constant.Constable) wildcardClass46, (long) (-1));
        long long50 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass46, 1698467901478L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467902L + "'", long13 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467902L + "'", long14 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1698467899L + "'", long28 == 1698467899L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1698467901478L + "'", long50 == 1698467901478L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898331L, (long) 0, 1698467898L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, (long) '#', 1L, (long) (byte) -1);
        long long18 = constableInMemoryCounter16.increment((java.lang.constant.Constable) 1);
        java.lang.Class<?> wildcardClass19 = constableInMemoryCounter16.getClass();
        long long21 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass19, 1698467899669L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698467899669L + "'", long21 == 1698467899669L);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467899511L, 1698467898223L, 1698467898L);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467897743L, 1698467898652L, 1698467898L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1L), 1698467901642L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901642L + "'", long7 == 1698467901642L);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898223L, 1698467898597L, 1698467897743L);
        java.lang.constant.Constable constable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = constableInMemoryCounter4.increment(constable5, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L, 32L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
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
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimestamp();
        long long10 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902326L + "'", long1 == 1698467902326L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902326L + "'", long2 == 1698467902326L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902326L + "'", long5 == 1698467902326L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902326L + "'", long6 == 1698467902326L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902326L + "'", long8 == 1698467902326L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467902L + "'", long9 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467902326L + "'", long10 == 1698467902326L);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient12, (long) (short) -1, (long) (short) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = serializableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass17, (long) ' ');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, (long) '#', 1L, (long) (byte) -1);
        long long27 = constableInMemoryCounter24.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long29 = constableInMemoryCounter24.increment((java.lang.constant.Constable) 1L);
        long long31 = constableInMemoryCounter24.increment((java.lang.constant.Constable) (short) 1);
        java.lang.Class<?> wildcardClass32 = constableInMemoryCounter24.getClass();
        long long34 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass32, 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient35 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter39 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient35, (long) '#', 1L, (long) (byte) -1);
        long long41 = constableInMemoryCounter39.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock42 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass43 = inMemoryClock42.getClass();
        long long44 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass43);
        hu.chengming.util.InMemoryClock inMemoryClock45 = hu.chengming.util.InMemoryClock.getInstance();
        long long46 = inMemoryClock45.currentTimestamp();
        long long47 = inMemoryClock45.currentTimestamp();
        long long48 = inMemoryClock45.currentTimestamp();
        long long49 = inMemoryClock45.currentTimeMillis();
        java.lang.Class<?> wildcardClass50 = inMemoryClock45.getClass();
        long long51 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass50);
        hu.chengming.util.InMemoryClock inMemoryClock52 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass53 = inMemoryClock52.getClass();
        long long55 = constableInMemoryCounter39.increment((java.lang.constant.Constable) wildcardClass53, 1698467898652L);
        long long56 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long55);
        long long59 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900733L, (long) (short) -1);
        java.lang.constant.Constable constable60 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long61 = constableInMemoryCounter4.increment(constable60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1698467928L + "'", long34 == 1698467928L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1698467902L + "'", long46 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1698467902L + "'", long47 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1698467902L + "'", long48 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1698467902381L + "'", long49 == 1698467902381L);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2L + "'", long51 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1698467898654L + "'", long55 == 1698467898654L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L, 32L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899992L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) 0, 100L, (long) (byte) 0);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900155L);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900314L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, (long) (short) 0, 1698467898652L);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902381L + "'", long1 == 1698467902381L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902L + "'", long2 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902381L + "'", long5 == 1698467902381L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902381L + "'", long6 == 1698467902381L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898170L, 1698467901050L, (long) 'a');
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902432L + "'", long1 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902432L + "'", long2 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902432L + "'", long3 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock7 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass8 = inMemoryClock7.getClass();
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass8);
        hu.chengming.util.InMemoryClock inMemoryClock10 = hu.chengming.util.InMemoryClock.getInstance();
        long long11 = inMemoryClock10.currentTimestamp();
        long long12 = inMemoryClock10.currentTimestamp();
        long long13 = inMemoryClock10.currentTimestamp();
        long long14 = inMemoryClock10.currentTimeMillis();
        java.lang.Class<?> wildcardClass15 = inMemoryClock10.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, 1698467898652L);
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467902273L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1698467902L + "'", long11 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467902L + "'", long12 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467902L + "'", long13 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467902432L + "'", long14 == 1698467902432L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698467898654L + "'", long20 == 1698467898654L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902432L + "'", long2 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902L + "'", long5 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902432L + "'", long7 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902432L + "'", long8 == 1698467902432L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467897071L, (long) (byte) 10, 0L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass10 = constableInMemoryCounter9.getClass();
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass10, 1698467897071L);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897071L, 1698467900525L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467897071L + "'", long12 == 1698467897071L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698467900525L + "'", long15 == 1698467900525L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass6 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902L + "'", long2 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902432L + "'", long3 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902432L + "'", long4 == 1698467902432L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902L + "'", long5 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 100L, (long) (short) 1, 1698467898597L);
        java.lang.Class<?> wildcardClass5 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.io.Serializable> serializableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.io.Serializable>(inMemoryCounterPersistClient0, 1698467898170L, 0L, (long) (byte) 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock7 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass8 = inMemoryClock7.getClass();
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass8);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient10 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter14 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient10, (-1L), 32L, 1698467897071L);
        java.lang.Class<?> wildcardClass15 = constableInMemoryCounter14.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) (byte) -1, (-1L), (long) '4');
        java.lang.Class<?> wildcardClass22 = constableInMemoryCounter21.getClass();
        long long23 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass22);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 0L, 1698467900632L, 0L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        long long9 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902487L + "'", long1 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902L + "'", long2 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902487L + "'", long3 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902487L + "'", long4 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902487L + "'", long5 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902487L + "'", long6 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902487L + "'", long7 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902487L + "'", long8 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467902487L + "'", long9 == 1698467902487L);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902487L + "'", long1 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902487L + "'", long2 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902487L + "'", long5 == 1698467902487L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897743L, (long) (short) 1);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898L, (long) (byte) 10);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 10L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient15 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter19 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient15, (long) '#', 1L, (long) (byte) -1);
        long long21 = constableInMemoryCounter19.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass27 = constableInMemoryCounter26.getClass();
        long long29 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass27, (long) (short) 0);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient30 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter34 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient30, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass35 = constableInMemoryCounter34.getClass();
        long long36 = constableInMemoryCounter19.increment((java.lang.constant.Constable) wildcardClass35);
        long long38 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass35, (long) (byte) 100);
        long long41 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 100, 1698467898652L);
        long long43 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467902064L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1698467898652L + "'", long41 == 1698467898652L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902543L + "'", long1 == 1698467902543L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902543L + "'", long2 == 1698467902543L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902L + "'", long5 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass12 = constableInMemoryCounter11.getClass();
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass12, (long) (short) 0);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient24 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter28 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient24, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter28.getClass();
        long long31 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass29, (long) (short) 0);
        long long32 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long31);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0d), (long) '4');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient36 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter40 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient36, (-1L), 32L, 1698467897071L);
        hu.chengming.util.InMemoryClock inMemoryClock41 = hu.chengming.util.InMemoryClock.getInstance();
        long long42 = inMemoryClock41.currentTimeMillis();
        long long43 = inMemoryClock41.currentTimeMillis();
        long long44 = inMemoryClock41.currentTimestamp();
        long long45 = inMemoryClock41.currentTimestamp();
        long long46 = inMemoryClock41.currentTimeMillis();
        java.lang.Class<?> wildcardClass47 = inMemoryClock41.getClass();
        long long49 = constableInMemoryCounter40.increment((java.lang.constant.Constable) wildcardClass47, 1698467896643L);
        long long51 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long49, (-1L));
        long long54 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899081L, 1698467898654L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertNotNull(inMemoryClock41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1698467902543L + "'", long42 == 1698467902543L);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1698467902543L + "'", long43 == 1698467902543L);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1698467902L + "'", long44 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1698467902L + "'", long45 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1698467902543L + "'", long46 == 1698467902543L);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1698467896643L + "'", long49 == 1698467896643L);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1698467898654L + "'", long54 == 1698467898654L);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock7 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass8 = inMemoryClock7.getClass();
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass8);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901957L, 1698467901642L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467901642L + "'", long12 == 1698467901642L);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock5 = hu.chengming.util.InMemoryClock.getInstance();
        long long6 = inMemoryClock5.currentTimeMillis();
        long long7 = inMemoryClock5.currentTimeMillis();
        long long8 = inMemoryClock5.currentTimestamp();
        long long9 = inMemoryClock5.currentTimestamp();
        long long10 = inMemoryClock5.currentTimeMillis();
        java.lang.Class<?> wildcardClass11 = inMemoryClock5.getClass();
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass11);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899459L, 1L);
        java.lang.Class<?> wildcardClass16 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902543L + "'", long6 == 1698467902543L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902543L + "'", long7 == 1698467902543L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902L + "'", long8 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467902L + "'", long9 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1698467902543L + "'", long10 == 1698467902543L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902597L + "'", long1 == 1698467902597L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902597L + "'", long2 == 1698467902597L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902597L + "'", long3 == 1698467902597L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902597L + "'", long4 == 1698467902597L);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902597L + "'", long2 == 1698467902597L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902597L + "'", long3 == 1698467902597L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) -1);
        java.lang.Class<?> wildcardClass7 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 1, 52L, 100L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467928L, 1698467899669L);
        java.lang.Class<?> wildcardClass8 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467899669L + "'", long7 == 1698467899669L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902649L + "'", long2 == 1698467902649L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902649L + "'", long4 == 1698467902649L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902649L + "'", long5 == 1698467902649L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902649L + "'", long6 == 1698467902649L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902649L + "'", long8 == 1698467902649L);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897743L, (long) (short) 1);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898652L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) ' ', 0L, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter16.getClass();
        long long19 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass17, (long) (short) 0);
        long long21 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long28 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass34 = constableInMemoryCounter33.getClass();
        long long36 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass34, (long) (short) 0);
        long long37 = constableInMemoryCounter9.increment((java.lang.constant.Constable) long36);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient38, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass43 = charSequenceInMemoryCounter42.getClass();
        long long44 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass43);
        long long45 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long44);
        long long47 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100L);
        long long49 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass18 = inMemoryClock17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, (long) (-1));
        long long22 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467897798L);
        hu.chengming.util.InMemoryClock inMemoryClock23 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass24 = inMemoryClock23.getClass();
        long long25 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467902L + "'", long13 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467902L + "'", long14 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long15 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient16 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter20 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient16, (long) '#', 1L, (long) (byte) -1);
        long long22 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient23 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter27 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient23, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass28 = constableInMemoryCounter27.getClass();
        long long30 = constableInMemoryCounter20.increment((java.lang.constant.Constable) wildcardClass28, (long) (short) 0);
        long long32 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter20.getClass();
        long long35 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass33, (long) 100);
        long long36 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass33);
        java.lang.Class<?> wildcardClass37 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimeMillis();
        long long7 = inMemoryClock0.currentTimestamp();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902704L + "'", long2 == 1698467902704L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902704L + "'", long4 == 1698467902704L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902704L + "'", long5 == 1698467902704L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902704L + "'", long6 == 1698467902704L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902L + "'", long7 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) false, 0L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient13 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter17 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient13, (long) '#', 1L, (long) (byte) -1);
        long long19 = constableInMemoryCounter17.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter24.getClass();
        long long27 = constableInMemoryCounter17.increment((java.lang.constant.Constable) wildcardClass25, (long) (short) 0);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient28 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter32 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient28, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter32.getClass();
        long long34 = constableInMemoryCounter17.increment((java.lang.constant.Constable) wildcardClass33);
        long long36 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long34, 2L);
        long long39 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899240L, (long) 0);
        java.lang.Class<?> wildcardClass40 = constableInMemoryCounter4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 3L + "'", long36 == 3L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1);
        long long8 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 10.0f);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 100, 2L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient12 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter16 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient12, (long) '#', 1L, (long) (byte) -1);
        long long18 = constableInMemoryCounter16.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient19 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter23 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient19, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass24 = constableInMemoryCounter23.getClass();
        long long26 = constableInMemoryCounter16.increment((java.lang.constant.Constable) wildcardClass24, (long) (short) 0);
        long long28 = constableInMemoryCounter16.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient29 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter33 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient29, (long) '#', 1L, (long) (byte) -1);
        long long35 = constableInMemoryCounter33.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient36 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter40 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient36, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass41 = constableInMemoryCounter40.getClass();
        long long43 = constableInMemoryCounter33.increment((java.lang.constant.Constable) wildcardClass41, (long) (short) 0);
        long long44 = constableInMemoryCounter16.increment((java.lang.constant.Constable) long43);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient45 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter49 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient45, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass50 = charSequenceInMemoryCounter49.getClass();
        long long51 = constableInMemoryCounter16.increment((java.lang.constant.Constable) wildcardClass50);
        java.lang.Class<?> wildcardClass52 = constableInMemoryCounter16.getClass();
        long long53 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass52);
        long long56 = constableInMemoryCounter4.increment((java.lang.constant.Constable) '4', 1698467901215L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1698467901215L + "'", long56 == 1698467901215L);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimestamp();
        long long2 = inMemoryClock0.currentTimeMillis();
        long long3 = inMemoryClock0.currentTimestamp();
        long long4 = inMemoryClock0.currentTimestamp();
        long long5 = inMemoryClock0.currentTimestamp();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        java.lang.Class<?> wildcardClass8 = inMemoryClock0.getClass();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902L + "'", long1 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902758L + "'", long2 == 1698467902758L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902L + "'", long3 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902L + "'", long4 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902L + "'", long5 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902758L + "'", long7 == 1698467902758L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) ' ');
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient17 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter21 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient17, (long) '#', 1L, (long) (byte) -1);
        long long23 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient24 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter28 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient24, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass29 = constableInMemoryCounter28.getClass();
        long long31 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass29, (long) (short) 0);
        long long33 = constableInMemoryCounter21.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient34 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter38 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient34, (long) '#', 1L, (long) (byte) -1);
        long long40 = constableInMemoryCounter38.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient41 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter45 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient41, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass46 = constableInMemoryCounter45.getClass();
        long long48 = constableInMemoryCounter38.increment((java.lang.constant.Constable) wildcardClass46, (long) (short) 0);
        long long49 = constableInMemoryCounter21.increment((java.lang.constant.Constable) long48);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient50 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter54 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient50, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass55 = charSequenceInMemoryCounter54.getClass();
        long long56 = constableInMemoryCounter21.increment((java.lang.constant.Constable) wildcardClass55);
        java.lang.Class<?> wildcardClass57 = constableInMemoryCounter21.getClass();
        long long58 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass57);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient59 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter63 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient59, (long) (short) -1, 1698467898331L, 0L);
        java.lang.Class<?> wildcardClass64 = genericDeclarationInMemoryCounter63.getClass();
        long long66 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass64, 1698467898867L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1698467898868L + "'", long66 == 1698467898868L);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898L, 1L, 1698467899403L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long11 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass13 = inMemoryClock12.getClass();
        long long14 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass13);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass13);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898170L, 1698467897798L, 1698467897798L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient7 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter11 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient7, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass13 = inMemoryClock12.getClass();
        long long15 = constableInMemoryCounter11.increment((java.lang.constant.Constable) wildcardClass13, 1L);
        long long17 = constableInMemoryCounter11.increment((java.lang.constant.Constable) 100);
        java.lang.Class<?> wildcardClass18 = constableInMemoryCounter11.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, 1698467898597L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698467898597L + "'", long20 == 1698467898597L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 0L, (long) (short) -1, 10L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) 100, 1698467899L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) '#', 1L, (long) (byte) -1);
        long long15 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient16 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter20 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient16, (long) '#', 1L, (long) (byte) -1);
        long long22 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient23 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter27 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient23, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass28 = constableInMemoryCounter27.getClass();
        long long30 = constableInMemoryCounter20.increment((java.lang.constant.Constable) wildcardClass28, (long) (short) 0);
        long long32 = constableInMemoryCounter20.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter20.getClass();
        long long35 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass33, (long) 100);
        long long38 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 0L, 0L);
        long long41 = constableInMemoryCounter12.increment((java.lang.constant.Constable) (byte) -1, (long) (byte) 100);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient42 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter46 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient42, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock47 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass48 = inMemoryClock47.getClass();
        long long50 = constableInMemoryCounter46.increment((java.lang.constant.Constable) wildcardClass48, 1L);
        long long52 = constableInMemoryCounter46.increment((java.lang.constant.Constable) 100);
        long long55 = constableInMemoryCounter46.increment((java.lang.constant.Constable) (-1.0f), 1698467898223L);
        long long57 = constableInMemoryCounter46.increment((java.lang.constant.Constable) (short) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient58 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter62 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient58, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass63 = constableInMemoryCounter62.getClass();
        long long64 = constableInMemoryCounter46.increment((java.lang.constant.Constable) wildcardClass63);
        long long65 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass63);
        long long66 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass63);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467899L + "'", long7 == 1698467899L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(inMemoryClock47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1698467898223L + "'", long55 == 1698467898223L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 101L + "'", long65 == 101L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467902326L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient10 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter14 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient10, (long) '#', 1L, (long) (byte) -1);
        long long16 = constableInMemoryCounter14.increment((java.lang.constant.Constable) 1);
        java.lang.Class<?> wildcardClass17 = constableInMemoryCounter14.getClass();
        long long18 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass17);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.String> strInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.String>(inMemoryCounterPersistClient0, 0L, 1698467899669L, (long) (short) 10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 0, 1698467898706L, 1698467900262L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467928L, (long) (byte) -1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient8 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter12 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient8, (long) ' ', 0L, 1698467898L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient13 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter17 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient13, (long) '#', 1L, (long) (byte) -1);
        long long19 = constableInMemoryCounter17.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient20 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter24 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient20, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass25 = constableInMemoryCounter24.getClass();
        long long27 = constableInMemoryCounter17.increment((java.lang.constant.Constable) wildcardClass25, (long) (short) 0);
        long long29 = constableInMemoryCounter17.increment((java.lang.constant.Constable) 1698467896L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient30 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter34 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient30, (long) '#', 1L, (long) (byte) -1);
        long long36 = constableInMemoryCounter34.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient37 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter41 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient37, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass42 = constableInMemoryCounter41.getClass();
        long long44 = constableInMemoryCounter34.increment((java.lang.constant.Constable) wildcardClass42, (long) (short) 0);
        long long45 = constableInMemoryCounter17.increment((java.lang.constant.Constable) long44);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient46 = null;
        hu.chengming.util.InMemoryCounter<java.lang.CharSequence> charSequenceInMemoryCounter50 = new hu.chengming.util.InMemoryCounter<java.lang.CharSequence>(inMemoryCounterPersistClient46, (long) (short) 0, 1L, (-1L));
        java.lang.Class<?> wildcardClass51 = charSequenceInMemoryCounter50.getClass();
        long long52 = constableInMemoryCounter17.increment((java.lang.constant.Constable) wildcardClass51);
        long long53 = constableInMemoryCounter12.increment((java.lang.constant.Constable) long52);
        long long55 = constableInMemoryCounter12.increment((java.lang.constant.Constable) 100L);
        hu.chengming.util.InMemoryClock inMemoryClock56 = hu.chengming.util.InMemoryClock.getInstance();
        long long57 = inMemoryClock56.currentTimeMillis();
        long long58 = inMemoryClock56.currentTimestamp();
        long long59 = inMemoryClock56.currentTimestamp();
        long long60 = inMemoryClock56.currentTimeMillis();
        long long61 = inMemoryClock56.currentTimeMillis();
        java.lang.Class<?> wildcardClass62 = inMemoryClock56.getClass();
        long long64 = constableInMemoryCounter12.increment((java.lang.constant.Constable) wildcardClass62, 1698467901906L);
        long long66 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901906L, 1698467901854L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock56);
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1698467902865L + "'", long57 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1698467902L + "'", long58 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1698467902L + "'", long59 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1698467902865L + "'", long60 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1698467902865L + "'", long61 == 1698467902865L);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1698467901906L + "'", long64 == 1698467901906L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1698467901854L + "'", long66 == 1698467901854L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467897798L, 1698467900155L, 1698467900366L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900892L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) "", (long) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        long long14 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0f, 1698467898L);
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) ' ');
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        long long18 = inMemoryClock17.currentTimeMillis();
        java.lang.Class<?> wildcardClass19 = inMemoryClock17.getClass();
        long long21 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass19, 1698467899669L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long29 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock30 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass31 = inMemoryClock30.getClass();
        long long33 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass31, (long) (byte) -1);
        long long35 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (byte) -1, (long) (byte) 1);
        long long37 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898546L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient38, (long) '#', 1L, (long) (byte) -1);
        long long45 = constableInMemoryCounter42.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock46 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass47 = inMemoryClock46.getClass();
        long long49 = constableInMemoryCounter42.increment((java.lang.constant.Constable) wildcardClass47, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock50 = hu.chengming.util.InMemoryClock.getInstance();
        long long51 = inMemoryClock50.currentTimestamp();
        long long52 = inMemoryClock50.currentTimestamp();
        java.lang.Class<?> wildcardClass53 = inMemoryClock50.getClass();
        long long54 = constableInMemoryCounter42.increment((java.lang.constant.Constable) wildcardClass53);
        hu.chengming.util.InMemoryClock inMemoryClock55 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass56 = inMemoryClock55.getClass();
        long long58 = constableInMemoryCounter42.increment((java.lang.constant.Constable) wildcardClass56, (long) (-1));
        long long59 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467898L + "'", long14 == 1698467898L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698467902865L + "'", long18 == 1698467902865L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698467899668L + "'", long21 == 1698467899668L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1698467902L + "'", long51 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1698467902L + "'", long52 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        hu.chengming.util.InMemoryClock inMemoryClock0 = hu.chengming.util.InMemoryClock.getInstance();
        long long1 = inMemoryClock0.currentTimeMillis();
        long long2 = inMemoryClock0.currentTimestamp();
        long long3 = inMemoryClock0.currentTimeMillis();
        long long4 = inMemoryClock0.currentTimeMillis();
        long long5 = inMemoryClock0.currentTimeMillis();
        long long6 = inMemoryClock0.currentTimestamp();
        long long7 = inMemoryClock0.currentTimeMillis();
        long long8 = inMemoryClock0.currentTimeMillis();
        org.junit.Assert.assertNotNull(inMemoryClock0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1698467902865L + "'", long1 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1698467902L + "'", long2 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1698467902865L + "'", long3 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1698467902865L + "'", long4 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1698467902865L + "'", long5 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1698467902L + "'", long6 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467902865L + "'", long7 == 1698467902865L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1698467902865L + "'", long8 == 1698467902865L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (short) 10, 1698467896643L, 35L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467900999L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467902064L, 1698467901532L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1698467901532L + "'", long9 == 1698467901532L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock8 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass9 = inMemoryClock8.getClass();
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass9, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock12 = hu.chengming.util.InMemoryClock.getInstance();
        long long13 = inMemoryClock12.currentTimestamp();
        long long14 = inMemoryClock12.currentTimestamp();
        java.lang.Class<?> wildcardClass15 = inMemoryClock12.getClass();
        long long16 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass15);
        long long18 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899723L);
        long long21 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1), 1698467901105L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient22 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter26 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient22, (long) '#', 1L, (long) (byte) -1);
        long long29 = constableInMemoryCounter26.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient30 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter34 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient30, (long) '#', 1L, (long) (byte) -1);
        long long37 = constableInMemoryCounter34.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient38 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter42 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient38, (long) '#', 1L, (long) (byte) -1);
        long long44 = constableInMemoryCounter42.increment((java.lang.constant.Constable) 1);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient45 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter49 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient45, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass50 = constableInMemoryCounter49.getClass();
        long long52 = constableInMemoryCounter42.increment((java.lang.constant.Constable) wildcardClass50, (long) (short) 0);
        long long54 = constableInMemoryCounter42.increment((java.lang.constant.Constable) 1698467896L);
        java.lang.Class<?> wildcardClass55 = constableInMemoryCounter42.getClass();
        long long57 = constableInMemoryCounter34.increment((java.lang.constant.Constable) wildcardClass55, (long) 100);
        long long58 = constableInMemoryCounter26.increment((java.lang.constant.Constable) wildcardClass55);
        long long60 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long58, 1698467897798L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1698467902L + "'", long13 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1698467902L + "'", long14 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1698467901105L + "'", long21 == 1698467901105L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 100L + "'", long57 == 100L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1698467897798L + "'", long60 == 1698467897798L);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Class<?>> wildcardClassInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Class<?>>(inMemoryCounterPersistClient0, (long) 1, 1698467899459L, 1698467900632L);
        java.lang.Class<?> wildcardClass5 = wildcardClassInMemoryCounter4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 0L, 1698467899026L, 1698467898919L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898867L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898654L, 1698467898597L, 52L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0.0f, 1698467896965L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898706L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899992L, 1698467897L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient13 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter17 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient13, (long) '#', 1L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass18 = constableInMemoryCounter17.getClass();
        long long20 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18, 1698467901854L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467896965L + "'", long7 == 1698467896965L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467897L + "'", long12 == 1698467897L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1698467901854L + "'", long20 == 1698467901854L);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '4', 1698467899511L, 1698467899081L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) (byte) -1, (-1L), (long) '4');
        java.lang.Class<?> wildcardClass10 = constableInMemoryCounter9.getClass();
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass10, 1698467900262L);
        long long15 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467901160L, 1698467899186L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467900262L + "'", long12 == 1698467900262L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1698467899186L + "'", long15 == 1698467899186L);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor> typeDescriptorInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.invoke.TypeDescriptor>(inMemoryCounterPersistClient0, 1698467898654L, 1698467898276L, 1698467900366L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 52L, 1698467900632L, 1698467901160L);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 101L, 1698467900892L, 1698467896965L);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898276L, 1698467899723L, (long) '#');
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (-1.0d), 1698467901320L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467901320L + "'", long7 == 1698467901320L);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) (-1), (long) (byte) 100, (-1L));
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient5 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter9 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient5, (long) '#', 1L, (long) (byte) -1);
        long long12 = constableInMemoryCounter9.increment((java.lang.constant.Constable) 0L, (long) 10);
        hu.chengming.util.InMemoryClock inMemoryClock13 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass14 = inMemoryClock13.getClass();
        long long16 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass14, (long) (byte) -1);
        hu.chengming.util.InMemoryClock inMemoryClock17 = hu.chengming.util.InMemoryClock.getInstance();
        long long18 = inMemoryClock17.currentTimestamp();
        long long19 = inMemoryClock17.currentTimestamp();
        java.lang.Class<?> wildcardClass20 = inMemoryClock17.getClass();
        long long21 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass20);
        hu.chengming.util.InMemoryClock inMemoryClock22 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass23 = inMemoryClock22.getClass();
        long long25 = constableInMemoryCounter9.increment((java.lang.constant.Constable) wildcardClass23, (long) (-1));
        long long27 = constableInMemoryCounter4.increment((java.lang.constant.Constable) long25, 1698467899026L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient28 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter32 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient28, 0L, (long) (short) -1, 10L);
        java.lang.Class<?> wildcardClass33 = constableInMemoryCounter32.getClass();
        long long34 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass33);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(inMemoryClock13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(inMemoryClock17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1698467902L + "'", long18 == 1698467902L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1698467902L + "'", long19 == 1698467902L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(inMemoryClock22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1698467899026L + "'", long27 == 1698467899026L);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898758L, 1698467898546L, 1698467900632L);
        java.lang.constant.Constable constable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = constableInMemoryCounter4.increment(constable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898170L, 1698467897798L, 1698467897798L);
        long long6 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898867L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898597L, (long) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, (long) '#', 1L, (long) (byte) -1);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) (short) 0, 0L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1L);
        long long11 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 100.0d);
        long long13 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898276L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient14 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter18 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient14, (long) (short) 10, 1698467896643L, 35L);
        hu.chengming.util.InMemoryClock inMemoryClock19 = hu.chengming.util.InMemoryClock.getInstance();
        java.lang.Class<?> wildcardClass20 = inMemoryClock19.getClass();
        long long22 = constableInMemoryCounter18.increment((java.lang.constant.Constable) wildcardClass20, 1L);
        long long24 = constableInMemoryCounter18.increment((java.lang.constant.Constable) 100);
        long long27 = constableInMemoryCounter18.increment((java.lang.constant.Constable) (-1.0f), 1698467898223L);
        long long30 = constableInMemoryCounter18.increment((java.lang.constant.Constable) 1.0d, 1698467899026L);
        java.lang.Class<?> wildcardClass31 = constableInMemoryCounter18.getClass();
        long long33 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass31, 2L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(inMemoryClock19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1698467898223L + "'", long27 == 1698467898223L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1698467899026L + "'", long30 == 1698467899026L);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2L + "'", long33 == 2L);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.constant.Constable> constableInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.constant.Constable>(inMemoryCounterPersistClient0, 1698467898654L, 1698467898597L, 52L);
        long long7 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 0.0f, 1698467896965L);
        long long9 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467898706L);
        long long12 = constableInMemoryCounter4.increment((java.lang.constant.Constable) 1698467899992L, 1698467897L);
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient13 = null;
        hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration> genericDeclarationInMemoryCounter17 = new hu.chengming.util.InMemoryCounter<java.lang.reflect.GenericDeclaration>(inMemoryCounterPersistClient13, (long) (short) -1, 1698467898331L, 0L);
        java.lang.Class<?> wildcardClass18 = genericDeclarationInMemoryCounter17.getClass();
        long long19 = constableInMemoryCounter4.increment((java.lang.constant.Constable) wildcardClass18);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1698467896965L + "'", long7 == 1698467896965L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1698467897L + "'", long12 == 1698467897L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        hu.chengming.util.client.InMemoryCounterPersistClient inMemoryCounterPersistClient0 = null;
        hu.chengming.util.InMemoryCounter<java.lang.Object> objInMemoryCounter4 = new hu.chengming.util.InMemoryCounter<java.lang.Object>(inMemoryCounterPersistClient0, 1698467899564L, 100L, 1698467901532L);
    }
}
