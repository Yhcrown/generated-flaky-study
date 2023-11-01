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
            org.springframework.context.ApplicationContext applicationContext0 = cn.zzq0324.feature.flag.spring.SpringContextHolder.getApplicationContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test002");
        java.lang.String str0 = cn.zzq0324.feature.flag.util.DateUtils.FULL_DATE_PATTERN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yyyy-MM-dd HH:mm:ss" + "'", str0, "yyyy-MM-dd HH:mm:ss");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test003");
        java.lang.String str0 = cn.zzq0324.feature.flag.support.JdkCompiler.JAVA_FILE_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".java" + "'", str0, ".java");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test004");
        boolean boolean1 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test005");
        java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = cn.zzq0324.feature.flag.util.DateUtils.parse(".java");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \".java\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test007");
        long long1 = cn.zzq0324.feature.flag.algorithm.FNV.fnv1a_32("yyyy-MM-dd HH:mm:ss");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 912733607L + "'", long1 == 912733607L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test008");
        boolean boolean1 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn(".java");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = cn.zzq0324.feature.flag.util.DateUtils.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test011");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagHelper.getFeatureFlagInstance("yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test013");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("", "yyyy-MM-dd HH:mm:ss");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test014");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test015");
        java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test016");
        long long1 = cn.zzq0324.feature.flag.algorithm.FNV.fnv1a_32("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3486672993L + "'", long1 == 3486672993L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test017");
        long long1 = cn.zzq0324.feature.flag.algorithm.FNV.fnv1a_32("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2166136261L + "'", long1 == 2166136261L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test018");
        cn.zzq0324.feature.flag.FeatureFlagInstanceRegister featureFlagInstanceRegister0 = new cn.zzq0324.feature.flag.FeatureFlagInstanceRegister();
        java.lang.Class<?> wildcardClass1 = featureFlagInstanceRegister0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test019");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = cn.zzq0324.feature.flag.util.DateUtils.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test020");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("yyyy-MM-dd HH:mm:ss", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test021");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagHelper.getFeatureFlagInstance("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test022");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagInstanceRegister.registerIfNotExist("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test023");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn(".java", "yyyy-MM-dd HH:mm:ss");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test024");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test025");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagInstanceRegister.registerIfNotExist("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test026");
        boolean boolean1 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("yyyy-MM-dd HH:mm:ss");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test027");
        cn.zzq0324.feature.flag.algorithm.FNV fNV0 = new cn.zzq0324.feature.flag.algorithm.FNV();
        java.lang.Class<?> wildcardClass1 = fNV0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test028");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagInstanceRegister.registerIfNotExist("yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test029");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test030");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("hi!", ".java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test031");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("hi!", "yyyy-MM-dd HH:mm:ss");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test032");
        cn.zzq0324.feature.flag.support.JdkCompiler jdkCompiler0 = new cn.zzq0324.feature.flag.support.JdkCompiler();
        java.lang.Class<?> wildcardClass1 = jdkCompiler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test035");
        boolean boolean1 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test036");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagHelper.getFeatureFlagInstance("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test037");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        java.lang.Class<?> wildcardClass5 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test038");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagInstanceRegister.registerIfNotExist(".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test040");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn(".java", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test041");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        java.lang.Class<?> wildcardClass3 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test043");
        // The following exception was thrown during execution in test generation
        try {
            cn.zzq0324.feature.flag.FeatureFlagInstance featureFlagInstance1 = cn.zzq0324.feature.flag.FeatureFlagHelper.getFeatureFlagInstance(".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ApplicationContext is null.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test044");
        long long1 = cn.zzq0324.feature.flag.algorithm.FNV.fnv1a_32(".java");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2636778681L + "'", long1 == 2636778681L);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test047");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn(".java", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test051");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test054");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test055");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = cn.zzq0324.feature.flag.util.DateUtils.parse("yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"yyyy-MM-dd HH:mm:ss\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test057");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        java.lang.Class<?> wildcardClass9 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test058");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        java.lang.Class<?> wildcardClass15 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test059");
        java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test060");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        java.lang.Class<?> wildcardClass1 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test061");
        cn.zzq0324.feature.flag.util.DateUtils dateUtils0 = new cn.zzq0324.feature.flag.util.DateUtils();
        java.lang.Class<?> wildcardClass1 = dateUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test062");
        java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test063");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("yyyy-MM-dd HH:mm:ss", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test065");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        java.lang.Class<?> wildcardClass7 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test067");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("", ".java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test071");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        java.lang.Class<?> wildcardClass11 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test073");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn("yyyy-MM-dd HH:mm:ss", ".java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test075");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test089");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test090");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        java.lang.Class<?> wildcardClass13 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test097");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test099");
        boolean boolean2 = cn.zzq0324.feature.flag.FeatureFlagHelper.isFeatureOn(".java", ".java");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test105");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        java.lang.Class<?> wildcardClass19 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test113");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        java.lang.Class<?> wildcardClass17 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test115");
        java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test116");
        java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test120");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        java.lang.Class<?> wildcardClass21 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test124");
        java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test135");
        java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test140");
        java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test141");
        java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test143");
        java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test145");
        java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test151");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test153");
        cn.zzq0324.feature.flag.FeatureFlagHelper featureFlagHelper0 = new cn.zzq0324.feature.flag.FeatureFlagHelper();
        java.lang.Class<?> wildcardClass1 = featureFlagHelper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test155");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test156");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test157");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        java.lang.Class<?> wildcardClass23 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test165");
        java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test168");
        java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test171");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        java.lang.Class<?> wildcardClass25 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test174");
        java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test176");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        java.lang.Class<?> wildcardClass31 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test179");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
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
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test181");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test187");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        java.lang.Class<?> wildcardClass27 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test191");
        java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test196");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test199");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        java.lang.Class<?> wildcardClass29 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test203");
        java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test205");
        java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test210");
        java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test216");
        java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test219");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        java.lang.Class<?> wildcardClass35 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test220");
        java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test222");
        java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test224");
        java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test225");
        java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test235");
        java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test239");
        java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test242");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test243");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        java.lang.Class<?> wildcardClass33 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test244");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test246");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        java.lang.Class<?> wildcardClass39 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test248");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test254");
        java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test255");
        java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test262");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        java.lang.Class<?> wildcardClass37 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test265");
        java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test269");
        java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test270");
        java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test274");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test290");
        java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test292");
        java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test301");
        java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test306");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test317");
        java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test321");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test325");
        java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test327");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        java.lang.Class<?> wildcardClass41 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test330");
        java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
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
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test350");
        java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test355");
        java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test358");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        java.lang.Class<?> wildcardClass43 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test359");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test372");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test377");
        java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test379");
        java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test384");
        java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test392");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test399");
        java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Class<?>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test403");
        java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test406");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        org.springframework.context.ApplicationContext applicationContext43 = null;
        springContextHolder0.setApplicationContext(applicationContext43);
        org.springframework.context.ApplicationContext applicationContext45 = null;
        springContextHolder0.setApplicationContext(applicationContext45);
        java.lang.Class<?> wildcardClass47 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test407");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        org.springframework.context.ApplicationContext applicationContext43 = null;
        springContextHolder0.setApplicationContext(applicationContext43);
        org.springframework.context.ApplicationContext applicationContext45 = null;
        springContextHolder0.setApplicationContext(applicationContext45);
        org.springframework.context.ApplicationContext applicationContext47 = null;
        springContextHolder0.setApplicationContext(applicationContext47);
        java.lang.Class<?> wildcardClass49 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test412");
        java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test414");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        org.springframework.context.ApplicationContext applicationContext43 = null;
        springContextHolder0.setApplicationContext(applicationContext43);
        org.springframework.context.ApplicationContext applicationContext45 = null;
        springContextHolder0.setApplicationContext(applicationContext45);
        org.springframework.context.ApplicationContext applicationContext47 = null;
        springContextHolder0.setApplicationContext(applicationContext47);
        org.springframework.context.ApplicationContext applicationContext49 = null;
        springContextHolder0.setApplicationContext(applicationContext49);
        java.lang.Class<?> wildcardClass51 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test417");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: string:///hi!/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test419");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test420");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.GenericDeclaration> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test426");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.CharSequence> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test429");
        java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test431");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test433");
        java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.beans.factory.Aware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test436");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.spring.SpringContextHolder> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "hi!", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/hi!.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test441");
        java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.io.Serializable> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.Type> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", ".java", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss//java.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test446");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        org.springframework.context.ApplicationContext applicationContext43 = null;
        springContextHolder0.setApplicationContext(applicationContext43);
        org.springframework.context.ApplicationContext applicationContext45 = null;
        springContextHolder0.setApplicationContext(applicationContext45);
        org.springframework.context.ApplicationContext applicationContext47 = null;
        springContextHolder0.setApplicationContext(applicationContext47);
        org.springframework.context.ApplicationContext applicationContext49 = null;
        springContextHolder0.setApplicationContext(applicationContext49);
        org.springframework.context.ApplicationContext applicationContext51 = null;
        springContextHolder0.setApplicationContext(applicationContext51);
        org.springframework.context.ApplicationContext applicationContext53 = null;
        springContextHolder0.setApplicationContext(applicationContext53);
        java.lang.Class<?> wildcardClass55 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.String> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.algorithm.FNV> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test450");
        java.lang.Class<? extends java.lang.Comparable<java.lang.String>> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagInstanceRegister> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "", ".java");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test453");
        java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test454");
        java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "hi!", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test455");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        org.springframework.context.ApplicationContext applicationContext43 = null;
        springContextHolder0.setApplicationContext(applicationContext43);
        java.lang.Class<?> wildcardClass45 = springContextHolder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test456");
        cn.zzq0324.feature.flag.spring.SpringContextHolder springContextHolder0 = new cn.zzq0324.feature.flag.spring.SpringContextHolder();
        org.springframework.context.ApplicationContext applicationContext1 = null;
        springContextHolder0.setApplicationContext(applicationContext1);
        org.springframework.context.ApplicationContext applicationContext3 = null;
        springContextHolder0.setApplicationContext(applicationContext3);
        org.springframework.context.ApplicationContext applicationContext5 = null;
        springContextHolder0.setApplicationContext(applicationContext5);
        org.springframework.context.ApplicationContext applicationContext7 = null;
        springContextHolder0.setApplicationContext(applicationContext7);
        org.springframework.context.ApplicationContext applicationContext9 = null;
        springContextHolder0.setApplicationContext(applicationContext9);
        org.springframework.context.ApplicationContext applicationContext11 = null;
        springContextHolder0.setApplicationContext(applicationContext11);
        org.springframework.context.ApplicationContext applicationContext13 = null;
        springContextHolder0.setApplicationContext(applicationContext13);
        org.springframework.context.ApplicationContext applicationContext15 = null;
        springContextHolder0.setApplicationContext(applicationContext15);
        org.springframework.context.ApplicationContext applicationContext17 = null;
        springContextHolder0.setApplicationContext(applicationContext17);
        org.springframework.context.ApplicationContext applicationContext19 = null;
        springContextHolder0.setApplicationContext(applicationContext19);
        org.springframework.context.ApplicationContext applicationContext21 = null;
        springContextHolder0.setApplicationContext(applicationContext21);
        org.springframework.context.ApplicationContext applicationContext23 = null;
        springContextHolder0.setApplicationContext(applicationContext23);
        org.springframework.context.ApplicationContext applicationContext25 = null;
        springContextHolder0.setApplicationContext(applicationContext25);
        org.springframework.context.ApplicationContext applicationContext27 = null;
        springContextHolder0.setApplicationContext(applicationContext27);
        org.springframework.context.ApplicationContext applicationContext29 = null;
        springContextHolder0.setApplicationContext(applicationContext29);
        org.springframework.context.ApplicationContext applicationContext31 = null;
        springContextHolder0.setApplicationContext(applicationContext31);
        org.springframework.context.ApplicationContext applicationContext33 = null;
        springContextHolder0.setApplicationContext(applicationContext33);
        org.springframework.context.ApplicationContext applicationContext35 = null;
        springContextHolder0.setApplicationContext(applicationContext35);
        org.springframework.context.ApplicationContext applicationContext37 = null;
        springContextHolder0.setApplicationContext(applicationContext37);
        org.springframework.context.ApplicationContext applicationContext39 = null;
        springContextHolder0.setApplicationContext(applicationContext39);
        org.springframework.context.ApplicationContext applicationContext41 = null;
        springContextHolder0.setApplicationContext(applicationContext41);
        org.springframework.context.ApplicationContext applicationContext43 = null;
        springContextHolder0.setApplicationContext(applicationContext43);
        org.springframework.context.ApplicationContext applicationContext45 = null;
        springContextHolder0.setApplicationContext(applicationContext45);
        org.springframework.context.ApplicationContext applicationContext47 = null;
        springContextHolder0.setApplicationContext(applicationContext47);
        org.springframework.context.ApplicationContext applicationContext49 = null;
        springContextHolder0.setApplicationContext(applicationContext49);
        org.springframework.context.ApplicationContext applicationContext51 = null;
        springContextHolder0.setApplicationContext(applicationContext51);
        org.springframework.context.ApplicationContext applicationContext53 = null;
        springContextHolder0.setApplicationContext(applicationContext53);
        org.springframework.context.ApplicationContext applicationContext55 = null;
        springContextHolder0.setApplicationContext(applicationContext55);
        org.springframework.context.ApplicationContext applicationContext57 = null;
        springContextHolder0.setApplicationContext(applicationContext57);
        org.springframework.context.ApplicationContext applicationContext59 = null;
        springContextHolder0.setApplicationContext(applicationContext59);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends org.springframework.context.ApplicationContextAware> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 20: string:///yyyy-MM-dd HH:mm:ss/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.util.DateUtils> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("hi!", "", ".java");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ??line: 1 , message: class, interface, or enum expected , ?line: 1 , message: reached end of file while parsing , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.support.JdkCompiler> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 21: string:////yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test461");
        java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "");
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", ".java", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile("", ".java", "yyyy-MM-dd HH:mm:ss");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends cn.zzq0324.feature.flag.FeatureFlagHelper> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "", "hi!");
            org.junit.Assert.fail("Expected exception of type com.taobao.arthas.compiler.DynamicCompilerException; message: com.taobao.arthas.compiler.DynamicCompilerException: Compilation Error?line: 1 , message: class, interface, or enum expected , ??line: 1 , message: class, interface, or enum expected , ?");
        } catch (com.taobao.arthas.compiler.DynamicCompilerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestGroup100Case0.test465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<? extends java.lang.reflect.AnnotatedElement> wildcardClass3 = cn.zzq0324.feature.flag.support.JdkCompiler.compile(".java", "yyyy-MM-dd HH:mm:ss", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 26: string:////java/yyyy-MM-dd HH:mm:ss.java");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

