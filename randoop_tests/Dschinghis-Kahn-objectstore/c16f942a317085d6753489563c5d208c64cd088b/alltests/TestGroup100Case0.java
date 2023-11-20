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
        long long0 = net.dschinghiskahn.objectstore.ObjectStore.DEFAULT_MAX_SIZE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1024L + "'", long0 == 1024L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>((long) (-1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.Class<?> wildcardClass4 = strObjectStore0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>> strObjectStoreObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>>((long) 1);
        java.lang.Class<?> wildcardClass2 = strObjectStoreObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>((long) 0, true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>(0L, true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass2 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>> wildcardClassObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>>();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.Type> typeObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.Type>((long) (-1), true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '4');
        java.lang.Class<?> wildcardClass2 = strObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        java.lang.Class<?> wildcardClass3 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L, false);
        java.lang.String str3 = strObjectStore2.toString();
        java.lang.String str4 = strObjectStore2.getNextObject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        strObjectStore0.add("");
        boolean boolean4 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass5 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) 'a');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        boolean boolean6 = strObjectStore0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.Class<?> wildcardClass7 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        long long3 = strObjectStore0.getSize();
        boolean boolean4 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>((long) (short) -1, true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        java.lang.String str4 = strObjectStore1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>((-1L));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        strObjectStore0.add("hi!");
        java.lang.String str4 = strObjectStore0.toString();
        boolean boolean5 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!]" + "'", str4, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1), false);
        java.lang.String str3 = strObjectStore2.getNextObject();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1), false);
        java.lang.Class<?> wildcardClass3 = strObjectStore2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>((long) (short) 10, false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) '#', true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 0, true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>((long) (short) 10, true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>((long) (byte) 1);
        java.lang.Class<?> wildcardClass2 = objObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        boolean boolean6 = strObjectStore0.isEmpty();
        strObjectStore0.add("[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (short) 1, true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (byte) 100, false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>((long) (short) -1, true);
        java.lang.Class<?> wildcardClass3 = strComparableObjectStore2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 0, true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        java.lang.String str3 = strObjectStore0.getNextObject();
        java.lang.String str4 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        java.lang.String str5 = strObjectStore0.getNextObject();
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 1, true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>(0L, true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>> wildcardClassObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>>((-1L));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>((long) 10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L, false);
        java.lang.String str3 = strObjectStore2.toString();
        java.lang.Class<?> wildcardClass4 = strObjectStore2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        long long5 = strObjectStore1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(100L, true);
        java.lang.String str3 = strObjectStore2.getNextObject();
        long long4 = strObjectStore2.getSize();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        strObjectStore0.add("");
        boolean boolean4 = strObjectStore0.isEmpty();
        java.lang.String str5 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        java.lang.String str5 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        strObjectStore0.add("hi!");
        java.lang.String str4 = strObjectStore0.toString();
        java.lang.String str5 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!]" + "'", str4, "[hi!]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>> strObjectStoreObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>>((long) '4');
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>((long) '#', true);
        java.lang.Class<?> wildcardClass3 = objObjectStore2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '#', false);
        java.lang.String str3 = strObjectStore2.toString();
        java.lang.Class<?> wildcardClass4 = strObjectStore2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        strObjectStore0.add("hi!");
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass4 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        java.lang.Class<?> wildcardClass6 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 10);
        java.lang.String str2 = strObjectStore1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 10, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        java.lang.Class<?> wildcardClass8 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.Class<?> wildcardClass2 = strObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>> wildcardClassObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>>((long) ' ');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.Class<?> wildcardClass12 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        long long5 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L, true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        strObjectStore0.add("hi!");
        java.lang.String str6 = strObjectStore0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]" + "'", str6, "[hi!]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.Class<?> wildcardClass7 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (short) 100, false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>(1L, false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.Class<?> wildcardClass3 = strObjectStore1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        java.lang.String str5 = strObjectStore0.getNextObject();
        java.lang.String str6 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.String str2 = strObjectStore1.getNextObject();
        java.lang.Class<?> wildcardClass3 = strObjectStore1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.Class<?> wildcardClass1 = strObjectStore0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>((long) (byte) 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.String str2 = strObjectStore1.getNextObject();
        java.lang.String str3 = strObjectStore1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1, false);
        java.lang.String str3 = strObjectStore2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        strObjectStore0.add("");
        long long7 = strObjectStore0.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str10 = strObjectStore0.get();
        java.lang.String str11 = strObjectStore0.get();
        java.lang.String str12 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        strObjectStore0.add("[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 0);
        java.lang.String str2 = strObjectStore1.getNextObject();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>((long) 0, false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        java.lang.String str8 = strObjectStore0.toString();
        boolean boolean9 = strObjectStore0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[hi!]]" + "'", str8, "[[hi!]]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        strObjectStore0.add("[]");
        java.lang.String str4 = strObjectStore0.getNextObject();
        strObjectStore0.add("[hi!]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.Class<?> wildcardClass2 = strObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>(0L);
        java.lang.Class<?> wildcardClass2 = genericDeclarationObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>((long) (byte) 10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        long long1 = strObjectStore0.getSize();
        boolean boolean2 = strObjectStore0.isEmpty();
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.getNextObject();
        boolean boolean5 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        java.lang.String str6 = strObjectStore1.getNextObject();
        java.lang.String str7 = strObjectStore1.get();
        boolean boolean8 = strObjectStore1.isEmpty();
        java.lang.String str9 = strObjectStore1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '4', false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        java.lang.String str4 = strObjectStore1.get();
        java.lang.String str5 = strObjectStore1.getNextObject();
        java.lang.String str6 = strObjectStore1.getNextObject();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        java.lang.String str3 = strObjectStore0.getNextObject();
        java.lang.String str4 = strObjectStore0.toString();
        strObjectStore0.add("[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        strObjectStore1.add("");
        long long4 = strObjectStore1.getSize();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>((long) (byte) 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        boolean boolean6 = strObjectStore1.isEmpty();
        java.lang.String str7 = strObjectStore1.getNextObject();
        java.lang.Class<?> wildcardClass8 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.Type> typeObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.Type>();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1), false);
        long long3 = strObjectStore2.getSize();
        java.lang.String str4 = strObjectStore2.toString();
        java.lang.String str5 = strObjectStore2.getNextObject();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.get();
        java.lang.String str7 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("[]");
        java.lang.String str5 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str10 = strObjectStore0.get();
        java.lang.String str11 = strObjectStore0.get();
        java.lang.Class<?> wildcardClass12 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>(1024L, false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>> wildcardClassObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Class<?>>((long) (byte) 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        java.lang.Class<?> wildcardClass3 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>(0L, false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 100, false);
        java.lang.String str3 = strObjectStore2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        java.lang.String str6 = strObjectStore1.getNextObject();
        java.lang.String str7 = strObjectStore1.get();
        boolean boolean8 = strObjectStore1.isEmpty();
        java.lang.Class<?> wildcardClass9 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1), false);
        boolean boolean3 = strObjectStore2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.getNextObject();
        java.lang.String str4 = strObjectStore1.toString();
        java.lang.Class<?> wildcardClass5 = strObjectStore1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        boolean boolean8 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass9 = strObjectStore0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        java.lang.String str2 = strObjectStore0.getNextObject();
        java.lang.String str3 = strObjectStore0.toString();
        java.lang.Class<?> wildcardClass4 = strObjectStore0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.getNextObject();
        java.lang.Class<?> wildcardClass8 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>(10L, false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) -1);
        boolean boolean2 = strObjectStore1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 10, false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        java.lang.String str2 = strObjectStore0.get();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 0);
        java.lang.Class<?> wildcardClass2 = strObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>((long) (short) 1, true);
        java.lang.Class<?> wildcardClass3 = annotatedElementObjectStore2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) (byte) 10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        strObjectStore0.add("hi!");
        java.lang.String str6 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 100, false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(100L, true);
        java.lang.String str3 = strObjectStore2.getNextObject();
        java.lang.String str4 = strObjectStore2.getNextObject();
        boolean boolean5 = strObjectStore2.isEmpty();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.String str2 = strObjectStore1.getNextObject();
        boolean boolean3 = strObjectStore1.isEmpty();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1, false);
        java.lang.String str3 = strObjectStore2.getNextObject();
        java.lang.String str4 = strObjectStore2.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.toString();
        java.lang.Class<?> wildcardClass8 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        java.lang.String str8 = strObjectStore0.toString();
        java.lang.String str9 = strObjectStore0.getNextObject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[hi!]]" + "'", str8, "[[hi!]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        java.lang.String str2 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        java.lang.Class<?> wildcardClass5 = strObjectStore0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        java.lang.String str6 = strObjectStore1.getNextObject();
        java.lang.String str7 = strObjectStore1.getNextObject();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str12 = strObjectStore0.getNextObject();
        strObjectStore0.add("[hi!]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        strObjectStore0.add("[]");
        long long4 = strObjectStore0.getSize();
        java.lang.String str5 = strObjectStore0.get();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.getNextObject();
        java.lang.String str6 = strObjectStore1.getNextObject();
        java.lang.Class<?> wildcardClass7 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        long long4 = strObjectStore0.getSize();
        java.lang.Class<?> wildcardClass5 = strObjectStore0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.getNextObject();
        java.lang.String str4 = strObjectStore1.toString();
        boolean boolean5 = strObjectStore1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        java.lang.String str4 = strObjectStore1.getNextObject();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.get();
        java.lang.Class<?> wildcardClass7 = strObjectStore0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>> strObjectStoreObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>>((long) (short) 100);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence> charSequenceObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.CharSequence>((long) (short) 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        strObjectStore0.add("[]");
        java.lang.String str4 = strObjectStore0.getNextObject();
        java.lang.Class<?> wildcardClass5 = strObjectStore0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (short) 0, true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        java.lang.String str3 = strObjectStore0.getNextObject();
        java.lang.String str4 = strObjectStore0.toString();
        java.lang.Class<?> wildcardClass5 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        long long1 = strObjectStore0.getSize();
        boolean boolean2 = strObjectStore0.isEmpty();
        java.lang.String str3 = strObjectStore0.getNextObject();
        java.lang.String str4 = strObjectStore0.toString();
        long long5 = strObjectStore0.getSize();
        boolean boolean6 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass7 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ', false);
        boolean boolean3 = strObjectStore2.isEmpty();
        java.lang.Class<?> wildcardClass4 = strObjectStore2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.String str2 = strObjectStore1.getNextObject();
        strObjectStore1.add("[hi!]");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        boolean boolean6 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass7 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>((long) (byte) -1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.getNextObject();
        java.lang.String str8 = strObjectStore0.toString();
        long long9 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.getNextObject();
        strObjectStore1.add("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) 'a');
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.String str2 = strObjectStore1.getNextObject();
        strObjectStore1.add("");
        java.lang.String str5 = strObjectStore1.get();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 100, true);
        java.lang.String str3 = strObjectStore2.getNextObject();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        strObjectStore0.add("hi!");
        java.lang.String str4 = strObjectStore0.get();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        boolean boolean6 = strObjectStore1.isEmpty();
        java.lang.String str7 = strObjectStore1.getNextObject();
        long long8 = strObjectStore1.getSize();
        java.lang.String str9 = strObjectStore1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        strObjectStore0.add("[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 10, false);
        strObjectStore2.add("");
        java.lang.String str5 = strObjectStore2.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) (byte) 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.toString();
        strObjectStore1.add("");
        boolean boolean6 = strObjectStore1.isEmpty();
        boolean boolean7 = strObjectStore1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) (byte) -1, false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        long long1 = strObjectStore0.getSize();
        boolean boolean2 = strObjectStore0.isEmpty();
        java.lang.String str3 = strObjectStore0.getNextObject();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        strObjectStore0.add("");
        boolean boolean12 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (byte) 10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(100L, true);
        java.lang.String str3 = strObjectStore2.getNextObject();
        java.lang.String str4 = strObjectStore2.getNextObject();
        long long5 = strObjectStore2.getSize();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        java.lang.String str6 = strObjectStore0.toString();
        long long7 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1, true);
        java.lang.String str3 = strObjectStore2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) -1, true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        java.lang.String str2 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 10, true);
        boolean boolean3 = strObjectStore2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test180");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1, false);
        java.lang.String str3 = strObjectStore2.toString();
        java.lang.Class<?> wildcardClass4 = strObjectStore2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((-1L), false);
        java.lang.String str3 = strObjectStore2.get();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.getNextObject();
        java.lang.String str3 = strObjectStore1.get();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        boolean boolean6 = strObjectStore0.isEmpty();
        boolean boolean7 = strObjectStore0.isEmpty();
        boolean boolean8 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        java.lang.String str3 = strObjectStore1.toString();
        boolean boolean4 = strObjectStore1.isEmpty();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        boolean boolean6 = strObjectStore1.isEmpty();
        long long7 = strObjectStore1.getSize();
        java.lang.String str8 = strObjectStore1.getNextObject();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        java.lang.String str6 = strObjectStore0.getNextObject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(1L, false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        boolean boolean8 = strObjectStore0.isEmpty();
        java.lang.String str9 = strObjectStore0.toString();
        java.lang.Class<?> wildcardClass10 = strObjectStore0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[hi!]]" + "'", str9, "[[hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1), false);
        long long3 = strObjectStore2.getSize();
        java.lang.String str4 = strObjectStore2.getNextObject();
        java.lang.Class<?> wildcardClass5 = strObjectStore2.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        java.lang.String str2 = strObjectStore0.getNextObject();
        strObjectStore0.add("[hi!]");
        strObjectStore0.add("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1, false);
        strObjectStore2.add("hi!");
        java.lang.Class<?> wildcardClass5 = strObjectStore2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        strObjectStore2.add("[]");
        strObjectStore2.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 10, false);
        java.lang.String str3 = strObjectStore2.toString();
        long long4 = strObjectStore2.getSize();
        strObjectStore2.add("[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 100);
        long long2 = strObjectStore1.getSize();
        strObjectStore1.add("");
        java.lang.Class<?> wildcardClass5 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '#', false);
        java.lang.String str3 = strObjectStore2.get();
        long long4 = strObjectStore2.getSize();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        boolean boolean6 = strObjectStore1.isEmpty();
        java.lang.String str7 = strObjectStore1.get();
        boolean boolean8 = strObjectStore1.isEmpty();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.toString();
        java.lang.String str5 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.toString();
        strObjectStore1.add("");
        boolean boolean6 = strObjectStore1.isEmpty();
        java.lang.Class<?> wildcardClass7 = strObjectStore1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 10);
        strObjectStore1.add("hi!");
        java.lang.Class<?> wildcardClass4 = strObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 10);
        java.lang.String str2 = strObjectStore1.getNextObject();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '#');
        java.lang.String str2 = strObjectStore1.getNextObject();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L, false);
        java.lang.String str3 = strObjectStore2.get();
        strObjectStore2.add("");
        java.lang.Class<?> wildcardClass6 = strObjectStore2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        long long1 = strObjectStore0.getSize();
        boolean boolean2 = strObjectStore0.isEmpty();
        java.lang.String str3 = strObjectStore0.getNextObject();
        java.lang.String str4 = strObjectStore0.toString();
        long long5 = strObjectStore0.getSize();
        java.lang.String str6 = strObjectStore0.getNextObject();
        long long7 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.getNextObject();
        strObjectStore0.add("[hi!]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>> strObjectStoreObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>>((long) 'a', true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 100);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L, false);
        java.lang.Class<?> wildcardClass3 = strObjectStore2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 100);
        long long2 = strObjectStore1.getSize();
        java.lang.Class<?> wildcardClass3 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        java.lang.String str2 = strObjectStore1.getNextObject();
        strObjectStore1.add("");
        java.lang.String str5 = strObjectStore1.getNextObject();
        java.lang.String str6 = strObjectStore1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '#', false);
        java.lang.String str3 = strObjectStore2.get();
        java.lang.String str4 = strObjectStore2.get();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1, false);
        long long3 = strObjectStore2.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        strObjectStore0.add("[]");
        java.lang.String str4 = strObjectStore0.get();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        long long4 = strObjectStore2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        long long8 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        java.lang.String str4 = strObjectStore2.get();
        strObjectStore2.add("[[hi!]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object> objObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Object>((long) (byte) 10, false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str12 = strObjectStore0.getNextObject();
        long long13 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        boolean boolean4 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(1024L, false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        java.lang.String str4 = strObjectStore2.toString();
        boolean boolean5 = strObjectStore2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (short) 100);
        java.lang.Class<?> wildcardClass2 = genericDeclarationObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 100);
        java.lang.String str2 = strObjectStore1.get();
        java.lang.Class<?> wildcardClass3 = strObjectStore1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '#');
        long long2 = strObjectStore1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L, false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1, false);
        java.lang.String str3 = strObjectStore2.getNextObject();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '#', false);
        java.lang.String str3 = strObjectStore2.get();
        java.lang.String str4 = strObjectStore2.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((-1L));
        java.lang.Class<?> wildcardClass2 = serializableObjectStore1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        java.lang.String str4 = strObjectStore1.get();
        long long5 = strObjectStore1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>(0L);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1, true);
        boolean boolean3 = strObjectStore2.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        java.lang.String str6 = strObjectStore0.getNextObject();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1));
        java.lang.String str2 = strObjectStore1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.get();
        strObjectStore0.add("[hi!]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        java.lang.String str2 = strObjectStore0.getNextObject();
        java.lang.String str3 = strObjectStore0.toString();
        boolean boolean4 = strObjectStore0.isEmpty();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("[]");
        long long5 = strObjectStore0.getSize();
        java.lang.String str6 = strObjectStore0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[]]" + "'", str6, "[[]]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        boolean boolean5 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        java.lang.String str1 = strObjectStore0.get();
        java.lang.String str2 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        long long5 = strObjectStore0.getSize();
        java.lang.String str6 = strObjectStore0.get();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ', false);
        boolean boolean3 = strObjectStore2.isEmpty();
        java.lang.String str4 = strObjectStore2.get();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        java.lang.String str4 = strObjectStore2.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 100);
        long long2 = strObjectStore1.getSize();
        strObjectStore1.add("[]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '4');
        java.lang.String str2 = strObjectStore1.toString();
        strObjectStore1.add("hi!");
        java.lang.String str5 = strObjectStore1.getNextObject();
        java.lang.String str6 = strObjectStore1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]" + "'", str6, "[hi!]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>> strObjectStoreObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strObjectStoreObjectStore0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>((long) '4');
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        strObjectStore0.add("hi!");
        long long6 = strObjectStore0.getSize();
        java.lang.String str7 = strObjectStore0.get();
        long long8 = strObjectStore0.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>> strObjectStoreObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>>(100L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.toString();
        java.lang.String str5 = strObjectStore0.getNextObject();
        java.lang.String str6 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str5 = strObjectStore0.getNextObject();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        java.lang.String str5 = strObjectStore0.getNextObject();
        java.lang.String str6 = strObjectStore0.get();
        java.lang.String str7 = strObjectStore0.toString();
        long long8 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        strObjectStore0.add("hi!");
        boolean boolean4 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(1024L, true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.getNextObject();
        strObjectStore0.add("hi!");
        strObjectStore0.add("[hi!]");
        java.lang.String str12 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        boolean boolean6 = strObjectStore0.isEmpty();
        strObjectStore0.add("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>(3L, true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        boolean boolean2 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str12 = strObjectStore0.getNextObject();
        java.lang.String str13 = strObjectStore0.get();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) '4');
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.get();
        java.lang.Class<?> wildcardClass4 = strObjectStore1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) ' ', true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.getNextObject();
        strObjectStore0.add("hi!");
        boolean boolean9 = strObjectStore0.isEmpty();
        boolean boolean10 = strObjectStore0.isEmpty();
        java.lang.String str11 = strObjectStore0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        strObjectStore1.add("");
        java.lang.String str4 = strObjectStore1.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.Class<?> wildcardClass6 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        java.lang.String str4 = strObjectStore1.get();
        java.lang.String str5 = strObjectStore1.getNextObject();
        java.lang.Class<?> wildcardClass6 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L);
        java.lang.String str2 = strObjectStore1.get();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        boolean boolean8 = strObjectStore0.isEmpty();
        strObjectStore0.add("[hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.toString();
        strObjectStore0.add("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        java.lang.String str3 = strObjectStore1.toString();
        java.lang.String str4 = strObjectStore1.get();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement> annotatedElementObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.AnnotatedElement>((long) (byte) 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(0L);
        long long2 = strObjectStore1.getSize();
        long long3 = strObjectStore1.getSize();
        long long4 = strObjectStore1.getSize();
        java.lang.String str5 = strObjectStore1.toString();
        boolean boolean6 = strObjectStore1.isEmpty();
        long long7 = strObjectStore1.getSize();
        java.lang.Class<?> wildcardClass8 = strObjectStore1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        long long6 = strObjectStore0.getSize();
        boolean boolean7 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.getNextObject();
        java.lang.String str5 = strObjectStore0.getNextObject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 10, false);
        java.lang.String str3 = strObjectStore2.toString();
        java.lang.String str4 = strObjectStore2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration> genericDeclarationObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.reflect.GenericDeclaration>((long) (byte) 100);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(10L, false);
        boolean boolean3 = strObjectStore2.isEmpty();
        java.lang.String str4 = strObjectStore2.getNextObject();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>> strComparableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.Comparable<java.lang.String>>((long) (-1), false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(100L, true);
        java.lang.String str3 = strObjectStore2.getNextObject();
        java.lang.Class<?> wildcardClass4 = strObjectStore2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        java.lang.String str8 = strObjectStore0.getNextObject();
        boolean boolean9 = strObjectStore0.isEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 'a', true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        strObjectStore0.add("[[hi!]]");
        java.lang.Class<?> wildcardClass8 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>(100L);
        boolean boolean2 = strObjectStore1.isEmpty();
        strObjectStore1.add("[[]]");
        long long5 = strObjectStore1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) 1);
        java.lang.String str2 = strObjectStore1.toString();
        java.lang.String str3 = strObjectStore1.toString();
        java.lang.String str4 = strObjectStore1.toString();
        long long5 = strObjectStore1.getSize();
        java.lang.String str6 = strObjectStore1.toString();
        long long7 = strObjectStore1.getSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.get();
        strObjectStore0.add("[[hi!]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable> serializableObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.io.Serializable>((long) (byte) 1, true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        boolean boolean8 = strObjectStore0.isEmpty();
        long long9 = strObjectStore0.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        long long6 = strObjectStore0.getSize();
        long long7 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        boolean boolean6 = strObjectStore0.isEmpty();
        strObjectStore0.add("[[]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        long long4 = strObjectStore0.getSize();
        boolean boolean5 = strObjectStore0.isEmpty();
        java.lang.String str6 = strObjectStore0.getNextObject();
        java.lang.String str7 = strObjectStore0.get();
        boolean boolean8 = strObjectStore0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (byte) 10, false);
        java.lang.String str3 = strObjectStore2.getNextObject();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 0);
        boolean boolean2 = strObjectStore1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) ' ');
        long long2 = strObjectStore1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        boolean boolean1 = strObjectStore0.isEmpty();
        long long2 = strObjectStore0.getSize();
        strObjectStore0.add("hi!");
        boolean boolean5 = strObjectStore0.isEmpty();
        long long6 = strObjectStore0.getSize();
        java.lang.String str7 = strObjectStore0.get();
        long long8 = strObjectStore0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (-1), false);
        long long3 = strObjectStore2.getSize();
        java.lang.String str4 = strObjectStore2.toString();
        java.lang.String str5 = strObjectStore2.get();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.getNextObject();
        strObjectStore0.add("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        java.lang.String str3 = strObjectStore0.get();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.toString();
        strObjectStore0.add("[hi!]");
        long long8 = strObjectStore0.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore2 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 0, false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        long long3 = strObjectStore0.getSize();
        java.lang.String str4 = strObjectStore0.get();
        java.lang.String str5 = strObjectStore0.getNextObject();
        strObjectStore0.add("");
        strObjectStore0.add("");
        java.lang.String str10 = strObjectStore0.get();
        java.lang.String str11 = strObjectStore0.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore1 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>((long) (short) 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        net.dschinghiskahn.objectstore.ObjectStore<java.lang.String> strObjectStore0 = new net.dschinghiskahn.objectstore.ObjectStore<java.lang.String>();
        strObjectStore0.add("");
        boolean boolean3 = strObjectStore0.isEmpty();
        java.lang.String str4 = strObjectStore0.toString();
        java.lang.String str5 = strObjectStore0.get();
        java.lang.String str6 = strObjectStore0.get();
        java.lang.String str7 = strObjectStore0.getNextObject();
        java.lang.Class<?> wildcardClass8 = strObjectStore0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

